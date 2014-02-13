/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.MatchPat;
import de.redoxi.ruste.rust.Pat;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Pat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.MatchPatImpl#getPat <em>Pat</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.MatchPatImpl#getEndPat <em>End Pat</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.MatchPatImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchPatImpl extends MinimalEObjectImpl.Container implements MatchPat
{
  /**
   * The cached value of the '{@link #getPat() <em>Pat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPat()
   * @generated
   * @ordered
   */
  protected Pat pat;

  /**
   * The cached value of the '{@link #getEndPat() <em>End Pat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPat()
   * @generated
   * @ordered
   */
  protected Pat endPat;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchPatImpl()
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
    return RustPackage.Literals.MATCH_PAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pat getPat()
  {
    return pat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPat(Pat newPat, NotificationChain msgs)
  {
    Pat oldPat = pat;
    pat = newPat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__PAT, oldPat, newPat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPat(Pat newPat)
  {
    if (newPat != pat)
    {
      NotificationChain msgs = null;
      if (pat != null)
        msgs = ((InternalEObject)pat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__PAT, null, msgs);
      if (newPat != null)
        msgs = ((InternalEObject)newPat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__PAT, null, msgs);
      msgs = basicSetPat(newPat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__PAT, newPat, newPat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pat getEndPat()
  {
    return endPat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndPat(Pat newEndPat, NotificationChain msgs)
  {
    Pat oldEndPat = endPat;
    endPat = newEndPat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__END_PAT, oldEndPat, newEndPat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndPat(Pat newEndPat)
  {
    if (newEndPat != endPat)
    {
      NotificationChain msgs = null;
      if (endPat != null)
        msgs = ((InternalEObject)endPat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__END_PAT, null, msgs);
      if (newEndPat != null)
        msgs = ((InternalEObject)newEndPat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__END_PAT, null, msgs);
      msgs = basicSetEndPat(newEndPat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__END_PAT, newEndPat, newEndPat));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.MATCH_PAT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.MATCH_PAT__EXPR, newExpr, newExpr));
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
      case RustPackage.MATCH_PAT__PAT:
        return basicSetPat(null, msgs);
      case RustPackage.MATCH_PAT__END_PAT:
        return basicSetEndPat(null, msgs);
      case RustPackage.MATCH_PAT__EXPR:
        return basicSetExpr(null, msgs);
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
      case RustPackage.MATCH_PAT__PAT:
        return getPat();
      case RustPackage.MATCH_PAT__END_PAT:
        return getEndPat();
      case RustPackage.MATCH_PAT__EXPR:
        return getExpr();
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
      case RustPackage.MATCH_PAT__PAT:
        setPat((Pat)newValue);
        return;
      case RustPackage.MATCH_PAT__END_PAT:
        setEndPat((Pat)newValue);
        return;
      case RustPackage.MATCH_PAT__EXPR:
        setExpr((Expr)newValue);
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
      case RustPackage.MATCH_PAT__PAT:
        setPat((Pat)null);
        return;
      case RustPackage.MATCH_PAT__END_PAT:
        setEndPat((Pat)null);
        return;
      case RustPackage.MATCH_PAT__EXPR:
        setExpr((Expr)null);
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
      case RustPackage.MATCH_PAT__PAT:
        return pat != null;
      case RustPackage.MATCH_PAT__END_PAT:
        return endPat != null;
      case RustPackage.MATCH_PAT__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

} //MatchPatImpl
