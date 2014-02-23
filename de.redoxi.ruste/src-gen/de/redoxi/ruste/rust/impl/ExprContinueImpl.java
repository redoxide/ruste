/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ExprContinue;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Continue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprContinueImpl#getLifetime <em>Lifetime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprContinueImpl extends ExprImpl implements ExprContinue
{
  /**
   * The default value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifetime()
   * @generated
   * @ordered
   */
  protected static final String LIFETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifetime()
   * @generated
   * @ordered
   */
  protected String lifetime = LIFETIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprContinueImpl()
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
    return RustPackage.Literals.EXPR_CONTINUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLifetime()
  {
    return lifetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLifetime(String newLifetime)
  {
    String oldLifetime = lifetime;
    lifetime = newLifetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_CONTINUE__LIFETIME, oldLifetime, lifetime));
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
      case RustPackage.EXPR_CONTINUE__LIFETIME:
        return getLifetime();
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
      case RustPackage.EXPR_CONTINUE__LIFETIME:
        setLifetime((String)newValue);
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
      case RustPackage.EXPR_CONTINUE__LIFETIME:
        setLifetime(LIFETIME_EDEFAULT);
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
      case RustPackage.EXPR_CONTINUE__LIFETIME:
        return LIFETIME_EDEFAULT == null ? lifetime != null : !LIFETIME_EDEFAULT.equals(lifetime);
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
    result.append(" (lifetime: ");
    result.append(lifetime);
    result.append(')');
    return result.toString();
  }

} //ExprContinueImpl
