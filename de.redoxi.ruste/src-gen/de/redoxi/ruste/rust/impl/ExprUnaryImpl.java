/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ExprUnary;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Unary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExprUnaryImpl extends DivisionMultiplicationOrModuloImpl implements ExprUnary
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprUnaryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RustPackage.Literals.EXPR_UNARY;
  }

} //ExprUnaryImpl
