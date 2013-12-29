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

public class MetaItem extends ASTNode {

    private String identifier = null;
    private List<MetaItem> metaItems = new ArrayList<MetaItem>();
    private String literal = null;

    public MetaItem(ASTNode parent) {
	super(parent);
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    public List<MetaItem> getMetaItems() {
	return metaItems;
    }

    public void setMetaItems(List<MetaItem> metaItems) {
	this.metaItems.clear();
	this.metaItems.addAll(metaItems);
    }

    public String getLiteral() {
	return literal;
    }

    public void setLiteral(String literal) {
	this.literal = literal;
    }
}
