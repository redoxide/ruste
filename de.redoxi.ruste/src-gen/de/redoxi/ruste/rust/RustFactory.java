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
   * Returns a new object of class '<em>View Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Item</em>'.
   * @generated
   */
  ViewItem createViewItem();

  /**
   * Returns a new object of class '<em>Extern Mod Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extern Mod Decl</em>'.
   * @generated
   */
  ExternModDecl createExternModDecl();

  /**
   * Returns a new object of class '<em>Link Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Attr</em>'.
   * @generated
   */
  LinkAttr createLinkAttr();

  /**
   * Returns a new object of class '<em>Use Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Decl</em>'.
   * @generated
   */
  UseDecl createUseDecl();

  /**
   * Returns a new object of class '<em>Path Glob</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Glob</em>'.
   * @generated
   */
  PathGlob createPathGlob();

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
   * Returns a new object of class '<em>Expr RValue1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr RValue1</em>'.
   * @generated
   */
  ExprRValue1 createExprRValue1();

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
   * Returns a new object of class '<em>Expr Path Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Path Head</em>'.
   * @generated
   */
  ExprPathHead createExprPathHead();

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
   * Returns a new object of class '<em>Expr Binary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Binary</em>'.
   * @generated
   */
  ExprBinary createExprBinary();

  /**
   * Returns a new object of class '<em>Division Multiplication Or Modulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division Multiplication Or Modulo</em>'.
   * @generated
   */
  DivisionMultiplicationOrModulo createDivisionMultiplicationOrModulo();

  /**
   * Returns a new object of class '<em>As</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>As</em>'.
   * @generated
   */
  As createAs();

  /**
   * Returns a new object of class '<em>Addition Or Subtraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Or Subtraction</em>'.
   * @generated
   */
  AdditionOrSubtraction createAdditionOrSubtraction();

  /**
   * Returns a new object of class '<em>Shift Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift Operator</em>'.
   * @generated
   */
  ShiftOperator createShiftOperator();

  /**
   * Returns a new object of class '<em>Bitwise And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise And</em>'.
   * @generated
   */
  BitwiseAnd createBitwiseAnd();

  /**
   * Returns a new object of class '<em>Bitwise Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Xor</em>'.
   * @generated
   */
  BitwiseXor createBitwiseXor();

  /**
   * Returns a new object of class '<em>Bitwise Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bitwise Or</em>'.
   * @generated
   */
  BitwiseOr createBitwiseOr();

  /**
   * Returns a new object of class '<em>Comparison Operators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Operators</em>'.
   * @generated
   */
  ComparisonOperators createComparisonOperators();

  /**
   * Returns a new object of class '<em>Equality Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality Operator</em>'.
   * @generated
   */
  EqualityOperator createEqualityOperator();

  /**
   * Returns a new object of class '<em>Boolean And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean And</em>'.
   * @generated
   */
  BooleanAnd createBooleanAnd();

  /**
   * Returns a new object of class '<em>Boolean Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Or</em>'.
   * @generated
   */
  BooleanOr createBooleanOr();

  /**
   * Returns a new object of class '<em>Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign</em>'.
   * @generated
   */
  Assign createAssign();

  /**
   * Returns a new object of class '<em>Expr Lambda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Lambda</em>'.
   * @generated
   */
  ExprLambda createExprLambda();

  /**
   * Returns a new object of class '<em>Expr While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr While</em>'.
   * @generated
   */
  ExprWhile createExprWhile();

  /**
   * Returns a new object of class '<em>Expr Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Loop</em>'.
   * @generated
   */
  ExprLoop createExprLoop();

  /**
   * Returns a new object of class '<em>Expr Break</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Break</em>'.
   * @generated
   */
  ExprBreak createExprBreak();

  /**
   * Returns a new object of class '<em>Expr Continue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Continue</em>'.
   * @generated
   */
  ExprContinue createExprContinue();

  /**
   * Returns a new object of class '<em>Expr Do</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Do</em>'.
   * @generated
   */
  ExprDo createExprDo();

  /**
   * Returns a new object of class '<em>Expr For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr For</em>'.
   * @generated
   */
  ExprFor createExprFor();

  /**
   * Returns a new object of class '<em>Expr If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr If</em>'.
   * @generated
   */
  ExprIf createExprIf();

  /**
   * Returns a new object of class '<em>Else Tail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Tail</em>'.
   * @generated
   */
  ElseTail createElseTail();

  /**
   * Returns a new object of class '<em>Expr Match</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Match</em>'.
   * @generated
   */
  ExprMatch createExprMatch();

  /**
   * Returns a new object of class '<em>Match Arm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Arm</em>'.
   * @generated
   */
  MatchArm createMatchArm();

  /**
   * Returns a new object of class '<em>Match Pat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Pat</em>'.
   * @generated
   */
  MatchPat createMatchPat();

  /**
   * Returns a new object of class '<em>Expr Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Return</em>'.
   * @generated
   */
  ExprReturn createExprReturn();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt</em>'.
   * @generated
   */
  Stmt createStmt();

  /**
   * Returns a new object of class '<em>Slot Decl Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slot Decl Stmt</em>'.
   * @generated
   */
  SlotDeclStmt createSlotDeclStmt();

  /**
   * Returns a new object of class '<em>Expr Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Stmt</em>'.
   * @generated
   */
  ExprStmt createExprStmt();

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
   * Returns a new object of class '<em>Type Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Path</em>'.
   * @generated
   */
  TypePath createTypePath();

  /**
   * Returns a new object of class '<em>Expr Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Path</em>'.
   * @generated
   */
  ExprPath createExprPath();

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
   * Returns a new object of class '<em>Textual Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textual Type</em>'.
   * @generated
   */
  TextualType createTextualType();

  /**
   * Returns a new object of class '<em>Named Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Type</em>'.
   * @generated
   */
  NamedType createNamedType();

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
   * Returns a new object of class '<em>Expr Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Field</em>'.
   * @generated
   */
  ExprField createExprField();

  /**
   * Returns a new object of class '<em>Expr Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Method Call</em>'.
   * @generated
   */
  ExprMethodCall createExprMethodCall();

  /**
   * Returns a new object of class '<em>Expr Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Index</em>'.
   * @generated
   */
  ExprIndex createExprIndex();

  /**
   * Returns a new object of class '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division</em>'.
   * @generated
   */
  Division createDivision();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns a new object of class '<em>Modulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modulo</em>'.
   * @generated
   */
  Modulo createModulo();

  /**
   * Returns a new object of class '<em>Expr Cast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Cast</em>'.
   * @generated
   */
  ExprCast createExprCast();

  /**
   * Returns a new object of class '<em>Expr Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Addition</em>'.
   * @generated
   */
  ExprAddition createExprAddition();

  /**
   * Returns a new object of class '<em>Expr Subtraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Subtraction</em>'.
   * @generated
   */
  ExprSubtraction createExprSubtraction();

  /**
   * Returns a new object of class '<em>Expr Left Shift</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Left Shift</em>'.
   * @generated
   */
  ExprLeftShift createExprLeftShift();

  /**
   * Returns a new object of class '<em>Expr Right Shift</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Right Shift</em>'.
   * @generated
   */
  ExprRightShift createExprRightShift();

  /**
   * Returns a new object of class '<em>Expr Bitwise And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Bitwise And</em>'.
   * @generated
   */
  ExprBitwiseAnd createExprBitwiseAnd();

  /**
   * Returns a new object of class '<em>Expr Bitwise Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Bitwise Xor</em>'.
   * @generated
   */
  ExprBitwiseXor createExprBitwiseXor();

  /**
   * Returns a new object of class '<em>Expr Bitwise Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Bitwise Or</em>'.
   * @generated
   */
  ExprBitwiseOr createExprBitwiseOr();

  /**
   * Returns a new object of class '<em>Expr Less Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Less Than</em>'.
   * @generated
   */
  ExprLessThan createExprLessThan();

  /**
   * Returns a new object of class '<em>Expr Greater Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Greater Than</em>'.
   * @generated
   */
  ExprGreaterThan createExprGreaterThan();

  /**
   * Returns a new object of class '<em>Expr Less Than Or Equal To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Less Than Or Equal To</em>'.
   * @generated
   */
  ExprLessThanOrEqualTo createExprLessThanOrEqualTo();

  /**
   * Returns a new object of class '<em>Expr Greater Than Or Equal To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Greater Than Or Equal To</em>'.
   * @generated
   */
  ExprGreaterThanOrEqualTo createExprGreaterThanOrEqualTo();

  /**
   * Returns a new object of class '<em>Expr Equal To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Equal To</em>'.
   * @generated
   */
  ExprEqualTo createExprEqualTo();

  /**
   * Returns a new object of class '<em>Expr Not Equal To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Not Equal To</em>'.
   * @generated
   */
  ExprNotEqualTo createExprNotEqualTo();

  /**
   * Returns a new object of class '<em>Expr Boolean And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Boolean And</em>'.
   * @generated
   */
  ExprBooleanAnd createExprBooleanAnd();

  /**
   * Returns a new object of class '<em>Expr Boolean Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Boolean Or</em>'.
   * @generated
   */
  ExprBooleanOr createExprBooleanOr();

  /**
   * Returns a new object of class '<em>Expr Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Assign</em>'.
   * @generated
   */
  ExprAssign createExprAssign();

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
   * Returns a new object of class '<em>Char Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Type</em>'.
   * @generated
   */
  CharType createCharType();

  /**
   * Returns a new object of class '<em>Boxed Str Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boxed Str Type</em>'.
   * @generated
   */
  BoxedStrType createBoxedStrType();

  /**
   * Returns a new object of class '<em>Owned Str Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Owned Str Type</em>'.
   * @generated
   */
  OwnedStrType createOwnedStrType();

  /**
   * Returns a new object of class '<em>Borrowed Str Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Borrowed Str Type</em>'.
   * @generated
   */
  BorrowedStrType createBorrowedStrType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RustPackage getRustPackage();

} //RustFactory
