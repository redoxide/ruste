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

package de.redoxi.ruste.core.builders;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import de.redoxi.ruste.core.parser.ProjectMarker;

/**
 * Builder for Rust projects
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class IncrementalRustProjectBuilder extends IncrementalProjectBuilder {

    public final static String COMPILE_ERROR_MARKER_ID = "de.redoxi.ruste.core.markers.compileerrormarker";
    public final static String COMPILE_WARNING_MARKER_ID = "de.redoxi.ruste.core.markers.compilewarningmarker";

    public final static String BUILDER_ID = "de.redoxi.ruste.core.projectBuilder";

    private final static String DEFAULT_RUSTPKG_PATH = "/usr/local/bin/rustpkg";
    private final static String DEFAULT_RUSTC_PATH = "/usr/local/bin/rustc";
    private final static String RUSTPKG_BUILD_CMD = "build";
    private final static String RUST_PATH_ENV_VAR = "RUST_PATH";
    private final static String RUSTC_OUT_DIR_OPTION = "--out-dir";

    /**
     * Build the given project
     * 
     * @param kind
     *            Kind of build requested
     * @param args
     *            Arguments passed to builder
     * @param monitor
     *            Progress monitor for the build
     * @throws CoreException
     */
    @Override
    protected IProject[] build(int kind, Map<String, String> args,
	    IProgressMonitor monitor) throws CoreException {

	switch (kind) {
	case FULL_BUILD:
	    fullBuild(monitor);
	    break;
	case INCREMENTAL_BUILD:
	case AUTO_BUILD:
	    incrementalBuild(monitor);
	    break;
	}

	return new IProject[] { getProject() };
    }

    /**
     * Perform a full build of the project by treating the project as a rustpkg
     * compatible workspace
     * 
     * @param monitor
     *            The progress monitor for the full build
     */
    private void fullBuild(IProgressMonitor monitor) {
	ProcessBuilder processBuilder = new ProcessBuilder(
		DEFAULT_RUSTPKG_PATH, RUSTPKG_BUILD_CMD, getProject().getName());
	processBuilder.environment().put(RUST_PATH_ENV_VAR,
		getProject().getWorkspace().getRoot().getLocation().toString());
	processBuilder.directory(getProject().getLocation().toFile());

	monitor.beginTask("Building '" + getProject().getName()
		+ "' Rust workspace", IProgressMonitor.UNKNOWN);

	try {
	    getProject().deleteMarkers(
		    "de.redoxi.ruste.core.markers.compileerrormarker", true,
		    IResource.DEPTH_INFINITE);
	} catch (CoreException e) {
	    // TODO log error
	}

	try {
	    Process process = processBuilder.start();

	    try {
		if (process.waitFor() != 0) {
		    // Parse error output for markers
		    ProjectMarker projectMarker = new ProjectMarker(
			    getProject());
		    projectMarker.addMarkers(process.getErrorStream());
		}
	    } catch (InterruptedException e) {
		// TODO Handle interrupt
	    }
	} catch (IOException e) {
	    // TODO Log error
	}

	try {
	    getBinFolder(getProject()).refreshLocal(IResource.DEPTH_INFINITE,
		    monitor);
	    getLibPath(getProject()).refreshLocal(IResource.DEPTH_INFINITE,
		    monitor);
	    getBuildPath(getProject()).refreshLocal(IResource.DEPTH_INFINITE,
		    monitor);
	} catch (CoreException e) {
	    // TODO Error
	}

	monitor.done();
    }

    /**
     * Perform an incremental build of all the Rust source files in the resource
     * in the current {@link IResourceDelta}.
     * 
     * All Rust source files are retrieved by traversing the given resource
     * hierarchy and compiled one-by-one with the Rust compiler, and are written
     * to the 'bin' folder in the workspace.
     * 
     * @param monitor
     *            The progress monitor for the process
     */
    private void incrementalBuild(IProgressMonitor monitor) {
	IResourceDelta delta = getDelta(getProject());

	final String outDirPath = getBinFolder(getProject()).getLocation()
		.toString();

	Collection<IResource> sourceFiles;
	try {
	    sourceFiles = getSourceFiles(delta.getResource());
	} catch (CoreException e) {
	    monitor.done();
	    return;
	}

	monitor.beginTask("Building '" + delta.getResource().getName() + "'",
		sourceFiles.size());

	for (IResource sourceFile : sourceFiles) {
	    if (monitor.isCanceled()) {
		break;
	    }

	    ProcessBuilder processBuilder = new ProcessBuilder(
		    DEFAULT_RUSTC_PATH, RUSTC_OUT_DIR_OPTION, outDirPath,
		    sourceFile.getLocation().toString());
	    processBuilder.environment().put(
		    RUST_PATH_ENV_VAR,
		    getProject().getWorkspace().getRoot().getLocation()
			    .toString());

	    try {
		Process process = processBuilder.start();
		try {
		    if (process.waitFor() != 0) {
			// Parse error output for markers
			ProjectMarker projectMarker = new ProjectMarker(
				getProject());
			projectMarker.addMarkers(process.getErrorStream());
		    }
		} catch (InterruptedException e) {
		    // TODO Handle interrupt
		}
	    } catch (IOException e) {
		// TODO Log error
	    }

	    monitor.worked(1);
	}

	monitor.done();
    }

    /**
     * Recursively locate all of the Rust source files within the given parent
     * 
     * @param parent
     *            The resource to be traversed for Rust source files
     * @return all Rust source files in the given parent
     * @throws CoreException
     * 
     *             TODO Probably not necessary to throw the
     *             {@link CoreException} here; I think it would be more suitable
     *             to throw an {@link IllegalArgumentException} if the given
     *             parent doesn't exist.
     */
    private Collection<IResource> getSourceFiles(IResource parent)
	    throws CoreException {
	final Collection<IResource> sourceFiles = new LinkedList<IResource>();

	parent.accept(new IResourceVisitor() {

	    @Override
	    public boolean visit(IResource resource) {
		if ("rs".equals(resource.getFileExtension())) {
		    sourceFiles.add(resource);
		}
		return resource.getType() != IResource.FILE;
	    }
	});

	return sourceFiles;
    }

    /**
     * {@inheritDoc IncrementalProjectBuilder#clean(IProgressMonitor)}
     */
    @Override
    protected void clean(IProgressMonitor monitor) throws CoreException {
	IFolder binFolder = getBinFolder(getProject());
	IFolder libFolder = getLibPath(getProject());
	IFolder buildFolder = getBuildPath(getProject());

	Deque<IResource> derived = new LinkedList<IResource>();
	derived.addAll(Arrays.asList(binFolder
		.members(IContainer.INCLUDE_HIDDEN)));
	derived.addAll(Arrays.asList(libFolder
		.members(IContainer.INCLUDE_HIDDEN)));
	derived.addAll(Arrays.asList(buildFolder
		.members(IContainer.INCLUDE_HIDDEN)));

	monitor.beginTask("Cleaning 'bin' directory", IProgressMonitor.UNKNOWN);

	while (!derived.isEmpty() && !monitor.isCanceled()) {
	    IResource resource = derived.pop();
	    switch (resource.getType()) {
	    case IResource.FILE:
		((IFile) resource).delete(true, null);
		break;
	    case IResource.FOLDER:
		IResource[] resources = ((IFolder) resource)
			.members(IContainer.INCLUDE_HIDDEN);
		if (resources.length == 0) {
		    ((IFolder) resource).delete(true, null);
		} else {
		    derived.push(resource);
		    for (IResource child : resources) {
			derived.push(child);
		    }
		}
	    }
	}

	monitor.done();
    }

    /**
     * @param project
     * @return The directory that the compiled executables will be written to
     */
    private IFolder getBinFolder(IProject project) {
	return project.getFolder("bin");
    }

    /**
     * @param project
     * @return The directory that the compiled libraries will be written to
     */
    private IFolder getLibPath(IProject project) {
	return project.getFolder("lib");
    }

    /**
     * @param project
     * @return The directory that the intermediary objects will be written to by
     *         the rustpkg manager
     */
    private IFolder getBuildPath(IProject project) {
	return project.getFolder("build");
    }
}
