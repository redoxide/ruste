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
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.EnumVariant;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Module;

public class EnumVariantTest {

    private Module module;
    private Enumeration enumeration;
    private EnumVariant enumVariant;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	enumeration = new Enumeration(module);
	enumVariant = new EnumVariant(enumeration);
    }

    @Test
    public final void testGetIdentifier() {
	assertNull(enumVariant.getIdentifier());
	enumVariant.setIdentifier("Identifier");
	assertEquals("Identifier", enumVariant.getIdentifier());
    }

    @Test
    public final void testSetIdentifier() {
	enumVariant.setIdentifier("Identifier");
	assertEquals("Identifier", enumVariant.getIdentifier());
    }

    @Test
    public final void testEnumVariant() {
	EnumVariant enumVariantForTest = new EnumVariant(enumeration);

	assertNull(enumVariantForTest.getIdentifier());
	assertSame(enumeration, enumVariantForTest.getEnumeration());
    }

    @Test
    public final void testGetEnumeration() {
	assertSame(enumeration, enumVariant.getEnumeration());
    }

}
