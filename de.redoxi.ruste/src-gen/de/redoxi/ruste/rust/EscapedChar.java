/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escaped Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.EscapedChar#getChar <em>Char</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getEscapedChar()
 * @model
 * @generated
 */
public interface EscapedChar extends EObject
{
  /**
   * Returns the value of the '<em><b>Char</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Char</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Char</em>' attribute.
   * @see #setChar(String)
   * @see de.redoxi.ruste.rust.RustPackage#getEscapedChar_Char()
   * @model
   * @generated
   */
  String getChar();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.EscapedChar#getChar <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Char</em>' attribute.
   * @see #getChar()
   * @generated
   */
  void setChar(String value);

} // EscapedChar
