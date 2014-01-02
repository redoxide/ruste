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

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

import de.redoxi.ruste.core.builders.IncrementalRustProjectBuilder;
import de.redoxi.ruste.core.editors.RustDocumentProvider;

/**
 * Adds error and warning markers from various sources to a given file
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class FileMarker implements IResourceMarker {

    private final static IDocumentProvider RUST_DOCUMENT_PROVIDER = new RustDocumentProvider();

    private IFile file;

    public FileMarker(final IFile file) {
	this.file = file;
    }

    public IFile getFile() {
	return file;
    }

    /**
     * Add a warning marker with the given message at the given location
     * 
     * @param message
     * @param startLine
     * @param startPos
     * @param endLine
     * @param endPos
     */
    public void addWarning(String message, int startLine, int startPos,
	    int endLine, int endPos) {
	addMarker(IncrementalRustProjectBuilder.COMPILE_WARNING_MARKER_ID,
		IMarker.SEVERITY_WARNING, IMarker.PRIORITY_NORMAL, startLine,
		startPos, endLine, endPos, message);
    }

    /**
     * Add an error marker with the given message at the given location
     * 
     * @param message
     * @param startLine
     * @param startPos
     * @param endLine
     * @param endPos
     */
    public void addError(String message, int startLine, int startPos,
	    int endLine, int endPos) {
	addMarker(IncrementalRustProjectBuilder.COMPILE_ERROR_MARKER_ID,
		IMarker.SEVERITY_ERROR, IMarker.PRIORITY_NORMAL, startLine,
		startPos, endLine, endPos, message);
    }

    /**
     * Mark the document with the given file name, specifically marking
     * characters between the start line's given offset and the end line's given
     * offset
     * 
     * @param fileName
     *            The name of the file
     * @param startLine
     *            The line that the marker starts on
     * @param startPos
     *            The offset to the start of the marker on the start line
     * @param endLine
     *            The line that the marker ends on
     * @param endPos
     *            The offset to the end of the marker on the end line
     * @param message
     *            The error message
     */
    private void addMarker(String markerType, int severity, int priority,
	    int startLine, int startPos, int endLine, int endPos, String message) {

	try {
	    IEditorInput input = new FileEditorInput((IFile) file);
	    RUST_DOCUMENT_PROVIDER.connect(input);
	    IDocument document = RUST_DOCUMENT_PROVIDER.getDocument(input);

	    IMarker marker = file.createMarker(markerType);
	    marker.setAttribute(IMarker.LINE_NUMBER, startLine);
	    try {
		int charStart = document.getLineOffset(startLine - 1)
			+ startPos;
		int charEnd = document.getLineOffset(endLine - 1) + endPos;
		marker.setAttribute(IMarker.CHAR_START, charStart);
		marker.setAttribute(IMarker.CHAR_END, charEnd);
	    } catch (BadLocationException e) {
	    }
	    marker.setAttribute(IMarker.MESSAGE, message);
	    marker.setAttribute(IMarker.SEVERITY, severity);
	    marker.setAttribute(IMarker.PRIORITY, priority);
	} catch (CoreException e) {
	    getLogService().log(LogService.LOG_ERROR, "Unable to add marker to file '" + file.getName() + "' at line '" + startLine + "'", e);
	}
    }

    @Override
    public void addMarkers(InputStream inputStream) {
	// TODO Implement
    }
    
    /**
     * @return The {@link LogService} for the 
     */
    private LogService getLogService() {
	final Bundle bundle = FrameworkUtil.getBundle(getClass());
	final ServiceTracker<LogService, LogService> tracker = new ServiceTracker<LogService, LogService>(bundle.getBundleContext(), LogService.class, null);
	return tracker.getService();
    }
}
