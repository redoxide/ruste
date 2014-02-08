package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.Block;
import de.redoxi.ruste.rust.BoolType;
import de.redoxi.ruste.rust.BorrowedPointer;
import de.redoxi.ruste.rust.BoxedPointer;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.EnumType;
import de.redoxi.ruste.rust.FloatType;
import de.redoxi.ruste.rust.FnItem;
import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.IntType;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.Lifetime;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.MachineType;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.NumberLit;
import de.redoxi.ruste.rust.OwnedPointer;
import de.redoxi.ruste.rust.PatBorrowed;
import de.redoxi.ruste.rust.PatBoxed;
import de.redoxi.ruste.rust.PatCharRange;
import de.redoxi.ruste.rust.PatEnum;
import de.redoxi.ruste.rust.PatIdent;
import de.redoxi.ruste.rust.PatLiteral;
import de.redoxi.ruste.rust.PatNumberRange;
import de.redoxi.ruste.rust.PatOwned;
import de.redoxi.ruste.rust.PatTuple;
import de.redoxi.ruste.rust.PatVector;
import de.redoxi.ruste.rust.PatWildcard;
import de.redoxi.ruste.rust.Path;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructType;
import de.redoxi.ruste.rust.StructVariant;
import de.redoxi.ruste.rust.TupleType;
import de.redoxi.ruste.rust.TupleVariant;
import de.redoxi.ruste.rust.UnitType;
import de.redoxi.ruste.rust.UnitVariant;
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
			case RustPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
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
			case RustPackage.BORROWED_POINTER:
				if(context == grammarAccess.getBorrowedPointerRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BorrowedPointer(context, (BorrowedPointer) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.BOXED_POINTER:
				if(context == grammarAccess.getBoxedPointerRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BoxedPointer(context, (BoxedPointer) semanticObject); 
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
			case RustPackage.ENUM_TYPE:
				if(context == grammarAccess.getEnumTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumType(context, (EnumType) semanticObject); 
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
			case RustPackage.LIFETIME:
				if(context == grammarAccess.getLifetimeRule()) {
					sequence_Lifetime(context, (Lifetime) semanticObject); 
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
			case RustPackage.OWNED_POINTER:
				if(context == grammarAccess.getOwnedPointerRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_OwnedPointer(context, (OwnedPointer) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_BORROWED:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatBorrowedRule()) {
					sequence_PatBorrowed(context, (PatBorrowed) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_BOXED:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatBoxedRule()) {
					sequence_PatBoxed(context, (PatBoxed) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_CHAR_RANGE:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatCharRangeRule() ||
				   context == grammarAccess.getPatRangeRule()) {
					sequence_PatCharRange(context, (PatCharRange) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_ENUM:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatEnumRule()) {
					sequence_PatEnum(context, (PatEnum) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_IDENT:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatIdentRule()) {
					sequence_PatIdent(context, (PatIdent) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_LITERAL:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatLiteralRule()) {
					sequence_PatLiteral(context, (PatLiteral) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_NUMBER_RANGE:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatNumberRangeRule() ||
				   context == grammarAccess.getPatRangeRule()) {
					sequence_PatNumberRange(context, (PatNumberRange) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_OWNED:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatOwnedRule()) {
					sequence_PatOwned(context, (PatOwned) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_TUPLE:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatTupleRule()) {
					sequence_PatTuple(context, (PatTuple) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_VECTOR:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatVectorRule()) {
					sequence_PatVector(context, (PatVector) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_WILDCARD:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatWildcardRule()) {
					sequence_PatWildcard(context, (PatWildcard) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PATH:
				if(context == grammarAccess.getPathRule()) {
					sequence_Path(context, (Path) semanticObject); 
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
			case RustPackage.STRUCT_FIELD:
				if(context == grammarAccess.getStructFieldRule()) {
					sequence_StructField(context, (StructField) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.STRUCT_TYPE:
				if(context == grammarAccess.getStructTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StructType(context, (StructType) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.STRUCT_VARIANT:
				if(context == grammarAccess.getStructVariantRule() ||
				   context == grammarAccess.getVariantRule()) {
					sequence_StructVariant(context, (StructVariant) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.TUPLE_TYPE:
				if(context == grammarAccess.getTupleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_TupleType(context, (TupleType) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.TUPLE_VARIANT:
				if(context == grammarAccess.getTupleVariantRule() ||
				   context == grammarAccess.getVariantRule()) {
					sequence_TupleVariant(context, (TupleVariant) semanticObject); 
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
			case RustPackage.UNIT_VARIANT:
				if(context == grammarAccess.getUnitVariantRule() ||
				   context == grammarAccess.getVariantRule()) {
					sequence_UnitVariant(context, (UnitVariant) semanticObject); 
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
	 *     {Block}
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_BorrowedPointer(EObject context, BorrowedPointer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.BORROWED_POINTER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.BORROWED_POINTER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBorrowedPointerAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_BoxedPointer(EObject context, BoxedPointer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.BOXED_POINTER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.BOXED_POINTER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoxedPointerAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
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
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? variants+=Variant variants+=Variant*)
	 */
	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? (args+=Arg args+=Arg*)? returnType=Type? body=Block)
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
	 *     ident=IDENT
	 */
	protected void sequence_Lifetime(EObject context, Lifetime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.LIFETIME__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.LIFETIME__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLifetimeAccess().getIdentIDENTTerminalRuleCall_1_0(), semanticObject.getIdent());
		feeder.finish();
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
	 *     type=Type
	 */
	protected void sequence_OwnedPointer(EObject context, OwnedPointer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.OWNED_POINTER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.OWNED_POINTER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOwnedPointerAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pattern=Pat
	 */
	protected void sequence_PatBorrowed(EObject context, PatBorrowed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_BORROWED__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_BORROWED__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatBorrowedAccess().getPatternPatParserRuleCall_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pattern=Pat
	 */
	protected void sequence_PatBoxed(EObject context, PatBoxed semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_BOXED__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_BOXED__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatBoxedAccess().getPatternPatParserRuleCall_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (start=CharLit end=CharLit)
	 */
	protected void sequence_PatCharRange(EObject context, PatCharRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_CHAR_RANGE__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_CHAR_RANGE__START));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_CHAR_RANGE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_CHAR_RANGE__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatCharRangeAccess().getStartCharLitParserRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getPatCharRangeAccess().getEndCharLitParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (path=Path (patterns+=Pat patterns+=Pat*)?)
	 */
	protected void sequence_PatEnum(EObject context, PatEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mutable?=MUT_KEYWORD ident=IDENT)
	 */
	protected void sequence_PatIdent(EObject context, PatIdent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_IDENT__MUTABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_IDENT__MUTABLE));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_IDENT__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_IDENT__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatIdentAccess().getMutableMUT_KEYWORDTerminalRuleCall_0_0(), semanticObject.isMutable());
		feeder.accept(grammarAccess.getPatIdentAccess().getIdentIDENTTerminalRuleCall_1_0(), semanticObject.getIdent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=Literal
	 */
	protected void sequence_PatLiteral(EObject context, PatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatLiteralAccess().getLiteralLiteralParserRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (start=NumberLit end=NumberLit)
	 */
	protected void sequence_PatNumberRange(EObject context, PatNumberRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_NUMBER_RANGE__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_NUMBER_RANGE__START));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_NUMBER_RANGE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_NUMBER_RANGE__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatNumberRangeAccess().getStartNumberLitParserRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getPatNumberRangeAccess().getEndNumberLitParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pattern=Pat
	 */
	protected void sequence_PatOwned(EObject context, PatOwned semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_OWNED__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_OWNED__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatOwnedAccess().getPatternPatParserRuleCall_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (patterns+=Pat patterns+=Pat*)
	 */
	protected void sequence_PatTuple(EObject context, PatTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (patterns+=Pat patterns+=Pat*)
	 */
	protected void sequence_PatVector(EObject context, PatVector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PatWildcard}
	 */
	protected void sequence_PatWildcard(EObject context, PatWildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=IDENT segments+=IDENT* ((lifetimes+=Lifetime | genericTypes+=Type) (lifetimes+=Lifetime | genericTypes+=Type)*)?)
	 */
	protected void sequence_Path(EObject context, Path semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	
	
	/**
	 * Constraint:
	 *     (vis=Visibility? ident=IDENT type=Type)
	 */
	protected void sequence_StructField(EObject context, StructField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? fields+=StructField fields+=StructField*)
	 */
	protected void sequence_StructType(EObject context, StructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? fields+=StructField fields+=StructField*)
	 */
	protected void sequence_StructVariant(EObject context, StructVariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=Type types+=Type*)
	 */
	protected void sequence_TupleType(EObject context, TupleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT types+=Type types+=Type*)
	 */
	protected void sequence_TupleVariant(EObject context, TupleVariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ident=IDENT
	 */
	protected void sequence_UnitVariant(EObject context, UnitVariant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.VARIANT__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.VARIANT__IDENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnitVariantAccess().getIdentIDENTTerminalRuleCall_0(), semanticObject.getIdent());
		feeder.finish();
	}
}
