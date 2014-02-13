/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.Modulo#getLeft <em>Left</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.Modulo#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends DivisionMultiplicationOrModulo
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ExprLeaf)
   * @see de.redoxi.ruste.rust.RustPackage#getModulo_Left()
   * @model containment="true"
   * @generated
   */
  ExprLeaf getLeft();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.Modulo#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ExprLeaf value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ExprLeaf)
   * @see de.redoxi.ruste.rust.RustPackage#getModulo_Right()
   * @model containment="true"
   * @generated
   */
  ExprLeaf getRight();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.Modulo#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ExprLeaf value);

} // Modulo
