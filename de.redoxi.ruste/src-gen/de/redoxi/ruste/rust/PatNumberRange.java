/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pat Number Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PatNumberRange#getStart <em>Start</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.PatNumberRange#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPatNumberRange()
 * @model
 * @generated
 */
public interface PatNumberRange extends PatRange
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
   * @see #setStart(NumberLit)
   * @see de.redoxi.ruste.rust.RustPackage#getPatNumberRange_Start()
   * @model containment="true"
   * @generated
   */
  NumberLit getStart();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatNumberRange#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(NumberLit value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(NumberLit)
   * @see de.redoxi.ruste.rust.RustPackage#getPatNumberRange_End()
   * @model containment="true"
   * @generated
   */
  NumberLit getEnd();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PatNumberRange#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(NumberLit value);

} // PatNumberRange
