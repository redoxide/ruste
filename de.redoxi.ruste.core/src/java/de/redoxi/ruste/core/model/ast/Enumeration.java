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

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of an enumeration definition within a {@link Module}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#enumerations
 */
public class Enumeration extends Item implements Identifiable, Visible {

    private String identifier;
    private List<EnumVariant> variants = new ArrayList<EnumVariant>();

    public Enumeration(Module module) {
	super(module);
    }

    public List<EnumVariant> getVariants() {
	return variants;
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }
    
    @Override
    public boolean hasChildren() {
	return !getVariants().isEmpty();
    }

    @Override
    public void accept(Visitor visitor) {
	super.accept(visitor);

	for (EnumVariant variant : getVariants()) {
	    variant.accept(visitor);
	}
    }
}
