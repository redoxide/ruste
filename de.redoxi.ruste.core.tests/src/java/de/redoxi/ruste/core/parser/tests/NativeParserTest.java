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
package de.redoxi.ruste.core.parser.tests;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.parser.NativeParser;

public class NativeParserTest {

    private InputStream sourceInputStream;
    private NativeParser parser;
    private Crate crate;

    @Before
    public void setUp() throws Exception {
	sourceInputStream = getClass().getResourceAsStream("/ast.rs");

	parser = new NativeParser();
	parser.setSource(sourceInputStream);

	crate = new Crate();
	crate.setIdentifier("ast");
    }

    @After
    public void tearDown() throws Exception {
	sourceInputStream.close();
    }

    @Test
    public final void testGetRoot() {
	assertNull(parser.getRoot());
    }

    @Test
    public final void testSetRoot() {
	assertNull(parser.getRoot());
	ASTNode node = new Crate();
	parser.setRoot(node);
	assertSame(node, parser.getRoot());
    }

    @Test
    public final void testParse() {
	parser.parse();
	final ASTNode root = parser.getRoot();

	assertTrue(root instanceof Crate);

	assertEquals(4, ((Crate) root).getItems().size());

	final Crate crate = (Crate) root;

	assertEquals(4, crate.getItems().size());

	final Item item0 = crate.getItems().get(0);
	final Item item1 = crate.getItems().get(1);
	final Item item2 = crate.getItems().get(2);
	final Item item3 = crate.getItems().get(3);

	assertTrue(item0 instanceof Module);
	assertTrue(item1 instanceof Enumeration);
	assertTrue(item2 instanceof Function);
	assertTrue(item3 instanceof Function);

	assertEquals("module", ((Module) item0).getIdentifier());
	assertEquals("Enumeration", ((Enumeration) item1).getIdentifier());
	assertEquals("voidFunction", ((Function) item2).getIdentifier());
	assertEquals("intFunction", ((Function) item3).getIdentifier());

	assertEquals("", ((Function) item2).getReturnType());
	assertEquals("int", ((Function) item3).getReturnType());
    }
}
