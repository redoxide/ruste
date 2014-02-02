/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.EscapedChar;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escaped Char</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.EscapedCharImpl#getChar <em>Char</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EscapedCharImpl extends MinimalEObjectImpl.Container implements EscapedChar
{
  /**
   * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChar()
   * @generated
   * @ordered
   */
  protected static final String CHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChar()
   * @generated
   * @ordered
   */
  protected String char_ = CHAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EscapedCharImpl()
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
    return RustPackage.Literals.ESCAPED_CHAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChar()
  {
    return char_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChar(String newChar)
  {
    String oldChar = char_;
    char_ = newChar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.ESCAPED_CHAR__CHAR, oldChar, char_));
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
      case RustPackage.ESCAPED_CHAR__CHAR:
        return getChar();
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
      case RustPackage.ESCAPED_CHAR__CHAR:
        setChar((String)newValue);
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
      case RustPackage.ESCAPED_CHAR__CHAR:
        setChar(CHAR_EDEFAULT);
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
      case RustPackage.ESCAPED_CHAR__CHAR:
        return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
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
    result.append(" (char: ");
    result.append(char_);
    result.append(')');
    return result.toString();
  }

} //EscapedCharImpl
