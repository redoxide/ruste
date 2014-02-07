/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pat Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PatIdent#isMutable <em>Mutable</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.PatIdent#getIdent <em>Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPatIdent()
 * @model
 * @generated
 */
public interface PatIdent extends Pat
{
  /**
   * Returns the value of the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutable</em>' attribute.
   * @see #setMutable(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getPatIdent_Mutable()
   * @model
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatIdent#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' attribute.
   * @see #setIdent(String)
   * @see de.redoxi.ruste.rust.RustPackage#getPatIdent_Ident()
   * @model
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatIdent#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

} // PatIdent
