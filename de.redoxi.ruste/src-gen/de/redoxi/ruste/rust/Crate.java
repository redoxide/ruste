/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.Crate#getViewItems <em>View Items</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.Crate#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getCrate()
 * @model
 * @generated
 */
public interface Crate extends EObject
{
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
   * @see de.redoxi.ruste.rust.RustPackage#getCrate_ViewItems()
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
   * @see de.redoxi.ruste.rust.RustPackage#getCrate_Items()
   * @model containment="true"
   * @generated
   */
  EList<ItemAndAttrs> getItems();

} // Crate
