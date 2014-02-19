/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExternBlock#getAbi <em>Abi</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExternBlock#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExternBlock()
 * @model
 * @generated
 */
public interface ExternBlock extends Item
{
  /**
   * Returns the value of the '<em><b>Abi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abi</em>' attribute.
   * @see #setAbi(String)
   * @see de.redoxi.ruste.rust.RustPackage#getExternBlock_Abi()
   * @model
   * @generated
   */
  String getAbi();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExternBlock#getAbi <em>Abi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abi</em>' attribute.
   * @see #getAbi()
   * @generated
   */
  void setAbi(String value);

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.ForeignFn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExternBlock_Functions()
   * @model containment="true"
   * @generated
   */
  EList<ForeignFn> getFunctions();

} // ExternBlock
