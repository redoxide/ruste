/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprAssign#getLeft <em>Left</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprAssign#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprAssign()
 * @model
 * @generated
 */
public interface ExprAssign extends Assign
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
   * @see #setLeft(ExprLValue)
   * @see de.redoxi.ruste.rust.RustPackage#getExprAssign_Left()
   * @model containment="true"
   * @generated
   */
  ExprLValue getLeft();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprAssign#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ExprLValue value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ExprUnary)
   * @see de.redoxi.ruste.rust.RustPackage#getExprAssign_Right()
   * @model containment="true"
   * @generated
   */
  ExprUnary getRight();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprAssign#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ExprUnary value);

} // ExprAssign
