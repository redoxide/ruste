/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Attr;
import de.redoxi.ruste.rust.AttrWithList;
import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.Item;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ItemAttr;
import de.redoxi.ruste.rust.LiteralAttr;
import de.redoxi.ruste.rust.ModItem;
import de.redoxi.ruste.rust.RustFactory;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

    itemAndAttrsEClass = createEClass(ITEM_AND_ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ATTRS);
    createEReference(itemAndAttrsEClass, ITEM_AND_ATTRS__ITEM);

    itemEClass = createEClass(ITEM);

    modItemEClass = createEClass(MOD_ITEM);
    createEAttribute(modItemEClass, MOD_ITEM__IDENT);
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

    initEClass(itemAndAttrsEClass, ItemAndAttrs.class, "ItemAndAttrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItemAndAttrs_Attrs(), this.getItemAttr(), null, "attrs", null, 0, -1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemAndAttrs_Item(), this.getItem(), null, "item", null, 0, 1, ItemAndAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modItemEClass, ModItem.class, "ModItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModItem_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, ModItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RustPackageImpl
