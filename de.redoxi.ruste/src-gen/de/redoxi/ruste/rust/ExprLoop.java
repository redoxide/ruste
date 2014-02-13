/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprLoop#getLifetime <em>Lifetime</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprLoop#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprLoop()
 * @model
 * @generated
 */
public interface ExprLoop extends ExprLeaf
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
   * @see de.redoxi.ruste.rust.RustPackage#getExprLoop_Lifetime()
   * @model
   * @generated
   */
  String getLifetime();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprLoop#getLifetime <em>Lifetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lifetime</em>' attribute.
   * @see #getLifetime()
   * @generated
   */
  void setLifetime(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see de.redoxi.ruste.rust.RustPackage#getExprLoop_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprLoop#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // ExprLoop
