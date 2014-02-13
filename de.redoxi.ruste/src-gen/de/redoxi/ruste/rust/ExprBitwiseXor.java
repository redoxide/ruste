/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Bitwise Xor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprBitwiseXor#getLeft <em>Left</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprBitwiseXor#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprBitwiseXor()
 * @model
 * @generated
 */
public interface ExprBitwiseXor extends BitwiseXor
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
   * @see #setLeft(BitwiseAnd)
   * @see de.redoxi.ruste.rust.RustPackage#getExprBitwiseXor_Left()
   * @model containment="true"
   * @generated
   */
  BitwiseAnd getLeft();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprBitwiseXor#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BitwiseAnd value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BitwiseAnd)
   * @see de.redoxi.ruste.rust.RustPackage#getExprBitwiseXor_Right()
   * @model containment="true"
   * @generated
   */
  BitwiseAnd getRight();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprBitwiseXor#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BitwiseAnd value);

} // ExprBitwiseXor
