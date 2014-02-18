/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ModItem#getName <em>Name</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ModItem#isExternalBody <em>External Body</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ModItem#getViewItems <em>View Items</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ModItem#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getModItem()
 * @model
 * @generated
 */
public interface ModItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.redoxi.ruste.rust.RustPackage#getModItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ModItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>External Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Body</em>' attribute.
   * @see #setExternalBody(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getModItem_ExternalBody()
   * @model
   * @generated
   */
  boolean isExternalBody();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ModItem#isExternalBody <em>External Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Body</em>' attribute.
   * @see #isExternalBody()
   * @generated
   */
  void setExternalBody(boolean value);

  /**
   * Returns the value of the '<em><b>View Items</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ViewItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Items</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getModItem_ViewItems()
   * @model containment="true"
   * @generated
   */
  EList<ViewItem> getViewItems();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ItemAndAttrs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getModItem_Items()
   * @model containment="true"
   * @generated
   */
  EList<ItemAndAttrs> getItems();

} // ModItem
