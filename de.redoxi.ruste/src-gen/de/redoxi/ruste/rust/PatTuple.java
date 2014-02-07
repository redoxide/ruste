/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pat Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PatTuple#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPatTuple()
 * @model
 * @generated
 */
public interface PatTuple extends Pat
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.Pat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getPatTuple_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Pat> getPatterns();

} // PatTuple
