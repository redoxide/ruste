/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pat Struct Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.PatStructEnum#getFieldPatterns <em>Field Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getPatStructEnum()
 * @model
 * @generated
 */
public interface PatStructEnum extends PatEnum
{
  /**
   * Returns the value of the '<em><b>Field Patterns</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.FieldPat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Patterns</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getPatStructEnum_FieldPatterns()
   * @model containment="true"
   * @generated
   */
  EList<FieldPat> getFieldPatterns();

} // PatStructEnum
