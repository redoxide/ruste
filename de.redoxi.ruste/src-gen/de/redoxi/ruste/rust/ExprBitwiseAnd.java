/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Bitwise And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprBitwiseAnd#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprBitwiseAnd()
 * @model
 * @generated
 */
public interface ExprBitwiseAnd extends BitwiseAnd
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ShiftOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExprBitwiseAnd_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<ShiftOperator> getExprs();

} // ExprBitwiseAnd
