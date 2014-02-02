package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import de.redoxi.ruste.services.RustGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RustSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RustGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BinIntLit__Keyword_2_2_a;
	protected AbstractElementAlias match_BinIntLit__Keyword_2_2_p;
	protected AbstractElementAlias match_DecIntLit__Keyword_1_1_a;
	protected AbstractElementAlias match_FloatLit_EKeyword_3_0_0_or_EKeyword_3_0_1;
	protected AbstractElementAlias match_FloatLit_PlusSignKeyword_3_1_0_q;
	protected AbstractElementAlias match_FloatLit__Keyword_1_1_a;
	protected AbstractElementAlias match_FloatLit__Keyword_2_1_1_a;
	protected AbstractElementAlias match_FloatLit__Keyword_2_1_1_p;
	protected AbstractElementAlias match_FloatLit__Keyword_3_2_1_a;
	protected AbstractElementAlias match_FloatLit__Keyword_3_2_1_p;
	protected AbstractElementAlias match_FloatLit_____EKeyword_3_0_0_or_EKeyword_3_0_1___PlusSignKeyword_3_1_0_q__Keyword_3_2_1_p__q;
	protected AbstractElementAlias match_HexIntLit__Keyword_2_1_a;
	protected AbstractElementAlias match_HexIntLit__Keyword_2_1_p;
	protected AbstractElementAlias match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__;
	protected AbstractElementAlias match_OctIntLit__Keyword_2_1_a;
	protected AbstractElementAlias match_OctIntLit__Keyword_2_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RustGrammarAccess) access;
		match_BinIntLit__Keyword_2_2_a = new TokenAlias(true, true, grammarAccess.getBinIntLitAccess().get_Keyword_2_2());
		match_BinIntLit__Keyword_2_2_p = new TokenAlias(true, false, grammarAccess.getBinIntLitAccess().get_Keyword_2_2());
		match_DecIntLit__Keyword_1_1_a = new TokenAlias(true, true, grammarAccess.getDecIntLitAccess().get_Keyword_1_1());
		match_FloatLit_EKeyword_3_0_0_or_EKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getFloatLitAccess().getEKeyword_3_0_1()));
		match_FloatLit_PlusSignKeyword_3_1_0_q = new TokenAlias(false, true, grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0());
		match_FloatLit__Keyword_1_1_a = new TokenAlias(true, true, grammarAccess.getFloatLitAccess().get_Keyword_1_1());
		match_FloatLit__Keyword_2_1_1_a = new TokenAlias(true, true, grammarAccess.getFloatLitAccess().get_Keyword_2_1_1());
		match_FloatLit__Keyword_2_1_1_p = new TokenAlias(true, false, grammarAccess.getFloatLitAccess().get_Keyword_2_1_1());
		match_FloatLit__Keyword_3_2_1_a = new TokenAlias(true, true, grammarAccess.getFloatLitAccess().get_Keyword_3_2_1());
		match_FloatLit__Keyword_3_2_1_p = new TokenAlias(true, false, grammarAccess.getFloatLitAccess().get_Keyword_3_2_1());
		match_FloatLit_____EKeyword_3_0_0_or_EKeyword_3_0_1___PlusSignKeyword_3_1_0_q__Keyword_3_2_1_p__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFloatLitAccess().getEKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getFloatLitAccess().getEKeyword_3_0_1())), new TokenAlias(false, true, grammarAccess.getFloatLitAccess().getPlusSignKeyword_3_1_0()), new TokenAlias(true, false, grammarAccess.getFloatLitAccess().get_Keyword_3_2_1()));
		match_HexIntLit__Keyword_2_1_a = new TokenAlias(true, true, grammarAccess.getHexIntLitAccess().get_Keyword_2_1());
		match_HexIntLit__Keyword_2_1_p = new TokenAlias(true, false, grammarAccess.getHexIntLitAccess().get_Keyword_2_1());
		match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1())), new TokenAlias(false, false, grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()));
		match_OctIntLit__Keyword_2_1_a = new TokenAlias(true, true, grammarAccess.getOctIntLitAccess().get_Keyword_2_1());
		match_OctIntLit__Keyword_2_1_p = new TokenAlias(true, false, grammarAccess.getOctIntLitAccess().get_Keyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BinIntLit__Keyword_2_2_a.equals(syntax))
				emit_BinIntLit__Keyword_2_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BinIntLit__Keyword_2_2_p.equals(syntax))
				emit_BinIntLit__Keyword_2_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DecIntLit__Keyword_1_1_a.equals(syntax))
				emit_DecIntLit__Keyword_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit_EKeyword_3_0_0_or_EKeyword_3_0_1.equals(syntax))
				emit_FloatLit_EKeyword_3_0_0_or_EKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit_PlusSignKeyword_3_1_0_q.equals(syntax))
				emit_FloatLit_PlusSignKeyword_3_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit__Keyword_1_1_a.equals(syntax))
				emit_FloatLit__Keyword_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit__Keyword_2_1_1_a.equals(syntax))
				emit_FloatLit__Keyword_2_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit__Keyword_2_1_1_p.equals(syntax))
				emit_FloatLit__Keyword_2_1_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit__Keyword_3_2_1_a.equals(syntax))
				emit_FloatLit__Keyword_3_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit__Keyword_3_2_1_p.equals(syntax))
				emit_FloatLit__Keyword_3_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FloatLit_____EKeyword_3_0_0_or_EKeyword_3_0_1___PlusSignKeyword_3_1_0_q__Keyword_3_2_1_p__q.equals(syntax))
				emit_FloatLit_____EKeyword_3_0_0_or_EKeyword_3_0_1___PlusSignKeyword_3_1_0_q__Keyword_3_2_1_p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HexIntLit__Keyword_2_1_a.equals(syntax))
				emit_HexIntLit__Keyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_HexIntLit__Keyword_2_1_p.equals(syntax))
				emit_HexIntLit__Keyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__.equals(syntax))
				emit_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OctIntLit__Keyword_2_1_a.equals(syntax))
				emit_OctIntLit__Keyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OctIntLit__Keyword_2_1_p.equals(syntax))
				emit_OctIntLit__Keyword_2_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_BinIntLit__Keyword_2_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'+
	 */
	protected void emit_BinIntLit__Keyword_2_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_DecIntLit__Keyword_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'E' | 'e'
	 */
	protected void emit_FloatLit_EKeyword_3_0_0_or_EKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '+'?
	 */
	protected void emit_FloatLit_PlusSignKeyword_3_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_FloatLit__Keyword_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_FloatLit__Keyword_2_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'+
	 */
	protected void emit_FloatLit__Keyword_2_1_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_FloatLit__Keyword_3_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'+
	 */
	protected void emit_FloatLit__Keyword_3_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('E' | 'e') '+'? '_'+)?
	 */
	protected void emit_FloatLit_____EKeyword_3_0_0_or_EKeyword_3_0_1___PlusSignKeyword_3_1_0_q__Keyword_3_2_1_p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_HexIntLit__Keyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'+
	 */
	protected void emit_HexIntLit__Keyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'*
	 */
	protected void emit_OctIntLit__Keyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '_'+
	 */
	protected void emit_OctIntLit__Keyword_2_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
