/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprBreak#getLifetime <em>Lifetime</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprBreak()
 * @model
 * @generated
 */
public interface ExprBreak extends Expr
{
  /**
   * Returns the value of the '<em><b>Lifetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifetime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifetime</em>' attribute.
   * @see #setLifetime(String)
   * @see de.redoxi.ruste.rust.RustPackage#getExprBreak_Lifetime()
   * @model
   * @generated
   */
  String getLifetime();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprBreak#getLifetime <em>Lifetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lifetime</em>' attribute.
   * @see #getLifetime()
   * @generated
   */
  void setLifetime(String value);

} // ExprBreak
