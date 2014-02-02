/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.DecIntLit;
import de.redoxi.ruste.rust.IntSize;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dec Int Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.DecIntLitImpl#getDigits <em>Digits</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.DecIntLitImpl#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.DecIntLitImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecIntLitImpl extends IntLitImpl implements DecIntLit
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
   * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsigned()
   * @generated
   * @ordered
   */
  protected static final boolean UNSIGNED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsigned()
   * @generated
   * @ordered
   */
  protected boolean unsigned = UNSIGNED_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final IntSize SIZE_EDEFAULT = IntSize.BYTE;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected IntSize size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecIntLitImpl()
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
    return RustPackage.Literals.DEC_INT_LIT;
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
      digits = new EDataTypeEList<String>(String.class, this, RustPackage.DEC_INT_LIT__DIGITS);
    }
    return digits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnsigned()
  {
    return unsigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsigned(boolean newUnsigned)
  {
    boolean oldUnsigned = unsigned;
    unsigned = newUnsigned;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.DEC_INT_LIT__UNSIGNED, oldUnsigned, unsigned));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntSize getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(IntSize newSize)
  {
    IntSize oldSize = size;
    size = newSize == null ? SIZE_EDEFAULT : newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.DEC_INT_LIT__SIZE, oldSize, size));
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
      case RustPackage.DEC_INT_LIT__DIGITS:
        return getDigits();
      case RustPackage.DEC_INT_LIT__UNSIGNED:
        return isUnsigned();
      case RustPackage.DEC_INT_LIT__SIZE:
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
      case RustPackage.DEC_INT_LIT__DIGITS:
        getDigits().clear();
        getDigits().addAll((Collection<? extends String>)newValue);
        return;
      case RustPackage.DEC_INT_LIT__UNSIGNED:
        setUnsigned((Boolean)newValue);
        return;
      case RustPackage.DEC_INT_LIT__SIZE:
        setSize((IntSize)newValue);
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
      case RustPackage.DEC_INT_LIT__DIGITS:
        getDigits().clear();
        return;
      case RustPackage.DEC_INT_LIT__UNSIGNED:
        setUnsigned(UNSIGNED_EDEFAULT);
        return;
      case RustPackage.DEC_INT_LIT__SIZE:
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
      case RustPackage.DEC_INT_LIT__DIGITS:
        return digits != null && !digits.isEmpty();
      case RustPackage.DEC_INT_LIT__UNSIGNED:
        return unsigned != UNSIGNED_EDEFAULT;
      case RustPackage.DEC_INT_LIT__SIZE:
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
    result.append(", unsigned: ");
    result.append(unsigned);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //DecIntLitImpl
