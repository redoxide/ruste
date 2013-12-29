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
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Structure;
import de.redoxi.ruste.core.model.ast.Visibility;

public class StructureTest {

    private Module module;
    private Structure structure;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	structure = new Structure(module);
    }

    @Test
    public final void testStructure() {
	Structure structForTest = new Structure(module);

	assertNull(structForTest.getIdentifier());
    }

    @Test
    public final void testGetIdentifier() {
	assertNull(structure.getIdentifier());
    }

    @Test
    public final void testSetIdentifier() {
	assertNull(structure.getIdentifier());

	final String identifier = "structure";
	structure.setIdentifier(identifier);
	assertEquals(identifier, structure.getIdentifier());
    }

    @Test
    public final void testGetVisibility() {
	assertEquals(Visibility.DEFAULT, structure.getVisibility());
    }

    @Test
    public final void testSetVisibility() {
	assertEquals(Visibility.DEFAULT, structure.getVisibility());
	structure.setVisibility(Visibility.PUBLIC);
	assertEquals(Visibility.PUBLIC, structure.getVisibility());
    }
}
