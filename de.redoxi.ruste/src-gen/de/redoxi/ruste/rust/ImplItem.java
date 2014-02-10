/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impl Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ImplItem#getTrait <em>Trait</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplItem#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplItem#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getImplItem()
 * @model
 * @generated
 */
public interface ImplItem extends Item
{
  /**
   * Returns the value of the '<em><b>Trait</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait</em>' attribute.
   * @see #setTrait(String)
   * @see de.redoxi.ruste.rust.RustPackage#getImplItem_Trait()
   * @model
   * @generated
   */
  String getTrait();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplItem#getTrait <em>Trait</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait</em>' attribute.
   * @see #getTrait()
   * @generated
   */
  void setTrait(String value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' attribute.
   * @see #setStruct(String)
   * @see de.redoxi.ruste.rust.RustPackage#getImplItem_Struct()
   * @model
   * @generated
   */
  String getStruct();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplItem#getStruct <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' attribute.
   * @see #getStruct()
   * @generated
   */
  void setStruct(String value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ImplMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getImplItem_Methods()
   * @model containment="true"
   * @generated
   */
  EList<ImplMethod> getMethods();

} // ImplItem
