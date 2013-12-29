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
package de.redoxi.ruste.core.editors.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.junit.Before;
import org.junit.Test;

import de.redoxi.ruste.core.editors.IDefaultRustColourConstants;
import de.redoxi.ruste.core.editors.RustScanner;

public class RustScannerTest {

    private IDocument sourceDocument;

    @Before
    public final void setUp() throws IOException {
	final InputStream sourceInputStream = getClass().getResourceAsStream(
		"/rust_scanner_test.rs");

	final BufferedReader sourceReader = new BufferedReader(
		new InputStreamReader(sourceInputStream));
	final StringBuilder sourceBuilder = new StringBuilder();

	String line = null;

	while ((line = sourceReader.readLine()) != null) {
	    sourceBuilder.append(line);
	}

	sourceDocument = new Document(sourceBuilder.toString());

	sourceInputStream.close();
    }

    @Test
    @SuppressWarnings("unused")
    public final void testRustScanner() throws BadLocationException {
	RustScanner scanner = new RustScanner();

	scanner.setRange(sourceDocument, 0, sourceDocument.getLength());

	final TokenDetails licenceToken = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token0 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token1 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token2 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token3 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token4 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token5 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token6 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token7 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token8 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token9 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token10 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token11 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token12 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token13 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token14 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token15 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token16 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token17 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token18 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token19 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token20 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token21 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token22 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token23 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token24 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token25 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token26 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token27 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token28 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token29 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token30 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token31 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token32 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token33 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token34 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token35 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token36 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token37 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token38 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());
	final TokenDetails token39 = new TokenDetails(sourceDocument,
		scanner.nextToken(), scanner.getTokenOffset(),
		scanner.getTokenLength());

	// Check keyword token
	assertEquals("fn", token0.getContent());
	assertTrue(token0.getToken().getData() instanceof TextAttribute);
	assertEquals(IDefaultRustColourConstants.KEYWORD,
		((TextAttribute) token0.getToken().getData()).getForeground());

	// Check keyword token
	assertEquals("\"string\"", token20.getContent());
	assertTrue(token20.getToken().getData() instanceof TextAttribute);
	assertEquals(IDefaultRustColourConstants.STRING,
		((TextAttribute) token20.getToken().getData()).getForeground());

	// Check keyword token
	assertEquals("'c'", token29.getContent());
	assertTrue(token29.getToken().getData() instanceof TextAttribute);
	assertEquals(IDefaultRustColourConstants.CHARACTER,
		((TextAttribute) token29.getToken().getData()).getForeground());

	// Check numeric literal token
	assertEquals("1", token38.getContent());
	assertTrue(token38.getToken().getData() instanceof TextAttribute);
	assertEquals(IDefaultRustColourConstants.NUMBER,
		((TextAttribute) token38.getToken().getData()).getForeground());
    }

    class TokenDetails {
	private IToken token;
	private int offset;
	private int length;
	private String content;

	TokenDetails(IDocument document, IToken token, int offset, int length)
		throws BadLocationException {
	    this.offset = offset;
	    this.length = length;
	    this.token = token;

	    content = document.get(offset, length);
	}

	final IToken getToken() {
	    return token;
	}

	final int getOffset() {
	    return offset;
	}

	final int getLength() {
	    return length;
	}

	final String getContent() {
	    return content;
	}

	public final String toString() {
	    return getContent();
	}
    }
}
