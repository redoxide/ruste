/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprIndex;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprIndexImpl#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprIndexImpl extends ExprLValueImpl implements ExprIndex
{
  /**
   * The cached value of the '{@link #getIndexExpr() <em>Index Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexExpr()
   * @generated
   * @ordered
   */
  protected Expr indexExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprIndexImpl()
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
    return RustPackage.Literals.EXPR_INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getIndexExpr()
  {
    return indexExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexExpr(Expr newIndexExpr, NotificationChain msgs)
  {
    Expr oldIndexExpr = indexExpr;
    indexExpr = newIndexExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_INDEX__INDEX_EXPR, oldIndexExpr, newIndexExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexExpr(Expr newIndexExpr)
  {
    if (newIndexExpr != indexExpr)
    {
      NotificationChain msgs = null;
      if (indexExpr != null)
        msgs = ((InternalEObject)indexExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_INDEX__INDEX_EXPR, null, msgs);
      if (newIndexExpr != null)
        msgs = ((InternalEObject)newIndexExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_INDEX__INDEX_EXPR, null, msgs);
      msgs = basicSetIndexExpr(newIndexExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_INDEX__INDEX_EXPR, newIndexExpr, newIndexExpr));
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
      case RustPackage.EXPR_INDEX__INDEX_EXPR:
        return basicSetIndexExpr(null, msgs);
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
      case RustPackage.EXPR_INDEX__INDEX_EXPR:
        return getIndexExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RustPackage.EXPR_INDEX__INDEX_EXPR:
        setIndexExpr((Expr)newValue);
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
      case RustPackage.EXPR_INDEX__INDEX_EXPR:
        setIndexExpr((Expr)null);
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
      case RustPackage.EXPR_INDEX__INDEX_EXPR:
        return indexExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprIndexImpl
