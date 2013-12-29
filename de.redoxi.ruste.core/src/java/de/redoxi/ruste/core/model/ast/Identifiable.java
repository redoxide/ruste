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
 * Indicates that the model within the grammar has an identifier.
 * 
 * This is used to match statements that reference identifiable constructs with
 * their declarations as part of quick fixes and to jump to declarations.
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public interface Identifiable {

    public String getIdentifier();

    public void setIdentifier(final String identifier);
}
