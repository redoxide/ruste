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
      case RustPackage.FN_ITEM:
      {
        FnItem fnItem = (FnItem)theEObject;
        T result = caseFnItem(fnItem);
        if (result == null) result = caseItem(fnItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.GENERIC_PARAM_DECL:
      {
        GenericParamDecl genericParamDecl = (GenericParamDecl)theEObject;
        T result = caseGenericParamDecl(genericParamDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ARG:
      {
        Arg arg = (Arg)theEObject;
        T result = caseArg(arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT:
      {
        Pat pat = (Pat)theEObject;
        T result = casePat(pat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = caseType(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TUPLE_TYPE:
      {
        TupleType tupleType = (TupleType)theEObject;
        T result = caseTupleType(tupleType);
        if (result == null) result = caseType(tupleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STRUCT_TYPE:
      {
        StructType structType = (StructType)theEObject;
        T result = caseStructType(structType);
        if (result == null) result = caseType(structType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOXED_TYPE:
      {
        BoxedType boxedType = (BoxedType)theEObject;
        T result = caseBoxedType(boxedType);
        if (result == null) result = caseType(boxedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.OWNED_TYPE:
      {
        OwnedType ownedType = (OwnedType)theEObject;
        T result = caseOwnedType(ownedType);
        if (result == null) result = caseType(ownedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BORROWED_TYPE:
      {
        BorrowedType borrowedType = (BorrowedType)theEObject;
        T result = caseBorrowedType(borrowedType);
        if (result == null) result = caseType(borrowedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STRUCT_FIELD:
      {
        StructField structField = (StructField)theEObject;
        T result = caseStructField(structField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ENUM_TYPE:
      {
        EnumType enumType = (EnumType)theEObject;
        T result = caseEnumType(enumType);
        if (result == null) result = caseType(enumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.VARIANT:
      {
        Variant variant = (Variant)theEObject;
        T result = caseVariant(variant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STRUCT_VARIANT:
      {
        StructVariant structVariant = (StructVariant)theEObject;
        T result = caseStructVariant(structVariant);
        if (result == null) result = caseVariant(structVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TUPLE_VARIANT:
      {
        TupleVariant tupleVariant = (TupleVariant)theEObject;
        T result = caseTupleVariant(tupleVariant);
        if (result == null) result = caseVariant(tupleVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.UNIT_VARIANT:
      {
        UnitVariant unitVariant = (UnitVariant)theEObject;
        T result = caseUnitVariant(unitVariant);
        if (result == null) result = caseVariant(unitVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STRING_LIT:
      {
        StringLit stringLit = (StringLit)theEObject;
        T result = caseStringLit(stringLit);
        if (result == null) result = caseLiteral(stringLit);
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
      case RustPackage.NUMBER_LIT:
      {
        NumberLit numberLit = (NumberLit)theEObject;
        T result = caseNumberLit(numberLit);
        if (result == null) result = caseLiteral(numberLit);
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
      case RustPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = casePrimitiveType(intType);
        if (result == null) result = caseType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = casePrimitiveType(floatType);
        if (result == null) result = caseType(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOOL_TYPE:
      {
        BoolType boolType = (BoolType)theEObject;
        T result = caseBoolType(boolType);
        if (result == null) result = casePrimitiveType(boolType);
        if (result == null) result = caseType(boolType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MACHINE_TYPE:
      {
        MachineType machineType = (MachineType)theEObject;
        T result = caseMachineType(machineType);
        if (result == null) result = casePrimitiveType(machineType);
        if (result == null) result = caseType(machineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.UNIT_TYPE:
      {
        UnitType unitType = (UnitType)theEObject;
        T result = caseUnitType(unitType);
        if (result == null) result = casePrimitiveType(unitType);
        if (result == null) result = caseType(unitType);
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
   * Returns the result of interpreting the object as an instance of '<em>Fn Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fn Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnItem(FnItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Param Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Param Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericParamDecl(GenericParamDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArg(Arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePat(Pat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleType(TupleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructType(StructType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boxed Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boxed Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxedType(BoxedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owned Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owned Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwnedType(OwnedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Borrowed Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Borrowed Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorrowedType(BorrowedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructField(StructField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumType(EnumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariant(Variant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructVariant(StructVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleVariant(TupleVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitVariant(UnitVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Lit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Lit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLit(StringLit object)
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
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatType(FloatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolType(BoolType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineType(MachineType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitType(UnitType object)
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
