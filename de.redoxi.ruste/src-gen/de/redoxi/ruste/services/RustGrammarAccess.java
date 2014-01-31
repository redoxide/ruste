/*
* generated by Xtext
*/
package de.redoxi.ruste.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RustGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class CrateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Crate");
		private final Assignment cItemsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cItemsItemAndAttrsParserRuleCall_0 = (RuleCall)cItemsAssignment.eContents().get(0);
		
		//// Top level crate and its implicit module
		//Crate:
		//	items+=ItemAndAttrs*;
		public ParserRule getRule() { return rule; }

		//items+=ItemAndAttrs*
		public Assignment getItemsAssignment() { return cItemsAssignment; }

		//ItemAndAttrs
		public RuleCall getItemsItemAndAttrsParserRuleCall_0() { return cItemsItemAndAttrsParserRuleCall_0; }
	}

	public class ItemAttrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ItemAttr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttrsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttrsAttrParserRuleCall_1_0 = (RuleCall)cAttrsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttrsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttrsAttrParserRuleCall_2_1_0 = (RuleCall)cAttrsAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//// Attribute for an item
		//ItemAttr:
		//	"#[" attrs+=Attr ("," attrs+=Attr)* "]";
		public ParserRule getRule() { return rule; }

		//"#[" attrs+=Attr ("," attrs+=Attr)* "]"
		public Group getGroup() { return cGroup; }

		//"#["
		public Keyword getNumberSignLeftSquareBracketKeyword_0() { return cNumberSignLeftSquareBracketKeyword_0; }

		//attrs+=Attr
		public Assignment getAttrsAssignment_1() { return cAttrsAssignment_1; }

		//Attr
		public RuleCall getAttrsAttrParserRuleCall_1_0() { return cAttrsAttrParserRuleCall_1_0; }

		//("," attrs+=Attr)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//attrs+=Attr
		public Assignment getAttrsAssignment_2_1() { return cAttrsAssignment_2_1; }

		//Attr
		public RuleCall getAttrsAttrParserRuleCall_2_1_0() { return cAttrsAttrParserRuleCall_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class AttrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attr");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralAttrParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttrWithListParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// Individual attribute within an item
		//Attr:
		//	LiteralAttr | AttrWithList;
		public ParserRule getRule() { return rule; }

		//LiteralAttr | AttrWithList
		public Alternatives getAlternatives() { return cAlternatives; }

		//LiteralAttr
		public RuleCall getLiteralAttrParserRuleCall_0() { return cLiteralAttrParserRuleCall_0; }

		//AttrWithList
		public RuleCall getAttrWithListParserRuleCall_1() { return cAttrWithListParserRuleCall_1; }
	}

	public class AttrWithListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttrWithList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdentIDENTTerminalRuleCall_0_0 = (RuleCall)cIdentAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAttrsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttrsAttrParserRuleCall_2_0 = (RuleCall)cAttrsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAttrsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAttrsAttrParserRuleCall_3_1_0 = (RuleCall)cAttrsAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//// Attribute with a list of other attributes
		//AttrWithList:
		//	ident=IDENT "(" attrs+=Attr ("," attrs+=Attr)* ")";
		public ParserRule getRule() { return rule; }

		//ident=IDENT "(" attrs+=Attr ("," attrs+=Attr)* ")"
		public Group getGroup() { return cGroup; }

		//ident=IDENT
		public Assignment getIdentAssignment_0() { return cIdentAssignment_0; }

		//IDENT
		public RuleCall getIdentIDENTTerminalRuleCall_0_0() { return cIdentIDENTTerminalRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//attrs+=Attr
		public Assignment getAttrsAssignment_2() { return cAttrsAssignment_2; }

		//Attr
		public RuleCall getAttrsAttrParserRuleCall_2_0() { return cAttrsAttrParserRuleCall_2_0; }

		//("," attrs+=Attr)*
		public Group getGroup_3() { return cGroup_3; }

		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }

		//attrs+=Attr
		public Assignment getAttrsAssignment_3_1() { return cAttrsAssignment_3_1; }

		//Attr
		public RuleCall getAttrsAttrParserRuleCall_3_1_0() { return cAttrsAttrParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}

	public class LiteralAttrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralAttr");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdentIDENTTerminalRuleCall_0_0 = (RuleCall)cIdentAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDigitOneKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//// An attribute with a literal value
		//LiteralAttr:
		//	ident=IDENT "=" // TODO Literal (value = Literal)
		//	"1";
		public ParserRule getRule() { return rule; }

		//ident=IDENT "=" // TODO Literal (value = Literal)
		//"1"
		public Group getGroup() { return cGroup; }

		//ident=IDENT
		public Assignment getIdentAssignment_0() { return cIdentAssignment_0; }

		//IDENT
		public RuleCall getIdentIDENTTerminalRuleCall_0_0() { return cIdentIDENTTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//// TODO Literal (value = Literal)
		//"1"
		public Keyword getDigitOneKeyword_2() { return cDigitOneKeyword_2; }
	}

	public class ItemAndAttrsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ItemAndAttrs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cItemAndAttrsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAttrsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttrsItemAttrParserRuleCall_1_0 = (RuleCall)cAttrsAssignment_1.eContents().get(0);
		private final Assignment cItemAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemItemParserRuleCall_2_0 = (RuleCall)cItemAssignment_2.eContents().get(0);
		
		//// An item and any associated attributes
		//ItemAndAttrs:
		//	{ItemAndAttrs} attrs+=ItemAttr* item=Item;
		public ParserRule getRule() { return rule; }

		//{ItemAndAttrs} attrs+=ItemAttr* item=Item
		public Group getGroup() { return cGroup; }

		//{ItemAndAttrs}
		public Action getItemAndAttrsAction_0() { return cItemAndAttrsAction_0; }

		//attrs+=ItemAttr*
		public Assignment getAttrsAssignment_1() { return cAttrsAssignment_1; }

		//ItemAttr
		public RuleCall getAttrsItemAttrParserRuleCall_1_0() { return cAttrsItemAttrParserRuleCall_1_0; }

		//item=Item
		public Assignment getItemAssignment_2() { return cItemAssignment_2; }

		//Item
		public RuleCall getItemItemParserRuleCall_2_0() { return cItemItemParserRuleCall_2_0; }
	}

	public class ItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Item");
		private final RuleCall cModItemParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Items within a module or crate
		//Item: // | FnItem | TypeItem | StructItem | EnumItem | StaticItem | TraitItem | ImplItem | ExternBlock
		//	ModItem;
		public ParserRule getRule() { return rule; }

		//// | FnItem | TypeItem | StructItem | EnumItem | StaticItem | TraitItem | ImplItem | ExternBlock
		//ModItem
		public RuleCall getModItemParserRuleCall() { return cModItemParserRuleCall; }
	}

	public class ModItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdentIDENTTerminalRuleCall_1_0 = (RuleCall)cIdentAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Keyword cSemicolonKeyword_2_0 = (Keyword)cAlternatives_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		
		//// A module declaration item
		//ModItem:
		//	"mod" ident=IDENT (";" | "{" / * body = Mod * / "}");
		public ParserRule getRule() { return rule; }

		//"mod" ident=IDENT (";" | "{" / * body = Mod * / "}")
		public Group getGroup() { return cGroup; }

		//"mod"
		public Keyword getModKeyword_0() { return cModKeyword_0; }

		//ident=IDENT
		public Assignment getIdentAssignment_1() { return cIdentAssignment_1; }

		//IDENT
		public RuleCall getIdentIDENTTerminalRuleCall_1_0() { return cIdentIDENTTerminalRuleCall_1_0; }

		//";" | "{" / * body = Mod * / "}"
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//";"
		public Keyword getSemicolonKeyword_2_0() { return cSemicolonKeyword_2_0; }

		//"{" / * body = Mod * / "}"
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_1_0() { return cLeftCurlyBracketKeyword_2_1_0; }

		/// * body = Mod * / "}"
		public Keyword getRightCurlyBracketKeyword_2_1_1() { return cRightCurlyBracketKeyword_2_1_1; }
	}
	
	
	private CrateElements pCrate;
	private ItemAttrElements pItemAttr;
	private AttrElements pAttr;
	private AttrWithListElements pAttrWithList;
	private LiteralAttrElements pLiteralAttr;
	private ItemAndAttrsElements pItemAndAttrs;
	private ItemElements pItem;
	private ModItemElements pModItem;
	private TerminalRule tXID_START;
	private TerminalRule tXID_CONTINUE;
	private TerminalRule tIDENT;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RustGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.redoxi.ruste.Rust".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Top level crate and its implicit module
	//Crate:
	//	items+=ItemAndAttrs*;
	public CrateElements getCrateAccess() {
		return (pCrate != null) ? pCrate : (pCrate = new CrateElements());
	}
	
	public ParserRule getCrateRule() {
		return getCrateAccess().getRule();
	}

	//// Attribute for an item
	//ItemAttr:
	//	"#[" attrs+=Attr ("," attrs+=Attr)* "]";
	public ItemAttrElements getItemAttrAccess() {
		return (pItemAttr != null) ? pItemAttr : (pItemAttr = new ItemAttrElements());
	}
	
	public ParserRule getItemAttrRule() {
		return getItemAttrAccess().getRule();
	}

	//// Individual attribute within an item
	//Attr:
	//	LiteralAttr | AttrWithList;
	public AttrElements getAttrAccess() {
		return (pAttr != null) ? pAttr : (pAttr = new AttrElements());
	}
	
	public ParserRule getAttrRule() {
		return getAttrAccess().getRule();
	}

	//// Attribute with a list of other attributes
	//AttrWithList:
	//	ident=IDENT "(" attrs+=Attr ("," attrs+=Attr)* ")";
	public AttrWithListElements getAttrWithListAccess() {
		return (pAttrWithList != null) ? pAttrWithList : (pAttrWithList = new AttrWithListElements());
	}
	
	public ParserRule getAttrWithListRule() {
		return getAttrWithListAccess().getRule();
	}

	//// An attribute with a literal value
	//LiteralAttr:
	//	ident=IDENT "=" // TODO Literal (value = Literal)
	//	"1";
	public LiteralAttrElements getLiteralAttrAccess() {
		return (pLiteralAttr != null) ? pLiteralAttr : (pLiteralAttr = new LiteralAttrElements());
	}
	
	public ParserRule getLiteralAttrRule() {
		return getLiteralAttrAccess().getRule();
	}

	//// An item and any associated attributes
	//ItemAndAttrs:
	//	{ItemAndAttrs} attrs+=ItemAttr* item=Item;
	public ItemAndAttrsElements getItemAndAttrsAccess() {
		return (pItemAndAttrs != null) ? pItemAndAttrs : (pItemAndAttrs = new ItemAndAttrsElements());
	}
	
	public ParserRule getItemAndAttrsRule() {
		return getItemAndAttrsAccess().getRule();
	}

	//// Items within a module or crate
	//Item: // | FnItem | TypeItem | StructItem | EnumItem | StaticItem | TraitItem | ImplItem | ExternBlock
	//	ModItem;
	public ItemElements getItemAccess() {
		return (pItem != null) ? pItem : (pItem = new ItemElements());
	}
	
	public ParserRule getItemRule() {
		return getItemAccess().getRule();
	}

	//// A module declaration item
	//ModItem:
	//	"mod" ident=IDENT (";" | "{" / * body = Mod * / "}");
	public ModItemElements getModItemAccess() {
		return (pModItem != null) ? pModItem : (pModItem = new ModItemElements());
	}
	
	public ParserRule getModItemRule() {
		return getModItemAccess().getRule();
	}

	//// TODO Expand
	//terminal fragment XID_START:
	//	"a".."z";
	public TerminalRule getXID_STARTRule() {
		return (tXID_START != null) ? tXID_START : (tXID_START = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "XID_START"));
	} 

	//// TODO Expand
	//terminal fragment XID_CONTINUE:
	//	"a".."z" | "_";
	public TerminalRule getXID_CONTINUERule() {
		return (tXID_CONTINUE != null) ? tXID_CONTINUE : (tXID_CONTINUE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "XID_CONTINUE"));
	} 

	//terminal IDENT:
	//	XID_START XID_CONTINUE*;
	public TerminalRule getIDENTRule() {
		return (tIDENT != null) ? tIDENT : (tIDENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IDENT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
