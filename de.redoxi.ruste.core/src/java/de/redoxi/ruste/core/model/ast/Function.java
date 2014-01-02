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

package de.redoxi.ruste.core.model.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a function within a {@link Module}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#functions
 */
public class Function extends Item implements Identifiable, Scope, Visible {

    private String identifier;
    private List<String> genericTypeParameters = new ArrayList<String>();
    // TODO Generic type parameter bounds

    private List<NamedArg> args = new ArrayList<NamedArg>();

    private String returnType;
    private int bodyStartLine, bodyStartPos, bodyEndLine, bodyEndPos;

    public Function(Module module) {
	super(module);
    }

    public List<String> getGenericTypeParameters() {
	return genericTypeParameters;
    }

    public String getReturnType() {
	return returnType;
    }

    public void setReturnType(String returnType) {
	this.returnType = returnType;
    }

    @Override
    public String toString() {
	StringBuilder label = new StringBuilder();
	label.append(identifier);

	// TODO Generic parameters

	label.append('(');

	for (int i = 0; i < args.size(); ++i) {
	    final NamedArg arg = args.get(i);

	    label.append(arg.getIdentifier());
	    label.append(" : ");
	    label.append(arg.getType());

	    if (i < args.size() - 1) {
		label.append(", ");
	    }
	}

	label.append(')');

	if (returnType != null) {
	    label.append(" -> ");
	    label.append(returnType);
	}

	return label.toString();
    }

    public String getIdentifier() {
	return identifier;
    }

    public void setIdentifier(String identifier) {
	this.identifier = identifier;
    }

    @Override
    public boolean contains(String identifier) {
	// TODO Local variable declarations
	return getEnclosingScope() != null
		&& getEnclosingScope().contains(identifier);
    }

    public int getBodyStartLine() {
	return bodyStartLine;
    }

    public void setBodyStartLine(int bodyStartLine) {
	this.bodyStartLine = bodyStartLine;
    }

    public int getBodyStartPos() {
	return bodyStartPos;
    }

    public void setBodyStartPos(int bodyStartPos) {
	this.bodyStartPos = bodyStartPos;
    }

    public int getBodyEndLine() {
	return bodyEndLine;
    }

    public void setBodyEndLine(int bodyEndLine) {
	this.bodyEndLine = bodyEndLine;
    }

    public int getBodyEndPos() {
	return bodyEndPos;
    }

    public void setBodyEndPos(int bodyEndPos) {
	this.bodyEndPos = bodyEndPos;
    }

    @Override
    public Identifiable get(String identifier) {
	// TODO Retrieve local variable declarations
	return getEnclosingScope().get(identifier);
    }

    @Override
    public Scope getEnclosingScope() {
	if (getItem() != null) {
	    return getItem().getScope();
	}

	return null;
    }

    public List<NamedArg> getArgs() {
	return args;
    }
}