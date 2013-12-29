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
 * Representation of a trait in a {@link Module}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#traits
 */
public class Trait extends Item implements Identifiable, Visible {

    // TODO Generic parameters
    private String identifier;
    private List<TraitMethod> methods = new ArrayList<TraitMethod>();
    private Visibility visibility = Visibility.DEFAULT;

    public Trait(Module module) {
	super(module);
    }

    public List<TraitMethod> getMethods() {
	return methods;
    }

    @Override
    public String getIdentifier() {
	return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    @Override
    public void accept(Visitor visitor) {
	super.accept(visitor);

	for (TraitMethod method : getMethods()) {
	    method.accept(visitor);
	}
    }

    public Visibility getVisibility() {
	return visibility;
    }

    public void setVisibility(Visibility visibility) {
	this.visibility = visibility;
    }
}