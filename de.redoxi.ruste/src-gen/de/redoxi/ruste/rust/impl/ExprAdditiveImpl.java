/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.AdditiveOp;
import de.redoxi.ruste.rust.As;
import de.redoxi.ruste.rust.ExprAdditive;
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
 * An implementation of the model object '<em><b>Expr Additive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprAdditiveImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprAdditiveImpl#getOps <em>Ops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprAdditiveImpl extends AdditionOrSubtractionImpl implements ExprAdditive
{
  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<As> exprs;

  /**
   * The cached value of the '{@link #getOps() <em>Ops</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOps()
   * @generated
   * @ordered
   */
  protected EList<AdditiveOp> ops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprAdditiveImpl()
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
    return RustPackage.Literals.EXPR_ADDITIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<As> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<As>(As.class, this, RustPackage.EXPR_ADDITIVE__EXPRS);
    }
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdditiveOp> getOps()
  {
    if (ops == null)
    {
      ops = new EDataTypeEList<AdditiveOp>(AdditiveOp.class, this, RustPackage.EXPR_ADDITIVE__OPS);
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
      case RustPackage.EXPR_ADDITIVE__EXPRS:
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
      case RustPackage.EXPR_ADDITIVE__EXPRS:
        return getExprs();
      case RustPackage.EXPR_ADDITIVE__OPS:
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
      case RustPackage.EXPR_ADDITIVE__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends As>)newValue);
        return;
      case RustPackage.EXPR_ADDITIVE__OPS:
        getOps().clear();
        getOps().addAll((Collection<? extends AdditiveOp>)newValue);
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
      case RustPackage.EXPR_ADDITIVE__EXPRS:
        getExprs().clear();
        return;
      case RustPackage.EXPR_ADDITIVE__OPS:
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
      case RustPackage.EXPR_ADDITIVE__EXPRS:
        return exprs != null && !exprs.isEmpty();
      case RustPackage.EXPR_ADDITIVE__OPS:
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

} //ExprAdditiveImpl
