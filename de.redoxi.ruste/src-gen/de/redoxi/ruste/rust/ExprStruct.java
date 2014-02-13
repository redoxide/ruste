/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExprStruct#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprStruct#getFields <em>Fields</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExprStruct#getBaseExpr <em>Base Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExprStruct()
 * @model
 * @generated
 */
public interface ExprStruct extends ExprLeaf, ExprPathHead
{
  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(ExprStruct)
   * @see de.redoxi.ruste.rust.RustPackage#getExprStruct_Struct()
   * @model containment="true"
   * @generated
   */
  ExprStruct getStruct();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprStruct#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(ExprStruct value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.StructField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExprStruct_Fields()
   * @model containment="true"
   * @generated
   */
  EList<StructField> getFields();

  /**
   * Returns the value of the '<em><b>Base Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Expr</em>' containment reference.
   * @see #setBaseExpr(Expr)
   * @see de.redoxi.ruste.rust.RustPackage#getExprStruct_BaseExpr()
   * @model containment="true"
   * @generated
   */
  Expr getBaseExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExprStruct#getBaseExpr <em>Base Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Expr</em>' containment reference.
   * @see #getBaseExpr()
   * @generated
   */
  void setBaseExpr(Expr value);

} // ExprStruct
