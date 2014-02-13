/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.TypePath#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.TypePath#getLifetimes <em>Lifetimes</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.TypePath#getGenericTypes <em>Generic Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getTypePath()
 * @model
 * @generated
 */
public interface TypePath extends EObject
{
  /**
   * Returns the value of the '<em><b>Segments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' attribute list.
   * @see de.redoxi.ruste.rust.RustPackage#getTypePath_Segments()
   * @model unique="false"
   * @generated
   */
  EList<String> getSegments();

  /**
   * Returns the value of the '<em><b>Lifetimes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifetimes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifetimes</em>' attribute list.
   * @see de.redoxi.ruste.rust.RustPackage#getTypePath_Lifetimes()
   * @model unique="false"
   * @generated
   */
  EList<String> getLifetimes();

  /**
   * Returns the value of the '<em><b>Generic Types</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Types</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getTypePath_GenericTypes()
   * @model containment="true"
   * @generated
   */
  EList<Type> getGenericTypes();

} // TypePath
