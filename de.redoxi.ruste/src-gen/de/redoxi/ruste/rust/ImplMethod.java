/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impl Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#isUnsafe <em>Unsafe</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#isExtern <em>Extern</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#getParams <em>Params</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#getArgs <em>Args</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.ImplMethod#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getImplMethod()
 * @model
 * @generated
 */
public interface ImplMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Unsafe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsafe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsafe</em>' attribute.
   * @see #setUnsafe(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Unsafe()
   * @model
   * @generated
   */
  boolean isUnsafe();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplMethod#isUnsafe <em>Unsafe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsafe</em>' attribute.
   * @see #isUnsafe()
   * @generated
   */
  void setUnsafe(boolean value);

  /**
   * Returns the value of the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extern</em>' attribute.
   * @see #setExtern(boolean)
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Extern()
   * @model
   * @generated
   */
  boolean isExtern();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplMethod#isExtern <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extern</em>' attribute.
   * @see #isExtern()
   * @generated
   */
  void setExtern(boolean value);

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
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Ident()
   * @model
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplMethod#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.GenericParamDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<GenericParamDecl> getParams();

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link de.redoxi.ruste.rust.Arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Args()
   * @model containment="true"
   * @generated
   */
  EList<Arg> getArgs();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(Type)
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_ReturnType()
   * @model containment="true"
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplMethod#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see de.redoxi.ruste.rust.RustPackage#getImplMethod_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.ImplMethod#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

} // ImplMethod
