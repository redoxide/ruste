/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StructField;
import de.redoxi.ruste.rust.StructItem;

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
 * An implementation of the model object '<em><b>Struct Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.StructItemImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.StructItemImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.StructItemImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructItemImpl extends ItemImpl implements StructItem
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<GenericParamDecl> params;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<StructField> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructItemImpl()
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
    return RustPackage.Literals.STRUCT_ITEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.STRUCT_ITEM__IDENT, oldIdent, ident));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericParamDecl> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<GenericParamDecl>(GenericParamDecl.class, this, RustPackage.STRUCT_ITEM__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StructField> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<StructField>(StructField.class, this, RustPackage.STRUCT_ITEM__FIELDS);
    }
    return fields;
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
      case RustPackage.STRUCT_ITEM__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case RustPackage.STRUCT_ITEM__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case RustPackage.STRUCT_ITEM__IDENT:
        return getIdent();
      case RustPackage.STRUCT_ITEM__PARAMS:
        return getParams();
      case RustPackage.STRUCT_ITEM__FIELDS:
        return getFields();
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
      case RustPackage.STRUCT_ITEM__IDENT:
        setIdent((String)newValue);
        return;
      case RustPackage.STRUCT_ITEM__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends GenericParamDecl>)newValue);
        return;
      case RustPackage.STRUCT_ITEM__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends StructField>)newValue);
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
      case RustPackage.STRUCT_ITEM__IDENT:
        setIdent(IDENT_EDEFAULT);
        return;
      case RustPackage.STRUCT_ITEM__PARAMS:
        getParams().clear();
        return;
      case RustPackage.STRUCT_ITEM__FIELDS:
        getFields().clear();
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
      case RustPackage.STRUCT_ITEM__IDENT:
        return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
      case RustPackage.STRUCT_ITEM__PARAMS:
        return params != null && !params.isEmpty();
      case RustPackage.STRUCT_ITEM__FIELDS:
        return fields != null && !fields.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //StructItemImpl
