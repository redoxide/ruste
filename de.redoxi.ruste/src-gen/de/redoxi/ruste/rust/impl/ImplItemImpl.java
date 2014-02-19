/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ImplItem;
import de.redoxi.ruste.rust.ImplMethod;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impl Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ImplItemImpl#getTrait <em>Trait</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ImplItemImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ImplItemImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplItemImpl extends ItemImpl implements ImplItem
{
  /**
   * The default value of the '{@link #getTrait() <em>Trait</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait()
   * @generated
   * @ordered
   */
  protected static final String TRAIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrait() <em>Trait</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait()
   * @generated
   * @ordered
   */
  protected String trait = TRAIT_EDEFAULT;

  /**
   * The default value of the '{@link #getStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected static final String STRUCT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected String struct = STRUCT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<ImplMethod> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplItemImpl()
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
    return RustPackage.Literals.IMPL_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrait()
  {
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait(String newTrait)
  {
    String oldTrait = trait;
    trait = newTrait;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.IMPL_ITEM__TRAIT, oldTrait, trait));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStruct()
  {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(String newStruct)
  {
    String oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.IMPL_ITEM__STRUCT, oldStruct, struct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImplMethod> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<ImplMethod>(ImplMethod.class, this, RustPackage.IMPL_ITEM__METHODS);
    }
    return methods;
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
      case RustPackage.IMPL_ITEM__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case RustPackage.IMPL_ITEM__TRAIT:
        return getTrait();
      case RustPackage.IMPL_ITEM__STRUCT:
        return getStruct();
      case RustPackage.IMPL_ITEM__METHODS:
        return getMethods();
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
      case RustPackage.IMPL_ITEM__TRAIT:
        setTrait((String)newValue);
        return;
      case RustPackage.IMPL_ITEM__STRUCT:
        setStruct((String)newValue);
        return;
      case RustPackage.IMPL_ITEM__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends ImplMethod>)newValue);
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
      case RustPackage.IMPL_ITEM__TRAIT:
        setTrait(TRAIT_EDEFAULT);
        return;
      case RustPackage.IMPL_ITEM__STRUCT:
        setStruct(STRUCT_EDEFAULT);
        return;
      case RustPackage.IMPL_ITEM__METHODS:
        getMethods().clear();
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
      case RustPackage.IMPL_ITEM__TRAIT:
        return TRAIT_EDEFAULT == null ? trait != null : !TRAIT_EDEFAULT.equals(trait);
      case RustPackage.IMPL_ITEM__STRUCT:
        return STRUCT_EDEFAULT == null ? struct != null : !STRUCT_EDEFAULT.equals(struct);
      case RustPackage.IMPL_ITEM__METHODS:
        return methods != null && !methods.isEmpty();
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
    result.append(" (trait: ");
    result.append(trait);
    result.append(", struct: ");
    result.append(struct);
    result.append(')');
    return result.toString();
  }

} //ImplItemImpl
