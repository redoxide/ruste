/**
 */
package de.redoxi.ruste.rust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.UseDecl#getVis <em>Vis</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.UseDecl#getExternPath <em>Extern Path</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.UseDecl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getUseDecl()
 * @model
 * @generated
 */
public interface UseDecl extends ViewItem
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
   * @see de.redoxi.ruste.rust.RustPackage#getUseDecl_Vis()
   * @model
   * @generated
   */
  Visibility getVis();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.UseDecl#getVis <em>Vis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vis</em>' attribute.
   * @see de.redoxi.ruste.rust.Visibility
   * @see #getVis()
   * @generated
   */
  void setVis(Visibility value);

  /**
   * Returns the value of the '<em><b>Extern Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extern Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extern Path</em>' containment reference.
   * @see #setExternPath(TypePath)
   * @see de.redoxi.ruste.rust.RustPackage#getUseDecl_ExternPath()
   * @model containment="true"
   * @generated
   */
  TypePath getExternPath();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.UseDecl#getExternPath <em>Extern Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extern Path</em>' containment reference.
   * @see #getExternPath()
   * @generated
   */
  void setExternPath(TypePath value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(PathGlob)
   * @see de.redoxi.ruste.rust.RustPackage#getUseDecl_Path()
   * @model containment="true"
   * @generated
   */
  PathGlob getPath();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.UseDecl#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(PathGlob value);

} // UseDecl
