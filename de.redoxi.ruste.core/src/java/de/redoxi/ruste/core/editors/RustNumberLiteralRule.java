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

package de.redoxi.ruste.core.editors;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * FSM-based number literal parser
 * 
 * TODO This would be easier to maintain as an ANTLR based parser, and probably not
 * substantially faster or more efficient
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustNumberLiteralRule implements IRule {

    private static final String LITERAL_CHARS = "0123456789abcdefiuABCDEF+-_ox.";
    private static final int NUM_CHARS = LITERAL_CHARS.length();
    private static final int NUM_STATES = 27;
    private static final int START_STATE = 2;
    private static final int FAIL_STATE = 0;
    private static final int SUCCESS_STATE = 1;

    private static final int DEC_INT_STATE = 3;
    private static final int BIN_INT_STATE = 24;
    private static final int OCT_INT_STATE = 25;
    private static final int HEX_INT_STATE = 26;
    private static final int ZERO_INT_STATE = 8;
    private static final int FLOAT_STATE = 17;
    private static final int FLOAT_EXP_STATE = 21;

    private static final int[][] TRANSITIONS = new int[NUM_STATES][NUM_CHARS];

    private IToken successToken;

    static {
	addTransition(START_STATE, "123456789", 3);
	addTransition(START_STATE, "0", 4);

	addTransition(3, "iu", 9);
	addTransition(3, "f", 12);
	addTransition(3, "0123456789_", 3);
	addTransition(3, ".", 11);

	addTransition(4, "b", 5);
	addTransition(4, "o", 6);
	addTransition(4, "x", 7);
	addTransition(4, "0123456789_", 8);
	addTransition(4, ".", 11);

	addTransition(5, "01_", 24);
	addTransition(5, "iu", 9);

	addTransition(6, "01234567_", 25);
	addTransition(6, "iu", 9);

	addTransition(7, "0123456789abcdefABCDEF_", 26);
	addTransition(7, "iu", 9);

	addTransition(8, "0123456789_", 8);
	addTransition(8, "0123456789_", 9);
	addTransition(8, "Ee", 10);
	addTransition(8, ".", 11);

	addTransition(9, "8", SUCCESS_STATE);
	addTransition(9, "1", 13);
	addTransition(9, "3", 14);
	addTransition(9, "6", 15);

	addTransition(10, "+-", 16);
	addTransition(10, "0123456789_", 18);

	addTransition(11, "0123456789_", 17);

	addTransition(12, "3", 22);
	addTransition(12, "6", 23);

	addTransition(13, "6", SUCCESS_STATE);

	addTransition(14, "2", SUCCESS_STATE);

	addTransition(15, "4", SUCCESS_STATE);

	addTransition(16, "0123456789_", 18);

	addTransition(17, "Ee", 19);

	addTransition(18, "f", 12);

	addTransition(19, "+-", 20);
	addTransition(19, "0123456789_", 21);

	addTransition(20, "0123456789_", 21);

	addTransition(21, "0123456789_", 21);

	addTransition(22, "2", SUCCESS_STATE);

	addTransition(23, "4", SUCCESS_STATE);

	addTransition(24, "01_", 24);
	addTransition(24, "iu", 9);

	addTransition(25, "01234567_", 25);
	addTransition(25, "iu", 9);

	addTransition(26, "0123456789abcdefABCDEF_", 26);
	addTransition(26, "iu", 9);
    }

    /**
     * Create transitions from <code>stateA</code> to <code>stateB</code> for
     * all characters in <code>chs</code>.
     * 
     * @param stateA
     * @param chs
     * @param stateB
     */
    private static void addTransition(int stateA, String chs, int stateB) {
	for (int i = 0; i < chs.length(); ++i) {
	    int index = indexForChar(chs.charAt(i));

	    if (index < 0 || index >= NUM_CHARS) {
		throw new Error("'" + chs.charAt(i)
			+ "' not in valid characters");
	    }

	    TRANSITIONS[stateA][index] = stateB;
	}
    }

    /**
     * Instantiate a new rule to match against a Rust numeric literal
     * 
     * @param successToken
     *            Token to return if this rule matches
     */
    public RustNumberLiteralRule(IToken successToken) {
	this.successToken = successToken;
    }

    /**
     * {@inheritDoc IRule#evaluate(ICharacterScanner)}
     */
    @Override
    public IToken evaluate(ICharacterScanner scanner) {
	int currentState = START_STATE;

	int ch = scanner.read();
	StringBuilder builder = new StringBuilder();
	int numRead = 1;

	while (ch != ICharacterScanner.EOF && currentState != SUCCESS_STATE
		&& currentState != FAIL_STATE) {
	    currentState = transition(currentState, ch);
	    builder.append((char) ch);
	    numRead += 1;

	    ch = scanner.read();
	}
	
	if (ch != ICharacterScanner.EOF) {
	    scanner.unread();
	    scanner.unread();
	    numRead -= 2;
	}

	switch (currentState) {
	case SUCCESS_STATE:
	case DEC_INT_STATE:
	case BIN_INT_STATE:
	case OCT_INT_STATE:
	case HEX_INT_STATE:
	case FLOAT_STATE:
	case FLOAT_EXP_STATE:
	case ZERO_INT_STATE:
	    return successToken;
	default:
	    // Backtrack if the token is not matched
	    for (int j = 0; j < numRead; ++j) {
		scanner.unread();
	    }
	    return Token.UNDEFINED;
	}
    }

    /**
     * @param ch
     *            a character in the set of characters available
     * @return the index of the given character
     */
    private static final int indexForChar(int ch) {
	return LITERAL_CHARS.indexOf(ch);
    }

    /**
     * Get the new state after transitioning on the given input
     * 
     * @param state
     *            the initial state
     * @param ch
     *            the input
     * @return the new state
     */
    private static final int transition(int state, int ch) {
	int charIndex = indexForChar(ch);

	if (charIndex < 0) {
	    switch (state) {
	    case DEC_INT_STATE:
	    case BIN_INT_STATE:
	    case OCT_INT_STATE:
	    case HEX_INT_STATE:
	    case FLOAT_STATE:
	    case FLOAT_EXP_STATE:
	    case ZERO_INT_STATE:
		return SUCCESS_STATE;
	    default:
		return FAIL_STATE;
	    }
	}

	return TRANSITIONS[state][charIndex];
    }
}