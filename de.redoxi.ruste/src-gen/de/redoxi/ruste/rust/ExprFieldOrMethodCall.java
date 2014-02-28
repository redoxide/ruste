/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Field Or Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprFieldOrMethodCall#getName <em>Name</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprFieldOrMethodCall#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprFieldOrMethodCall()
 * @model
 * @generated
 */
public interface ExprFieldOrMethodCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.redoxi.ruste.rust.RustPackage#getExprFieldOrMethodCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprFieldOrMethodCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(ExprFnCallArgs)
   * @see de.redoxi.ruste.rust.RustPackage#getExprFieldOrMethodCall_Args()
   * @model containment="true"
   * @generated
   */
  ExprFnCallArgs getArgs();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprFieldOrMethodCall#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(ExprFnCallArgs value);

} // ExprFieldOrMethodCall
