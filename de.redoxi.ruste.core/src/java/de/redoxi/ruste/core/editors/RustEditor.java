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

package de.redoxi.ruste.core.editors;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * Source code editor for Rust source files (*.rs).
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustEditor extends TextEditor {

    public static final String EDITOR_MATCHING_BRACKETS = "editorMatchingBrackets";
    public static final String EDITOR_MATCHING_BRACKETS_COLOUR = "editorMatchingBracketsColour";

    private static final char[] MATCHING_BRACKET_CHARS = { '(', ')', '{', '}',
	    '[', ']', '<', '>', '"', '"', '\'', '\'' };

    private RustContentOutlinePage outlinePage;

    public RustEditor() {
	super();
	setSourceViewerConfiguration(new RustSourceViewerConfiguration());
	setDocumentProvider(new RustDocumentProvider());
    }

    @Override
    public void configureSourceViewerDecorationSupport(
	    SourceViewerDecorationSupport support) {
	super.configureSourceViewerDecorationSupport(support);

	// Configure character matching
	final ICharacterPairMatcher pairMatcher = new DefaultCharacterPairMatcher(
		MATCHING_BRACKET_CHARS,
		IDocumentExtension3.DEFAULT_PARTITIONING);
	support.setCharacterPairMatcher(pairMatcher);
	support.setMatchingCharacterPainterPreferenceKeys(
		EDITOR_MATCHING_BRACKETS, EDITOR_MATCHING_BRACKETS_COLOUR);

	final IPreferenceStore store = getPreferenceStore();
	store.setDefault(EDITOR_MATCHING_BRACKETS, true);
	store.setDefault(EDITOR_MATCHING_BRACKETS_COLOUR, "128,128,128");
    }

    public Object getAdapter(@SuppressWarnings("rawtypes") Class required) {
	if (IContentOutlinePage.class.equals(required)) {
	    if (outlinePage == null) {
		outlinePage = new RustContentOutlinePage(getDocumentProvider(),
			this);
		if (getEditorInput() != null)
		    outlinePage.setInput(getEditorInput());
	    }
	    return outlinePage;
	}
	return super.getAdapter(required);
    }
}
