/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.redoxi.ruste.rust.RustFactory
 * @model kind="package"
 * @generated
 */
public interface RustPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rust";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.redoxi.de/ruste/grammar/Rust";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rust";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RustPackage eINSTANCE = de.redoxi.ruste.rust.impl.RustPackageImpl.init();

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.CrateImpl <em>Crate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.CrateImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getCrate()
   * @generated
   */
  int CRATE = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRATE__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Crate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ItemAttrImpl <em>Item Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ItemAttrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItemAttr()
   * @generated
   */
  int ITEM_ATTR = 1;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ATTR__ATTRS = 0;

  /**
   * The number of structural features of the '<em>Item Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_ATTR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.AttrImpl <em>Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.AttrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAttr()
   * @generated
   */
  int ATTR = 2;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__IDENT = 0;

  /**
   * The number of structural features of the '<em>Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.AttrWithListImpl <em>Attr With List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.AttrWithListImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAttrWithList()
   * @generated
   */
  int ATTR_WITH_LIST = 3;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_WITH_LIST__IDENT = ATTR__IDENT;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_WITH_LIST__ATTRS = ATTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attr With List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_WITH_LIST_FEATURE_COUNT = ATTR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.LiteralAttrImpl <em>Literal Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.LiteralAttrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLiteralAttr()
   * @generated
   */
  int LITERAL_ATTR = 4;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ATTR__IDENT = ATTR__IDENT;

  /**
   * The number of structural features of the '<em>Literal Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ItemAndAttrsImpl <em>Item And Attrs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ItemAndAttrsImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItemAndAttrs()
   * @generated
   */
  int ITEM_AND_ATTRS = 5;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_AND_ATTRS__ATTRS = 0;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_AND_ATTRS__ITEM = 1;

  /**
   * The number of structural features of the '<em>Item And Attrs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_AND_ATTRS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItem()
   * @generated
   */
  int ITEM = 6;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ModItemImpl <em>Mod Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ModItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getModItem()
   * @generated
   */
  int MOD_ITEM = 7;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mod Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Crate <em>Crate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Crate</em>'.
   * @see de.redoxi.ruste.rust.Crate
   * @generated
   */
  EClass getCrate();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.Crate#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see de.redoxi.ruste.rust.Crate#getItems()
   * @see #getCrate()
   * @generated
   */
  EReference getCrate_Items();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ItemAttr <em>Item Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Attr</em>'.
   * @see de.redoxi.ruste.rust.ItemAttr
   * @generated
   */
  EClass getItemAttr();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ItemAttr#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see de.redoxi.ruste.rust.ItemAttr#getAttrs()
   * @see #getItemAttr()
   * @generated
   */
  EReference getItemAttr_Attrs();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Attr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr</em>'.
   * @see de.redoxi.ruste.rust.Attr
   * @generated
   */
  EClass getAttr();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.Attr#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.Attr#getIdent()
   * @see #getAttr()
   * @generated
   */
  EAttribute getAttr_Ident();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.AttrWithList <em>Attr With List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr With List</em>'.
   * @see de.redoxi.ruste.rust.AttrWithList
   * @generated
   */
  EClass getAttrWithList();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.AttrWithList#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see de.redoxi.ruste.rust.AttrWithList#getAttrs()
   * @see #getAttrWithList()
   * @generated
   */
  EReference getAttrWithList_Attrs();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.LiteralAttr <em>Literal Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Attr</em>'.
   * @see de.redoxi.ruste.rust.LiteralAttr
   * @generated
   */
  EClass getLiteralAttr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ItemAndAttrs <em>Item And Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item And Attrs</em>'.
   * @see de.redoxi.ruste.rust.ItemAndAttrs
   * @generated
   */
  EClass getItemAndAttrs();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ItemAndAttrs#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see de.redoxi.ruste.rust.ItemAndAttrs#getAttrs()
   * @see #getItemAndAttrs()
   * @generated
   */
  EReference getItemAndAttrs_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ItemAndAttrs#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see de.redoxi.ruste.rust.ItemAndAttrs#getItem()
   * @see #getItemAndAttrs()
   * @generated
   */
  EReference getItemAndAttrs_Item();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see de.redoxi.ruste.rust.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ModItem <em>Mod Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Item</em>'.
   * @see de.redoxi.ruste.rust.ModItem
   * @generated
   */
  EClass getModItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ModItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.ModItem#getIdent()
   * @see #getModItem()
   * @generated
   */
  EAttribute getModItem_Ident();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RustFactory getRustFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.CrateImpl <em>Crate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.CrateImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getCrate()
     * @generated
     */
    EClass CRATE = eINSTANCE.getCrate();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRATE__ITEMS = eINSTANCE.getCrate_Items();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ItemAttrImpl <em>Item Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ItemAttrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItemAttr()
     * @generated
     */
    EClass ITEM_ATTR = eINSTANCE.getItemAttr();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_ATTR__ATTRS = eINSTANCE.getItemAttr_Attrs();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.AttrImpl <em>Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.AttrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAttr()
     * @generated
     */
    EClass ATTR = eINSTANCE.getAttr();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR__IDENT = eINSTANCE.getAttr_Ident();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.AttrWithListImpl <em>Attr With List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.AttrWithListImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAttrWithList()
     * @generated
     */
    EClass ATTR_WITH_LIST = eINSTANCE.getAttrWithList();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_WITH_LIST__ATTRS = eINSTANCE.getAttrWithList_Attrs();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.LiteralAttrImpl <em>Literal Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.LiteralAttrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLiteralAttr()
     * @generated
     */
    EClass LITERAL_ATTR = eINSTANCE.getLiteralAttr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ItemAndAttrsImpl <em>Item And Attrs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ItemAndAttrsImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItemAndAttrs()
     * @generated
     */
    EClass ITEM_AND_ATTRS = eINSTANCE.getItemAndAttrs();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_AND_ATTRS__ATTRS = eINSTANCE.getItemAndAttrs_Attrs();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_AND_ATTRS__ITEM = eINSTANCE.getItemAndAttrs_Item();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ModItemImpl <em>Mod Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ModItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getModItem()
     * @generated
     */
    EClass MOD_ITEM = eINSTANCE.getModItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_ITEM__IDENT = eINSTANCE.getModItem_Ident();

  }

} //RustPackage
