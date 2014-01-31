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
	protected AbstractElementAlias match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RustGrammarAccess) access;
		match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getModItemAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getModItemAccess().getRightCurlyBracketKeyword_2_1_1())), new TokenAlias(false, false, grammarAccess.getModItemAccess().getSemicolonKeyword_2_0()));
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
			if(match_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__.equals(syntax))
				emit_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_ModItem_SemicolonKeyword_2_0_or___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
