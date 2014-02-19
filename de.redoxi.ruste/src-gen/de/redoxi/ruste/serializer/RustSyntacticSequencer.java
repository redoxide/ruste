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
	protected AbstractElementAlias match_ExprGroup_CommaKeyword_2_2_2_q;
	protected AbstractElementAlias match_ExprTuple_CommaKeyword_3_q;
	protected AbstractElementAlias match_FnItem_LeftParenthesisRightParenthesisKeyword_3_1_or___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__;
	protected AbstractElementAlias match_ForeignFn_LeftParenthesisRightParenthesisKeyword_2_1_or___LeftParenthesisKeyword_2_0_0_RightParenthesisKeyword_2_0_2__;
	protected AbstractElementAlias match_ImplMethod_LeftParenthesisRightParenthesisKeyword_4_1_or___LeftParenthesisKeyword_4_0_0_RightParenthesisKeyword_4_0_2__;
	protected AbstractElementAlias match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1;
	protected AbstractElementAlias match_TraitMethod_LeftParenthesisRightParenthesisKeyword_5_1_or___LeftParenthesisKeyword_5_0_0_RightParenthesisKeyword_5_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RustGrammarAccess) access;
		match_ExprGroup_CommaKeyword_2_2_2_q = new TokenAlias(false, true, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_2());
		match_ExprTuple_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
		match_FnItem_LeftParenthesisRightParenthesisKeyword_3_1_or___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFnItemAccess().getLeftParenthesisKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getFnItemAccess().getRightParenthesisKeyword_3_0_2())), new TokenAlias(false, false, grammarAccess.getFnItemAccess().getLeftParenthesisRightParenthesisKeyword_3_1()));
		match_ForeignFn_LeftParenthesisRightParenthesisKeyword_2_1_or___LeftParenthesisKeyword_2_0_0_RightParenthesisKeyword_2_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getForeignFnAccess().getLeftParenthesisKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getForeignFnAccess().getRightParenthesisKeyword_2_0_2())), new TokenAlias(false, false, grammarAccess.getForeignFnAccess().getLeftParenthesisRightParenthesisKeyword_2_1()));
		match_ImplMethod_LeftParenthesisRightParenthesisKeyword_4_1_or___LeftParenthesisKeyword_4_0_0_RightParenthesisKeyword_4_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getImplMethodAccess().getLeftParenthesisKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getImplMethodAccess().getRightParenthesisKeyword_4_0_2())), new TokenAlias(false, false, grammarAccess.getImplMethodAccess().getLeftParenthesisRightParenthesisKeyword_4_1()));
		match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0()), new TokenAlias(false, false, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1()));
		match_TraitMethod_LeftParenthesisRightParenthesisKeyword_5_1_or___LeftParenthesisKeyword_5_0_0_RightParenthesisKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTraitMethodAccess().getLeftParenthesisKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getTraitMethodAccess().getRightParenthesisKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getTraitMethodAccess().getLeftParenthesisRightParenthesisKeyword_5_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBOOLEAN_TYPERule())
			return getBOOLEAN_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFLOAT_TYPERule())
			return getFLOAT_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINT_TYPERule())
			return getINT_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMACHINE_TYPERule())
			return getMACHINE_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMUT_KEYWORDRule())
			return getMUT_KEYWORDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BOOLEAN_TYPE: "bool";
	 */
	protected String getBOOLEAN_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bool";
	}
	
	/**
	 * terminal FLOAT_TYPE: FLOAT_SIZE;
	 */
	protected String getFLOAT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "f32";
	}
	
	/**
	 * terminal INT_TYPE: INT_SIZE;
	 */
	protected String getINT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "i8";
	}
	
	/**
	 * terminal MACHINE_TYPE: MACHINE_INT_TYPE | MACHINE_UINT_TYPE;
	 */
	protected String getMACHINE_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "int";
	}
	
	/**
	 * terminal MUT_KEYWORD: 'mut';
	 */
	protected String getMUT_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "mut";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ExprGroup_CommaKeyword_2_2_2_q.equals(syntax))
				emit_ExprGroup_CommaKeyword_2_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExprTuple_CommaKeyword_3_q.equals(syntax))
				emit_ExprTuple_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FnItem_LeftParenthesisRightParenthesisKeyword_3_1_or___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__.equals(syntax))
				emit_FnItem_LeftParenthesisRightParenthesisKeyword_3_1_or___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ForeignFn_LeftParenthesisRightParenthesisKeyword_2_1_or___LeftParenthesisKeyword_2_0_0_RightParenthesisKeyword_2_0_2__.equals(syntax))
				emit_ForeignFn_LeftParenthesisRightParenthesisKeyword_2_1_or___LeftParenthesisKeyword_2_0_0_RightParenthesisKeyword_2_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImplMethod_LeftParenthesisRightParenthesisKeyword_4_1_or___LeftParenthesisKeyword_4_0_0_RightParenthesisKeyword_4_0_2__.equals(syntax))
				emit_ImplMethod_LeftParenthesisRightParenthesisKeyword_4_1_or___LeftParenthesisKeyword_4_0_0_RightParenthesisKeyword_4_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1.equals(syntax))
				emit_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TraitMethod_LeftParenthesisRightParenthesisKeyword_5_1_or___LeftParenthesisKeyword_5_0_0_RightParenthesisKeyword_5_0_2__.equals(syntax))
				emit_TraitMethod_LeftParenthesisRightParenthesisKeyword_5_1_or___LeftParenthesisKeyword_5_0_0_RightParenthesisKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ExprGroup_CommaKeyword_2_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ExprTuple_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()' | ('(' ')')
	 */
	protected void emit_FnItem_LeftParenthesisRightParenthesisKeyword_3_1_or___LeftParenthesisKeyword_3_0_0_RightParenthesisKeyword_3_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()' | ('(' ')')
	 */
	protected void emit_ForeignFn_LeftParenthesisRightParenthesisKeyword_2_1_or___LeftParenthesisKeyword_2_0_0_RightParenthesisKeyword_2_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')') | '()'
	 */
	protected void emit_ImplMethod_LeftParenthesisRightParenthesisKeyword_4_1_or___LeftParenthesisKeyword_4_0_0_RightParenthesisKeyword_4_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*' | '..'
	 */
	protected void emit_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()' | ('(' ')')
	 */
	protected void emit_TraitMethod_LeftParenthesisRightParenthesisKeyword_5_1_or___LeftParenthesisKeyword_5_0_0_RightParenthesisKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
