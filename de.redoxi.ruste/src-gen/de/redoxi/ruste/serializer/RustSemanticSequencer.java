package de.redoxi.ruste.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.Block;
import de.redoxi.ruste.rust.BoolType;
import de.redoxi.ruste.rust.Borrow;
import de.redoxi.ruste.rust.BorrowedPointer;
import de.redoxi.ruste.rust.BoxedPointer;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.Dereference;
import de.redoxi.ruste.rust.Division;
import de.redoxi.ruste.rust.ElseTail;
import de.redoxi.ruste.rust.EnumItem;
import de.redoxi.ruste.rust.EnumVariant;
import de.redoxi.ruste.rust.ExprAddition;
import de.redoxi.ruste.rust.ExprAssign;
import de.redoxi.ruste.rust.ExprBitwiseAnd;
import de.redoxi.ruste.rust.ExprBitwiseOr;
import de.redoxi.ruste.rust.ExprBitwiseXor;
import de.redoxi.ruste.rust.ExprBooleanAnd;
import de.redoxi.ruste.rust.ExprBooleanOr;
import de.redoxi.ruste.rust.ExprBreak;
import de.redoxi.ruste.rust.ExprCast;
import de.redoxi.ruste.rust.ExprContinue;
import de.redoxi.ruste.rust.ExprDo;
import de.redoxi.ruste.rust.ExprEqualTo;
import de.redoxi.ruste.rust.ExprFor;
import de.redoxi.ruste.rust.ExprGreaterThan;
import de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo;
import de.redoxi.ruste.rust.ExprGroup;
import de.redoxi.ruste.rust.ExprIf;
import de.redoxi.ruste.rust.ExprLambda;
import de.redoxi.ruste.rust.ExprLeftShift;
import de.redoxi.ruste.rust.ExprLessThan;
import de.redoxi.ruste.rust.ExprLessThanOrEqualTo;
import de.redoxi.ruste.rust.ExprLiteral;
import de.redoxi.ruste.rust.ExprLoop;
import de.redoxi.ruste.rust.ExprMatch;
import de.redoxi.ruste.rust.ExprNotEqualTo;
import de.redoxi.ruste.rust.ExprPath;
import de.redoxi.ruste.rust.ExprPathHead;
import de.redoxi.ruste.rust.ExprRightShift;
import de.redoxi.ruste.rust.ExprStruct;
import de.redoxi.ruste.rust.ExprSubtraction;
import de.redoxi.ruste.rust.ExprTuple;
import de.redoxi.ruste.rust.ExprVec;
import de.redoxi.ruste.rust.ExprWhile;
import de.redoxi.ruste.rust.ExternBlock;
import de.redoxi.ruste.rust.FieldPat;
import de.redoxi.ruste.rust.FloatType;
import de.redoxi.ruste.rust.FnItem;
import de.redoxi.ruste.rust.ForeignFn;
import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.ImplItem;
import de.redoxi.ruste.rust.ImplMethod;
import de.redoxi.ruste.rust.IntType;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.LogicalNegation;
import de.redoxi.ruste.rust.MachineType;
import de.redoxi.ruste.rust.ManagedBox;
import de.redoxi.ruste.rust.MatchArm;
import de.redoxi.ruste.rust.MatchPat;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.Modulo;
import de.redoxi.ruste.rust.Multiplication;
import de.redoxi.ruste.rust.NamedType;
import de.redoxi.ruste.rust.NumberLit;
import de.redoxi.ruste.rust.NumericNegation;
import de.redoxi.ruste.rust.OwnedBox;
import de.redoxi.ruste.rust.OwnedPointer;
import de.redoxi.ruste.rust.PatBorrowed;
import de.redoxi.ruste.rust.PatBoxed;
import de.redoxi.ruste.rust.PatCharRange;
import de.redoxi.ruste.rust.PatEnum;
import de.redoxi.ruste.rust.PatIdent;
import de.redoxi.ruste.rust.PatLiteral;
import de.redoxi.ruste.rust.PatNumberRange;
import de.redoxi.ruste.rust.PatOwned;
import de.redoxi.ruste.rust.PatStructEnum;
import de.redoxi.ruste.rust.PatTuple;
import de.redoxi.ruste.rust.PatTupleEnum;
import de.redoxi.ruste.rust.PatVector;
import de.redoxi.ruste.rust.PatWildcard;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StaticItem;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructItem;
import de.redoxi.ruste.rust.StructVariant;
import de.redoxi.ruste.rust.TraitItem;
import de.redoxi.ruste.rust.TraitMethod;
import de.redoxi.ruste.rust.TupleVariant;
import de.redoxi.ruste.rust.TypeItem;
import de.redoxi.ruste.rust.TypePath;
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
			case RustPackage.BORROW:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getBorrowRule() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_Borrow(context, (Borrow) semanticObject); 
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
			case RustPackage.DEREFERENCE:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDereferenceRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_Dereference(context, (Dereference) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.DIVISION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_DivisionMultiplicationOrModulo(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ELSE_TAIL:
				if(context == grammarAccess.getElseTailRule()) {
					sequence_ElseTail(context, (ElseTail) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ENUM_ITEM:
				if(context == grammarAccess.getEnumItemRule() ||
				   context == grammarAccess.getItemRule()) {
					sequence_EnumItem(context, (EnumItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.ENUM_VARIANT:
				if(context == grammarAccess.getEnumVariantRule()) {
					sequence_EnumVariant(context, (EnumVariant) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_ADDITION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_AdditionOrSubtraction(context, (ExprAddition) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_ASSIGN:
				if(context == grammarAccess.getAssignRule() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprBinaryRule() ||
				   context == grammarAccess.getExprRValueRule()) {
					sequence_Assign(context, (ExprAssign) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BITWISE_AND:
				if(context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_BitwiseAnd(context, (ExprBitwiseAnd) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BITWISE_OR:
				if(context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_BitwiseOr(context, (ExprBitwiseOr) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BITWISE_XOR:
				if(context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_BitwiseXor(context, (ExprBitwiseXor) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BOOLEAN_AND:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0()) {
					sequence_BooleanAnd(context, (ExprBooleanAnd) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BOOLEAN_OR:
				if(context == grammarAccess.getBooleanOrRule()) {
					sequence_BooleanOr(context, (ExprBooleanOr) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_BREAK:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprBreakRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprBreak(context, (ExprBreak) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_CAST:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_As(context, (ExprCast) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_CONTINUE:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprContinueRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprContinue(context, (ExprContinue) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_DO:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprDoRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprDo(context, (ExprDo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_EQUAL_TO:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule()) {
					sequence_EqualityOperator(context, (ExprEqualTo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_FOR:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprForRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprFor(context, (ExprFor) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_GREATER_THAN:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_ComparisonOperators(context, (ExprGreaterThan) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_GREATER_THAN_OR_EQUAL_TO:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_ComparisonOperators(context, (ExprGreaterThanOrEqualTo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_GROUP:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprGroupRule() ||
				   context == grammarAccess.getExprGroupAccess().getExprTupleExprsAction_2_0() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprGroup(context, (ExprGroup) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_IF:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getElseTailRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprIfRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprIf(context, (ExprIf) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LAMBDA:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLambdaRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprLambda(context, (ExprLambda) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LEFT_SHIFT:
				if(context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule()) {
					sequence_ShiftOperator(context, (ExprLeftShift) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LESS_THAN:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_ComparisonOperators(context, (ExprLessThan) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LESS_THAN_OR_EQUAL_TO:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0()) {
					sequence_ComparisonOperators(context, (ExprLessThanOrEqualTo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LITERAL:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprLiteralRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprLiteral(context, (ExprLiteral) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_LOOP:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprLoopRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprLoop(context, (ExprLoop) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_MATCH:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprMatchRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprMatch(context, (ExprMatch) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_NOT_EQUAL_TO:
				if(context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule()) {
					sequence_EqualityOperator(context, (ExprNotEqualTo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_PATH:
				if(context == grammarAccess.getExprPathRule()) {
					sequence_ExprPath(context, (ExprPath) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_PATH_HEAD:
				if(context == grammarAccess.getAssignRule() ||
				   context == grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprBinaryRule() ||
				   context == grammarAccess.getExprLValueRule() ||
				   context == grammarAccess.getExprPathHeadRule() ||
				   context == grammarAccess.getExprPathHeadAccess().getExprStructPathAction_1_0_0() ||
				   context == grammarAccess.getExprPathHeadAccess().getExprTuplePathAction_1_1_0() ||
				   context == grammarAccess.getExprRValueRule()) {
					sequence_ExprPathHead(context, (ExprPathHead) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_RIGHT_SHIFT:
				if(context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule()) {
					sequence_ShiftOperator(context, (ExprRightShift) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_STRUCT:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprRValueRule()) {
					sequence_ExprPathHead_ExprRValue_ExprStruct(context, (ExprStruct) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssignRule() ||
				   context == grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0() ||
				   context == grammarAccess.getExprBinaryRule() ||
				   context == grammarAccess.getExprLValueRule() ||
				   context == grammarAccess.getExprPathHeadRule()) {
					sequence_ExprPathHead(context, (ExprStruct) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprStructRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprStruct(context, (ExprStruct) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_SUBTRACTION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_AdditionOrSubtraction(context, (ExprSubtraction) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_TUPLE:
				if(context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprRValueRule()) {
					sequence_ExprGroup_ExprPathHead_ExprRValue(context, (ExprTuple) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprGroupRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprGroup(context, (ExprTuple) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAssignRule() ||
				   context == grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0() ||
				   context == grammarAccess.getExprBinaryRule() ||
				   context == grammarAccess.getExprLValueRule() ||
				   context == grammarAccess.getExprPathHeadRule()) {
					sequence_ExprPathHead(context, (ExprTuple) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExprTupleRule()) {
					sequence_ExprTuple(context, (ExprTuple) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_VEC:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprVecRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprVec(context, (ExprVec) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXPR_WHILE:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprWhileRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ExprWhile(context, (ExprWhile) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.EXTERN_BLOCK:
				if(context == grammarAccess.getExternBlockRule() ||
				   context == grammarAccess.getItemRule()) {
					sequence_ExternBlock(context, (ExternBlock) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.FIELD_PAT:
				if(context == grammarAccess.getFieldPatRule()) {
					sequence_FieldPat(context, (FieldPat) semanticObject); 
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
			case RustPackage.FOREIGN_FN:
				if(context == grammarAccess.getForeignFnRule()) {
					sequence_ForeignFn(context, (ForeignFn) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.GENERIC_PARAM_DECL:
				if(context == grammarAccess.getGenericParamDeclRule()) {
					sequence_GenericParamDecl(context, (GenericParamDecl) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.IMPL_ITEM:
				if(context == grammarAccess.getImplItemRule() ||
				   context == grammarAccess.getItemRule()) {
					sequence_ImplItem(context, (ImplItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.IMPL_METHOD:
				if(context == grammarAccess.getImplMethodRule()) {
					sequence_ImplMethod(context, (ImplMethod) semanticObject); 
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
			case RustPackage.LOGICAL_NEGATION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getLogicalNegationRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_LogicalNegation(context, (LogicalNegation) semanticObject); 
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
			case RustPackage.MANAGED_BOX:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getManagedBoxRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_ManagedBox(context, (ManagedBox) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.MATCH_ARM:
				if(context == grammarAccess.getMatchArmRule()) {
					sequence_MatchArm(context, (MatchArm) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.MATCH_PAT:
				if(context == grammarAccess.getMatchPatRule()) {
					sequence_MatchPat(context, (MatchPat) semanticObject); 
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
			case RustPackage.MODULO:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_DivisionMultiplicationOrModulo(context, (Modulo) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.MULTIPLICATION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_DivisionMultiplicationOrModulo(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.NAMED_TYPE:
				if(context == grammarAccess.getNamedTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_NamedType(context, (NamedType) semanticObject); 
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
			case RustPackage.NUMERIC_NEGATION:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getNumericNegationRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_NumericNegation(context, (NumericNegation) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.OWNED_BOX:
				if(context == grammarAccess.getAdditionOrSubtractionRule() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0() ||
				   context == grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0() ||
				   context == grammarAccess.getAsRule() ||
				   context == grammarAccess.getAsAccess().getExprCastExprAction_1_0() ||
				   context == grammarAccess.getBitwiseAndRule() ||
				   context == grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseOrRule() ||
				   context == grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0() ||
				   context == grammarAccess.getBitwiseXorRule() ||
				   context == grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0() ||
				   context == grammarAccess.getBooleanAndRule() ||
				   context == grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0() ||
				   context == grammarAccess.getBooleanOrRule() ||
				   context == grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorsRule() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0() ||
				   context == grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloRule() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0() ||
				   context == grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0() ||
				   context == grammarAccess.getEqualityOperatorRule() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0() ||
				   context == grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0() ||
				   context == grammarAccess.getExprRule() ||
				   context == grammarAccess.getExprLeafRule() ||
				   context == grammarAccess.getExprRValueRule() ||
				   context == grammarAccess.getExprUnaryRule() ||
				   context == grammarAccess.getOwnedBoxRule() ||
				   context == grammarAccess.getShiftOperatorRule() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0() ||
				   context == grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0()) {
					sequence_OwnedBox(context, (OwnedBox) semanticObject); 
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
				if(context == grammarAccess.getPatCharRangeRule() ||
				   context == grammarAccess.getPatRangeRule()) {
					sequence_PatCharRange(context, (PatCharRange) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.PAT_ENUM:
				if(context == grammarAccess.getPatEnumAccess().getPatStructEnumPathAction_1_1_0() ||
				   context == grammarAccess.getPatEnumAccess().getPatTupleEnumPathAction_1_0_0()) {
					sequence_PatEnum_PatStructEnum_1_1_0_PatTupleEnum_1_0_0(context, (PatEnum) semanticObject); 
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
				if(context == grammarAccess.getPatNumberRangeRule() ||
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
			case RustPackage.PAT_STRUCT_ENUM:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatEnumRule()) {
					sequence_PatEnum(context, (PatStructEnum) semanticObject); 
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
			case RustPackage.PAT_TUPLE_ENUM:
				if(context == grammarAccess.getPatRule() ||
				   context == grammarAccess.getPatEnumRule()) {
					sequence_PatEnum(context, (PatTupleEnum) semanticObject); 
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
			case RustPackage.STATIC_ITEM:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getStaticItemRule()) {
					sequence_StaticItem(context, (StaticItem) semanticObject); 
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
			case RustPackage.STRUCT_ITEM:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getStructItemRule()) {
					sequence_StructItem(context, (StructItem) semanticObject); 
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
			case RustPackage.TRAIT_ITEM:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getTraitItemRule()) {
					sequence_TraitItem(context, (TraitItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.TRAIT_METHOD:
				if(context == grammarAccess.getTraitMethodRule()) {
					sequence_TraitMethod(context, (TraitMethod) semanticObject); 
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
			case RustPackage.TYPE_ITEM:
				if(context == grammarAccess.getItemRule() ||
				   context == grammarAccess.getTypeItemRule()) {
					sequence_TypeItem(context, (TypeItem) semanticObject); 
					return; 
				}
				else break;
			case RustPackage.TYPE_PATH:
				if(context == grammarAccess.getTypePathRule()) {
					sequence_TypePath(context, (TypePath) semanticObject); 
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
	 *     (left=AdditionOrSubtraction_ExprAddition_1_0_0 right=As)
	 */
	protected void sequence_AdditionOrSubtraction(EObject context, ExprAddition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionOrSubtractionAccess().getExprAdditionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditionOrSubtraction_ExprSubtraction_1_1_0 right=As)
	 */
	protected void sequence_AdditionOrSubtraction(EObject context, ExprSubtraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_SUBTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_SUBTRACTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_SUBTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_SUBTRACTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionOrSubtractionAccess().getExprSubtractionLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionOrSubtractionAccess().getRightAsParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     (expr=As_ExprCast_1_0 type=Type)
	 */
	protected void sequence_As(EObject context, ExprCast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_CAST__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_CAST__EXPR));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_CAST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_CAST__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsAccess().getExprCastExprAction_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getAsAccess().getTypeTypeParserRuleCall_1_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Assign_ExprAssign_1_0 right=ExprUnary)
	 */
	protected void sequence_Assign(EObject context, ExprAssign semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_ASSIGN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_ASSIGN__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_ASSIGN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_ASSIGN__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignAccess().getExprAssignLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAssignAccess().getRightExprUnaryParserRuleCall_1_2_0(), semanticObject.getRight());
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
	 *     (left=BitwiseAnd_ExprBitwiseAnd_1_0 right=ShiftOperator)
	 */
	protected void sequence_BitwiseAnd(EObject context, ExprBitwiseAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitwiseAndAccess().getExprBitwiseAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBitwiseAndAccess().getRightShiftOperatorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=BitwiseOr_ExprBitwiseOr_1_0 right=BitwiseXor)
	 */
	protected void sequence_BitwiseOr(EObject context, ExprBitwiseOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitwiseOrAccess().getExprBitwiseOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBitwiseOrAccess().getRightBitwiseXorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=BitwiseXor_ExprBitwiseXor_1_0 right=BitwiseAnd)
	 */
	protected void sequence_BitwiseXor(EObject context, ExprBitwiseXor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_XOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_XOR__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BITWISE_XOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BITWISE_XOR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitwiseXorAccess().getExprBitwiseXorLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBitwiseXorAccess().getRightBitwiseAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     (left=BooleanAnd_ExprBooleanAnd_1_0 right=EqualityOperator)
	 */
	protected void sequence_BooleanAnd(EObject context, ExprBooleanAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanAndAccess().getExprBooleanAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanAndAccess().getRightEqualityOperatorParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=BooleanOr_ExprBooleanOr_1_0 right=BooleanAnd)
	 */
	protected void sequence_BooleanOr(EObject context, ExprBooleanOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_BOOLEAN_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanOrAccess().getExprBooleanOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanOrAccess().getRightBooleanAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=ExprLeaf
	 */
	protected void sequence_Borrow(EObject context, Borrow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBorrowAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
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
	 *     (left=ComparisonOperators_ExprGreaterThan_1_1_0 right=BitwiseOr)
	 */
	protected void sequence_ComparisonOperators(EObject context, ExprGreaterThan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonOperators_ExprGreaterThanOrEqualTo_1_3_0 right=BitwiseOr)
	 */
	protected void sequence_ComparisonOperators(EObject context, ExprGreaterThanOrEqualTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN_OR_EQUAL_TO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN_OR_EQUAL_TO__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN_OR_EQUAL_TO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_GREATER_THAN_OR_EQUAL_TO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getExprGreaterThanOrEqualToLeftAction_1_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonOperators_ExprLessThan_1_0_0 right=BitwiseOr)
	 */
	protected void sequence_ComparisonOperators(EObject context, ExprLessThan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LESS_THAN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LESS_THAN__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LESS_THAN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LESS_THAN__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getExprLessThanLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonOperators_ExprLessThanOrEqualTo_1_2_0 right=BitwiseOr)
	 */
	protected void sequence_ComparisonOperators(EObject context, ExprLessThanOrEqualTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LESS_THAN_OR_EQUAL_TO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LESS_THAN_OR_EQUAL_TO__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LESS_THAN_OR_EQUAL_TO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LESS_THAN_OR_EQUAL_TO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getExprLessThanOrEqualToLeftAction_1_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonOperatorsAccess().getRightBitwiseOrParserRuleCall_1_2_2_0(), semanticObject.getRight());
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
	 *     expr=ExprLeaf
	 */
	protected void sequence_Dereference(EObject context, Dereference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDereferenceAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DivisionMultiplicationOrModulo_Division_1_0_0 right=ExprLeaf)
	 */
	protected void sequence_DivisionMultiplicationOrModulo(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getDivisionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DivisionMultiplicationOrModulo_Modulo_1_2_0 right=ExprLeaf)
	 */
	protected void sequence_DivisionMultiplicationOrModulo(EObject context, Modulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.MODULO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.MODULO__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.MODULO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.MODULO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getModuloLeftAction_1_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DivisionMultiplicationOrModulo_Multiplication_1_1_0 right=ExprLeaf)
	 */
	protected void sequence_DivisionMultiplicationOrModulo(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getMultiplicationLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDivisionMultiplicationOrModuloAccess().getRightExprLeafParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_ElseTail(EObject context, ElseTail semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.ELSE_TAIL__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.ELSE_TAIL__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElseTailAccess().getBlockBlockParserRuleCall_1_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? variants+=EnumVariant variants+=EnumVariant*)
	 */
	protected void sequence_EnumItem(EObject context, EnumItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT (params+=IDENT params+=IDENT*)? ((types+=Type types+=Type*) | (fields+=StructField fields+=StructField*))?)
	 */
	protected void sequence_EnumVariant(EObject context, EnumVariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualityOperator_ExprEqualTo_1_0_0 right=ComparisonOperators)
	 */
	protected void sequence_EqualityOperator(EObject context, ExprEqualTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_EQUAL_TO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_EQUAL_TO__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_EQUAL_TO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_EQUAL_TO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualityOperatorAccess().getExprEqualToLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=EqualityOperator_ExprNotEqualTo_1_1_0 right=ComparisonOperators)
	 */
	protected void sequence_EqualityOperator(EObject context, ExprNotEqualTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_NOT_EQUAL_TO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_NOT_EQUAL_TO__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_NOT_EQUAL_TO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_NOT_EQUAL_TO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualityOperatorAccess().getExprNotEqualToLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityOperatorAccess().getRightComparisonOperatorsParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lifetime=LIFETIME?)
	 */
	protected void sequence_ExprBreak(EObject context, ExprBreak semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lifetime=LIFETIME?)
	 */
	protected void sequence_ExprContinue(EObject context, ExprContinue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr (args+=IDENT args+=IDENT*)? block=Block)
	 */
	protected void sequence_ExprDo(EObject context, ExprDo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pat=Pat expr=Expr block=Block)
	 */
	protected void sequence_ExprFor(EObject context, ExprFor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_FOR__PAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_FOR__PAT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_FOR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_FOR__EXPR));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_FOR__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_FOR__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprForAccess().getPatPatParserRuleCall_1_0(), semanticObject.getPat());
		feeder.accept(grammarAccess.getExprForAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getExprForAccess().getBlockBlockParserRuleCall_4_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_ExprGroup(EObject context, ExprGroup semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_GROUP__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_GROUP__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprGroupAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (path=ExprPathHead_ExprTuple_1_1_0 tuple=ExprTuple) | 
	 *         (exprs+=ExprGroup_ExprTuple_2_0 (exprs+=Expr exprs+=Expr*)?) | 
	 *         exprs+=ExprGroup_ExprTuple_2_0
	 *     )
	 */
	protected void sequence_ExprGroup_ExprPathHead_ExprRValue(EObject context, ExprTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((exprs+=ExprGroup_ExprTuple_2_0 (exprs+=Expr exprs+=Expr*)?) | exprs+=ExprGroup_ExprTuple_2_0)
	 */
	protected void sequence_ExprGroup(EObject context, ExprTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr block=Block else=ElseTail?)
	 */
	protected void sequence_ExprIf(EObject context, ExprIf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((args+=IDENT args+=IDENT*)? expr=Expr)
	 */
	protected void sequence_ExprLambda(EObject context, ExprLambda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     literal=Literal
	 */
	protected void sequence_ExprLiteral(EObject context, ExprLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprLiteralAccess().getLiteralLiteralParserRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lifetime=LIFETIME? block=Block)
	 */
	protected void sequence_ExprLoop(EObject context, ExprLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr arms+=MatchArm arms+=MatchArm*)
	 */
	protected void sequence_ExprMatch(EObject context, ExprMatch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     path=ExprPath
	 */
	protected void sequence_ExprPathHead(EObject context, ExprPathHead semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_PATH_HEAD__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_PATH_HEAD__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprPathHeadAccess().getPathExprPathParserRuleCall_0_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((path=ExprPathHead_ExprStruct_1_0_0 struct=ExprStruct) | (fields+=StructField fields+=StructField* baseExpr=Expr?))
	 */
	protected void sequence_ExprPathHead_ExprRValue_ExprStruct(EObject context, ExprStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=ExprPathHead_ExprStruct_1_0_0 struct=ExprStruct)
	 */
	protected void sequence_ExprPathHead(EObject context, ExprStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=ExprPathHead_ExprTuple_1_1_0 tuple=ExprTuple)
	 */
	protected void sequence_ExprPathHead(EObject context, ExprTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=IDENT segments+=IDENT* ((lifetimes+=LIFETIME | genericTypes+=Type) (lifetimes+=LIFETIME | genericTypes+=Type)*)?)
	 */
	protected void sequence_ExprPath(EObject context, ExprPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fields+=StructField fields+=StructField* baseExpr=Expr?)
	 */
	protected void sequence_ExprStruct(EObject context, ExprStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprs+=Expr exprs+=Expr*)
	 */
	protected void sequence_ExprTuple(EObject context, ExprTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mutable?=MUT_KEYWORD (exprs+=Expr (lenExpr=Expr | (exprs+=Expr exprs+=Expr+)))?)
	 */
	protected void sequence_ExprVec(EObject context, ExprVec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr block=Block)
	 */
	protected void sequence_ExprWhile(EObject context, ExprWhile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_WHILE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_WHILE__EXPR));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_WHILE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_WHILE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExprWhileAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getExprWhileAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (abi=STRING_LIT? functions+=ForeignFn*)
	 */
	protected void sequence_ExternBlock(EObject context, ExternBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ident=IDENT pattern=Pat?)
	 */
	protected void sequence_FieldPat(EObject context, FieldPat semanticObject) {
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
	 *     (ident=IDENT (args+=Arg args+=Arg*)? returnType=Type?)
	 */
	protected void sequence_ForeignFn(EObject context, ForeignFn semanticObject) {
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
	 *     (trait=IDENT? struct=IDENT methods+=ImplMethod*)
	 */
	protected void sequence_ImplItem(EObject context, ImplItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (unsafe?='unsafe' | extern?='extern')? 
	 *         ident=IDENT 
	 *         (params+=GenericParamDecl params+=GenericParamDecl*)? 
	 *         (args+=Arg args+=Arg*)? 
	 *         returnType=Type? 
	 *         body=Block
	 *     )
	 */
	protected void sequence_ImplMethod(EObject context, ImplMethod semanticObject) {
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
	 *     expr=ExprLeaf
	 */
	protected void sequence_LogicalNegation(EObject context, LogicalNegation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalNegationAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=ExprLeaf
	 */
	protected void sequence_ManagedBox(EObject context, ManagedBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getManagedBoxAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (matchPat=MatchPat (expr=Expr | block=Block))
	 */
	protected void sequence_MatchArm(EObject context, MatchArm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pat=Pat endPat=Pat? expr=Expr)
	 */
	protected void sequence_MatchPat(EObject context, MatchPat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     path=TypePath
	 */
	protected void sequence_NamedType(EObject context, NamedType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.NAMED_TYPE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.NAMED_TYPE__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedTypeAccess().getPathTypePathParserRuleCall_0(), semanticObject.getPath());
		feeder.finish();
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
	 *     expr=ExprLeaf
	 */
	protected void sequence_NumericNegation(EObject context, NumericNegation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericNegationAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=ExprLeaf
	 */
	protected void sequence_OwnedBox(EObject context, OwnedBox semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_UNARY__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOwnedBoxAccess().getExprExprLeafParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
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
	 *     (path=PatEnum_PatStructEnum_1_1_0 fieldPatterns+=FieldPat fieldPatterns+=FieldPat*)
	 */
	protected void sequence_PatEnum(EObject context, PatStructEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     path=ExprPath
	 */
	protected void sequence_PatEnum_PatStructEnum_1_1_0_PatTupleEnum_1_0_0(EObject context, PatEnum semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.PAT_ENUM__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.PAT_ENUM__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatEnumAccess().getPathExprPathParserRuleCall_0_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (path=PatEnum_PatTupleEnum_1_0_0 (patterns+=Pat patterns+=Pat*)?)
	 */
	protected void sequence_PatEnum(EObject context, PatTupleEnum semanticObject) {
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
	 *     (left=ShiftOperator_ExprLeftShift_1_0_0 right=AdditionOrSubtraction)
	 */
	protected void sequence_ShiftOperator(EObject context, ExprLeftShift semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LEFT_SHIFT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LEFT_SHIFT__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_LEFT_SHIFT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_LEFT_SHIFT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShiftOperatorAccess().getExprLeftShiftLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ShiftOperator_ExprRightShift_1_1_0 right=AdditionOrSubtraction)
	 */
	protected void sequence_ShiftOperator(EObject context, ExprRightShift semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_RIGHT_SHIFT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_RIGHT_SHIFT__LEFT));
			if(transientValues.isValueTransient(semanticObject, RustPackage.Literals.EXPR_RIGHT_SHIFT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RustPackage.Literals.EXPR_RIGHT_SHIFT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShiftOperatorAccess().getExprRightShiftLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getShiftOperatorAccess().getRightAdditionOrSubtractionParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (mutable?=MUT_KEYWORD ident=IDENT type=Type? expr=Expr)
	 */
	protected void sequence_StaticItem(EObject context, StaticItem semanticObject) {
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
	protected void sequence_StructItem(EObject context, StructItem semanticObject) {
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
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? methods+=TraitMethod*)
	 */
	protected void sequence_TraitItem(EObject context, TraitItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (unsafe?='unsafe' | extern?='extern')? 
	 *         vis=Visibility? 
	 *         ident=IDENT 
	 *         (params+=GenericParamDecl params+=GenericParamDecl*)? 
	 *         (args+=Arg args+=Arg*)? 
	 *         returnType=Type? 
	 *         body=Block?
	 *     )
	 */
	protected void sequence_TraitMethod(EObject context, TraitMethod semanticObject) {
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
	 *     (ident=IDENT (params+=GenericParamDecl params+=GenericParamDecl*)? type=Type)
	 */
	protected void sequence_TypeItem(EObject context, TypeItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=IDENT segments+=IDENT* (lifetimes+=LIFETIME | genericTypes+=Type) (lifetimes+=LIFETIME | genericTypes+=Type)+)
	 */
	protected void sequence_TypePath(EObject context, TypePath semanticObject) {
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
