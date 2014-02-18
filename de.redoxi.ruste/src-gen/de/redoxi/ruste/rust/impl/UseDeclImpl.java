/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.PathGlob;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.TypePath;
import de.redoxi.ruste.rust.UseDecl;
import de.redoxi.ruste.rust.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.UseDeclImpl#getVis <em>Vis</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.UseDeclImpl#getExternPath <em>Extern Path</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.UseDeclImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseDeclImpl extends ViewItemImpl implements UseDecl
{
  /**
   * The default value of the '{@link #getVis() <em>Vis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis()
   * @generated
   * @ordered
   */
  protected static final Visibility VIS_EDEFAULT = Visibility.PRIVATE;

  /**
   * The cached value of the '{@link #getVis() <em>Vis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVis()
   * @generated
   * @ordered
   */
  protected Visibility vis = VIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExternPath() <em>Extern Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternPath()
   * @generated
   * @ordered
   */
  protected TypePath externPath;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected PathGlob path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UseDeclImpl()
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
    return RustPackage.Literals.USE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVis()
  {
    return vis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVis(Visibility newVis)
  {
    Visibility oldVis = vis;
    vis = newVis == null ? VIS_EDEFAULT : newVis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.USE_DECL__VIS, oldVis, vis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePath getExternPath()
  {
    return externPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExternPath(TypePath newExternPath, NotificationChain msgs)
  {
    TypePath oldExternPath = externPath;
    externPath = newExternPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.USE_DECL__EXTERN_PATH, oldExternPath, newExternPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternPath(TypePath newExternPath)
  {
    if (newExternPath != externPath)
    {
      NotificationChain msgs = null;
      if (externPath != null)
        msgs = ((InternalEObject)externPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.USE_DECL__EXTERN_PATH, null, msgs);
      if (newExternPath != null)
        msgs = ((InternalEObject)newExternPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.USE_DECL__EXTERN_PATH, null, msgs);
      msgs = basicSetExternPath(newExternPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.USE_DECL__EXTERN_PATH, newExternPath, newExternPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathGlob getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(PathGlob newPath, NotificationChain msgs)
  {
    PathGlob oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.USE_DECL__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(PathGlob newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.USE_DECL__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.USE_DECL__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.USE_DECL__PATH, newPath, newPath));
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
      case RustPackage.USE_DECL__EXTERN_PATH:
        return basicSetExternPath(null, msgs);
      case RustPackage.USE_DECL__PATH:
        return basicSetPath(null, msgs);
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
      case RustPackage.USE_DECL__VIS:
        return getVis();
      case RustPackage.USE_DECL__EXTERN_PATH:
        return getExternPath();
      case RustPackage.USE_DECL__PATH:
        return getPath();
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
      case RustPackage.USE_DECL__VIS:
        setVis((Visibility)newValue);
        return;
      case RustPackage.USE_DECL__EXTERN_PATH:
        setExternPath((TypePath)newValue);
        return;
      case RustPackage.USE_DECL__PATH:
        setPath((PathGlob)newValue);
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
      case RustPackage.USE_DECL__VIS:
        setVis(VIS_EDEFAULT);
        return;
      case RustPackage.USE_DECL__EXTERN_PATH:
        setExternPath((TypePath)null);
        return;
      case RustPackage.USE_DECL__PATH:
        setPath((PathGlob)null);
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
      case RustPackage.USE_DECL__VIS:
        return vis != VIS_EDEFAULT;
      case RustPackage.USE_DECL__EXTERN_PATH:
        return externPath != null;
      case RustPackage.USE_DECL__PATH:
        return path != null;
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
    result.append(" (vis: ");
    result.append(vis);
    result.append(')');
    return result.toString();
  }

} //UseDeclImpl
