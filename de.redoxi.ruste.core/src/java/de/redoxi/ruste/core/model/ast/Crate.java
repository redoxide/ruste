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

package de.redoxi.ruste.core.model.ast;

import org.eclipse.core.resources.IFile;

/**
 * Representation of a Rust crate in the outline
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#crates-and-source-files
 */
public class Crate extends Module {

    private IFile sourceFile;

    public Crate() {
	super(null);
    }

    public Crate(IFile sourceFile) {
	this();
	this.sourceFile = sourceFile;
    }

    @Override
    public Item getItem() {
	return null;
    }

    @Override
    public Crate getCrate() {
	return this;
    }

    public IFile getSourceFile() {
	return sourceFile;
    }

    public void setSourceFile(IFile sourceFile) {
	this.sourceFile = sourceFile;
    }
    
    public enum Type {
	EXECUTABLE, LIBRARY;
    }
}