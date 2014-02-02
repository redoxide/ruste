/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.FloatLit#isNegativeExp <em>Negative Exp</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.FloatLit#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getFloatLit()
 * @model
 * @generated
 */
public interface FloatLit extends NumberLit
{
  /**
   * Returns the value of the '<em><b>Negative Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative Exp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative Exp</em>' attribute.
   * @see #setNegativeExp(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getFloatLit_NegativeExp()
   * @model
   * @generated
   */
  boolean isNegativeExp();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.FloatLit#isNegativeExp <em>Negative Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative Exp</em>' attribute.
   * @see #isNegativeExp()
   * @generated
   */
  void setNegativeExp(boolean value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * The literals are from the enumeration {@link de.redoxi.ruste.rust.FloatSize}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see de.redoxi.ruste.rust.FloatSize
   * @see #setSize(FloatSize)
   * @see de.redoxi.ruste.rust.RustPackage#getFloatLit_Size()
   * @model
   * @generated
   */
  FloatSize getSize();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.FloatLit#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see de.redoxi.ruste.rust.FloatSize
   * @see #getSize()
   * @generated
   */
  void setSize(FloatSize value);

} // FloatLit
