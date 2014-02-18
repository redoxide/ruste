/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Crate;
import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.ViewItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.CrateImpl#getViewItems <em>View Items</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.CrateImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrateImpl extends MinimalEObjectImpl.Container implements Crate
{
  /**
   * The cached value of the '{@link #getViewItems() <em>View Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewItems()
   * @generated
   * @ordered
   */
  protected EList<ViewItem> viewItems;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ItemAndAttrs> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CrateImpl()
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
    return RustPackage.Literals.CRATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewItem> getViewItems()
  {
    if (viewItems == null)
    {
      viewItems = new EObjectContainmentEList<ViewItem>(ViewItem.class, this, RustPackage.CRATE__VIEW_ITEMS);
    }
    return viewItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemAndAttrs> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ItemAndAttrs>(ItemAndAttrs.class, this, RustPackage.CRATE__ITEMS);
    }
    return items;
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
      case RustPackage.CRATE__VIEW_ITEMS:
        return ((InternalEList<?>)getViewItems()).basicRemove(otherEnd, msgs);
      case RustPackage.CRATE__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case RustPackage.CRATE__VIEW_ITEMS:
        return getViewItems();
      case RustPackage.CRATE__ITEMS:
        return getItems();
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
      case RustPackage.CRATE__VIEW_ITEMS:
        getViewItems().clear();
        getViewItems().addAll((Collection<? extends ViewItem>)newValue);
        return;
      case RustPackage.CRATE__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ItemAndAttrs>)newValue);
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
      case RustPackage.CRATE__VIEW_ITEMS:
        getViewItems().clear();
        return;
      case RustPackage.CRATE__ITEMS:
        getItems().clear();
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
      case RustPackage.CRATE__VIEW_ITEMS:
        return viewItems != null && !viewItems.isEmpty();
      case RustPackage.CRATE__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CrateImpl
