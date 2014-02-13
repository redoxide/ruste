/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.NamedType#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getNamedType()
 * @model
 * @generated
 */
public interface NamedType extends Type
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(TypePath)
   * @see de.redoxi.ruste.rust.RustPackage#getNamedType_Path()
   * @model containment="true"
   * @generated
   */
  TypePath getPath();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.NamedType#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(TypePath value);

} // NamedType
