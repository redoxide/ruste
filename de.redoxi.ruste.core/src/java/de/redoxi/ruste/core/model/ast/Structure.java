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
 * Representation of a structure definition within a {@link Module}
 * 
 * TODO Create a Tuple AST class
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#structures
 */
public class Structure extends Item implements Identifiable, Visible {

    private List<Field> fields = new ArrayList<Field>();
    private String identifier;
    private Visibility visibility = Visibility.DEFAULT;

    public Structure(Module module) {
	super(module);
    }

    @Override
    public String getIdentifier() {
	return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public Visibility getVisibility() {
	return visibility;
    }

    public void setVisibility(Visibility visibility) {
	this.visibility = visibility;
    }

    public final List<Field> getFields() {
        return fields;
    }
    
    @Override
    public boolean hasChildren() {
	return !getFields().isEmpty();
    }

    public final void setFields(List<Field> tupleFields) {
        this.fields.clear();
        this.fields.addAll(tupleFields);
    }
}