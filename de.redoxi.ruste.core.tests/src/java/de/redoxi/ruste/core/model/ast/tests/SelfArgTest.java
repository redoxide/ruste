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

import static org.junit.Assert.*;

import org.junit.Test;

import de.redoxi.ruste.core.model.ast.Module;
import de.redoxi.ruste.core.model.ast.SelfArg;

public class SelfArgTest {

    private Module module = new Module(null);

    @Test
    public final void testSelfArg() {
	SelfArg selfArg = new SelfArg(module);
	assertSame(module, selfArg.getParent());
    }
}
