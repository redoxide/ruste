/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Fn Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprFnCall#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprFnCall#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprFnCall()
 * @model
 * @generated
 */
public interface ExprFnCall extends ExprLeaf
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ExprPrimary)
   * @see de.redoxi.ruste.rust.RustPackage#getExprFnCall_Expr()
   * @model containment="true"
   * @generated
   */
  ExprPrimary getExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprFnCall#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ExprPrimary value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(ExprFnCallArgs)
   * @see de.redoxi.ruste.rust.RustPackage#getExprFnCall_Tail()
   * @model containment="true"
   * @generated
   */
  ExprFnCallArgs getTail();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprFnCall#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(ExprFnCallArgs value);

} // ExprFnCall
