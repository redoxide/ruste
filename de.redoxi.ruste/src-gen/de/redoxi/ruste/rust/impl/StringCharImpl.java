/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.EscapedChar;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringChar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Char</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.StringCharImpl#getChar <em>Char</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.StringCharImpl#getEscapedChar <em>Escaped Char</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringCharImpl extends MinimalEObjectImpl.Container implements StringChar
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
   * The cached value of the '{@link #getEscapedChar() <em>Escaped Char</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEscapedChar()
   * @generated
   * @ordered
   */
  protected EscapedChar escapedChar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringCharImpl()
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
    return RustPackage.Literals.STRING_CHAR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.STRING_CHAR__CHAR, oldChar, char_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscapedChar getEscapedChar()
  {
    return escapedChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEscapedChar(EscapedChar newEscapedChar, NotificationChain msgs)
  {
    EscapedChar oldEscapedChar = escapedChar;
    escapedChar = newEscapedChar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.STRING_CHAR__ESCAPED_CHAR, oldEscapedChar, newEscapedChar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEscapedChar(EscapedChar newEscapedChar)
  {
    if (newEscapedChar != escapedChar)
    {
      NotificationChain msgs = null;
      if (escapedChar != null)
        msgs = ((InternalEObject)escapedChar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.STRING_CHAR__ESCAPED_CHAR, null, msgs);
      if (newEscapedChar != null)
        msgs = ((InternalEObject)newEscapedChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.STRING_CHAR__ESCAPED_CHAR, null, msgs);
      msgs = basicSetEscapedChar(newEscapedChar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.STRING_CHAR__ESCAPED_CHAR, newEscapedChar, newEscapedChar));
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
      case RustPackage.STRING_CHAR__ESCAPED_CHAR:
        return basicSetEscapedChar(null, msgs);
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
      case RustPackage.STRING_CHAR__CHAR:
        return getChar();
      case RustPackage.STRING_CHAR__ESCAPED_CHAR:
        return getEscapedChar();
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
      case RustPackage.STRING_CHAR__CHAR:
        setChar((String)newValue);
        return;
      case RustPackage.STRING_CHAR__ESCAPED_CHAR:
        setEscapedChar((EscapedChar)newValue);
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
      case RustPackage.STRING_CHAR__CHAR:
        setChar(CHAR_EDEFAULT);
        return;
      case RustPackage.STRING_CHAR__ESCAPED_CHAR:
        setEscapedChar((EscapedChar)null);
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
      case RustPackage.STRING_CHAR__CHAR:
        return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
      case RustPackage.STRING_CHAR__ESCAPED_CHAR:
        return escapedChar != null;
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

} //StringCharImpl
