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
package de.redoxi.ruste.core.wizards.project;


import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.redoxi.ruste.core.model.ast.Crate;

/**
 * Presents the user with an interface for configuring the package
 * and any required attributes.
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class InitialiseRustpkgWorkspacePage extends WizardPage {

    private Text crateIdField;
    private Text crateCommentField;
    
    private Button crateTypeLibraryButton;
    private Button crateTypeExecutableButton;
    
    private Button generateTestRsFile;
    private Button generateBenchRsFile;
    private Button generatePkgRsFile;
    
    private Combo licenceCombo;
    
    // TODO Features
    
    protected InitialiseRustpkgWorkspacePage(String pageName) {
	super(pageName);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createControl(Composite parent) {
	final Composite control = new Composite(parent, SWT.NULL);
	
	final GridLayout layout = new GridLayout(2, false);
	control.setLayout(layout);
	
	final Label crateIdLabel = new Label(control, SWT.NONE);
	crateIdLabel.setText("Crate ID");
	crateIdLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	crateIdField = new Text(control, SWT.BORDER);
	// TODO Set ID from the name of the project
	crateIdField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Label crateCommentLabel = new Label(control, SWT.NONE);
	crateCommentLabel.setText("Crate Comment");
	crateCommentLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	crateCommentField = new Text(control, SWT.BORDER);
	crateCommentField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Label crateTypeLabel = new Label(control, SWT.NONE);
	crateTypeLabel.setText("Crate type");
	crateTypeLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Composite crateTypeComposite = new Composite(control, SWT.NONE);
	crateTypeComposite.setLayout(new RowLayout());
	crateTypeComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	crateTypeExecutableButton = new Button(crateTypeComposite, SWT.RADIO);
	crateTypeExecutableButton.addSelectionListener(new SelectionAdapter() {
	    
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		if (e.item == crateTypeExecutableButton)
		    crateTypeLibraryButton.setSelection(false);
	    }
	});
	
	final Label crateTypeExecutableLabel = new Label(crateTypeComposite, SWT.NONE);
	crateTypeExecutableLabel.setText("Executable");
	
	crateTypeLibraryButton = new Button(crateTypeComposite, SWT.RADIO);
	crateTypeLibraryButton.addSelectionListener(new SelectionAdapter() {
	    
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		if (e.item == crateTypeLibraryButton)
		    crateTypeExecutableButton.setSelection(false);
	    }
	});
	
	final Label crateTypeLibraryLabel = new Label(crateTypeComposite, SWT.NONE);
	crateTypeLibraryLabel.setText("Library");
	
	final Label crateLicenceLabel = new Label(control, SWT.NONE);
	crateLicenceLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	licenceCombo = new Combo(parent, SWT.DEFAULT);
	licenceCombo.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Label generateFilesLabel = new Label(control, SWT.NONE);
	generateFilesLabel.setText("Generate source");
	generateFilesLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
	
	final Label emptyLabel0 = new Label(control, SWT.NONE);
	emptyLabel0.setText("");
	emptyLabel0.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Composite testRsComposite = new Composite(control, SWT.NONE);
	testRsComposite.setLayout(new RowLayout());
	testRsComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	generateTestRsFile = new Button(testRsComposite, SWT.CHECK);
	generateTestRsFile.setSelection(true);
	
	final Label generateTestRsFileLabel = new Label(testRsComposite, SWT.NONE);
	generateTestRsFileLabel.setText("Create test.rs");
	
	final Label emptyLabel1 = new Label(control, SWT.NONE);
	emptyLabel1.setText("");
	emptyLabel1.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Composite benchRsComposite = new Composite(control, SWT.NONE);
	benchRsComposite.setLayout(new RowLayout());
	benchRsComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	generateBenchRsFile = new Button(benchRsComposite, SWT.CHECK);
	generateBenchRsFile.setSelection(true);
	
	final Label generateBenchRsFileLabel = new Label(benchRsComposite, SWT.NONE);
	generateBenchRsFileLabel.setText("Create bench.rs");
	
	final Label emptyLabel2 = new Label(control, SWT.NONE);
	emptyLabel2.setText("");
	emptyLabel2.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	final Composite pkgRsComposite = new Composite(control, SWT.NONE);
	pkgRsComposite.setLayout(new RowLayout());
	pkgRsComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 1, 1));
	
	generatePkgRsFile = new Button(pkgRsComposite, SWT.CHECK);
	generatePkgRsFile.setSelection(false);
	
	final Label generatePkgRsFileLabel = new Label(pkgRsComposite, SWT.NONE);
	generatePkgRsFileLabel.setText("Generate pkg.rs");
	
	control.pack();
	
	setControl(control);
    }

    /**
     * @return the value for the <code>crate_id</code> attribute
     */
    public String getCrateId() {
	return crateIdField.getText();
    }
    
    /**
     * @return the value for the <code>comment</code> attribute
     */
    public String getCrateComment() {
	return crateCommentField.getText();
    }
    
    /**
     * @return the value for the <code>crate_type</code> attribute
     */
    public Crate.Type getCrateType() {
	if (crateTypeLibraryButton.getSelection()) {
	    return Crate.Type.LIBRARY;
	}
	
	return Crate.Type.EXECUTABLE;
    }
    
    /**
     * @return <code>true</code> if a <code>test.rs</code> file should be created
     */
    public boolean shouldGenerateTestFile() {
	return generateTestRsFile.getSelection();
    }
    
    /**
     * @return <code>true</code> if a <code>bench.rs</code> file should be created
     */
    public boolean shouldGeneratedBenchFile() {
	return generateBenchRsFile.getSelection();
    }
    
    /**
     * @return <code>true</code> if a <code>pkg.rs</code> file should be created
     */
    public boolean shouldGeneratePkgFile() {
	return generatePkgRsFile.getSelection();
    }
    
    /**
     * @return the value for the <code>license</code> attribute
     */
    public String getLicence() {
	return licenceCombo.getText();
    }
}
