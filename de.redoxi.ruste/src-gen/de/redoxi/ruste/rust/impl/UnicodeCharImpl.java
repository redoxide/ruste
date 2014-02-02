/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.UnicodeChar;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicode Char</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.UnicodeCharImpl#getDigits <em>Digits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnicodeCharImpl extends EscapedCharImpl implements UnicodeChar
{
  /**
   * The cached value of the '{@link #getDigits() <em>Digits</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDigits()
   * @generated
   * @ordered
   */
  protected EList<String> digits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnicodeCharImpl()
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
    return RustPackage.Literals.UNICODE_CHAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDigits()
  {
    if (digits == null)
    {
      digits = new EDataTypeEList<String>(String.class, this, RustPackage.UNICODE_CHAR__DIGITS);
    }
    return digits;
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
      case RustPackage.UNICODE_CHAR__DIGITS:
        return getDigits();
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
      case RustPackage.UNICODE_CHAR__DIGITS:
        getDigits().clear();
        getDigits().addAll((Collection<? extends String>)newValue);
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
      case RustPackage.UNICODE_CHAR__DIGITS:
        getDigits().clear();
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
      case RustPackage.UNICODE_CHAR__DIGITS:
        return digits != null && !digits.isEmpty();
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
    result.append(" (digits: ");
    result.append(digits);
    result.append(')');
    return result.toString();
  }

} //UnicodeCharImpl
