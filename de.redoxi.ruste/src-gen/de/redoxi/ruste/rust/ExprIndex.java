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
 *   <li>{@link de.redoxi.ruste.rust.ExprIndex#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprIndex#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprIndex()
 * @model
 * @generated
 */
public interface ExprIndex extends ExprRValue1
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
   * @see #setExpr(ExprLeaf)
   * @see de.redoxi.ruste.rust.RustPackage#getExprIndex_Expr()
   * @model containment="true"
   * @generated
   */
  ExprLeaf getExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprIndex#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ExprLeaf value);

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
