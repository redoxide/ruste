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

package de.redoxi.ruste.core.model;

import de.redoxi.ruste.core.model.ast.ASTNode;
import de.redoxi.ruste.core.model.ast.Crate;
import de.redoxi.ruste.core.model.ast.EnumVariant;
import de.redoxi.ruste.core.model.ast.Enumeration;
import de.redoxi.ruste.core.model.ast.Field;
import de.redoxi.ruste.core.model.ast.Function;
import de.redoxi.ruste.core.model.ast.Generic;
import de.redoxi.ruste.core.model.ast.GenericParam;
import de.redoxi.ruste.core.model.ast.Implementation;
import de.redoxi.ruste.core.model.ast.ImplementationMethod;
import de.redoxi.ruste.core.model.ast.Item;
import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.NamedField;
import de.redoxi.ruste.core.model.ast.Structure;
import de.redoxi.ruste.core.model.ast.Trait;
import de.redoxi.ruste.core.model.ast.TraitMethod;
import de.redoxi.ruste.core.model.ast.Type;

/**
 * Constructs an abstract syntax tree model of a complete or partial Rust crate
 * 
 * @author Hayden Smith
 * @since 0.0.2
 */
public class ASTBuilderListener {

    private ASTNode root;
    private ASTNode current;

    public ASTNode getRoot() {
	return root;
    }

    private void setCurrent(ASTNode current) {
	this.current = current;

	if (this.root == null) {
	    this.root = current;
	}
    }

    /**
     * Begin a crate declaration
     * 
     * @param identifier
     * @param startCharPos
     * @param endCharPos
     */
    public void startCrate(String identifier, int startLine, int startCharPos,
	    int endLine, int endCharPos) {
	Crate crate = new Crate();
	crate.setIdentifier(identifier);

	crate.setStartLine(startLine);
	crate.setEndLine(endLine);
	crate.setStartPos(startCharPos);
	crate.setEndPos(endCharPos);

	setCurrent(crate);
    }

    /**
     * Begin a module declaration
     * 
     * @param identifier
     * @param startCharPos
     * @param endCharPos
     */
    public void startModule(String identifier, int startLine, int startCharPos,
	    int endLine, int endCharPos) {
	Module module = new Module((Item) current);
	module.setIdentifier(identifier);

	module.setStartLine(startLine);
	module.setEndLine(endLine);
	module.setStartPos(startCharPos);
	module.setEndPos(endCharPos);

	setCurrent(module);
    }

    /**
     * Begin a trait declaration
     * 
     * @param identifier
     * @param startCharPos
     * @param endCharPos
     */
    public void startTrait(String identifier, int startLine, int startCharPos,
	    int endLine, int endCharPos) {
	Trait trait = new Trait((Module) current);
	trait.setIdentifier(identifier);

	trait.setStartLine(startLine);
	trait.setEndLine(endLine);
	trait.setStartPos(startCharPos);
	trait.setEndPos(endCharPos);

	setCurrent(trait);
    }

    /**
     * Begin a trait method declaration
     * 
     * @param identifier
     * @param returnType
     * @param startCharPos
     * @param endCharPos
     */
    public void startTraitMethod(String identifier, String returnType,
	    int startLine, int startCharPos, int endLine, int endCharPos) {
	TraitMethod traitMethod = new TraitMethod((Trait) current);
	traitMethod.setIdentifier(identifier);
	traitMethod.setReturnType(returnType);

	traitMethod.setStartLine(startLine);
	traitMethod.setEndLine(endLine);
	traitMethod.setStartPos(startCharPos);
	traitMethod.setEndPos(endCharPos);

	setCurrent(traitMethod);
    }

    /**
     * Begin a function declaration
     * 
     * @param identifier
     * @param returnType
     * @param startCharPos
     * @param endCharPos
     */
    public void startFunction(String identifier, String returnType,
	    int startLine, int startCharPos, int endLine, int endCharPos) {
	Function function = new Function((Module) current);
	function.setIdentifier(identifier);
	function.setReturnType(returnType);

	function.setStartLine(startLine);
	function.setEndLine(endLine);
	function.setStartPos(startCharPos);
	function.setEndPos(endCharPos);

	setCurrent(function);
    }

    /**
     * Begin an enumeration declaration
     * 
     * @param identifier
     * @param startCharPos
     * @param endCharPos
     */
    public void startEnumeration(String identifier, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	Enumeration enumeration = new Enumeration((Module) current);
	enumeration.setIdentifier(identifier);

	enumeration.setStartLine(startLine);
	enumeration.setEndLine(endLine);
	enumeration.setStartPos(startCharPos);
	enumeration.setEndPos(endCharPos);

	setCurrent(enumeration);
    }

    /**
     * Begin an enumeration declaration
     * 
     * @param identifier
     * @param startCharPos
     * @param endCharPos
     */
    public void startEnumerationVariant(String identifier, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	EnumVariant variant = new EnumVariant((Enumeration) current);
	variant.setIdentifier(identifier);

	variant.setStartLine(startLine);
	variant.setEndLine(endLine);
	variant.setStartPos(startCharPos);
	variant.setEndPos(endCharPos);

	setCurrent(variant);
    }

    /**
     * Begin an argument declaration
     * 
     * @param name
     * @param type
     * @param startCharPos
     * @param endCharPos
     */
    /*
     * public void startPatternArg(String pattern, String type, int
     * startCharPos, int endLine, int endCharPos) {
     * 
     * }
     */

    /**
     * Begin an implementation
     * 
     * @param identifier
     * @param trait
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startImplementation(String type, String trait, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	Implementation implementation = new Implementation((Module) current);
	implementation.setType(type);
	implementation.setTrait(trait);

	implementation.setStartLine(startLine);
	implementation.setStartPos(startCharPos);
	implementation.setEndLine(endLine);
	implementation.setEndPos(endCharPos);

	setCurrent(implementation);
    }

    /**
     * Begin an implementation
     * 
     * @param identifier
     * @param trait
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startImplementationMethod(String identifier, String returnType,
	    int startLine, int startCharPos, int endLine, int endCharPos) {
	ImplementationMethod implementationMethod = new ImplementationMethod(
		(Implementation) current);
	implementationMethod.setIdentifier(identifier);
	implementationMethod.setReturnType(returnType);

	implementationMethod.setStartLine(startLine);
	implementationMethod.setStartPos(startCharPos);
	implementationMethod.setEndLine(endLine);
	implementationMethod.setEndPos(endCharPos);

	setCurrent(implementationMethod);
    }

    /**
     * Begin a structure
     * 
     * @param identifier
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startStructure(String identifier, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	Structure structure = new Structure((Module) current);
	structure.setIdentifier(identifier);

	structure.setStartLine(startLine);
	structure.setStartPos(startCharPos);
	structure.setEndLine(endLine);
	structure.setEndPos(endCharPos);

	setCurrent(structure);
    }
    
    /**
     * Start a structure field
     * 
     * @param identifier
     * @param type
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startField(String identifier, String type, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	Field field = null;
	
	if (identifier == null || identifier.isEmpty()) {
	    field = new Field((Structure) current);
	} else {
	    NamedField namedField = new NamedField((Structure) current);
	    namedField.setIdentifier(identifier);
	    field = namedField;
	}
	
	field.setType(type);
	
	field.setStartLine(startLine);
	field.setStartPos(startCharPos);
	field.setEndLine(endLine);
	field.setEndPos(endCharPos);
	
	setCurrent(field);
    }

    /**
     * Start a generic parameter
     * 
     * @param identifier
     * @param type
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startGenericParam(String identifier, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	GenericParam param = new GenericParam((Generic) current);
	
	param.setStartLine(startLine);
	param.setStartPos(startCharPos);
	param.setEndLine(endLine);
	param.setEndPos(endCharPos);
	
	setCurrent(param);
    }
    
    /**
     * Start a generic parameter bound
     * 
     * @param identifier
     * @param type
     * @param startLine
     * @param startCharPos
     * @param endLine
     * @param endCharPos
     */
    public void startParamBound(String trait, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	GenericParam param = (GenericParam) current;
	
	param.getTraits().add(trait);
	
	/*param.setStartLine(startLine);
	param.setStartPos(startCharPos);
	param.setEndLine(endLine);
	param.setEndPos(endCharPos);*/
	
	setCurrent(param);
    }
    
    public void startType(String identifier, String definition, int startLine,
	    int startCharPos, int endLine, int endCharPos) {
	Type type = new Type((Module) current);
	
	type.setIdentifier(identifier);
	type.setType(definition);
	
	type.setStartLine(startLine);
	type.setStartPos(startCharPos);
	type.setEndLine(endLine);
	type.setEndPos(endCharPos);
	
	setCurrent(type);
    }
    
    /**
     * Indicate the end of the current ASTNode
     */
    public void end() {
	current = current.getParent();
    }
}