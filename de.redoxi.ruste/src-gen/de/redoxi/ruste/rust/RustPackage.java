/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ATTR__VALUE = ATTR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_ATTR_FEATURE_COUNT = ATTR_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>External Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM__EXTERNAL_BODY = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM__ITEMS = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mod Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.FnItemImpl <em>Fn Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.FnItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFnItem()
   * @generated
   */
  int FN_ITEM = 8;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__PARAMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__ARGS = ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__RETURN_TYPE = ITEM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__BODY = ITEM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Fn Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TypeItemImpl <em>Type Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TypeItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTypeItem()
   * @generated
   */
  int TYPE_ITEM = 9;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ITEM__PARAMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ITEM__TYPE = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StructItemImpl <em>Struct Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StructItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructItem()
   * @generated
   */
  int STRUCT_ITEM = 10;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ITEM__PARAMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ITEM__FIELDS = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Struct Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.EnumItemImpl <em>Enum Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.EnumItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumItem()
   * @generated
   */
  int ENUM_ITEM = 11;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM__PARAMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM__VARIANTS = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.EnumVariantImpl <em>Enum Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.EnumVariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumVariant()
   * @generated
   */
  int ENUM_VARIANT = 12;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VARIANT__IDENT = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VARIANT__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VARIANT__TYPES = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VARIANT__FIELDS = 3;

  /**
   * The number of structural features of the '<em>Enum Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_VARIANT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TraitItemImpl <em>Trait Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TraitItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTraitItem()
   * @generated
   */
  int TRAIT_ITEM = 13;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ITEM__IDENT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ITEM__PARAMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ITEM__METHODS = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trait Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TraitMethodImpl <em>Trait Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TraitMethodImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTraitMethod()
   * @generated
   */
  int TRAIT_METHOD = 14;

  /**
   * The feature id for the '<em><b>Unsafe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__UNSAFE = 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__EXTERN = 1;

  /**
   * The feature id for the '<em><b>Vis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__VIS = 2;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__IDENT = 3;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__PARAMS = 4;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__ARGS = 5;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__RETURN_TYPE = 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD__BODY = 7;

  /**
   * The number of structural features of the '<em>Trait Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_METHOD_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ImplItemImpl <em>Impl Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ImplItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getImplItem()
   * @generated
   */
  int IMPL_ITEM = 15;

  /**
   * The feature id for the '<em><b>Trait</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_ITEM__TRAIT = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_ITEM__STRUCT = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_ITEM__METHODS = ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Impl Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ImplMethodImpl <em>Impl Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ImplMethodImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getImplMethod()
   * @generated
   */
  int IMPL_METHOD = 16;

  /**
   * The feature id for the '<em><b>Unsafe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__UNSAFE = 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__EXTERN = 1;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__IDENT = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__PARAMS = 3;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__ARGS = 4;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__RETURN_TYPE = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD__BODY = 6;

  /**
   * The number of structural features of the '<em>Impl Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPL_METHOD_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExternBlockImpl <em>Extern Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExternBlockImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExternBlock()
   * @generated
   */
  int EXTERN_BLOCK = 17;

  /**
   * The feature id for the '<em><b>Abi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_BLOCK__ABI = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_BLOCK__FUNCTIONS = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extern Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_BLOCK_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ForeignFnImpl <em>Foreign Fn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ForeignFnImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getForeignFn()
   * @generated
   */
  int FOREIGN_FN = 18;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_FN__IDENT = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_FN__ARGS = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_FN__RETURN_TYPE = 2;

  /**
   * The number of structural features of the '<em>Foreign Fn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_FN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StaticItemImpl <em>Static Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StaticItemImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStaticItem()
   * @generated
   */
  int STATIC_ITEM = 19;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ITEM__MUTABLE = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ITEM__IDENT = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ITEM__TYPE = ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ITEM__EXPR = ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Static Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 20;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BooleanOrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBooleanOr()
   * @generated
   */
  int BOOLEAN_OR = 48;

  /**
   * The number of structural features of the '<em>Boolean Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_OR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BooleanAndImpl <em>Boolean And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BooleanAndImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBooleanAnd()
   * @generated
   */
  int BOOLEAN_AND = 47;

  /**
   * The number of structural features of the '<em>Boolean And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_AND_FEATURE_COUNT = BOOLEAN_OR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.EqualityOperatorImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEqualityOperator()
   * @generated
   */
  int EQUALITY_OPERATOR = 46;

  /**
   * The number of structural features of the '<em>Equality Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_OPERATOR_FEATURE_COUNT = BOOLEAN_AND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ComparisonOperatorsImpl <em>Comparison Operators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ComparisonOperatorsImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getComparisonOperators()
   * @generated
   */
  int COMPARISON_OPERATORS = 45;

  /**
   * The number of structural features of the '<em>Comparison Operators</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATORS_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BitwiseOrImpl <em>Bitwise Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BitwiseOrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseOr()
   * @generated
   */
  int BITWISE_OR = 44;

  /**
   * The number of structural features of the '<em>Bitwise Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_FEATURE_COUNT = COMPARISON_OPERATORS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BitwiseXorImpl <em>Bitwise Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BitwiseXorImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseXor()
   * @generated
   */
  int BITWISE_XOR = 43;

  /**
   * The number of structural features of the '<em>Bitwise Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_XOR_FEATURE_COUNT = BITWISE_OR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BitwiseAndImpl <em>Bitwise And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BitwiseAndImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseAnd()
   * @generated
   */
  int BITWISE_AND = 42;

  /**
   * The number of structural features of the '<em>Bitwise And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_FEATURE_COUNT = BITWISE_XOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ShiftOperatorImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getShiftOperator()
   * @generated
   */
  int SHIFT_OPERATOR = 41;

  /**
   * The number of structural features of the '<em>Shift Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_OPERATOR_FEATURE_COUNT = BITWISE_AND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.AdditionOrSubtractionImpl <em>Addition Or Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.AdditionOrSubtractionImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAdditionOrSubtraction()
   * @generated
   */
  int ADDITION_OR_SUBTRACTION = 40;

  /**
   * The number of structural features of the '<em>Addition Or Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_OR_SUBTRACTION_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.AsImpl <em>As</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.AsImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAs()
   * @generated
   */
  int AS = 39;

  /**
   * The number of structural features of the '<em>As</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_FEATURE_COUNT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.DivisionMultiplicationOrModuloImpl <em>Division Multiplication Or Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.DivisionMultiplicationOrModuloImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDivisionMultiplicationOrModulo()
   * @generated
   */
  int DIVISION_MULTIPLICATION_OR_MODULO = 38;

  /**
   * The number of structural features of the '<em>Division Multiplication Or Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT = AS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLeafImpl <em>Expr Leaf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLeafImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLeaf()
   * @generated
   */
  int EXPR_LEAF = 23;

  /**
   * The number of structural features of the '<em>Expr Leaf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LEAF_FEATURE_COUNT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLValueImpl <em>Expr LValue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLValueImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLValue()
   * @generated
   */
  int EXPR_LVALUE = 21;

  /**
   * The number of structural features of the '<em>Expr LValue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LVALUE_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprRValueImpl <em>Expr RValue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprRValueImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprRValue()
   * @generated
   */
  int EXPR_RVALUE = 22;

  /**
   * The number of structural features of the '<em>Expr RValue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RVALUE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLiteralImpl <em>Expr Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLiteralImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLiteral()
   * @generated
   */
  int EXPR_LITERAL = 24;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LITERAL__LITERAL = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LITERAL_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprPathHeadImpl <em>Expr Path Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprPathHeadImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprPathHead()
   * @generated
   */
  int EXPR_PATH_HEAD = 25;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH_HEAD__PATH = EXPR_LVALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Path Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH_HEAD_FEATURE_COUNT = EXPR_LVALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprGroupImpl <em>Expr Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprGroupImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGroup()
   * @generated
   */
  int EXPR_GROUP = 26;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GROUP_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprTupleImpl <em>Expr Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprTupleImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprTuple()
   * @generated
   */
  int EXPR_TUPLE = 27;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TUPLE__PATH = EXPR_PATH_HEAD__PATH;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TUPLE__EXPR = EXPR_PATH_HEAD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TUPLE__TUPLE = EXPR_PATH_HEAD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TUPLE__EXPRS = EXPR_PATH_HEAD_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TUPLE_FEATURE_COUNT = EXPR_PATH_HEAD_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprStructImpl <em>Expr Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprStructImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprStruct()
   * @generated
   */
  int EXPR_STRUCT = 28;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STRUCT__PATH = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STRUCT__STRUCT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STRUCT__FIELDS = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Base Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STRUCT__BASE_EXPR = EXPR_LEAF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expr Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STRUCT_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprVecImpl <em>Expr Vec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprVecImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprVec()
   * @generated
   */
  int EXPR_VEC = 29;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VEC__MUTABLE = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VEC__EXPRS = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Len Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VEC__LEN_EXPR = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Vec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VEC_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprUnaryImpl <em>Expr Unary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprUnaryImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprUnary()
   * @generated
   */
  int EXPR_UNARY = 30;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_UNARY__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Unary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_UNARY_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.NumericNegationImpl <em>Numeric Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.NumericNegationImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNumericNegation()
   * @generated
   */
  int NUMERIC_NEGATION = 31;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_NEGATION__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Numeric Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_NEGATION_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.DereferenceImpl <em>Dereference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.DereferenceImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDereference()
   * @generated
   */
  int DEREFERENCE = 32;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEREFERENCE__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Dereference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEREFERENCE_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.LogicalNegationImpl <em>Logical Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.LogicalNegationImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLogicalNegation()
   * @generated
   */
  int LOGICAL_NEGATION = 33;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NEGATION__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Logical Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_NEGATION_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ManagedBoxImpl <em>Managed Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ManagedBoxImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getManagedBox()
   * @generated
   */
  int MANAGED_BOX = 34;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_BOX__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Managed Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANAGED_BOX_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.OwnedBoxImpl <em>Owned Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.OwnedBoxImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedBox()
   * @generated
   */
  int OWNED_BOX = 35;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_BOX__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Owned Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_BOX_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BorrowImpl <em>Borrow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BorrowImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrow()
   * @generated
   */
  int BORROW = 36;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROW__EXPR = EXPR_UNARY__EXPR;

  /**
   * The number of structural features of the '<em>Borrow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROW_FEATURE_COUNT = EXPR_UNARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBinaryImpl <em>Expr Binary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBinaryImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBinary()
   * @generated
   */
  int EXPR_BINARY = 37;

  /**
   * The number of structural features of the '<em>Expr Binary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BINARY_FEATURE_COUNT = EXPR_RVALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.AssignImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 49;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = EXPR_BINARY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLambdaImpl <em>Expr Lambda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLambdaImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLambda()
   * @generated
   */
  int EXPR_LAMBDA = 50;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LAMBDA__ARGS = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LAMBDA__EXPR = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Lambda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LAMBDA_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprWhileImpl <em>Expr While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprWhileImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprWhile()
   * @generated
   */
  int EXPR_WHILE = 51;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_WHILE__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_WHILE__BLOCK = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_WHILE_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLoopImpl <em>Expr Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLoopImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLoop()
   * @generated
   */
  int EXPR_LOOP = 52;

  /**
   * The feature id for the '<em><b>Lifetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LOOP__LIFETIME = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LOOP__BLOCK = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LOOP_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBreakImpl <em>Expr Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBreakImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBreak()
   * @generated
   */
  int EXPR_BREAK = 53;

  /**
   * The feature id for the '<em><b>Lifetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BREAK__LIFETIME = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BREAK_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprContinueImpl <em>Expr Continue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprContinueImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprContinue()
   * @generated
   */
  int EXPR_CONTINUE = 54;

  /**
   * The feature id for the '<em><b>Lifetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONTINUE__LIFETIME = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Continue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CONTINUE_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprDoImpl <em>Expr Do</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprDoImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprDo()
   * @generated
   */
  int EXPR_DO = 55;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_DO__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_DO__ARGS = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_DO__BLOCK = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr Do</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_DO_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprForImpl <em>Expr For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprForImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprFor()
   * @generated
   */
  int EXPR_FOR = 56;

  /**
   * The feature id for the '<em><b>Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FOR__PAT = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FOR__EXPR = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FOR__BLOCK = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FOR_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprIfImpl <em>Expr If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprIfImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprIf()
   * @generated
   */
  int EXPR_IF = 57;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_IF__BLOCK = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_IF__EXPR = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_IF__ELSE = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Expr If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_IF_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ElseTailImpl <em>Else Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ElseTailImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getElseTail()
   * @generated
   */
  int ELSE_TAIL = 58;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TAIL__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Else Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TAIL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprMatchImpl <em>Expr Match</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprMatchImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprMatch()
   * @generated
   */
  int EXPR_MATCH = 59;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MATCH__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MATCH__ARMS = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Match</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MATCH_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.MatchArmImpl <em>Match Arm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.MatchArmImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMatchArm()
   * @generated
   */
  int MATCH_ARM = 60;

  /**
   * The feature id for the '<em><b>Match Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ARM__MATCH_PAT = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ARM__EXPR = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ARM__BLOCK = 2;

  /**
   * The number of structural features of the '<em>Match Arm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ARM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.MatchPatImpl <em>Match Pat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.MatchPatImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMatchPat()
   * @generated
   */
  int MATCH_PAT = 61;

  /**
   * The feature id for the '<em><b>Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAT__PAT = 0;

  /**
   * The feature id for the '<em><b>End Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAT__END_PAT = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAT__EXPR = 2;

  /**
   * The number of structural features of the '<em>Match Pat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_PAT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprReturnImpl <em>Expr Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprReturnImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprReturn()
   * @generated
   */
  int EXPR_RETURN = 62;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RETURN__EXPR = EXPR_LEAF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RETURN_FEATURE_COUNT = EXPR_LEAF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BlockImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 63;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPR = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STMTS = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StmtImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStmt()
   * @generated
   */
  int STMT = 64;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__EXPR = 0;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.SlotDeclStmtImpl <em>Slot Decl Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.SlotDeclStmtImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getSlotDeclStmt()
   * @generated
   */
  int SLOT_DECL_STMT = 65;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_DECL_STMT__EXPR = STMT__EXPR;

  /**
   * The feature id for the '<em><b>Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_DECL_STMT__PAT = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_DECL_STMT__TYPE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Slot Decl Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_DECL_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprStmtImpl <em>Expr Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprStmtImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprStmt()
   * @generated
   */
  int EXPR_STMT = 66;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STMT__EXPR = STMT__EXPR;

  /**
   * The number of structural features of the '<em>Expr Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.GenericParamDeclImpl <em>Generic Param Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.GenericParamDeclImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getGenericParamDecl()
   * @generated
   */
  int GENERIC_PARAM_DECL = 67;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_PARAM_DECL__IDENT = 0;

  /**
   * The feature id for the '<em><b>Bounds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_PARAM_DECL__BOUNDS = 1;

  /**
   * The number of structural features of the '<em>Generic Param Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_PARAM_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ArgImpl <em>Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ArgImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getArg()
   * @generated
   */
  int ARG = 68;

  /**
   * The feature id for the '<em><b>Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__PAT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__TYPE = 1;

  /**
   * The number of structural features of the '<em>Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatImpl <em>Pat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPat()
   * @generated
   */
  int PAT = 69;

  /**
   * The number of structural features of the '<em>Pat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatWildcardImpl <em>Pat Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatWildcardImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatWildcard()
   * @generated
   */
  int PAT_WILDCARD = 70;

  /**
   * The number of structural features of the '<em>Pat Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_WILDCARD_FEATURE_COUNT = PAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatIdentImpl <em>Pat Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatIdentImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatIdent()
   * @generated
   */
  int PAT_IDENT = 71;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_IDENT__MUTABLE = PAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_IDENT__IDENT = PAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pat Ident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_IDENT_FEATURE_COUNT = PAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatBoxedImpl <em>Pat Boxed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatBoxedImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatBoxed()
   * @generated
   */
  int PAT_BOXED = 72;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_BOXED__PATTERN = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Boxed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_BOXED_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatOwnedImpl <em>Pat Owned</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatOwnedImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatOwned()
   * @generated
   */
  int PAT_OWNED = 73;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_OWNED__PATTERN = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Owned</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_OWNED_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatBorrowedImpl <em>Pat Borrowed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatBorrowedImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatBorrowed()
   * @generated
   */
  int PAT_BORROWED = 74;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_BORROWED__PATTERN = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Borrowed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_BORROWED_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatTupleImpl <em>Pat Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatTupleImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatTuple()
   * @generated
   */
  int PAT_TUPLE = 75;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_TUPLE__PATTERNS = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_TUPLE_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatVectorImpl <em>Pat Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatVectorImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatVector()
   * @generated
   */
  int PAT_VECTOR = 76;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_VECTOR__PATTERNS = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_VECTOR_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatLiteralImpl <em>Pat Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatLiteralImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatLiteral()
   * @generated
   */
  int PAT_LITERAL = 77;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_LITERAL__LITERAL = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_LITERAL_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatEnumImpl <em>Pat Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatEnumImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatEnum()
   * @generated
   */
  int PAT_ENUM = 78;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_ENUM__PATH = PAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_ENUM_FEATURE_COUNT = PAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.FieldPatImpl <em>Field Pat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.FieldPatImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFieldPat()
   * @generated
   */
  int FIELD_PAT = 79;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PAT__IDENT = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PAT__PATTERN = 1;

  /**
   * The number of structural features of the '<em>Field Pat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PAT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TypePathImpl <em>Type Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TypePathImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTypePath()
   * @generated
   */
  int TYPE_PATH = 80;

  /**
   * The feature id for the '<em><b>Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATH__SEGMENTS = 0;

  /**
   * The feature id for the '<em><b>Lifetimes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATH__LIFETIMES = 1;

  /**
   * The feature id for the '<em><b>Generic Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATH__GENERIC_TYPES = 2;

  /**
   * The number of structural features of the '<em>Type Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprPathImpl <em>Expr Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprPathImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprPath()
   * @generated
   */
  int EXPR_PATH = 81;

  /**
   * The feature id for the '<em><b>Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH__SEGMENTS = 0;

  /**
   * The feature id for the '<em><b>Lifetimes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH__LIFETIMES = 1;

  /**
   * The feature id for the '<em><b>Generic Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH__GENERIC_TYPES = 2;

  /**
   * The number of structural features of the '<em>Expr Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_PATH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getType()
   * @generated
   */
  int TYPE = 82;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PrimitiveTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 83;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.NamedTypeImpl <em>Named Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.NamedTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNamedType()
   * @generated
   */
  int NAMED_TYPE = 84;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE__PATH = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BoxedPointerImpl <em>Boxed Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BoxedPointerImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoxedPointer()
   * @generated
   */
  int BOXED_POINTER = 85;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOXED_POINTER__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boxed Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOXED_POINTER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.OwnedPointerImpl <em>Owned Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.OwnedPointerImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedPointer()
   * @generated
   */
  int OWNED_POINTER = 86;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_POINTER__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Owned Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_POINTER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BorrowedPointerImpl <em>Borrowed Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BorrowedPointerImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrowedPointer()
   * @generated
   */
  int BORROWED_POINTER = 87;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWED_POINTER__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Borrowed Pointer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWED_POINTER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StructFieldImpl <em>Struct Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StructFieldImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructField()
   * @generated
   */
  int STRUCT_FIELD = 88;

  /**
   * The feature id for the '<em><b>Vis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELD__VIS = 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELD__IDENT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELD__TYPE = 2;

  /**
   * The number of structural features of the '<em>Struct Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.VariantImpl <em>Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.VariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getVariant()
   * @generated
   */
  int VARIANT = 89;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT__IDENT = 0;

  /**
   * The number of structural features of the '<em>Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StructVariantImpl <em>Struct Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StructVariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructVariant()
   * @generated
   */
  int STRUCT_VARIANT = 90;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VARIANT__IDENT = VARIANT__IDENT;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VARIANT__PARAMS = VARIANT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VARIANT__FIELDS = VARIANT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Struct Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_VARIANT_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TupleVariantImpl <em>Tuple Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TupleVariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTupleVariant()
   * @generated
   */
  int TUPLE_VARIANT = 91;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_VARIANT__IDENT = VARIANT__IDENT;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_VARIANT__TYPES = VARIANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_VARIANT_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.UnitVariantImpl <em>Unit Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.UnitVariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getUnitVariant()
   * @generated
   */
  int UNIT_VARIANT = 92;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_VARIANT__IDENT = VARIANT__IDENT;

  /**
   * The number of structural features of the '<em>Unit Variant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_VARIANT_FEATURE_COUNT = VARIANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.LiteralImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 94;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StringLitImpl <em>String Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StringLitImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStringLit()
   * @generated
   */
  int STRING_LIT = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIT__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>String Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.NumberLitImpl <em>Number Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.NumberLitImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNumberLit()
   * @generated
   */
  int NUMBER_LIT = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LIT__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Number Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.CharLitImpl <em>Char Lit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.CharLitImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getCharLit()
   * @generated
   */
  int CHAR_LIT = 96;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LIT__VALUE = LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Char Lit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LIT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.DivisionImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 97;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.MultiplicationImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 98;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ModuloImpl <em>Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ModuloImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getModulo()
   * @generated
   */
  int MODULO = 99;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULO__LEFT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULO__RIGHT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULO_FEATURE_COUNT = DIVISION_MULTIPLICATION_OR_MODULO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprCastImpl <em>Expr Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprCastImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprCast()
   * @generated
   */
  int EXPR_CAST = 100;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CAST__EXPR = AS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CAST__TYPE = AS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_CAST_FEATURE_COUNT = AS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprAdditionImpl <em>Expr Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprAdditionImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprAddition()
   * @generated
   */
  int EXPR_ADDITION = 101;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADDITION__LEFT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADDITION__RIGHT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ADDITION_FEATURE_COUNT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprSubtractionImpl <em>Expr Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprSubtractionImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprSubtraction()
   * @generated
   */
  int EXPR_SUBTRACTION = 102;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SUBTRACTION__LEFT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SUBTRACTION__RIGHT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SUBTRACTION_FEATURE_COUNT = ADDITION_OR_SUBTRACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLeftShiftImpl <em>Expr Left Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLeftShiftImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLeftShift()
   * @generated
   */
  int EXPR_LEFT_SHIFT = 103;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LEFT_SHIFT__LEFT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LEFT_SHIFT__RIGHT = SHIFT_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Left Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LEFT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprRightShiftImpl <em>Expr Right Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprRightShiftImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprRightShift()
   * @generated
   */
  int EXPR_RIGHT_SHIFT = 104;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RIGHT_SHIFT__LEFT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RIGHT_SHIFT__RIGHT = SHIFT_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Right Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_RIGHT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseAndImpl <em>Expr Bitwise And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBitwiseAndImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseAnd()
   * @generated
   */
  int EXPR_BITWISE_AND = 105;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_AND__LEFT = BITWISE_AND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_AND__RIGHT = BITWISE_AND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Bitwise And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_AND_FEATURE_COUNT = BITWISE_AND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseXorImpl <em>Expr Bitwise Xor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBitwiseXorImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseXor()
   * @generated
   */
  int EXPR_BITWISE_XOR = 106;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_XOR__LEFT = BITWISE_XOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_XOR__RIGHT = BITWISE_XOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Bitwise Xor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_XOR_FEATURE_COUNT = BITWISE_XOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseOrImpl <em>Expr Bitwise Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBitwiseOrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseOr()
   * @generated
   */
  int EXPR_BITWISE_OR = 107;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_OR__LEFT = BITWISE_OR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_OR__RIGHT = BITWISE_OR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Bitwise Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BITWISE_OR_FEATURE_COUNT = BITWISE_OR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLessThanImpl <em>Expr Less Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLessThanImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLessThan()
   * @generated
   */
  int EXPR_LESS_THAN = 108;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN__LEFT = COMPARISON_OPERATORS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN__RIGHT = COMPARISON_OPERATORS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Less Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN_FEATURE_COUNT = COMPARISON_OPERATORS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprGreaterThanImpl <em>Expr Greater Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprGreaterThanImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGreaterThan()
   * @generated
   */
  int EXPR_GREATER_THAN = 109;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN__LEFT = COMPARISON_OPERATORS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN__RIGHT = COMPARISON_OPERATORS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Greater Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN_FEATURE_COUNT = COMPARISON_OPERATORS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprLessThanOrEqualToImpl <em>Expr Less Than Or Equal To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprLessThanOrEqualToImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLessThanOrEqualTo()
   * @generated
   */
  int EXPR_LESS_THAN_OR_EQUAL_TO = 110;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN_OR_EQUAL_TO__LEFT = COMPARISON_OPERATORS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN_OR_EQUAL_TO__RIGHT = COMPARISON_OPERATORS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Less Than Or Equal To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_LESS_THAN_OR_EQUAL_TO_FEATURE_COUNT = COMPARISON_OPERATORS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprGreaterThanOrEqualToImpl <em>Expr Greater Than Or Equal To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprGreaterThanOrEqualToImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGreaterThanOrEqualTo()
   * @generated
   */
  int EXPR_GREATER_THAN_OR_EQUAL_TO = 111;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN_OR_EQUAL_TO__LEFT = COMPARISON_OPERATORS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN_OR_EQUAL_TO__RIGHT = COMPARISON_OPERATORS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Greater Than Or Equal To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_GREATER_THAN_OR_EQUAL_TO_FEATURE_COUNT = COMPARISON_OPERATORS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprEqualToImpl <em>Expr Equal To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprEqualToImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprEqualTo()
   * @generated
   */
  int EXPR_EQUAL_TO = 112;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL_TO__LEFT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL_TO__RIGHT = EQUALITY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Equal To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQUAL_TO_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprNotEqualToImpl <em>Expr Not Equal To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprNotEqualToImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprNotEqualTo()
   * @generated
   */
  int EXPR_NOT_EQUAL_TO = 113;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_EQUAL_TO__LEFT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_EQUAL_TO__RIGHT = EQUALITY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Not Equal To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_EQUAL_TO_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBooleanAndImpl <em>Expr Boolean And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBooleanAndImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBooleanAnd()
   * @generated
   */
  int EXPR_BOOLEAN_AND = 114;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_AND__LEFT = BOOLEAN_AND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_AND__RIGHT = BOOLEAN_AND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Boolean And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_AND_FEATURE_COUNT = BOOLEAN_AND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprBooleanOrImpl <em>Expr Boolean Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprBooleanOrImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBooleanOr()
   * @generated
   */
  int EXPR_BOOLEAN_OR = 115;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_OR__LEFT = BOOLEAN_OR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_OR__RIGHT = BOOLEAN_OR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Boolean Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_BOOLEAN_OR_FEATURE_COUNT = BOOLEAN_OR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.ExprAssignImpl <em>Expr Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.ExprAssignImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprAssign()
   * @generated
   */
  int EXPR_ASSIGN = 116;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ASSIGN__LEFT = ASSIGN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ASSIGN__RIGHT = ASSIGN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expr Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_ASSIGN_FEATURE_COUNT = ASSIGN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatTupleEnumImpl <em>Pat Tuple Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatTupleEnumImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatTupleEnum()
   * @generated
   */
  int PAT_TUPLE_ENUM = 117;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_TUPLE_ENUM__PATH = PAT_ENUM__PATH;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_TUPLE_ENUM__PATTERNS = PAT_ENUM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Tuple Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_TUPLE_ENUM_FEATURE_COUNT = PAT_ENUM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatStructEnumImpl <em>Pat Struct Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatStructEnumImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatStructEnum()
   * @generated
   */
  int PAT_STRUCT_ENUM = 118;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_STRUCT_ENUM__PATH = PAT_ENUM__PATH;

  /**
   * The feature id for the '<em><b>Field Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_STRUCT_ENUM__FIELD_PATTERNS = PAT_ENUM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pat Struct Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_STRUCT_ENUM_FEATURE_COUNT = PAT_ENUM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.IntTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 119;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.FloatTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 120;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BoolTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 121;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.MachineTypeImpl <em>Machine Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.MachineTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMachineType()
   * @generated
   */
  int MACHINE_TYPE = 122;

  /**
   * The number of structural features of the '<em>Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.UnitTypeImpl <em>Unit Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.UnitTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getUnitType()
   * @generated
   */
  int UNIT_TYPE = 123;

  /**
   * The number of structural features of the '<em>Unit Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.Visibility
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 124;


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
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.LiteralAttr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.redoxi.ruste.rust.LiteralAttr#getValue()
   * @see #getLiteralAttr()
   * @generated
   */
  EReference getLiteralAttr_Value();

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
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ModItem#isExternalBody <em>External Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Body</em>'.
   * @see de.redoxi.ruste.rust.ModItem#isExternalBody()
   * @see #getModItem()
   * @generated
   */
  EAttribute getModItem_ExternalBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ModItem#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see de.redoxi.ruste.rust.ModItem#getItems()
   * @see #getModItem()
   * @generated
   */
  EReference getModItem_Items();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.FnItem <em>Fn Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fn Item</em>'.
   * @see de.redoxi.ruste.rust.FnItem
   * @generated
   */
  EClass getFnItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.FnItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getIdent()
   * @see #getFnItem()
   * @generated
   */
  EAttribute getFnItem_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.FnItem#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getParams()
   * @see #getFnItem()
   * @generated
   */
  EReference getFnItem_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.FnItem#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getArgs()
   * @see #getFnItem()
   * @generated
   */
  EReference getFnItem_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.FnItem#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getReturnType()
   * @see #getFnItem()
   * @generated
   */
  EReference getFnItem_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.FnItem#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getBody()
   * @see #getFnItem()
   * @generated
   */
  EReference getFnItem_Body();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TypeItem <em>Type Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Item</em>'.
   * @see de.redoxi.ruste.rust.TypeItem
   * @generated
   */
  EClass getTypeItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TypeItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.TypeItem#getIdent()
   * @see #getTypeItem()
   * @generated
   */
  EAttribute getTypeItem_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TypeItem#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.TypeItem#getParams()
   * @see #getTypeItem()
   * @generated
   */
  EReference getTypeItem_Params();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.TypeItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.TypeItem#getType()
   * @see #getTypeItem()
   * @generated
   */
  EReference getTypeItem_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StructItem <em>Struct Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Item</em>'.
   * @see de.redoxi.ruste.rust.StructItem
   * @generated
   */
  EClass getStructItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StructItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.StructItem#getIdent()
   * @see #getStructItem()
   * @generated
   */
  EAttribute getStructItem_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructItem#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.StructItem#getParams()
   * @see #getStructItem()
   * @generated
   */
  EReference getStructItem_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructItem#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.redoxi.ruste.rust.StructItem#getFields()
   * @see #getStructItem()
   * @generated
   */
  EReference getStructItem_Fields();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.EnumItem <em>Enum Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Item</em>'.
   * @see de.redoxi.ruste.rust.EnumItem
   * @generated
   */
  EClass getEnumItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.EnumItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.EnumItem#getIdent()
   * @see #getEnumItem()
   * @generated
   */
  EAttribute getEnumItem_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumItem#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.EnumItem#getParams()
   * @see #getEnumItem()
   * @generated
   */
  EReference getEnumItem_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumItem#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see de.redoxi.ruste.rust.EnumItem#getVariants()
   * @see #getEnumItem()
   * @generated
   */
  EReference getEnumItem_Variants();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.EnumVariant <em>Enum Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Variant</em>'.
   * @see de.redoxi.ruste.rust.EnumVariant
   * @generated
   */
  EClass getEnumVariant();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.EnumVariant#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.EnumVariant#getIdent()
   * @see #getEnumVariant()
   * @generated
   */
  EAttribute getEnumVariant_Ident();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.EnumVariant#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.EnumVariant#getParams()
   * @see #getEnumVariant()
   * @generated
   */
  EAttribute getEnumVariant_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumVariant#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.redoxi.ruste.rust.EnumVariant#getTypes()
   * @see #getEnumVariant()
   * @generated
   */
  EReference getEnumVariant_Types();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumVariant#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.redoxi.ruste.rust.EnumVariant#getFields()
   * @see #getEnumVariant()
   * @generated
   */
  EReference getEnumVariant_Fields();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TraitItem <em>Trait Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Item</em>'.
   * @see de.redoxi.ruste.rust.TraitItem
   * @generated
   */
  EClass getTraitItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TraitItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.TraitItem#getIdent()
   * @see #getTraitItem()
   * @generated
   */
  EAttribute getTraitItem_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TraitItem#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.TraitItem#getParams()
   * @see #getTraitItem()
   * @generated
   */
  EReference getTraitItem_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TraitItem#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see de.redoxi.ruste.rust.TraitItem#getMethods()
   * @see #getTraitItem()
   * @generated
   */
  EReference getTraitItem_Methods();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TraitMethod <em>Trait Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait Method</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod
   * @generated
   */
  EClass getTraitMethod();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TraitMethod#isUnsafe <em>Unsafe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsafe</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#isUnsafe()
   * @see #getTraitMethod()
   * @generated
   */
  EAttribute getTraitMethod_Unsafe();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TraitMethod#isExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#isExtern()
   * @see #getTraitMethod()
   * @generated
   */
  EAttribute getTraitMethod_Extern();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TraitMethod#getVis <em>Vis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vis</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getVis()
   * @see #getTraitMethod()
   * @generated
   */
  EAttribute getTraitMethod_Vis();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.TraitMethod#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getIdent()
   * @see #getTraitMethod()
   * @generated
   */
  EAttribute getTraitMethod_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TraitMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getParams()
   * @see #getTraitMethod()
   * @generated
   */
  EReference getTraitMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TraitMethod#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getArgs()
   * @see #getTraitMethod()
   * @generated
   */
  EReference getTraitMethod_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.TraitMethod#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getReturnType()
   * @see #getTraitMethod()
   * @generated
   */
  EReference getTraitMethod_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.TraitMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.redoxi.ruste.rust.TraitMethod#getBody()
   * @see #getTraitMethod()
   * @generated
   */
  EReference getTraitMethod_Body();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ImplItem <em>Impl Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impl Item</em>'.
   * @see de.redoxi.ruste.rust.ImplItem
   * @generated
   */
  EClass getImplItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ImplItem#getTrait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trait</em>'.
   * @see de.redoxi.ruste.rust.ImplItem#getTrait()
   * @see #getImplItem()
   * @generated
   */
  EAttribute getImplItem_Trait();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ImplItem#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct</em>'.
   * @see de.redoxi.ruste.rust.ImplItem#getStruct()
   * @see #getImplItem()
   * @generated
   */
  EAttribute getImplItem_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ImplItem#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see de.redoxi.ruste.rust.ImplItem#getMethods()
   * @see #getImplItem()
   * @generated
   */
  EReference getImplItem_Methods();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ImplMethod <em>Impl Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Impl Method</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod
   * @generated
   */
  EClass getImplMethod();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ImplMethod#isUnsafe <em>Unsafe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsafe</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#isUnsafe()
   * @see #getImplMethod()
   * @generated
   */
  EAttribute getImplMethod_Unsafe();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ImplMethod#isExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#isExtern()
   * @see #getImplMethod()
   * @generated
   */
  EAttribute getImplMethod_Extern();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ImplMethod#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#getIdent()
   * @see #getImplMethod()
   * @generated
   */
  EAttribute getImplMethod_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ImplMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#getParams()
   * @see #getImplMethod()
   * @generated
   */
  EReference getImplMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ImplMethod#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#getArgs()
   * @see #getImplMethod()
   * @generated
   */
  EReference getImplMethod_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ImplMethod#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#getReturnType()
   * @see #getImplMethod()
   * @generated
   */
  EReference getImplMethod_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ImplMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see de.redoxi.ruste.rust.ImplMethod#getBody()
   * @see #getImplMethod()
   * @generated
   */
  EReference getImplMethod_Body();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExternBlock <em>Extern Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Block</em>'.
   * @see de.redoxi.ruste.rust.ExternBlock
   * @generated
   */
  EClass getExternBlock();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ExternBlock#getAbi <em>Abi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abi</em>'.
   * @see de.redoxi.ruste.rust.ExternBlock#getAbi()
   * @see #getExternBlock()
   * @generated
   */
  EAttribute getExternBlock_Abi();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExternBlock#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see de.redoxi.ruste.rust.ExternBlock#getFunctions()
   * @see #getExternBlock()
   * @generated
   */
  EReference getExternBlock_Functions();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ForeignFn <em>Foreign Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Fn</em>'.
   * @see de.redoxi.ruste.rust.ForeignFn
   * @generated
   */
  EClass getForeignFn();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ForeignFn#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.ForeignFn#getIdent()
   * @see #getForeignFn()
   * @generated
   */
  EAttribute getForeignFn_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ForeignFn#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.ForeignFn#getArgs()
   * @see #getForeignFn()
   * @generated
   */
  EReference getForeignFn_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ForeignFn#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.redoxi.ruste.rust.ForeignFn#getReturnType()
   * @see #getForeignFn()
   * @generated
   */
  EReference getForeignFn_ReturnType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StaticItem <em>Static Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Item</em>'.
   * @see de.redoxi.ruste.rust.StaticItem
   * @generated
   */
  EClass getStaticItem();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StaticItem#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see de.redoxi.ruste.rust.StaticItem#isMutable()
   * @see #getStaticItem()
   * @generated
   */
  EAttribute getStaticItem_Mutable();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StaticItem#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.StaticItem#getIdent()
   * @see #getStaticItem()
   * @generated
   */
  EAttribute getStaticItem_Ident();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.StaticItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.StaticItem#getType()
   * @see #getStaticItem()
   * @generated
   */
  EReference getStaticItem_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.StaticItem#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.StaticItem#getExpr()
   * @see #getStaticItem()
   * @generated
   */
  EReference getStaticItem_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLValue <em>Expr LValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr LValue</em>'.
   * @see de.redoxi.ruste.rust.ExprLValue
   * @generated
   */
  EClass getExprLValue();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprRValue <em>Expr RValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr RValue</em>'.
   * @see de.redoxi.ruste.rust.ExprRValue
   * @generated
   */
  EClass getExprRValue();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLeaf <em>Expr Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Leaf</em>'.
   * @see de.redoxi.ruste.rust.ExprLeaf
   * @generated
   */
  EClass getExprLeaf();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLiteral <em>Expr Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Literal</em>'.
   * @see de.redoxi.ruste.rust.ExprLiteral
   * @generated
   */
  EClass getExprLiteral();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see de.redoxi.ruste.rust.ExprLiteral#getLiteral()
   * @see #getExprLiteral()
   * @generated
   */
  EReference getExprLiteral_Literal();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprPathHead <em>Expr Path Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Path Head</em>'.
   * @see de.redoxi.ruste.rust.ExprPathHead
   * @generated
   */
  EClass getExprPathHead();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprPathHead#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see de.redoxi.ruste.rust.ExprPathHead#getPath()
   * @see #getExprPathHead()
   * @generated
   */
  EReference getExprPathHead_Path();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprGroup <em>Expr Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Group</em>'.
   * @see de.redoxi.ruste.rust.ExprGroup
   * @generated
   */
  EClass getExprGroup();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprGroup#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprGroup#getExpr()
   * @see #getExprGroup()
   * @generated
   */
  EReference getExprGroup_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprTuple <em>Expr Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Tuple</em>'.
   * @see de.redoxi.ruste.rust.ExprTuple
   * @generated
   */
  EClass getExprTuple();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprTuple#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see de.redoxi.ruste.rust.ExprTuple#getTuple()
   * @see #getExprTuple()
   * @generated
   */
  EReference getExprTuple_Tuple();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExprTuple#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see de.redoxi.ruste.rust.ExprTuple#getExprs()
   * @see #getExprTuple()
   * @generated
   */
  EReference getExprTuple_Exprs();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprStruct <em>Expr Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Struct</em>'.
   * @see de.redoxi.ruste.rust.ExprStruct
   * @generated
   */
  EClass getExprStruct();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprStruct#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see de.redoxi.ruste.rust.ExprStruct#getStruct()
   * @see #getExprStruct()
   * @generated
   */
  EReference getExprStruct_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExprStruct#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.redoxi.ruste.rust.ExprStruct#getFields()
   * @see #getExprStruct()
   * @generated
   */
  EReference getExprStruct_Fields();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprStruct#getBaseExpr <em>Base Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprStruct#getBaseExpr()
   * @see #getExprStruct()
   * @generated
   */
  EReference getExprStruct_BaseExpr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprVec <em>Expr Vec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Vec</em>'.
   * @see de.redoxi.ruste.rust.ExprVec
   * @generated
   */
  EClass getExprVec();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ExprVec#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see de.redoxi.ruste.rust.ExprVec#isMutable()
   * @see #getExprVec()
   * @generated
   */
  EAttribute getExprVec_Mutable();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExprVec#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see de.redoxi.ruste.rust.ExprVec#getExprs()
   * @see #getExprVec()
   * @generated
   */
  EReference getExprVec_Exprs();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprVec#getLenExpr <em>Len Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Len Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprVec#getLenExpr()
   * @see #getExprVec()
   * @generated
   */
  EReference getExprVec_LenExpr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprUnary <em>Expr Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Unary</em>'.
   * @see de.redoxi.ruste.rust.ExprUnary
   * @generated
   */
  EClass getExprUnary();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprUnary#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprUnary#getExpr()
   * @see #getExprUnary()
   * @generated
   */
  EReference getExprUnary_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.NumericNegation <em>Numeric Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Negation</em>'.
   * @see de.redoxi.ruste.rust.NumericNegation
   * @generated
   */
  EClass getNumericNegation();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Dereference <em>Dereference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dereference</em>'.
   * @see de.redoxi.ruste.rust.Dereference
   * @generated
   */
  EClass getDereference();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.LogicalNegation <em>Logical Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Negation</em>'.
   * @see de.redoxi.ruste.rust.LogicalNegation
   * @generated
   */
  EClass getLogicalNegation();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ManagedBox <em>Managed Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managed Box</em>'.
   * @see de.redoxi.ruste.rust.ManagedBox
   * @generated
   */
  EClass getManagedBox();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.OwnedBox <em>Owned Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Owned Box</em>'.
   * @see de.redoxi.ruste.rust.OwnedBox
   * @generated
   */
  EClass getOwnedBox();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Borrow <em>Borrow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Borrow</em>'.
   * @see de.redoxi.ruste.rust.Borrow
   * @generated
   */
  EClass getBorrow();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBinary <em>Expr Binary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Binary</em>'.
   * @see de.redoxi.ruste.rust.ExprBinary
   * @generated
   */
  EClass getExprBinary();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.DivisionMultiplicationOrModulo <em>Division Multiplication Or Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division Multiplication Or Modulo</em>'.
   * @see de.redoxi.ruste.rust.DivisionMultiplicationOrModulo
   * @generated
   */
  EClass getDivisionMultiplicationOrModulo();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.As <em>As</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>As</em>'.
   * @see de.redoxi.ruste.rust.As
   * @generated
   */
  EClass getAs();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.AdditionOrSubtraction <em>Addition Or Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Or Subtraction</em>'.
   * @see de.redoxi.ruste.rust.AdditionOrSubtraction
   * @generated
   */
  EClass getAdditionOrSubtraction();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ShiftOperator <em>Shift Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Operator</em>'.
   * @see de.redoxi.ruste.rust.ShiftOperator
   * @generated
   */
  EClass getShiftOperator();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BitwiseAnd <em>Bitwise And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise And</em>'.
   * @see de.redoxi.ruste.rust.BitwiseAnd
   * @generated
   */
  EClass getBitwiseAnd();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BitwiseXor <em>Bitwise Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Xor</em>'.
   * @see de.redoxi.ruste.rust.BitwiseXor
   * @generated
   */
  EClass getBitwiseXor();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BitwiseOr <em>Bitwise Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Or</em>'.
   * @see de.redoxi.ruste.rust.BitwiseOr
   * @generated
   */
  EClass getBitwiseOr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ComparisonOperators <em>Comparison Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Operators</em>'.
   * @see de.redoxi.ruste.rust.ComparisonOperators
   * @generated
   */
  EClass getComparisonOperators();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.EqualityOperator <em>Equality Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Operator</em>'.
   * @see de.redoxi.ruste.rust.EqualityOperator
   * @generated
   */
  EClass getEqualityOperator();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BooleanAnd <em>Boolean And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean And</em>'.
   * @see de.redoxi.ruste.rust.BooleanAnd
   * @generated
   */
  EClass getBooleanAnd();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BooleanOr <em>Boolean Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Or</em>'.
   * @see de.redoxi.ruste.rust.BooleanOr
   * @generated
   */
  EClass getBooleanOr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see de.redoxi.ruste.rust.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLambda <em>Expr Lambda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Lambda</em>'.
   * @see de.redoxi.ruste.rust.ExprLambda
   * @generated
   */
  EClass getExprLambda();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.ExprLambda#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.ExprLambda#getArgs()
   * @see #getExprLambda()
   * @generated
   */
  EAttribute getExprLambda_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLambda#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprLambda#getExpr()
   * @see #getExprLambda()
   * @generated
   */
  EReference getExprLambda_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprWhile <em>Expr While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr While</em>'.
   * @see de.redoxi.ruste.rust.ExprWhile
   * @generated
   */
  EClass getExprWhile();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprWhile#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprWhile#getExpr()
   * @see #getExprWhile()
   * @generated
   */
  EReference getExprWhile_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprWhile#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.ExprWhile#getBlock()
   * @see #getExprWhile()
   * @generated
   */
  EReference getExprWhile_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLoop <em>Expr Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Loop</em>'.
   * @see de.redoxi.ruste.rust.ExprLoop
   * @generated
   */
  EClass getExprLoop();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ExprLoop#getLifetime <em>Lifetime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lifetime</em>'.
   * @see de.redoxi.ruste.rust.ExprLoop#getLifetime()
   * @see #getExprLoop()
   * @generated
   */
  EAttribute getExprLoop_Lifetime();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLoop#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.ExprLoop#getBlock()
   * @see #getExprLoop()
   * @generated
   */
  EReference getExprLoop_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBreak <em>Expr Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Break</em>'.
   * @see de.redoxi.ruste.rust.ExprBreak
   * @generated
   */
  EClass getExprBreak();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ExprBreak#getLifetime <em>Lifetime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lifetime</em>'.
   * @see de.redoxi.ruste.rust.ExprBreak#getLifetime()
   * @see #getExprBreak()
   * @generated
   */
  EAttribute getExprBreak_Lifetime();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprContinue <em>Expr Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Continue</em>'.
   * @see de.redoxi.ruste.rust.ExprContinue
   * @generated
   */
  EClass getExprContinue();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.ExprContinue#getLifetime <em>Lifetime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lifetime</em>'.
   * @see de.redoxi.ruste.rust.ExprContinue#getLifetime()
   * @see #getExprContinue()
   * @generated
   */
  EAttribute getExprContinue_Lifetime();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprDo <em>Expr Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Do</em>'.
   * @see de.redoxi.ruste.rust.ExprDo
   * @generated
   */
  EClass getExprDo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprDo#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprDo#getExpr()
   * @see #getExprDo()
   * @generated
   */
  EReference getExprDo_Expr();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.ExprDo#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see de.redoxi.ruste.rust.ExprDo#getArgs()
   * @see #getExprDo()
   * @generated
   */
  EAttribute getExprDo_Args();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprDo#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.ExprDo#getBlock()
   * @see #getExprDo()
   * @generated
   */
  EReference getExprDo_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprFor <em>Expr For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr For</em>'.
   * @see de.redoxi.ruste.rust.ExprFor
   * @generated
   */
  EClass getExprFor();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprFor#getPat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pat</em>'.
   * @see de.redoxi.ruste.rust.ExprFor#getPat()
   * @see #getExprFor()
   * @generated
   */
  EReference getExprFor_Pat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprFor#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprFor#getExpr()
   * @see #getExprFor()
   * @generated
   */
  EReference getExprFor_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprFor#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.ExprFor#getBlock()
   * @see #getExprFor()
   * @generated
   */
  EReference getExprFor_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprIf <em>Expr If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr If</em>'.
   * @see de.redoxi.ruste.rust.ExprIf
   * @generated
   */
  EClass getExprIf();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprIf#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprIf#getExpr()
   * @see #getExprIf()
   * @generated
   */
  EReference getExprIf_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprIf#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see de.redoxi.ruste.rust.ExprIf#getElse()
   * @see #getExprIf()
   * @generated
   */
  EReference getExprIf_Else();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ElseTail <em>Else Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Tail</em>'.
   * @see de.redoxi.ruste.rust.ElseTail
   * @generated
   */
  EClass getElseTail();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ElseTail#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.ElseTail#getBlock()
   * @see #getElseTail()
   * @generated
   */
  EReference getElseTail_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprMatch <em>Expr Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Match</em>'.
   * @see de.redoxi.ruste.rust.ExprMatch
   * @generated
   */
  EClass getExprMatch();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprMatch#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprMatch#getExpr()
   * @see #getExprMatch()
   * @generated
   */
  EReference getExprMatch_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExprMatch#getArms <em>Arms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arms</em>'.
   * @see de.redoxi.ruste.rust.ExprMatch#getArms()
   * @see #getExprMatch()
   * @generated
   */
  EReference getExprMatch_Arms();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.MatchArm <em>Match Arm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Arm</em>'.
   * @see de.redoxi.ruste.rust.MatchArm
   * @generated
   */
  EClass getMatchArm();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchArm#getMatchPat <em>Match Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Match Pat</em>'.
   * @see de.redoxi.ruste.rust.MatchArm#getMatchPat()
   * @see #getMatchArm()
   * @generated
   */
  EReference getMatchArm_MatchPat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchArm#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.MatchArm#getExpr()
   * @see #getMatchArm()
   * @generated
   */
  EReference getMatchArm_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchArm#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.MatchArm#getBlock()
   * @see #getMatchArm()
   * @generated
   */
  EReference getMatchArm_Block();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.MatchPat <em>Match Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Pat</em>'.
   * @see de.redoxi.ruste.rust.MatchPat
   * @generated
   */
  EClass getMatchPat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchPat#getPat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pat</em>'.
   * @see de.redoxi.ruste.rust.MatchPat#getPat()
   * @see #getMatchPat()
   * @generated
   */
  EReference getMatchPat_Pat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchPat#getEndPat <em>End Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Pat</em>'.
   * @see de.redoxi.ruste.rust.MatchPat#getEndPat()
   * @see #getMatchPat()
   * @generated
   */
  EReference getMatchPat_EndPat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.MatchPat#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.MatchPat#getExpr()
   * @see #getMatchPat()
   * @generated
   */
  EReference getMatchPat_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprReturn <em>Expr Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Return</em>'.
   * @see de.redoxi.ruste.rust.ExprReturn
   * @generated
   */
  EClass getExprReturn();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprReturn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprReturn#getExpr()
   * @see #getExprReturn()
   * @generated
   */
  EReference getExprReturn_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see de.redoxi.ruste.rust.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Block#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.Block#getExpr()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.Block#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see de.redoxi.ruste.rust.Block#getStmts()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Stmts();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see de.redoxi.ruste.rust.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Stmt#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.Stmt#getExpr()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Expr();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.SlotDeclStmt <em>Slot Decl Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slot Decl Stmt</em>'.
   * @see de.redoxi.ruste.rust.SlotDeclStmt
   * @generated
   */
  EClass getSlotDeclStmt();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.SlotDeclStmt#getPat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pat</em>'.
   * @see de.redoxi.ruste.rust.SlotDeclStmt#getPat()
   * @see #getSlotDeclStmt()
   * @generated
   */
  EReference getSlotDeclStmt_Pat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.SlotDeclStmt#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.SlotDeclStmt#getType()
   * @see #getSlotDeclStmt()
   * @generated
   */
  EReference getSlotDeclStmt_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprStmt <em>Expr Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Stmt</em>'.
   * @see de.redoxi.ruste.rust.ExprStmt
   * @generated
   */
  EClass getExprStmt();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.GenericParamDecl <em>Generic Param Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Param Decl</em>'.
   * @see de.redoxi.ruste.rust.GenericParamDecl
   * @generated
   */
  EClass getGenericParamDecl();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.GenericParamDecl#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.GenericParamDecl#getIdent()
   * @see #getGenericParamDecl()
   * @generated
   */
  EAttribute getGenericParamDecl_Ident();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.GenericParamDecl#getBounds <em>Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bounds</em>'.
   * @see de.redoxi.ruste.rust.GenericParamDecl#getBounds()
   * @see #getGenericParamDecl()
   * @generated
   */
  EAttribute getGenericParamDecl_Bounds();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg</em>'.
   * @see de.redoxi.ruste.rust.Arg
   * @generated
   */
  EClass getArg();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Arg#getPat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pat</em>'.
   * @see de.redoxi.ruste.rust.Arg#getPat()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Pat();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Arg#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.Arg#getType()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Pat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat</em>'.
   * @see de.redoxi.ruste.rust.Pat
   * @generated
   */
  EClass getPat();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatWildcard <em>Pat Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Wildcard</em>'.
   * @see de.redoxi.ruste.rust.PatWildcard
   * @generated
   */
  EClass getPatWildcard();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatIdent <em>Pat Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Ident</em>'.
   * @see de.redoxi.ruste.rust.PatIdent
   * @generated
   */
  EClass getPatIdent();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.PatIdent#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see de.redoxi.ruste.rust.PatIdent#isMutable()
   * @see #getPatIdent()
   * @generated
   */
  EAttribute getPatIdent_Mutable();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.PatIdent#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.PatIdent#getIdent()
   * @see #getPatIdent()
   * @generated
   */
  EAttribute getPatIdent_Ident();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatBoxed <em>Pat Boxed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Boxed</em>'.
   * @see de.redoxi.ruste.rust.PatBoxed
   * @generated
   */
  EClass getPatBoxed();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatBoxed#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see de.redoxi.ruste.rust.PatBoxed#getPattern()
   * @see #getPatBoxed()
   * @generated
   */
  EReference getPatBoxed_Pattern();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatOwned <em>Pat Owned</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Owned</em>'.
   * @see de.redoxi.ruste.rust.PatOwned
   * @generated
   */
  EClass getPatOwned();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatOwned#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see de.redoxi.ruste.rust.PatOwned#getPattern()
   * @see #getPatOwned()
   * @generated
   */
  EReference getPatOwned_Pattern();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatBorrowed <em>Pat Borrowed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Borrowed</em>'.
   * @see de.redoxi.ruste.rust.PatBorrowed
   * @generated
   */
  EClass getPatBorrowed();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatBorrowed#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see de.redoxi.ruste.rust.PatBorrowed#getPattern()
   * @see #getPatBorrowed()
   * @generated
   */
  EReference getPatBorrowed_Pattern();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatTuple <em>Pat Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Tuple</em>'.
   * @see de.redoxi.ruste.rust.PatTuple
   * @generated
   */
  EClass getPatTuple();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.PatTuple#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.redoxi.ruste.rust.PatTuple#getPatterns()
   * @see #getPatTuple()
   * @generated
   */
  EReference getPatTuple_Patterns();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatVector <em>Pat Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Vector</em>'.
   * @see de.redoxi.ruste.rust.PatVector
   * @generated
   */
  EClass getPatVector();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.PatVector#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.redoxi.ruste.rust.PatVector#getPatterns()
   * @see #getPatVector()
   * @generated
   */
  EReference getPatVector_Patterns();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatLiteral <em>Pat Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Literal</em>'.
   * @see de.redoxi.ruste.rust.PatLiteral
   * @generated
   */
  EClass getPatLiteral();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see de.redoxi.ruste.rust.PatLiteral#getLiteral()
   * @see #getPatLiteral()
   * @generated
   */
  EReference getPatLiteral_Literal();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatEnum <em>Pat Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Enum</em>'.
   * @see de.redoxi.ruste.rust.PatEnum
   * @generated
   */
  EClass getPatEnum();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatEnum#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see de.redoxi.ruste.rust.PatEnum#getPath()
   * @see #getPatEnum()
   * @generated
   */
  EReference getPatEnum_Path();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.FieldPat <em>Field Pat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Pat</em>'.
   * @see de.redoxi.ruste.rust.FieldPat
   * @generated
   */
  EClass getFieldPat();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.FieldPat#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.FieldPat#getIdent()
   * @see #getFieldPat()
   * @generated
   */
  EAttribute getFieldPat_Ident();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.FieldPat#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see de.redoxi.ruste.rust.FieldPat#getPattern()
   * @see #getFieldPat()
   * @generated
   */
  EReference getFieldPat_Pattern();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TypePath <em>Type Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Path</em>'.
   * @see de.redoxi.ruste.rust.TypePath
   * @generated
   */
  EClass getTypePath();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.TypePath#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Segments</em>'.
   * @see de.redoxi.ruste.rust.TypePath#getSegments()
   * @see #getTypePath()
   * @generated
   */
  EAttribute getTypePath_Segments();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.TypePath#getLifetimes <em>Lifetimes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Lifetimes</em>'.
   * @see de.redoxi.ruste.rust.TypePath#getLifetimes()
   * @see #getTypePath()
   * @generated
   */
  EAttribute getTypePath_Lifetimes();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TypePath#getGenericTypes <em>Generic Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generic Types</em>'.
   * @see de.redoxi.ruste.rust.TypePath#getGenericTypes()
   * @see #getTypePath()
   * @generated
   */
  EReference getTypePath_GenericTypes();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprPath <em>Expr Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Path</em>'.
   * @see de.redoxi.ruste.rust.ExprPath
   * @generated
   */
  EClass getExprPath();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.ExprPath#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Segments</em>'.
   * @see de.redoxi.ruste.rust.ExprPath#getSegments()
   * @see #getExprPath()
   * @generated
   */
  EAttribute getExprPath_Segments();

  /**
   * Returns the meta object for the attribute list '{@link de.redoxi.ruste.rust.ExprPath#getLifetimes <em>Lifetimes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Lifetimes</em>'.
   * @see de.redoxi.ruste.rust.ExprPath#getLifetimes()
   * @see #getExprPath()
   * @generated
   */
  EAttribute getExprPath_Lifetimes();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.ExprPath#getGenericTypes <em>Generic Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generic Types</em>'.
   * @see de.redoxi.ruste.rust.ExprPath#getGenericTypes()
   * @see #getExprPath()
   * @generated
   */
  EReference getExprPath_GenericTypes();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see de.redoxi.ruste.rust.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.NamedType <em>Named Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Type</em>'.
   * @see de.redoxi.ruste.rust.NamedType
   * @generated
   */
  EClass getNamedType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.NamedType#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see de.redoxi.ruste.rust.NamedType#getPath()
   * @see #getNamedType()
   * @generated
   */
  EReference getNamedType_Path();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BoxedPointer <em>Boxed Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boxed Pointer</em>'.
   * @see de.redoxi.ruste.rust.BoxedPointer
   * @generated
   */
  EClass getBoxedPointer();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.BoxedPointer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.BoxedPointer#getType()
   * @see #getBoxedPointer()
   * @generated
   */
  EReference getBoxedPointer_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.OwnedPointer <em>Owned Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Owned Pointer</em>'.
   * @see de.redoxi.ruste.rust.OwnedPointer
   * @generated
   */
  EClass getOwnedPointer();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.OwnedPointer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.OwnedPointer#getType()
   * @see #getOwnedPointer()
   * @generated
   */
  EReference getOwnedPointer_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BorrowedPointer <em>Borrowed Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Borrowed Pointer</em>'.
   * @see de.redoxi.ruste.rust.BorrowedPointer
   * @generated
   */
  EClass getBorrowedPointer();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.BorrowedPointer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.BorrowedPointer#getType()
   * @see #getBorrowedPointer()
   * @generated
   */
  EReference getBorrowedPointer_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StructField <em>Struct Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Field</em>'.
   * @see de.redoxi.ruste.rust.StructField
   * @generated
   */
  EClass getStructField();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StructField#getVis <em>Vis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vis</em>'.
   * @see de.redoxi.ruste.rust.StructField#getVis()
   * @see #getStructField()
   * @generated
   */
  EAttribute getStructField_Vis();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StructField#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.StructField#getIdent()
   * @see #getStructField()
   * @generated
   */
  EAttribute getStructField_Ident();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.StructField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.StructField#getType()
   * @see #getStructField()
   * @generated
   */
  EReference getStructField_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant</em>'.
   * @see de.redoxi.ruste.rust.Variant
   * @generated
   */
  EClass getVariant();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.Variant#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.Variant#getIdent()
   * @see #getVariant()
   * @generated
   */
  EAttribute getVariant_Ident();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StructVariant <em>Struct Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Variant</em>'.
   * @see de.redoxi.ruste.rust.StructVariant
   * @generated
   */
  EClass getStructVariant();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructVariant#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.StructVariant#getParams()
   * @see #getStructVariant()
   * @generated
   */
  EReference getStructVariant_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructVariant#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.redoxi.ruste.rust.StructVariant#getFields()
   * @see #getStructVariant()
   * @generated
   */
  EReference getStructVariant_Fields();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TupleVariant <em>Tuple Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Variant</em>'.
   * @see de.redoxi.ruste.rust.TupleVariant
   * @generated
   */
  EClass getTupleVariant();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TupleVariant#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.redoxi.ruste.rust.TupleVariant#getTypes()
   * @see #getTupleVariant()
   * @generated
   */
  EReference getTupleVariant_Types();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.UnitVariant <em>Unit Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Variant</em>'.
   * @see de.redoxi.ruste.rust.UnitVariant
   * @generated
   */
  EClass getUnitVariant();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StringLit <em>String Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Lit</em>'.
   * @see de.redoxi.ruste.rust.StringLit
   * @generated
   */
  EClass getStringLit();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see de.redoxi.ruste.rust.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.redoxi.ruste.rust.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.NumberLit <em>Number Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Lit</em>'.
   * @see de.redoxi.ruste.rust.NumberLit
   * @generated
   */
  EClass getNumberLit();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.CharLit <em>Char Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Lit</em>'.
   * @see de.redoxi.ruste.rust.CharLit
   * @generated
   */
  EClass getCharLit();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see de.redoxi.ruste.rust.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see de.redoxi.ruste.rust.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.Modulo <em>Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modulo</em>'.
   * @see de.redoxi.ruste.rust.Modulo
   * @generated
   */
  EClass getModulo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Modulo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.Modulo#getLeft()
   * @see #getModulo()
   * @generated
   */
  EReference getModulo_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.Modulo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.Modulo#getRight()
   * @see #getModulo()
   * @generated
   */
  EReference getModulo_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprCast <em>Expr Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Cast</em>'.
   * @see de.redoxi.ruste.rust.ExprCast
   * @generated
   */
  EClass getExprCast();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprCast#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see de.redoxi.ruste.rust.ExprCast#getExpr()
   * @see #getExprCast()
   * @generated
   */
  EReference getExprCast_Expr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprCast#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.ExprCast#getType()
   * @see #getExprCast()
   * @generated
   */
  EReference getExprCast_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprAddition <em>Expr Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Addition</em>'.
   * @see de.redoxi.ruste.rust.ExprAddition
   * @generated
   */
  EClass getExprAddition();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprAddition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprAddition#getLeft()
   * @see #getExprAddition()
   * @generated
   */
  EReference getExprAddition_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprAddition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprAddition#getRight()
   * @see #getExprAddition()
   * @generated
   */
  EReference getExprAddition_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprSubtraction <em>Expr Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Subtraction</em>'.
   * @see de.redoxi.ruste.rust.ExprSubtraction
   * @generated
   */
  EClass getExprSubtraction();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprSubtraction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprSubtraction#getLeft()
   * @see #getExprSubtraction()
   * @generated
   */
  EReference getExprSubtraction_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprSubtraction#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprSubtraction#getRight()
   * @see #getExprSubtraction()
   * @generated
   */
  EReference getExprSubtraction_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLeftShift <em>Expr Left Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Left Shift</em>'.
   * @see de.redoxi.ruste.rust.ExprLeftShift
   * @generated
   */
  EClass getExprLeftShift();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLeftShift#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprLeftShift#getLeft()
   * @see #getExprLeftShift()
   * @generated
   */
  EReference getExprLeftShift_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLeftShift#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprLeftShift#getRight()
   * @see #getExprLeftShift()
   * @generated
   */
  EReference getExprLeftShift_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprRightShift <em>Expr Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Right Shift</em>'.
   * @see de.redoxi.ruste.rust.ExprRightShift
   * @generated
   */
  EClass getExprRightShift();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprRightShift#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprRightShift#getLeft()
   * @see #getExprRightShift()
   * @generated
   */
  EReference getExprRightShift_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprRightShift#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprRightShift#getRight()
   * @see #getExprRightShift()
   * @generated
   */
  EReference getExprRightShift_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBitwiseAnd <em>Expr Bitwise And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bitwise And</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseAnd
   * @generated
   */
  EClass getExprBitwiseAnd();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseAnd#getLeft()
   * @see #getExprBitwiseAnd()
   * @generated
   */
  EReference getExprBitwiseAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseAnd#getRight()
   * @see #getExprBitwiseAnd()
   * @generated
   */
  EReference getExprBitwiseAnd_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBitwiseXor <em>Expr Bitwise Xor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bitwise Xor</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseXor
   * @generated
   */
  EClass getExprBitwiseXor();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseXor#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseXor#getLeft()
   * @see #getExprBitwiseXor()
   * @generated
   */
  EReference getExprBitwiseXor_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseXor#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseXor#getRight()
   * @see #getExprBitwiseXor()
   * @generated
   */
  EReference getExprBitwiseXor_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBitwiseOr <em>Expr Bitwise Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Bitwise Or</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseOr
   * @generated
   */
  EClass getExprBitwiseOr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseOr#getLeft()
   * @see #getExprBitwiseOr()
   * @generated
   */
  EReference getExprBitwiseOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBitwiseOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprBitwiseOr#getRight()
   * @see #getExprBitwiseOr()
   * @generated
   */
  EReference getExprBitwiseOr_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLessThan <em>Expr Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Less Than</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThan
   * @generated
   */
  EClass getExprLessThan();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLessThan#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThan#getLeft()
   * @see #getExprLessThan()
   * @generated
   */
  EReference getExprLessThan_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLessThan#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThan#getRight()
   * @see #getExprLessThan()
   * @generated
   */
  EReference getExprLessThan_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprGreaterThan <em>Expr Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Greater Than</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThan
   * @generated
   */
  EClass getExprGreaterThan();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprGreaterThan#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThan#getLeft()
   * @see #getExprGreaterThan()
   * @generated
   */
  EReference getExprGreaterThan_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprGreaterThan#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThan#getRight()
   * @see #getExprGreaterThan()
   * @generated
   */
  EReference getExprGreaterThan_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo <em>Expr Less Than Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Less Than Or Equal To</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThanOrEqualTo
   * @generated
   */
  EClass getExprLessThanOrEqualTo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getLeft()
   * @see #getExprLessThanOrEqualTo()
   * @generated
   */
  EReference getExprLessThanOrEqualTo_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getRight()
   * @see #getExprLessThanOrEqualTo()
   * @generated
   */
  EReference getExprLessThanOrEqualTo_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo <em>Expr Greater Than Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Greater Than Or Equal To</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo
   * @generated
   */
  EClass getExprGreaterThanOrEqualTo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo#getLeft()
   * @see #getExprGreaterThanOrEqualTo()
   * @generated
   */
  EReference getExprGreaterThanOrEqualTo_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo#getRight()
   * @see #getExprGreaterThanOrEqualTo()
   * @generated
   */
  EReference getExprGreaterThanOrEqualTo_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprEqualTo <em>Expr Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Equal To</em>'.
   * @see de.redoxi.ruste.rust.ExprEqualTo
   * @generated
   */
  EClass getExprEqualTo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprEqualTo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprEqualTo#getLeft()
   * @see #getExprEqualTo()
   * @generated
   */
  EReference getExprEqualTo_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprEqualTo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprEqualTo#getRight()
   * @see #getExprEqualTo()
   * @generated
   */
  EReference getExprEqualTo_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprNotEqualTo <em>Expr Not Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not Equal To</em>'.
   * @see de.redoxi.ruste.rust.ExprNotEqualTo
   * @generated
   */
  EClass getExprNotEqualTo();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprNotEqualTo#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprNotEqualTo#getLeft()
   * @see #getExprNotEqualTo()
   * @generated
   */
  EReference getExprNotEqualTo_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprNotEqualTo#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprNotEqualTo#getRight()
   * @see #getExprNotEqualTo()
   * @generated
   */
  EReference getExprNotEqualTo_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBooleanAnd <em>Expr Boolean And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Boolean And</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanAnd
   * @generated
   */
  EClass getExprBooleanAnd();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBooleanAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanAnd#getLeft()
   * @see #getExprBooleanAnd()
   * @generated
   */
  EReference getExprBooleanAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBooleanAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanAnd#getRight()
   * @see #getExprBooleanAnd()
   * @generated
   */
  EReference getExprBooleanAnd_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprBooleanOr <em>Expr Boolean Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Boolean Or</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanOr
   * @generated
   */
  EClass getExprBooleanOr();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBooleanOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanOr#getLeft()
   * @see #getExprBooleanOr()
   * @generated
   */
  EReference getExprBooleanOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprBooleanOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprBooleanOr#getRight()
   * @see #getExprBooleanOr()
   * @generated
   */
  EReference getExprBooleanOr_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.ExprAssign <em>Expr Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Assign</em>'.
   * @see de.redoxi.ruste.rust.ExprAssign
   * @generated
   */
  EClass getExprAssign();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprAssign#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.redoxi.ruste.rust.ExprAssign#getLeft()
   * @see #getExprAssign()
   * @generated
   */
  EReference getExprAssign_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.ExprAssign#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.redoxi.ruste.rust.ExprAssign#getRight()
   * @see #getExprAssign()
   * @generated
   */
  EReference getExprAssign_Right();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatTupleEnum <em>Pat Tuple Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Tuple Enum</em>'.
   * @see de.redoxi.ruste.rust.PatTupleEnum
   * @generated
   */
  EClass getPatTupleEnum();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.PatTupleEnum#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see de.redoxi.ruste.rust.PatTupleEnum#getPatterns()
   * @see #getPatTupleEnum()
   * @generated
   */
  EReference getPatTupleEnum_Patterns();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatStructEnum <em>Pat Struct Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Struct Enum</em>'.
   * @see de.redoxi.ruste.rust.PatStructEnum
   * @generated
   */
  EClass getPatStructEnum();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.PatStructEnum#getFieldPatterns <em>Field Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Patterns</em>'.
   * @see de.redoxi.ruste.rust.PatStructEnum#getFieldPatterns()
   * @see #getPatStructEnum()
   * @generated
   */
  EReference getPatStructEnum_FieldPatterns();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see de.redoxi.ruste.rust.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see de.redoxi.ruste.rust.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see de.redoxi.ruste.rust.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.MachineType <em>Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Type</em>'.
   * @see de.redoxi.ruste.rust.MachineType
   * @generated
   */
  EClass getMachineType();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.UnitType <em>Unit Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Type</em>'.
   * @see de.redoxi.ruste.rust.UnitType
   * @generated
   */
  EClass getUnitType();

  /**
   * Returns the meta object for enum '{@link de.redoxi.ruste.rust.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see de.redoxi.ruste.rust.Visibility
   * @generated
   */
  EEnum getVisibility();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_ATTR__VALUE = eINSTANCE.getLiteralAttr_Value();

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

    /**
     * The meta object literal for the '<em><b>External Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_ITEM__EXTERNAL_BODY = eINSTANCE.getModItem_ExternalBody();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_ITEM__ITEMS = eINSTANCE.getModItem_Items();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.FnItemImpl <em>Fn Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.FnItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFnItem()
     * @generated
     */
    EClass FN_ITEM = eINSTANCE.getFnItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FN_ITEM__IDENT = eINSTANCE.getFnItem_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_ITEM__PARAMS = eINSTANCE.getFnItem_Params();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_ITEM__ARGS = eINSTANCE.getFnItem_Args();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_ITEM__RETURN_TYPE = eINSTANCE.getFnItem_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_ITEM__BODY = eINSTANCE.getFnItem_Body();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TypeItemImpl <em>Type Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TypeItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTypeItem()
     * @generated
     */
    EClass TYPE_ITEM = eINSTANCE.getTypeItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_ITEM__IDENT = eINSTANCE.getTypeItem_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ITEM__PARAMS = eINSTANCE.getTypeItem_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ITEM__TYPE = eINSTANCE.getTypeItem_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StructItemImpl <em>Struct Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StructItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructItem()
     * @generated
     */
    EClass STRUCT_ITEM = eINSTANCE.getStructItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_ITEM__IDENT = eINSTANCE.getStructItem_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ITEM__PARAMS = eINSTANCE.getStructItem_Params();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_ITEM__FIELDS = eINSTANCE.getStructItem_Fields();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.EnumItemImpl <em>Enum Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.EnumItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumItem()
     * @generated
     */
    EClass ENUM_ITEM = eINSTANCE.getEnumItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ITEM__IDENT = eINSTANCE.getEnumItem_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ITEM__PARAMS = eINSTANCE.getEnumItem_Params();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ITEM__VARIANTS = eINSTANCE.getEnumItem_Variants();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.EnumVariantImpl <em>Enum Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.EnumVariantImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumVariant()
     * @generated
     */
    EClass ENUM_VARIANT = eINSTANCE.getEnumVariant();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VARIANT__IDENT = eINSTANCE.getEnumVariant_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_VARIANT__PARAMS = eINSTANCE.getEnumVariant_Params();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_VARIANT__TYPES = eINSTANCE.getEnumVariant_Types();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_VARIANT__FIELDS = eINSTANCE.getEnumVariant_Fields();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TraitItemImpl <em>Trait Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TraitItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTraitItem()
     * @generated
     */
    EClass TRAIT_ITEM = eINSTANCE.getTraitItem();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT_ITEM__IDENT = eINSTANCE.getTraitItem_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_ITEM__PARAMS = eINSTANCE.getTraitItem_Params();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_ITEM__METHODS = eINSTANCE.getTraitItem_Methods();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TraitMethodImpl <em>Trait Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TraitMethodImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTraitMethod()
     * @generated
     */
    EClass TRAIT_METHOD = eINSTANCE.getTraitMethod();

    /**
     * The meta object literal for the '<em><b>Unsafe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT_METHOD__UNSAFE = eINSTANCE.getTraitMethod_Unsafe();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT_METHOD__EXTERN = eINSTANCE.getTraitMethod_Extern();

    /**
     * The meta object literal for the '<em><b>Vis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT_METHOD__VIS = eINSTANCE.getTraitMethod_Vis();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAIT_METHOD__IDENT = eINSTANCE.getTraitMethod_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD__PARAMS = eINSTANCE.getTraitMethod_Params();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD__ARGS = eINSTANCE.getTraitMethod_Args();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD__RETURN_TYPE = eINSTANCE.getTraitMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_METHOD__BODY = eINSTANCE.getTraitMethod_Body();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ImplItemImpl <em>Impl Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ImplItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getImplItem()
     * @generated
     */
    EClass IMPL_ITEM = eINSTANCE.getImplItem();

    /**
     * The meta object literal for the '<em><b>Trait</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_ITEM__TRAIT = eINSTANCE.getImplItem_Trait();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_ITEM__STRUCT = eINSTANCE.getImplItem_Struct();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPL_ITEM__METHODS = eINSTANCE.getImplItem_Methods();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ImplMethodImpl <em>Impl Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ImplMethodImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getImplMethod()
     * @generated
     */
    EClass IMPL_METHOD = eINSTANCE.getImplMethod();

    /**
     * The meta object literal for the '<em><b>Unsafe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_METHOD__UNSAFE = eINSTANCE.getImplMethod_Unsafe();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_METHOD__EXTERN = eINSTANCE.getImplMethod_Extern();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPL_METHOD__IDENT = eINSTANCE.getImplMethod_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPL_METHOD__PARAMS = eINSTANCE.getImplMethod_Params();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPL_METHOD__ARGS = eINSTANCE.getImplMethod_Args();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPL_METHOD__RETURN_TYPE = eINSTANCE.getImplMethod_ReturnType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPL_METHOD__BODY = eINSTANCE.getImplMethod_Body();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExternBlockImpl <em>Extern Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExternBlockImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExternBlock()
     * @generated
     */
    EClass EXTERN_BLOCK = eINSTANCE.getExternBlock();

    /**
     * The meta object literal for the '<em><b>Abi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERN_BLOCK__ABI = eINSTANCE.getExternBlock_Abi();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_BLOCK__FUNCTIONS = eINSTANCE.getExternBlock_Functions();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ForeignFnImpl <em>Foreign Fn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ForeignFnImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getForeignFn()
     * @generated
     */
    EClass FOREIGN_FN = eINSTANCE.getForeignFn();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOREIGN_FN__IDENT = eINSTANCE.getForeignFn_Ident();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_FN__ARGS = eINSTANCE.getForeignFn_Args();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_FN__RETURN_TYPE = eINSTANCE.getForeignFn_ReturnType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StaticItemImpl <em>Static Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StaticItemImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStaticItem()
     * @generated
     */
    EClass STATIC_ITEM = eINSTANCE.getStaticItem();

    /**
     * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_ITEM__MUTABLE = eINSTANCE.getStaticItem_Mutable();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_ITEM__IDENT = eINSTANCE.getStaticItem_Ident();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_ITEM__TYPE = eINSTANCE.getStaticItem_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_ITEM__EXPR = eINSTANCE.getStaticItem_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLValueImpl <em>Expr LValue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLValueImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLValue()
     * @generated
     */
    EClass EXPR_LVALUE = eINSTANCE.getExprLValue();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprRValueImpl <em>Expr RValue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprRValueImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprRValue()
     * @generated
     */
    EClass EXPR_RVALUE = eINSTANCE.getExprRValue();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLeafImpl <em>Expr Leaf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLeafImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLeaf()
     * @generated
     */
    EClass EXPR_LEAF = eINSTANCE.getExprLeaf();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLiteralImpl <em>Expr Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLiteralImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLiteral()
     * @generated
     */
    EClass EXPR_LITERAL = eINSTANCE.getExprLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LITERAL__LITERAL = eINSTANCE.getExprLiteral_Literal();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprPathHeadImpl <em>Expr Path Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprPathHeadImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprPathHead()
     * @generated
     */
    EClass EXPR_PATH_HEAD = eINSTANCE.getExprPathHead();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_PATH_HEAD__PATH = eINSTANCE.getExprPathHead_Path();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprGroupImpl <em>Expr Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprGroupImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGroup()
     * @generated
     */
    EClass EXPR_GROUP = eINSTANCE.getExprGroup();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GROUP__EXPR = eINSTANCE.getExprGroup_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprTupleImpl <em>Expr Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprTupleImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprTuple()
     * @generated
     */
    EClass EXPR_TUPLE = eINSTANCE.getExprTuple();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_TUPLE__TUPLE = eINSTANCE.getExprTuple_Tuple();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_TUPLE__EXPRS = eINSTANCE.getExprTuple_Exprs();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprStructImpl <em>Expr Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprStructImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprStruct()
     * @generated
     */
    EClass EXPR_STRUCT = eINSTANCE.getExprStruct();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_STRUCT__STRUCT = eINSTANCE.getExprStruct_Struct();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_STRUCT__FIELDS = eINSTANCE.getExprStruct_Fields();

    /**
     * The meta object literal for the '<em><b>Base Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_STRUCT__BASE_EXPR = eINSTANCE.getExprStruct_BaseExpr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprVecImpl <em>Expr Vec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprVecImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprVec()
     * @generated
     */
    EClass EXPR_VEC = eINSTANCE.getExprVec();

    /**
     * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_VEC__MUTABLE = eINSTANCE.getExprVec_Mutable();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_VEC__EXPRS = eINSTANCE.getExprVec_Exprs();

    /**
     * The meta object literal for the '<em><b>Len Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_VEC__LEN_EXPR = eINSTANCE.getExprVec_LenExpr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprUnaryImpl <em>Expr Unary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprUnaryImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprUnary()
     * @generated
     */
    EClass EXPR_UNARY = eINSTANCE.getExprUnary();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_UNARY__EXPR = eINSTANCE.getExprUnary_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.NumericNegationImpl <em>Numeric Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.NumericNegationImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNumericNegation()
     * @generated
     */
    EClass NUMERIC_NEGATION = eINSTANCE.getNumericNegation();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.DereferenceImpl <em>Dereference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.DereferenceImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDereference()
     * @generated
     */
    EClass DEREFERENCE = eINSTANCE.getDereference();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.LogicalNegationImpl <em>Logical Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.LogicalNegationImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLogicalNegation()
     * @generated
     */
    EClass LOGICAL_NEGATION = eINSTANCE.getLogicalNegation();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ManagedBoxImpl <em>Managed Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ManagedBoxImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getManagedBox()
     * @generated
     */
    EClass MANAGED_BOX = eINSTANCE.getManagedBox();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.OwnedBoxImpl <em>Owned Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.OwnedBoxImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedBox()
     * @generated
     */
    EClass OWNED_BOX = eINSTANCE.getOwnedBox();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BorrowImpl <em>Borrow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BorrowImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrow()
     * @generated
     */
    EClass BORROW = eINSTANCE.getBorrow();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBinaryImpl <em>Expr Binary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBinaryImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBinary()
     * @generated
     */
    EClass EXPR_BINARY = eINSTANCE.getExprBinary();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.DivisionMultiplicationOrModuloImpl <em>Division Multiplication Or Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.DivisionMultiplicationOrModuloImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDivisionMultiplicationOrModulo()
     * @generated
     */
    EClass DIVISION_MULTIPLICATION_OR_MODULO = eINSTANCE.getDivisionMultiplicationOrModulo();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.AsImpl <em>As</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.AsImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAs()
     * @generated
     */
    EClass AS = eINSTANCE.getAs();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.AdditionOrSubtractionImpl <em>Addition Or Subtraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.AdditionOrSubtractionImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAdditionOrSubtraction()
     * @generated
     */
    EClass ADDITION_OR_SUBTRACTION = eINSTANCE.getAdditionOrSubtraction();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ShiftOperatorImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getShiftOperator()
     * @generated
     */
    EClass SHIFT_OPERATOR = eINSTANCE.getShiftOperator();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BitwiseAndImpl <em>Bitwise And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BitwiseAndImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseAnd()
     * @generated
     */
    EClass BITWISE_AND = eINSTANCE.getBitwiseAnd();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BitwiseXorImpl <em>Bitwise Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BitwiseXorImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseXor()
     * @generated
     */
    EClass BITWISE_XOR = eINSTANCE.getBitwiseXor();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BitwiseOrImpl <em>Bitwise Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BitwiseOrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBitwiseOr()
     * @generated
     */
    EClass BITWISE_OR = eINSTANCE.getBitwiseOr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ComparisonOperatorsImpl <em>Comparison Operators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ComparisonOperatorsImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getComparisonOperators()
     * @generated
     */
    EClass COMPARISON_OPERATORS = eINSTANCE.getComparisonOperators();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.EqualityOperatorImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEqualityOperator()
     * @generated
     */
    EClass EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BooleanAndImpl <em>Boolean And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BooleanAndImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBooleanAnd()
     * @generated
     */
    EClass BOOLEAN_AND = eINSTANCE.getBooleanAnd();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BooleanOrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBooleanOr()
     * @generated
     */
    EClass BOOLEAN_OR = eINSTANCE.getBooleanOr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.AssignImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLambdaImpl <em>Expr Lambda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLambdaImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLambda()
     * @generated
     */
    EClass EXPR_LAMBDA = eINSTANCE.getExprLambda();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_LAMBDA__ARGS = eINSTANCE.getExprLambda_Args();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LAMBDA__EXPR = eINSTANCE.getExprLambda_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprWhileImpl <em>Expr While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprWhileImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprWhile()
     * @generated
     */
    EClass EXPR_WHILE = eINSTANCE.getExprWhile();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_WHILE__EXPR = eINSTANCE.getExprWhile_Expr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_WHILE__BLOCK = eINSTANCE.getExprWhile_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLoopImpl <em>Expr Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLoopImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLoop()
     * @generated
     */
    EClass EXPR_LOOP = eINSTANCE.getExprLoop();

    /**
     * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_LOOP__LIFETIME = eINSTANCE.getExprLoop_Lifetime();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LOOP__BLOCK = eINSTANCE.getExprLoop_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBreakImpl <em>Expr Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBreakImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBreak()
     * @generated
     */
    EClass EXPR_BREAK = eINSTANCE.getExprBreak();

    /**
     * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_BREAK__LIFETIME = eINSTANCE.getExprBreak_Lifetime();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprContinueImpl <em>Expr Continue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprContinueImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprContinue()
     * @generated
     */
    EClass EXPR_CONTINUE = eINSTANCE.getExprContinue();

    /**
     * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_CONTINUE__LIFETIME = eINSTANCE.getExprContinue_Lifetime();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprDoImpl <em>Expr Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprDoImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprDo()
     * @generated
     */
    EClass EXPR_DO = eINSTANCE.getExprDo();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_DO__EXPR = eINSTANCE.getExprDo_Expr();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_DO__ARGS = eINSTANCE.getExprDo_Args();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_DO__BLOCK = eINSTANCE.getExprDo_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprForImpl <em>Expr For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprForImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprFor()
     * @generated
     */
    EClass EXPR_FOR = eINSTANCE.getExprFor();

    /**
     * The meta object literal for the '<em><b>Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_FOR__PAT = eINSTANCE.getExprFor_Pat();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_FOR__EXPR = eINSTANCE.getExprFor_Expr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_FOR__BLOCK = eINSTANCE.getExprFor_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprIfImpl <em>Expr If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprIfImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprIf()
     * @generated
     */
    EClass EXPR_IF = eINSTANCE.getExprIf();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_IF__EXPR = eINSTANCE.getExprIf_Expr();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_IF__ELSE = eINSTANCE.getExprIf_Else();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ElseTailImpl <em>Else Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ElseTailImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getElseTail()
     * @generated
     */
    EClass ELSE_TAIL = eINSTANCE.getElseTail();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELSE_TAIL__BLOCK = eINSTANCE.getElseTail_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprMatchImpl <em>Expr Match</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprMatchImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprMatch()
     * @generated
     */
    EClass EXPR_MATCH = eINSTANCE.getExprMatch();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MATCH__EXPR = eINSTANCE.getExprMatch_Expr();

    /**
     * The meta object literal for the '<em><b>Arms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MATCH__ARMS = eINSTANCE.getExprMatch_Arms();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.MatchArmImpl <em>Match Arm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.MatchArmImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMatchArm()
     * @generated
     */
    EClass MATCH_ARM = eINSTANCE.getMatchArm();

    /**
     * The meta object literal for the '<em><b>Match Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ARM__MATCH_PAT = eINSTANCE.getMatchArm_MatchPat();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ARM__EXPR = eINSTANCE.getMatchArm_Expr();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ARM__BLOCK = eINSTANCE.getMatchArm_Block();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.MatchPatImpl <em>Match Pat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.MatchPatImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMatchPat()
     * @generated
     */
    EClass MATCH_PAT = eINSTANCE.getMatchPat();

    /**
     * The meta object literal for the '<em><b>Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_PAT__PAT = eINSTANCE.getMatchPat_Pat();

    /**
     * The meta object literal for the '<em><b>End Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_PAT__END_PAT = eINSTANCE.getMatchPat_EndPat();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_PAT__EXPR = eINSTANCE.getMatchPat_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprReturnImpl <em>Expr Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprReturnImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprReturn()
     * @generated
     */
    EClass EXPR_RETURN = eINSTANCE.getExprReturn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_RETURN__EXPR = eINSTANCE.getExprReturn_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BlockImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__EXPR = eINSTANCE.getBlock_Expr();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STMTS = eINSTANCE.getBlock_Stmts();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StmtImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__EXPR = eINSTANCE.getStmt_Expr();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.SlotDeclStmtImpl <em>Slot Decl Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.SlotDeclStmtImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getSlotDeclStmt()
     * @generated
     */
    EClass SLOT_DECL_STMT = eINSTANCE.getSlotDeclStmt();

    /**
     * The meta object literal for the '<em><b>Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_DECL_STMT__PAT = eINSTANCE.getSlotDeclStmt_Pat();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_DECL_STMT__TYPE = eINSTANCE.getSlotDeclStmt_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprStmtImpl <em>Expr Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprStmtImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprStmt()
     * @generated
     */
    EClass EXPR_STMT = eINSTANCE.getExprStmt();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.GenericParamDeclImpl <em>Generic Param Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.GenericParamDeclImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getGenericParamDecl()
     * @generated
     */
    EClass GENERIC_PARAM_DECL = eINSTANCE.getGenericParamDecl();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_PARAM_DECL__IDENT = eINSTANCE.getGenericParamDecl_Ident();

    /**
     * The meta object literal for the '<em><b>Bounds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_PARAM_DECL__BOUNDS = eINSTANCE.getGenericParamDecl_Bounds();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ArgImpl <em>Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ArgImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getArg()
     * @generated
     */
    EClass ARG = eINSTANCE.getArg();

    /**
     * The meta object literal for the '<em><b>Pat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__PAT = eINSTANCE.getArg_Pat();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__TYPE = eINSTANCE.getArg_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatImpl <em>Pat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPat()
     * @generated
     */
    EClass PAT = eINSTANCE.getPat();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatWildcardImpl <em>Pat Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatWildcardImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatWildcard()
     * @generated
     */
    EClass PAT_WILDCARD = eINSTANCE.getPatWildcard();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatIdentImpl <em>Pat Ident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatIdentImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatIdent()
     * @generated
     */
    EClass PAT_IDENT = eINSTANCE.getPatIdent();

    /**
     * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAT_IDENT__MUTABLE = eINSTANCE.getPatIdent_Mutable();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAT_IDENT__IDENT = eINSTANCE.getPatIdent_Ident();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatBoxedImpl <em>Pat Boxed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatBoxedImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatBoxed()
     * @generated
     */
    EClass PAT_BOXED = eINSTANCE.getPatBoxed();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_BOXED__PATTERN = eINSTANCE.getPatBoxed_Pattern();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatOwnedImpl <em>Pat Owned</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatOwnedImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatOwned()
     * @generated
     */
    EClass PAT_OWNED = eINSTANCE.getPatOwned();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_OWNED__PATTERN = eINSTANCE.getPatOwned_Pattern();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatBorrowedImpl <em>Pat Borrowed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatBorrowedImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatBorrowed()
     * @generated
     */
    EClass PAT_BORROWED = eINSTANCE.getPatBorrowed();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_BORROWED__PATTERN = eINSTANCE.getPatBorrowed_Pattern();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatTupleImpl <em>Pat Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatTupleImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatTuple()
     * @generated
     */
    EClass PAT_TUPLE = eINSTANCE.getPatTuple();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_TUPLE__PATTERNS = eINSTANCE.getPatTuple_Patterns();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatVectorImpl <em>Pat Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatVectorImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatVector()
     * @generated
     */
    EClass PAT_VECTOR = eINSTANCE.getPatVector();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_VECTOR__PATTERNS = eINSTANCE.getPatVector_Patterns();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatLiteralImpl <em>Pat Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatLiteralImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatLiteral()
     * @generated
     */
    EClass PAT_LITERAL = eINSTANCE.getPatLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_LITERAL__LITERAL = eINSTANCE.getPatLiteral_Literal();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatEnumImpl <em>Pat Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatEnumImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatEnum()
     * @generated
     */
    EClass PAT_ENUM = eINSTANCE.getPatEnum();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_ENUM__PATH = eINSTANCE.getPatEnum_Path();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.FieldPatImpl <em>Field Pat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.FieldPatImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFieldPat()
     * @generated
     */
    EClass FIELD_PAT = eINSTANCE.getFieldPat();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PAT__IDENT = eINSTANCE.getFieldPat_Ident();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_PAT__PATTERN = eINSTANCE.getFieldPat_Pattern();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TypePathImpl <em>Type Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TypePathImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTypePath()
     * @generated
     */
    EClass TYPE_PATH = eINSTANCE.getTypePath();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PATH__SEGMENTS = eINSTANCE.getTypePath_Segments();

    /**
     * The meta object literal for the '<em><b>Lifetimes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_PATH__LIFETIMES = eINSTANCE.getTypePath_Lifetimes();

    /**
     * The meta object literal for the '<em><b>Generic Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PATH__GENERIC_TYPES = eINSTANCE.getTypePath_GenericTypes();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprPathImpl <em>Expr Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprPathImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprPath()
     * @generated
     */
    EClass EXPR_PATH = eINSTANCE.getExprPath();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_PATH__SEGMENTS = eINSTANCE.getExprPath_Segments();

    /**
     * The meta object literal for the '<em><b>Lifetimes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_PATH__LIFETIMES = eINSTANCE.getExprPath_Lifetimes();

    /**
     * The meta object literal for the '<em><b>Generic Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_PATH__GENERIC_TYPES = eINSTANCE.getExprPath_GenericTypes();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PrimitiveTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.NamedTypeImpl <em>Named Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.NamedTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNamedType()
     * @generated
     */
    EClass NAMED_TYPE = eINSTANCE.getNamedType();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_TYPE__PATH = eINSTANCE.getNamedType_Path();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BoxedPointerImpl <em>Boxed Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BoxedPointerImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoxedPointer()
     * @generated
     */
    EClass BOXED_POINTER = eINSTANCE.getBoxedPointer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOXED_POINTER__TYPE = eINSTANCE.getBoxedPointer_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.OwnedPointerImpl <em>Owned Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.OwnedPointerImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedPointer()
     * @generated
     */
    EClass OWNED_POINTER = eINSTANCE.getOwnedPointer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OWNED_POINTER__TYPE = eINSTANCE.getOwnedPointer_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BorrowedPointerImpl <em>Borrowed Pointer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BorrowedPointerImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrowedPointer()
     * @generated
     */
    EClass BORROWED_POINTER = eINSTANCE.getBorrowedPointer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORROWED_POINTER__TYPE = eINSTANCE.getBorrowedPointer_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StructFieldImpl <em>Struct Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StructFieldImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructField()
     * @generated
     */
    EClass STRUCT_FIELD = eINSTANCE.getStructField();

    /**
     * The meta object literal for the '<em><b>Vis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_FIELD__VIS = eINSTANCE.getStructField_Vis();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_FIELD__IDENT = eINSTANCE.getStructField_Ident();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_FIELD__TYPE = eINSTANCE.getStructField_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.VariantImpl <em>Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.VariantImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getVariant()
     * @generated
     */
    EClass VARIANT = eINSTANCE.getVariant();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIANT__IDENT = eINSTANCE.getVariant_Ident();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StructVariantImpl <em>Struct Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StructVariantImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructVariant()
     * @generated
     */
    EClass STRUCT_VARIANT = eINSTANCE.getStructVariant();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_VARIANT__PARAMS = eINSTANCE.getStructVariant_Params();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_VARIANT__FIELDS = eINSTANCE.getStructVariant_Fields();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TupleVariantImpl <em>Tuple Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TupleVariantImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTupleVariant()
     * @generated
     */
    EClass TUPLE_VARIANT = eINSTANCE.getTupleVariant();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_VARIANT__TYPES = eINSTANCE.getTupleVariant_Types();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.UnitVariantImpl <em>Unit Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.UnitVariantImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getUnitVariant()
     * @generated
     */
    EClass UNIT_VARIANT = eINSTANCE.getUnitVariant();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StringLitImpl <em>String Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StringLitImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStringLit()
     * @generated
     */
    EClass STRING_LIT = eINSTANCE.getStringLit();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.LiteralImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.NumberLitImpl <em>Number Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.NumberLitImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getNumberLit()
     * @generated
     */
    EClass NUMBER_LIT = eINSTANCE.getNumberLit();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.CharLitImpl <em>Char Lit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.CharLitImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getCharLit()
     * @generated
     */
    EClass CHAR_LIT = eINSTANCE.getCharLit();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.DivisionImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.MultiplicationImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ModuloImpl <em>Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ModuloImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getModulo()
     * @generated
     */
    EClass MODULO = eINSTANCE.getModulo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULO__LEFT = eINSTANCE.getModulo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULO__RIGHT = eINSTANCE.getModulo_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprCastImpl <em>Expr Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprCastImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprCast()
     * @generated
     */
    EClass EXPR_CAST = eINSTANCE.getExprCast();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_CAST__EXPR = eINSTANCE.getExprCast_Expr();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_CAST__TYPE = eINSTANCE.getExprCast_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprAdditionImpl <em>Expr Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprAdditionImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprAddition()
     * @generated
     */
    EClass EXPR_ADDITION = eINSTANCE.getExprAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ADDITION__LEFT = eINSTANCE.getExprAddition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ADDITION__RIGHT = eINSTANCE.getExprAddition_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprSubtractionImpl <em>Expr Subtraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprSubtractionImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprSubtraction()
     * @generated
     */
    EClass EXPR_SUBTRACTION = eINSTANCE.getExprSubtraction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SUBTRACTION__LEFT = eINSTANCE.getExprSubtraction_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SUBTRACTION__RIGHT = eINSTANCE.getExprSubtraction_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLeftShiftImpl <em>Expr Left Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLeftShiftImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLeftShift()
     * @generated
     */
    EClass EXPR_LEFT_SHIFT = eINSTANCE.getExprLeftShift();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LEFT_SHIFT__LEFT = eINSTANCE.getExprLeftShift_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LEFT_SHIFT__RIGHT = eINSTANCE.getExprLeftShift_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprRightShiftImpl <em>Expr Right Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprRightShiftImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprRightShift()
     * @generated
     */
    EClass EXPR_RIGHT_SHIFT = eINSTANCE.getExprRightShift();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_RIGHT_SHIFT__LEFT = eINSTANCE.getExprRightShift_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_RIGHT_SHIFT__RIGHT = eINSTANCE.getExprRightShift_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseAndImpl <em>Expr Bitwise And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBitwiseAndImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseAnd()
     * @generated
     */
    EClass EXPR_BITWISE_AND = eINSTANCE.getExprBitwiseAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_AND__LEFT = eINSTANCE.getExprBitwiseAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_AND__RIGHT = eINSTANCE.getExprBitwiseAnd_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseXorImpl <em>Expr Bitwise Xor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBitwiseXorImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseXor()
     * @generated
     */
    EClass EXPR_BITWISE_XOR = eINSTANCE.getExprBitwiseXor();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_XOR__LEFT = eINSTANCE.getExprBitwiseXor_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_XOR__RIGHT = eINSTANCE.getExprBitwiseXor_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBitwiseOrImpl <em>Expr Bitwise Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBitwiseOrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBitwiseOr()
     * @generated
     */
    EClass EXPR_BITWISE_OR = eINSTANCE.getExprBitwiseOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_OR__LEFT = eINSTANCE.getExprBitwiseOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BITWISE_OR__RIGHT = eINSTANCE.getExprBitwiseOr_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLessThanImpl <em>Expr Less Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLessThanImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLessThan()
     * @generated
     */
    EClass EXPR_LESS_THAN = eINSTANCE.getExprLessThan();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LESS_THAN__LEFT = eINSTANCE.getExprLessThan_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LESS_THAN__RIGHT = eINSTANCE.getExprLessThan_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprGreaterThanImpl <em>Expr Greater Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprGreaterThanImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGreaterThan()
     * @generated
     */
    EClass EXPR_GREATER_THAN = eINSTANCE.getExprGreaterThan();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GREATER_THAN__LEFT = eINSTANCE.getExprGreaterThan_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GREATER_THAN__RIGHT = eINSTANCE.getExprGreaterThan_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprLessThanOrEqualToImpl <em>Expr Less Than Or Equal To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprLessThanOrEqualToImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprLessThanOrEqualTo()
     * @generated
     */
    EClass EXPR_LESS_THAN_OR_EQUAL_TO = eINSTANCE.getExprLessThanOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LESS_THAN_OR_EQUAL_TO__LEFT = eINSTANCE.getExprLessThanOrEqualTo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_LESS_THAN_OR_EQUAL_TO__RIGHT = eINSTANCE.getExprLessThanOrEqualTo_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprGreaterThanOrEqualToImpl <em>Expr Greater Than Or Equal To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprGreaterThanOrEqualToImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprGreaterThanOrEqualTo()
     * @generated
     */
    EClass EXPR_GREATER_THAN_OR_EQUAL_TO = eINSTANCE.getExprGreaterThanOrEqualTo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GREATER_THAN_OR_EQUAL_TO__LEFT = eINSTANCE.getExprGreaterThanOrEqualTo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_GREATER_THAN_OR_EQUAL_TO__RIGHT = eINSTANCE.getExprGreaterThanOrEqualTo_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprEqualToImpl <em>Expr Equal To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprEqualToImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprEqualTo()
     * @generated
     */
    EClass EXPR_EQUAL_TO = eINSTANCE.getExprEqualTo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQUAL_TO__LEFT = eINSTANCE.getExprEqualTo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQUAL_TO__RIGHT = eINSTANCE.getExprEqualTo_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprNotEqualToImpl <em>Expr Not Equal To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprNotEqualToImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprNotEqualTo()
     * @generated
     */
    EClass EXPR_NOT_EQUAL_TO = eINSTANCE.getExprNotEqualTo();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT_EQUAL_TO__LEFT = eINSTANCE.getExprNotEqualTo_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT_EQUAL_TO__RIGHT = eINSTANCE.getExprNotEqualTo_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBooleanAndImpl <em>Expr Boolean And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBooleanAndImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBooleanAnd()
     * @generated
     */
    EClass EXPR_BOOLEAN_AND = eINSTANCE.getExprBooleanAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BOOLEAN_AND__LEFT = eINSTANCE.getExprBooleanAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BOOLEAN_AND__RIGHT = eINSTANCE.getExprBooleanAnd_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprBooleanOrImpl <em>Expr Boolean Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprBooleanOrImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprBooleanOr()
     * @generated
     */
    EClass EXPR_BOOLEAN_OR = eINSTANCE.getExprBooleanOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BOOLEAN_OR__LEFT = eINSTANCE.getExprBooleanOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_BOOLEAN_OR__RIGHT = eINSTANCE.getExprBooleanOr_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.ExprAssignImpl <em>Expr Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.ExprAssignImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getExprAssign()
     * @generated
     */
    EClass EXPR_ASSIGN = eINSTANCE.getExprAssign();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ASSIGN__LEFT = eINSTANCE.getExprAssign_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_ASSIGN__RIGHT = eINSTANCE.getExprAssign_Right();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatTupleEnumImpl <em>Pat Tuple Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatTupleEnumImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatTupleEnum()
     * @generated
     */
    EClass PAT_TUPLE_ENUM = eINSTANCE.getPatTupleEnum();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_TUPLE_ENUM__PATTERNS = eINSTANCE.getPatTupleEnum_Patterns();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatStructEnumImpl <em>Pat Struct Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatStructEnumImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatStructEnum()
     * @generated
     */
    EClass PAT_STRUCT_ENUM = eINSTANCE.getPatStructEnum();

    /**
     * The meta object literal for the '<em><b>Field Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_STRUCT_ENUM__FIELD_PATTERNS = eINSTANCE.getPatStructEnum_FieldPatterns();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.IntTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.FloatTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BoolTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.MachineTypeImpl <em>Machine Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.MachineTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getMachineType()
     * @generated
     */
    EClass MACHINE_TYPE = eINSTANCE.getMachineType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.UnitTypeImpl <em>Unit Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.UnitTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getUnitType()
     * @generated
     */
    EClass UNIT_TYPE = eINSTANCE.getUnitType();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.Visibility
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

  }

} //RustPackage
