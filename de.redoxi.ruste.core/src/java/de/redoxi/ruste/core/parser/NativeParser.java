/*
 * Copyright 2013 Hayden Smith
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under 
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package de.redoxi.ruste.core.parser;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;

import de.redoxi.ruste.core.api.xml.ASTBuilder;
import de.redoxi.ruste.core.builders.IncrementalRustProjectBuilder;
import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Crate;

/**
 * Parser that parses the given Rust source with the "api" executable - a
 * wrapper around the syntax library used by the "rustc" compiler.
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class NativeParser implements IRustParser {

    private IFile sourceFile;
    private IDocument sourceDocument;
    private InputStream sourceInputStream;

    private ASTNode root;

    private static String apiExecutablePath;
    private static Lock apiInitExecutableLock = new ReentrantLock();

    private static final String API_EXECUTABLE_NAME = "xmlast";

    private String getApiExecutablePath() {
	try {
	    if (apiExecutablePath != null
		    || !apiInitExecutableLock.tryLock(10, TimeUnit.SECONDS)) {
		return apiExecutablePath;
	    }
	} catch (InterruptedException e) {
	    if (Thread.interrupted()) {
		return apiExecutablePath;
	    }
	}

	URL apiExecUrl = getClass().getClassLoader().getResource(
		"bin/" + API_EXECUTABLE_NAME);

	File apiExecTmpFile = null;
	InputStream sourceStream = null;
	OutputStream tmpFileStream = null;

	try {
	    apiExecTmpFile = File.createTempFile("api", "");
	    apiExecTmpFile.deleteOnExit();
	    apiExecTmpFile.setExecutable(true);

	    sourceStream = apiExecUrl.openStream();
	    tmpFileStream = new FileOutputStream(apiExecTmpFile);

	    final byte[] buf = new byte[1024];
	    int i = 0;

	    while ((i = sourceStream.read(buf)) != -1) {
		tmpFileStream.write(buf, 0, i);
	    }

	    apiExecutablePath = apiExecTmpFile.getAbsolutePath();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    try {
		sourceStream.close();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    try {
		tmpFileStream.close();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }

	    apiInitExecutableLock.unlock();
	}

	return apiExecutablePath;
    }

    @Override
    public ASTNode getRoot() {
	return root;
    }

    @Override
    public void setRoot(ASTNode root) {
	this.root = root;
    }

    @Override
    public void parse() {
	parseSource("TODOName", getSourceString());
    }

    public void setSource(IFile file) {
	sourceFile = file;
    }

    @Override
    public void setSource(IDocument document) {
	sourceDocument = document;
    }

    public void setSource(InputStream inputStream) {
	sourceInputStream = inputStream;
    }

    private String getSourceString() {
	if (sourceDocument != null) {
	    return sourceDocument.get();
	} else if (sourceInputStream != null) {
	    return getSourceStringFromInputStream(sourceInputStream);
	} else if (sourceFile != null) {
	    try {
		return getSourceStringFromInputStream(sourceFile
			.getContents(true));
	    } catch (CoreException e) {
		return "";
	    }
	} else {
	    return null;
	}
    }

    private String getSourceStringFromInputStream(final InputStream is) {
	StringBuilder inputBuilder = new StringBuilder();
	byte[] readBuffer = new byte[1024];

	int read = 0;

	try {
	    while ((read = is.read(readBuffer)) != -1) {
		inputBuilder.append(new String(readBuffer, 0, read));
	    }

	    is.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return inputBuilder.toString();
    }

    private void parseSource(String name, String source) {
	// Start option to process complete AST, not just public constructs
	ProcessBuilder processBuilder = new ProcessBuilder(
		getApiExecutablePath(), name);

	try {
	    Process process = processBuilder.start();

	    OutputStream procStdIn = new BufferedOutputStream(
		    process.getOutputStream());
	    InputStream procStdOut = new BufferedInputStream(
		    process.getInputStream());

	    procStdIn.write(source.getBytes());
	    procStdIn.flush();
	    procStdIn.close();

	    int exitStatus = process.waitFor();

	    if (exitStatus == 0) {
		ASTBuilder astBuilder = new ASTBuilder(procStdOut);
		Crate crate = (Crate) astBuilder.parse();

		if (crate != null) {
		    setRoot(crate);
		}
	    } else if (sourceFile != null) {
		try {
		    sourceFile
			    .deleteMarkers(
				    IncrementalRustProjectBuilder.COMPILE_ERROR_MARKER_ID,
				    true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		try {
		    sourceFile
			    .deleteMarkers(
				    IncrementalRustProjectBuilder.COMPILE_WARNING_MARKER_ID,
				    true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

		FileMarker fileMarker = new FileMarker(sourceFile);
		fileMarker.addMarkers(process.getErrorStream());
	    }

	} catch (IOException e) {
	    // TODO Track errors
	    e.printStackTrace();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
