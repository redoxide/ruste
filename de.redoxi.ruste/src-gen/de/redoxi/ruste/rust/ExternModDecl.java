/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extern Mod Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ExternModDecl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ExternModDecl#getExternalIdent <em>External Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getExternModDecl()
 * @model
 * @generated
 */
public interface ExternModDecl extends ViewItem
{
  /**
   * Returns the value of the '<em><b>Attrs</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.LinkAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrs</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getExternModDecl_Attrs()
   * @model containment="true"
   * @generated
   */
  EList<LinkAttr> getAttrs();

  /**
   * Returns the value of the '<em><b>External Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Ident</em>' containment reference.
   * @see #setExternalIdent(StringLit)
   * @see de.redoxi.ruste.rust.RustPackage#getExternModDecl_ExternalIdent()
   * @model containment="true"
   * @generated
   */
  StringLit getExternalIdent();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ExternModDecl#getExternalIdent <em>External Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Ident</em>' containment reference.
   * @see #getExternalIdent()
   * @generated
   */
  void setExternalIdent(StringLit value);

} // ExternModDecl
