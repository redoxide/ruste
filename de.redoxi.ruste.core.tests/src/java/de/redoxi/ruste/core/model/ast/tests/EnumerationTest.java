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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.EnumVariant;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Module;

public class EnumerationTest {

    private Module module;
    private Enumeration enumeration;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	enumeration = new Enumeration(module);
    }

    @Test
    public final void testEnumeration() {
	Enumeration enumForTest = new Enumeration(module);

	assertNull(enumForTest.getIdentifier());
	assertSame(module, enumForTest.getItem());
    }

    @Test
    public final void testGetVariants() {
	assertNotNull(enumeration.getVariants());
	assertTrue(enumeration.getVariants().isEmpty());
    }

    @Test
    public final void testAccept() {
	EnumVariant variant = new EnumVariant(enumeration);

	final List<ASTNode> visitedNodes = new ArrayList<ASTNode>();

	ASTNode.Visitor visitor = new ASTNode.Visitor() {

	    @Override
	    public void visit(ASTNode node) {
		visitedNodes.add(node);
	    }
	};

	enumeration.accept(visitor);

	assertFalse(visitedNodes.isEmpty());
	assertEquals(2, visitedNodes.size());
	assertSame(enumeration, visitedNodes.get(0));
	assertSame(variant, visitedNodes.get(1));
    }

    @Test
    public final void testSetIdentifier() {
	assertNull(enumeration.getIdentifier());
	String identifier = "enumeration";
	enumeration.setIdentifier(identifier);
	assertEquals(identifier, enumeration.getIdentifier());
    }
}
