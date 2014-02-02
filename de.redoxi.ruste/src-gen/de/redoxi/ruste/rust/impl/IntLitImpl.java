/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.IntLit;
import de.redoxi.ruste.rust.IntSize;
import de.redoxi.ruste.rust.RustPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Lit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.IntLitImpl#isUnsigned <em>Unsigned</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.IntLitImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntLitImpl extends NumberLitImpl implements IntLit
{
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
  protected IntLitImpl()
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
    return RustPackage.Literals.INT_LIT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.INT_LIT__UNSIGNED, oldUnsigned, unsigned));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.INT_LIT__SIZE, oldSize, size));
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
      case RustPackage.INT_LIT__UNSIGNED:
        return isUnsigned();
      case RustPackage.INT_LIT__SIZE:
        return getSize();
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
      case RustPackage.INT_LIT__UNSIGNED:
        setUnsigned((Boolean)newValue);
        return;
      case RustPackage.INT_LIT__SIZE:
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
      case RustPackage.INT_LIT__UNSIGNED:
        setUnsigned(UNSIGNED_EDEFAULT);
        return;
      case RustPackage.INT_LIT__SIZE:
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
      case RustPackage.INT_LIT__UNSIGNED:
        return unsigned != UNSIGNED_EDEFAULT;
      case RustPackage.INT_LIT__SIZE:
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
    result.append(" (unsigned: ");
    result.append(unsigned);
    result.append(", size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //IntLitImpl
