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

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Implementation;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Visible;

public class ModuleTest {

    private Module module;

    @Before
    public void setUp() throws Exception {
	module = new Module(null);
    }

    @Test
    public final void testModule() {
	Module parent = new Module(null);
	Module moduleWithParent = new Module(parent);

	assertNull(moduleWithParent.getIdentifier());
	assertEquals(0, moduleWithParent.getStartPos());
	assertEquals(0, moduleWithParent.getEndPos());

	assertSame(parent, moduleWithParent.getItem());
    }

    @Test
    public final void testGetItems() {
	Visible child = new Item(module) {

	};

	assertFalse(module.getItems().isEmpty());
	assertSame(child, module.getItems().get(0));
    }

    @Test
    public final void testAccept() {
	// Need to wrap the flag set in Item#accept(ASTNode.Visitor)
	final PrimitiveWrapper<Boolean> isItemVisited = new PrimitiveWrapper<Boolean>(
		Boolean.FALSE);

	@SuppressWarnings("unused")
	Visible child = new Item(module) {
	    @Override
	    public void accept(ASTNode.Visitor visitor) {
		isItemVisited.setValue(Boolean.TRUE);
	    }
	};

	module.accept(new ASTNode.Visitor() {

	    @Override
	    public void visit(ASTNode node) {
	    }
	});

	assertTrue(isItemVisited.getValue());
    }

    @Test
    public final void testContains() {
	Module child = new Module(module);
	child.setIdentifier("child");

	Implementation impl = new Implementation(child);
	impl.setTrait("Trait");
	impl.setType("Type");

	Function function = new Function(child);
	function.setIdentifier("function");

	Function function2 = new Function(child);
	function2.setIdentifier("function2");

	Function function3 = new Function(module);
	function3.setIdentifier("function3");

	assertTrue(module.contains("child"));
	assertFalse(module.contains("noChild"));

	assertTrue(child.contains("function"));
	assertFalse(module.contains("function"));
	assertTrue(function.contains("function2"));

	assertTrue(child.contains("function3"));
    }

    @Test
    public final void testGet() {
	Module child = new Module(module);
	child.setIdentifier("child");

	Function function = new Function(child);
	function.setIdentifier("function");

	Function function2 = new Function(child);
	function2.setIdentifier("function2");

	assertSame(child, module.get("child"));
	assertNull(module.get("noChild"));

	assertSame(function, child.get("function"));
	assertSame(function, function2.get("function"));
	assertNull(module.get("function"));
    }

    @Test
    public final void testGetEnclosingScope() {
	Module child = new Module(module);
	child.setIdentifier("child");

	assertSame(module, child.getEnclosingScope());
    }

    @Test
    public final void testHasNoBody() {
	assertFalse(module.hasNoBody());
    }

    @Test
    public final void testSetNoBody() {
	assertFalse(module.hasNoBody());
	module.setNoBody(true);
	assertTrue(module.hasNoBody());
    }

    @Test
    public final void testGetSourcePath() {
	assertNull(module.getSourcePath());
    }

    @Test
    public final void testSetSourcePath() {
	assertNull(module.getSourcePath());
	final String sourcePath = "source.rs";

	module.setSourcePath(sourcePath);
	assertEquals(sourcePath, module.getSourcePath());
    }

    class PrimitiveWrapper<T> {

	private T value;

	public PrimitiveWrapper(T value) {
	    this.value = value;
	}

	public void setValue(T value) {
	    this.value = value;
	}

	public T getValue() {
	    return value;
	}
    }
}
