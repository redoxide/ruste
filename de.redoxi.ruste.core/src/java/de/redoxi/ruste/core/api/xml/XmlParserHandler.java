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

import java.util.Deque;
import java.util.LinkedList;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import de.redoxi.ruste.core.model.ASTBuilderListener;
import de.redoxi.ruste.core.model.ast.ASTNode;

public class XmlParserHandler extends DefaultHandler {

    private ASTBuilderListener listener;
    private Deque<String> tagNames = new LinkedList<String>();

    public XmlParserHandler() {
	listener = new ASTBuilderListener();
    }

    public ASTNode getRoot() {
	return listener.getRoot();
    }

    @Override
    public void startElement(String uri, String localName, String qName,
	    Attributes attributes) {
	int startLine = Integer.parseInt(attributes.getValue("startLine"));
	int startPos = Integer.parseInt(attributes.getValue("startPos"));
	int endLine = Integer.parseInt(attributes.getValue("endLine"));
	int endPos = Integer.parseInt(attributes.getValue("endPos"));

	String tagName = qName;

	tagNames.push(tagName);

	String ident = attributes.getValue("ident");

	if ("crate".equals(tagName)) {
	    listener.startCrate(ident, startLine, startPos, endLine, endPos);
	} else if ("module".equals(tagName)) {
	    listener.startModule(ident, startLine, startPos, endLine, endPos);
	} else if ("trait".equals(tagName)) {
	    listener.startTrait(ident, startLine, startPos, endLine, endPos);
	} else if ("traitMethod".equals(tagName)) {
	    listener.startTraitMethod(ident, attributes.getValue("returns"),
		    startLine, startPos, endLine, endPos);
	} else if ("function".equals(tagName)) {
	    listener.startFunction(ident, attributes.getValue("returns"),
		    startLine, startPos, endLine, endPos);
	} else if ("enumeration".equals(tagName)) {
	    listener.startEnumeration(ident, startLine, startPos, endLine,
		    endPos);
	} else if ("variant".equals(tagName)) {
	    listener.startEnumerationVariant(ident, startLine, startPos,
		    endLine, endPos);
	} else if ("implementation".equals(tagName)) {
	    listener.startImplementation(attributes.getValue("type"),
		    attributes.getValue("trait"), startLine, startPos, endLine,
		    endPos);
	} else if ("implementationMethod".equals(tagName)) {
	    listener.startImplementationMethod(ident,
		    attributes.getValue("returns"), startLine, startPos,
		    endLine, endPos);
	} else if ("structure".equals(tagName)) {
	    listener.startStructure(ident, startLine, startPos, endLine, endPos);
	} else if ("field".equals(tagName)) {
	    listener.startField(ident, attributes.getValue("type"), startLine, startPos, endLine, endPos);
	} else if ("genericParameter".equals(tagName)) {
	    listener.startGenericParam(ident, startLine, startPos, endLine, endPos);
	} else if ("paramBound".equals(tagName)) {
	    listener.startParamBound(attributes.getValue("trait"), startLine, startPos, endLine, endPos);
	} else if ("type".equals(tagName)) {
	    listener.startType(ident, attributes.getValue("type"), startLine, startPos, endLine, endPos);
	} else {
	    tagNames.pop();
	}
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
	if (tagNames.peek().equals(qName)) {
	    listener.end();
	    tagNames.pop();
	}
    }
}