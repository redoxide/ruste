/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.LiteralAttr#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getLiteralAttr()
 * @model
 * @generated
 */
public interface LiteralAttr extends Attr
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Literal)
   * @see de.redoxi.ruste.rust.RustPackage#getLiteralAttr_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.LiteralAttr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

} // LiteralAttr
