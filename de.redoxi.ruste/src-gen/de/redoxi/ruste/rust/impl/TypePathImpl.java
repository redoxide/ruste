/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.Type;
import de.redoxi.ruste.rust.TypePath;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.TypePathImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TypePathImpl#getLifetimes <em>Lifetimes</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TypePathImpl#getGenericTypes <em>Generic Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePathImpl extends MinimalEObjectImpl.Container implements TypePath
{
  /**
   * The cached value of the '{@link #getSegments() <em>Segments</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSegments()
   * @generated
   * @ordered
   */
  protected EList<String> segments;

  /**
   * The cached value of the '{@link #getLifetimes() <em>Lifetimes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifetimes()
   * @generated
   * @ordered
   */
  protected EList<String> lifetimes;

  /**
   * The cached value of the '{@link #getGenericTypes() <em>Generic Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> genericTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypePathImpl()
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
    return RustPackage.Literals.TYPE_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSegments()
  {
    if (segments == null)
    {
      segments = new EDataTypeEList<String>(String.class, this, RustPackage.TYPE_PATH__SEGMENTS);
    }
    return segments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLifetimes()
  {
    if (lifetimes == null)
    {
      lifetimes = new EDataTypeEList<String>(String.class, this, RustPackage.TYPE_PATH__LIFETIMES);
    }
    return lifetimes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getGenericTypes()
  {
    if (genericTypes == null)
    {
      genericTypes = new EObjectContainmentEList<Type>(Type.class, this, RustPackage.TYPE_PATH__GENERIC_TYPES);
    }
    return genericTypes;
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
      case RustPackage.TYPE_PATH__GENERIC_TYPES:
        return ((InternalEList<?>)getGenericTypes()).basicRemove(otherEnd, msgs);
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
      case RustPackage.TYPE_PATH__SEGMENTS:
        return getSegments();
      case RustPackage.TYPE_PATH__LIFETIMES:
        return getLifetimes();
      case RustPackage.TYPE_PATH__GENERIC_TYPES:
        return getGenericTypes();
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
      case RustPackage.TYPE_PATH__SEGMENTS:
        getSegments().clear();
        getSegments().addAll((Collection<? extends String>)newValue);
        return;
      case RustPackage.TYPE_PATH__LIFETIMES:
        getLifetimes().clear();
        getLifetimes().addAll((Collection<? extends String>)newValue);
        return;
      case RustPackage.TYPE_PATH__GENERIC_TYPES:
        getGenericTypes().clear();
        getGenericTypes().addAll((Collection<? extends Type>)newValue);
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
      case RustPackage.TYPE_PATH__SEGMENTS:
        getSegments().clear();
        return;
      case RustPackage.TYPE_PATH__LIFETIMES:
        getLifetimes().clear();
        return;
      case RustPackage.TYPE_PATH__GENERIC_TYPES:
        getGenericTypes().clear();
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
      case RustPackage.TYPE_PATH__SEGMENTS:
        return segments != null && !segments.isEmpty();
      case RustPackage.TYPE_PATH__LIFETIMES:
        return lifetimes != null && !lifetimes.isEmpty();
      case RustPackage.TYPE_PATH__GENERIC_TYPES:
        return genericTypes != null && !genericTypes.isEmpty();
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
    result.append(" (segments: ");
    result.append(segments);
    result.append(", lifetimes: ");
    result.append(lifetimes);
    result.append(')');
    return result.toString();
  }

} //TypePathImpl
