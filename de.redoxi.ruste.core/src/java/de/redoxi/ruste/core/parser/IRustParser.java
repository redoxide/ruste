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

package de.redoxi.ruste.core.parser;

import org.eclipse.jface.text.IDocument;

import de.redoxi.ruste.core.model.ast.ASTNode;

public interface IRustParser {

    /**
     * @return The root {@link ASTNode} parsed by this listener
     */
    public abstract ASTNode getRoot();

    /**
     * Set the root AST node that the parser should begin with
     * 
     * @param root
     */
    public abstract void setRoot(ASTNode root);
    
    /**
     * Set the name of crate
     * 
     * @param name
     */
    public void setName(String name);

    /**
     * Parse the given Rust source
     */
    public abstract void parse();

    public void setSource(IDocument document);
}