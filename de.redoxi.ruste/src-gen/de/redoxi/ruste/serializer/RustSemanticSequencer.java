package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.RustPackage;
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
			case RustPackage.CRATE:
				if(context == grammarAccess.getCrateRule()) {
					sequence_Crate(context, (Crate) semanticObject); 
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
	 *     items+=ItemAndAttrs*
	 */
	protected void sequence_Crate(EObject context, Crate semanticObject) {
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
	 *     ident=IDENT
	 */
	protected void sequence_LiteralAttr(EObject context, LiteralAttr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.ATTR__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.ATTR__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAttrAccess().getIdentIDENTTerminalRuleCall_0_0(), semanticObject.getIdent());
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
}
