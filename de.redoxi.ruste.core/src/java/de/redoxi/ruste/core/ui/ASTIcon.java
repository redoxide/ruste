/*
 * Copyright 2013-2014 Hayden Smith
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
package de.redoxi.ruste.core.ui;

public enum ASTIcon implements Icon {
    CRATE("icon.crate", "icons/crate.png"),
    MODULE("icon.module", "icons/module.png"),
    ENUM("icon.enum", "icons/enum.png"),
    ENUM_VARIANT("icon.enumvariant", "icons/enum-variant.png"),
    IMPL("icon.impl", "icons/implementation.png"),
    PRIVATE("icon.private", "icons/private.png"),
    PUBLIC("icon.public", "icons/public.png"),
    STATIC("icon.static", "icons/static.png"),
    STRUCT("icon.struct", "icons/structure.png"),
    TRAIT("icon.trait", "icons/trait.png");
    
    private String id;
    private String path;
    
    private ASTIcon(final String id, final String path) {
	this.id = id;
	this.path = path;
    }

    /* (non-Javadoc)
     * @see de.redoxi.ruste.core.ui.Icon#getId()
     */
    @Override
    public final String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see de.redoxi.ruste.core.ui.Icon#getPath()
     */
    @Override
    public final String getPath() {
        return path;
    }
}
