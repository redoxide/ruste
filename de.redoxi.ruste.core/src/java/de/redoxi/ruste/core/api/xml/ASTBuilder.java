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

package de.redoxi.ruste.core.api.xml;

import java.io.InputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

import de.redoxi.ruste.core.model.ast.ASTNode;

/**
 * Constructs an AST from the XML representation via the given
 * {@link InputStream}
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class ASTBuilder {

    private InputStream input;

    public ASTBuilder(InputStream input) {
	this.input = input;
    }

    public ASTNode parse() {
	SAXParserFactory parserFactory = SAXParserFactory.newInstance();
	parserFactory.setNamespaceAware(true);

	try {
	    SAXParser xmlParser = parserFactory.newSAXParser();

	    XmlParserHandler xmlParserHandler = new XmlParserHandler();
	    xmlParser.parse(input, xmlParserHandler);

	    return xmlParserHandler.getRoot();
	} catch (Exception e) {
	    // TODO Catch SAXParseException and track error location
	    getLogService().log(LogService.LOG_ERROR, "Error parsing XML AST source", e);
	}

	return null;
    }
    
    /**
     * @return The {@link LogService} for the 
     */
    private LogService getLogService() {
	final Bundle bundle = FrameworkUtil.getBundle(getClass());
	final ServiceTracker<LogService, LogService> tracker = new ServiceTracker<LogService, LogService>(bundle.getBundleContext(), LogService.class, null);
	return tracker.getService();
    }
}
