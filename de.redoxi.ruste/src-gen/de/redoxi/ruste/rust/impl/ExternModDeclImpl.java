/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.ExternModDecl;
import de.redoxi.ruste.rust.LinkAttr;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StringLit;

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
 * An implementation of the model object '<em><b>Extern Mod Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExternModDeclImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExternModDeclImpl#getExternalIdent <em>External Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternModDeclImpl extends ViewItemImpl implements ExternModDecl
{
  /**
   * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrs()
   * @generated
   * @ordered
   */
  protected EList<LinkAttr> attrs;

  /**
   * The cached value of the '{@link #getExternalIdent() <em>External Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalIdent()
   * @generated
   * @ordered
   */
  protected StringLit externalIdent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternModDeclImpl()
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
    return RustPackage.Literals.EXTERN_MOD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkAttr> getAttrs()
  {
    if (attrs == null)
    {
      attrs = new EObjectContainmentEList<LinkAttr>(LinkAttr.class, this, RustPackage.EXTERN_MOD_DECL__ATTRS);
    }
    return attrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLit getExternalIdent()
  {
    return externalIdent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExternalIdent(StringLit newExternalIdent, NotificationChain msgs)
  {
    StringLit oldExternalIdent = externalIdent;
    externalIdent = newExternalIdent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT, oldExternalIdent, newExternalIdent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalIdent(StringLit newExternalIdent)
  {
    if (newExternalIdent != externalIdent)
    {
      NotificationChain msgs = null;
      if (externalIdent != null)
        msgs = ((InternalEObject)externalIdent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT, null, msgs);
      if (newExternalIdent != null)
        msgs = ((InternalEObject)newExternalIdent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT, null, msgs);
      msgs = basicSetExternalIdent(newExternalIdent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT, newExternalIdent, newExternalIdent));
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
      case RustPackage.EXTERN_MOD_DECL__ATTRS:
        return ((InternalEList<?>)getAttrs()).basicRemove(otherEnd, msgs);
      case RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT:
        return basicSetExternalIdent(null, msgs);
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
      case RustPackage.EXTERN_MOD_DECL__ATTRS:
        return getAttrs();
      case RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT:
        return getExternalIdent();
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
      case RustPackage.EXTERN_MOD_DECL__ATTRS:
        getAttrs().clear();
        getAttrs().addAll((Collection<? extends LinkAttr>)newValue);
        return;
      case RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT:
        setExternalIdent((StringLit)newValue);
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
      case RustPackage.EXTERN_MOD_DECL__ATTRS:
        getAttrs().clear();
        return;
      case RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT:
        setExternalIdent((StringLit)null);
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
      case RustPackage.EXTERN_MOD_DECL__ATTRS:
        return attrs != null && !attrs.isEmpty();
      case RustPackage.EXTERN_MOD_DECL__EXTERNAL_IDENT:
        return externalIdent != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternModDeclImpl
