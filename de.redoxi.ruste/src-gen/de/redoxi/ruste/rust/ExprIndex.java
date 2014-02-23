/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprIndex#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprIndex()
 * @model
 * @generated
 */
public interface ExprIndex extends ExprLValue
{
  /**
   * Returns the value of the '<em><b>Index Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Expr</em>' containment reference.
   * @see #setIndexExpr(Expr)
   * @see de.redoxi.ruste.rust.RustPackage#getExprIndex_IndexExpr()
   * @model containment="true"
   * @generated
   */
  Expr getIndexExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprIndex#getIndexExpr <em>Index Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Expr</em>' containment reference.
   * @see #getIndexExpr()
   * @generated
   */
  void setIndexExpr(Expr value);

} // ExprIndex
