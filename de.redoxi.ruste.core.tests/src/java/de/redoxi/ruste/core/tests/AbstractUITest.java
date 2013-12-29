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
package de.redoxi.ruste.core.tests;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class AbstractUITest {

    /**
     * Recursively follow the control tree contained in the given parent
     * composite and collect all instances of the given class
     * 
     * @param parent
     *            The parent composite
     * @param controlClass
     *            The SWT widget class
     * @return All instances of the given control class that make up the parent
     *         composite
     */
    @SuppressWarnings("unchecked")
    protected <T extends Control> List<T> getControlsOfType(Composite parent,
	    Class<T> controlClass) {
	List<T> controls = new LinkedList<T>();

	for (Control child : parent.getChildren()) {
	    if (controlClass.isInstance(child)) {
		controls.add((T) child);
	    }

	    if (child instanceof Composite) {
		controls.addAll(getControlsOfType((Composite) child,
			controlClass));
	    }
	}

	return controls;
    }
}
