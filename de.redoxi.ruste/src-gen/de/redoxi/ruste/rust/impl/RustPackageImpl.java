/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.AdditionOrSubtraction;
import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.As;
import de.redoxi.ruste.rust.Assign;
import de.redoxi.ruste.rust.Attr;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.BitwiseAnd;
import de.redoxi.ruste.rust.BitwiseOr;
import de.redoxi.ruste.rust.BitwiseXor;
import de.redoxi.ruste.rust.Block;
import de.redoxi.ruste.rust.BoolType;
import de.redoxi.ruste.rust.BooleanAnd;
import de.redoxi.ruste.rust.BooleanOr;
import de.redoxi.ruste.rust.Borrow;
import de.redoxi.ruste.rust.BorrowedPointer;
import de.redoxi.ruste.rust.BorrowedStrType;
import de.redoxi.ruste.rust.BoxedPointer;
import de.redoxi.ruste.rust.BoxedStrType;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.CharType;
import de.redoxi.ruste.rust.ComparisonOperators;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.Dereference;
import de.redoxi.ruste.rust.Division;
import de.redoxi.ruste.rust.DivisionMultiplicationOrModulo;
import de.redoxi.ruste.rust.ElseTail;
import de.redoxi.ruste.rust.EnumItem;
import de.redoxi.ruste.rust.EnumVariant;
import de.redoxi.ruste.rust.EqualityOperator;
import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprAddition;
import de.redoxi.ruste.rust.ExprAssign;
import de.redoxi.ruste.rust.ExprBinary;
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
import de.redoxi.ruste.rust.ExprField;
import de.redoxi.ruste.rust.ExprFor;
import de.redoxi.ruste.rust.ExprGreaterThan;
import de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo;
import de.redoxi.ruste.rust.ExprGroup;
import de.redoxi.ruste.rust.ExprIf;
import de.redoxi.ruste.rust.ExprIndex;
import de.redoxi.ruste.rust.ExprLValue;
import de.redoxi.ruste.rust.ExprLambda;
import de.redoxi.ruste.rust.ExprLeaf;
import de.redoxi.ruste.rust.ExprLeftShift;
import de.redoxi.ruste.rust.ExprLessThan;
import de.redoxi.ruste.rust.ExprLessThanOrEqualTo;
import de.redoxi.ruste.rust.ExprLiteral;
import de.redoxi.ruste.rust.ExprLoop;
import de.redoxi.ruste.rust.ExprMatch;
import de.redoxi.ruste.rust.ExprMethodCall;
import de.redoxi.ruste.rust.ExprNotEqualTo;
import de.redoxi.ruste.rust.ExprPath;
import de.redoxi.ruste.rust.ExprPathHead;
import de.redoxi.ruste.rust.ExprRValue;
import de.redoxi.ruste.rust.ExprRValue1;
import de.redoxi.ruste.rust.ExprReturn;
import de.redoxi.ruste.rust.ExprRightShift;
import de.redoxi.ruste.rust.ExprStmt;
import de.redoxi.ruste.rust.ExprStruct;
import de.redoxi.ruste.rust.ExprSubtraction;
import de.redoxi.ruste.rust.ExprTuple;
import de.redoxi.ruste.rust.ExprUnary;
import de.redoxi.ruste.rust.ExprVec;
import de.redoxi.ruste.rust.ExprWhile;
import de.redoxi.ruste.rust.ExternBlock;
import de.redoxi.ruste.rust.ExternModDecl;
import de.redoxi.ruste.rust.FieldPat;
import de.redoxi.ruste.rust.FloatType;
import de.redoxi.ruste.rust.FnItem;
import de.redoxi.ruste.rust.ForeignFn;
import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.ImplItem;
import de.redoxi.ruste.rust.ImplMethod;
import de.redoxi.ruste.rust.IntType;
import de.redoxi.ruste.rust.Item;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LinkAttr;
import de.redoxi.ruste.rust.Literal;
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
import de.redoxi.ruste.rust.OwnedStrType;
import de.redoxi.ruste.rust.Pat;
import de.redoxi.ruste.rust.PatBorrowed;
import de.redoxi.ruste.rust.PatBoxed;
import de.redoxi.ruste.rust.PatEnum;
import de.redoxi.ruste.rust.PatIdent;
import de.redoxi.ruste.rust.PatLiteral;
import de.redoxi.ruste.rust.PatOwned;
import de.redoxi.ruste.rust.PatStructEnum;
import de.redoxi.ruste.rust.PatTuple;
import de.redoxi.ruste.rust.PatTupleEnum;
import de.redoxi.ruste.rust.PatVector;
import de.redoxi.ruste.rust.PatWildcard;
import de.redoxi.ruste.rust.PathGlob;
import de.redoxi.ruste.rust.PrimitiveType;
import de.redoxi.ruste.rust.RustFactory;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.ShiftOperator;
import de.redoxi.ruste.rust.SlotDeclStmt;
import de.redoxi.ruste.rust.StaticItem;
import de.redoxi.ruste.rust.Stmt;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructItem;
import de.redoxi.ruste.rust.StructVariant;
import de.redoxi.ruste.rust.TextualType;
import de.redoxi.ruste.rust.TraitItem;
import de.redoxi.ruste.rust.TraitMethod;
import de.redoxi.ruste.rust.TupleVariant;
import de.redoxi.ruste.rust.Type;
import de.redoxi.ruste.rust.TypeItem;
import de.redoxi.ruste.rust.TypePath;
import de.redoxi.ruste.rust.UnitType;
import de.redoxi.ruste.rust.UnitVariant;
import de.redoxi.ruste.rust.UseDecl;
import de.redoxi.ruste.rust.Variant;
import de.redoxi.ruste.rust.ViewItem;
import de.redoxi.ruste.rust.Visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RustPackageImpl extends EPackageImpl implements RustPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externModDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkAttrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass useDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathGlobEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemAttrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrWithListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalAttrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemAndAttrsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fnItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traitItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traitMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreignFnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprRValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprRValue1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLeafEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprPathHeadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprTupleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprStructEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprVecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprUnaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dereferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass managedBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ownedBoxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borrowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBinaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionMultiplicationOrModuloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionOrSubtractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseXorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonOperatorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLambdaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprWhileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBreakEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprContinueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprDoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprForEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchArmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchPatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprReturnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slotDeclStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprStmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericParamDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patIdentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patBoxedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patOwnedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patBorrowedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patTupleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patVectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldPatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typePathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprPathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textualTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxedPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ownedPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borrowedPointerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitVariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charLitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprMethodCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprIndexEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprCastEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAdditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprSubtractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLeftShiftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprRightShiftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBitwiseAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBitwiseXorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBitwiseOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLessThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprGreaterThanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprLessThanOrEqualToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprGreaterThanOrEqualToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEqualToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprNotEqualToEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBooleanAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBooleanOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patTupleEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patStructEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass machineTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boxedStrTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ownedStrTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borrowedStrTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.redoxi.ruste.rust.RustPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RustPackageImpl()
  {
    super(eNS_URI, RustFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RustPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RustPackage init()
  {
    if (isInited) return (RustPackage)EPackage.Registry.INSTANCE.getEPackage(RustPackage.eNS_URI);

    // Obtain or create and register package
    RustPackageImpl theRustPackage = (RustPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RustPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RustPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRustPackage.createPackageContents();

    // Initialize created meta-data
    theRustPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRustPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RustPackage.eNS_URI, theRustPackage);
    return theRustPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCrate()
  {
    return crateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrate_ViewItems()
  {
    return (EReference)crateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrate_Items()
  {
    return (EReference)crateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewItem()
  {
    return viewItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewItem_Name()
  {
    return (EAttribute)viewItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternModDecl()
  {
    return externModDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternModDecl_Attrs()
  {
    return (EReference)externModDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternModDecl_ExternalIdent()
  {
    return (EReference)externModDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkAttr()
  {
    return linkAttrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkAttr_Ident()
  {
    return (EAttribute)linkAttrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkAttr_Value()
  {
    return (EReference)linkAttrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUseDecl()
  {
    return useDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUseDecl_Vis()
  {
    return (EAttribute)useDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDecl_ExternPath()
  {
    return (EReference)useDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUseDecl_Path()
  {
    return (EReference)useDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathGlob()
  {
    return pathGlobEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathGlob_Head()
  {
    return (EAttribute)pathGlobEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathGlob_Tail()
  {
    return (EReference)pathGlobEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemAttr()
  {
    return itemAttrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemAttr_Attrs()
  {
    return (EReference)itemAttrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttr()
  {
    return attrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttr_Name()
  {
    return (EAttribute)attrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrWithList()
  {
    return attrWithListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttrWithList_Attrs()
  {
    return (EReference)attrWithListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralAttr()
  {
    return literalAttrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralAttr_Value()
  {
    return (EReference)literalAttrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemAndAttrs()
  {
    return itemAndAttrsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemAndAttrs_Attrs()
  {
    return (EReference)itemAndAttrsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemAndAttrs_Item()
  {
    return (EReference)itemAndAttrsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModItem()
  {
    return modItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModItem_Name()
  {
    return (EAttribute)modItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModItem_ExternalBody()
  {
    return (EAttribute)modItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModItem_ViewItems()
  {
    return (EReference)modItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModItem_Items()
  {
    return (EReference)modItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFnItem()
  {
    return fnItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFnItem_Name()
  {
    return (EAttribute)fnItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_Params()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_Args()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_ReturnType()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_Body()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeItem()
  {
    return typeItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeItem_Name()
  {
    return (EAttribute)typeItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeItem_Params()
  {
    return (EReference)typeItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeItem_Type()
  {
    return (EReference)typeItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructItem()
  {
    return structItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructItem_Name()
  {
    return (EAttribute)structItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructItem_Params()
  {
    return (EReference)structItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructItem_Fields()
  {
    return (EReference)structItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumItem()
  {
    return enumItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumItem_Name()
  {
    return (EAttribute)enumItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumItem_Params()
  {
    return (EReference)enumItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumItem_Variants()
  {
    return (EReference)enumItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumVariant()
  {
    return enumVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumVariant_Name()
  {
    return (EAttribute)enumVariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumVariant_Params()
  {
    return (EAttribute)enumVariantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumVariant_Types()
  {
    return (EReference)enumVariantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumVariant_Fields()
  {
    return (EReference)enumVariantEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraitItem()
  {
    return traitItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraitItem_Name()
  {
    return (EAttribute)traitItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitItem_Params()
  {
    return (EReference)traitItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitItem_Methods()
  {
    return (EReference)traitItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraitMethod()
  {
    return traitMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraitMethod_Unsafe()
  {
    return (EAttribute)traitMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraitMethod_Extern()
  {
    return (EAttribute)traitMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraitMethod_Vis()
  {
    return (EAttribute)traitMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraitMethod_Name()
  {
    return (EAttribute)traitMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitMethod_Params()
  {
    return (EReference)traitMethodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitMethod_Args()
  {
    return (EReference)traitMethodEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitMethod_ReturnType()
  {
    return (EReference)traitMethodEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTraitMethod_Body()
  {
    return (EReference)traitMethodEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplItem()
  {
    return implItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplItem_Trait()
  {
    return (EAttribute)implItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplItem_Struct()
  {
    return (EAttribute)implItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplItem_Methods()
  {
    return (EReference)implItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplMethod()
  {
    return implMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplMethod_Unsafe()
  {
    return (EAttribute)implMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplMethod_Extern()
  {
    return (EAttribute)implMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImplMethod_Name()
  {
    return (EAttribute)implMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplMethod_Params()
  {
    return (EReference)implMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplMethod_Args()
  {
    return (EReference)implMethodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplMethod_ReturnType()
  {
    return (EReference)implMethodEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplMethod_Body()
  {
    return (EReference)implMethodEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternBlock()
  {
    return externBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternBlock_Abi()
  {
    return (EAttribute)externBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternBlock_Functions()
  {
    return (EReference)externBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeignFn()
  {
    return foreignFnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForeignFn_Name()
  {
    return (EAttribute)foreignFnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignFn_Args()
  {
    return (EReference)foreignFnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeignFn_ReturnType()
  {
    return (EReference)foreignFnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticItem()
  {
    return staticItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticItem_Mutable()
  {
    return (EAttribute)staticItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticItem_Name()
  {
    return (EAttribute)staticItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticItem_Type()
  {
    return (EReference)staticItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticItem_Expr()
  {
    return (EReference)staticItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLValue()
  {
    return exprLValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprRValue()
  {
    return exprRValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprRValue1()
  {
    return exprRValue1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLeaf()
  {
    return exprLeafEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLiteral()
  {
    return exprLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLiteral_Literal()
  {
    return (EReference)exprLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprPathHead()
  {
    return exprPathHeadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprPathHead_Path()
  {
    return (EReference)exprPathHeadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprGroup()
  {
    return exprGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprGroup_Expr()
  {
    return (EReference)exprGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprTuple()
  {
    return exprTupleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprTuple_Tuple()
  {
    return (EReference)exprTupleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprTuple_Exprs()
  {
    return (EReference)exprTupleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprStruct()
  {
    return exprStructEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprStruct_Struct()
  {
    return (EReference)exprStructEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprStruct_Fields()
  {
    return (EReference)exprStructEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprStruct_BaseExpr()
  {
    return (EReference)exprStructEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprVec()
  {
    return exprVecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprVec_Mutable()
  {
    return (EAttribute)exprVecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprVec_Exprs()
  {
    return (EReference)exprVecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprVec_LenExpr()
  {
    return (EReference)exprVecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprUnary()
  {
    return exprUnaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprUnary_Expr()
  {
    return (EReference)exprUnaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericNegation()
  {
    return numericNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDereference()
  {
    return dereferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalNegation()
  {
    return logicalNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManagedBox()
  {
    return managedBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOwnedBox()
  {
    return ownedBoxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorrow()
  {
    return borrowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBinary()
  {
    return exprBinaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivisionMultiplicationOrModulo()
  {
    return divisionMultiplicationOrModuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAs()
  {
    return asEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditionOrSubtraction()
  {
    return additionOrSubtractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShiftOperator()
  {
    return shiftOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseAnd()
  {
    return bitwiseAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseXor()
  {
    return bitwiseXorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseOr()
  {
    return bitwiseOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonOperators()
  {
    return comparisonOperatorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualityOperator()
  {
    return equalityOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanAnd()
  {
    return booleanAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanOr()
  {
    return booleanOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssign()
  {
    return assignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLambda()
  {
    return exprLambdaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprLambda_Args()
  {
    return (EAttribute)exprLambdaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLambda_Expr()
  {
    return (EReference)exprLambdaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprWhile()
  {
    return exprWhileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprWhile_Expr()
  {
    return (EReference)exprWhileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprWhile_Block()
  {
    return (EReference)exprWhileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLoop()
  {
    return exprLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprLoop_Lifetime()
  {
    return (EAttribute)exprLoopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLoop_Block()
  {
    return (EReference)exprLoopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBreak()
  {
    return exprBreakEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprBreak_Lifetime()
  {
    return (EAttribute)exprBreakEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprContinue()
  {
    return exprContinueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprContinue_Lifetime()
  {
    return (EAttribute)exprContinueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprDo()
  {
    return exprDoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprDo_Expr()
  {
    return (EReference)exprDoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprDo_Args()
  {
    return (EAttribute)exprDoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprDo_Block()
  {
    return (EReference)exprDoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprFor()
  {
    return exprForEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprFor_Pat()
  {
    return (EReference)exprForEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprFor_Expr()
  {
    return (EReference)exprForEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprFor_Block()
  {
    return (EReference)exprForEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprIf()
  {
    return exprIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprIf_Expr()
  {
    return (EReference)exprIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprIf_Else()
  {
    return (EReference)exprIfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseTail()
  {
    return elseTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseTail_Block()
  {
    return (EReference)elseTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprMatch()
  {
    return exprMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMatch_Expr()
  {
    return (EReference)exprMatchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMatch_Arms()
  {
    return (EReference)exprMatchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchArm()
  {
    return matchArmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchArm_MatchPat()
  {
    return (EReference)matchArmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchArm_Expr()
  {
    return (EReference)matchArmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchArm_Block()
  {
    return (EReference)matchArmEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchPat()
  {
    return matchPatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchPat_Pat()
  {
    return (EReference)matchPatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchPat_EndPat()
  {
    return (EReference)matchPatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchPat_Expr()
  {
    return (EReference)matchPatEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprReturn()
  {
    return exprReturnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprReturn_Expr()
  {
    return (EReference)exprReturnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Expr()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Stmts()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStmt()
  {
    return stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Expr()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlotDeclStmt()
  {
    return slotDeclStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotDeclStmt_Pat()
  {
    return (EReference)slotDeclStmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotDeclStmt_Type()
  {
    return (EReference)slotDeclStmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprStmt()
  {
    return exprStmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericParamDecl()
  {
    return genericParamDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericParamDecl_Name()
  {
    return (EAttribute)genericParamDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericParamDecl_Bounds()
  {
    return (EAttribute)genericParamDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArg()
  {
    return argEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArg_Pat()
  {
    return (EReference)argEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArg_Type()
  {
    return (EReference)argEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPat()
  {
    return patEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatWildcard()
  {
    return patWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatIdent()
  {
    return patIdentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatIdent_Mutable()
  {
    return (EAttribute)patIdentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatIdent_Name()
  {
    return (EAttribute)patIdentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatBoxed()
  {
    return patBoxedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatBoxed_Pattern()
  {
    return (EReference)patBoxedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatOwned()
  {
    return patOwnedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatOwned_Pattern()
  {
    return (EReference)patOwnedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatBorrowed()
  {
    return patBorrowedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatBorrowed_Pattern()
  {
    return (EReference)patBorrowedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatTuple()
  {
    return patTupleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatTuple_Patterns()
  {
    return (EReference)patTupleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatVector()
  {
    return patVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatVector_Patterns()
  {
    return (EReference)patVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatLiteral()
  {
    return patLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatLiteral_Literal()
  {
    return (EReference)patLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatEnum()
  {
    return patEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatEnum_Path()
  {
    return (EReference)patEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldPat()
  {
    return fieldPatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldPat_Name()
  {
    return (EAttribute)fieldPatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldPat_Pattern()
  {
    return (EReference)fieldPatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePath()
  {
    return typePathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePath_Segments()
  {
    return (EAttribute)typePathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypePath_Lifetimes()
  {
    return (EAttribute)typePathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePath_GenericTypes()
  {
    return (EReference)typePathEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprPath()
  {
    return exprPathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprPath_Segments()
  {
    return (EAttribute)exprPathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprPath_Lifetimes()
  {
    return (EAttribute)exprPathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprPath_GenericTypes()
  {
    return (EReference)exprPathEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveType()
  {
    return primitiveTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextualType()
  {
    return textualTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedType()
  {
    return namedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedType_Path()
  {
    return (EReference)namedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxedPointer()
  {
    return boxedPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBoxedPointer_Type()
  {
    return (EReference)boxedPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOwnedPointer()
  {
    return ownedPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOwnedPointer_Type()
  {
    return (EReference)ownedPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorrowedPointer()
  {
    return borrowedPointerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBorrowedPointer_Type()
  {
    return (EReference)borrowedPointerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructField()
  {
    return structFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructField_Vis()
  {
    return (EAttribute)structFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructField_Name()
  {
    return (EAttribute)structFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructField_Type()
  {
    return (EReference)structFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariant()
  {
    return variantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariant_Name()
  {
    return (EAttribute)variantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructVariant()
  {
    return structVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructVariant_Params()
  {
    return (EReference)structVariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructVariant_Fields()
  {
    return (EReference)structVariantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTupleVariant()
  {
    return tupleVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleVariant_Types()
  {
    return (EReference)tupleVariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnitVariant()
  {
    return unitVariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLit()
  {
    return stringLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Value()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLit()
  {
    return numberLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharLit()
  {
    return charLitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprField()
  {
    return exprFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprField_Expr()
  {
    return (EReference)exprFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprField_Field()
  {
    return (EAttribute)exprFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprMethodCall()
  {
    return exprMethodCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMethodCall_Method()
  {
    return (EReference)exprMethodCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprMethodCall_Args()
  {
    return (EReference)exprMethodCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprIndex()
  {
    return exprIndexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprIndex_Expr()
  {
    return (EReference)exprIndexEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprIndex_IndexExpr()
  {
    return (EReference)exprIndexEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivision()
  {
    return divisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivision_Left()
  {
    return (EReference)divisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivision_Right()
  {
    return (EReference)divisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Left()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_Right()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModulo()
  {
    return moduloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModulo_Left()
  {
    return (EReference)moduloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModulo_Right()
  {
    return (EReference)moduloEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprCast()
  {
    return exprCastEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprCast_Expr()
  {
    return (EReference)exprCastEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprCast_Type()
  {
    return (EReference)exprCastEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAddition()
  {
    return exprAdditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAddition_Left()
  {
    return (EReference)exprAdditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAddition_Right()
  {
    return (EReference)exprAdditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprSubtraction()
  {
    return exprSubtractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSubtraction_Left()
  {
    return (EReference)exprSubtractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSubtraction_Right()
  {
    return (EReference)exprSubtractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLeftShift()
  {
    return exprLeftShiftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLeftShift_Left()
  {
    return (EReference)exprLeftShiftEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLeftShift_Right()
  {
    return (EReference)exprLeftShiftEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprRightShift()
  {
    return exprRightShiftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprRightShift_Left()
  {
    return (EReference)exprRightShiftEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprRightShift_Right()
  {
    return (EReference)exprRightShiftEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBitwiseAnd()
  {
    return exprBitwiseAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseAnd_Left()
  {
    return (EReference)exprBitwiseAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseAnd_Right()
  {
    return (EReference)exprBitwiseAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBitwiseXor()
  {
    return exprBitwiseXorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseXor_Left()
  {
    return (EReference)exprBitwiseXorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseXor_Right()
  {
    return (EReference)exprBitwiseXorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBitwiseOr()
  {
    return exprBitwiseOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseOr_Left()
  {
    return (EReference)exprBitwiseOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBitwiseOr_Right()
  {
    return (EReference)exprBitwiseOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLessThan()
  {
    return exprLessThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLessThan_Left()
  {
    return (EReference)exprLessThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLessThan_Right()
  {
    return (EReference)exprLessThanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprGreaterThan()
  {
    return exprGreaterThanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprGreaterThan_Left()
  {
    return (EReference)exprGreaterThanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprGreaterThan_Right()
  {
    return (EReference)exprGreaterThanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprLessThanOrEqualTo()
  {
    return exprLessThanOrEqualToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLessThanOrEqualTo_Left()
  {
    return (EReference)exprLessThanOrEqualToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprLessThanOrEqualTo_Right()
  {
    return (EReference)exprLessThanOrEqualToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprGreaterThanOrEqualTo()
  {
    return exprGreaterThanOrEqualToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprGreaterThanOrEqualTo_Left()
  {
    return (EReference)exprGreaterThanOrEqualToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprGreaterThanOrEqualTo_Right()
  {
    return (EReference)exprGreaterThanOrEqualToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprEqualTo()
  {
    return exprEqualToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEqualTo_Left()
  {
    return (EReference)exprEqualToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEqualTo_Right()
  {
    return (EReference)exprEqualToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprNotEqualTo()
  {
    return exprNotEqualToEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprNotEqualTo_Left()
  {
    return (EReference)exprNotEqualToEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprNotEqualTo_Right()
  {
    return (EReference)exprNotEqualToEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBooleanAnd()
  {
    return exprBooleanAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBooleanAnd_Left()
  {
    return (EReference)exprBooleanAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBooleanAnd_Right()
  {
    return (EReference)exprBooleanAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBooleanOr()
  {
    return exprBooleanOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBooleanOr_Left()
  {
    return (EReference)exprBooleanOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBooleanOr_Right()
  {
    return (EReference)exprBooleanOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAssign()
  {
    return exprAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAssign_Left()
  {
    return (EReference)exprAssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAssign_Right()
  {
    return (EReference)exprAssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatTupleEnum()
  {
    return patTupleEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatTupleEnum_Patterns()
  {
    return (EReference)patTupleEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatStructEnum()
  {
    return patStructEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatStructEnum_FieldPatterns()
  {
    return (EReference)patStructEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatType()
  {
    return floatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolType()
  {
    return boolTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMachineType()
  {
    return machineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnitType()
  {
    return unitTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharType()
  {
    return charTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoxedStrType()
  {
    return boxedStrTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOwnedStrType()
  {
    return ownedStrTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorrowedStrType()
  {
    return borrowedStrTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustFactory getRustFactory()
  {
    return (RustFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    crateEClass = createEClass(CRATE);
    createEReference(crateEClass, CRATE__VIEW_ITEMS);
    createEReference(crateEClass, CRATE__ITEMS);

    viewItemEClass = createEClass(VIEW_ITEM);
    createEAttribute(viewItemEClass, VIEW_ITEM__NAME);

    externModDeclEClass = createEClass(EXTERN_MOD_DECL);
    createEReference(externModDeclEClass, EXTERN_MOD_DECL__ATTRS);
    createEReference(externModDeclEClass, EXTERN_MOD_DECL__EXTERNAL_IDENT);

    linkAttrEClass = createEClass(LINK_ATTR);
    createEAttribute(linkAttrEClass, LINK_ATTR__IDENT);
    createEReference(linkAttrEClass, LINK_ATTR__VALUE);

    useDeclEClass = createEClass(USE_DECL);
    createEAttribute(useDeclEClass, USE_DECL__VIS);
    createEReference(useDeclEClass, USE_DECL__EXTERN_PATH);
    createEReference(useDeclEClass, USE_DECL__PATH);

    pathGlobEClass = createEClass(PATH_GLOB);
    createEAttribute(pathGlobEClass, PATH_GLOB__HEAD);
    createEReference(pathGlobEClass, PATH_GLOB__TAIL);

    itemAttrEClass = createEClass(ITEM_ATTR);
    createEReference(itemAttrEClass, ITEM_ATTR__ATTRS);

    attrEClass = createEClass(ATTR);
    createEAttribute(attrEClass, ATTR__NAME);

    attrWithListEClass = createEClass(ATTR_WITH_LIST);
    createEReference(attrWithListEClass, ATTR_WITH_LIST__ATTRS);

    literalAttrEClass = createEClass(LITERAL_ATTR);
    createEReference(literalAttrEClass, LITERAL_ATTR__VALUE);

    itemAndAttrsEClass = createEClass(ITEM_AND_ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ITEM);

    itemEClass = createEClass(ITEM);

    modItemEClass = createEClass(MOD_ITEM);
    createEAttribute(modItemEClass, MOD_ITEM__NAME);
    createEAttribute(modItemEClass, MOD_ITEM__EXTERNAL_BODY);
    createEReference(modItemEClass, MOD_ITEM__VIEW_ITEMS);
    createEReference(modItemEClass, MOD_ITEM__ITEMS);

    fnItemEClass = createEClass(FN_ITEM);
    createEAttribute(fnItemEClass, FN_ITEM__NAME);
    createEReference(fnItemEClass, FN_ITEM__PARAMS);
    createEReference(fnItemEClass, FN_ITEM__ARGS);
    createEReference(fnItemEClass, FN_ITEM__RETURN_TYPE);
    createEReference(fnItemEClass, FN_ITEM__BODY);

    typeItemEClass = createEClass(TYPE_ITEM);
    createEAttribute(typeItemEClass, TYPE_ITEM__NAME);
    createEReference(typeItemEClass, TYPE_ITEM__PARAMS);
    createEReference(typeItemEClass, TYPE_ITEM__TYPE);

    structItemEClass = createEClass(STRUCT_ITEM);
    createEAttribute(structItemEClass, STRUCT_ITEM__NAME);
    createEReference(structItemEClass, STRUCT_ITEM__PARAMS);
    createEReference(structItemEClass, STRUCT_ITEM__FIELDS);

    enumItemEClass = createEClass(ENUM_ITEM);
    createEAttribute(enumItemEClass, ENUM_ITEM__NAME);
    createEReference(enumItemEClass, ENUM_ITEM__PARAMS);
    createEReference(enumItemEClass, ENUM_ITEM__VARIANTS);

    enumVariantEClass = createEClass(ENUM_VARIANT);
    createEAttribute(enumVariantEClass, ENUM_VARIANT__NAME);
    createEAttribute(enumVariantEClass, ENUM_VARIANT__PARAMS);
    createEReference(enumVariantEClass, ENUM_VARIANT__TYPES);
    createEReference(enumVariantEClass, ENUM_VARIANT__FIELDS);

    traitItemEClass = createEClass(TRAIT_ITEM);
    createEAttribute(traitItemEClass, TRAIT_ITEM__NAME);
    createEReference(traitItemEClass, TRAIT_ITEM__PARAMS);
    createEReference(traitItemEClass, TRAIT_ITEM__METHODS);

    traitMethodEClass = createEClass(TRAIT_METHOD);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__UNSAFE);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__EXTERN);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__VIS);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__NAME);
    createEReference(traitMethodEClass, TRAIT_METHOD__PARAMS);
    createEReference(traitMethodEClass, TRAIT_METHOD__ARGS);
    createEReference(traitMethodEClass, TRAIT_METHOD__RETURN_TYPE);
    createEReference(traitMethodEClass, TRAIT_METHOD__BODY);

    implItemEClass = createEClass(IMPL_ITEM);
    createEAttribute(implItemEClass, IMPL_ITEM__TRAIT);
    createEAttribute(implItemEClass, IMPL_ITEM__STRUCT);
    createEReference(implItemEClass, IMPL_ITEM__METHODS);

    implMethodEClass = createEClass(IMPL_METHOD);
    createEAttribute(implMethodEClass, IMPL_METHOD__UNSAFE);
    createEAttribute(implMethodEClass, IMPL_METHOD__EXTERN);
    createEAttribute(implMethodEClass, IMPL_METHOD__NAME);
    createEReference(implMethodEClass, IMPL_METHOD__PARAMS);
    createEReference(implMethodEClass, IMPL_METHOD__ARGS);
    createEReference(implMethodEClass, IMPL_METHOD__RETURN_TYPE);
    createEReference(implMethodEClass, IMPL_METHOD__BODY);

    externBlockEClass = createEClass(EXTERN_BLOCK);
    createEAttribute(externBlockEClass, EXTERN_BLOCK__ABI);
    createEReference(externBlockEClass, EXTERN_BLOCK__FUNCTIONS);

    foreignFnEClass = createEClass(FOREIGN_FN);
    createEAttribute(foreignFnEClass, FOREIGN_FN__NAME);
    createEReference(foreignFnEClass, FOREIGN_FN__ARGS);
    createEReference(foreignFnEClass, FOREIGN_FN__RETURN_TYPE);

    staticItemEClass = createEClass(STATIC_ITEM);
    createEAttribute(staticItemEClass, STATIC_ITEM__MUTABLE);
    createEAttribute(staticItemEClass, STATIC_ITEM__NAME);
    createEReference(staticItemEClass, STATIC_ITEM__TYPE);
    createEReference(staticItemEClass, STATIC_ITEM__EXPR);

    exprEClass = createEClass(EXPR);

    exprLValueEClass = createEClass(EXPR_LVALUE);

    exprRValueEClass = createEClass(EXPR_RVALUE);

    exprRValue1EClass = createEClass(EXPR_RVALUE1);

    exprLeafEClass = createEClass(EXPR_LEAF);

    exprLiteralEClass = createEClass(EXPR_LITERAL);
    createEReference(exprLiteralEClass, EXPR_LITERAL__LITERAL);

    exprPathHeadEClass = createEClass(EXPR_PATH_HEAD);
    createEReference(exprPathHeadEClass, EXPR_PATH_HEAD__PATH);

    exprGroupEClass = createEClass(EXPR_GROUP);
    createEReference(exprGroupEClass, EXPR_GROUP__EXPR);

    exprTupleEClass = createEClass(EXPR_TUPLE);
    createEReference(exprTupleEClass, EXPR_TUPLE__TUPLE);
    createEReference(exprTupleEClass, EXPR_TUPLE__EXPRS);

    exprStructEClass = createEClass(EXPR_STRUCT);
    createEReference(exprStructEClass, EXPR_STRUCT__STRUCT);
    createEReference(exprStructEClass, EXPR_STRUCT__FIELDS);
    createEReference(exprStructEClass, EXPR_STRUCT__BASE_EXPR);

    exprVecEClass = createEClass(EXPR_VEC);
    createEAttribute(exprVecEClass, EXPR_VEC__MUTABLE);
    createEReference(exprVecEClass, EXPR_VEC__EXPRS);
    createEReference(exprVecEClass, EXPR_VEC__LEN_EXPR);

    exprUnaryEClass = createEClass(EXPR_UNARY);
    createEReference(exprUnaryEClass, EXPR_UNARY__EXPR);

    numericNegationEClass = createEClass(NUMERIC_NEGATION);

    dereferenceEClass = createEClass(DEREFERENCE);

    logicalNegationEClass = createEClass(LOGICAL_NEGATION);

    managedBoxEClass = createEClass(MANAGED_BOX);

    ownedBoxEClass = createEClass(OWNED_BOX);

    borrowEClass = createEClass(BORROW);

    exprBinaryEClass = createEClass(EXPR_BINARY);

    divisionMultiplicationOrModuloEClass = createEClass(DIVISION_MULTIPLICATION_OR_MODULO);

    asEClass = createEClass(AS);

    additionOrSubtractionEClass = createEClass(ADDITION_OR_SUBTRACTION);

    shiftOperatorEClass = createEClass(SHIFT_OPERATOR);

    bitwiseAndEClass = createEClass(BITWISE_AND);

    bitwiseXorEClass = createEClass(BITWISE_XOR);

    bitwiseOrEClass = createEClass(BITWISE_OR);

    comparisonOperatorsEClass = createEClass(COMPARISON_OPERATORS);

    equalityOperatorEClass = createEClass(EQUALITY_OPERATOR);

    booleanAndEClass = createEClass(BOOLEAN_AND);

    booleanOrEClass = createEClass(BOOLEAN_OR);

    assignEClass = createEClass(ASSIGN);

    exprLambdaEClass = createEClass(EXPR_LAMBDA);
    createEAttribute(exprLambdaEClass, EXPR_LAMBDA__ARGS);
    createEReference(exprLambdaEClass, EXPR_LAMBDA__EXPR);

    exprWhileEClass = createEClass(EXPR_WHILE);
    createEReference(exprWhileEClass, EXPR_WHILE__EXPR);
    createEReference(exprWhileEClass, EXPR_WHILE__BLOCK);

    exprLoopEClass = createEClass(EXPR_LOOP);
    createEAttribute(exprLoopEClass, EXPR_LOOP__LIFETIME);
    createEReference(exprLoopEClass, EXPR_LOOP__BLOCK);

    exprBreakEClass = createEClass(EXPR_BREAK);
    createEAttribute(exprBreakEClass, EXPR_BREAK__LIFETIME);

    exprContinueEClass = createEClass(EXPR_CONTINUE);
    createEAttribute(exprContinueEClass, EXPR_CONTINUE__LIFETIME);

    exprDoEClass = createEClass(EXPR_DO);
    createEReference(exprDoEClass, EXPR_DO__EXPR);
    createEAttribute(exprDoEClass, EXPR_DO__ARGS);
    createEReference(exprDoEClass, EXPR_DO__BLOCK);

    exprForEClass = createEClass(EXPR_FOR);
    createEReference(exprForEClass, EXPR_FOR__PAT);
    createEReference(exprForEClass, EXPR_FOR__EXPR);
    createEReference(exprForEClass, EXPR_FOR__BLOCK);

    exprIfEClass = createEClass(EXPR_IF);
    createEReference(exprIfEClass, EXPR_IF__EXPR);
    createEReference(exprIfEClass, EXPR_IF__ELSE);

    elseTailEClass = createEClass(ELSE_TAIL);
    createEReference(elseTailEClass, ELSE_TAIL__BLOCK);

    exprMatchEClass = createEClass(EXPR_MATCH);
    createEReference(exprMatchEClass, EXPR_MATCH__EXPR);
    createEReference(exprMatchEClass, EXPR_MATCH__ARMS);

    matchArmEClass = createEClass(MATCH_ARM);
    createEReference(matchArmEClass, MATCH_ARM__MATCH_PAT);
    createEReference(matchArmEClass, MATCH_ARM__EXPR);
    createEReference(matchArmEClass, MATCH_ARM__BLOCK);

    matchPatEClass = createEClass(MATCH_PAT);
    createEReference(matchPatEClass, MATCH_PAT__PAT);
    createEReference(matchPatEClass, MATCH_PAT__END_PAT);
    createEReference(matchPatEClass, MATCH_PAT__EXPR);

    exprReturnEClass = createEClass(EXPR_RETURN);
    createEReference(exprReturnEClass, EXPR_RETURN__EXPR);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__EXPR);
    createEReference(blockEClass, BLOCK__STMTS);

    stmtEClass = createEClass(STMT);
    createEReference(stmtEClass, STMT__EXPR);

    slotDeclStmtEClass = createEClass(SLOT_DECL_STMT);
    createEReference(slotDeclStmtEClass, SLOT_DECL_STMT__PAT);
    createEReference(slotDeclStmtEClass, SLOT_DECL_STMT__TYPE);

    exprStmtEClass = createEClass(EXPR_STMT);

    genericParamDeclEClass = createEClass(GENERIC_PARAM_DECL);
    createEAttribute(genericParamDeclEClass, GENERIC_PARAM_DECL__NAME);
    createEAttribute(genericParamDeclEClass, GENERIC_PARAM_DECL__BOUNDS);

    argEClass = createEClass(ARG);
    createEReference(argEClass, ARG__PAT);
    createEReference(argEClass, ARG__TYPE);

    patEClass = createEClass(PAT);

    patWildcardEClass = createEClass(PAT_WILDCARD);

    patIdentEClass = createEClass(PAT_IDENT);
    createEAttribute(patIdentEClass, PAT_IDENT__MUTABLE);
    createEAttribute(patIdentEClass, PAT_IDENT__NAME);

    patBoxedEClass = createEClass(PAT_BOXED);
    createEReference(patBoxedEClass, PAT_BOXED__PATTERN);

    patOwnedEClass = createEClass(PAT_OWNED);
    createEReference(patOwnedEClass, PAT_OWNED__PATTERN);

    patBorrowedEClass = createEClass(PAT_BORROWED);
    createEReference(patBorrowedEClass, PAT_BORROWED__PATTERN);

    patTupleEClass = createEClass(PAT_TUPLE);
    createEReference(patTupleEClass, PAT_TUPLE__PATTERNS);

    patVectorEClass = createEClass(PAT_VECTOR);
    createEReference(patVectorEClass, PAT_VECTOR__PATTERNS);

    patLiteralEClass = createEClass(PAT_LITERAL);
    createEReference(patLiteralEClass, PAT_LITERAL__LITERAL);

    patEnumEClass = createEClass(PAT_ENUM);
    createEReference(patEnumEClass, PAT_ENUM__PATH);

    fieldPatEClass = createEClass(FIELD_PAT);
    createEAttribute(fieldPatEClass, FIELD_PAT__NAME);
    createEReference(fieldPatEClass, FIELD_PAT__PATTERN);

    typePathEClass = createEClass(TYPE_PATH);
    createEAttribute(typePathEClass, TYPE_PATH__SEGMENTS);
    createEAttribute(typePathEClass, TYPE_PATH__LIFETIMES);
    createEReference(typePathEClass, TYPE_PATH__GENERIC_TYPES);

    exprPathEClass = createEClass(EXPR_PATH);
    createEAttribute(exprPathEClass, EXPR_PATH__SEGMENTS);
    createEAttribute(exprPathEClass, EXPR_PATH__LIFETIMES);
    createEReference(exprPathEClass, EXPR_PATH__GENERIC_TYPES);

    typeEClass = createEClass(TYPE);

    primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

    textualTypeEClass = createEClass(TEXTUAL_TYPE);

    namedTypeEClass = createEClass(NAMED_TYPE);
    createEReference(namedTypeEClass, NAMED_TYPE__PATH);

    boxedPointerEClass = createEClass(BOXED_POINTER);
    createEReference(boxedPointerEClass, BOXED_POINTER__TYPE);

    ownedPointerEClass = createEClass(OWNED_POINTER);
    createEReference(ownedPointerEClass, OWNED_POINTER__TYPE);

    borrowedPointerEClass = createEClass(BORROWED_POINTER);
    createEReference(borrowedPointerEClass, BORROWED_POINTER__TYPE);

    structFieldEClass = createEClass(STRUCT_FIELD);
    createEAttribute(structFieldEClass, STRUCT_FIELD__VIS);
    createEAttribute(structFieldEClass, STRUCT_FIELD__NAME);
    createEReference(structFieldEClass, STRUCT_FIELD__TYPE);

    variantEClass = createEClass(VARIANT);
    createEAttribute(variantEClass, VARIANT__NAME);

    structVariantEClass = createEClass(STRUCT_VARIANT);
    createEReference(structVariantEClass, STRUCT_VARIANT__PARAMS);
    createEReference(structVariantEClass, STRUCT_VARIANT__FIELDS);

    tupleVariantEClass = createEClass(TUPLE_VARIANT);
    createEReference(tupleVariantEClass, TUPLE_VARIANT__TYPES);

    unitVariantEClass = createEClass(UNIT_VARIANT);

    stringLitEClass = createEClass(STRING_LIT);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__VALUE);

    numberLitEClass = createEClass(NUMBER_LIT);

    charLitEClass = createEClass(CHAR_LIT);

    exprFieldEClass = createEClass(EXPR_FIELD);
    createEReference(exprFieldEClass, EXPR_FIELD__EXPR);
    createEAttribute(exprFieldEClass, EXPR_FIELD__FIELD);

    exprMethodCallEClass = createEClass(EXPR_METHOD_CALL);
    createEReference(exprMethodCallEClass, EXPR_METHOD_CALL__METHOD);
    createEReference(exprMethodCallEClass, EXPR_METHOD_CALL__ARGS);

    exprIndexEClass = createEClass(EXPR_INDEX);
    createEReference(exprIndexEClass, EXPR_INDEX__EXPR);
    createEReference(exprIndexEClass, EXPR_INDEX__INDEX_EXPR);

    divisionEClass = createEClass(DIVISION);
    createEReference(divisionEClass, DIVISION__LEFT);
    createEReference(divisionEClass, DIVISION__RIGHT);

    multiplicationEClass = createEClass(MULTIPLICATION);
    createEReference(multiplicationEClass, MULTIPLICATION__LEFT);
    createEReference(multiplicationEClass, MULTIPLICATION__RIGHT);

    moduloEClass = createEClass(MODULO);
    createEReference(moduloEClass, MODULO__LEFT);
    createEReference(moduloEClass, MODULO__RIGHT);

    exprCastEClass = createEClass(EXPR_CAST);
    createEReference(exprCastEClass, EXPR_CAST__EXPR);
    createEReference(exprCastEClass, EXPR_CAST__TYPE);

    exprAdditionEClass = createEClass(EXPR_ADDITION);
    createEReference(exprAdditionEClass, EXPR_ADDITION__LEFT);
    createEReference(exprAdditionEClass, EXPR_ADDITION__RIGHT);

    exprSubtractionEClass = createEClass(EXPR_SUBTRACTION);
    createEReference(exprSubtractionEClass, EXPR_SUBTRACTION__LEFT);
    createEReference(exprSubtractionEClass, EXPR_SUBTRACTION__RIGHT);

    exprLeftShiftEClass = createEClass(EXPR_LEFT_SHIFT);
    createEReference(exprLeftShiftEClass, EXPR_LEFT_SHIFT__LEFT);
    createEReference(exprLeftShiftEClass, EXPR_LEFT_SHIFT__RIGHT);

    exprRightShiftEClass = createEClass(EXPR_RIGHT_SHIFT);
    createEReference(exprRightShiftEClass, EXPR_RIGHT_SHIFT__LEFT);
    createEReference(exprRightShiftEClass, EXPR_RIGHT_SHIFT__RIGHT);

    exprBitwiseAndEClass = createEClass(EXPR_BITWISE_AND);
    createEReference(exprBitwiseAndEClass, EXPR_BITWISE_AND__LEFT);
    createEReference(exprBitwiseAndEClass, EXPR_BITWISE_AND__RIGHT);

    exprBitwiseXorEClass = createEClass(EXPR_BITWISE_XOR);
    createEReference(exprBitwiseXorEClass, EXPR_BITWISE_XOR__LEFT);
    createEReference(exprBitwiseXorEClass, EXPR_BITWISE_XOR__RIGHT);

    exprBitwiseOrEClass = createEClass(EXPR_BITWISE_OR);
    createEReference(exprBitwiseOrEClass, EXPR_BITWISE_OR__LEFT);
    createEReference(exprBitwiseOrEClass, EXPR_BITWISE_OR__RIGHT);

    exprLessThanEClass = createEClass(EXPR_LESS_THAN);
    createEReference(exprLessThanEClass, EXPR_LESS_THAN__LEFT);
    createEReference(exprLessThanEClass, EXPR_LESS_THAN__RIGHT);

    exprGreaterThanEClass = createEClass(EXPR_GREATER_THAN);
    createEReference(exprGreaterThanEClass, EXPR_GREATER_THAN__LEFT);
    createEReference(exprGreaterThanEClass, EXPR_GREATER_THAN__RIGHT);

    exprLessThanOrEqualToEClass = createEClass(EXPR_LESS_THAN_OR_EQUAL_TO);
    createEReference(exprLessThanOrEqualToEClass, EXPR_LESS_THAN_OR_EQUAL_TO__LEFT);
    createEReference(exprLessThanOrEqualToEClass, EXPR_LESS_THAN_OR_EQUAL_TO__RIGHT);

    exprGreaterThanOrEqualToEClass = createEClass(EXPR_GREATER_THAN_OR_EQUAL_TO);
    createEReference(exprGreaterThanOrEqualToEClass, EXPR_GREATER_THAN_OR_EQUAL_TO__LEFT);
    createEReference(exprGreaterThanOrEqualToEClass, EXPR_GREATER_THAN_OR_EQUAL_TO__RIGHT);

    exprEqualToEClass = createEClass(EXPR_EQUAL_TO);
    createEReference(exprEqualToEClass, EXPR_EQUAL_TO__LEFT);
    createEReference(exprEqualToEClass, EXPR_EQUAL_TO__RIGHT);

    exprNotEqualToEClass = createEClass(EXPR_NOT_EQUAL_TO);
    createEReference(exprNotEqualToEClass, EXPR_NOT_EQUAL_TO__LEFT);
    createEReference(exprNotEqualToEClass, EXPR_NOT_EQUAL_TO__RIGHT);

    exprBooleanAndEClass = createEClass(EXPR_BOOLEAN_AND);
    createEReference(exprBooleanAndEClass, EXPR_BOOLEAN_AND__LEFT);
    createEReference(exprBooleanAndEClass, EXPR_BOOLEAN_AND__RIGHT);

    exprBooleanOrEClass = createEClass(EXPR_BOOLEAN_OR);
    createEReference(exprBooleanOrEClass, EXPR_BOOLEAN_OR__LEFT);
    createEReference(exprBooleanOrEClass, EXPR_BOOLEAN_OR__RIGHT);

    exprAssignEClass = createEClass(EXPR_ASSIGN);
    createEReference(exprAssignEClass, EXPR_ASSIGN__LEFT);
    createEReference(exprAssignEClass, EXPR_ASSIGN__RIGHT);

    patTupleEnumEClass = createEClass(PAT_TUPLE_ENUM);
    createEReference(patTupleEnumEClass, PAT_TUPLE_ENUM__PATTERNS);

    patStructEnumEClass = createEClass(PAT_STRUCT_ENUM);
    createEReference(patStructEnumEClass, PAT_STRUCT_ENUM__FIELD_PATTERNS);

    intTypeEClass = createEClass(INT_TYPE);

    floatTypeEClass = createEClass(FLOAT_TYPE);

    boolTypeEClass = createEClass(BOOL_TYPE);

    machineTypeEClass = createEClass(MACHINE_TYPE);

    unitTypeEClass = createEClass(UNIT_TYPE);

    charTypeEClass = createEClass(CHAR_TYPE);

    boxedStrTypeEClass = createEClass(BOXED_STR_TYPE);

    ownedStrTypeEClass = createEClass(OWNED_STR_TYPE);

    borrowedStrTypeEClass = createEClass(BORROWED_STR_TYPE);

    // Create enums
    visibilityEEnum = createEEnum(VISIBILITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    externModDeclEClass.getESuperTypes().add(this.getViewItem());
    useDeclEClass.getESuperTypes().add(this.getViewItem());
    attrWithListEClass.getESuperTypes().add(this.getAttr());
    literalAttrEClass.getESuperTypes().add(this.getAttr());
    modItemEClass.getESuperTypes().add(this.getItem());
    fnItemEClass.getESuperTypes().add(this.getItem());
    typeItemEClass.getESuperTypes().add(this.getItem());
    structItemEClass.getESuperTypes().add(this.getItem());
    enumItemEClass.getESuperTypes().add(this.getItem());
    traitItemEClass.getESuperTypes().add(this.getItem());
    implItemEClass.getESuperTypes().add(this.getItem());
    externBlockEClass.getESuperTypes().add(this.getItem());
    staticItemEClass.getESuperTypes().add(this.getItem());
    exprLValueEClass.getESuperTypes().add(this.getExprLeaf());
    exprLValueEClass.getESuperTypes().add(this.getAssign());
    exprRValueEClass.getESuperTypes().add(this.getExpr());
    exprRValue1EClass.getESuperTypes().add(this.getDivisionMultiplicationOrModulo());
    exprLeafEClass.getESuperTypes().add(this.getExprRValue1());
    exprLiteralEClass.getESuperTypes().add(this.getExprLeaf());
    exprPathHeadEClass.getESuperTypes().add(this.getExprLValue());
    exprGroupEClass.getESuperTypes().add(this.getExprLeaf());
    exprTupleEClass.getESuperTypes().add(this.getExprPathHead());
    exprTupleEClass.getESuperTypes().add(this.getExprGroup());
    exprStructEClass.getESuperTypes().add(this.getExprLeaf());
    exprStructEClass.getESuperTypes().add(this.getExprPathHead());
    exprVecEClass.getESuperTypes().add(this.getExprLeaf());
    exprUnaryEClass.getESuperTypes().add(this.getExprLeaf());
    numericNegationEClass.getESuperTypes().add(this.getExprUnary());
    dereferenceEClass.getESuperTypes().add(this.getExprUnary());
    logicalNegationEClass.getESuperTypes().add(this.getExprUnary());
    managedBoxEClass.getESuperTypes().add(this.getExprUnary());
    ownedBoxEClass.getESuperTypes().add(this.getExprUnary());
    borrowEClass.getESuperTypes().add(this.getExprUnary());
    exprBinaryEClass.getESuperTypes().add(this.getExprRValue());
    divisionMultiplicationOrModuloEClass.getESuperTypes().add(this.getAs());
    asEClass.getESuperTypes().add(this.getAdditionOrSubtraction());
    additionOrSubtractionEClass.getESuperTypes().add(this.getShiftOperator());
    shiftOperatorEClass.getESuperTypes().add(this.getBitwiseAnd());
    bitwiseAndEClass.getESuperTypes().add(this.getBitwiseXor());
    bitwiseXorEClass.getESuperTypes().add(this.getBitwiseOr());
    bitwiseOrEClass.getESuperTypes().add(this.getComparisonOperators());
    comparisonOperatorsEClass.getESuperTypes().add(this.getEqualityOperator());
    equalityOperatorEClass.getESuperTypes().add(this.getBooleanAnd());
    booleanAndEClass.getESuperTypes().add(this.getBooleanOr());
    assignEClass.getESuperTypes().add(this.getExprBinary());
    exprLambdaEClass.getESuperTypes().add(this.getExprLeaf());
    exprWhileEClass.getESuperTypes().add(this.getExprLeaf());
    exprLoopEClass.getESuperTypes().add(this.getExprLeaf());
    exprBreakEClass.getESuperTypes().add(this.getExprLeaf());
    exprContinueEClass.getESuperTypes().add(this.getExprLeaf());
    exprDoEClass.getESuperTypes().add(this.getExprLeaf());
    exprForEClass.getESuperTypes().add(this.getExprLeaf());
    exprIfEClass.getESuperTypes().add(this.getExprLeaf());
    exprIfEClass.getESuperTypes().add(this.getElseTail());
    exprMatchEClass.getESuperTypes().add(this.getExprLeaf());
    exprReturnEClass.getESuperTypes().add(this.getExprLeaf());
    slotDeclStmtEClass.getESuperTypes().add(this.getStmt());
    exprStmtEClass.getESuperTypes().add(this.getStmt());
    patWildcardEClass.getESuperTypes().add(this.getPat());
    patIdentEClass.getESuperTypes().add(this.getPat());
    patBoxedEClass.getESuperTypes().add(this.getPat());
    patOwnedEClass.getESuperTypes().add(this.getPat());
    patBorrowedEClass.getESuperTypes().add(this.getPat());
    patTupleEClass.getESuperTypes().add(this.getPat());
    patVectorEClass.getESuperTypes().add(this.getPat());
    patLiteralEClass.getESuperTypes().add(this.getPat());
    primitiveTypeEClass.getESuperTypes().add(this.getType());
    textualTypeEClass.getESuperTypes().add(this.getType());
    namedTypeEClass.getESuperTypes().add(this.getType());
    boxedPointerEClass.getESuperTypes().add(this.getType());
    ownedPointerEClass.getESuperTypes().add(this.getType());
    borrowedPointerEClass.getESuperTypes().add(this.getType());
    structVariantEClass.getESuperTypes().add(this.getVariant());
    tupleVariantEClass.getESuperTypes().add(this.getVariant());
    unitVariantEClass.getESuperTypes().add(this.getVariant());
    stringLitEClass.getESuperTypes().add(this.getLiteral());
    numberLitEClass.getESuperTypes().add(this.getLiteral());
    charLitEClass.getESuperTypes().add(this.getLiteral());
    exprFieldEClass.getESuperTypes().add(this.getExprRValue1());
    exprMethodCallEClass.getESuperTypes().add(this.getExprRValue1());
    exprIndexEClass.getESuperTypes().add(this.getExprRValue1());
    divisionEClass.getESuperTypes().add(this.getDivisionMultiplicationOrModulo());
    multiplicationEClass.getESuperTypes().add(this.getDivisionMultiplicationOrModulo());
    moduloEClass.getESuperTypes().add(this.getDivisionMultiplicationOrModulo());
    exprCastEClass.getESuperTypes().add(this.getAs());
    exprAdditionEClass.getESuperTypes().add(this.getAdditionOrSubtraction());
    exprSubtractionEClass.getESuperTypes().add(this.getAdditionOrSubtraction());
    exprLeftShiftEClass.getESuperTypes().add(this.getShiftOperator());
    exprRightShiftEClass.getESuperTypes().add(this.getShiftOperator());
    exprBitwiseAndEClass.getESuperTypes().add(this.getBitwiseAnd());
    exprBitwiseXorEClass.getESuperTypes().add(this.getBitwiseXor());
    exprBitwiseOrEClass.getESuperTypes().add(this.getBitwiseOr());
    exprLessThanEClass.getESuperTypes().add(this.getComparisonOperators());
    exprGreaterThanEClass.getESuperTypes().add(this.getComparisonOperators());
    exprLessThanOrEqualToEClass.getESuperTypes().add(this.getComparisonOperators());
    exprGreaterThanOrEqualToEClass.getESuperTypes().add(this.getComparisonOperators());
    exprEqualToEClass.getESuperTypes().add(this.getEqualityOperator());
    exprNotEqualToEClass.getESuperTypes().add(this.getEqualityOperator());
    exprBooleanAndEClass.getESuperTypes().add(this.getBooleanAnd());
    exprBooleanOrEClass.getESuperTypes().add(this.getBooleanOr());
    exprAssignEClass.getESuperTypes().add(this.getAssign());
    patTupleEnumEClass.getESuperTypes().add(this.getPatEnum());
    patStructEnumEClass.getESuperTypes().add(this.getPatEnum());
    intTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    floatTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    boolTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    machineTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    unitTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    charTypeEClass.getESuperTypes().add(this.getTextualType());
    boxedStrTypeEClass.getESuperTypes().add(this.getTextualType());
    ownedStrTypeEClass.getESuperTypes().add(this.getTextualType());
    borrowedStrTypeEClass.getESuperTypes().add(this.getTextualType());

    // Initialize classes and features; add operations and parameters
    initEClass(crateEClass, Crate.class, "Crate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCrate_ViewItems(), this.getViewItem(), null, "viewItems", null, 0, -1, Crate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCrate_Items(), this.getItemAndAttrs(), null, "items", null, 0, -1, Crate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewItemEClass, ViewItem.class, "ViewItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externModDeclEClass, ExternModDecl.class, "ExternModDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternModDecl_Attrs(), this.getLinkAttr(), null, "attrs", null, 0, -1, ExternModDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternModDecl_ExternalIdent(), this.getStringLit(), null, "externalIdent", null, 0, 1, ExternModDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkAttrEClass, LinkAttr.class, "LinkAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkAttr_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, LinkAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkAttr_Value(), this.getLiteral(), null, "value", null, 0, 1, LinkAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(useDeclEClass, UseDecl.class, "UseDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUseDecl_Vis(), this.getVisibility(), "vis", null, 0, 1, UseDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDecl_ExternPath(), this.getTypePath(), null, "externPath", null, 0, 1, UseDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUseDecl_Path(), this.getPathGlob(), null, "path", null, 0, 1, UseDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathGlobEClass, PathGlob.class, "PathGlob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPathGlob_Head(), ecorePackage.getEString(), "head", null, 0, -1, PathGlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPathGlob_Tail(), this.getPathGlob(), null, "tail", null, 0, 1, PathGlob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemAttrEClass, ItemAttr.class, "ItemAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAttr_Attrs(), this.getAttr(), null, "attrs", null, 0, -1, ItemAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrEClass, Attr.class, "Attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttr_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrWithListEClass, AttrWithList.class, "AttrWithList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttrWithList_Attrs(), this.getAttr(), null, "attrs", null, 0, -1, AttrWithList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalAttrEClass, LiteralAttr.class, "LiteralAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralAttr_Value(), this.getLiteral(), null, "value", null, 0, 1, LiteralAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemAndAttrsEClass, ItemAndAttrs.class, "ItemAndAttrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAndAttrs_Attrs(), this.getItemAttr(), null, "attrs", null, 0, -1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemAndAttrs_Item(), this.getItem(), null, "item", null, 0, 1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modItemEClass, ModItem.class, "ModItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModItem_ExternalBody(), ecorePackage.getEBoolean(), "externalBody", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModItem_ViewItems(), this.getViewItem(), null, "viewItems", null, 0, -1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModItem_Items(), this.getItemAndAttrs(), null, "items", null, 0, -1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fnItemEClass, FnItem.class, "FnItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFnItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Args(), this.getArg(), null, "args", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_ReturnType(), this.getType(), null, "returnType", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Body(), this.getBlock(), null, "body", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeItemEClass, TypeItem.class, "TypeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeItem_Type(), this.getType(), null, "type", null, 0, 1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structItemEClass, StructItem.class, "StructItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructItem_Fields(), this.getStructField(), null, "fields", null, 0, -1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumItemEClass, EnumItem.class, "EnumItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumItem_Variants(), this.getEnumVariant(), null, "variants", null, 0, -1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumVariantEClass, EnumVariant.class, "EnumVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumVariant_Params(), ecorePackage.getEString(), "params", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumVariant_Types(), this.getType(), null, "types", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumVariant_Fields(), this.getStructField(), null, "fields", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traitItemEClass, TraitItem.class, "TraitItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTraitItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitItem_Methods(), this.getTraitMethod(), null, "methods", null, 0, -1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traitMethodEClass, TraitMethod.class, "TraitMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTraitMethod_Unsafe(), ecorePackage.getEBoolean(), "unsafe", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Extern(), ecorePackage.getEBoolean(), "extern", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Vis(), this.getVisibility(), "vis", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitMethod_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitMethod_Args(), this.getArg(), null, "args", null, 0, -1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitMethod_Body(), this.getBlock(), null, "body", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implItemEClass, ImplItem.class, "ImplItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImplItem_Trait(), ecorePackage.getEString(), "trait", null, 0, 1, ImplItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplItem_Struct(), ecorePackage.getEString(), "struct", null, 0, 1, ImplItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplItem_Methods(), this.getImplMethod(), null, "methods", null, 0, -1, ImplItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implMethodEClass, ImplMethod.class, "ImplMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImplMethod_Unsafe(), ecorePackage.getEBoolean(), "unsafe", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplMethod_Extern(), ecorePackage.getEBoolean(), "extern", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImplMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Args(), this.getArg(), null, "args", null, 0, -1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Body(), this.getBlock(), null, "body", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externBlockEClass, ExternBlock.class, "ExternBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternBlock_Abi(), ecorePackage.getEString(), "abi", null, 0, 1, ExternBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternBlock_Functions(), this.getForeignFn(), null, "functions", null, 0, -1, ExternBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreignFnEClass, ForeignFn.class, "ForeignFn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForeignFn_Name(), ecorePackage.getEString(), "name", null, 0, 1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignFn_Args(), this.getArg(), null, "args", null, 0, -1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignFn_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticItemEClass, StaticItem.class, "StaticItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticItem_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStaticItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticItem_Type(), this.getType(), null, "type", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticItem_Expr(), this.getExpr(), null, "expr", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprLValueEClass, ExprLValue.class, "ExprLValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprRValueEClass, ExprRValue.class, "ExprRValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprRValue1EClass, ExprRValue1.class, "ExprRValue1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprLeafEClass, ExprLeaf.class, "ExprLeaf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprLiteralEClass, ExprLiteral.class, "ExprLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprLiteral_Literal(), this.getLiteral(), null, "literal", null, 0, 1, ExprLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprPathHeadEClass, ExprPathHead.class, "ExprPathHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprPathHead_Path(), ecorePackage.getEObject(), null, "path", null, 0, 1, ExprPathHead.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprGroupEClass, ExprGroup.class, "ExprGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprGroup_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprTupleEClass, ExprTuple.class, "ExprTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprTuple_Tuple(), this.getExprTuple(), null, "tuple", null, 0, 1, ExprTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprTuple_Exprs(), ecorePackage.getEObject(), null, "exprs", null, 0, -1, ExprTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprStructEClass, ExprStruct.class, "ExprStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprStruct_Struct(), this.getExprStruct(), null, "struct", null, 0, 1, ExprStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprStruct_Fields(), this.getStructField(), null, "fields", null, 0, -1, ExprStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprStruct_BaseExpr(), this.getExpr(), null, "baseExpr", null, 0, 1, ExprStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprVecEClass, ExprVec.class, "ExprVec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprVec_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, ExprVec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprVec_Exprs(), this.getExpr(), null, "exprs", null, 0, -1, ExprVec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprVec_LenExpr(), this.getExpr(), null, "lenExpr", null, 0, 1, ExprVec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprUnaryEClass, ExprUnary.class, "ExprUnary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprUnary_Expr(), this.getExprLeaf(), null, "expr", null, 0, 1, ExprUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericNegationEClass, NumericNegation.class, "NumericNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dereferenceEClass, Dereference.class, "Dereference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalNegationEClass, LogicalNegation.class, "LogicalNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(managedBoxEClass, ManagedBox.class, "ManagedBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ownedBoxEClass, OwnedBox.class, "OwnedBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(borrowEClass, Borrow.class, "Borrow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprBinaryEClass, ExprBinary.class, "ExprBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divisionMultiplicationOrModuloEClass, DivisionMultiplicationOrModulo.class, "DivisionMultiplicationOrModulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(asEClass, As.class, "As", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additionOrSubtractionEClass, AdditionOrSubtraction.class, "AdditionOrSubtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shiftOperatorEClass, ShiftOperator.class, "ShiftOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitwiseAndEClass, BitwiseAnd.class, "BitwiseAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitwiseXorEClass, BitwiseXor.class, "BitwiseXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitwiseOrEClass, BitwiseOr.class, "BitwiseOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonOperatorsEClass, ComparisonOperators.class, "ComparisonOperators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(equalityOperatorEClass, EqualityOperator.class, "EqualityOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanAndEClass, BooleanAnd.class, "BooleanAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanOrEClass, BooleanOr.class, "BooleanOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignEClass, Assign.class, "Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprLambdaEClass, ExprLambda.class, "ExprLambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprLambda_Args(), ecorePackage.getEString(), "args", null, 0, -1, ExprLambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLambda_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprLambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprWhileEClass, ExprWhile.class, "ExprWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprWhile_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprWhile_Block(), this.getBlock(), null, "block", null, 0, 1, ExprWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLoopEClass, ExprLoop.class, "ExprLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprLoop_Lifetime(), ecorePackage.getEString(), "lifetime", null, 0, 1, ExprLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLoop_Block(), this.getBlock(), null, "block", null, 0, 1, ExprLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBreakEClass, ExprBreak.class, "ExprBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprBreak_Lifetime(), ecorePackage.getEString(), "lifetime", null, 0, 1, ExprBreak.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprContinueEClass, ExprContinue.class, "ExprContinue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprContinue_Lifetime(), ecorePackage.getEString(), "lifetime", null, 0, 1, ExprContinue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprDoEClass, ExprDo.class, "ExprDo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprDo_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprDo_Args(), ecorePackage.getEString(), "args", null, 0, -1, ExprDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprDo_Block(), this.getBlock(), null, "block", null, 0, 1, ExprDo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprForEClass, ExprFor.class, "ExprFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprFor_Pat(), this.getPat(), null, "pat", null, 0, 1, ExprFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprFor_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprFor_Block(), this.getBlock(), null, "block", null, 0, 1, ExprFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprIfEClass, ExprIf.class, "ExprIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprIf_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprIf_Else(), this.getElseTail(), null, "else", null, 0, 1, ExprIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseTailEClass, ElseTail.class, "ElseTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElseTail_Block(), this.getBlock(), null, "block", null, 0, 1, ElseTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprMatchEClass, ExprMatch.class, "ExprMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprMatch_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprMatch_Arms(), this.getMatchArm(), null, "arms", null, 0, -1, ExprMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchArmEClass, MatchArm.class, "MatchArm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchArm_MatchPat(), ecorePackage.getEObject(), null, "matchPat", null, 0, 1, MatchArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchArm_Expr(), this.getExpr(), null, "expr", null, 0, 1, MatchArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchArm_Block(), this.getBlock(), null, "block", null, 0, 1, MatchArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchPatEClass, MatchPat.class, "MatchPat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchPat_Pat(), this.getPat(), null, "pat", null, 0, 1, MatchPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchPat_EndPat(), this.getPat(), null, "endPat", null, 0, 1, MatchPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchPat_Expr(), this.getExpr(), null, "expr", null, 0, 1, MatchPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprReturnEClass, ExprReturn.class, "ExprReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprReturn_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Expr(), this.getExpr(), null, "expr", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlock_Stmts(), ecorePackage.getEObject(), null, "stmts", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStmt_Expr(), this.getExpr(), null, "expr", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slotDeclStmtEClass, SlotDeclStmt.class, "SlotDeclStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlotDeclStmt_Pat(), this.getPat(), null, "pat", null, 0, 1, SlotDeclStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlotDeclStmt_Type(), this.getType(), null, "type", null, 0, 1, SlotDeclStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprStmtEClass, ExprStmt.class, "ExprStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericParamDeclEClass, GenericParamDecl.class, "GenericParamDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericParamDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenericParamDecl_Bounds(), ecorePackage.getEString(), "bounds", null, 0, -1, GenericParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argEClass, Arg.class, "Arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArg_Pat(), this.getPat(), null, "pat", null, 0, 1, Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArg_Type(), this.getType(), null, "type", null, 0, 1, Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patEClass, Pat.class, "Pat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patWildcardEClass, PatWildcard.class, "PatWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patIdentEClass, PatIdent.class, "PatIdent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPatIdent_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, PatIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatIdent_Name(), ecorePackage.getEString(), "name", null, 0, 1, PatIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patBoxedEClass, PatBoxed.class, "PatBoxed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatBoxed_Pattern(), this.getPat(), null, "pattern", null, 0, 1, PatBoxed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patOwnedEClass, PatOwned.class, "PatOwned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatOwned_Pattern(), this.getPat(), null, "pattern", null, 0, 1, PatOwned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patBorrowedEClass, PatBorrowed.class, "PatBorrowed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatBorrowed_Pattern(), this.getPat(), null, "pattern", null, 0, 1, PatBorrowed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patTupleEClass, PatTuple.class, "PatTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatTuple_Patterns(), this.getPat(), null, "patterns", null, 0, -1, PatTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patVectorEClass, PatVector.class, "PatVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatVector_Patterns(), this.getPat(), null, "patterns", null, 0, -1, PatVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patLiteralEClass, PatLiteral.class, "PatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatLiteral_Literal(), this.getLiteral(), null, "literal", null, 0, 1, PatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patEnumEClass, PatEnum.class, "PatEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatEnum_Path(), ecorePackage.getEObject(), null, "path", null, 0, 1, PatEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldPatEClass, FieldPat.class, "FieldPat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldPat_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldPat_Pattern(), this.getPat(), null, "pattern", null, 0, 1, FieldPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePathEClass, TypePath.class, "TypePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypePath_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, TypePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypePath_Lifetimes(), ecorePackage.getEString(), "lifetimes", null, 0, -1, TypePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePath_GenericTypes(), this.getType(), null, "genericTypes", null, 0, -1, TypePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprPathEClass, ExprPath.class, "ExprPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprPath_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, ExprPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprPath_Lifetimes(), ecorePackage.getEString(), "lifetimes", null, 0, -1, ExprPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprPath_GenericTypes(), this.getType(), null, "genericTypes", null, 0, -1, ExprPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textualTypeEClass, TextualType.class, "TextualType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedTypeEClass, NamedType.class, "NamedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedType_Path(), this.getTypePath(), null, "path", null, 0, 1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxedPointerEClass, BoxedPointer.class, "BoxedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxedPointer_Type(), this.getType(), null, "type", null, 0, 1, BoxedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ownedPointerEClass, OwnedPointer.class, "OwnedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOwnedPointer_Type(), this.getType(), null, "type", null, 0, 1, OwnedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borrowedPointerEClass, BorrowedPointer.class, "BorrowedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorrowedPointer_Type(), this.getType(), null, "type", null, 0, 1, BorrowedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structFieldEClass, StructField.class, "StructField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructField_Vis(), this.getVisibility(), "vis", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructField_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructField_Type(), this.getType(), null, "type", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structVariantEClass, StructVariant.class, "StructVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructVariant_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, StructVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructVariant_Fields(), this.getStructField(), null, "fields", null, 0, -1, StructVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tupleVariantEClass, TupleVariant.class, "TupleVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleVariant_Types(), this.getType(), null, "types", null, 0, -1, TupleVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unitVariantEClass, UnitVariant.class, "UnitVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLitEClass, StringLit.class, "StringLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLitEClass, NumberLit.class, "NumberLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charLitEClass, CharLit.class, "CharLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprFieldEClass, ExprField.class, "ExprField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprField_Expr(), this.getExprLeaf(), null, "expr", null, 0, 1, ExprField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprField_Field(), ecorePackage.getEString(), "field", null, 0, 1, ExprField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprMethodCallEClass, ExprMethodCall.class, "ExprMethodCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprMethodCall_Method(), this.getExprField(), null, "method", null, 0, 1, ExprMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprMethodCall_Args(), this.getExpr(), null, "args", null, 0, -1, ExprMethodCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprIndexEClass, ExprIndex.class, "ExprIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprIndex_Expr(), this.getExprLeaf(), null, "expr", null, 0, 1, ExprIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprIndex_IndexExpr(), this.getExpr(), null, "indexExpr", null, 0, 1, ExprIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDivision_Left(), this.getExprRValue1(), null, "left", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDivision_Right(), this.getExprRValue1(), null, "right", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplication_Left(), this.getExprRValue1(), null, "left", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplication_Right(), this.getExprRValue1(), null, "right", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModulo_Left(), this.getExprRValue1(), null, "left", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModulo_Right(), this.getExprRValue1(), null, "right", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprCastEClass, ExprCast.class, "ExprCast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprCast_Expr(), this.getDivisionMultiplicationOrModulo(), null, "expr", null, 0, 1, ExprCast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprCast_Type(), this.getType(), null, "type", null, 0, 1, ExprCast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAdditionEClass, ExprAddition.class, "ExprAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprAddition_Left(), this.getAs(), null, "left", null, 0, 1, ExprAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAddition_Right(), this.getAs(), null, "right", null, 0, 1, ExprAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprSubtractionEClass, ExprSubtraction.class, "ExprSubtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprSubtraction_Left(), this.getAs(), null, "left", null, 0, 1, ExprSubtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSubtraction_Right(), this.getAs(), null, "right", null, 0, 1, ExprSubtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLeftShiftEClass, ExprLeftShift.class, "ExprLeftShift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprLeftShift_Left(), this.getAdditionOrSubtraction(), null, "left", null, 0, 1, ExprLeftShift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLeftShift_Right(), this.getAdditionOrSubtraction(), null, "right", null, 0, 1, ExprLeftShift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprRightShiftEClass, ExprRightShift.class, "ExprRightShift", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprRightShift_Left(), this.getAdditionOrSubtraction(), null, "left", null, 0, 1, ExprRightShift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprRightShift_Right(), this.getAdditionOrSubtraction(), null, "right", null, 0, 1, ExprRightShift.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBitwiseAndEClass, ExprBitwiseAnd.class, "ExprBitwiseAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBitwiseAnd_Left(), this.getShiftOperator(), null, "left", null, 0, 1, ExprBitwiseAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBitwiseAnd_Right(), this.getShiftOperator(), null, "right", null, 0, 1, ExprBitwiseAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBitwiseXorEClass, ExprBitwiseXor.class, "ExprBitwiseXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBitwiseXor_Left(), this.getBitwiseAnd(), null, "left", null, 0, 1, ExprBitwiseXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBitwiseXor_Right(), this.getBitwiseAnd(), null, "right", null, 0, 1, ExprBitwiseXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBitwiseOrEClass, ExprBitwiseOr.class, "ExprBitwiseOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBitwiseOr_Left(), this.getBitwiseXor(), null, "left", null, 0, 1, ExprBitwiseOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBitwiseOr_Right(), this.getBitwiseXor(), null, "right", null, 0, 1, ExprBitwiseOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLessThanEClass, ExprLessThan.class, "ExprLessThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprLessThan_Left(), this.getBitwiseOr(), null, "left", null, 0, 1, ExprLessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLessThan_Right(), this.getBitwiseOr(), null, "right", null, 0, 1, ExprLessThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprGreaterThanEClass, ExprGreaterThan.class, "ExprGreaterThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprGreaterThan_Left(), this.getBitwiseOr(), null, "left", null, 0, 1, ExprGreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprGreaterThan_Right(), this.getBitwiseOr(), null, "right", null, 0, 1, ExprGreaterThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprLessThanOrEqualToEClass, ExprLessThanOrEqualTo.class, "ExprLessThanOrEqualTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprLessThanOrEqualTo_Left(), this.getBitwiseOr(), null, "left", null, 0, 1, ExprLessThanOrEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprLessThanOrEqualTo_Right(), this.getBitwiseOr(), null, "right", null, 0, 1, ExprLessThanOrEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprGreaterThanOrEqualToEClass, ExprGreaterThanOrEqualTo.class, "ExprGreaterThanOrEqualTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprGreaterThanOrEqualTo_Left(), this.getBitwiseOr(), null, "left", null, 0, 1, ExprGreaterThanOrEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprGreaterThanOrEqualTo_Right(), this.getBitwiseOr(), null, "right", null, 0, 1, ExprGreaterThanOrEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEqualToEClass, ExprEqualTo.class, "ExprEqualTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprEqualTo_Left(), this.getComparisonOperators(), null, "left", null, 0, 1, ExprEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprEqualTo_Right(), this.getComparisonOperators(), null, "right", null, 0, 1, ExprEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprNotEqualToEClass, ExprNotEqualTo.class, "ExprNotEqualTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprNotEqualTo_Left(), this.getComparisonOperators(), null, "left", null, 0, 1, ExprNotEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprNotEqualTo_Right(), this.getComparisonOperators(), null, "right", null, 0, 1, ExprNotEqualTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBooleanAndEClass, ExprBooleanAnd.class, "ExprBooleanAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBooleanAnd_Left(), this.getEqualityOperator(), null, "left", null, 0, 1, ExprBooleanAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBooleanAnd_Right(), this.getEqualityOperator(), null, "right", null, 0, 1, ExprBooleanAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBooleanOrEClass, ExprBooleanOr.class, "ExprBooleanOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBooleanOr_Left(), this.getBooleanAnd(), null, "left", null, 0, 1, ExprBooleanOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprBooleanOr_Right(), this.getBooleanAnd(), null, "right", null, 0, 1, ExprBooleanOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAssignEClass, ExprAssign.class, "ExprAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprAssign_Left(), this.getExprLValue(), null, "left", null, 0, 1, ExprAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAssign_Right(), this.getBooleanOr(), null, "right", null, 0, 1, ExprAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patTupleEnumEClass, PatTupleEnum.class, "PatTupleEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatTupleEnum_Patterns(), this.getPat(), null, "patterns", null, 0, -1, PatTupleEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patStructEnumEClass, PatStructEnum.class, "PatStructEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatStructEnum_FieldPatterns(), this.getFieldPat(), null, "fieldPatterns", null, 0, -1, PatStructEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(machineTypeEClass, MachineType.class, "MachineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charTypeEClass, CharType.class, "CharType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boxedStrTypeEClass, BoxedStrType.class, "BoxedStrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ownedStrTypeEClass, OwnedStrType.class, "OwnedStrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(borrowedStrTypeEClass, BorrowedStrType.class, "BorrowedStrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);

    // Create resource
    createResource(eNS_URI);
  }

} //RustPackageImpl
