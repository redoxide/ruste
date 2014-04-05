package de.redoxi.ruste.ui.syntaxcolouring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import com.google.inject.Singleton

@Singleton
class RustAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	override String calculateId(String tokenName, int tokenType) {
		if ("RULE_LIFETIME".equals(tokenName)) {
			return RustHighlightingConfiguration.LIFETIME_ID
		}
		
		return super.calculateId(tokenName, tokenType)
	}
}