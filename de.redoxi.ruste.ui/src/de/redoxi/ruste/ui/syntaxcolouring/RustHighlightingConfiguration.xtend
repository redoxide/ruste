package de.redoxi.ruste.ui.syntaxcolouring

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB

class RustHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String LIFETIME_ID = "lifetime"
	
	override void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		
		acceptor.acceptDefaultHighlighting(LIFETIME_ID, "Lifetime", lifetimeTextStyle)
	}
	
	def TextStyle lifetimeTextStyle() {
		val TextStyle style = defaultTextStyle.copy
		style.setColor(new RGB(255, 0, 0))
		return style
	}
}