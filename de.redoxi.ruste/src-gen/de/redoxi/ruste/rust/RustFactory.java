/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.redoxi.ruste.rust.RustPackage
 * @generated
 */
public interface RustFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RustFactory eINSTANCE = de.redoxi.ruste.rust.impl.RustFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Crate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crate</em>'.
   * @generated
   */
  Crate createCrate();

  /**
   * Returns a new object of class '<em>Item Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Attr</em>'.
   * @generated
   */
  ItemAttr createItemAttr();

  /**
   * Returns a new object of class '<em>Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr</em>'.
   * @generated
   */
  Attr createAttr();

  /**
   * Returns a new object of class '<em>Attr With List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attr With List</em>'.
   * @generated
   */
  AttrWithList createAttrWithList();

  /**
   * Returns a new object of class '<em>Literal Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Attr</em>'.
   * @generated
   */
  LiteralAttr createLiteralAttr();

  /**
   * Returns a new object of class '<em>Item And Attrs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item And Attrs</em>'.
   * @generated
   */
  ItemAndAttrs createItemAndAttrs();

  /**
   * Returns a new object of class '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item</em>'.
   * @generated
   */
  Item createItem();

  /**
   * Returns a new object of class '<em>Mod Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Item</em>'.
   * @generated
   */
  ModItem createModItem();

  /**
   * Returns a new object of class '<em>Fn Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fn Item</em>'.
   * @generated
   */
  FnItem createFnItem();

  /**
   * Returns a new object of class '<em>Type Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Item</em>'.
   * @generated
   */
  TypeItem createTypeItem();

  /**
   * Returns a new object of class '<em>Struct Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Item</em>'.
   * @generated
   */
  StructItem createStructItem();

  /**
   * Returns a new object of class '<em>Enum Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Item</em>'.
   * @generated
   */
  EnumItem createEnumItem();

  /**
   * Returns a new object of class '<em>Enum Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Variant</em>'.
   * @generated
   */
  EnumVariant createEnumVariant();

  /**
   * Returns a new object of class '<em>Trait Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait Item</em>'.
   * @generated
   */
  TraitItem createTraitItem();

  /**
   * Returns a new object of class '<em>Trait Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait Method</em>'.
   * @generated
   */
  TraitMethod createTraitMethod();

  /**
   * Returns a new object of class '<em>Impl Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Item</em>'.
   * @generated
   */
  ImplItem createImplItem();

  /**
   * Returns a new object of class '<em>Impl Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Impl Method</em>'.
   * @generated
   */
  ImplMethod createImplMethod();

  /**
   * Returns a new object of class '<em>Extern Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Block</em>'.
   * @generated
   */
  ExternBlock createExternBlock();

  /**
   * Returns a new object of class '<em>Foreign Fn</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign Fn</em>'.
   * @generated
   */
  ForeignFn createForeignFn();

  /**
   * Returns a new object of class '<em>Static Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Item</em>'.
   * @generated
   */
  StaticItem createStaticItem();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expr LValue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr LValue</em>'.
   * @generated
   */
  ExprLValue createExprLValue();

  /**
   * Returns a new object of class '<em>Expr RValue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr RValue</em>'.
   * @generated
   */
  ExprRValue createExprRValue();

  /**
   * Returns a new object of class '<em>Expr Leaf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Leaf</em>'.
   * @generated
   */
  ExprLeaf createExprLeaf();

  /**
   * Returns a new object of class '<em>Expr Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Literal</em>'.
   * @generated
   */
  ExprLiteral createExprLiteral();

  /**
   * Returns a new object of class '<em>Expr Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Path</em>'.
   * @generated
   */
  ExprPath createExprPath();

  /**
   * Returns a new object of class '<em>Expr Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Group</em>'.
   * @generated
   */
  ExprGroup createExprGroup();

  /**
   * Returns a new object of class '<em>Expr Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Tuple</em>'.
   * @generated
   */
  ExprTuple createExprTuple();

  /**
   * Returns a new object of class '<em>Expr Struct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Struct</em>'.
   * @generated
   */
  ExprStruct createExprStruct();

  /**
   * Returns a new object of class '<em>Expr Vec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Vec</em>'.
   * @generated
   */
  ExprVec createExprVec();

  /**
   * Returns a new object of class '<em>Expr Unary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Unary</em>'.
   * @generated
   */
  ExprUnary createExprUnary();

  /**
   * Returns a new object of class '<em>Numeric Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Negation</em>'.
   * @generated
   */
  NumericNegation createNumericNegation();

  /**
   * Returns a new object of class '<em>Dereference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dereference</em>'.
   * @generated
   */
  Dereference createDereference();

  /**
   * Returns a new object of class '<em>Logical Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Negation</em>'.
   * @generated
   */
  LogicalNegation createLogicalNegation();

  /**
   * Returns a new object of class '<em>Managed Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Managed Box</em>'.
   * @generated
   */
  ManagedBox createManagedBox();

  /**
   * Returns a new object of class '<em>Owned Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Owned Box</em>'.
   * @generated
   */
  OwnedBox createOwnedBox();

  /**
   * Returns a new object of class '<em>Borrow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Borrow</em>'.
   * @generated
   */
  Borrow createBorrow();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Generic Param Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Param Decl</em>'.
   * @generated
   */
  GenericParamDecl createGenericParamDecl();

  /**
   * Returns a new object of class '<em>Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arg</em>'.
   * @generated
   */
  Arg createArg();

  /**
   * Returns a new object of class '<em>Pat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat</em>'.
   * @generated
   */
  Pat createPat();

  /**
   * Returns a new object of class '<em>Pat Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Wildcard</em>'.
   * @generated
   */
  PatWildcard createPatWildcard();

  /**
   * Returns a new object of class '<em>Pat Ident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Ident</em>'.
   * @generated
   */
  PatIdent createPatIdent();

  /**
   * Returns a new object of class '<em>Pat Boxed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Boxed</em>'.
   * @generated
   */
  PatBoxed createPatBoxed();

  /**
   * Returns a new object of class '<em>Pat Owned</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Owned</em>'.
   * @generated
   */
  PatOwned createPatOwned();

  /**
   * Returns a new object of class '<em>Pat Borrowed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Borrowed</em>'.
   * @generated
   */
  PatBorrowed createPatBorrowed();

  /**
   * Returns a new object of class '<em>Pat Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Tuple</em>'.
   * @generated
   */
  PatTuple createPatTuple();

  /**
   * Returns a new object of class '<em>Pat Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Vector</em>'.
   * @generated
   */
  PatVector createPatVector();

  /**
   * Returns a new object of class '<em>Pat Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Literal</em>'.
   * @generated
   */
  PatLiteral createPatLiteral();

  /**
   * Returns a new object of class '<em>Pat Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Range</em>'.
   * @generated
   */
  PatRange createPatRange();

  /**
   * Returns a new object of class '<em>Pat Char Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Char Range</em>'.
   * @generated
   */
  PatCharRange createPatCharRange();

  /**
   * Returns a new object of class '<em>Pat Number Range</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Number Range</em>'.
   * @generated
   */
  PatNumberRange createPatNumberRange();

  /**
   * Returns a new object of class '<em>Pat Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Enum</em>'.
   * @generated
   */
  PatEnum createPatEnum();

  /**
   * Returns a new object of class '<em>Field Pat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Pat</em>'.
   * @generated
   */
  FieldPat createFieldPat();

  /**
   * Returns a new object of class '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path</em>'.
   * @generated
   */
  Path createPath();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Type</em>'.
   * @generated
   */
  PrimitiveType createPrimitiveType();

  /**
   * Returns a new object of class '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Type</em>'.
   * @generated
   */
  TupleType createTupleType();

  /**
   * Returns a new object of class '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type</em>'.
   * @generated
   */
  StructType createStructType();

  /**
   * Returns a new object of class '<em>Boxed Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boxed Pointer</em>'.
   * @generated
   */
  BoxedPointer createBoxedPointer();

  /**
   * Returns a new object of class '<em>Owned Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Owned Pointer</em>'.
   * @generated
   */
  OwnedPointer createOwnedPointer();

  /**
   * Returns a new object of class '<em>Borrowed Pointer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Borrowed Pointer</em>'.
   * @generated
   */
  BorrowedPointer createBorrowedPointer();

  /**
   * Returns a new object of class '<em>Struct Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Field</em>'.
   * @generated
   */
  StructField createStructField();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant</em>'.
   * @generated
   */
  Variant createVariant();

  /**
   * Returns a new object of class '<em>Struct Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Variant</em>'.
   * @generated
   */
  StructVariant createStructVariant();

  /**
   * Returns a new object of class '<em>Tuple Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Variant</em>'.
   * @generated
   */
  TupleVariant createTupleVariant();

  /**
   * Returns a new object of class '<em>Unit Variant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Variant</em>'.
   * @generated
   */
  UnitVariant createUnitVariant();

  /**
   * Returns a new object of class '<em>String Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Lit</em>'.
   * @generated
   */
  StringLit createStringLit();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Number Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Lit</em>'.
   * @generated
   */
  NumberLit createNumberLit();

  /**
   * Returns a new object of class '<em>Char Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Lit</em>'.
   * @generated
   */
  CharLit createCharLit();

  /**
   * Returns a new object of class '<em>Pat Tuple Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Tuple Enum</em>'.
   * @generated
   */
  PatTupleEnum createPatTupleEnum();

  /**
   * Returns a new object of class '<em>Pat Struct Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pat Struct Enum</em>'.
   * @generated
   */
  PatStructEnum createPatStructEnum();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Type</em>'.
   * @generated
   */
  FloatType createFloatType();

  /**
   * Returns a new object of class '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Type</em>'.
   * @generated
   */
  BoolType createBoolType();

  /**
   * Returns a new object of class '<em>Machine Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Machine Type</em>'.
   * @generated
   */
  MachineType createMachineType();

  /**
   * Returns a new object of class '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Type</em>'.
   * @generated
   */
  UnitType createUnitType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RustPackage getRustPackage();

} //RustFactory
