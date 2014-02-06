/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.ecore.EClass;
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
      case RustPackage.GENERIC_PARAM_DECL: return createGenericParamDecl();
      case RustPackage.ARG: return createArg();
      case RustPackage.PAT: return createPat();
      case RustPackage.TYPE: return createType();
      case RustPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case RustPackage.LITERAL: return createLiteral();
      case RustPackage.NUMBER_LIT: return createNumberLit();
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
