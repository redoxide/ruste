/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.Attr;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.Block;
import de.redoxi.ruste.rust.BoolType;
import de.redoxi.ruste.rust.BorrowedPointer;
import de.redoxi.ruste.rust.BoxedPointer;
import de.redoxi.ruste.rust.CharLit;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.EnumItem;
import de.redoxi.ruste.rust.EnumType;
import de.redoxi.ruste.rust.EnumVariant;
import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprLiteral;
import de.redoxi.ruste.rust.ExprRValue;
import de.redoxi.ruste.rust.ExternBlock;
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
import de.redoxi.ruste.rust.PatEnum;
import de.redoxi.ruste.rust.PatIdent;
import de.redoxi.ruste.rust.PatLiteral;
import de.redoxi.ruste.rust.PatNumberRange;
import de.redoxi.ruste.rust.PatOwned;
import de.redoxi.ruste.rust.PatRange;
import de.redoxi.ruste.rust.PatStructEnum;
import de.redoxi.ruste.rust.PatTuple;
import de.redoxi.ruste.rust.PatTupleEnum;
import de.redoxi.ruste.rust.PatVector;
import de.redoxi.ruste.rust.PatWildcard;
import de.redoxi.ruste.rust.Path;
import de.redoxi.ruste.rust.PrimitiveType;
import de.redoxi.ruste.rust.RustFactory;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StaticItem;
import de.redoxi.ruste.rust.StringLit;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructItem;
import de.redoxi.ruste.rust.StructType;
import de.redoxi.ruste.rust.StructVariant;
import de.redoxi.ruste.rust.TraitItem;
import de.redoxi.ruste.rust.TraitMethod;
import de.redoxi.ruste.rust.TupleType;
import de.redoxi.ruste.rust.TupleVariant;
import de.redoxi.ruste.rust.Type;
import de.redoxi.ruste.rust.TypeItem;
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
  private EClass exprRValueEClass = null;

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
  private EClass blockEClass = null;

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
  private EClass pathEClass = null;

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
  public EClass getModItem()
  {
    return modItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModItem_Ident()
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
  public EReference getModItem_Items()
  {
    return (EReference)modItemEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getFnItem_Ident()
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
  public EAttribute getTypeItem_Ident()
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
  public EAttribute getStructItem_Ident()
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
  public EAttribute getEnumItem_Ident()
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
  public EAttribute getEnumVariant_Ident()
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
  public EAttribute getTraitItem_Ident()
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
  public EAttribute getTraitMethod_Ident()
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
  public EAttribute getImplMethod_Ident()
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
  public EAttribute getForeignFn_Ident()
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
  public EAttribute getStaticItem_Ident()
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
  public EClass getExprRValue()
  {
    return exprRValueEClass;
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
  public EClass getBlock()
  {
    return blockEClass;
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
  public EAttribute getFieldPat_Ident()
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
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPath_Segments()
  {
    return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPath_Lifetimes()
  {
    return (EAttribute)pathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPath_GenericTypes()
  {
    return (EReference)pathEClass.getEStructuralFeatures().get(2);
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

    modItemEClass = createEClass(MOD_ITEM);
    createEAttribute(modItemEClass, MOD_ITEM__IDENT);
    createEAttribute(modItemEClass, MOD_ITEM__EXTERNAL_BODY);
    createEReference(modItemEClass, MOD_ITEM__ITEMS);

    fnItemEClass = createEClass(FN_ITEM);
    createEAttribute(fnItemEClass, FN_ITEM__IDENT);
    createEReference(fnItemEClass, FN_ITEM__PARAMS);
    createEReference(fnItemEClass, FN_ITEM__ARGS);
    createEReference(fnItemEClass, FN_ITEM__RETURN_TYPE);
    createEReference(fnItemEClass, FN_ITEM__BODY);

    typeItemEClass = createEClass(TYPE_ITEM);
    createEAttribute(typeItemEClass, TYPE_ITEM__IDENT);
    createEReference(typeItemEClass, TYPE_ITEM__PARAMS);
    createEReference(typeItemEClass, TYPE_ITEM__TYPE);

    structItemEClass = createEClass(STRUCT_ITEM);
    createEAttribute(structItemEClass, STRUCT_ITEM__IDENT);
    createEReference(structItemEClass, STRUCT_ITEM__PARAMS);
    createEReference(structItemEClass, STRUCT_ITEM__FIELDS);

    enumItemEClass = createEClass(ENUM_ITEM);
    createEAttribute(enumItemEClass, ENUM_ITEM__IDENT);
    createEReference(enumItemEClass, ENUM_ITEM__PARAMS);
    createEReference(enumItemEClass, ENUM_ITEM__VARIANTS);

    enumVariantEClass = createEClass(ENUM_VARIANT);
    createEAttribute(enumVariantEClass, ENUM_VARIANT__IDENT);
    createEAttribute(enumVariantEClass, ENUM_VARIANT__PARAMS);
    createEReference(enumVariantEClass, ENUM_VARIANT__TYPES);
    createEReference(enumVariantEClass, ENUM_VARIANT__FIELDS);

    traitItemEClass = createEClass(TRAIT_ITEM);
    createEAttribute(traitItemEClass, TRAIT_ITEM__IDENT);
    createEReference(traitItemEClass, TRAIT_ITEM__PARAMS);
    createEReference(traitItemEClass, TRAIT_ITEM__METHODS);

    traitMethodEClass = createEClass(TRAIT_METHOD);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__UNSAFE);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__EXTERN);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__VIS);
    createEAttribute(traitMethodEClass, TRAIT_METHOD__IDENT);
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
    createEAttribute(implMethodEClass, IMPL_METHOD__IDENT);
    createEReference(implMethodEClass, IMPL_METHOD__PARAMS);
    createEReference(implMethodEClass, IMPL_METHOD__ARGS);
    createEReference(implMethodEClass, IMPL_METHOD__RETURN_TYPE);
    createEReference(implMethodEClass, IMPL_METHOD__BODY);

    externBlockEClass = createEClass(EXTERN_BLOCK);
    createEAttribute(externBlockEClass, EXTERN_BLOCK__ABI);
    createEReference(externBlockEClass, EXTERN_BLOCK__FUNCTIONS);

    foreignFnEClass = createEClass(FOREIGN_FN);
    createEAttribute(foreignFnEClass, FOREIGN_FN__IDENT);
    createEReference(foreignFnEClass, FOREIGN_FN__ARGS);
    createEReference(foreignFnEClass, FOREIGN_FN__RETURN_TYPE);

    staticItemEClass = createEClass(STATIC_ITEM);
    createEAttribute(staticItemEClass, STATIC_ITEM__MUTABLE);
    createEAttribute(staticItemEClass, STATIC_ITEM__IDENT);
    createEReference(staticItemEClass, STATIC_ITEM__TYPE);
    createEReference(staticItemEClass, STATIC_ITEM__EXPR);

    exprEClass = createEClass(EXPR);

    exprRValueEClass = createEClass(EXPR_RVALUE);

    exprLiteralEClass = createEClass(EXPR_LITERAL);
    createEReference(exprLiteralEClass, EXPR_LITERAL__LITERAL);

    blockEClass = createEClass(BLOCK);

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

    patEnumEClass = createEClass(PAT_ENUM);
    createEReference(patEnumEClass, PAT_ENUM__PATH);

    fieldPatEClass = createEClass(FIELD_PAT);
    createEAttribute(fieldPatEClass, FIELD_PAT__IDENT);
    createEReference(fieldPatEClass, FIELD_PAT__PATTERN);

    pathEClass = createEClass(PATH);
    createEAttribute(pathEClass, PATH__SEGMENTS);
    createEAttribute(pathEClass, PATH__LIFETIMES);
    createEReference(pathEClass, PATH__GENERIC_TYPES);

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

    patTupleEnumEClass = createEClass(PAT_TUPLE_ENUM);
    createEReference(patTupleEnumEClass, PAT_TUPLE_ENUM__PATTERNS);

    patStructEnumEClass = createEClass(PAT_STRUCT_ENUM);
    createEReference(patStructEnumEClass, PAT_STRUCT_ENUM__FIELD_PATTERNS);

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
    typeItemEClass.getESuperTypes().add(this.getItem());
    structItemEClass.getESuperTypes().add(this.getItem());
    enumItemEClass.getESuperTypes().add(this.getItem());
    traitItemEClass.getESuperTypes().add(this.getItem());
    implItemEClass.getESuperTypes().add(this.getItem());
    externBlockEClass.getESuperTypes().add(this.getItem());
    staticItemEClass.getESuperTypes().add(this.getItem());
    exprRValueEClass.getESuperTypes().add(this.getExpr());
    exprLiteralEClass.getESuperTypes().add(this.getExprRValue());
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
    patEnumEClass.getESuperTypes().add(this.getPat());
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
    patTupleEnumEClass.getESuperTypes().add(this.getPatEnum());
    patStructEnumEClass.getESuperTypes().add(this.getPatEnum());
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

    initEClass(modItemEClass, ModItem.class, "ModItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModItem_ExternalBody(), ecorePackage.getEBoolean(), "externalBody", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModItem_Items(), this.getItemAndAttrs(), null, "items", null, 0, -1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fnItemEClass, FnItem.class, "FnItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFnItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Args(), this.getArg(), null, "args", null, 0, -1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_ReturnType(), this.getType(), null, "returnType", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFnItem_Body(), this.getBlock(), null, "body", null, 0, 1, FnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeItemEClass, TypeItem.class, "TypeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeItem_Type(), this.getType(), null, "type", null, 0, 1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structItemEClass, StructItem.class, "StructItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructItem_Fields(), this.getStructField(), null, "fields", null, 0, -1, StructItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumItemEClass, EnumItem.class, "EnumItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumItem_Variants(), this.getEnumVariant(), null, "variants", null, 0, -1, EnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumVariantEClass, EnumVariant.class, "EnumVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumVariant_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumVariant_Params(), ecorePackage.getEString(), "params", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumVariant_Types(), this.getType(), null, "types", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumVariant_Fields(), this.getStructField(), null, "fields", null, 0, -1, EnumVariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traitItemEClass, TraitItem.class, "TraitItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTraitItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitItem_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraitItem_Methods(), this.getTraitMethod(), null, "methods", null, 0, -1, TraitItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(traitMethodEClass, TraitMethod.class, "TraitMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTraitMethod_Unsafe(), ecorePackage.getEBoolean(), "unsafe", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Extern(), ecorePackage.getEBoolean(), "extern", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Vis(), this.getVisibility(), "vis", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraitMethod_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, TraitMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    initEAttribute(getImplMethod_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Params(), this.getGenericParamDecl(), null, "params", null, 0, -1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Args(), this.getArg(), null, "args", null, 0, -1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplMethod_Body(), this.getBlock(), null, "body", null, 0, 1, ImplMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externBlockEClass, ExternBlock.class, "ExternBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternBlock_Abi(), ecorePackage.getEString(), "abi", null, 0, 1, ExternBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternBlock_Functions(), this.getForeignFn(), null, "functions", null, 0, -1, ExternBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreignFnEClass, ForeignFn.class, "ForeignFn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForeignFn_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignFn_Args(), this.getArg(), null, "args", null, 0, -1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeignFn_ReturnType(), this.getType(), null, "returnType", null, 0, 1, ForeignFn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticItemEClass, StaticItem.class, "StaticItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticItem_Mutable(), ecorePackage.getEBoolean(), "mutable", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStaticItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticItem_Type(), this.getType(), null, "type", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticItem_Expr(), this.getExpr(), null, "expr", null, 0, 1, StaticItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprRValueEClass, ExprRValue.class, "ExprRValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprLiteralEClass, ExprLiteral.class, "ExprLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprLiteral_Literal(), this.getLiteral(), null, "literal", null, 0, 1, ExprLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(patEnumEClass, PatEnum.class, "PatEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatEnum_Path(), ecorePackage.getEObject(), null, "path", null, 0, 1, PatEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldPatEClass, FieldPat.class, "FieldPat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldPat_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, FieldPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldPat_Pattern(), this.getPat(), null, "pattern", null, 0, 1, FieldPat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPath_Segments(), ecorePackage.getEString(), "segments", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPath_Lifetimes(), ecorePackage.getEString(), "lifetimes", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPath_GenericTypes(), this.getType(), null, "genericTypes", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(patTupleEnumEClass, PatTupleEnum.class, "PatTupleEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatTupleEnum_Patterns(), this.getPat(), null, "patterns", null, 0, -1, PatTupleEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patStructEnumEClass, PatStructEnum.class, "PatStructEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatStructEnum_FieldPatterns(), this.getFieldPat(), null, "fieldPatterns", null, 0, -1, PatStructEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
