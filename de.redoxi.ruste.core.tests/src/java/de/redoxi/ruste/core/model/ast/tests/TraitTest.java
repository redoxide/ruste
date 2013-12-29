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
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Trait;
import de.redoxi.ruste.core.model.ast.TraitMethod;
import de.redoxi.ruste.core.model.ast.Visibility;

public class TraitTest {

    private Module module;
    private Trait trait;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	trait = new Trait(module);
    }

    @Test
    public final void testTrait() {
	Trait traitForTest = new Trait(module);

	assertNull(traitForTest.getIdentifier());
	assertNotNull(traitForTest.getMethods());
	assertTrue(traitForTest.getMethods().isEmpty());
    }

    @Test
    public final void testGetMethods() {
	List<TraitMethod> methods = trait.getMethods();

	assertNotNull(methods);
	assertTrue(methods.isEmpty());
	assertSame(methods, trait.getMethods());
    }

    @Test
    public final void testAccept() {
	TraitMethod method = new TraitMethod(trait);

	final List<ASTNode> visitedNodes = new ArrayList<ASTNode>();

	ASTNode.Visitor visitor = new ASTNode.Visitor() {

	    @Override
	    public void visit(ASTNode node) {
		visitedNodes.add(node);
	    }
	};

	trait.accept(visitor);

	assertFalse(visitedNodes.isEmpty());
	assertEquals(2, visitedNodes.size());
	assertSame(trait, visitedNodes.get(0));
	assertSame(method, visitedNodes.get(1));
    }

    @Test
    public final void testGetVisibility() {
	assertEquals(Visibility.DEFAULT, trait.getVisibility());
    }

    @Test
    public final void testSetVisibility() {
	assertEquals(Visibility.DEFAULT, trait.getVisibility());
	trait.setVisibility(Visibility.PUBLIC);
	assertEquals(Visibility.PUBLIC, trait.getVisibility());
    }

    @Test
    public final void testSetIdentifier() {
	assertNull(trait.getIdentifier());
	final String identifier = "trait";
	trait.setIdentifier(identifier);
	assertEquals(identifier, trait.getIdentifier());
    }

    @Test
    public final void testGetIdentifier() {
	assertNull(trait.getIdentifier());
    }
}
