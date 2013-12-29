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
 * Representation of an static definition within a {@link Module}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#static-items
 */
public class Static extends Item implements Identifiable {

    private String identifier;
    private String type;
    private boolean mutable;

    public Static(Module module) {
	super(module);
    }

    public String getType() {
	return type;
    }

    public boolean isMutable() {
	return mutable;
    }

    public void setType(String type) {
	this.type = type;
    }

    public void setMutable(boolean mutable) {
	this.mutable = mutable;
    }

    @Override
    public String toString() {
	StringBuilder label = new StringBuilder();
	label.append(identifier);
	label.append(" : ");

	if (mutable) {
	    label.append("mut ");
	}

	label.append(type);

	return label.toString();
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }
}