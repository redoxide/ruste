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

public class GenericParam extends ASTNode implements Identifiable {

    private String identifier;
    private List<String> traits = new ArrayList<String>();

    public GenericParam(Generic current) {
	super((ASTNode) current);
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }
    
    public List<String> getTraits() {
	return traits;
    }

    public void setTrait(List<String> traits) {
	this.traits.clear();
	this.traits.addAll(traits);
    }

    public String toString() {
	StringBuilder builder = new StringBuilder(identifier);
	
	if (!getTraits().isEmpty()) {
	    builder.append(" : ");
	    builder.append(getTraits().get(0));
	    
	    for (int i = 1; i < getTraits().size(); ++i) {
		builder.append(" + ");
		builder.append(getTraits().get(i));
	    }
	}
	
	return builder.toString();
    }
}
