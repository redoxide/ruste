/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Fn Call Args</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprFnCallArgs#getArgs <em>Args</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprFnCallArgs#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprFnCallArgs()
 * @model
 * @generated
 */
public interface ExprFnCallArgs extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExprFnCallArgs_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getArgs();

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
   * @see de.redoxi.ruste.rust.RustPackage#getExprFnCallArgs_Tail()
   * @model containment="true"
   * @generated
   */
  ExprFnCallArgs getTail();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprFnCallArgs#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(ExprFnCallArgs value);

} // ExprFnCallArgs
