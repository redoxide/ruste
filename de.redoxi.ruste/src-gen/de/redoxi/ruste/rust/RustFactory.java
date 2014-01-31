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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RustPackage getRustPackage();

} //RustFactory
