/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Additive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprAdditive#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprAdditive#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprAdditive()
 * @model
 * @generated
 */
public interface ExprAdditive extends AdditionOrSubtraction
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.As}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExprAdditive_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<As> getExprs();

  /**
   * Returns the value of the '<em><b>Ops</b></em>' attribute list.
   * The list contents are of type {@link de.redoxi.ruste.rust.AdditiveOp}.
   * The literals are from the enumeration {@link de.redoxi.ruste.rust.AdditiveOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ops</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ops</em>' attribute list.
   * @see de.redoxi.ruste.rust.AdditiveOp
   * @see de.redoxi.ruste.rust.RustPackage#getExprAdditive_Ops()
   * @model unique="false"
   * @generated
   */
  EList<AdditiveOp> getOps();

} // ExprAdditive
