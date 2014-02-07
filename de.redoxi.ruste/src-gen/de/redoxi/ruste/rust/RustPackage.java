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
  int PAT_WILDCARD = 12;

  /**
   * The number of structural features of the '<em>Pat Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_WILDCARD_FEATURE_COUNT = PAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatWildcardMultiImpl <em>Pat Wildcard Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatWildcardMultiImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatWildcardMulti()
   * @generated
   */
  int PAT_WILDCARD_MULTI = 13;

  /**
   * The number of structural features of the '<em>Pat Wildcard Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_WILDCARD_MULTI_FEATURE_COUNT = PAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatIdentImpl <em>Pat Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatIdentImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatIdent()
   * @generated
   */
  int PAT_IDENT = 14;

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
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatTupleImpl <em>Pat Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatTupleImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatTuple()
   * @generated
   */
  int PAT_TUPLE = 15;

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
  int PAT_VECTOR = 16;

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
  int PAT_LITERAL = 17;

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
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatRangeImpl <em>Pat Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatRangeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatRange()
   * @generated
   */
  int PAT_RANGE = 18;

  /**
   * The number of structural features of the '<em>Pat Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_RANGE_FEATURE_COUNT = PAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatCharRangeImpl <em>Pat Char Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatCharRangeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatCharRange()
   * @generated
   */
  int PAT_CHAR_RANGE = 19;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_CHAR_RANGE__START = PAT_RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_CHAR_RANGE__END = PAT_RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pat Char Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_CHAR_RANGE_FEATURE_COUNT = PAT_RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.PatNumberRangeImpl <em>Pat Number Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.PatNumberRangeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatNumberRange()
   * @generated
   */
  int PAT_NUMBER_RANGE = 20;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_NUMBER_RANGE__START = PAT_RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_NUMBER_RANGE__END = PAT_RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pat Number Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAT_NUMBER_RANGE_FEATURE_COUNT = PAT_RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.TypeImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getType()
   * @generated
   */
  int TYPE = 21;

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
  int PRIMITIVE_TYPE = 22;

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
  int TUPLE_TYPE = 23;

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
  int STRUCT_TYPE = 24;

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
   * The meta object id for the '{@link de.redoxi.ruste.rust.impl.BoxedPointerImpl <em>Boxed Pointer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.redoxi.ruste.rust.impl.BoxedPointerImpl
   * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getBoxedPointer()
   * @generated
   */
  int BOXED_POINTER = 25;

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
  int OWNED_POINTER = 26;

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
  int BORROWED_POINTER = 27;

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
  int STRUCT_FIELD = 28;

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
  int ENUM_TYPE = 29;

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
  int VARIANT = 30;

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
  int STRUCT_VARIANT = 31;

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
  int TUPLE_VARIANT = 32;

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
  int UNIT_VARIANT = 33;

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
  int LITERAL = 35;

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
  int STRING_LIT = 34;

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
  int NUMBER_LIT = 36;

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
  int CHAR_LIT = 37;

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
  int INT_TYPE = 38;

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
  int FLOAT_TYPE = 39;

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
  int BOOL_TYPE = 40;

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
  int MACHINE_TYPE = 41;

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
  int UNIT_TYPE = 42;

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
  int VISIBILITY = 43;


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
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatWildcard <em>Pat Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Wildcard</em>'.
   * @see de.redoxi.ruste.rust.PatWildcard
   * @generated
   */
  EClass getPatWildcard();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatWildcardMulti <em>Pat Wildcard Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Wildcard Multi</em>'.
   * @see de.redoxi.ruste.rust.PatWildcardMulti
   * @generated
   */
  EClass getPatWildcardMulti();

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
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatRange <em>Pat Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Range</em>'.
   * @see de.redoxi.ruste.rust.PatRange
   * @generated
   */
  EClass getPatRange();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatCharRange <em>Pat Char Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Char Range</em>'.
   * @see de.redoxi.ruste.rust.PatCharRange
   * @generated
   */
  EClass getPatCharRange();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatCharRange#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.redoxi.ruste.rust.PatCharRange#getStart()
   * @see #getPatCharRange()
   * @generated
   */
  EReference getPatCharRange_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatCharRange#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.redoxi.ruste.rust.PatCharRange#getEnd()
   * @see #getPatCharRange()
   * @generated
   */
  EReference getPatCharRange_End();

  /**
   * Returns the meta object for class '{@link de.redoxi.ruste.rust.PatNumberRange <em>Pat Number Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pat Number Range</em>'.
   * @see de.redoxi.ruste.rust.PatNumberRange
   * @generated
   */
  EClass getPatNumberRange();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatNumberRange#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.redoxi.ruste.rust.PatNumberRange#getStart()
   * @see #getPatNumberRange()
   * @generated
   */
  EReference getPatNumberRange_Start();

  /**
   * Returns the meta object for the containment reference '{@link de.redoxi.ruste.rust.PatNumberRange#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see de.redoxi.ruste.rust.PatNumberRange#getEnd()
   * @see #getPatNumberRange()
   * @generated
   */
  EReference getPatNumberRange_End();

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
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatWildcardImpl <em>Pat Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatWildcardImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatWildcard()
     * @generated
     */
    EClass PAT_WILDCARD = eINSTANCE.getPatWildcard();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatWildcardMultiImpl <em>Pat Wildcard Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatWildcardMultiImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatWildcardMulti()
     * @generated
     */
    EClass PAT_WILDCARD_MULTI = eINSTANCE.getPatWildcardMulti();

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
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatRangeImpl <em>Pat Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatRangeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatRange()
     * @generated
     */
    EClass PAT_RANGE = eINSTANCE.getPatRange();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatCharRangeImpl <em>Pat Char Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatCharRangeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatCharRange()
     * @generated
     */
    EClass PAT_CHAR_RANGE = eINSTANCE.getPatCharRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_CHAR_RANGE__START = eINSTANCE.getPatCharRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_CHAR_RANGE__END = eINSTANCE.getPatCharRange_End();

    /**
     * The meta object literal for the '{@link de.redoxi.ruste.rust.impl.PatNumberRangeImpl <em>Pat Number Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.redoxi.ruste.rust.impl.PatNumberRangeImpl
     * @see de.redoxi.ruste.rust.impl.RustPackageImpl#getPatNumberRange()
     * @generated
     */
    EClass PAT_NUMBER_RANGE = eINSTANCE.getPatNumberRange();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_NUMBER_RANGE__START = eINSTANCE.getPatNumberRange_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAT_NUMBER_RANGE__END = eINSTANCE.getPatNumberRange_End();

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
