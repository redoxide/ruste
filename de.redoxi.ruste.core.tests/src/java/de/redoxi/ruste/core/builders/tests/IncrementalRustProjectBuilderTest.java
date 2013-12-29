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
package de.redoxi.ruste.core.builders.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.builders.IncrementalRustProjectBuilder;
import de.redoxi.ruste.core.natures.RustProjectNature;
import de.redoxi.ruste.core.tests.AbstractUITest;

public class IncrementalRustProjectBuilderTest extends AbstractUITest {

    private final String PROJECT_NAME = "test";
    private IProject project;
    private IFolder binFolder;
    private IFolder buildFolder;
    private IFolder srcFolder;
    private IFolder libFolder;
    private IFile binaryFile;

    @Before
    public void setUp() throws Exception {
	project = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(PROJECT_NAME);
	project.create(null);
	project.open(null);

	// Add RustProjectNature to project
	IProjectDescription description = project.getDescription();
	String[] prevNatures = description.getNatureIds();
	String[] newNatures = new String[prevNatures.length + 1];
	System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
	newNatures[prevNatures.length] = RustProjectNature.NATURE_ID;
	description.setNatureIds(newNatures);

	// Add builder to project
	IProjectDescription desc = project.getDescription();
	ICommand[] commands = desc.getBuildSpec();

	// add builder to project
	ICommand command = desc.newCommand();
	command.setBuilderName(IncrementalRustProjectBuilder.BUILDER_ID);
	ICommand[] nc = new ICommand[commands.length + 1];
	// Add it before other builders.
	System.arraycopy(commands, 0, nc, 1, commands.length);
	nc[0] = command;
	desc.setBuildSpec(nc);
	project.setDescription(desc, null);

	// Add folders
	binFolder = project.getFolder("bin");
	buildFolder = project.getFolder("build");
	libFolder = project.getFolder("lib");
	srcFolder = project.getFolder("src/" + PROJECT_NAME);

	binFolder.create(true, true, null);
	buildFolder.create(true, true, null);
	libFolder.create(true, true, null);
	project.getFolder("src").create(true, true, null);
	srcFolder.create(true, true, null);

	byte[] bytes = new byte[1024];
	ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);

	binaryFile = binFolder.getFile("binary");
	binaryFile.create(byteInputStream, true, null);

	InputStream mainInputStream = getClass().getClassLoader()
		.getResourceAsStream("main.rs");
	IFile mainSourceFile = project.getFile("src/" + PROJECT_NAME
		+ "/main.rs");
	mainSourceFile.create(mainInputStream, true, null);

    }

    @After
    public void tearDown() throws CoreException {
	project.delete(true, null);
    }

    private void addErrorsSourceFileToProject() throws CoreException {
	InputStream errorsInputStream = getClass().getClassLoader()
		.getResourceAsStream("errors.rs");
	IFile errorsSourceFile = project.getFile("src/" + PROJECT_NAME
		+ "/errors.rs");
	errorsSourceFile.create(errorsInputStream, true, null);
    }

    @Test
    public final void testBuildFullBuild() throws CoreException {
	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }

    @Test
    public final void testBuildFullBuildWithErrors() throws CoreException {
	addErrorsSourceFileToProject();

	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);

	IFile errorsFile = project
		.getFile("src/" + PROJECT_NAME + "/errors.rs");
	IMarker[] markers = errorsFile.findMarkers(
		IncrementalRustProjectBuilder.COMPILE_ERROR_MARKER_ID, true,
		IResource.DEPTH_INFINITE);
	assertEquals(1, markers.length);

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }

    /*
     * TODO testBuildFullBuildWithWarnings - create a source file that contains
     * warnings (e.g. unused variables)
     */

    @Test
    public final void testBuildIncrementalBuild() throws CoreException {
	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.getFile("src/" + PROJECT_NAME + "/main.rs").touch(
		mock(IProgressMonitor.class));

	project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }

    @Test
    public final void testBuildIncrementalBuildWithErrors()
	    throws CoreException {
	addErrorsSourceFileToProject();

	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.getFile("src/" + PROJECT_NAME + "/main.rs").touch(
		mock(IProgressMonitor.class));

	project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

	IFile errorsFile = project
		.getFile("src/" + PROJECT_NAME + "/errors.rs");
	IMarker[] markers = errorsFile.findMarkers(
		IncrementalRustProjectBuilder.COMPILE_ERROR_MARKER_ID, true,
		IResource.DEPTH_INFINITE);
	assertEquals(1, markers.length);

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }

    @Test
    public final void testBuildAutoBuildWithErrors() throws CoreException {
	addErrorsSourceFileToProject();

	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.build(IncrementalProjectBuilder.AUTO_BUILD, monitor);

	IFile errorsFile = project
		.getFile("src/" + PROJECT_NAME + "/errors.rs");

	IMarker[] markers = errorsFile.findMarkers(
		IncrementalRustProjectBuilder.COMPILE_ERROR_MARKER_ID, true,
		IResource.DEPTH_INFINITE);
	assertEquals(1, markers.length);

	// TODO Assert marker message, etc

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }

    @Test
    public final void testClean() throws CoreException {
	IProgressMonitor monitor = mock(IProgressMonitor.class);

	project.build(IncrementalProjectBuilder.FULL_BUILD,
		mock(IProgressMonitor.class));
	project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);

	File binDir = new File(binFolder.getLocationURI());
	File buildDir = new File(buildFolder.getLocationURI());
	File libDir = new File(libFolder.getLocationURI());

	IFile binaryFile = binFolder.getFile("binary");

	assertEquals(0, binDir.list().length);
	assertEquals(0, buildDir.list().length);
	assertEquals(0, libDir.list().length);
	assertFalse(binaryFile.exists());

	verify(monitor).beginTask(anyString(), anyInt());
	verify(monitor).done();
    }
}
