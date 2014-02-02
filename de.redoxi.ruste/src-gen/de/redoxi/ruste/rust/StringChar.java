/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.StringChar#getChar <em>Char</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.StringChar#getEscapedChar <em>Escaped Char</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getStringChar()
 * @model
 * @generated
 */
public interface StringChar extends EObject
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
   * @see de.redoxi.ruste.rust.RustPackage#getStringChar_Char()
   * @model
   * @generated
   */
  String getChar();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.StringChar#getChar <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Char</em>' attribute.
   * @see #getChar()
   * @generated
   */
  void setChar(String value);

  /**
   * Returns the value of the '<em><b>Escaped Char</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Escaped Char</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Escaped Char</em>' containment reference.
   * @see #setEscapedChar(EscapedChar)
   * @see de.redoxi.ruste.rust.RustPackage#getStringChar_EscapedChar()
   * @model containment="true"
   * @generated
   */
  EscapedChar getEscapedChar();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.StringChar#getEscapedChar <em>Escaped Char</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Escaped Char</em>' containment reference.
   * @see #getEscapedChar()
   * @generated
   */
  void setEscapedChar(EscapedChar value);

} // StringChar
