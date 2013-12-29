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
package de.redoxi.ruste.core.editors.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.editors.RustContentOutlinePage;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.Module;

public class RustContentOutlinePageTest {

    private TextEditor mockEditor;
    private IDocumentProvider mockDocumentProvider;
    private RustContentOutlinePage outlinePage;
    private IDocument astSourceDocument;

    @Before
    public void setUp() throws Exception {
	mockEditor = mock(TextEditor.class);
	mockDocumentProvider = mock(IDocumentProvider.class);
	outlinePage = new RustContentOutlinePage(mockDocumentProvider,
		mockEditor);

	final BufferedReader astSourceReader = new BufferedReader(
		new InputStreamReader(getClass().getResourceAsStream("/ast.rs")));

	final StringBuilder sourceBuilder = new StringBuilder();
	String line = null;

	while ((line = astSourceReader.readLine()) != null) {
	    sourceBuilder.append(line);
	    sourceBuilder.append('\n');
	}

	astSourceDocument = new Document(sourceBuilder.toString());
	when(mockDocumentProvider.getDocument(any())).thenReturn(
		astSourceDocument);

	astSourceReader.close();
    }

    @Test
    public final void testCreateControlComposite() {
	outlinePage.createControl(new Shell(Display.getDefault()));
	assertNotNull(outlinePage.getControl());
    }

    @Test
    public final void testSelectionChangedSelectionChangedEvent() {
	Module module = new Module(null);
	module.setStartLine(1);
	module.setEndLine(1);
	module.setStartPos(1);
	module.setEndPos(10);

	IStructuredSelection selection = mock(IStructuredSelection.class);
	when(selection.getFirstElement()).thenReturn(module);

	SelectionChangedEvent event = mock(SelectionChangedEvent.class);
	when(event.getSelection()).thenReturn(selection);

	outlinePage.selectionChanged(event);

	verify(mockEditor).resetHighlightRange();
	verify(mockEditor).setHighlightRange(1, 9, true);
    }

    @Test
    public final void testSetInput() {
	IEditorInput editorInput = mock(IEditorInput.class);

	when(editorInput.getName()).thenReturn("ast.rs");

	when(mockDocumentProvider.getDocument(editorInput)).thenReturn(
		astSourceDocument);

	outlinePage.createControl(new Shell(Display.getDefault()));
	outlinePage.setInput(editorInput);

	final Control controlForTree = outlinePage.getControl();

	assertTrue(controlForTree instanceof Tree);

	final Tree tree = (Tree) controlForTree;

	TreeItem[] items = tree.getItems();
	assertTrue(items.length > 0);
	assertTrue(items[0].getData() instanceof Crate);
    }
}
