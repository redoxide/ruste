/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.StructField#getVis <em>Vis</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.StructField#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.StructField#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getStructField()
 * @model
 * @generated
 */
public interface StructField extends EObject
{
  /**
   * Returns the value of the '<em><b>Vis</b></em>' attribute.
   * The literals are from the enumeration {@link de.redoxi.ruste.rust.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vis</em>' attribute.
   * @see de.redoxi.ruste.rust.Visibility
   * @see #setVis(Visibility)
   * @see de.redoxi.ruste.rust.RustPackage#getStructField_Vis()
   * @model
   * @generated
   */
  Visibility getVis();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.StructField#getVis <em>Vis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vis</em>' attribute.
   * @see de.redoxi.ruste.rust.Visibility
   * @see #getVis()
   * @generated
   */
  void setVis(Visibility value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' attribute.
   * @see #setIdent(String)
   * @see de.redoxi.ruste.rust.RustPackage#getStructField_Ident()
   * @model
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.StructField#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see de.redoxi.ruste.rust.RustPackage#getStructField_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.StructField#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // StructField
