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
import de.redoxi.ruste.core.model.ast.Implementation;
import de.redoxi.ruste.core.model.ast.ImplementationMethod;
import de.redoxi.ruste.core.model.ast.Module;

public class ImplementationTest {

    private Module module;
    private Implementation implementation;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	implementation = new Implementation(module);
    }

    @Test
    public final void testImplementation() {
	Implementation implForTest = new Implementation(module);

	assertNull(implForTest.getTrait());
	assertNull(implForTest.getType());
	assertNotNull(implForTest.getMethods());
	assertTrue(implForTest.getMethods().isEmpty());
    }

    @Test
    public final void testGetTrait() {
	implementation.setTrait("Trait");
	assertEquals("Trait", implementation.getTrait());
    }

    @Test
    public final void testGetType() {
	implementation.setType("Type");
	assertEquals("Type", implementation.getType());
    }

    @Test
    public final void testSetTrait() {
	assertNull(implementation.getTrait());

	implementation.setTrait("Trait");

	assertEquals("Trait", implementation.getTrait());
    }

    @Test
    public final void testSetType() {
	assertNull(implementation.getType());

	implementation.setType("Type");

	assertEquals("Type", implementation.getType());
    }

    @Test
    public final void testGetMethods() {
	List<ImplementationMethod> methods = implementation.getMethods();

	assertNotNull(methods);
	assertTrue(methods.isEmpty());
	assertSame(methods, implementation.getMethods());
    }

    @Test
    public final void testAccept() {
	ImplementationMethod method = new ImplementationMethod(implementation);

	final List<ASTNode> visitedNodes = new ArrayList<ASTNode>();

	ASTNode.Visitor visitor = new ASTNode.Visitor() {

	    @Override
	    public void visit(ASTNode node) {
		visitedNodes.add(node);
	    }
	};

	implementation.accept(visitor);

	assertFalse(visitedNodes.isEmpty());
	assertEquals(2, visitedNodes.size());
	assertSame(implementation, visitedNodes.get(0));
	assertSame(method, visitedNodes.get(1));
    }
}
