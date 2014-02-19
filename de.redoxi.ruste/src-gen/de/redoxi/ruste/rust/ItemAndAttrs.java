/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item And Attrs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ItemAndAttrs#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ItemAndAttrs#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getItemAndAttrs()
 * @model
 * @generated
 */
public interface ItemAndAttrs extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ItemAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getItemAndAttrs_Attrs()
   * @model containment="true"
   * @generated
   */
  EList<ItemAttr> getAttrs();

  /**
   * Returns the value of the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' containment reference.
   * @see #setItem(Item)
   * @see de.redoxi.ruste.rust.RustPackage#getItemAndAttrs_Item()
   * @model containment="true"
   * @generated
   */
  Item getItem();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ItemAndAttrs#getItem <em>Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' containment reference.
   * @see #getItem()
   * @generated
   */
  void setItem(Item value);

} // ItemAndAttrs
