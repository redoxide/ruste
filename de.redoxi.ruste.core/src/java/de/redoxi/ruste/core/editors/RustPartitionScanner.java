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

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Partitions the source file into logical sections
 * 
 * @author Hayden Smith
 * @since 0.0.1
 */
public class RustPartitionScanner extends RuleBasedPartitionScanner {

    /**
     * Doc comment section
     */
    public final static String DOC_COMMENT = "__doc_comment";

    /**
     * Block or inline comment
     */
    public final static String COMMENT = "__comment";

    public RustPartitionScanner() {

	IToken docComment = new Token(DOC_COMMENT);
	IToken comment = new Token(COMMENT);

	IPredicateRule[] rules = new IPredicateRule[] {
		new MultiLineRule("/**", "*/", docComment),
		new MultiLineRule("/*", "*/", comment) };

	setPredicateRules(rules);
    }
}
