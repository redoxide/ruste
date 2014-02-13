/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Assign;
import de.redoxi.ruste.rust.Expr;
import de.redoxi.ruste.rust.ExprBinary;
import de.redoxi.ruste.rust.ExprLValue;
import de.redoxi.ruste.rust.ExprPathHead;
import de.redoxi.ruste.rust.ExprStruct;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.StructField;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Struct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprStructImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprStructImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprStructImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.ExprStructImpl#getBaseExpr <em>Base Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprStructImpl extends ExprLeafImpl implements ExprStruct
{
  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected EObject path;

  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected ExprStruct struct;

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
   * The cached value of the '{@link #getBaseExpr() <em>Base Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseExpr()
   * @generated
   * @ordered
   */
  protected Expr baseExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprStructImpl()
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
    return RustPackage.Literals.EXPR_STRUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(EObject newPath, NotificationChain msgs)
  {
    EObject oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(EObject newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__PATH, newPath, newPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprStruct getStruct()
  {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct(ExprStruct newStruct, NotificationChain msgs)
  {
    ExprStruct oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__STRUCT, oldStruct, newStruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(ExprStruct newStruct)
  {
    if (newStruct != struct)
    {
      NotificationChain msgs = null;
      if (struct != null)
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__STRUCT, newStruct, newStruct));
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
      fields = new EObjectContainmentEList<StructField>(StructField.class, this, RustPackage.EXPR_STRUCT__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getBaseExpr()
  {
    return baseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseExpr(Expr newBaseExpr, NotificationChain msgs)
  {
    Expr oldBaseExpr = baseExpr;
    baseExpr = newBaseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__BASE_EXPR, oldBaseExpr, newBaseExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseExpr(Expr newBaseExpr)
  {
    if (newBaseExpr != baseExpr)
    {
      NotificationChain msgs = null;
      if (baseExpr != null)
        msgs = ((InternalEObject)baseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__BASE_EXPR, null, msgs);
      if (newBaseExpr != null)
        msgs = ((InternalEObject)newBaseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.EXPR_STRUCT__BASE_EXPR, null, msgs);
      msgs = basicSetBaseExpr(newBaseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.EXPR_STRUCT__BASE_EXPR, newBaseExpr, newBaseExpr));
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
      case RustPackage.EXPR_STRUCT__PATH:
        return basicSetPath(null, msgs);
      case RustPackage.EXPR_STRUCT__STRUCT:
        return basicSetStruct(null, msgs);
      case RustPackage.EXPR_STRUCT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case RustPackage.EXPR_STRUCT__BASE_EXPR:
        return basicSetBaseExpr(null, msgs);
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
      case RustPackage.EXPR_STRUCT__PATH:
        return getPath();
      case RustPackage.EXPR_STRUCT__STRUCT:
        return getStruct();
      case RustPackage.EXPR_STRUCT__FIELDS:
        return getFields();
      case RustPackage.EXPR_STRUCT__BASE_EXPR:
        return getBaseExpr();
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
      case RustPackage.EXPR_STRUCT__PATH:
        setPath((EObject)newValue);
        return;
      case RustPackage.EXPR_STRUCT__STRUCT:
        setStruct((ExprStruct)newValue);
        return;
      case RustPackage.EXPR_STRUCT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends StructField>)newValue);
        return;
      case RustPackage.EXPR_STRUCT__BASE_EXPR:
        setBaseExpr((Expr)newValue);
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
      case RustPackage.EXPR_STRUCT__PATH:
        setPath((EObject)null);
        return;
      case RustPackage.EXPR_STRUCT__STRUCT:
        setStruct((ExprStruct)null);
        return;
      case RustPackage.EXPR_STRUCT__FIELDS:
        getFields().clear();
        return;
      case RustPackage.EXPR_STRUCT__BASE_EXPR:
        setBaseExpr((Expr)null);
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
      case RustPackage.EXPR_STRUCT__PATH:
        return path != null;
      case RustPackage.EXPR_STRUCT__STRUCT:
        return struct != null;
      case RustPackage.EXPR_STRUCT__FIELDS:
        return fields != null && !fields.isEmpty();
      case RustPackage.EXPR_STRUCT__BASE_EXPR:
        return baseExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ExprBinary.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Assign.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprLValue.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprPathHead.class)
    {
      switch (derivedFeatureID)
      {
        case RustPackage.EXPR_STRUCT__PATH: return RustPackage.EXPR_PATH_HEAD__PATH;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ExprBinary.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Assign.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprLValue.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExprPathHead.class)
    {
      switch (baseFeatureID)
      {
        case RustPackage.EXPR_PATH_HEAD__PATH: return RustPackage.EXPR_STRUCT__PATH;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExprStructImpl
