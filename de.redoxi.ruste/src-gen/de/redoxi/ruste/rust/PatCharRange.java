/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pat Char Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PatCharRange#getStart <em>Start</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.PatCharRange#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPatCharRange()
 * @model
 * @generated
 */
public interface PatCharRange extends PatRange
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(CharLit)
   * @see de.redoxi.ruste.rust.RustPackage#getPatCharRange_Start()
   * @model containment="true"
   * @generated
   */
  CharLit getStart();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatCharRange#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(CharLit value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(CharLit)
   * @see de.redoxi.ruste.rust.RustPackage#getPatCharRange_End()
   * @model containment="true"
   * @generated
   */
  CharLit getEnd();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatCharRange#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(CharLit value);

} // PatCharRange
