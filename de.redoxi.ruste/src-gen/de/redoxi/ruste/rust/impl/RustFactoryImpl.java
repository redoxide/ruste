/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RustFactoryImpl extends EFactoryImpl implements RustFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RustFactory init()
  {
    try
    {
      RustFactory theRustFactory = (RustFactory)EPackage.Registry.INSTANCE.getEFactory(RustPackage.eNS_URI);
      if (theRustFactory != null)
      {
        return theRustFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RustFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RustPackage.CRATE: return createCrate();
      case RustPackage.ITEM_ATTR: return createItemAttr();
      case RustPackage.ATTR: return createAttr();
      case RustPackage.ATTR_WITH_LIST: return createAttrWithList();
      case RustPackage.LITERAL_ATTR: return createLiteralAttr();
      case RustPackage.ITEM_AND_ATTRS: return createItemAndAttrs();
      case RustPackage.ITEM: return createItem();
      case RustPackage.MOD_ITEM: return createModItem();
      case RustPackage.FN_ITEM: return createFnItem();
      case RustPackage.TYPE_ITEM: return createTypeItem();
      case RustPackage.STRUCT_ITEM: return createStructItem();
      case RustPackage.ENUM_ITEM: return createEnumItem();
      case RustPackage.ENUM_VARIANT: return createEnumVariant();
      case RustPackage.TRAIT_ITEM: return createTraitItem();
      case RustPackage.TRAIT_METHOD: return createTraitMethod();
      case RustPackage.IMPL_ITEM: return createImplItem();
      case RustPackage.IMPL_METHOD: return createImplMethod();
      case RustPackage.EXTERN_BLOCK: return createExternBlock();
      case RustPackage.FOREIGN_FN: return createForeignFn();
      case RustPackage.STATIC_ITEM: return createStaticItem();
      case RustPackage.EXPR: return createExpr();
      case RustPackage.EXPR_LVALUE: return createExprLValue();
      case RustPackage.EXPR_RVALUE: return createExprRValue();
      case RustPackage.EXPR_LEAF: return createExprLeaf();
      case RustPackage.EXPR_LITERAL: return createExprLiteral();
      case RustPackage.EXPR_PATH_HEAD: return createExprPathHead();
      case RustPackage.EXPR_GROUP: return createExprGroup();
      case RustPackage.EXPR_TUPLE: return createExprTuple();
      case RustPackage.EXPR_STRUCT: return createExprStruct();
      case RustPackage.EXPR_VEC: return createExprVec();
      case RustPackage.EXPR_UNARY: return createExprUnary();
      case RustPackage.NUMERIC_NEGATION: return createNumericNegation();
      case RustPackage.DEREFERENCE: return createDereference();
      case RustPackage.LOGICAL_NEGATION: return createLogicalNegation();
      case RustPackage.MANAGED_BOX: return createManagedBox();
      case RustPackage.OWNED_BOX: return createOwnedBox();
      case RustPackage.BORROW: return createBorrow();
      case RustPackage.EXPR_BINARY: return createExprBinary();
      case RustPackage.DIVISION_MULTIPLICATION_OR_MODULO: return createDivisionMultiplicationOrModulo();
      case RustPackage.AS: return createAs();
      case RustPackage.ADDITION_OR_SUBTRACTION: return createAdditionOrSubtraction();
      case RustPackage.SHIFT_OPERATOR: return createShiftOperator();
      case RustPackage.BITWISE_AND: return createBitwiseAnd();
      case RustPackage.BITWISE_XOR: return createBitwiseXor();
      case RustPackage.BITWISE_OR: return createBitwiseOr();
      case RustPackage.COMPARISON_OPERATORS: return createComparisonOperators();
      case RustPackage.EQUALITY_OPERATOR: return createEqualityOperator();
      case RustPackage.BOOLEAN_AND: return createBooleanAnd();
      case RustPackage.BOOLEAN_OR: return createBooleanOr();
      case RustPackage.ASSIGN: return createAssign();
      case RustPackage.EXPR_LAMBDA: return createExprLambda();
      case RustPackage.EXPR_WHILE: return createExprWhile();
      case RustPackage.EXPR_LOOP: return createExprLoop();
      case RustPackage.EXPR_BREAK: return createExprBreak();
      case RustPackage.EXPR_CONTINUE: return createExprContinue();
      case RustPackage.EXPR_DO: return createExprDo();
      case RustPackage.EXPR_FOR: return createExprFor();
      case RustPackage.EXPR_IF: return createExprIf();
      case RustPackage.ELSE_TAIL: return createElseTail();
      case RustPackage.EXPR_MATCH: return createExprMatch();
      case RustPackage.MATCH_ARM: return createMatchArm();
      case RustPackage.MATCH_PAT: return createMatchPat();
      case RustPackage.EXPR_RETURN: return createExprReturn();
      case RustPackage.BLOCK: return createBlock();
      case RustPackage.GENERIC_PARAM_DECL: return createGenericParamDecl();
      case RustPackage.ARG: return createArg();
      case RustPackage.PAT: return createPat();
      case RustPackage.PAT_WILDCARD: return createPatWildcard();
      case RustPackage.PAT_IDENT: return createPatIdent();
      case RustPackage.PAT_BOXED: return createPatBoxed();
      case RustPackage.PAT_OWNED: return createPatOwned();
      case RustPackage.PAT_BORROWED: return createPatBorrowed();
      case RustPackage.PAT_TUPLE: return createPatTuple();
      case RustPackage.PAT_VECTOR: return createPatVector();
      case RustPackage.PAT_LITERAL: return createPatLiteral();
      case RustPackage.PAT_ENUM: return createPatEnum();
      case RustPackage.FIELD_PAT: return createFieldPat();
      case RustPackage.TYPE_PATH: return createTypePath();
      case RustPackage.EXPR_PATH: return createExprPath();
      case RustPackage.TYPE: return createType();
      case RustPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case RustPackage.NAMED_TYPE: return createNamedType();
      case RustPackage.BOXED_POINTER: return createBoxedPointer();
      case RustPackage.OWNED_POINTER: return createOwnedPointer();
      case RustPackage.BORROWED_POINTER: return createBorrowedPointer();
      case RustPackage.STRUCT_FIELD: return createStructField();
      case RustPackage.VARIANT: return createVariant();
      case RustPackage.STRUCT_VARIANT: return createStructVariant();
      case RustPackage.TUPLE_VARIANT: return createTupleVariant();
      case RustPackage.UNIT_VARIANT: return createUnitVariant();
      case RustPackage.STRING_LIT: return createStringLit();
      case RustPackage.LITERAL: return createLiteral();
      case RustPackage.NUMBER_LIT: return createNumberLit();
      case RustPackage.CHAR_LIT: return createCharLit();
      case RustPackage.DIVISION: return createDivision();
      case RustPackage.MULTIPLICATION: return createMultiplication();
      case RustPackage.MODULO: return createModulo();
      case RustPackage.EXPR_CAST: return createExprCast();
      case RustPackage.EXPR_ADDITION: return createExprAddition();
      case RustPackage.EXPR_SUBTRACTION: return createExprSubtraction();
      case RustPackage.EXPR_LEFT_SHIFT: return createExprLeftShift();
      case RustPackage.EXPR_RIGHT_SHIFT: return createExprRightShift();
      case RustPackage.EXPR_BITWISE_AND: return createExprBitwiseAnd();
      case RustPackage.EXPR_BITWISE_XOR: return createExprBitwiseXor();
      case RustPackage.EXPR_BITWISE_OR: return createExprBitwiseOr();
      case RustPackage.EXPR_LESS_THAN: return createExprLessThan();
      case RustPackage.EXPR_GREATER_THAN: return createExprGreaterThan();
      case RustPackage.EXPR_LESS_THAN_OR_EQUAL_TO: return createExprLessThanOrEqualTo();
      case RustPackage.EXPR_GREATER_THAN_OR_EQUAL_TO: return createExprGreaterThanOrEqualTo();
      case RustPackage.EXPR_EQUAL_TO: return createExprEqualTo();
      case RustPackage.EXPR_NOT_EQUAL_TO: return createExprNotEqualTo();
      case RustPackage.EXPR_BOOLEAN_AND: return createExprBooleanAnd();
      case RustPackage.EXPR_BOOLEAN_OR: return createExprBooleanOr();
      case RustPackage.EXPR_ASSIGN: return createExprAssign();
      case RustPackage.PAT_TUPLE_ENUM: return createPatTupleEnum();
      case RustPackage.PAT_STRUCT_ENUM: return createPatStructEnum();
      case RustPackage.INT_TYPE: return createIntType();
      case RustPackage.FLOAT_TYPE: return createFloatType();
      case RustPackage.BOOL_TYPE: return createBoolType();
      case RustPackage.MACHINE_TYPE: return createMachineType();
      case RustPackage.UNIT_TYPE: return createUnitType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RustPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RustPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crate createCrate()
  {
    CrateImpl crate = new CrateImpl();
    return crate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemAttr createItemAttr()
  {
    ItemAttrImpl itemAttr = new ItemAttrImpl();
    return itemAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attr createAttr()
  {
    AttrImpl attr = new AttrImpl();
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrWithList createAttrWithList()
  {
    AttrWithListImpl attrWithList = new AttrWithListImpl();
    return attrWithList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralAttr createLiteralAttr()
  {
    LiteralAttrImpl literalAttr = new LiteralAttrImpl();
    return literalAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemAndAttrs createItemAndAttrs()
  {
    ItemAndAttrsImpl itemAndAttrs = new ItemAndAttrsImpl();
    return itemAndAttrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModItem createModItem()
  {
    ModItemImpl modItem = new ModItemImpl();
    return modItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnItem createFnItem()
  {
    FnItemImpl fnItem = new FnItemImpl();
    return fnItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeItem createTypeItem()
  {
    TypeItemImpl typeItem = new TypeItemImpl();
    return typeItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructItem createStructItem()
  {
    StructItemImpl structItem = new StructItemImpl();
    return structItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumItem createEnumItem()
  {
    EnumItemImpl enumItem = new EnumItemImpl();
    return enumItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumVariant createEnumVariant()
  {
    EnumVariantImpl enumVariant = new EnumVariantImpl();
    return enumVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitItem createTraitItem()
  {
    TraitItemImpl traitItem = new TraitItemImpl();
    return traitItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraitMethod createTraitMethod()
  {
    TraitMethodImpl traitMethod = new TraitMethodImpl();
    return traitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplItem createImplItem()
  {
    ImplItemImpl implItem = new ImplItemImpl();
    return implItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplMethod createImplMethod()
  {
    ImplMethodImpl implMethod = new ImplMethodImpl();
    return implMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternBlock createExternBlock()
  {
    ExternBlockImpl externBlock = new ExternBlockImpl();
    return externBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignFn createForeignFn()
  {
    ForeignFnImpl foreignFn = new ForeignFnImpl();
    return foreignFn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticItem createStaticItem()
  {
    StaticItemImpl staticItem = new StaticItemImpl();
    return staticItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLValue createExprLValue()
  {
    ExprLValueImpl exprLValue = new ExprLValueImpl();
    return exprLValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprRValue createExprRValue()
  {
    ExprRValueImpl exprRValue = new ExprRValueImpl();
    return exprRValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLeaf createExprLeaf()
  {
    ExprLeafImpl exprLeaf = new ExprLeafImpl();
    return exprLeaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLiteral createExprLiteral()
  {
    ExprLiteralImpl exprLiteral = new ExprLiteralImpl();
    return exprLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprPathHead createExprPathHead()
  {
    ExprPathHeadImpl exprPathHead = new ExprPathHeadImpl();
    return exprPathHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprGroup createExprGroup()
  {
    ExprGroupImpl exprGroup = new ExprGroupImpl();
    return exprGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTuple createExprTuple()
  {
    ExprTupleImpl exprTuple = new ExprTupleImpl();
    return exprTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprStruct createExprStruct()
  {
    ExprStructImpl exprStruct = new ExprStructImpl();
    return exprStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprVec createExprVec()
  {
    ExprVecImpl exprVec = new ExprVecImpl();
    return exprVec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprUnary createExprUnary()
  {
    ExprUnaryImpl exprUnary = new ExprUnaryImpl();
    return exprUnary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericNegation createNumericNegation()
  {
    NumericNegationImpl numericNegation = new NumericNegationImpl();
    return numericNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dereference createDereference()
  {
    DereferenceImpl dereference = new DereferenceImpl();
    return dereference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalNegation createLogicalNegation()
  {
    LogicalNegationImpl logicalNegation = new LogicalNegationImpl();
    return logicalNegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManagedBox createManagedBox()
  {
    ManagedBoxImpl managedBox = new ManagedBoxImpl();
    return managedBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OwnedBox createOwnedBox()
  {
    OwnedBoxImpl ownedBox = new OwnedBoxImpl();
    return ownedBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Borrow createBorrow()
  {
    BorrowImpl borrow = new BorrowImpl();
    return borrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBinary createExprBinary()
  {
    ExprBinaryImpl exprBinary = new ExprBinaryImpl();
    return exprBinary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivisionMultiplicationOrModulo createDivisionMultiplicationOrModulo()
  {
    DivisionMultiplicationOrModuloImpl divisionMultiplicationOrModulo = new DivisionMultiplicationOrModuloImpl();
    return divisionMultiplicationOrModulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public As createAs()
  {
    AsImpl as = new AsImpl();
    return as;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOrSubtraction createAdditionOrSubtraction()
  {
    AdditionOrSubtractionImpl additionOrSubtraction = new AdditionOrSubtractionImpl();
    return additionOrSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftOperator createShiftOperator()
  {
    ShiftOperatorImpl shiftOperator = new ShiftOperatorImpl();
    return shiftOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseAnd createBitwiseAnd()
  {
    BitwiseAndImpl bitwiseAnd = new BitwiseAndImpl();
    return bitwiseAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseXor createBitwiseXor()
  {
    BitwiseXorImpl bitwiseXor = new BitwiseXorImpl();
    return bitwiseXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseOr createBitwiseOr()
  {
    BitwiseOrImpl bitwiseOr = new BitwiseOrImpl();
    return bitwiseOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOperators createComparisonOperators()
  {
    ComparisonOperatorsImpl comparisonOperators = new ComparisonOperatorsImpl();
    return comparisonOperators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityOperator createEqualityOperator()
  {
    EqualityOperatorImpl equalityOperator = new EqualityOperatorImpl();
    return equalityOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanAnd createBooleanAnd()
  {
    BooleanAndImpl booleanAnd = new BooleanAndImpl();
    return booleanAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanOr createBooleanOr()
  {
    BooleanOrImpl booleanOr = new BooleanOrImpl();
    return booleanOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLambda createExprLambda()
  {
    ExprLambdaImpl exprLambda = new ExprLambdaImpl();
    return exprLambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprWhile createExprWhile()
  {
    ExprWhileImpl exprWhile = new ExprWhileImpl();
    return exprWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLoop createExprLoop()
  {
    ExprLoopImpl exprLoop = new ExprLoopImpl();
    return exprLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBreak createExprBreak()
  {
    ExprBreakImpl exprBreak = new ExprBreakImpl();
    return exprBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprContinue createExprContinue()
  {
    ExprContinueImpl exprContinue = new ExprContinueImpl();
    return exprContinue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprDo createExprDo()
  {
    ExprDoImpl exprDo = new ExprDoImpl();
    return exprDo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprFor createExprFor()
  {
    ExprForImpl exprFor = new ExprForImpl();
    return exprFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprIf createExprIf()
  {
    ExprIfImpl exprIf = new ExprIfImpl();
    return exprIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseTail createElseTail()
  {
    ElseTailImpl elseTail = new ElseTailImpl();
    return elseTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprMatch createExprMatch()
  {
    ExprMatchImpl exprMatch = new ExprMatchImpl();
    return exprMatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchArm createMatchArm()
  {
    MatchArmImpl matchArm = new MatchArmImpl();
    return matchArm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchPat createMatchPat()
  {
    MatchPatImpl matchPat = new MatchPatImpl();
    return matchPat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprReturn createExprReturn()
  {
    ExprReturnImpl exprReturn = new ExprReturnImpl();
    return exprReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericParamDecl createGenericParamDecl()
  {
    GenericParamDeclImpl genericParamDecl = new GenericParamDeclImpl();
    return genericParamDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg createArg()
  {
    ArgImpl arg = new ArgImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pat createPat()
  {
    PatImpl pat = new PatImpl();
    return pat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatWildcard createPatWildcard()
  {
    PatWildcardImpl patWildcard = new PatWildcardImpl();
    return patWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatIdent createPatIdent()
  {
    PatIdentImpl patIdent = new PatIdentImpl();
    return patIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatBoxed createPatBoxed()
  {
    PatBoxedImpl patBoxed = new PatBoxedImpl();
    return patBoxed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatOwned createPatOwned()
  {
    PatOwnedImpl patOwned = new PatOwnedImpl();
    return patOwned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatBorrowed createPatBorrowed()
  {
    PatBorrowedImpl patBorrowed = new PatBorrowedImpl();
    return patBorrowed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatTuple createPatTuple()
  {
    PatTupleImpl patTuple = new PatTupleImpl();
    return patTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatVector createPatVector()
  {
    PatVectorImpl patVector = new PatVectorImpl();
    return patVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatLiteral createPatLiteral()
  {
    PatLiteralImpl patLiteral = new PatLiteralImpl();
    return patLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatEnum createPatEnum()
  {
    PatEnumImpl patEnum = new PatEnumImpl();
    return patEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldPat createFieldPat()
  {
    FieldPatImpl fieldPat = new FieldPatImpl();
    return fieldPat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePath createTypePath()
  {
    TypePathImpl typePath = new TypePathImpl();
    return typePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprPath createExprPath()
  {
    ExprPathImpl exprPath = new ExprPathImpl();
    return exprPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedType createNamedType()
  {
    NamedTypeImpl namedType = new NamedTypeImpl();
    return namedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoxedPointer createBoxedPointer()
  {
    BoxedPointerImpl boxedPointer = new BoxedPointerImpl();
    return boxedPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OwnedPointer createOwnedPointer()
  {
    OwnedPointerImpl ownedPointer = new OwnedPointerImpl();
    return ownedPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorrowedPointer createBorrowedPointer()
  {
    BorrowedPointerImpl borrowedPointer = new BorrowedPointerImpl();
    return borrowedPointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructField createStructField()
  {
    StructFieldImpl structField = new StructFieldImpl();
    return structField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variant createVariant()
  {
    VariantImpl variant = new VariantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructVariant createStructVariant()
  {
    StructVariantImpl structVariant = new StructVariantImpl();
    return structVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleVariant createTupleVariant()
  {
    TupleVariantImpl tupleVariant = new TupleVariantImpl();
    return tupleVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitVariant createUnitVariant()
  {
    UnitVariantImpl unitVariant = new UnitVariantImpl();
    return unitVariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLit createStringLit()
  {
    StringLitImpl stringLit = new StringLitImpl();
    return stringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLit createNumberLit()
  {
    NumberLitImpl numberLit = new NumberLitImpl();
    return numberLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharLit createCharLit()
  {
    CharLitImpl charLit = new CharLitImpl();
    return charLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modulo createModulo()
  {
    ModuloImpl modulo = new ModuloImpl();
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprCast createExprCast()
  {
    ExprCastImpl exprCast = new ExprCastImpl();
    return exprCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAddition createExprAddition()
  {
    ExprAdditionImpl exprAddition = new ExprAdditionImpl();
    return exprAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSubtraction createExprSubtraction()
  {
    ExprSubtractionImpl exprSubtraction = new ExprSubtractionImpl();
    return exprSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLeftShift createExprLeftShift()
  {
    ExprLeftShiftImpl exprLeftShift = new ExprLeftShiftImpl();
    return exprLeftShift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprRightShift createExprRightShift()
  {
    ExprRightShiftImpl exprRightShift = new ExprRightShiftImpl();
    return exprRightShift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBitwiseAnd createExprBitwiseAnd()
  {
    ExprBitwiseAndImpl exprBitwiseAnd = new ExprBitwiseAndImpl();
    return exprBitwiseAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBitwiseXor createExprBitwiseXor()
  {
    ExprBitwiseXorImpl exprBitwiseXor = new ExprBitwiseXorImpl();
    return exprBitwiseXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBitwiseOr createExprBitwiseOr()
  {
    ExprBitwiseOrImpl exprBitwiseOr = new ExprBitwiseOrImpl();
    return exprBitwiseOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLessThan createExprLessThan()
  {
    ExprLessThanImpl exprLessThan = new ExprLessThanImpl();
    return exprLessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprGreaterThan createExprGreaterThan()
  {
    ExprGreaterThanImpl exprGreaterThan = new ExprGreaterThanImpl();
    return exprGreaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprLessThanOrEqualTo createExprLessThanOrEqualTo()
  {
    ExprLessThanOrEqualToImpl exprLessThanOrEqualTo = new ExprLessThanOrEqualToImpl();
    return exprLessThanOrEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprGreaterThanOrEqualTo createExprGreaterThanOrEqualTo()
  {
    ExprGreaterThanOrEqualToImpl exprGreaterThanOrEqualTo = new ExprGreaterThanOrEqualToImpl();
    return exprGreaterThanOrEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEqualTo createExprEqualTo()
  {
    ExprEqualToImpl exprEqualTo = new ExprEqualToImpl();
    return exprEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNotEqualTo createExprNotEqualTo()
  {
    ExprNotEqualToImpl exprNotEqualTo = new ExprNotEqualToImpl();
    return exprNotEqualTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBooleanAnd createExprBooleanAnd()
  {
    ExprBooleanAndImpl exprBooleanAnd = new ExprBooleanAndImpl();
    return exprBooleanAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprBooleanOr createExprBooleanOr()
  {
    ExprBooleanOrImpl exprBooleanOr = new ExprBooleanOrImpl();
    return exprBooleanOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAssign createExprAssign()
  {
    ExprAssignImpl exprAssign = new ExprAssignImpl();
    return exprAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatTupleEnum createPatTupleEnum()
  {
    PatTupleEnumImpl patTupleEnum = new PatTupleEnumImpl();
    return patTupleEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatStructEnum createPatStructEnum()
  {
    PatStructEnumImpl patStructEnum = new PatStructEnumImpl();
    return patStructEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType createMachineType()
  {
    MachineTypeImpl machineType = new MachineTypeImpl();
    return machineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitType createUnitType()
  {
    UnitTypeImpl unitType = new UnitTypeImpl();
    return unitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustPackage getRustPackage()
  {
    return (RustPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RustPackage getPackage()
  {
    return RustPackage.eINSTANCE;
  }

} //RustFactoryImpl
