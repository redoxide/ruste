/**
 */
package de.redoxi.ruste.rust.util;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.redoxi.ruste.rust.RustPackage
 * @generated
 */
public class RustSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RustPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RustPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RustPackage.CRATE:
      {
        Crate crate = (Crate)theEObject;
        T result = caseCrate(crate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ITEM_ATTR:
      {
        ItemAttr itemAttr = (ItemAttr)theEObject;
        T result = caseItemAttr(itemAttr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ATTR:
      {
        Attr attr = (Attr)theEObject;
        T result = caseAttr(attr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ATTR_WITH_LIST:
      {
        AttrWithList attrWithList = (AttrWithList)theEObject;
        T result = caseAttrWithList(attrWithList);
        if (result == null) result = caseAttr(attrWithList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.LITERAL_ATTR:
      {
        LiteralAttr literalAttr = (LiteralAttr)theEObject;
        T result = caseLiteralAttr(literalAttr);
        if (result == null) result = caseAttr(literalAttr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ITEM_AND_ATTRS:
      {
        ItemAndAttrs itemAndAttrs = (ItemAndAttrs)theEObject;
        T result = caseItemAndAttrs(itemAndAttrs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MOD_ITEM:
      {
        ModItem modItem = (ModItem)theEObject;
        T result = caseModItem(modItem);
        if (result == null) result = caseItem(modItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.CHAR_LIT:
      {
        CharLit charLit = (CharLit)theEObject;
        T result = caseCharLit(charLit);
        if (result == null) result = caseLiteral(charLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ESCAPED_CHAR:
      {
        EscapedChar escapedChar = (EscapedChar)theEObject;
        T result = caseEscapedChar(escapedChar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.NUMBER_LIT:
      {
        NumberLit numberLit = (NumberLit)theEObject;
        T result = caseNumberLit(numberLit);
        if (result == null) result = caseLiteral(numberLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.FLOAT_LIT:
      {
        FloatLit floatLit = (FloatLit)theEObject;
        T result = caseFloatLit(floatLit);
        if (result == null) result = caseNumberLit(floatLit);
        if (result == null) result = caseLiteral(floatLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.INT_LIT:
      {
        IntLit intLit = (IntLit)theEObject;
        T result = caseIntLit(intLit);
        if (result == null) result = caseNumberLit(intLit);
        if (result == null) result = caseLiteral(intLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.DEC_INT_LIT:
      {
        DecIntLit decIntLit = (DecIntLit)theEObject;
        T result = caseDecIntLit(decIntLit);
        if (result == null) result = caseIntLit(decIntLit);
        if (result == null) result = caseNumberLit(decIntLit);
        if (result == null) result = caseLiteral(decIntLit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.UNICODE_CHAR:
      {
        UnicodeChar unicodeChar = (UnicodeChar)theEObject;
        T result = caseUnicodeChar(unicodeChar);
        if (result == null) result = caseEscapedChar(unicodeChar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Crate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Crate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrate(Crate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemAttr(ItemAttr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttr(Attr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr With List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr With List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrWithList(AttrWithList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralAttr(LiteralAttr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item And Attrs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item And Attrs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemAndAttrs(ItemAndAttrs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModItem(ModItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Char Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharLit(CharLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Escaped Char</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Escaped Char</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEscapedChar(EscapedChar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLit(NumberLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatLit(FloatLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLit(IntLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Int Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Int Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecIntLit(DecIntLit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unicode Char</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unicode Char</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnicodeChar(UnicodeChar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RustSwitch
