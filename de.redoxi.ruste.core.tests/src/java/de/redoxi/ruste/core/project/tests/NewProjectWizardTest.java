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
package de.redoxi.ruste.core.project.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.project.NewProjectWizard;
import de.redoxi.ruste.core.tests.AbstractUITest;

public class NewProjectWizardTest extends AbstractUITest {

    private NewProjectWizard newProjectWizard;
    private IProject existingProject;

    private static final String PROJECT_NAME = "test";
    private static final String EXISTING_PROJECT_NAME = "existingTest";

    @Before
    public void setUp() throws Exception {
	newProjectWizard = new NewProjectWizard();
	newProjectWizard.init(PlatformUI.getWorkbench(), null);

	existingProject = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(EXISTING_PROJECT_NAME);
	existingProject.create(null);
    }

    @After
    public void tearDown() throws Exception {
	existingProject.delete(true, null);
    }

    @Test
    public final void testAddPages() {
	newProjectWizard.addPages();

	assertNotNull(newProjectWizard.getPages());
	assertEquals(1, newProjectWizard.getPages().length);
    }

    @Test
    public final void testPerformFinish() {
	WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
		.getDisplay().getActiveShell(), newProjectWizard);
	dialog.setBlockOnOpen(false);
	dialog.open();

	WizardNewProjectCreationPage newProjectPage = (WizardNewProjectCreationPage) newProjectWizard
		.getPages()[0];
	assertNotNull(newProjectPage);

	List<Text> textFields = getControlsOfType(
		(Composite) newProjectPage.getControl(), Text.class);
	assertNotNull(textFields);
	assertFalse(textFields.isEmpty());
	assertEquals(2, textFields.size());

	textFields.get(0).setText(PROJECT_NAME);

	assertTrue(newProjectWizard.performFinish());

	IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(PROJECT_NAME);

	assertNotNull(newProject);
	assertTrue(newProject.exists());

	assertNotNull(newProject.getFolder("bin"));
	assertNotNull(newProject.getFolder("build"));
	assertNotNull(newProject.getFolder("lib"));
	assertNotNull(newProject.getFolder("src"));
	assertNotNull(newProject.getFolder("src/" + PROJECT_NAME));

	try {
	    newProject.delete(true, null);
	} catch (CoreException e) {
	    fail();
	}
    }

    @Test
    public final void testPerformFinishNotDefaultLocation() {
	WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
		.getDisplay().getActiveShell(), newProjectWizard);
	dialog.setBlockOnOpen(false);
	dialog.open();

	WizardNewProjectCreationPage newProjectPage = (WizardNewProjectCreationPage) newProjectWizard
		.getPages()[0];
	assertNotNull(newProjectPage);

	List<Text> textFields = getControlsOfType(
		(Composite) newProjectPage.getControl(), Text.class);
	List<Button> buttons = getControlsOfType(
		(Composite) newProjectPage.getControl(), Button.class);

	assertNotNull(textFields);
	assertFalse(textFields.isEmpty());
	assertEquals(2, textFields.size());

	textFields.get(0).setText(PROJECT_NAME);

	// Disable the default project location
	buttons.get(0).setSelection(false);

	String usePath = ResourcesPlugin.getWorkspace().getRoot().getLocation()
		.toFile().getParent()
		+ File.separator + PROJECT_NAME;

	textFields.get(1).setText(usePath);

	assertTrue(newProjectWizard.performFinish());

	IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(PROJECT_NAME);

	assertEquals(usePath, newProject.getLocation().toString());

	assertNotNull(newProject);
	assertTrue(newProject.exists());

	assertNotNull(newProject.getFolder("bin"));
	assertNotNull(newProject.getFolder("build"));
	assertNotNull(newProject.getFolder("lib"));
	assertNotNull(newProject.getFolder("src"));
	assertNotNull(newProject.getFolder("src/" + PROJECT_NAME));

	try {
	    newProject.delete(true, null);
	} catch (CoreException e) {
	    fail();
	}
    }

    @Test
    public final void testPerformFinishUseWorkspaceRoot() {
	WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
		.getDisplay().getActiveShell(), newProjectWizard);
	dialog.setBlockOnOpen(false);
	dialog.open();

	WizardNewProjectCreationPage newProjectPage = (WizardNewProjectCreationPage) newProjectWizard
		.getPages()[0];
	assertNotNull(newProjectPage);

	List<Text> textFields = getControlsOfType(
		(Composite) newProjectPage.getControl(), Text.class);
	List<Button> buttons = getControlsOfType(
		(Composite) newProjectPage.getControl(), Button.class);

	assertNotNull(textFields);
	assertFalse(textFields.isEmpty());
	assertEquals(2, textFields.size());

	textFields.get(0).setText(PROJECT_NAME);

	// Disable the default project location
	buttons.get(0).setSelection(false);

	String usePath = ResourcesPlugin.getWorkspace().getRoot().getLocation()
		.toString();

	textFields.get(1).setText(usePath);

	assertTrue(newProjectWizard.performFinish());

	IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
		.getProject(PROJECT_NAME);

	try {
	    newProject.delete(true, null);
	} catch (CoreException ex) {
	    fail();
	}
    }

    @Test
    public final void testPerformFinishProjectAlreadyExists() {
	WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
		.getDisplay().getActiveShell(), newProjectWizard);
	dialog.setBlockOnOpen(false);
	dialog.open();

	WizardNewProjectCreationPage newProjectPage = (WizardNewProjectCreationPage) newProjectWizard
		.getPages()[0];
	assertNotNull(newProjectPage);

	List<Text> textFields = getControlsOfType(
		(Composite) newProjectPage.getControl(), Text.class);
	assertNotNull(textFields);
	assertFalse(textFields.isEmpty());
	assertEquals(2, textFields.size());

	textFields.get(0).setText(EXISTING_PROJECT_NAME);

	assertFalse(newProjectWizard.performFinish());
    }

    @Test
    public final void testNewProjectWizard() {
	NewProjectWizard wizard = new NewProjectWizard();
	assertEquals("New Rust Project", wizard.getWindowTitle());
    }
}
