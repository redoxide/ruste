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

import org.eclipse.jface.text.DefaultTextHover;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * Configuration for Rust editor
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustSourceViewerConfiguration extends SourceViewerConfiguration {

    private RustScanner scanner;

    public RustSourceViewerConfiguration() {
	super();
	scanner = new RustScanner();
	scanner.setDefaultReturnToken(new Token(IDocument.DEFAULT_CONTENT_TYPE));
    }

    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
	return new String[] { IDocument.DEFAULT_CONTENT_TYPE };
    }

    public IPresentationReconciler getPresentationReconciler(
	    ISourceViewer sourceViewer) {
	PresentationReconciler reconciler = new PresentationReconciler();

	DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
	reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
	reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

	return reconciler;
    }

    /**
     * {@inheritDoc SourceViewerConfiguration#getAnnotationHover(ISourceViewer)}
     */
    @Override
    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
	return new DefaultAnnotationHover();
    }

    /**
     * {@inheritDoc SourceViewerConfiguration#getTextHover(ISourceViewer,
     * String)}
     */
    @Override
    public ITextHover getTextHover(ISourceViewer sourceViewer,
	    String contentType) {
	return new DefaultTextHover(sourceViewer);
    }
}