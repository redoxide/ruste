/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.TraitItem#getName <em>Name</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.TraitItem#getParams <em>Params</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.TraitItem#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getTraitItem()
 * @model
 * @generated
 */
public interface TraitItem extends Item
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
   * @see de.redoxi.ruste.rust.RustPackage#getTraitItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.TraitItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.GenericParamDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getTraitItem_Params()
   * @model containment="true"
   * @generated
   */
  EList<GenericParamDecl> getParams();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.TraitMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getTraitItem_Methods()
   * @model containment="true"
   * @generated
   */
  EList<TraitMethod> getMethods();

} // TraitItem
