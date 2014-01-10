package de.redoxi.ruste.core.editors.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import de.redoxi.ruste.core.editors.RustNumberLiteralRule;

public class RustNumberLiteralRuleTest {

    private IToken successToken = mock(IToken.class);
    private RustNumberLiteralRule rule = new RustNumberLiteralRule(successToken);

    private class TestCharacterScanner implements ICharacterScanner {

	private List<Integer> chars;
	private int pos = 0;
	
	public TestCharacterScanner(String chars) {
	    this.chars = new ArrayList<Integer>(chars.length());
	    for (int i = 0; i < chars.length(); ++i) {
		this.chars.add((int) chars.charAt(i));
	    }
	}
	
	public TestCharacterScanner append(char c) {
	    this.chars.add((int) c);
	    return this;
	}
	
	public TestCharacterScanner append(int c) {
	    this.chars.add(c);
	    return this;
	}
	
	@Override
	public char[][] getLegalLineDelimiters() {
	    return new char[][] { { '\n' }, { '\r', '\n' } };
	}

	@Override
	public int getColumn() {
	    return 0;
	}

	@Override
	public int read() {
	    if (pos >= this.chars.size()) {
		return ICharacterScanner.EOF;
	    }
	    
	    return this.chars.get(pos++);
	}

	@Override
	public void unread() {
	    pos--;
	}
    }

    @Test
    public final void testEvaluate_decInteger() {
	TestCharacterScanner scanner = new TestCharacterScanner("1");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_binaryInteger() {
	TestCharacterScanner scanner = new TestCharacterScanner("0b1");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_hexInteger() {
	TestCharacterScanner scanner = new TestCharacterScanner("0x1");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_octInteger() {
	TestCharacterScanner scanner = new TestCharacterScanner("0o1");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_float() {
	TestCharacterScanner scanner = new TestCharacterScanner("1.0");
	assertEquals(successToken, rule.evaluate(scanner));
    }
   
    @Test
    public final void testEvaluate_decIntegerWithSuffix() {
	TestCharacterScanner scanner = new TestCharacterScanner("1i32");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_binaryIntegerWithSuffix() {
	TestCharacterScanner scanner = new TestCharacterScanner("0b1i32");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_hexIntegerWithSuffix() {
	TestCharacterScanner scanner = new TestCharacterScanner("0x1i32");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_octIntegerWithSuffix() {
	TestCharacterScanner scanner = new TestCharacterScanner("0o1i32");
	assertEquals(successToken, rule.evaluate(scanner));
    }
    
    @Test
    public final void testEvaluate_floatWithSuffix() {
	TestCharacterScanner scanner = new TestCharacterScanner("1.0f32");
	assertEquals(successToken, rule.evaluate(scanner));
    }
}
