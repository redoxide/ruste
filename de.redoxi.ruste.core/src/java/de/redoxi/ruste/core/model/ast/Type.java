/*
 * Copyright 2013-2014 Ruste developers
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
 * Type definition
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class Type extends ASTNode implements Identifiable {

    private String identifier;
    private String type;
    
    public Type(ASTNode parent) {
	super(parent);
    }

    /**
     * @see de.redoxi.ruste.core.model.ast.Identifiable#getIdentifier()
     */
    @Override
    public String getIdentifier() {
	return identifier;
    }

    /**
     * @see de.redoxi.ruste.core.model.ast.Identifiable#setIdentifier(java.lang.String)
     */
    @Override
    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }
}
