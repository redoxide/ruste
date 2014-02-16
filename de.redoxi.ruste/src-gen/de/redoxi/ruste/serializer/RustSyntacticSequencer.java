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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RustSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RustGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExprGroup_CommaKeyword_2_2_2_q;
	protected AbstractElementAlias match_ExprTuple_CommaKeyword_3_q;
	protected AbstractElementAlias match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RustGrammarAccess) access;
		match_ExprGroup_CommaKeyword_2_2_2_q = new TokenAlias(false, true, grammarAccess.getExprGroupAccess().getCommaKeyword_2_2_2());
		match_ExprTuple_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getExprTupleAccess().getCommaKeyword_3());
		match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatEnumAccess().getAsteriskKeyword_1_0_2_0()), new TokenAlias(false, false, grammarAccess.getPatEnumAccess().getFullStopFullStopKeyword_1_0_2_1()));
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
		else if(ruleCall.getRule() == grammarAccess.getUNIT_TYPERule())
			return getUNIT_TYPEToken(semanticObject, ruleCall, node);
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
	
	/**
	 * terminal UNIT_TYPE: "()";
	 */
	protected String getUNIT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "()";
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
			else if(match_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1.equals(syntax))
				emit_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     '*' | '..'
	 */
	protected void emit_PatEnum_AsteriskKeyword_1_0_2_0_or_FullStopFullStopKeyword_1_0_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
