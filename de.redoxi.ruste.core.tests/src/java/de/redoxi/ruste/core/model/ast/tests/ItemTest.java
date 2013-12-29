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
package de.redoxi.ruste.core.model.ast.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.MetaItem;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Visibility;
import de.redoxi.ruste.core.model.ast.Visible;

public class ItemTest {

    private Item item;
    private Crate crate;
    private Item module;

    // TODO Create an AST sub-tree that has a leaf node two levels deep from an
    // item that defines scope

    @Before
    public void setUp() throws Exception {
	crate = new Crate();
	module = new Module(crate);
	item = new Item(module) {
	};
    }

    @Test
    public final void testItemCrate() {
	Crate crateForItem = new Crate();
	Visible itemWithCrate = new Item(crateForItem) {
	};

	assertFalse(crateForItem.getItems().isEmpty());
	assertSame(itemWithCrate, crateForItem.getItems().get(0));
    }

    @Test
    public final void testItemModule() {
	Crate crateForItem = new Crate();
	Item moduleForItem = new Module(crateForItem);
	Visible itemWithModule = new Item(moduleForItem) {
	};

	assertFalse(moduleForItem.getItems().isEmpty());
	assertSame(itemWithModule, moduleForItem.getItems().get(0));
    }

    @Test
    public final void testGetCrate() {
	assertSame(crate, item.getCrate());
    }

    @Test
    public final void testGetModule() {
	assertSame(module, item.getItem());
    }

    @Test
    public final void testSetModule() {
	Module newModule = new Module(crate);
	item.setItem(newModule);
	assertSame(newModule, item.getItem());
    }

    @Test
    public final void testGetScope() {
	assertSame(module, item.getScope());
    }

    @Test
    public final void testGetScope_noParentItem() {
	Module orphanModule = new Module(null);
	assertNull(orphanModule.getCrate());
    }

    @Test
    public final void testGetMetaItems() {
	assertNotNull(item.getMetaItems());
	assertTrue(item.getMetaItems().isEmpty());
    }

    @Test
    public final void testSetMetaItems() {
	MetaItem metaItem = new MetaItem(item);
	List<MetaItem> metaItems = new ArrayList<MetaItem>();
	metaItems.add(metaItem);

	assertNotNull(item.getMetaItems());
	assertTrue(item.getMetaItems().isEmpty());
	item.setMetaItems(metaItems);
	assertSame(metaItem, item.getMetaItems().get(0));
    }

    @Test
    public final void testSetVisibility() {
	assertEquals(Visibility.DEFAULT, item.getVisibility());
	item.setVisibility(Visibility.PUBLIC);
	assertEquals(Visibility.PUBLIC, item.getVisibility());
    }

    @Test
    public final void testGetVisibility() {
	assertEquals(Visibility.DEFAULT, item.getVisibility());
    }
}
