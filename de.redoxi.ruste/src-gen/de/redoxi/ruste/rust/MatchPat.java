/**
 */
package de.redoxi.ruste.rust;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Pat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.MatchPat#getPat <em>Pat</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.MatchPat#getEndPat <em>End Pat</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.MatchPat#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.redoxi.ruste.rust.RustPackage#getMatchPat()
 * @model
 * @generated
 */
public interface MatchPat extends EObject
{
  /**
   * Returns the value of the '<em><b>Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pat</em>' containment reference.
   * @see #setPat(Pat)
   * @see de.redoxi.ruste.rust.RustPackage#getMatchPat_Pat()
   * @model containment="true"
   * @generated
   */
  Pat getPat();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.MatchPat#getPat <em>Pat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pat</em>' containment reference.
   * @see #getPat()
   * @generated
   */
  void setPat(Pat value);

  /**
   * Returns the value of the '<em><b>End Pat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Pat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Pat</em>' containment reference.
   * @see #setEndPat(Pat)
   * @see de.redoxi.ruste.rust.RustPackage#getMatchPat_EndPat()
   * @model containment="true"
   * @generated
   */
  Pat getEndPat();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.MatchPat#getEndPat <em>End Pat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Pat</em>' containment reference.
   * @see #getEndPat()
   * @generated
   */
  void setEndPat(Pat value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see de.redoxi.ruste.rust.RustPackage#getMatchPat_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link de.redoxi.ruste.rust.MatchPat#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // MatchPat
