/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ItemAndAttrs;
import de.redoxi.ruste.rust.ModItem;
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
 * An implementation of the model object '<em><b>Mod Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ModItemImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ModItemImpl#isExternalBody <em>External Body</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ModItemImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModItemImpl extends ItemImpl implements ModItem
{
  /**
   * The default value of the '{@link #getIdent() <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected static final String IDENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdent() <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected String ident = IDENT_EDEFAULT;

  /**
   * The default value of the '{@link #isExternalBody() <em>External Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternalBody()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERNAL_BODY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExternalBody() <em>External Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternalBody()
   * @generated
   * @ordered
   */
  protected boolean externalBody = EXTERNAL_BODY_EDEFAULT;

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
  protected ModItemImpl()
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
    return RustPackage.Literals.MOD_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdent()
  {
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdent(String newIdent)
  {
    String oldIdent = ident;
    ident = newIdent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.MOD_ITEM__IDENT, oldIdent, ident));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExternalBody()
  {
    return externalBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalBody(boolean newExternalBody)
  {
    boolean oldExternalBody = externalBody;
    externalBody = newExternalBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.MOD_ITEM__EXTERNAL_BODY, oldExternalBody, externalBody));
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
      items = new EObjectContainmentEList<ItemAndAttrs>(ItemAndAttrs.class, this, RustPackage.MOD_ITEM__ITEMS);
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
      case RustPackage.MOD_ITEM__ITEMS:
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
      case RustPackage.MOD_ITEM__IDENT:
        return getIdent();
      case RustPackage.MOD_ITEM__EXTERNAL_BODY:
        return isExternalBody();
      case RustPackage.MOD_ITEM__ITEMS:
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
      case RustPackage.MOD_ITEM__IDENT:
        setIdent((String)newValue);
        return;
      case RustPackage.MOD_ITEM__EXTERNAL_BODY:
        setExternalBody((Boolean)newValue);
        return;
      case RustPackage.MOD_ITEM__ITEMS:
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
      case RustPackage.MOD_ITEM__IDENT:
        setIdent(IDENT_EDEFAULT);
        return;
      case RustPackage.MOD_ITEM__EXTERNAL_BODY:
        setExternalBody(EXTERNAL_BODY_EDEFAULT);
        return;
      case RustPackage.MOD_ITEM__ITEMS:
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
      case RustPackage.MOD_ITEM__IDENT:
        return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
      case RustPackage.MOD_ITEM__EXTERNAL_BODY:
        return externalBody != EXTERNAL_BODY_EDEFAULT;
      case RustPackage.MOD_ITEM__ITEMS:
        return items != null && !items.isEmpty();
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
    result.append(" (ident: ");
    result.append(ident);
    result.append(", externalBody: ");
    result.append(externalBody);
    result.append(')');
    return result.toString();
  }

} //ModItemImpl
