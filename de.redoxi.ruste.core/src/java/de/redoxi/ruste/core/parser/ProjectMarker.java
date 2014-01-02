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

import org.eclipse.core.resources.IProject;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class ProjectMarker implements IResourceMarker {

    private IProject project;

    public ProjectMarker(final IProject project) {
	this.project = project;
    }

    @Override
    public void addMarkers(InputStream inputStream) {
	NativeErrorParser nativeErrorParser = new NativeErrorParser(inputStream) {
	    @Override
	    protected void onError(String fileName, int startLine,
		    int startPos, int endLine, int endPos, String message) {
		newFileMarkerForFile(fileName).addError(message, startLine,
			startPos, endLine, endPos);
	    }

	    @Override
	    protected void onWarning(String fileName, int startLine,
		    int startPos, int endLine, int endPos, String message) {
		newFileMarkerForFile(fileName).addWarning(message, startLine,
			startPos, endLine, endPos);
	    }
	};

	try {
	    nativeErrorParser.parse();
	} catch (IOException e) {
	    getLogService().log(LogService.LOG_ERROR, "Unable to parse error output", e);
	}
    }

    private FileMarker newFileMarkerForFile(String fileName) {
	final String projectPath = project.getLocation().toString();

	if (fileName.startsWith(projectPath)) {
	    fileName = fileName.substring(projectPath.length());
	}

	return new FileMarker(project.getFile(fileName));
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
