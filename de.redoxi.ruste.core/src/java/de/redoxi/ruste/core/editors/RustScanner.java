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

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

/**
 * Scanner for dividing Rust code in source files into tokens
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustScanner extends RuleBasedScanner {

    public static final String KEYWORDS[] = new String[] { "as", "break", "do",
	    "else", "enum", "extern", "false", "fn", "for", "if", "impl", "in",
	    "let", "loop", "match", "mod", "mut", "priv", "pub", "ref",
	    "return", "self", "static", "struct", "super", "true", "trait",
	    "type", "unsafe", "use", "while" };

    public RustScanner() {

	IRule[] rules = new IRule[] {
		// Highlight string literals
		newStringLiteralRule(),

		// Highlight character literals
		newCharacterLiteralRule(),
		
		// TODO Highlight lifetime

		// Highlight integer literals
		newNumberRule(),

		// Highlight keywords
		newKeywordRule(),

		// Highlight identifiers
		newIdentifierRule(),

		// Highlight comments
		newInlineCommentRule(),
		newBlockCommentRule(),
		newDocCommentRule(),

		// Add generic whitespace rule.
		new WhitespaceRule(new RustWhitespaceDetector()) };

	setRules(rules);
    }

    /**
     * @return a new rule for identifying character literal tokens
     */
    private IRule newCharacterLiteralRule() {
	final IToken charToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.CHARACTER));
	// TODO This rule should match against either a single character, or a single character and the '\' escape charac
	final SingleLineRule charRule = new SingleLineRule("'", "'", charToken,
		'\\');
	return charRule;
    }

    /**
     * @return a new rule for identifying string literal tokens
     */
    private IRule newStringLiteralRule() {
	final IToken stringToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.STRING));
	final MultiLineRule stringRule = new MultiLineRule("\"", "\"",
		stringToken, '\\');
	return stringRule;
    }

    /**
     * @return a new rule for identifying number literal tokens
     */
    private IRule newNumberRule() {
	// TODO Create a rule for Rust number literals
	final IToken numberToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.NUMBER));
	return new RustNumberLiteralRule(numberToken);
    }

    /**
     * @return a new rule for highlighting the keywords in the editor
     */
    private IRule newKeywordRule() {
	final IToken keywordToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.KEYWORD));

	final WordRule keywordRule = new WordRule(new IWordDetector() {

	    @Override
	    public boolean isWordStart(char c) {
		return Character.isLetter(c);
	    }

	    @Override
	    public boolean isWordPart(char c) {
		// Although the keywords do not include non-alphabetical
		// characters,
		// we need to include the same characters as identifiers so that
		// this rule
		// doesn't highlight a keyword in an otherwise valid identifier
		return !Character.isWhitespace(c);
	    }
	});

	for (final String keyword : KEYWORDS) {
	    keywordRule.addWord(keyword, keywordToken);
	}

	return keywordRule;
    }

    /**
     * @return a rule to match identifiers
     */
    private IRule newIdentifierRule() {
	final IToken identifierToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.IDENTIFIER));

	final WordRule identifierRule = new WordRule(new IWordDetector() {

	    @Override
	    public boolean isWordStart(char c) {
		return Character.isUnicodeIdentifierStart(c);
	    }

	    @Override
	    public boolean isWordPart(char c) {
		return Character.isUnicodeIdentifierPart(c);
	    }
	}, identifierToken);

	return identifierRule;
    }

    /**
     * @return a rule to match inline comments
     */
    private IRule newInlineCommentRule() {
	final IToken commentToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.COMMENT));
	return new SingleLineRule("//", null, commentToken);
    }
    
    /**
     * @return a rule to match block comments
     */
    private IRule newBlockCommentRule() {
	final IToken commentToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.COMMENT));
	return new MultiLineRule("/*", "*/", commentToken);
    }
    
    /**
     * @return a rule to match block documentation comments
     */
    private IRule newDocCommentRule() {
	final IToken commentToken = new Token(new TextAttribute(
		IDefaultRustColourConstants.DOC_COMMENT));
	return new MultiLineRule("/**", "*/", commentToken);
    }
}
