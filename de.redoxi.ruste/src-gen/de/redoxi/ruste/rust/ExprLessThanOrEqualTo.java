/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Less Than Or Equal To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getLeft <em>Left</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprLessThanOrEqualTo()
 * @model
 * @generated
 */
public interface ExprLessThanOrEqualTo extends ComparisonOperators
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
   * @see #setLeft(BitwiseOr)
   * @see de.redoxi.ruste.rust.RustPackage#getExprLessThanOrEqualTo_Left()
   * @model containment="true"
   * @generated
   */
  BitwiseOr getLeft();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BitwiseOr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BitwiseOr)
   * @see de.redoxi.ruste.rust.RustPackage#getExprLessThanOrEqualTo_Right()
   * @model containment="true"
   * @generated
   */
  BitwiseOr getRight();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BitwiseOr value);

} // ExprLessThanOrEqualTo
