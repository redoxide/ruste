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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Module;

public class ASTNodeTest {

    private ASTNode astNode;

    @Before
    public void setUp() throws Exception {
	// Create a concrete instance of this class
	astNode = new ASTNode(null) {
	};
    }

    @Test
    public final void testGetStartLine() {
	astNode.setStartPos(1);
	assertEquals(1, astNode.getStartPos());
    }

    @Test
    public final void testSetStartLine() {
	assertEquals(0, astNode.getStartLine());
	astNode.setStartLine(2);
	assertEquals(2, astNode.getStartLine());
    }

    @Test
    public final void testGetEndLine() {
	astNode.setEndLine(1);
	assertEquals(1, astNode.getEndLine());
    }

    @Test
    public final void testSetEndLine() {
	assertEquals(0, astNode.getEndLine());
	astNode.setEndLine(2);
	assertEquals(2, astNode.getEndLine());
    }

    @Test
    public final void testGetStartPos() {
	astNode.setStartPos(3);
	assertEquals(3, astNode.getStartPos());
    }

    @Test
    public final void testSetStartPos() {
	assertEquals(0, astNode.getStartPos());
	astNode.setStartPos(4);
	assertEquals(4, astNode.getStartPos());
    }

    @Test
    public final void testGetEndPos() {
	astNode.setEndPos(5);
	assertEquals(5, astNode.getEndPos());
    }

    @Test
    public final void testSetEndPos() {
	assertEquals(0, astNode.getEndPos());
	astNode.setEndPos(6);
	assertEquals(6, astNode.getEndPos());
    }

    @Test
    public final void testGetScope() {
	assertNull(astNode.getScope());
    }

    @Test
    public final void testSetScope() {
	Module scope = new Module(null);

	astNode.setScope(scope);
	assertSame(scope, astNode.getScope());
    }

    @Test
    public final void testGetResource() {
	assertNull(astNode.getResource());
    }

    @Test
    public final void testAccept() {
	final List<ASTNode> visitedNodes = new ArrayList<ASTNode>();

	ASTNode.Visitor visitor = new ASTNode.Visitor() {

	    @Override
	    public void visit(ASTNode node) {
		visitedNodes.add(node);
	    }
	};

	astNode.accept(visitor);

	assertFalse(visitedNodes.isEmpty());
	assertSame(astNode, visitedNodes.get(0));
    }

    @Test
    public final void testAcceptWithNullVisitor()
	    throws IllegalArgumentException {
	Exception ex = null;

	try {
	    astNode.accept(null);
	} catch (Exception e) {
	    ex = e;
	}

	assertTrue(ex instanceof IllegalArgumentException);
    }
}
