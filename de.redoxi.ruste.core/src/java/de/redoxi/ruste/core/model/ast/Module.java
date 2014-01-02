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
 * Representation of a module within a {@link Crate}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#modules
 */
public class Module extends Item implements Identifiable, Scope {

    private String identifier;
    private boolean noBody;
    private String sourcePath;

    public Module(Item item) {
	super(item);
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }
    
    public boolean hasNoBody() {
	return noBody;
    }

    public void setNoBody(boolean noBody) {
	this.noBody = noBody;
    }

    public String getSourcePath() {
	return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
	this.sourcePath = sourcePath;
    }
    
    @Override
    public boolean hasChildren() {
	return !getItems().isEmpty();
    }

    @Override
    public void accept(Visitor visitor) {
	super.accept(visitor);

	for (Item item : getItems()) {
	    item.accept(visitor);
	}
    }

    /**
     * {@inheritDoc Scope#contains(String)}
     */
    @Override
    public boolean contains(String identifier) {
	for (Visible item : getItems()) {
	    if (item instanceof Identifiable
		    && identifier.equals(((Identifiable) item).getIdentifier())) {
		return true;
	    }
	}

	return getEnclosingScope() != null
		&& getEnclosingScope().contains(identifier);
    }

    /**
     * {@inheritDoc Scope#get(String)}
     */
    @Override
    public Identifiable get(String identifier) {
	for (Visible item : getItems()) {
	    if (item instanceof Identifiable
		    && identifier.equals(((Identifiable) item).getIdentifier())) {
		return (Identifiable) item;
	    }
	}

	return null;
    }

    @Override
    public Scope getScope() {
	return this;
    }

    @Override
    public Scope getEnclosingScope() {
	if (getItem() != null) {
	    return getItem().getScope();
	}

	return null;
    }
}