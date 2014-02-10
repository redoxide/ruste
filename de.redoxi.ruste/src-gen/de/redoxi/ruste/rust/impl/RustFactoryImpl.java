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
      case RustPackage.EXPR_LITERAL: return createExprLiteral();
      case RustPackage.EXPR_PATH: return createExprPath();
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
      case RustPackage.PAT_RANGE: return createPatRange();
      case RustPackage.PAT_CHAR_RANGE: return createPatCharRange();
      case RustPackage.PAT_NUMBER_RANGE: return createPatNumberRange();
      case RustPackage.PAT_ENUM: return createPatEnum();
      case RustPackage.FIELD_PAT: return createFieldPat();
      case RustPackage.PATH: return createPath();
      case RustPackage.TYPE: return createType();
      case RustPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case RustPackage.TUPLE_TYPE: return createTupleType();
      case RustPackage.STRUCT_TYPE: return createStructType();
      case RustPackage.BOXED_POINTER: return createBoxedPointer();
      case RustPackage.OWNED_POINTER: return createOwnedPointer();
      case RustPackage.BORROWED_POINTER: return createBorrowedPointer();
      case RustPackage.STRUCT_FIELD: return createStructField();
      case RustPackage.ENUM_TYPE: return createEnumType();
      case RustPackage.VARIANT: return createVariant();
      case RustPackage.STRUCT_VARIANT: return createStructVariant();
      case RustPackage.TUPLE_VARIANT: return createTupleVariant();
      case RustPackage.UNIT_VARIANT: return createUnitVariant();
      case RustPackage.STRING_LIT: return createStringLit();
      case RustPackage.LITERAL: return createLiteral();
      case RustPackage.NUMBER_LIT: return createNumberLit();
      case RustPackage.CHAR_LIT: return createCharLit();
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
  public PatRange createPatRange()
  {
    PatRangeImpl patRange = new PatRangeImpl();
    return patRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatCharRange createPatCharRange()
  {
    PatCharRangeImpl patCharRange = new PatCharRangeImpl();
    return patCharRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatNumberRange createPatNumberRange()
  {
    PatNumberRangeImpl patNumberRange = new PatNumberRangeImpl();
    return patNumberRange;
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
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
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
  public TupleType createTupleType()
  {
    TupleTypeImpl tupleType = new TupleTypeImpl();
    return tupleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType createStructType()
  {
    StructTypeImpl structType = new StructTypeImpl();
    return structType;
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
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
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
