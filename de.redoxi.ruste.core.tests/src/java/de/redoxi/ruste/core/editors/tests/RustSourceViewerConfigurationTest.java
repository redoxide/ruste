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

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.editors.RustSourceViewerConfiguration;

public class RustSourceViewerConfigurationTest {

    private RustSourceViewerConfiguration configuration;

    @Before
    public void setUp() throws Exception {
	configuration = new RustSourceViewerConfiguration();
    }

    @Test
    public final void testGetConfiguredContentTypesISourceViewer() {
	List<String> types = Arrays.asList(configuration
		.getConfiguredContentTypes(mock(ISourceViewer.class)));

	assertTrue(types.contains(IDocument.DEFAULT_CONTENT_TYPE));
    }

    @Test
    public final void testGetPresentationReconcilerISourceViewer() {
	assertNotNull(configuration
		.getPresentationReconciler(mock(ISourceViewer.class)));
    }

    @Test
    public final void testGetAnnotationHoverISourceViewer() {
	assertNotNull(configuration
		.getAnnotationHover(mock(ISourceViewer.class)));
    }

    @Test
    public final void testGetTextHoverISourceViewerString() {
	assertNotNull(configuration.getTextHover(mock(ISourceViewer.class),
		IDocument.DEFAULT_CONTENT_TYPE));
    }

}
