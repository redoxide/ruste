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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.MetaItem;
import de.redoxi.ruste.core.model.ast.Module;

public class MetaItemTest {

    private Crate crate = new Crate();
    private Module module = new Module(crate);
    private MetaItem metaItem = new MetaItem(module);

    @Test
    public final void testMetaItem() {
	MetaItem metaItem = new MetaItem(module);
	assertNull(metaItem.getIdentifier());
	assertTrue(metaItem.getMetaItems().isEmpty());
	assertNull(metaItem.getLiteral());
    }

    @Test
    public final void testGetIdentifier() {
	assertNull(metaItem.getIdentifier());
    }

    @Test
    public final void testSetIdentifier() {
	assertNull(metaItem.getIdentifier());
	String identifier = "metaItem";
	metaItem.setIdentifier(identifier);
	assertEquals(identifier, metaItem.getIdentifier());
    }

    @Test
    public final void testGetMetaItems() {
	assertNotNull(metaItem.getMetaItems());
	assertTrue(metaItem.getMetaItems().isEmpty());
    }

    @Test
    public final void testSetMetaItems() {
	List<MetaItem> metaItems = new ArrayList<MetaItem>();
	MetaItem nestedItem = new MetaItem(metaItem);
	metaItems.add(nestedItem);

	metaItem.setMetaItems(metaItems);
	assertSame(nestedItem, metaItem.getMetaItems().get(0));
    }

    @Test
    public final void testGetLiteral() {
	assertNull(metaItem.getLiteral());
    }

    @Test
    public final void testSetLiteral() {
	assertNull(metaItem.getLiteral());
	final String literal = "literal";
	metaItem.setLiteral(literal);
	assertEquals(literal, metaItem.getLiteral());
    }

}
