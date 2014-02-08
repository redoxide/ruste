/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.FieldPat;
import de.redoxi.ruste.rust.PatStructEnum;
import de.redoxi.ruste.rust.RustPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pat Struct Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.redoxi.ruste.rust.impl.PatStructEnumImpl#getFieldPatterns <em>Field Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatStructEnumImpl extends PatEnumImpl implements PatStructEnum
{
  /**
   * The cached value of the '{@link #getFieldPatterns() <em>Field Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldPatterns()
   * @generated
   * @ordered
   */
  protected EList<FieldPat> fieldPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatStructEnumImpl()
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
    return RustPackage.Literals.PAT_STRUCT_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldPat> getFieldPatterns()
  {
    if (fieldPatterns == null)
    {
      fieldPatterns = new EObjectContainmentEList<FieldPat>(FieldPat.class, this, RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS);
    }
    return fieldPatterns;
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
      case RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS:
        return ((InternalEList<?>)getFieldPatterns()).basicRemove(otherEnd, msgs);
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
      case RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS:
        return getFieldPatterns();
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
      case RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS:
        getFieldPatterns().clear();
        getFieldPatterns().addAll((Collection<? extends FieldPat>)newValue);
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
      case RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS:
        getFieldPatterns().clear();
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
      case RustPackage.PAT_STRUCT_ENUM__FIELD_PATTERNS:
        return fieldPatterns != null && !fieldPatterns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PatStructEnumImpl
