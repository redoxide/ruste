/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Right Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprRightShift#getLeft <em>Left</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprRightShift#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprRightShift()
 * @model
 * @generated
 */
public interface ExprRightShift extends ShiftOperator
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(AdditionOrSubtraction)
   * @see de.redoxi.ruste.rust.RustPackage#getExprRightShift_Left()
   * @model containment="true"
   * @generated
   */
  AdditionOrSubtraction getLeft();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprRightShift#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AdditionOrSubtraction value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AdditionOrSubtraction)
   * @see de.redoxi.ruste.rust.RustPackage#getExprRightShift_Right()
   * @model containment="true"
   * @generated
   */
  AdditionOrSubtraction getRight();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprRightShift#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AdditionOrSubtraction value);

} // ExprRightShift
