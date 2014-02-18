/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Glob</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PathGlob#getHead <em>Head</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.PathGlob#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPathGlob()
 * @model
 * @generated
 */
public interface PathGlob extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' attribute list.
   * @see de.redoxi.ruste.rust.RustPackage#getPathGlob_Head()
   * @model unique="false"
   * @generated
   */
  EList<String> getHead();

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(PathGlob)
   * @see de.redoxi.ruste.rust.RustPackage#getPathGlob_Tail()
   * @model containment="true"
   * @generated
   */
  PathGlob getTail();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.PathGlob#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(PathGlob value);

} // PathGlob
