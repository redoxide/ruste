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
package de.redoxi.ruste.core.model.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ASTBuilderListener;
import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.EnumVariant;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Identifiable;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.Trait;
import de.redoxi.ruste.core.model.ast.TraitMethod;

public class ASTBuilderListenerTest {

    private ASTBuilderListener noRootListener;
    private ASTBuilderListener withRootListener;

    final int startLine = 1;
    final int startCharPos = 2;
    final int endLine = 3;
    final int endCharPos = 4;

    @Before
    public void setUp() throws Exception {
	noRootListener = new ASTBuilderListener();
	withRootListener = new ASTBuilderListener();

	withRootListener.startCrate("crate", startLine, startCharPos, endLine,
		endCharPos);
	withRootListener.startModule("module0", startLine, startCharPos,
		endLine, endCharPos);
    }

    @Test
    public final void testGetRoot() {
	assertNull(noRootListener.getRoot());
    }

    private <T extends ASTNode> void assertExpectedNode(
	    final Class<T> astNodeClass, final ASTNode astNode,
	    final String identifier, final int startLine,
	    final int startCharPos, final int endLine, final int endCharPos) {
	assertExpectedNode(astNodeClass, astNode, startLine, startCharPos,
		endLine, endCharPos);

	assertTrue(astNode instanceof Identifiable);

	final Identifiable identifiable = (Identifiable) astNode;

	assertEquals(identifier, identifiable.getIdentifier());
    }

    private <T extends ASTNode> void assertExpectedNode(
	    final Class<T> astNodeClass, final ASTNode astNode,
	    final int startLine, final int startCharPos, final int endLine,
	    final int endCharPos) {
	assertTrue(astNodeClass.isInstance(astNode));

	@SuppressWarnings("unchecked")
	T nodeWithType = (T) astNode;

	assertEquals(startLine, nodeWithType.getStartLine());
	assertEquals(startCharPos, nodeWithType.getStartPos());
	assertEquals(endLine, nodeWithType.getEndLine());
	assertEquals(endCharPos, nodeWithType.getEndPos());
    }

    @Test
    public final void testStartCrate() {
	assertNull(noRootListener.getRoot());

	final String identifier = "crate";

	noRootListener.startCrate(identifier, startLine, startCharPos, endLine,
		endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertExpectedNode(Crate.class, astNode, identifier, startLine,
		startCharPos, endLine, endCharPos);
    }

    @Test
    public final void testStartModule() {
	assertNull(noRootListener.getRoot());

	final String identifier = "module";

	noRootListener.startModule(identifier, startLine, startCharPos,
		endLine, endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertExpectedNode(Module.class, astNode, identifier, startLine,
		startCharPos, endLine, endCharPos);
    }

    @Test
    public final void testStartTrait() {
	assertNull(noRootListener.getRoot());

	final String identifier = "crate";

	noRootListener.startTrait(identifier, startLine, startCharPos, endLine,
		endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertExpectedNode(Trait.class, astNode, identifier, startLine,
		startCharPos, endLine, endCharPos);
    }

    @Test
    public final void testStartTraitMethod() {
	assertNull(noRootListener.getRoot());

	final String identifier = "traitMethod";
	final String returnType = "int";

	// Need a Trait to attach the TraitMethod to
	noRootListener.startTrait("trait", startLine, startCharPos, endLine,
		endCharPos);

	noRootListener.startTraitMethod(identifier, returnType, startLine,
		startCharPos, endLine, endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertTrue(astNode instanceof Trait);

	final TraitMethod traitMethod = ((Trait) astNode).getMethods().get(0);

	assertExpectedNode(TraitMethod.class, traitMethod, identifier,
		startLine, startCharPos, endLine, endCharPos);

	assertEquals(returnType, traitMethod.getReturnType());
    }

    @Test
    public final void testStartFunction() {
	assertNull(noRootListener.getRoot());

	final String identifier = "function";
	final String returnType = "int";

	noRootListener.startFunction(identifier, returnType, startLine,
		startCharPos, endLine, endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertExpectedNode(Function.class, astNode, identifier, startLine,
		startCharPos, endLine, endCharPos);

	assertEquals(returnType, ((Function) astNode).getReturnType());
    }

    @Test
    public final void testStartEnumeration() {
	assertNull(noRootListener.getRoot());

	final String identifier = "enumeration";

	noRootListener.startEnumeration(identifier, startLine, startCharPos,
		endLine, endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertExpectedNode(Enumeration.class, astNode, identifier, startLine,
		startCharPos, endLine, endCharPos);
    }

    @Test
    public final void testStartEnumerationVariant() {
	assertNull(noRootListener.getRoot());

	final String identifier = "enumVariant";

	// Need an enumeration to attach the variant to
	noRootListener.startEnumeration("enumeration", startLine, startCharPos,
		endLine, endCharPos);

	noRootListener.startEnumerationVariant(identifier, startLine,
		startCharPos, endLine, endCharPos);
	final ASTNode astNode = noRootListener.getRoot();

	assertTrue(astNode instanceof Enumeration);

	assertExpectedNode(EnumVariant.class, ((Enumeration) astNode)
		.getVariants().get(0), identifier, startLine, startCharPos,
		endLine, endCharPos);
    }

    @Test
    public final void testEnd() {
	withRootListener.end();

	// In order to test ASTBuilder#end, we need to create a new Item and
	// check that it is "module0"'s sibling
	withRootListener.startModule("module1", startLine, startCharPos,
		endLine, endCharPos);

	final Crate crate = (Crate) withRootListener.getRoot();

	assertEquals(2, crate.getItems().size());

	final Item item0 = crate.getItems().get(0);
	final Item item1 = crate.getItems().get(1);

	assertTrue(item0 instanceof Module);
	assertTrue(item1 instanceof Module);

	assertEquals("module0", ((Module) item0).getIdentifier());
	assertEquals("module1", ((Module) item1).getIdentifier());
    }
}
