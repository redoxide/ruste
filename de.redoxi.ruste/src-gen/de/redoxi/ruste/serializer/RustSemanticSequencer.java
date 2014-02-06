package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.BoolType;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.FloatType;
import de.redoxi.ruste.rust.FnItem;
import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.IntType;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.MachineType;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.NumberLit;
import de.redoxi.ruste.rust.Pat;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.UnitType;
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
			case RustPackage.ARG:
				if(context == grammarAccess.getArgRule()) {
					sequence_Arg(context, (Arg) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ATTR_WITH_LIST:
				if(context == grammarAccess.getAttrRule() ||
				   context == grammarAccess.getAttrWithListRule()) {
					sequence_AttrWithList(context, (AttrWithList) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.BOOL_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (BoolType) semanticObject); 
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
			case RustPackage.FLOAT_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (FloatType) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.FN_ITEM:
				if(context == grammarAccess.getFnItemRule() ||
				   context == grammarAccess.getItemRule()) {
					sequence_FnItem(context, (FnItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.GENERIC_PARAM_DECL:
				if(context == grammarAccess.getGenericParamDeclRule()) {
					sequence_GenericParamDecl(context, (GenericParamDecl) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.INT_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (IntType) semanticObject); 
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
			case RustPackage.MACHINE_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (MachineType) semanticObject); 
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
			case RustPackage.NUMBER_LIT:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLitRule()) {
					sequence_NumberLit(context, (NumberLit) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT:
				if(context == grammarAccess.getPatRule()) {
					sequence_Pat(context, (Pat) semanticObject); 
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
			case RustPackage.UNIT_TYPE:
				if(context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType(context, (UnitType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (pat=Pat type=Type)
	 */
	protected void sequence_Arg(EObject context, Arg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.ARG__PAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.ARG__PAT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.ARG__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.ARG__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgAccess().getPatPatParserRuleCall_0_0(), semanticObject.getPat());
		feeder.accept(grammarAccess.getArgAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
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
	 *     value=CHAR_LIT
	 */
	protected void sequence_CharLit(EObject context, CharLit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharLitAccess().getValueCHAR_LITTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? (args+=Arg args+=Arg*)? returnType=Type?)
	 */
	protected void sequence_FnItem(EObject context, FnItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (bounds+=IDENT bounds+=IDENT)?)
	 */
	protected void sequence_GenericParamDecl(EObject context, GenericParamDecl semanticObject) {
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
	 *     (ident=IDENT (externalBody?=';' | items+=ItemAndAttrs*))
	 */
	protected void sequence_ModItem(EObject context, ModItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=FLOAT_LIT | value=INT_LIT)
	 */
	protected void sequence_NumberLit(EObject context, NumberLit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ident=IDENT
	 */
	protected void sequence_Pat(EObject context, Pat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatAccess().getIdentIDENTTerminalRuleCall_0(), semanticObject.getIdent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {BoolType}
	 */
	protected void sequence_PrimitiveType(EObject context, BoolType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatType}
	 */
	protected void sequence_PrimitiveType(EObject context, FloatType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_PrimitiveType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MachineType}
	 */
	protected void sequence_PrimitiveType(EObject context, MachineType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UnitType}
	 */
	protected void sequence_PrimitiveType(EObject context, UnitType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING_LIT
	 */
	protected void sequence_StringLit(EObject context, StringLit semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLitAccess().getValueSTRING_LITTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
