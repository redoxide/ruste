/*
 * Copyright 2013-2014 Ruste developers
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
package de.redoxi.ruste.core.wizards.source;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard presented to the user to create a new Rust source file,
 * and optionally creating a number of definitions.
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class NewSourceFile extends Wizard implements INewWizard {

    private static final String RUST_FILE_EXTENSION = "rs";
    
    private WizardNewFileCreationPage newFileCreationPage;
    
    /**
     * 
     */
    public NewSourceFile() {
	super();
	setWindowTitle("New Rust source file");
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
	// TODO Auto-generated method stub

    }
    
    /**
     * Add pages to the new project wizard
     */
    @Override
    public void addPages() {
	super.addPages();

	addFileCreationPage();
    }

    /**
     * Add a page to create the new file
     */
    private void addFileCreationPage() {
	IWorkbench wb = PlatformUI.getWorkbench();
	IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
	IWorkbenchPage page = win.getActivePage();
	
	IStructuredSelection selection = null;
	
	if (page.getSelection() instanceof IStructuredSelection) {
	    selection = (IStructuredSelection) page.getSelection();
	}
	
	IProject project = null;
	
	newFileCreationPage = new WizardNewFileCreationPage("Create new Rust source file", selection);
	newFileCreationPage.setFileExtension(RUST_FILE_EXTENSION);
	
	newFileCreationPage.setTitle("Create a new Rust source file");
	
	if (selection.getFirstElement() instanceof IProject) {
	    project = (IProject) selection.getFirstElement();
	    IPath sourcePath = project.getFullPath();
	    
	    newFileCreationPage.setContainerFullPath(sourcePath.append("src/" + project.getName()));
	}
	
	addPage(newFileCreationPage);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
	IFile newSourceFile = newFileCreationPage.createNewFile();
	return newSourceFile.exists();
    }

}
