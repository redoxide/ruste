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
 * Representation of an implementation of a trait for a type
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#implementations
 */
public class Implementation extends Item implements Visible {

    private String trait;
    private String type;

    private List<ImplementationMethod> methods = new ArrayList<ImplementationMethod>();

    public Implementation(Module module) {
	super(module);
    }

    public String getTrait() {
	return trait;
    }

    public String getType() {
	return type;
    }

    public void setTrait(String trait) {
	this.trait = trait;
    }

    public void setType(String type) {
	this.type = type;
    }

    public List<ImplementationMethod> getMethods() {
	return methods;
    }

    @Override
    public void accept(Visitor visitor) {
	super.accept(visitor);

	for (ImplementationMethod method : getMethods()) {
	    method.accept(visitor);
	}
    }
}