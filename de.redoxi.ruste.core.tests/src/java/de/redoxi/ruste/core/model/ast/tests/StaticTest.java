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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Static;

public class StaticTest {

    private Module module;
    private Static staticItem;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	staticItem = new Static(module);
    }

    @Test
    public final void testToString() {
	staticItem.setIdentifier("staticVariable");
	staticItem.setMutable(true);
	staticItem.setType("float");

	assertEquals("staticVariable : mut float", staticItem.toString());
    }

    @Test
    public final void testStatic() {
	Static staticItemForTest = new Static(module);

	assertNull(staticItemForTest.getIdentifier());
	assertNull(staticItemForTest.getType());
	assertFalse(staticItemForTest.isMutable());
    }

    @Test
    public final void testGetType() {
	staticItem.setType("float");
	assertEquals("float", staticItem.getType());
    }

    @Test
    public final void testIsMutable() {
	staticItem.setMutable(true);
	assertTrue(staticItem.isMutable());
    }

    @Test
    public final void testSetType() {
	assertNull(staticItem.getType());
	staticItem.setType("float");
	assertEquals("float", staticItem.getType());
    }

    @Test
    public final void testSetMutable() {
	assertFalse(staticItem.isMutable());
	staticItem.setMutable(true);
	assertTrue(staticItem.isMutable());
    }

}
