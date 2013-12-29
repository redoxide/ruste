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

package de.redoxi.ruste.core.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * Rust project nature
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustProjectNature implements IProjectNature {

    public static final String NATURE_ID = "de.redoxi.ruste.core.projectNature";

    private IProject project;

    @Override
    public void configure() throws CoreException {
	// TODO Auto-generated method stub

    }

    @Override
    public void deconfigure() throws CoreException {
	// TODO Auto-generated method stub

    }

    @Override
    public IProject getProject() {
	return project;
    }

    @Override
    public void setProject(IProject project) {
	this.project = project;
    }
}
