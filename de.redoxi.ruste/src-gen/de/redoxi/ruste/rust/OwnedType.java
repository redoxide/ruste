/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.OwnedType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getOwnedType()
 * @model
 * @generated
 */
public interface OwnedType extends Type
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see de.redoxi.ruste.rust.RustPackage#getOwnedType_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.OwnedType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // OwnedType
