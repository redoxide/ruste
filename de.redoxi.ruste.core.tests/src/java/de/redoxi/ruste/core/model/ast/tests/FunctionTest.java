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

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.NamedArg;

public class FunctionTest {

    private Module module;
    private Function function;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	function = new Function(module);
    }

    @Test
    public final void testToStringWithReturnType() {
	function.setIdentifier("function");

	NamedArg x = new NamedArg(function);
	x.setIdentifier("x");
	x.setType("int");

	NamedArg y = new NamedArg(function);
	y.setIdentifier("y");
	y.setType("float");

	function.getArgs().add(x);
	function.getArgs().add(y);

	function.setReturnType("float");

	assertEquals("function(x : int, y : float) -> float",
		function.toString());
    }

    @Test
    public final void testToStringWithoutReturnType() {
	function.setIdentifier("function");

	NamedArg x = new NamedArg(function);
	x.setIdentifier("x");
	x.setType("int");

	NamedArg y = new NamedArg(function);
	y.setIdentifier("y");
	y.setType("float");

	function.getArgs().add(x);
	function.getArgs().add(y);

	assertEquals("function(x : int, y : float)", function.toString());
    }

    @Test
    public final void testFunction() {
	Function fnForTest = new Function(module);

	assertNull(fnForTest.getIdentifier());
	assertNull(fnForTest.getReturnType());
	assertNotNull(fnForTest.getArgs());

	assertNotNull(fnForTest.getGenericTypeParameters());
	// TODO Generic type traits
	assertTrue(fnForTest.getArgs().isEmpty());

	assertTrue(fnForTest.getGenericTypeParameters().isEmpty());
    }

    @Test
    public final void testGetGenericTypeParameters() {
	assertNotNull(function.getGenericTypeParameters());
	assertTrue(function.getGenericTypeParameters().isEmpty());

	function.getGenericTypeParameters().add("Structure");

	assertNotNull(function.getGenericTypeParameters());
	assertFalse(function.getGenericTypeParameters().isEmpty());
	assertEquals("Structure", function.getGenericTypeParameters().get(0));
    }

    @Test
    public final void testGetArgumentNames() {
	assertNotNull(function.getArgs());
	assertTrue(function.getArgs().isEmpty());

	NamedArg x = new NamedArg(function);
	x.setIdentifier("x");
	x.setType("int");

	function.getArgs().add(x);

	assertNotNull(function.getArgs());
	assertFalse(function.getArgs().isEmpty());
	assertEquals(x, function.getArgs().get(0));
    }

    @Test
    public final void testGetReturnType() {
	function.setReturnType("float");
	assertEquals("float", function.getReturnType());
    }

    @Test
    public final void testSetReturnType() {
	assertNull(function.getReturnType());

	function.setReturnType("float");

	assertEquals("float", function.getReturnType());
    }

    @Test
    public final void testGetBodyStartLine() {
	assertEquals(0, function.getBodyStartLine());
    }

    @Test
    public final void testGetBodyStartPos() {
	assertEquals(0, function.getBodyStartPos());
    }

    @Test
    public final void testGetBodyEndLine() {
	assertEquals(0, function.getBodyEndLine());
    }

    @Test
    public final void testGetBodyEndPos() {
	assertEquals(0, function.getBodyEndPos());
    }

    @Test
    public final void testSetBodyStartLine() {
	function.setBodyStartLine(1);
	assertEquals(1, function.getBodyStartLine());
    }

    @Test
    public final void testSetBodyStartPos() {
	function.setBodyStartPos(1);
	assertEquals(1, function.getBodyStartPos());
    }

    @Test
    public final void testSetBodyEndLine() {
	function.setBodyEndLine(1);
	assertEquals(1, function.getBodyEndLine());
    }

    @Test
    public final void testSetBodyEndPos() {
	function.setBodyEndPos(1);
	assertEquals(1, function.getBodyEndPos());
    }

    @Test
    public final void testGet() {
	Function siblingFunction = new Function(module);
	siblingFunction.setIdentifier("siblingFunction");

	Module childModule = new Module(module);

	Function notSiblingFunction = new Function(childModule);
	notSiblingFunction.setIdentifier("notSiblingFunction");

	assertSame(siblingFunction, function.get("siblingFunction"));
	assertNull(function.get("notSiblingFunction"));
	// TODO local variable declarations
    }

    @Test
    public final void testContains() {
	Function siblingFunction = new Function(module);
	siblingFunction.setIdentifier("siblingFunction");

	Module childModule = new Module(module);

	Function notSiblingFunction = new Function(childModule);
	notSiblingFunction.setIdentifier("notSiblingFunction");

	Function orphanFunction = new Function(null);

	assertTrue(function.contains("siblingFunction"));
	assertFalse(function.contains("notSiblingFunction"));
	assertFalse(orphanFunction.contains("siblingFunction"));
    }

    @Test
    public final void testGetEnclosingScope() {
	assertSame(module, function.getEnclosingScope());
    }
}
