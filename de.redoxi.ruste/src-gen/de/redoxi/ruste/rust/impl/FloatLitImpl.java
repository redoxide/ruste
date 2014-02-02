/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.FloatLit;
import de.redoxi.ruste.rust.FloatSize;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.FloatLitImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.FloatLitImpl#isNegativeExp <em>Negative Exp</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.FloatLitImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatLitImpl extends NumberLitImpl implements FloatLit
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
   * The default value of the '{@link #isNegativeExp() <em>Negative Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegativeExp()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATIVE_EXP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegativeExp() <em>Negative Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegativeExp()
   * @generated
   * @ordered
   */
  protected boolean negativeExp = NEGATIVE_EXP_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final FloatSize SIZE_EDEFAULT = FloatSize.FLOAT;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected FloatSize size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatLitImpl()
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
    return RustPackage.Literals.FLOAT_LIT;
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
      digits = new EDataTypeEList<String>(String.class, this, RustPackage.FLOAT_LIT__DIGITS);
    }
    return digits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegativeExp()
  {
    return negativeExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegativeExp(boolean newNegativeExp)
  {
    boolean oldNegativeExp = negativeExp;
    negativeExp = newNegativeExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.FLOAT_LIT__NEGATIVE_EXP, oldNegativeExp, negativeExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatSize getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(FloatSize newSize)
  {
    FloatSize oldSize = size;
    size = newSize == null ? SIZE_EDEFAULT : newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.FLOAT_LIT__SIZE, oldSize, size));
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
      case RustPackage.FLOAT_LIT__DIGITS:
        return getDigits();
      case RustPackage.FLOAT_LIT__NEGATIVE_EXP:
        return isNegativeExp();
      case RustPackage.FLOAT_LIT__SIZE:
        return getSize();
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
      case RustPackage.FLOAT_LIT__DIGITS:
        getDigits().clear();
        getDigits().addAll((Collection<? extends String>)newValue);
        return;
      case RustPackage.FLOAT_LIT__NEGATIVE_EXP:
        setNegativeExp((Boolean)newValue);
        return;
      case RustPackage.FLOAT_LIT__SIZE:
        setSize((FloatSize)newValue);
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
      case RustPackage.FLOAT_LIT__DIGITS:
        getDigits().clear();
        return;
      case RustPackage.FLOAT_LIT__NEGATIVE_EXP:
        setNegativeExp(NEGATIVE_EXP_EDEFAULT);
        return;
      case RustPackage.FLOAT_LIT__SIZE:
        setSize(SIZE_EDEFAULT);
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
      case RustPackage.FLOAT_LIT__DIGITS:
        return digits != null && !digits.isEmpty();
      case RustPackage.FLOAT_LIT__NEGATIVE_EXP:
        return negativeExp != NEGATIVE_EXP_EDEFAULT;
      case RustPackage.FLOAT_LIT__SIZE:
        return size != SIZE_EDEFAULT;
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
    result.append(", negativeExp: ");
    result.append(negativeExp);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //FloatLitImpl
