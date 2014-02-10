/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.Arg;
import de.redoxi.ruste.rust.Block;
import de.redoxi.ruste.rust.GenericParamDecl;
import de.redoxi.ruste.rust.RustPackage;
import de.redoxi.ruste.rust.TraitMethod;
import de.redoxi.ruste.rust.Type;
import de.redoxi.ruste.rust.Visibility;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#isUnsafe <em>Unsafe</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#isExtern <em>Extern</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getVis <em>Vis</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.redoxi.ruste.rust.impl.TraitMethodImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitMethodImpl extends MinimalEObjectImpl.Container implements TraitMethod
{
  /**
   * The default value of the '{@link #isUnsafe() <em>Unsafe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsafe()
   * @generated
   * @ordered
   */
  protected static final boolean UNSAFE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnsafe() <em>Unsafe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnsafe()
   * @generated
   * @ordered
   */
  protected boolean unsafe = UNSAFE_EDEFAULT;

  /**
   * The default value of the '{@link #isExtern() <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtern()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExtern() <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExtern()
   * @generated
   * @ordered
   */
  protected boolean extern = EXTERN_EDEFAULT;

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
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Arg> args;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Type returnType;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Block body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitMethodImpl()
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
    return RustPackage.Literals.TRAIT_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnsafe()
  {
    return unsafe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnsafe(boolean newUnsafe)
  {
    boolean oldUnsafe = unsafe;
    unsafe = newUnsafe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__UNSAFE, oldUnsafe, unsafe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExtern()
  {
    return extern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtern(boolean newExtern)
  {
    boolean oldExtern = extern;
    extern = newExtern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__EXTERN, oldExtern, extern));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__VIS, oldVis, vis));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__IDENT, oldIdent, ident));
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
      params = new EObjectContainmentEList<GenericParamDecl>(GenericParamDecl.class, this, RustPackage.TRAIT_METHOD__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Arg>(Arg.class, this, RustPackage.TRAIT_METHOD__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs)
  {
    Type oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Type newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.TRAIT_METHOD__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.TRAIT_METHOD__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Block newBody, NotificationChain msgs)
  {
    Block oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Block newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RustPackage.TRAIT_METHOD__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RustPackage.TRAIT_METHOD__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RustPackage.TRAIT_METHOD__BODY, newBody, newBody));
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
      case RustPackage.TRAIT_METHOD__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case RustPackage.TRAIT_METHOD__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case RustPackage.TRAIT_METHOD__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case RustPackage.TRAIT_METHOD__BODY:
        return basicSetBody(null, msgs);
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
      case RustPackage.TRAIT_METHOD__UNSAFE:
        return isUnsafe();
      case RustPackage.TRAIT_METHOD__EXTERN:
        return isExtern();
      case RustPackage.TRAIT_METHOD__VIS:
        return getVis();
      case RustPackage.TRAIT_METHOD__IDENT:
        return getIdent();
      case RustPackage.TRAIT_METHOD__PARAMS:
        return getParams();
      case RustPackage.TRAIT_METHOD__ARGS:
        return getArgs();
      case RustPackage.TRAIT_METHOD__RETURN_TYPE:
        return getReturnType();
      case RustPackage.TRAIT_METHOD__BODY:
        return getBody();
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
      case RustPackage.TRAIT_METHOD__UNSAFE:
        setUnsafe((Boolean)newValue);
        return;
      case RustPackage.TRAIT_METHOD__EXTERN:
        setExtern((Boolean)newValue);
        return;
      case RustPackage.TRAIT_METHOD__VIS:
        setVis((Visibility)newValue);
        return;
      case RustPackage.TRAIT_METHOD__IDENT:
        setIdent((String)newValue);
        return;
      case RustPackage.TRAIT_METHOD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends GenericParamDecl>)newValue);
        return;
      case RustPackage.TRAIT_METHOD__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Arg>)newValue);
        return;
      case RustPackage.TRAIT_METHOD__RETURN_TYPE:
        setReturnType((Type)newValue);
        return;
      case RustPackage.TRAIT_METHOD__BODY:
        setBody((Block)newValue);
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
      case RustPackage.TRAIT_METHOD__UNSAFE:
        setUnsafe(UNSAFE_EDEFAULT);
        return;
      case RustPackage.TRAIT_METHOD__EXTERN:
        setExtern(EXTERN_EDEFAULT);
        return;
      case RustPackage.TRAIT_METHOD__VIS:
        setVis(VIS_EDEFAULT);
        return;
      case RustPackage.TRAIT_METHOD__IDENT:
        setIdent(IDENT_EDEFAULT);
        return;
      case RustPackage.TRAIT_METHOD__PARAMS:
        getParams().clear();
        return;
      case RustPackage.TRAIT_METHOD__ARGS:
        getArgs().clear();
        return;
      case RustPackage.TRAIT_METHOD__RETURN_TYPE:
        setReturnType((Type)null);
        return;
      case RustPackage.TRAIT_METHOD__BODY:
        setBody((Block)null);
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
      case RustPackage.TRAIT_METHOD__UNSAFE:
        return unsafe != UNSAFE_EDEFAULT;
      case RustPackage.TRAIT_METHOD__EXTERN:
        return extern != EXTERN_EDEFAULT;
      case RustPackage.TRAIT_METHOD__VIS:
        return vis != VIS_EDEFAULT;
      case RustPackage.TRAIT_METHOD__IDENT:
        return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
      case RustPackage.TRAIT_METHOD__PARAMS:
        return params != null && !params.isEmpty();
      case RustPackage.TRAIT_METHOD__ARGS:
        return args != null && !args.isEmpty();
      case RustPackage.TRAIT_METHOD__RETURN_TYPE:
        return returnType != null;
      case RustPackage.TRAIT_METHOD__BODY:
        return body != null;
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
    result.append(" (unsafe: ");
    result.append(unsafe);
    result.append(", extern: ");
    result.append(extern);
    result.append(", vis: ");
    result.append(vis);
    result.append(", ident: ");
    result.append(ident);
    result.append(')');
    return result.toString();
  }

} //TraitMethodImpl