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

package de.redoxi.ruste.core.runtime;

import java.util.Collection;

import de.redoxi.ruste.core.model.ast.Identifiable;
import de.redoxi.ruste.core.parser.IRustParser;

/**
 * Interface description of classes that provide information about the standard
 * Rust runtime and its sources
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public interface IRustRuntime {

    public void init();

    public Identifiable[] getIdentifiables(String identifier);

    public Identifiable[] getIdentifiablesStartingWith(String startsWith);

    public String getRustCompilerPath();

    public IRustParser newRustParserInstance();

    public Collection<IRustLibrary> getLibraries();
}
