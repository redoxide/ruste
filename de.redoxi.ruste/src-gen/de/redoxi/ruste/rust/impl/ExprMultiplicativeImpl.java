/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ExprMultiplicative;
import de.redoxi.ruste.rust.ExprUnary;
import de.redoxi.ruste.rust.MultiplicativeOp;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Multiplicative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprMultiplicativeImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprMultiplicativeImpl#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprMultiplicativeImpl extends DivisionMultiplicationOrModuloImpl implements ExprMultiplicative
{
  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<ExprUnary> exprs;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<MultiplicativeOp> ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprMultiplicativeImpl()
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
    return RustPackage.Literals.EXPR_MULTIPLICATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprUnary> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<ExprUnary>(ExprUnary.class, this, RustPackage.EXPR_MULTIPLICATIVE__EXPRS);
    }
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultiplicativeOp> getOps()
  {
    if (ops == null)
    {
      ops = new EDataTypeEList<MultiplicativeOp>(MultiplicativeOp.class, this, RustPackage.EXPR_MULTIPLICATIVE__OPS);
    }
    return ops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_MULTIPLICATIVE__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_MULTIPLICATIVE__EXPRS:
        return getExprs();
      case RustPackage.EXPR_MULTIPLICATIVE__OPS:
        return getOps();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_MULTIPLICATIVE__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends ExprUnary>)newValue);
        return;
      case RustPackage.EXPR_MULTIPLICATIVE__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends MultiplicativeOp>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_MULTIPLICATIVE__EXPRS:
        getExprs().clear();
        return;
      case RustPackage.EXPR_MULTIPLICATIVE__OPS:
        getOps().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_MULTIPLICATIVE__EXPRS:
        return exprs != null && !exprs.isEmpty();
      case RustPackage.EXPR_MULTIPLICATIVE__OPS:
        return ops != null && !ops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ops: ");
    result.append(ops);
    result.append(')');
    return result.toString();
  }

} //ExprMultiplicativeImpl
