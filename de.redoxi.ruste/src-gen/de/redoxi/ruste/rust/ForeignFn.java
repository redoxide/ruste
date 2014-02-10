/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Fn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ForeignFn#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ForeignFn#getArgs <em>Args</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ForeignFn#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getForeignFn()
 * @model
 * @generated
 */
public interface ForeignFn extends EObject
{
  /**
   * Returns the value of the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' attribute.
   * @see #setIdent(String)
   * @see de.redoxi.ruste.rust.RustPackage#getForeignFn_Ident()
   * @model
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ForeignFn#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.Arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getForeignFn_Args()
   * @model containment="true"
   * @generated
   */
  EList<Arg> getArgs();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(Type)
   * @see de.redoxi.ruste.rust.RustPackage#getForeignFn_ReturnType()
   * @model containment="true"
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ForeignFn#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

} // ForeignFn
