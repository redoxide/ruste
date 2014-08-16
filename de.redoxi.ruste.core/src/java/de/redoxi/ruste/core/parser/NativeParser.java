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

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

import de.redoxi.ruste.core.model.ast.ASTNode;

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
	private String name;

	@Override
	public ASTNode getRoot() {
		return root;
	}

	@Override
	public void setRoot(ASTNode root) {
		this.root = root;
	}
	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	@Override
	public void parse() {
		parseSource(name, getSourceString());
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
				return getSourceStringFromInputStream(sourceFile.getContents(true));
			} catch (CoreException e) {
				getLogService().log(LogService.LOG_WARNING, "Unable to retrieve contents from source file '" + sourceFile.getName() + "'", e);
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
			getLogService().log(LogService.LOG_ERROR, "Unable to read from input stream", e);
		}

		return inputBuilder.toString();
	}

	private native void parseSource(String name, String source);

	/**
	 * @return The {@link LogService} for the
	 */
	private LogService getLogService() {
		final Bundle bundle = FrameworkUtil.getBundle(getClass());
		final ServiceTracker<LogService, LogService> tracker = new ServiceTracker<LogService, LogService>(bundle.getBundleContext(), LogService.class, null);
		return tracker.getService();
	}
}
