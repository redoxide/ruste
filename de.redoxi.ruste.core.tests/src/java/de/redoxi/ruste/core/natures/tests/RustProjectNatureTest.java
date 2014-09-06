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
package de.redoxi.ruste.core.natures.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import de.redoxi.ruste.core.natures.RustProjectNature;

public class RustProjectNatureTest {

    private RustProjectNature nature;

    @Before
    public void setUp() throws Exception {
	nature = new RustProjectNature();
    }

    @Test
    public final void testConfigure() throws CoreException {
	nature.configure();
    }

    @Test
    public final void testDeconfigure() throws CoreException {
	nature.deconfigure();
    }

    @Test
    public final void testGetProject() {
	assertNull(nature.getProject());
    }

    @Test
    public final void testSetProject() {
	IProject project = mock(IProject.class);
	nature.setProject(project);
	assertSame(project, nature.getProject());
    }

}