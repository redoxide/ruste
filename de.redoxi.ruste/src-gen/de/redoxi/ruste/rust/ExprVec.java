/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Vec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprVec#isMutable <em>Mutable</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprVec#getLenExpr <em>Len Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprVec()
 * @model
 * @generated
 */
public interface ExprVec extends ExprPrimary
{
  /**
   * Returns the value of the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutable</em>' attribute.
   * @see #setMutable(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getExprVec_Mutable()
   * @model
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprVec#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

  /**
   * Returns the value of the '<em><b>Len Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Len Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Len Expr</em>' containment reference.
   * @see #setLenExpr(Expr)
   * @see de.redoxi.ruste.rust.RustPackage#getExprVec_LenExpr()
   * @model containment="true"
   * @generated
   */
  Expr getLenExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprVec#getLenExpr <em>Len Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Len Expr</em>' containment reference.
   * @see #getLenExpr()
   * @generated
   */
  void setLenExpr(Expr value);

} // ExprVec
