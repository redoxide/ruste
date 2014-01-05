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

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.GenericParam;
import de.redoxi.ruste.core.model.ast.Implementation;
import de.redoxi.ruste.core.model.ast.ImplementationMethod;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Visibility;

public class ImplementationMethodTest {

    private Module module;
    private Implementation implementation;
    private ImplementationMethod implementationMethod;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
	implementation = new Implementation(module);
	implementationMethod = new ImplementationMethod(implementation);
    }

    @Test
    public final void testImplementationMethod() {
	ImplementationMethod methodForTest = new ImplementationMethod(
		implementation);

	assertNull(methodForTest.getIdentifier());
	assertNotNull(methodForTest.getArgumentNames());
	assertNotNull(methodForTest.getArgumentTypes());
	assertNotNull(methodForTest.getGenericParameters());
	assertNull(methodForTest.getReturnType());
	assertTrue(methodForTest.getArgumentNames().isEmpty());
	assertTrue(methodForTest.getArgumentTypes().isEmpty());
	assertTrue(methodForTest.getGenericParameters().isEmpty());
    }

    @Test
    public final void testGetGenericTypeParameters() {
	List<GenericParam> genericTypeParams = implementationMethod
		.getGenericParameters();

	assertNotNull(genericTypeParams);
	assertTrue(genericTypeParams.isEmpty());
	assertSame(genericTypeParams,
		implementationMethod.getGenericParameters());
    }

    @Test
    public final void testGetArgumentNames() {
	List<String> argNames = implementationMethod.getArgumentNames();

	assertNotNull(argNames);
	assertTrue(argNames.isEmpty());
	assertSame(argNames, implementationMethod.getArgumentNames());
    }

    @Test
    public final void testGetArgumentTypes() {
	List<String> argTypes = implementationMethod.getArgumentTypes();

	assertNotNull(argTypes);
	assertTrue(argTypes.isEmpty());
	assertSame(argTypes, implementationMethod.getArgumentTypes());
    }

    @Test
    public final void testGetReturnType() {
	implementationMethod.setReturnType("float");
	assertEquals("float", implementationMethod.getReturnType());
    }

    @Test
    public final void testSetReturnType() {
	assertNull(implementationMethod.getReturnType());

	implementationMethod.setReturnType("float");
	assertEquals("float", implementationMethod.getReturnType());
    }

    @Test
    public final void testGetImplementation() {
	assertSame(implementation, implementationMethod.getImplementation());
    }

    @Test
    public final void testToStringWithReturnType() {
	implementationMethod.setIdentifier("method");
	implementationMethod.getArgumentNames().add("x");
	implementationMethod.getArgumentTypes().add("int");
	implementationMethod.getArgumentNames().add("y");
	implementationMethod.getArgumentTypes().add("float");
	implementationMethod.setReturnType("float");

	assertEquals("method(x : int, y : float) -> float",
		implementationMethod.toString());
    }

    @Test
    public final void testToStringWithoutReturnType() {
	implementationMethod.setIdentifier("method");
	implementationMethod.getArgumentNames().add("x");
	implementationMethod.getArgumentTypes().add("int");
	implementationMethod.getArgumentNames().add("y");
	implementationMethod.getArgumentTypes().add("float");

	assertEquals("method(x : int, y : float)",
		implementationMethod.toString());
    }

    @Test
    public void testGetVisibility() {
	assertSame(Visibility.DEFAULT, implementationMethod.getVisibility());
    }

    @Test
    public void testSetVisibility() {
	assertSame(Visibility.DEFAULT, implementationMethod.getVisibility());
	implementationMethod.setVisibility(Visibility.PUBLIC);
	assertSame(Visibility.PUBLIC, implementationMethod.getVisibility());
    }
}
