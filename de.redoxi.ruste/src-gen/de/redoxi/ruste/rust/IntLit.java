/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.IntLit#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.IntLit#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getIntLit()
 * @model
 * @generated
 */
public interface IntLit extends NumberLit
{
  /**
   * Returns the value of the '<em><b>Unsigned</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned</em>' attribute.
   * @see #setUnsigned(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getIntLit_Unsigned()
   * @model
   * @generated
   */
  boolean isUnsigned();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.IntLit#isUnsigned <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned</em>' attribute.
   * @see #isUnsigned()
   * @generated
   */
  void setUnsigned(boolean value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * The literals are from the enumeration {@link de.redoxi.ruste.rust.IntSize}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see de.redoxi.ruste.rust.IntSize
   * @see #setSize(IntSize)
   * @see de.redoxi.ruste.rust.RustPackage#getIntLit_Size()
   * @model
   * @generated
   */
  IntSize getSize();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.IntLit#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see de.redoxi.ruste.rust.IntSize
   * @see #getSize()
   * @generated
   */
  void setSize(IntSize value);

} // IntLit
