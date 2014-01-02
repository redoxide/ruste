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

/**
 * Indicates that the implementing class provides scope hierarchy within the
 * abstract syntax tree
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public interface Scope {

    /**
     * Check if the given identifier is declared in this scope or any enclosing
     * scopes
     * 
     * @param identifier
     * @return <code>true</code> if the given identifier is declared in this
     *         scope, <code>false</code> otherwise
     */
    public boolean contains(String identifier);

    /**
     * @param identifier
     * @return the {@link Identifiable} in the given scope that has the given
     *         identifier
     */
    public Identifiable get(String identifier);

    /**
     * @return The parent scope that this scope exists within
     */
    public Scope getEnclosingScope();
}
