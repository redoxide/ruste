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
 * Representation of a method within a {@link Trait}
 * 
 * @see http://static.rust-lang.org/doc/master/rust.html#traits
 */
public class TraitMethod extends ASTNode/* TODO implements Scope */implements
	Identifiable, Visible, Generic {

    private String identifier;
    private List<GenericParam> genericParameters = new ArrayList<GenericParam>();
    private List<Arg> args = new ArrayList<Arg>();

    private String returnType;
    private Visibility visibility = Visibility.DEFAULT;

    public TraitMethod(Trait trait) {
	super(trait);
	trait.getMethods().add(this);
    }

    public List<GenericParam> getGenericParameters() {
	return genericParameters;
    }

    public String getReturnType() {
	return returnType;
    }

    public void setReturnType(String returnType) {
	this.returnType = returnType;
    }

    public Trait getTrait() {
	return (Trait) getParent();
    }

    @Override
    public String toString() {
	StringBuilder label = new StringBuilder();
	label.append(getIdentifier());

	// TODO Generic parameters

	label.append('(');

	for (int i = 0; i < args.size(); ++i) {
	    final Arg arg = args.get(i);

	    label.append(arg.toString());

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

    public Visibility getVisibility() {
	return visibility;
    }

    public void setVisibility(Visibility visibility) {
	this.visibility = visibility;
    }

    public List<Arg> getArgs() {
	return args;
    }
}