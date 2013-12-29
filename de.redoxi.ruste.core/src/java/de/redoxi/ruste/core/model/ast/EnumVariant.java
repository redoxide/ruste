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

/**
 * Representation of a variant within an enumeration
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#enumerations
 */
public class EnumVariant extends ASTNode implements Identifiable {

    private String identifier;

    public EnumVariant(Enumeration enumeration) {
	super(enumeration);
	enumeration.getVariants().add(this);
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public Enumeration getEnumeration() {
	return (Enumeration) getParent();
    }
}