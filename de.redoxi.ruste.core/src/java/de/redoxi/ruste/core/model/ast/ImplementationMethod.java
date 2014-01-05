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
public class ImplementationMethod extends ASTNode implements Identifiable,
	Visible/* TODO ,Scope */{

    private String identifier;
    private List<GenericParam> genericParameters = new ArrayList<GenericParam>();
    
    // TODO Replace with list of {@link NamedArg}
    private List<String> argumentNames = new ArrayList<String>();
    private List<String> argumentTypes = new ArrayList<String>();
    private String returnType;
    private Visibility visibility = Visibility.DEFAULT;

    public ImplementationMethod(Implementation implementation) {
	super(implementation);
	implementation.getMethods().add(this);
    }

    public List<GenericParam> getGenericParameters() {
	return genericParameters;
    }

    public List<String> getArgumentNames() {
	return argumentNames;
    }

    public List<String> getArgumentTypes() {
	return argumentTypes;
    }

    public String getReturnType() {
	return returnType;
    }

    public void setReturnType(String returnType) {
	this.returnType = returnType;
    }

    public Implementation getImplementation() {
	return (Implementation) getParent();
    }

    @Override
    public String toString() {
	StringBuilder label = new StringBuilder();
	label.append(identifier);

	// TODO Generic parameters

	label.append('(');

	for (int i = 0; i < argumentNames.size(); ++i) {
	    final String name = argumentNames.get(i);
	    final String type = argumentTypes.get(i);

	    label.append(name);
	    label.append(" : ");
	    label.append(type);

	    if (i < argumentNames.size() - 1) {
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
}