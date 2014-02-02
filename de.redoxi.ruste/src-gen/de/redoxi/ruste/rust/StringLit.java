/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.StringLit#getChars <em>Chars</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getStringLit()
 * @model
 * @generated
 */
public interface StringLit extends Literal
{
  /**
   * Returns the value of the '<em><b>Chars</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.StringChar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chars</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getStringLit_Chars()
   * @model containment="true"
   * @generated
   */
  EList<StringChar> getChars();

} // StringLit
