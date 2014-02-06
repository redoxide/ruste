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
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__IDENT = 0;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 1;

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
  int MOD_ITEM__IDENT = ITEM__IDENT;

  /**
   * The feature id for the '<em><b>External Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM__EXTERNAL_BODY = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM__ITEMS = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

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
  int FN_ITEM__IDENT = ITEM__IDENT;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__PARAMS = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__ARGS = ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__RETURN_TYPE = ITEM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM__BODY = ITEM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Fn Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.GenericParamDeclImpl <em>Generic Param Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.GenericParamDeclImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getGenericParamDecl()
   * @generated
   */
  int GENERIC_PARAM_DECL = 9;

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
  int ARG = 10;

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
  int PAT = 11;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT__IDENT = 0;

  /**
   * The number of structural features of the '<em>Pat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getType()
   * @generated
   */
  int TYPE = 12;

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
  int PRIMITIVE_TYPE = 13;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TupleTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTupleType()
   * @generated
   */
  int TUPLE_TYPE = 14;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE__TYPES = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StructTypeImpl <em>Struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StructTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructType()
   * @generated
   */
  int STRUCT_TYPE = 15;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__IDENT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__PARAMS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__FIELDS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BoxedTypeImpl <em>Boxed Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BoxedTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoxedType()
   * @generated
   */
  int BOXED_TYPE = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOXED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boxed Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOXED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.OwnedTypeImpl <em>Owned Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.OwnedTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedType()
   * @generated
   */
  int OWNED_TYPE = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Owned Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OWNED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BorrowedTypeImpl <em>Borrowed Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BorrowedTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrowedType()
   * @generated
   */
  int BORROWED_TYPE = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWED_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Borrowed Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORROWED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.StructFieldImpl <em>Struct Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.StructFieldImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructField()
   * @generated
   */
  int STRUCT_FIELD = 19;

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
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.EnumTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 20;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__IDENT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__PARAMS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__VARIANTS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.VariantImpl <em>Variant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.VariantImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getVariant()
   * @generated
   */
  int VARIANT = 21;

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
  int STRUCT_VARIANT = 22;

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
  int TUPLE_VARIANT = 23;

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
  int UNIT_VARIANT = 24;

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
  int LITERAL = 26;

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
  int STRING_LIT = 25;

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
  int NUMBER_LIT = 27;

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
  int CHAR_LIT = 28;

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
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.IntTypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 29;

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
  int FLOAT_TYPE = 30;

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
  int BOOL_TYPE = 31;

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
  int MACHINE_TYPE = 32;

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
  int UNIT_TYPE = 33;

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
  int VISIBILITY = 34;


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
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.Item#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.Item#getIdent()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Ident();

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
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.FnItem#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see de.redoxi.ruste.rust.FnItem#getBody()
   * @see #getFnItem()
   * @generated
   */
  EAttribute getFnItem_Body();

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
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.Pat#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.Pat#getIdent()
   * @see #getPat()
   * @generated
   */
  EAttribute getPat_Ident();

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
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.TupleType <em>Tuple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Type</em>'.
   * @see de.redoxi.ruste.rust.TupleType
   * @generated
   */
  EClass getTupleType();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.TupleType#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see de.redoxi.ruste.rust.TupleType#getTypes()
   * @see #getTupleType()
   * @generated
   */
  EReference getTupleType_Types();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type</em>'.
   * @see de.redoxi.ruste.rust.StructType
   * @generated
   */
  EClass getStructType();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.StructType#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.StructType#getIdent()
   * @see #getStructType()
   * @generated
   */
  EAttribute getStructType_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructType#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.StructType#getParams()
   * @see #getStructType()
   * @generated
   */
  EReference getStructType_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.StructType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.redoxi.ruste.rust.StructType#getFields()
   * @see #getStructType()
   * @generated
   */
  EReference getStructType_Fields();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BoxedType <em>Boxed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boxed Type</em>'.
   * @see de.redoxi.ruste.rust.BoxedType
   * @generated
   */
  EClass getBoxedType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.BoxedType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.BoxedType#getType()
   * @see #getBoxedType()
   * @generated
   */
  EReference getBoxedType_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.OwnedType <em>Owned Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Owned Type</em>'.
   * @see de.redoxi.ruste.rust.OwnedType
   * @generated
   */
  EClass getOwnedType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.OwnedType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.OwnedType#getType()
   * @see #getOwnedType()
   * @generated
   */
  EReference getOwnedType_Type();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.BorrowedType <em>Borrowed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Borrowed Type</em>'.
   * @see de.redoxi.ruste.rust.BorrowedType
   * @generated
   */
  EClass getBorrowedType();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.BorrowedType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.redoxi.ruste.rust.BorrowedType#getType()
   * @see #getBorrowedType()
   * @generated
   */
  EReference getBorrowedType_Type();

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
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see de.redoxi.ruste.rust.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the attribute '{@link de.redoxi.ruste.rust.EnumType#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see de.redoxi.ruste.rust.EnumType#getIdent()
   * @see #getEnumType()
   * @generated
   */
  EAttribute getEnumType_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumType#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.redoxi.ruste.rust.EnumType#getParams()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_Params();

  /**
   * Returns the meta object for the containment reference list '{@link de.redoxi.ruste.rust.EnumType#getVariants <em>Variants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variants</em>'.
   * @see de.redoxi.ruste.rust.EnumType#getVariants()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_Variants();

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
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__IDENT = eINSTANCE.getItem_Ident();

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
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FN_ITEM__BODY = eINSTANCE.getFnItem_Body();

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
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAT__IDENT = eINSTANCE.getPat_Ident();

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
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.TupleTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getTupleType()
     * @generated
     */
    EClass TUPLE_TYPE = eINSTANCE.getTupleType();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE_TYPE__TYPES = eINSTANCE.getTupleType_Types();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.StructTypeImpl <em>Struct Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.StructTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getStructType()
     * @generated
     */
    EClass STRUCT_TYPE = eINSTANCE.getStructType();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_TYPE__IDENT = eINSTANCE.getStructType_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE__PARAMS = eINSTANCE.getStructType_Params();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE__FIELDS = eINSTANCE.getStructType_Fields();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BoxedTypeImpl <em>Boxed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BoxedTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoxedType()
     * @generated
     */
    EClass BOXED_TYPE = eINSTANCE.getBoxedType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOXED_TYPE__TYPE = eINSTANCE.getBoxedType_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.OwnedTypeImpl <em>Owned Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.OwnedTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getOwnedType()
     * @generated
     */
    EClass OWNED_TYPE = eINSTANCE.getOwnedType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OWNED_TYPE__TYPE = eINSTANCE.getOwnedType_Type();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.BorrowedTypeImpl <em>Borrowed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.BorrowedTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBorrowedType()
     * @generated
     */
    EClass BORROWED_TYPE = eINSTANCE.getBorrowedType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BORROWED_TYPE__TYPE = eINSTANCE.getBorrowedType_Type();

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
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.EnumTypeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_TYPE__IDENT = eINSTANCE.getEnumType_Ident();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__PARAMS = eINSTANCE.getEnumType_Params();

    /**
     * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__VARIANTS = eINSTANCE.getEnumType_Variants();

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
