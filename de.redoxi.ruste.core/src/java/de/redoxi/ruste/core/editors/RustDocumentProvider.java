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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class RustDocumentProvider extends FileDocumentProvider {

    protected IDocument createDocument(Object element) throws CoreException {
	IDocument document = super.createDocument(element);
	if (document != null) {
	    IDocumentPartitioner partitioner = new FastPartitioner(
		    new RustPartitionScanner(), new String[] {
			    RustPartitionScanner.DOC_COMMENT,
			    RustPartitionScanner.COMMENT });
	    partitioner.connect(document);
	    document.setDocumentPartitioner(partitioner);
	}
	return document;
    }
}