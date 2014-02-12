/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprGroup;
import de.redoxi.ruste.rust.ExprLeaf;
import de.redoxi.ruste.rust.ExprRValue;
import de.redoxi.ruste.rust.ExprTuple;
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
 * An implementation of the model object '<em><b>Expr Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprTupleImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprTupleImpl#getTuple <em>Tuple</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprTupleImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprTupleImpl extends ExprPathImpl implements ExprTuple
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The cached value of the '{@link #getTuple() <em>Tuple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTuple()
   * @generated
   * @ordered
   */
  protected ExprTuple tuple;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprTupleImpl()
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
    return RustPackage.Literals.EXPR_TUPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_TUPLE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_TUPLE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_TUPLE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_TUPLE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTuple getTuple()
  {
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTuple(ExprTuple newTuple, NotificationChain msgs)
  {
    ExprTuple oldTuple = tuple;
    tuple = newTuple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_TUPLE__TUPLE, oldTuple, newTuple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuple(ExprTuple newTuple)
  {
    if (newTuple != tuple)
    {
      NotificationChain msgs = null;
      if (tuple != null)
        msgs = ((InternalEObject)tuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_TUPLE__TUPLE, null, msgs);
      if (newTuple != null)
        msgs = ((InternalEObject)newTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_TUPLE__TUPLE, null, msgs);
      msgs = basicSetTuple(newTuple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_TUPLE__TUPLE, newTuple, newTuple));
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
      exprs = new EObjectContainmentEList<Expr>(Expr.class, this, RustPackage.EXPR_TUPLE__EXPRS);
    }
    return exprs;
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
      case RustPackage.EXPR_TUPLE__EXPR:
        return basicSetExpr(null, msgs);
      case RustPackage.EXPR_TUPLE__TUPLE:
        return basicSetTuple(null, msgs);
      case RustPackage.EXPR_TUPLE__EXPRS:
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
      case RustPackage.EXPR_TUPLE__EXPR:
        return getExpr();
      case RustPackage.EXPR_TUPLE__TUPLE:
        return getTuple();
      case RustPackage.EXPR_TUPLE__EXPRS:
        return getExprs();
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
      case RustPackage.EXPR_TUPLE__EXPR:
        setExpr((Expr)newValue);
        return;
      case RustPackage.EXPR_TUPLE__TUPLE:
        setTuple((ExprTuple)newValue);
        return;
      case RustPackage.EXPR_TUPLE__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends Expr>)newValue);
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
      case RustPackage.EXPR_TUPLE__EXPR:
        setExpr((Expr)null);
        return;
      case RustPackage.EXPR_TUPLE__TUPLE:
        setTuple((ExprTuple)null);
        return;
      case RustPackage.EXPR_TUPLE__EXPRS:
        getExprs().clear();
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
      case RustPackage.EXPR_TUPLE__EXPR:
        return expr != null;
      case RustPackage.EXPR_TUPLE__TUPLE:
        return tuple != null;
      case RustPackage.EXPR_TUPLE__EXPRS:
        return exprs != null && !exprs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Expr.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprRValue.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprLeaf.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprGroup.class)
    {
      switch (derivedFeatureID)
      {
        case RustPackage.EXPR_TUPLE__EXPR: return RustPackage.EXPR_GROUP__EXPR;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Expr.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprRValue.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprLeaf.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprGroup.class)
    {
      switch (baseFeatureID)
      {
        case RustPackage.EXPR_GROUP__EXPR: return RustPackage.EXPR_TUPLE__EXPR;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExprTupleImpl
