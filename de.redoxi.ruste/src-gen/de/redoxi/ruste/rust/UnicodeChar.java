/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicode Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.UnicodeChar#getDigits <em>Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getUnicodeChar()
 * @model
 * @generated
 */
public interface UnicodeChar extends EscapedChar
{
  /**
   * Returns the value of the '<em><b>Digits</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digits</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digits</em>' attribute list.
   * @see de.redoxi.ruste.rust.RustPackage#getUnicodeChar_Digits()
   * @model unique="false"
   * @generated
   */
  EList<String> getDigits();

} // UnicodeChar
