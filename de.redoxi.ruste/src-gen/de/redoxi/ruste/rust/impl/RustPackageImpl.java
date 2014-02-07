/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.Attr;
import de.redoxi.ruste.rust.AttrWithList;
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
import de.redoxi.ruste.rust.Item;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.Literal;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.MachineType;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.NumberLit;
import de.redoxi.ruste.rust.OwnedPointer;
import de.redoxi.ruste.rust.Pat;
import de.redoxi.ruste.rust.PatBorrowed;
import de.redoxi.ruste.rust.PatBoxed;
import de.redoxi.ruste.rust.PatCharRange;
import de.redoxi.ruste.rust.PatIdent;
import de.redoxi.ruste.rust.PatLiteral;
import de.redoxi.ruste.rust.PatNumberRange;
import de.redoxi.ruste.rust.PatOwned;
import de.redoxi.ruste.rust.PatRange;
import de.redoxi.ruste.rust.PatTuple;
import de.redoxi.ruste.rust.PatVector;
import de.redoxi.ruste.rust.PatWildcard;
import de.redoxi.ruste.rust.PrimitiveType;
import de.redoxi.ruste.rust.RustFactory;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructType;
import de.redoxi.ruste.rust.StructVariant;
import de.redoxi.ruste.rust.TupleType;
import de.redoxi.ruste.rust.TupleVariant;
import de.redoxi.ruste.rust.Type;
import de.redoxi.ruste.rust.UnitType;
import de.redoxi.ruste.rust.UnitVariant;
import de.redoxi.ruste.rust.Variant;
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
  private EClass patRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patCharRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patNumberRangeEClass = null;

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
  private EClass tupleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeEClass = null;

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
  private EClass enumTypeEClass = null;

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
  public EReference getCrate_Items()
  {
    return (EReference)crateEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getAttr_Ident()
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
  public EAttribute getItem_Ident()
  {
    return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getModItem_ExternalBody()
  {
    return (EAttribute)modItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModItem_Items()
  {
    return (EReference)modItemEClass.getEStructuralFeatures().get(1);
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
  public EReference getFnItem_Params()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_Args()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFnItem_ReturnType()
  {
    return (EReference)fnItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFnItem_Body()
  {
    return (EAttribute)fnItemEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getGenericParamDecl_Ident()
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
  public EAttribute getPatIdent_Ident()
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
  public EClass getPatRange()
  {
    return patRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatCharRange()
  {
    return patCharRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatCharRange_Start()
  {
    return (EReference)patCharRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatCharRange_End()
  {
    return (EReference)patCharRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatNumberRange()
  {
    return patNumberRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatNumberRange_Start()
  {
    return (EReference)patNumberRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatNumberRange_End()
  {
    return (EReference)patNumberRangeEClass.getEStructuralFeatures().get(1);
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
  public EClass getTupleType()
  {
    return tupleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTupleType_Types()
  {
    return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructType()
  {
    return structTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructType_Ident()
  {
    return (EAttribute)structTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructType_Params()
  {
    return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructType_Fields()
  {
    return (EReference)structTypeEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getStructField_Ident()
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
  public EClass getEnumType()
  {
    return enumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumType_Ident()
  {
    return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumType_Params()
  {
    return (EReference)enumTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumType_Variants()
  {
    return (EReference)enumTypeEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getVariant_Ident()
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
    createEReference(crateEClass, CRATE__ITEMS);

    itemAttrEClass = createEClass(ITEM_ATTR);
    createEReference(itemAttrEClass, ITEM_ATTR__ATTRS);

    attrEClass = createEClass(ATTR);
    createEAttribute(attrEClass, ATTR__IDENT);

    attrWithListEClass = createEClass(ATTR_WITH_LIST);
    createEReference(attrWithListEClass, ATTR_WITH_LIST__ATTRS);

    literalAttrEClass = createEClass(LITERAL_ATTR);
    createEReference(literalAttrEClass, LITERAL_ATTR__VALUE);

    itemAndAttrsEClass = createEClass(ITEM_AND_ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ITEM);

    itemEClass = createEClass(ITEM);
    createEAttribute(itemEClass, ITEM__IDENT);

    modItemEClass = createEClass(MOD_ITEM);
    createEAttribute(modItemEClass, MOD_ITEM__EXTERNAL_BODY);
    createEReference(modItemEClass, MOD_ITEM__ITEMS);

    fnItemEClass = createEClass(FN_ITEM);
    createEReference(fnItemEClass, FN_ITEM__PARAMS);
    createEReference(fnItemEClass, FN_ITEM__ARGS);
    createEReference(fnItemEClass, FN_ITEM__RETURN_TYPE);
    createEAttribute(fnItemEClass, FN_ITEM__BODY);

    genericParamDeclEClass = createEClass(GENERIC_PARAM_DECL);
    createEAttribute(genericParamDeclEClass, GENERIC_PARAM_DECL__IDENT);
    createEAttribute(genericParamDeclEClass, GENERIC_PARAM_DECL__BOUNDS);

    argEClass = createEClass(ARG);
    createEReference(argEClass, ARG__PAT);
    createEReference(argEClass, ARG__TYPE);

    patEClass = createEClass(PAT);

    patWildcardEClass = createEClass(PAT_WILDCARD);

    patIdentEClass = createEClass(PAT_IDENT);
    createEAttribute(patIdentEClass, PAT_IDENT__MUTABLE);
    createEAttribute(patIdentEClass, PAT_IDENT__IDENT);

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

    patRangeEClass = createEClass(PAT_RANGE);

    patCharRangeEClass = createEClass(PAT_CHAR_RANGE);
    createEReference(patCharRangeEClass, PAT_CHAR_RANGE__START);
    createEReference(patCharRangeEClass, PAT_CHAR_RANGE__END);

    patNumberRangeEClass = createEClass(PAT_NUMBER_RANGE);
    createEReference(patNumberRangeEClass, PAT_NUMBER_RANGE__START);
    createEReference(patNumberRangeEClass, PAT_NUMBER_RANGE__END);

    typeEClass = createEClass(TYPE);

    primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

    tupleTypeEClass = createEClass(TUPLE_TYPE);
    createEReference(tupleTypeEClass, TUPLE_TYPE__TYPES);

    structTypeEClass = createEClass(STRUCT_TYPE);
    createEAttribute(structTypeEClass, STRUCT_TYPE__IDENT);
    createEReference(structTypeEClass, STRUCT_TYPE__PARAMS);
    createEReference(structTypeEClass, STRUCT_TYPE__FIELDS);

    boxedPointerEClass = createEClass(BOXED_POINTER);
    createEReference(boxedPointerEClass, BOXED_POINTER__TYPE);

    ownedPointerEClass = createEClass(OWNED_POINTER);
    createEReference(ownedPointerEClass, OWNED_POINTER__TYPE);

    borrowedPointerEClass = createEClass(BORROWED_POINTER);
    createEReference(borrowedPointerEClass, BORROWED_POINTER__TYPE);

    structFieldEClass = createEClass(STRUCT_FIELD);
    createEAttribute(structFieldEClass, STRUCT_FIELD__VIS);
    createEAttribute(structFieldEClass, STRUCT_FIELD__IDENT);
    createEReference(structFieldEClass, STRUCT_FIELD__TYPE);

    enumTypeEClass = createEClass(ENUM_TYPE);
    createEAttribute(enumTypeEClass, ENUM_TYPE__IDENT);
    createEReference(enumTypeEClass, ENUM_TYPE__PARAMS);
    createEReference(enumTypeEClass, ENUM_TYPE__VARIANTS);

    variantEClass = createEClass(VARIANT);
    createEAttribute(variantEClass, VARIANT__IDENT);

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

    intTypeEClass = createEClass(INT_TYPE);

    floatTypeEClass = createEClass(FLOAT_TYPE);

    boolTypeEClass = createEClass(BOOL_TYPE);

    machineTypeEClass = createEClass(MACHINE_TYPE);

    unitTypeEClass = createEClass(UNIT_TYPE);

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
    attrWithListEClass.getESuperTypes().add(this.getAttr());
    literalAttrEClass.getESuperTypes().add(this.getAttr());
    modItemEClass.getESuperTypes().add(this.getItem());
    fnItemEClass.getESuperTypes().add(this.getItem());
    patWildcardEClass.getESuperTypes().add(this.getPat());
    patIdentEClass.getESuperTypes().add(this.getPat());
    patBoxedEClass.getESuperTypes().add(this.getPat());
    patOwnedEClass.getESuperTypes().add(this.getPat());
    patBorrowedEClass.getESuperTypes().add(this.getPat());
    patTupleEClass.getESuperTypes().add(this.getPat());
    patVectorEClass.getESuperTypes().add(this.getPat());
    patLiteralEClass.getESuperTypes().add(this.getPat());
    patRangeEClass.getESuperTypes().add(this.getPat());
    patCharRangeEClass.getESuperTypes().add(this.getPatRange());
    patNumberRangeEClass.getESuperTypes().add(this.getPatRange());
    primitiveTypeEClass.getESuperTypes().add(this.getType());
    tupleTypeEClass.getESuperTypes().add(this.getType());
    structTypeEClass.getESuperTypes().add(this.getType());
    boxedPointerEClass.getESuperTypes().add(this.getType());
    ownedPointerEClass.getESuperTypes().add(this.getType());
    borrowedPointerEClass.getESuperTypes().add(this.getType());
    enumTypeEClass.getESuperTypes().add(this.getType());
    structVariantEClass.getESuperTypes().add(this.getVariant());
    tupleVariantEClass.getESuperTypes().add(this.getVariant());
    unitVariantEClass.getESuperTypes().add(this.getVariant());
    stringLitEClass.getESuperTypes().add(this.getLiteral());
    numberLitEClass.getESuperTypes().add(this.getLiteral());
    charLitEClass.getESuperTypes().add(this.getLiteral());
    intTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    floatTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    boolTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    machineTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    unitTypeEClass.getESuperTypes().add(this.getPrimitiveType());

    // Initialize classes and features; add operations and parameters
    initEClass(crateEClass, Crate.class, "Crate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCrate_Items(), this.getItemAndAttrs(), null, "items", null, 0, -1, Crate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemAttrEClass, ItemAttr.class, "ItemAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAttr_Attrs(), this.getAttr(), null, "attrs", null, 0, -1, ItemAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrEClass, Attr.class, "Attr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttr_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, Attr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrWithListEClass, AttrWithList.class, "AttrWithList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttrWithList_Attrs(), this.getAttr(), null, "attrs", null, 0, -1, AttrWithList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalAttrEClass, LiteralAttr.class, "LiteralAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralAttr_Value(), this.getLiteral(), null, "value", null, 0, 1, LiteralAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemAndAttrsEClass, ItemAndAttrs.class, "ItemAndAttrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAndAttrs_Attrs(), this.getItemAttr(), null, "attrs", null, 0, -1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemAndAttrs_Item(), this.getItem(), null, "item", null, 0, 1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modItemEClass, ModItem.class, "ModItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModItem_ExternalBody(), ecorePackage.getEBoolean(), "externalBody", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModItem_Items(), this.getItemAndAttrs(), null, "items", null, 0, -1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fnItemEClass, FnItem.class, "FnItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFnItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Args(), this.getArg(), null, "args", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_ReturnType(), this.getType(), null, "returnType", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFnItem_Body(), ecorePackage.getEString(), "body", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericParamDeclEClass, GenericParamDecl.class, "GenericParamDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGenericParamDecl_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, GenericParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenericParamDecl_Bounds(), ecorePackage.getEString(), "bounds", null, 0, -1, GenericParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argEClass, Arg.class, "Arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArg_Pat(), this.getPat(), null, "pat", null, 0, 1, Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArg_Type(), this.getType(), null, "type", null, 0, 1, Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patEClass, Pat.class, "Pat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patWildcardEClass, PatWildcard.class, "PatWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patIdentEClass, PatIdent.class, "PatIdent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPatIdent_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, PatIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatIdent_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, PatIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(patRangeEClass, PatRange.class, "PatRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patCharRangeEClass, PatCharRange.class, "PatCharRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatCharRange_Start(), this.getCharLit(), null, "start", null, 0, 1, PatCharRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatCharRange_End(), this.getCharLit(), null, "end", null, 0, 1, PatCharRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patNumberRangeEClass, PatNumberRange.class, "PatNumberRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatNumberRange_Start(), this.getNumberLit(), null, "start", null, 0, 1, PatNumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatNumberRange_End(), this.getNumberLit(), null, "end", null, 0, 1, PatNumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTupleType_Types(), this.getType(), null, "types", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructType_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructType_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructType_Fields(), this.getStructField(), null, "fields", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boxedPointerEClass, BoxedPointer.class, "BoxedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBoxedPointer_Type(), this.getType(), null, "type", null, 0, 1, BoxedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ownedPointerEClass, OwnedPointer.class, "OwnedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOwnedPointer_Type(), this.getType(), null, "type", null, 0, 1, OwnedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borrowedPointerEClass, BorrowedPointer.class, "BorrowedPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBorrowedPointer_Type(), this.getType(), null, "type", null, 0, 1, BorrowedPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structFieldEClass, StructField.class, "StructField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructField_Vis(), this.getVisibility(), "vis", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructField_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructField_Type(), this.getType(), null, "type", null, 0, 1, StructField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumType_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumType_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumType_Variants(), this.getVariant(), null, "variants", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariant_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(machineTypeEClass, MachineType.class, "MachineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);

    // Create resource
    createResource(eNS_URI);
  }

} //RustPackageImpl
