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

package de.redoxi.ruste.core.editors;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Default colour constants for the {@link RustEditor}
 * 
 * TODO Move this to the main Rust plugin and add a configuration panel
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public interface IDefaultRustColourConstants {

    Color DOC_COMMENT = new Color(Display.getCurrent(), new RGB(63, 127, 95));
    Color COMMENT = new Color(Display.getCurrent(), new RGB(63, 127, 95));
    Color KEYWORD = new Color(Display.getCurrent(), new RGB(127, 0, 85));
    Color IDENTIFIER = new Color(Display.getCurrent(), new RGB(0, 0, 192));
    Color STRING = new Color(Display.getCurrent(), new RGB(0xAA, 11, 11));
    Color CHARACTER = new Color(Display.getCurrent(), new RGB(0xAA, 11, 11));
    Color NUMBER = new Color(Display.getCurrent(), new RGB(11, 66, 44));
}
