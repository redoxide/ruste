package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.BinIntLit;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.DecIntLit;
import de.redoxi.ruste.rust.EscapedChar;
import de.redoxi.ruste.rust.FloatLit;
import de.redoxi.ruste.rust.HexIntLit;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.OctIntLit;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringChar;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.UnicodeChar;
import de.redoxi.ruste.services.RustGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RustSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RustGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RustPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RustPackage.ATTR_WITH_LIST:
				if(context == grammarAccess.getAttrRule() ||
				   context == grammarAccess.getAttrWithListRule()) {
					sequence_AttrWithList(context, (AttrWithList) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.BIN_INT_LIT:
				if(context == grammarAccess.getBinIntLitRule() ||
				   context == grammarAccess.getIntLitRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule()) {
					sequence_BinIntLit(context, (BinIntLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.CHAR_LIT:
				if(context == grammarAccess.getCharLitRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_CharLit(context, (CharLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.CRATE:
				if(context == grammarAccess.getCrateRule()) {
					sequence_Crate(context, (Crate) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.DEC_INT_LIT:
				if(context == grammarAccess.getDecIntLitRule() ||
				   context == grammarAccess.getIntLitRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule()) {
					sequence_DecIntLit(context, (DecIntLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ESCAPED_CHAR:
				if(context == grammarAccess.getEscapedCharRule()) {
					sequence_EscapedChar(context, (EscapedChar) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.FLOAT_LIT:
				if(context == grammarAccess.getFloatLitRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule()) {
					sequence_FloatLit(context, (FloatLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.HEX_INT_LIT:
				if(context == grammarAccess.getHexIntLitRule() ||
				   context == grammarAccess.getIntLitRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule()) {
					sequence_HexIntLit(context, (HexIntLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ITEM_AND_ATTRS:
				if(context == grammarAccess.getItemAndAttrsRule()) {
					sequence_ItemAndAttrs(context, (ItemAndAttrs) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ITEM_ATTR:
				if(context == grammarAccess.getItemAttrRule()) {
					sequence_ItemAttr(context, (ItemAttr) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.LITERAL_ATTR:
				if(context == grammarAccess.getAttrRule() ||
				   context == grammarAccess.getLiteralAttrRule()) {
					sequence_LiteralAttr(context, (LiteralAttr) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.MOD_ITEM:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getModItemRule()) {
					sequence_ModItem(context, (ModItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.OCT_INT_LIT:
				if(context == grammarAccess.getIntLitRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule() ||
				   context == grammarAccess.getOctIntLitRule()) {
					sequence_OctIntLit(context, (OctIntLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.STRING_CHAR:
				if(context == grammarAccess.getStringCharRule()) {
					sequence_StringChar(context, (StringChar) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.STRING_LIT:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLitRule()) {
					sequence_StringLit(context, (StringLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.UNICODE_CHAR:
				if(context == grammarAccess.getEscapedCharRule()) {
					sequence_EscapedChar(context, (UnicodeChar) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (ident=IDENT attrs+=Attr attrs+=Attr*)
	 */
	protected void sequence_AttrWithList(EObject context, AttrWithList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((digits+='0' | digits+='1')* (unsigned?='u'? size=IntSize)?)
	 */
	protected void sequence_BinIntLit(EObject context, BinIntLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (char=NON_SPECIAL_CHAR | char='"' | char=''' | escapedChar=EscapedChar)
	 */
	protected void sequence_CharLit(EObject context, CharLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     items+=ItemAndAttrs*
	 */
	protected void sequence_Crate(EObject context, Crate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (digits+=DEC_DIGIT digits+=DEC_DIGIT* (unsigned?='u'? size=IntSize)?)
	 */
	protected void sequence_DecIntLit(EObject context, DecIntLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (char='\' | char='n' | char='r' | char='t' | char='0')
	 */
	protected void sequence_EscapedChar(EObject context, EscapedChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (digits+=HEX_DIGIT digits+=HEX_DIGIT) | 
	 *         (digits+=HEX_DIGIT digits+=HEX_DIGIT digits+=HEX_DIGIT digits+=HEX_DIGIT) | 
	 *         (
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT 
	 *             digits+=HEX_DIGIT
	 *         )
	 *     )
	 */
	protected void sequence_EscapedChar(EObject context, UnicodeChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (digits+=DEC_DIGIT digits+=DEC_DIGIT* digits+=DEC_DIGIT* (negativeExp?='-'? digits+=DEC_DIGIT*)? size=FloatSize?)
	 */
	protected void sequence_FloatLit(EObject context, FloatLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (digits+=HEX_DIGIT* (unsigned?='u'? size=IntSize)?)
	 */
	protected void sequence_HexIntLit(EObject context, HexIntLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attrs+=ItemAttr* item=Item)
	 */
	protected void sequence_ItemAndAttrs(EObject context, ItemAndAttrs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attrs+=Attr attrs+=Attr*)
	 */
	protected void sequence_ItemAttr(EObject context, ItemAttr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT value=Literal)
	 */
	protected void sequence_LiteralAttr(EObject context, LiteralAttr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.ATTR__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.ATTR__IDENT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.LITERAL_ATTR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.LITERAL_ATTR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0(), semanticObject.getIdent());
		feeder.accept(grammarAccess.getLiteralAttrAccess().getValueLiteralParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ident=IDENT
	 */
	protected void sequence_ModItem(EObject context, ModItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.MOD_ITEM__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.MOD_ITEM__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModItemAccess().getIdentIDENTTerminalRuleCall_1_0(), semanticObject.getIdent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (digits+=OCT_DIGIT* (unsigned?='u'? size=IntSize)?)
	 */
	protected void sequence_OctIntLit(EObject context, OctIntLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (char=NON_SPECIAL_CHAR | char=''' | char='"' | escapedChar=EscapedChar)
	 */
	protected void sequence_StringChar(EObject context, StringChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (chars+=StringChar*)
	 */
	protected void sequence_StringLit(EObject context, StringLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
