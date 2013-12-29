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

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.editors.RustContentOutlinePage;
import de.redoxi.ruste.core.editors.RustEditor;

public class RustEditorTest {

    private RustEditor editor;

    @Before
    public void setUp() throws Exception {
	editor = new RustEditor();
    }

    @Test
    public final void testConfigureSourceViewerDecorationSupportSourceViewerDecorationSupport() {
	SourceViewerDecorationSupport mockSupport = mock(SourceViewerDecorationSupport.class);

	editor.configureSourceViewerDecorationSupport(mockSupport);

	verify(mockSupport).setCharacterPairMatcher(
		any(ICharacterPairMatcher.class));
	verify(mockSupport).setMatchingCharacterPainterPreferenceKeys(
		RustEditor.EDITOR_MATCHING_BRACKETS,
		RustEditor.EDITOR_MATCHING_BRACKETS_COLOUR);
    }

    @Test
    public final void testGetAdapterClass() {
	Object adapter = editor.getAdapter(IContentOutlinePage.class);

	assertTrue(adapter instanceof RustContentOutlinePage);
    }
}
