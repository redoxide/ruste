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
package de.redoxi.ruste.core.api.xml.tests;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.api.xml.ASTBuilder;
import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;

public class ASTBuilderTest {

    private InputStream xmlInputStream;
    private ASTBuilder astBuilder;

    @Before
    public void setUp() throws Exception {
	xmlInputStream = getClass().getResourceAsStream("/testAst.xml");
    }

    @After
    public void tearDown() throws Exception {
	xmlInputStream.close();
    }

    @Test
    public final void test() {
	astBuilder = new ASTBuilder(xmlInputStream);
	final ASTNode node = astBuilder.parse();

	assertNotNull(node);
	assertTrue(node instanceof Crate);

	final Crate crate = (Crate) node;

	assertEquals(3, crate.getItems().size());

	final Item item0 = crate.getItems().get(0);
	final Item item1 = crate.getItems().get(1);
	final Item item2 = crate.getItems().get(2);

	assertTrue(item0 instanceof Module);
	assertTrue(item1 instanceof Function);
	assertTrue(item2 instanceof Function);

	assertEquals("module", ((Module) item0).getIdentifier());
	assertEquals("voidFunction", ((Function) item1).getIdentifier());
	assertEquals("intFunction", ((Function) item2).getIdentifier());

	assertEquals("", ((Function) item1).getReturnType());
	assertEquals("int", ((Function) item2).getReturnType());

	// TODO Check the lines and positions on the nodes
    }
}
