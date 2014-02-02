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
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Char Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Lit</em>'.
   * @generated
   */
  CharLit createCharLit();

  /**
   * Returns a new object of class '<em>Escaped Char</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Escaped Char</em>'.
   * @generated
   */
  EscapedChar createEscapedChar();

  /**
   * Returns a new object of class '<em>Number Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Lit</em>'.
   * @generated
   */
  NumberLit createNumberLit();

  /**
   * Returns a new object of class '<em>Float Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Lit</em>'.
   * @generated
   */
  FloatLit createFloatLit();

  /**
   * Returns a new object of class '<em>Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Lit</em>'.
   * @generated
   */
  IntLit createIntLit();

  /**
   * Returns a new object of class '<em>Dec Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dec Int Lit</em>'.
   * @generated
   */
  DecIntLit createDecIntLit();

  /**
   * Returns a new object of class '<em>Bin Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bin Int Lit</em>'.
   * @generated
   */
  BinIntLit createBinIntLit();

  /**
   * Returns a new object of class '<em>Oct Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oct Int Lit</em>'.
   * @generated
   */
  OctIntLit createOctIntLit();

  /**
   * Returns a new object of class '<em>Hex Int Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hex Int Lit</em>'.
   * @generated
   */
  HexIntLit createHexIntLit();

  /**
   * Returns a new object of class '<em>String Lit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Lit</em>'.
   * @generated
   */
  StringLit createStringLit();

  /**
   * Returns a new object of class '<em>String Char</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Char</em>'.
   * @generated
   */
  StringChar createStringChar();

  /**
   * Returns a new object of class '<em>Unicode Char</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unicode Char</em>'.
   * @generated
   */
  UnicodeChar createUnicodeChar();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RustPackage getRustPackage();

} //RustFactory
