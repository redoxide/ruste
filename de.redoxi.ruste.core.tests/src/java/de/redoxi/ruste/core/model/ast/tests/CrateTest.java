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
package de.redoxi.ruste.core.model.ast.tests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

import org.eclipse.core.resources.IFile;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Crate;

public class CrateTest {

    private Crate crate;

    @Before
    public void setUp() throws Exception {
	crate = new Crate();
    }

    @Test
    public final void testGetCrate() {
	assertSame(crate, crate.getCrate());
    }

    @Test
    public final void testGetModule() {
	assertNull(crate.getItem());
    }

    @Test
    public final void testCrate() {
	Crate crateForTest = new Crate();

	assertNull(crateForTest.getIdentifier());
	assertNull(crateForTest.getItem());
    }

    @Test
    public final void testCrate_sourceFile() {
	IFile sourceFile = mock(IFile.class);

	Crate crateForTest = new Crate(sourceFile);

	assertNull(crateForTest.getIdentifier());
	assertNull(crateForTest.getItem());
	assertSame(sourceFile, crateForTest.getSourceFile());
    }

    @Test
    public void testGetSourceFile() {
	assertNull(crate.getSourceFile());
    }

    @Test
    public void testSetSourceFile() {
	IFile sourceFile = mock(IFile.class);

	assertNull(crate.getSourceFile());
	crate.setSourceFile(sourceFile);
	assertSame(sourceFile, crate.getSourceFile());
    }
}
