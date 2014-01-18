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
package de.redoxi.ruste.core.wizards.project;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import de.redoxi.ruste.core.builders.IncrementalRustProjectBuilder;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.natures.RustProjectNature;

/**
 * Wizard presented to the user to create a new Rust project
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class NewProjectWizard extends Wizard implements INewWizard {

    private WizardNewProjectCreationPage newProjectCreationPage;
    private InitialiseRustpkgWorkspacePage initialiseRustpkgWorkspacePage;

    private static final String BIN_DIR = "bin";
    private static final String LIB_DIR = "lib";
    private static final String SRC_DIR = "src";
    private static final String BUILD_DIR = "build";
    
    private static final String MAIN_SOURCE_FILENAME = "main.rs";
    private static final String LIB_SOURCE_FILENAME = "lib.rs";
    private static final String TEST_SOURCE_FILENAME = "test.rs";
    private static final String BENCHMARK_SOURCE_FILENAME = "bench.rs";
    private static final String PKG_SOURCE_FILENAME = "pkg.rs";
    
    private static final String CRATE_ID_ATTR = "crate_id";
    private static final String CRATE_TYPE_ATTR = "crate_type";
    private static final String LICENCE_ATTR = "license";
    private static final String COMMENT_ATTR = "comment";
    
    private static final String EXEC_CRATE_TYPE = "bin";
    private static final String LIB_CRATE_TYPE = "lib";

    public NewProjectWizard() {
	super();
	setWindowTitle("New Rust Project");
    }

    /**
     * Add pages to the new project wizard
     */
    @Override
    public void addPages() {
	super.addPages();

	addProjectCreationPage();
	addInitialiseRustpkgWorkspacePage();
	// TODO Documentation creation page
    }

    private void addProjectCreationPage() {
	newProjectCreationPage = new WizardNewProjectCreationPage(
		"New Rust Project");
	newProjectCreationPage.setTitle("Create a new Rust project");
	newProjectCreationPage
		.setDescription("Create a new Rust project compatible with rustpkg tool");

	addPage(newProjectCreationPage);
    }
    
    private void addInitialiseRustpkgWorkspacePage() {
	initialiseRustpkgWorkspacePage = new InitialiseRustpkgWorkspacePage("Configure crate");
	initialiseRustpkgWorkspacePage.setTitle("Configure crate attributes");
	initialiseRustpkgWorkspacePage.setDescription("Set crate type and crate-level attributes for the package");
	
	addPage(initialiseRustpkgWorkspacePage);
    }

    /**
     * Finish the wizard and create the new project
     * 
     * @return <code>true</code> if the project was created, <code>false</code>
     *         otherwise.
     */
    @Override
    public boolean performFinish() {
	URI location = null;
	if (!newProjectCreationPage.useDefaults()) {
	    location = newProjectCreationPage.getLocationURI();
	} // else location == null

	IProject newProject = null;
	try {
	    newProject = createNewProject(
		    newProjectCreationPage.getProjectName(), location);
	} catch (CoreException e) {
	    return false;
	}

	return newProject.exists();
    }

    /**
     * Create a new {@link IProject} with the given <code>projectName</code> at
     * the given location and associates the {@link RustProjectNature} and
     * {@link IncrementalRustProjectBuilder} with the new project.
     * 
     * The "src" directory will contain a folder with the same name as the
     * project. This sets the project up as a "workspace" compatible with the
     * <code>rustpkg</code> tool.
     * 
     * @param projectName
     *            The name of the new project.
     * @param location
     *            The location configured by the user, or <code>null</code> if
     *            the default is to be used
     * @return <code>true</code> if the project was created, <code>false</code>
     *         otherwise
     */
    private IProject createNewProject(String projectName, URI location)
	    throws CoreException {
	IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(projectName);

	if (newProject.exists()) {
	    throw new CoreException(Status.CANCEL_STATUS);
	}

	// Create the project if it doesn't exist
	URI projectLocation = location;
	IProjectDescription desc = newProject.getWorkspace()
		.newProjectDescription(newProject.getName());
	if (location != null
		&& ResourcesPlugin.getWorkspace().getRoot().getLocationURI()
			.equals(location)) {
	    projectLocation = null;
	}

	desc.setLocationURI(projectLocation);
	newProject.create(desc, null);
	newProject.open(null);

	// Add the RustProjectNature to this project
	IProjectDescription description = newProject.getDescription();
	String[] prevNatures = description.getNatureIds();
	String[] newNatures = new String[prevNatures.length + 1];
	System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
	newNatures[prevNatures.length] = RustProjectNature.NATURE_ID;
	description.setNatureIds(newNatures);

	IProgressMonitor monitor = null;
	newProject.setDescription(description, monitor);

	addBuilder(newProject, IncrementalRustProjectBuilder.BUILDER_ID);

	createHiddenFolder(newProject.getFolder(BIN_DIR));
	createHiddenFolder(newProject.getFolder(LIB_DIR));
	createHiddenFolder(newProject.getFolder(BUILD_DIR));
	createFolder(newProject.getFolder(SRC_DIR));
	createFolder(newProject.getFolder(SRC_DIR + "/" + projectName));

	initPackageFiles(newProject);
	
	return newProject;
    }

    /**
     * Create the given {@link IFolder} with the default settings
     * 
     * @param folder
     *            The folder to add
     * @throws CoreException
     */
    private static void createFolder(IFolder folder) throws CoreException {
	folder.create(false, true, null);
    }

    /**
     * Creates the given {@link IFolder} as a hidden folder
     * 
     * @param folder
     *            The folder to add
     * @throws CoreException
     */
    private static void createHiddenFolder(IFolder folder) throws CoreException {
	folder.create(IResource.HIDDEN, true, null);
    }

    /**
     * Adds the {@link IncrementalRustProjectBuilder} described in the plugin to
     * the given project
     * 
     * @param project
     *            The {@link IProject} that the builder is to be added to
     * @param id
     *            The ID of the builder to add
     * @throws CoreException
     */
    private void addBuilder(IProject project, String id) throws CoreException {
	IProjectDescription desc = project.getDescription();
	ICommand[] commands = desc.getBuildSpec();

	// add builder to project
	ICommand command = desc.newCommand();
	command.setBuilderName(id);
	ICommand[] nc = new ICommand[commands.length + 1];
	// Add it before other builders.
	System.arraycopy(commands, 0, nc, 1, commands.length);
	nc[0] = command;
	desc.setBuildSpec(nc);
	project.setDescription(desc, null);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {

    }
    
    private void initPackageFiles(IProject project) {
	if (initialiseRustpkgWorkspacePage.getCrateType() != Crate.Type.EXECUTABLE && initialiseRustpkgWorkspacePage.getCrateType() != Crate.Type.LIBRARY) {
	    return;
	}
	
	if (initialiseRustpkgWorkspacePage.shouldGenerateTestFile()) {
	    createSourceFile(project, TEST_SOURCE_FILENAME);
	}
	
	if (initialiseRustpkgWorkspacePage.shouldGeneratedBenchFile()) {
	    createSourceFile(project, BENCHMARK_SOURCE_FILENAME);
	}
	
	if (initialiseRustpkgWorkspacePage.shouldGeneratePkgFile()) {
	    createSourceFile(project, PKG_SOURCE_FILENAME);
	}
	
	String sourceFileName = MAIN_SOURCE_FILENAME;
	String crateType = EXEC_CRATE_TYPE;
	String initialSource = "fn main() {\n\t// TODO Your code goes here\n}\n"; // TODO Use a code template here
	
	if (initialiseRustpkgWorkspacePage.getCrateType() == Crate.Type.LIBRARY) {
	    sourceFileName = LIB_SOURCE_FILENAME;
	    crateType = LIB_CRATE_TYPE;
	    initialSource = "\n";
	}
	
	StringBuilder sourceBuilder = new StringBuilder();
	
	if (!initialiseRustpkgWorkspacePage.getCrateId().isEmpty()) {
	    sourceBuilder.append(newStringAttribute(CRATE_ID_ATTR, initialiseRustpkgWorkspacePage.getCrateId()));
	}
	
	if (!initialiseRustpkgWorkspacePage.getCrateComment().isEmpty()) {
	    sourceBuilder.append(newStringAttribute(COMMENT_ATTR, initialiseRustpkgWorkspacePage.getCrateComment()));
	}
	
	sourceBuilder.append(newStringAttribute(CRATE_TYPE_ATTR, crateType));
	
	if (!initialiseRustpkgWorkspacePage.getLicence().isEmpty()) {
	    sourceBuilder.append(newStringAttribute(LICENCE_ATTR, initialiseRustpkgWorkspacePage.getCrateId()));
	}
	
	sourceBuilder.append(initialSource);
	
	IFile sourceFile = createSourceFile(project, sourceFileName);
	try {
	    sourceFile.appendContents(new ByteArrayInputStream(sourceBuilder.toString().getBytes("UTF-8")), true, false, null);
	} catch (UnsupportedEncodingException e) {
	    // TODO Log error
	} catch (CoreException e) {
	    // TODO Log error
	}
    }
    
    private IFile createSourceFile(IProject project, String fileName) {
	IFile file = project.getFile(SRC_DIR + "/" + project.getName() + "/" + fileName);
	if (!file.exists()) {
	    try {
		file.create(new ByteArrayInputStream(new byte[0]), false, null);
	    } catch (CoreException e) {
		// TODO Log exception
	    }
	}
	
	return file;
    }
    
    private String newStringAttribute(String name, String value) {
	return "#[" + name + " = \"" + value.replace("\"", "\\\"") + "\"];\n";
    }
}
