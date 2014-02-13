/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprVec;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Vec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprVecImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprVecImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprVecImpl#getLenExpr <em>Len Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprVecImpl extends ExprLeafImpl implements ExprVec
{
  /**
   * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected static final boolean MUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected boolean mutable = MUTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<Expr> exprs;

  /**
   * The cached value of the '{@link #getLenExpr() <em>Len Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLenExpr()
   * @generated
   * @ordered
   */
  protected Expr lenExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprVecImpl()
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
    return RustPackage.Literals.EXPR_VEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMutable()
  {
    return mutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMutable(boolean newMutable)
  {
    boolean oldMutable = mutable;
    mutable = newMutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_VEC__MUTABLE, oldMutable, mutable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<Expr>(Expr.class, this, RustPackage.EXPR_VEC__EXPRS);
    }
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLenExpr()
  {
    return lenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLenExpr(Expr newLenExpr, NotificationChain msgs)
  {
    Expr oldLenExpr = lenExpr;
    lenExpr = newLenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_VEC__LEN_EXPR, oldLenExpr, newLenExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLenExpr(Expr newLenExpr)
  {
    if (newLenExpr != lenExpr)
    {
      NotificationChain msgs = null;
      if (lenExpr != null)
        msgs = ((InternalEObject)lenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_VEC__LEN_EXPR, null, msgs);
      if (newLenExpr != null)
        msgs = ((InternalEObject)newLenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_VEC__LEN_EXPR, null, msgs);
      msgs = basicSetLenExpr(newLenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_VEC__LEN_EXPR, newLenExpr, newLenExpr));
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
      case RustPackage.EXPR_VEC__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
      case RustPackage.EXPR_VEC__LEN_EXPR:
        return basicSetLenExpr(null, msgs);
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
      case RustPackage.EXPR_VEC__MUTABLE:
        return isMutable();
      case RustPackage.EXPR_VEC__EXPRS:
        return getExprs();
      case RustPackage.EXPR_VEC__LEN_EXPR:
        return getLenExpr();
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
      case RustPackage.EXPR_VEC__MUTABLE:
        setMutable((Boolean)newValue);
        return;
      case RustPackage.EXPR_VEC__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends Expr>)newValue);
        return;
      case RustPackage.EXPR_VEC__LEN_EXPR:
        setLenExpr((Expr)newValue);
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
      case RustPackage.EXPR_VEC__MUTABLE:
        setMutable(MUTABLE_EDEFAULT);
        return;
      case RustPackage.EXPR_VEC__EXPRS:
        getExprs().clear();
        return;
      case RustPackage.EXPR_VEC__LEN_EXPR:
        setLenExpr((Expr)null);
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
      case RustPackage.EXPR_VEC__MUTABLE:
        return mutable != MUTABLE_EDEFAULT;
      case RustPackage.EXPR_VEC__EXPRS:
        return exprs != null && !exprs.isEmpty();
      case RustPackage.EXPR_VEC__LEN_EXPR:
        return lenExpr != null;
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
    result.append(" (mutable: ");
    result.append(mutable);
    result.append(')');
    return result.toString();
  }

} //ExprVecImpl
