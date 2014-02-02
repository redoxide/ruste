/*
* generated by Xtext
*/
package de.redoxi.ruste.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.redoxi.ruste.services.RustGrammarAccess;

public class RustParser extends AbstractContentAssistParser {
	
	@Inject
	private RustGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser createParser() {
		de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser result = new de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAttrAccess().getAlternatives(), "rule__Attr__Alternatives");
					put(grammarAccess.getModItemAccess().getAlternatives_2(), "rule__ModItem__Alternatives_2");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getCharLitAccess().getAlternatives_1(), "rule__CharLit__Alternatives_1");
					put(grammarAccess.getCharLitAccess().getAlternatives_1_1_1(), "rule__CharLit__Alternatives_1_1_1");
					put(grammarAccess.getEscapedCharAccess().getAlternatives(), "rule__EscapedChar__Alternatives");
					put(grammarAccess.getEscapedCharAccess().getCharAlternatives_0_1_0(), "rule__EscapedChar__CharAlternatives_0_1_0");
					put(grammarAccess.getNumberLitAccess().getAlternatives(), "rule__NumberLit__Alternatives");
					put(grammarAccess.getFloatLitAccess().getAlternatives_1(), "rule__FloatLit__Alternatives_1");
					put(grammarAccess.getFloatLitAccess().getAlternatives_2_1(), "rule__FloatLit__Alternatives_2_1");
					put(grammarAccess.getFloatLitAccess().getAlternatives_3_0(), "rule__FloatLit__Alternatives_3_0");
					put(grammarAccess.getFloatLitAccess().getAlternatives_3_1(), "rule__FloatLit__Alternatives_3_1");
					put(grammarAccess.getFloatLitAccess().getAlternatives_3_2(), "rule__FloatLit__Alternatives_3_2");
					put(grammarAccess.getDecIntLitAccess().getAlternatives_1(), "rule__DecIntLit__Alternatives_1");
					put(grammarAccess.getDecIntLitAccess().getAlternatives_2_0(), "rule__DecIntLit__Alternatives_2_0");
					put(grammarAccess.getFloatSizeAccess().getAlternatives(), "rule__FloatSize__Alternatives");
					put(grammarAccess.getIntSizeAccess().getAlternatives(), "rule__IntSize__Alternatives");
					put(grammarAccess.getItemAttrAccess().getGroup(), "rule__ItemAttr__Group__0");
					put(grammarAccess.getItemAttrAccess().getGroup_2(), "rule__ItemAttr__Group_2__0");
					put(grammarAccess.getAttrWithListAccess().getGroup(), "rule__AttrWithList__Group__0");
					put(grammarAccess.getAttrWithListAccess().getGroup_3(), "rule__AttrWithList__Group_3__0");
					put(grammarAccess.getLiteralAttrAccess().getGroup(), "rule__LiteralAttr__Group__0");
					put(grammarAccess.getItemAndAttrsAccess().getGroup(), "rule__ItemAndAttrs__Group__0");
					put(grammarAccess.getModItemAccess().getGroup(), "rule__ModItem__Group__0");
					put(grammarAccess.getModItemAccess().getGroup_2_1(), "rule__ModItem__Group_2_1__0");
					put(grammarAccess.getCharLitAccess().getGroup(), "rule__CharLit__Group__0");
					put(grammarAccess.getCharLitAccess().getGroup_1_1(), "rule__CharLit__Group_1_1__0");
					put(grammarAccess.getEscapedCharAccess().getGroup_0(), "rule__EscapedChar__Group_0__0");
					put(grammarAccess.getEscapedCharAccess().getGroup_1(), "rule__EscapedChar__Group_1__0");
					put(grammarAccess.getEscapedCharAccess().getGroup_2(), "rule__EscapedChar__Group_2__0");
					put(grammarAccess.getEscapedCharAccess().getGroup_3(), "rule__EscapedChar__Group_3__0");
					put(grammarAccess.getFloatLitAccess().getGroup(), "rule__FloatLit__Group__0");
					put(grammarAccess.getFloatLitAccess().getGroup_2(), "rule__FloatLit__Group_2__0");
					put(grammarAccess.getFloatLitAccess().getGroup_3(), "rule__FloatLit__Group_3__0");
					put(grammarAccess.getFloatLitAccess().getGroup_4(), "rule__FloatLit__Group_4__0");
					put(grammarAccess.getDecIntLitAccess().getGroup(), "rule__DecIntLit__Group__0");
					put(grammarAccess.getDecIntLitAccess().getGroup_2(), "rule__DecIntLit__Group_2__0");
					put(grammarAccess.getCrateAccess().getItemsAssignment(), "rule__Crate__ItemsAssignment");
					put(grammarAccess.getItemAttrAccess().getAttrsAssignment_1(), "rule__ItemAttr__AttrsAssignment_1");
					put(grammarAccess.getItemAttrAccess().getAttrsAssignment_2_1(), "rule__ItemAttr__AttrsAssignment_2_1");
					put(grammarAccess.getAttrWithListAccess().getIdentAssignment_0(), "rule__AttrWithList__IdentAssignment_0");
					put(grammarAccess.getAttrWithListAccess().getAttrsAssignment_2(), "rule__AttrWithList__AttrsAssignment_2");
					put(grammarAccess.getAttrWithListAccess().getAttrsAssignment_3_1(), "rule__AttrWithList__AttrsAssignment_3_1");
					put(grammarAccess.getLiteralAttrAccess().getIdentAssignment_0(), "rule__LiteralAttr__IdentAssignment_0");
					put(grammarAccess.getLiteralAttrAccess().getValueAssignment_2(), "rule__LiteralAttr__ValueAssignment_2");
					put(grammarAccess.getItemAndAttrsAccess().getAttrsAssignment_0(), "rule__ItemAndAttrs__AttrsAssignment_0");
					put(grammarAccess.getItemAndAttrsAccess().getItemAssignment_1(), "rule__ItemAndAttrs__ItemAssignment_1");
					put(grammarAccess.getModItemAccess().getIdentAssignment_1(), "rule__ModItem__IdentAssignment_1");
					put(grammarAccess.getCharLitAccess().getCharAssignment_1_0(), "rule__CharLit__CharAssignment_1_0");
					put(grammarAccess.getCharLitAccess().getCharAssignment_1_1_1_0(), "rule__CharLit__CharAssignment_1_1_1_0");
					put(grammarAccess.getCharLitAccess().getEscapedCharAssignment_1_1_1_1(), "rule__CharLit__EscapedCharAssignment_1_1_1_1");
					put(grammarAccess.getEscapedCharAccess().getCharAssignment_0_1(), "rule__EscapedChar__CharAssignment_0_1");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_2(), "rule__EscapedChar__DigitsAssignment_1_2");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_1_3(), "rule__EscapedChar__DigitsAssignment_1_3");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_2(), "rule__EscapedChar__DigitsAssignment_2_2");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_3(), "rule__EscapedChar__DigitsAssignment_2_3");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_4(), "rule__EscapedChar__DigitsAssignment_2_4");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_2_5(), "rule__EscapedChar__DigitsAssignment_2_5");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_2(), "rule__EscapedChar__DigitsAssignment_3_2");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_3(), "rule__EscapedChar__DigitsAssignment_3_3");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_4(), "rule__EscapedChar__DigitsAssignment_3_4");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_5(), "rule__EscapedChar__DigitsAssignment_3_5");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_6(), "rule__EscapedChar__DigitsAssignment_3_6");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_7(), "rule__EscapedChar__DigitsAssignment_3_7");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_8(), "rule__EscapedChar__DigitsAssignment_3_8");
					put(grammarAccess.getEscapedCharAccess().getDigitsAssignment_3_9(), "rule__EscapedChar__DigitsAssignment_3_9");
					put(grammarAccess.getFloatLitAccess().getDigitsAssignment_0(), "rule__FloatLit__DigitsAssignment_0");
					put(grammarAccess.getFloatLitAccess().getDigitsAssignment_1_0(), "rule__FloatLit__DigitsAssignment_1_0");
					put(grammarAccess.getFloatLitAccess().getDigitsAssignment_2_1_0(), "rule__FloatLit__DigitsAssignment_2_1_0");
					put(grammarAccess.getFloatLitAccess().getNegativeExpAssignment_3_1_1(), "rule__FloatLit__NegativeExpAssignment_3_1_1");
					put(grammarAccess.getFloatLitAccess().getDigitsAssignment_3_2_0(), "rule__FloatLit__DigitsAssignment_3_2_0");
					put(grammarAccess.getFloatLitAccess().getSizeAssignment_4_1(), "rule__FloatLit__SizeAssignment_4_1");
					put(grammarAccess.getDecIntLitAccess().getDigitsAssignment_0(), "rule__DecIntLit__DigitsAssignment_0");
					put(grammarAccess.getDecIntLitAccess().getDigitsAssignment_1_0(), "rule__DecIntLit__DigitsAssignment_1_0");
					put(grammarAccess.getDecIntLitAccess().getUnsignedAssignment_2_0_1(), "rule__DecIntLit__UnsignedAssignment_2_0_1");
					put(grammarAccess.getDecIntLitAccess().getSizeAssignment_2_1(), "rule__DecIntLit__SizeAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser typedParser = (de.redoxi.ruste.ui.contentassist.antlr.internal.InternalRustParser) parser;
			typedParser.entryRuleCrate();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public RustGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RustGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
