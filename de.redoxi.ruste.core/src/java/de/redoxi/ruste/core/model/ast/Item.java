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
 * Base class for all item representations within a crate
 * 
 * @see http ://static.rust-lang.org/doc/master/rust.html#items-and-attributes
 */
public abstract class Item extends ASTNode implements Visible {

    protected List<MetaItem> metaItems = new ArrayList<MetaItem>();
    protected Visibility visibility = Visibility.DEFAULT;
    private List<Item> items = new ArrayList<Item>();

    public Item(Item parent) {
	super(parent);
	if (parent != null) {
	    parent.getItems().add(this);
	}
    }

    public Crate getCrate() {
	if (this.parent instanceof Crate) {
	    return (Crate) this.parent;
	} else if (this.parent instanceof Item) {
	    return ((Item) this.parent).getCrate();
	} else {
	    return null;
	}
    }

    public Item getItem() {
	return (Item) parent;
    }

    public void setItem(Item item) {
	this.parent = item;
    }

    @Override
    public Scope getScope() {
	Item item = getItem();

	while (item != null && !(item instanceof Scope)) {
	    item = item.getItem();
	}

	return (Scope) item;
    }

    public List<MetaItem> getMetaItems() {
	return metaItems;
    }

    public void setMetaItems(List<MetaItem> metaItems) {
	this.metaItems.clear();
	this.metaItems.addAll(metaItems);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.redoxi.ruste.core.model.Visible#getVisibility()
     */
    @Override
    public Visibility getVisibility() {
	return visibility;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.redoxi.ruste.core.model.Visible#setVisibility(de.redoxi.ruste.core
     * .model.Visibility)
     */
    @Override
    public void setVisibility(Visibility visibility) {
	this.visibility = visibility;
    }

    public List<Item> getItems() {
	return items;
    }
}