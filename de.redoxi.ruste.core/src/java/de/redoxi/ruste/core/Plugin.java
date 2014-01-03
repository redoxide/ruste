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
package de.redoxi.ruste.core;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;

import de.redoxi.ruste.core.ui.ASTIcon;
import de.redoxi.ruste.core.ui.Icon;

/**
 * Rust core plugin
 * 
 * @author Hayden Smith
 * @since 1.0.0
 */
public class Plugin extends AbstractUIPlugin {

    private static Plugin instance;
    
    public static final String PLUGIN_ID = "de.redoxi.ruste.core";

    public Plugin() {
	super();
	instance = this;
    }
    
    public static Plugin getInstance() {
	return instance;
    }

    @Override
    protected void initializeImageRegistry(ImageRegistry registry) {
	addIconsToRegistry(registry, ASTIcon.values());
    }
    
    /**
     * Add the {@link Icon}s in the given array into the given image registry
     * 
     * @param registry
     * @param icons
     */
    protected void addIconsToRegistry(ImageRegistry registry, Icon[] icons) {
	for (Icon icon : icons) {
	    addIconToRegistry(registry, icon);
	}
    }
    
    /**
     * Add the given {@link Icon} to the image registry for this plugin
     * 
     * @param bundle
     * @param registry
     * @param icon
     */
    protected void addIconToRegistry(ImageRegistry registry, Icon icon) {
	Bundle bundle = Platform.getBundle(PLUGIN_ID);
	IPath path = new Path(icon.getPath());
        URL url = FileLocator.find(bundle, path, null);
        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        registry.put(icon.getId(), desc);
    }
}
