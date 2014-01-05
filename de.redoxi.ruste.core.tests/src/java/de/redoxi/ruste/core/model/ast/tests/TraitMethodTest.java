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

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Arg;
import de.redoxi.ruste.core.model.ast.GenericParam;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.NamedArg;
import de.redoxi.ruste.core.model.ast.Trait;
import de.redoxi.ruste.core.model.ast.TraitMethod;
import de.redoxi.ruste.core.model.ast.Visibility;

public class TraitMethodTest {

    private Module module;
    private Trait trait;
    private TraitMethod traitMethod;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	trait = new Trait(module);
	traitMethod = new TraitMethod(trait);
    }

    @Test
    public final void testTraitMethod() {
	TraitMethod methodForTest = new TraitMethod(trait);

	assertNull(methodForTest.getIdentifier());

	assertNotNull(methodForTest.getGenericParameters());
	assertNotNull(methodForTest.getArgs());

	assertNull(methodForTest.getReturnType());

	assertTrue(methodForTest.getGenericParameters().isEmpty());
	assertTrue(methodForTest.getArgs().isEmpty());

	assertFalse(trait.getMethods().isEmpty());
	assertSame(methodForTest, trait.getMethods().get(1));
    }

    @Test
    public final void testGetGenericTypeParameters() {
	List<GenericParam> genericTypeParams = traitMethod.getGenericParameters();

	assertNotNull(genericTypeParams);
	assertTrue(genericTypeParams.isEmpty());
	assertSame(genericTypeParams, traitMethod.getGenericParameters());
    }

    @Test
    public final void testGetArgs() {
	List<Arg> args = traitMethod.getArgs();

	assertNotNull(args);
	assertTrue(args.isEmpty());
	assertSame(args, traitMethod.getArgs());
    }

    @Test
    public final void testGetReturnType() {
	traitMethod.setReturnType("float");
	assertEquals("float", traitMethod.getReturnType());
    }

    @Test
    public final void testSetReturnType() {
	assertNull(traitMethod.getReturnType());

	traitMethod.setReturnType("float");
	assertEquals("float", traitMethod.getReturnType());
    }

    @Test
    public final void testGetTrait() {
	assertSame(trait, traitMethod.getTrait());
    }

    @Test
    public final void testToStringWithReturnType() {
	traitMethod.setIdentifier("method");

	NamedArg x = new NamedArg(traitMethod);
	x.setIdentifier("x");
	x.setType("int");

	NamedArg y = new NamedArg(traitMethod);
	y.setIdentifier("y");
	y.setType("float");

	traitMethod.getArgs().add(x);
	traitMethod.getArgs().add(y);
	traitMethod.setReturnType("float");

	assertEquals("method(x : int, y : float) -> float",
		traitMethod.toString());
    }

    @Test
    public final void testToStringWithoutReturnType() {
	traitMethod.setIdentifier("method");

	NamedArg x = new NamedArg(traitMethod);
	x.setIdentifier("x");
	x.setType("int");

	NamedArg y = new NamedArg(traitMethod);
	y.setIdentifier("y");
	y.setType("float");

	traitMethod.getArgs().add(x);
	traitMethod.getArgs().add(y);

	assertEquals("method(x : int, y : float)", traitMethod.toString());
    }

    @Test
    public final void testGetVisibility() {
	assertEquals(Visibility.DEFAULT, traitMethod.getVisibility());
    }

    @Test
    public final void testSetVisibility() {
	assertEquals(Visibility.DEFAULT, traitMethod.getVisibility());
	traitMethod.setVisibility(Visibility.PUBLIC);
	assertEquals(Visibility.PUBLIC, traitMethod.getVisibility());
    }
}
