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
      case RustPackage.TYPE_ITEM:
      {
        TypeItem typeItem = (TypeItem)theEObject;
        T result = caseTypeItem(typeItem);
        if (result == null) result = caseItem(typeItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STRUCT_ITEM:
      {
        StructItem structItem = (StructItem)theEObject;
        T result = caseStructItem(structItem);
        if (result == null) result = caseItem(structItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ENUM_ITEM:
      {
        EnumItem enumItem = (EnumItem)theEObject;
        T result = caseEnumItem(enumItem);
        if (result == null) result = caseItem(enumItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ENUM_VARIANT:
      {
        EnumVariant enumVariant = (EnumVariant)theEObject;
        T result = caseEnumVariant(enumVariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TRAIT_ITEM:
      {
        TraitItem traitItem = (TraitItem)theEObject;
        T result = caseTraitItem(traitItem);
        if (result == null) result = caseItem(traitItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TRAIT_METHOD:
      {
        TraitMethod traitMethod = (TraitMethod)theEObject;
        T result = caseTraitMethod(traitMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.IMPL_ITEM:
      {
        ImplItem implItem = (ImplItem)theEObject;
        T result = caseImplItem(implItem);
        if (result == null) result = caseItem(implItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.IMPL_METHOD:
      {
        ImplMethod implMethod = (ImplMethod)theEObject;
        T result = caseImplMethod(implMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXTERN_BLOCK:
      {
        ExternBlock externBlock = (ExternBlock)theEObject;
        T result = caseExternBlock(externBlock);
        if (result == null) result = caseItem(externBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.FOREIGN_FN:
      {
        ForeignFn foreignFn = (ForeignFn)theEObject;
        T result = caseForeignFn(foreignFn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.STATIC_ITEM:
      {
        StaticItem staticItem = (StaticItem)theEObject;
        T result = caseStaticItem(staticItem);
        if (result == null) result = caseItem(staticItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LVALUE:
      {
        ExprLValue exprLValue = (ExprLValue)theEObject;
        T result = caseExprLValue(exprLValue);
        if (result == null) result = caseAssign(exprLValue);
        if (result == null) result = caseExprBinary(exprLValue);
        if (result == null) result = caseExprRValue(exprLValue);
        if (result == null) result = caseExpr(exprLValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_RVALUE:
      {
        ExprRValue exprRValue = (ExprRValue)theEObject;
        T result = caseExprRValue(exprRValue);
        if (result == null) result = caseExpr(exprRValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LEAF:
      {
        ExprLeaf exprLeaf = (ExprLeaf)theEObject;
        T result = caseExprLeaf(exprLeaf);
        if (result == null) result = caseExprRValue(exprLeaf);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLeaf);
        if (result == null) result = caseExpr(exprLeaf);
        if (result == null) result = caseAs(exprLeaf);
        if (result == null) result = caseAdditionOrSubtraction(exprLeaf);
        if (result == null) result = caseShiftOperator(exprLeaf);
        if (result == null) result = caseBitwiseAnd(exprLeaf);
        if (result == null) result = caseBitwiseXor(exprLeaf);
        if (result == null) result = caseBitwiseOr(exprLeaf);
        if (result == null) result = caseComparisonOperators(exprLeaf);
        if (result == null) result = caseEqualityOperator(exprLeaf);
        if (result == null) result = caseBooleanAnd(exprLeaf);
        if (result == null) result = caseBooleanOr(exprLeaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LITERAL:
      {
        ExprLiteral exprLiteral = (ExprLiteral)theEObject;
        T result = caseExprLiteral(exprLiteral);
        if (result == null) result = caseExprLeaf(exprLiteral);
        if (result == null) result = caseExprRValue(exprLiteral);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLiteral);
        if (result == null) result = caseExpr(exprLiteral);
        if (result == null) result = caseAs(exprLiteral);
        if (result == null) result = caseAdditionOrSubtraction(exprLiteral);
        if (result == null) result = caseShiftOperator(exprLiteral);
        if (result == null) result = caseBitwiseAnd(exprLiteral);
        if (result == null) result = caseBitwiseXor(exprLiteral);
        if (result == null) result = caseBitwiseOr(exprLiteral);
        if (result == null) result = caseComparisonOperators(exprLiteral);
        if (result == null) result = caseEqualityOperator(exprLiteral);
        if (result == null) result = caseBooleanAnd(exprLiteral);
        if (result == null) result = caseBooleanOr(exprLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_PATH_HEAD:
      {
        ExprPathHead exprPathHead = (ExprPathHead)theEObject;
        T result = caseExprPathHead(exprPathHead);
        if (result == null) result = caseExprLValue(exprPathHead);
        if (result == null) result = caseAssign(exprPathHead);
        if (result == null) result = caseExprBinary(exprPathHead);
        if (result == null) result = caseExprRValue(exprPathHead);
        if (result == null) result = caseExpr(exprPathHead);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_GROUP:
      {
        ExprGroup exprGroup = (ExprGroup)theEObject;
        T result = caseExprGroup(exprGroup);
        if (result == null) result = caseExprLeaf(exprGroup);
        if (result == null) result = caseExprRValue(exprGroup);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprGroup);
        if (result == null) result = caseExpr(exprGroup);
        if (result == null) result = caseAs(exprGroup);
        if (result == null) result = caseAdditionOrSubtraction(exprGroup);
        if (result == null) result = caseShiftOperator(exprGroup);
        if (result == null) result = caseBitwiseAnd(exprGroup);
        if (result == null) result = caseBitwiseXor(exprGroup);
        if (result == null) result = caseBitwiseOr(exprGroup);
        if (result == null) result = caseComparisonOperators(exprGroup);
        if (result == null) result = caseEqualityOperator(exprGroup);
        if (result == null) result = caseBooleanAnd(exprGroup);
        if (result == null) result = caseBooleanOr(exprGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_TUPLE:
      {
        ExprTuple exprTuple = (ExprTuple)theEObject;
        T result = caseExprTuple(exprTuple);
        if (result == null) result = caseExprPathHead(exprTuple);
        if (result == null) result = caseExprGroup(exprTuple);
        if (result == null) result = caseExprLValue(exprTuple);
        if (result == null) result = caseExprLeaf(exprTuple);
        if (result == null) result = caseAssign(exprTuple);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprTuple);
        if (result == null) result = caseExprBinary(exprTuple);
        if (result == null) result = caseAs(exprTuple);
        if (result == null) result = caseExprRValue(exprTuple);
        if (result == null) result = caseAdditionOrSubtraction(exprTuple);
        if (result == null) result = caseExpr(exprTuple);
        if (result == null) result = caseShiftOperator(exprTuple);
        if (result == null) result = caseBitwiseAnd(exprTuple);
        if (result == null) result = caseBitwiseXor(exprTuple);
        if (result == null) result = caseBitwiseOr(exprTuple);
        if (result == null) result = caseComparisonOperators(exprTuple);
        if (result == null) result = caseEqualityOperator(exprTuple);
        if (result == null) result = caseBooleanAnd(exprTuple);
        if (result == null) result = caseBooleanOr(exprTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_STRUCT:
      {
        ExprStruct exprStruct = (ExprStruct)theEObject;
        T result = caseExprStruct(exprStruct);
        if (result == null) result = caseExprLeaf(exprStruct);
        if (result == null) result = caseExprPathHead(exprStruct);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprStruct);
        if (result == null) result = caseExprLValue(exprStruct);
        if (result == null) result = caseExpr(exprStruct);
        if (result == null) result = caseAs(exprStruct);
        if (result == null) result = caseAssign(exprStruct);
        if (result == null) result = caseAdditionOrSubtraction(exprStruct);
        if (result == null) result = caseExprBinary(exprStruct);
        if (result == null) result = caseExprRValue(exprStruct);
        if (result == null) result = caseShiftOperator(exprStruct);
        if (result == null) result = caseBitwiseAnd(exprStruct);
        if (result == null) result = caseBitwiseXor(exprStruct);
        if (result == null) result = caseBitwiseOr(exprStruct);
        if (result == null) result = caseComparisonOperators(exprStruct);
        if (result == null) result = caseEqualityOperator(exprStruct);
        if (result == null) result = caseBooleanAnd(exprStruct);
        if (result == null) result = caseBooleanOr(exprStruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_VEC:
      {
        ExprVec exprVec = (ExprVec)theEObject;
        T result = caseExprVec(exprVec);
        if (result == null) result = caseExprLeaf(exprVec);
        if (result == null) result = caseExprRValue(exprVec);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprVec);
        if (result == null) result = caseExpr(exprVec);
        if (result == null) result = caseAs(exprVec);
        if (result == null) result = caseAdditionOrSubtraction(exprVec);
        if (result == null) result = caseShiftOperator(exprVec);
        if (result == null) result = caseBitwiseAnd(exprVec);
        if (result == null) result = caseBitwiseXor(exprVec);
        if (result == null) result = caseBitwiseOr(exprVec);
        if (result == null) result = caseComparisonOperators(exprVec);
        if (result == null) result = caseEqualityOperator(exprVec);
        if (result == null) result = caseBooleanAnd(exprVec);
        if (result == null) result = caseBooleanOr(exprVec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_UNARY:
      {
        ExprUnary exprUnary = (ExprUnary)theEObject;
        T result = caseExprUnary(exprUnary);
        if (result == null) result = caseExprLeaf(exprUnary);
        if (result == null) result = caseExprRValue(exprUnary);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprUnary);
        if (result == null) result = caseExpr(exprUnary);
        if (result == null) result = caseAs(exprUnary);
        if (result == null) result = caseAdditionOrSubtraction(exprUnary);
        if (result == null) result = caseShiftOperator(exprUnary);
        if (result == null) result = caseBitwiseAnd(exprUnary);
        if (result == null) result = caseBitwiseXor(exprUnary);
        if (result == null) result = caseBitwiseOr(exprUnary);
        if (result == null) result = caseComparisonOperators(exprUnary);
        if (result == null) result = caseEqualityOperator(exprUnary);
        if (result == null) result = caseBooleanAnd(exprUnary);
        if (result == null) result = caseBooleanOr(exprUnary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.NUMERIC_NEGATION:
      {
        NumericNegation numericNegation = (NumericNegation)theEObject;
        T result = caseNumericNegation(numericNegation);
        if (result == null) result = caseExprUnary(numericNegation);
        if (result == null) result = caseExprLeaf(numericNegation);
        if (result == null) result = caseExprRValue(numericNegation);
        if (result == null) result = caseDivisionMultiplicationOrModulo(numericNegation);
        if (result == null) result = caseExpr(numericNegation);
        if (result == null) result = caseAs(numericNegation);
        if (result == null) result = caseAdditionOrSubtraction(numericNegation);
        if (result == null) result = caseShiftOperator(numericNegation);
        if (result == null) result = caseBitwiseAnd(numericNegation);
        if (result == null) result = caseBitwiseXor(numericNegation);
        if (result == null) result = caseBitwiseOr(numericNegation);
        if (result == null) result = caseComparisonOperators(numericNegation);
        if (result == null) result = caseEqualityOperator(numericNegation);
        if (result == null) result = caseBooleanAnd(numericNegation);
        if (result == null) result = caseBooleanOr(numericNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.DEREFERENCE:
      {
        Dereference dereference = (Dereference)theEObject;
        T result = caseDereference(dereference);
        if (result == null) result = caseExprUnary(dereference);
        if (result == null) result = caseExprLeaf(dereference);
        if (result == null) result = caseExprRValue(dereference);
        if (result == null) result = caseDivisionMultiplicationOrModulo(dereference);
        if (result == null) result = caseExpr(dereference);
        if (result == null) result = caseAs(dereference);
        if (result == null) result = caseAdditionOrSubtraction(dereference);
        if (result == null) result = caseShiftOperator(dereference);
        if (result == null) result = caseBitwiseAnd(dereference);
        if (result == null) result = caseBitwiseXor(dereference);
        if (result == null) result = caseBitwiseOr(dereference);
        if (result == null) result = caseComparisonOperators(dereference);
        if (result == null) result = caseEqualityOperator(dereference);
        if (result == null) result = caseBooleanAnd(dereference);
        if (result == null) result = caseBooleanOr(dereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.LOGICAL_NEGATION:
      {
        LogicalNegation logicalNegation = (LogicalNegation)theEObject;
        T result = caseLogicalNegation(logicalNegation);
        if (result == null) result = caseExprUnary(logicalNegation);
        if (result == null) result = caseExprLeaf(logicalNegation);
        if (result == null) result = caseExprRValue(logicalNegation);
        if (result == null) result = caseDivisionMultiplicationOrModulo(logicalNegation);
        if (result == null) result = caseExpr(logicalNegation);
        if (result == null) result = caseAs(logicalNegation);
        if (result == null) result = caseAdditionOrSubtraction(logicalNegation);
        if (result == null) result = caseShiftOperator(logicalNegation);
        if (result == null) result = caseBitwiseAnd(logicalNegation);
        if (result == null) result = caseBitwiseXor(logicalNegation);
        if (result == null) result = caseBitwiseOr(logicalNegation);
        if (result == null) result = caseComparisonOperators(logicalNegation);
        if (result == null) result = caseEqualityOperator(logicalNegation);
        if (result == null) result = caseBooleanAnd(logicalNegation);
        if (result == null) result = caseBooleanOr(logicalNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MANAGED_BOX:
      {
        ManagedBox managedBox = (ManagedBox)theEObject;
        T result = caseManagedBox(managedBox);
        if (result == null) result = caseExprUnary(managedBox);
        if (result == null) result = caseExprLeaf(managedBox);
        if (result == null) result = caseExprRValue(managedBox);
        if (result == null) result = caseDivisionMultiplicationOrModulo(managedBox);
        if (result == null) result = caseExpr(managedBox);
        if (result == null) result = caseAs(managedBox);
        if (result == null) result = caseAdditionOrSubtraction(managedBox);
        if (result == null) result = caseShiftOperator(managedBox);
        if (result == null) result = caseBitwiseAnd(managedBox);
        if (result == null) result = caseBitwiseXor(managedBox);
        if (result == null) result = caseBitwiseOr(managedBox);
        if (result == null) result = caseComparisonOperators(managedBox);
        if (result == null) result = caseEqualityOperator(managedBox);
        if (result == null) result = caseBooleanAnd(managedBox);
        if (result == null) result = caseBooleanOr(managedBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.OWNED_BOX:
      {
        OwnedBox ownedBox = (OwnedBox)theEObject;
        T result = caseOwnedBox(ownedBox);
        if (result == null) result = caseExprUnary(ownedBox);
        if (result == null) result = caseExprLeaf(ownedBox);
        if (result == null) result = caseExprRValue(ownedBox);
        if (result == null) result = caseDivisionMultiplicationOrModulo(ownedBox);
        if (result == null) result = caseExpr(ownedBox);
        if (result == null) result = caseAs(ownedBox);
        if (result == null) result = caseAdditionOrSubtraction(ownedBox);
        if (result == null) result = caseShiftOperator(ownedBox);
        if (result == null) result = caseBitwiseAnd(ownedBox);
        if (result == null) result = caseBitwiseXor(ownedBox);
        if (result == null) result = caseBitwiseOr(ownedBox);
        if (result == null) result = caseComparisonOperators(ownedBox);
        if (result == null) result = caseEqualityOperator(ownedBox);
        if (result == null) result = caseBooleanAnd(ownedBox);
        if (result == null) result = caseBooleanOr(ownedBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BORROW:
      {
        Borrow borrow = (Borrow)theEObject;
        T result = caseBorrow(borrow);
        if (result == null) result = caseExprUnary(borrow);
        if (result == null) result = caseExprLeaf(borrow);
        if (result == null) result = caseExprRValue(borrow);
        if (result == null) result = caseDivisionMultiplicationOrModulo(borrow);
        if (result == null) result = caseExpr(borrow);
        if (result == null) result = caseAs(borrow);
        if (result == null) result = caseAdditionOrSubtraction(borrow);
        if (result == null) result = caseShiftOperator(borrow);
        if (result == null) result = caseBitwiseAnd(borrow);
        if (result == null) result = caseBitwiseXor(borrow);
        if (result == null) result = caseBitwiseOr(borrow);
        if (result == null) result = caseComparisonOperators(borrow);
        if (result == null) result = caseEqualityOperator(borrow);
        if (result == null) result = caseBooleanAnd(borrow);
        if (result == null) result = caseBooleanOr(borrow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BINARY:
      {
        ExprBinary exprBinary = (ExprBinary)theEObject;
        T result = caseExprBinary(exprBinary);
        if (result == null) result = caseExprRValue(exprBinary);
        if (result == null) result = caseExpr(exprBinary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.DIVISION_MULTIPLICATION_OR_MODULO:
      {
        DivisionMultiplicationOrModulo divisionMultiplicationOrModulo = (DivisionMultiplicationOrModulo)theEObject;
        T result = caseDivisionMultiplicationOrModulo(divisionMultiplicationOrModulo);
        if (result == null) result = caseAs(divisionMultiplicationOrModulo);
        if (result == null) result = caseAdditionOrSubtraction(divisionMultiplicationOrModulo);
        if (result == null) result = caseShiftOperator(divisionMultiplicationOrModulo);
        if (result == null) result = caseBitwiseAnd(divisionMultiplicationOrModulo);
        if (result == null) result = caseBitwiseXor(divisionMultiplicationOrModulo);
        if (result == null) result = caseBitwiseOr(divisionMultiplicationOrModulo);
        if (result == null) result = caseComparisonOperators(divisionMultiplicationOrModulo);
        if (result == null) result = caseEqualityOperator(divisionMultiplicationOrModulo);
        if (result == null) result = caseBooleanAnd(divisionMultiplicationOrModulo);
        if (result == null) result = caseBooleanOr(divisionMultiplicationOrModulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.AS:
      {
        As as = (As)theEObject;
        T result = caseAs(as);
        if (result == null) result = caseAdditionOrSubtraction(as);
        if (result == null) result = caseShiftOperator(as);
        if (result == null) result = caseBitwiseAnd(as);
        if (result == null) result = caseBitwiseXor(as);
        if (result == null) result = caseBitwiseOr(as);
        if (result == null) result = caseComparisonOperators(as);
        if (result == null) result = caseEqualityOperator(as);
        if (result == null) result = caseBooleanAnd(as);
        if (result == null) result = caseBooleanOr(as);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ADDITION_OR_SUBTRACTION:
      {
        AdditionOrSubtraction additionOrSubtraction = (AdditionOrSubtraction)theEObject;
        T result = caseAdditionOrSubtraction(additionOrSubtraction);
        if (result == null) result = caseShiftOperator(additionOrSubtraction);
        if (result == null) result = caseBitwiseAnd(additionOrSubtraction);
        if (result == null) result = caseBitwiseXor(additionOrSubtraction);
        if (result == null) result = caseBitwiseOr(additionOrSubtraction);
        if (result == null) result = caseComparisonOperators(additionOrSubtraction);
        if (result == null) result = caseEqualityOperator(additionOrSubtraction);
        if (result == null) result = caseBooleanAnd(additionOrSubtraction);
        if (result == null) result = caseBooleanOr(additionOrSubtraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.SHIFT_OPERATOR:
      {
        ShiftOperator shiftOperator = (ShiftOperator)theEObject;
        T result = caseShiftOperator(shiftOperator);
        if (result == null) result = caseBitwiseAnd(shiftOperator);
        if (result == null) result = caseBitwiseXor(shiftOperator);
        if (result == null) result = caseBitwiseOr(shiftOperator);
        if (result == null) result = caseComparisonOperators(shiftOperator);
        if (result == null) result = caseEqualityOperator(shiftOperator);
        if (result == null) result = caseBooleanAnd(shiftOperator);
        if (result == null) result = caseBooleanOr(shiftOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BITWISE_AND:
      {
        BitwiseAnd bitwiseAnd = (BitwiseAnd)theEObject;
        T result = caseBitwiseAnd(bitwiseAnd);
        if (result == null) result = caseBitwiseXor(bitwiseAnd);
        if (result == null) result = caseBitwiseOr(bitwiseAnd);
        if (result == null) result = caseComparisonOperators(bitwiseAnd);
        if (result == null) result = caseEqualityOperator(bitwiseAnd);
        if (result == null) result = caseBooleanAnd(bitwiseAnd);
        if (result == null) result = caseBooleanOr(bitwiseAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BITWISE_XOR:
      {
        BitwiseXor bitwiseXor = (BitwiseXor)theEObject;
        T result = caseBitwiseXor(bitwiseXor);
        if (result == null) result = caseBitwiseOr(bitwiseXor);
        if (result == null) result = caseComparisonOperators(bitwiseXor);
        if (result == null) result = caseEqualityOperator(bitwiseXor);
        if (result == null) result = caseBooleanAnd(bitwiseXor);
        if (result == null) result = caseBooleanOr(bitwiseXor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BITWISE_OR:
      {
        BitwiseOr bitwiseOr = (BitwiseOr)theEObject;
        T result = caseBitwiseOr(bitwiseOr);
        if (result == null) result = caseComparisonOperators(bitwiseOr);
        if (result == null) result = caseEqualityOperator(bitwiseOr);
        if (result == null) result = caseBooleanAnd(bitwiseOr);
        if (result == null) result = caseBooleanOr(bitwiseOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.COMPARISON_OPERATORS:
      {
        ComparisonOperators comparisonOperators = (ComparisonOperators)theEObject;
        T result = caseComparisonOperators(comparisonOperators);
        if (result == null) result = caseEqualityOperator(comparisonOperators);
        if (result == null) result = caseBooleanAnd(comparisonOperators);
        if (result == null) result = caseBooleanOr(comparisonOperators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EQUALITY_OPERATOR:
      {
        EqualityOperator equalityOperator = (EqualityOperator)theEObject;
        T result = caseEqualityOperator(equalityOperator);
        if (result == null) result = caseBooleanAnd(equalityOperator);
        if (result == null) result = caseBooleanOr(equalityOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOOLEAN_AND:
      {
        BooleanAnd booleanAnd = (BooleanAnd)theEObject;
        T result = caseBooleanAnd(booleanAnd);
        if (result == null) result = caseBooleanOr(booleanAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOOLEAN_OR:
      {
        BooleanOr booleanOr = (BooleanOr)theEObject;
        T result = caseBooleanOr(booleanOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ASSIGN:
      {
        Assign assign = (Assign)theEObject;
        T result = caseAssign(assign);
        if (result == null) result = caseExprBinary(assign);
        if (result == null) result = caseExprRValue(assign);
        if (result == null) result = caseExpr(assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LAMBDA:
      {
        ExprLambda exprLambda = (ExprLambda)theEObject;
        T result = caseExprLambda(exprLambda);
        if (result == null) result = caseExprLeaf(exprLambda);
        if (result == null) result = caseExprRValue(exprLambda);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLambda);
        if (result == null) result = caseExpr(exprLambda);
        if (result == null) result = caseAs(exprLambda);
        if (result == null) result = caseAdditionOrSubtraction(exprLambda);
        if (result == null) result = caseShiftOperator(exprLambda);
        if (result == null) result = caseBitwiseAnd(exprLambda);
        if (result == null) result = caseBitwiseXor(exprLambda);
        if (result == null) result = caseBitwiseOr(exprLambda);
        if (result == null) result = caseComparisonOperators(exprLambda);
        if (result == null) result = caseEqualityOperator(exprLambda);
        if (result == null) result = caseBooleanAnd(exprLambda);
        if (result == null) result = caseBooleanOr(exprLambda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_WHILE:
      {
        ExprWhile exprWhile = (ExprWhile)theEObject;
        T result = caseExprWhile(exprWhile);
        if (result == null) result = caseExprLeaf(exprWhile);
        if (result == null) result = caseExprRValue(exprWhile);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprWhile);
        if (result == null) result = caseExpr(exprWhile);
        if (result == null) result = caseAs(exprWhile);
        if (result == null) result = caseAdditionOrSubtraction(exprWhile);
        if (result == null) result = caseShiftOperator(exprWhile);
        if (result == null) result = caseBitwiseAnd(exprWhile);
        if (result == null) result = caseBitwiseXor(exprWhile);
        if (result == null) result = caseBitwiseOr(exprWhile);
        if (result == null) result = caseComparisonOperators(exprWhile);
        if (result == null) result = caseEqualityOperator(exprWhile);
        if (result == null) result = caseBooleanAnd(exprWhile);
        if (result == null) result = caseBooleanOr(exprWhile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LOOP:
      {
        ExprLoop exprLoop = (ExprLoop)theEObject;
        T result = caseExprLoop(exprLoop);
        if (result == null) result = caseExprLeaf(exprLoop);
        if (result == null) result = caseExprRValue(exprLoop);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLoop);
        if (result == null) result = caseExpr(exprLoop);
        if (result == null) result = caseAs(exprLoop);
        if (result == null) result = caseAdditionOrSubtraction(exprLoop);
        if (result == null) result = caseShiftOperator(exprLoop);
        if (result == null) result = caseBitwiseAnd(exprLoop);
        if (result == null) result = caseBitwiseXor(exprLoop);
        if (result == null) result = caseBitwiseOr(exprLoop);
        if (result == null) result = caseComparisonOperators(exprLoop);
        if (result == null) result = caseEqualityOperator(exprLoop);
        if (result == null) result = caseBooleanAnd(exprLoop);
        if (result == null) result = caseBooleanOr(exprLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BREAK:
      {
        ExprBreak exprBreak = (ExprBreak)theEObject;
        T result = caseExprBreak(exprBreak);
        if (result == null) result = caseExprLeaf(exprBreak);
        if (result == null) result = caseExprRValue(exprBreak);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprBreak);
        if (result == null) result = caseExpr(exprBreak);
        if (result == null) result = caseAs(exprBreak);
        if (result == null) result = caseAdditionOrSubtraction(exprBreak);
        if (result == null) result = caseShiftOperator(exprBreak);
        if (result == null) result = caseBitwiseAnd(exprBreak);
        if (result == null) result = caseBitwiseXor(exprBreak);
        if (result == null) result = caseBitwiseOr(exprBreak);
        if (result == null) result = caseComparisonOperators(exprBreak);
        if (result == null) result = caseEqualityOperator(exprBreak);
        if (result == null) result = caseBooleanAnd(exprBreak);
        if (result == null) result = caseBooleanOr(exprBreak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_CONTINUE:
      {
        ExprContinue exprContinue = (ExprContinue)theEObject;
        T result = caseExprContinue(exprContinue);
        if (result == null) result = caseExprLeaf(exprContinue);
        if (result == null) result = caseExprRValue(exprContinue);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprContinue);
        if (result == null) result = caseExpr(exprContinue);
        if (result == null) result = caseAs(exprContinue);
        if (result == null) result = caseAdditionOrSubtraction(exprContinue);
        if (result == null) result = caseShiftOperator(exprContinue);
        if (result == null) result = caseBitwiseAnd(exprContinue);
        if (result == null) result = caseBitwiseXor(exprContinue);
        if (result == null) result = caseBitwiseOr(exprContinue);
        if (result == null) result = caseComparisonOperators(exprContinue);
        if (result == null) result = caseEqualityOperator(exprContinue);
        if (result == null) result = caseBooleanAnd(exprContinue);
        if (result == null) result = caseBooleanOr(exprContinue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_DO:
      {
        ExprDo exprDo = (ExprDo)theEObject;
        T result = caseExprDo(exprDo);
        if (result == null) result = caseExprLeaf(exprDo);
        if (result == null) result = caseExprRValue(exprDo);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprDo);
        if (result == null) result = caseExpr(exprDo);
        if (result == null) result = caseAs(exprDo);
        if (result == null) result = caseAdditionOrSubtraction(exprDo);
        if (result == null) result = caseShiftOperator(exprDo);
        if (result == null) result = caseBitwiseAnd(exprDo);
        if (result == null) result = caseBitwiseXor(exprDo);
        if (result == null) result = caseBitwiseOr(exprDo);
        if (result == null) result = caseComparisonOperators(exprDo);
        if (result == null) result = caseEqualityOperator(exprDo);
        if (result == null) result = caseBooleanAnd(exprDo);
        if (result == null) result = caseBooleanOr(exprDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_FOR:
      {
        ExprFor exprFor = (ExprFor)theEObject;
        T result = caseExprFor(exprFor);
        if (result == null) result = caseExprLeaf(exprFor);
        if (result == null) result = caseExprRValue(exprFor);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprFor);
        if (result == null) result = caseExpr(exprFor);
        if (result == null) result = caseAs(exprFor);
        if (result == null) result = caseAdditionOrSubtraction(exprFor);
        if (result == null) result = caseShiftOperator(exprFor);
        if (result == null) result = caseBitwiseAnd(exprFor);
        if (result == null) result = caseBitwiseXor(exprFor);
        if (result == null) result = caseBitwiseOr(exprFor);
        if (result == null) result = caseComparisonOperators(exprFor);
        if (result == null) result = caseEqualityOperator(exprFor);
        if (result == null) result = caseBooleanAnd(exprFor);
        if (result == null) result = caseBooleanOr(exprFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_IF:
      {
        ExprIf exprIf = (ExprIf)theEObject;
        T result = caseExprIf(exprIf);
        if (result == null) result = caseExprLeaf(exprIf);
        if (result == null) result = caseElseTail(exprIf);
        if (result == null) result = caseExprRValue(exprIf);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprIf);
        if (result == null) result = caseExpr(exprIf);
        if (result == null) result = caseAs(exprIf);
        if (result == null) result = caseAdditionOrSubtraction(exprIf);
        if (result == null) result = caseShiftOperator(exprIf);
        if (result == null) result = caseBitwiseAnd(exprIf);
        if (result == null) result = caseBitwiseXor(exprIf);
        if (result == null) result = caseBitwiseOr(exprIf);
        if (result == null) result = caseComparisonOperators(exprIf);
        if (result == null) result = caseEqualityOperator(exprIf);
        if (result == null) result = caseBooleanAnd(exprIf);
        if (result == null) result = caseBooleanOr(exprIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ELSE_TAIL:
      {
        ElseTail elseTail = (ElseTail)theEObject;
        T result = caseElseTail(elseTail);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
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
      case RustPackage.PAT_WILDCARD:
      {
        PatWildcard patWildcard = (PatWildcard)theEObject;
        T result = casePatWildcard(patWildcard);
        if (result == null) result = casePat(patWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_IDENT:
      {
        PatIdent patIdent = (PatIdent)theEObject;
        T result = casePatIdent(patIdent);
        if (result == null) result = casePat(patIdent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_BOXED:
      {
        PatBoxed patBoxed = (PatBoxed)theEObject;
        T result = casePatBoxed(patBoxed);
        if (result == null) result = casePat(patBoxed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_OWNED:
      {
        PatOwned patOwned = (PatOwned)theEObject;
        T result = casePatOwned(patOwned);
        if (result == null) result = casePat(patOwned);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_BORROWED:
      {
        PatBorrowed patBorrowed = (PatBorrowed)theEObject;
        T result = casePatBorrowed(patBorrowed);
        if (result == null) result = casePat(patBorrowed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_TUPLE:
      {
        PatTuple patTuple = (PatTuple)theEObject;
        T result = casePatTuple(patTuple);
        if (result == null) result = casePat(patTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_VECTOR:
      {
        PatVector patVector = (PatVector)theEObject;
        T result = casePatVector(patVector);
        if (result == null) result = casePat(patVector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_LITERAL:
      {
        PatLiteral patLiteral = (PatLiteral)theEObject;
        T result = casePatLiteral(patLiteral);
        if (result == null) result = casePat(patLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_RANGE:
      {
        PatRange patRange = (PatRange)theEObject;
        T result = casePatRange(patRange);
        if (result == null) result = casePat(patRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_CHAR_RANGE:
      {
        PatCharRange patCharRange = (PatCharRange)theEObject;
        T result = casePatCharRange(patCharRange);
        if (result == null) result = casePatRange(patCharRange);
        if (result == null) result = casePat(patCharRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_NUMBER_RANGE:
      {
        PatNumberRange patNumberRange = (PatNumberRange)theEObject;
        T result = casePatNumberRange(patNumberRange);
        if (result == null) result = casePatRange(patNumberRange);
        if (result == null) result = casePat(patNumberRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_ENUM:
      {
        PatEnum patEnum = (PatEnum)theEObject;
        T result = casePatEnum(patEnum);
        if (result == null) result = casePat(patEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.FIELD_PAT:
      {
        FieldPat fieldPat = (FieldPat)theEObject;
        T result = caseFieldPat(fieldPat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.TYPE_PATH:
      {
        TypePath typePath = (TypePath)theEObject;
        T result = caseTypePath(typePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_PATH:
      {
        ExprPath exprPath = (ExprPath)theEObject;
        T result = caseExprPath(exprPath);
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
      case RustPackage.NAMED_TYPE:
      {
        NamedType namedType = (NamedType)theEObject;
        T result = caseNamedType(namedType);
        if (result == null) result = caseType(namedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOXED_POINTER:
      {
        BoxedPointer boxedPointer = (BoxedPointer)theEObject;
        T result = caseBoxedPointer(boxedPointer);
        if (result == null) result = caseType(boxedPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.OWNED_POINTER:
      {
        OwnedPointer ownedPointer = (OwnedPointer)theEObject;
        T result = caseOwnedPointer(ownedPointer);
        if (result == null) result = caseType(ownedPointer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BORROWED_POINTER:
      {
        BorrowedPointer borrowedPointer = (BorrowedPointer)theEObject;
        T result = caseBorrowedPointer(borrowedPointer);
        if (result == null) result = caseType(borrowedPointer);
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
      case RustPackage.DIVISION:
      {
        Division division = (Division)theEObject;
        T result = caseDivision(division);
        if (result == null) result = caseDivisionMultiplicationOrModulo(division);
        if (result == null) result = caseAs(division);
        if (result == null) result = caseAdditionOrSubtraction(division);
        if (result == null) result = caseShiftOperator(division);
        if (result == null) result = caseBitwiseAnd(division);
        if (result == null) result = caseBitwiseXor(division);
        if (result == null) result = caseBitwiseOr(division);
        if (result == null) result = caseComparisonOperators(division);
        if (result == null) result = caseEqualityOperator(division);
        if (result == null) result = caseBooleanAnd(division);
        if (result == null) result = caseBooleanOr(division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseDivisionMultiplicationOrModulo(multiplication);
        if (result == null) result = caseAs(multiplication);
        if (result == null) result = caseAdditionOrSubtraction(multiplication);
        if (result == null) result = caseShiftOperator(multiplication);
        if (result == null) result = caseBitwiseAnd(multiplication);
        if (result == null) result = caseBitwiseXor(multiplication);
        if (result == null) result = caseBitwiseOr(multiplication);
        if (result == null) result = caseComparisonOperators(multiplication);
        if (result == null) result = caseEqualityOperator(multiplication);
        if (result == null) result = caseBooleanAnd(multiplication);
        if (result == null) result = caseBooleanOr(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MODULO:
      {
        Modulo modulo = (Modulo)theEObject;
        T result = caseModulo(modulo);
        if (result == null) result = caseDivisionMultiplicationOrModulo(modulo);
        if (result == null) result = caseAs(modulo);
        if (result == null) result = caseAdditionOrSubtraction(modulo);
        if (result == null) result = caseShiftOperator(modulo);
        if (result == null) result = caseBitwiseAnd(modulo);
        if (result == null) result = caseBitwiseXor(modulo);
        if (result == null) result = caseBitwiseOr(modulo);
        if (result == null) result = caseComparisonOperators(modulo);
        if (result == null) result = caseEqualityOperator(modulo);
        if (result == null) result = caseBooleanAnd(modulo);
        if (result == null) result = caseBooleanOr(modulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_CAST:
      {
        ExprCast exprCast = (ExprCast)theEObject;
        T result = caseExprCast(exprCast);
        if (result == null) result = caseAs(exprCast);
        if (result == null) result = caseAdditionOrSubtraction(exprCast);
        if (result == null) result = caseShiftOperator(exprCast);
        if (result == null) result = caseBitwiseAnd(exprCast);
        if (result == null) result = caseBitwiseXor(exprCast);
        if (result == null) result = caseBitwiseOr(exprCast);
        if (result == null) result = caseComparisonOperators(exprCast);
        if (result == null) result = caseEqualityOperator(exprCast);
        if (result == null) result = caseBooleanAnd(exprCast);
        if (result == null) result = caseBooleanOr(exprCast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_ADDITION:
      {
        ExprAddition exprAddition = (ExprAddition)theEObject;
        T result = caseExprAddition(exprAddition);
        if (result == null) result = caseAdditionOrSubtraction(exprAddition);
        if (result == null) result = caseShiftOperator(exprAddition);
        if (result == null) result = caseBitwiseAnd(exprAddition);
        if (result == null) result = caseBitwiseXor(exprAddition);
        if (result == null) result = caseBitwiseOr(exprAddition);
        if (result == null) result = caseComparisonOperators(exprAddition);
        if (result == null) result = caseEqualityOperator(exprAddition);
        if (result == null) result = caseBooleanAnd(exprAddition);
        if (result == null) result = caseBooleanOr(exprAddition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_SUBTRACTION:
      {
        ExprSubtraction exprSubtraction = (ExprSubtraction)theEObject;
        T result = caseExprSubtraction(exprSubtraction);
        if (result == null) result = caseAdditionOrSubtraction(exprSubtraction);
        if (result == null) result = caseShiftOperator(exprSubtraction);
        if (result == null) result = caseBitwiseAnd(exprSubtraction);
        if (result == null) result = caseBitwiseXor(exprSubtraction);
        if (result == null) result = caseBitwiseOr(exprSubtraction);
        if (result == null) result = caseComparisonOperators(exprSubtraction);
        if (result == null) result = caseEqualityOperator(exprSubtraction);
        if (result == null) result = caseBooleanAnd(exprSubtraction);
        if (result == null) result = caseBooleanOr(exprSubtraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LEFT_SHIFT:
      {
        ExprLeftShift exprLeftShift = (ExprLeftShift)theEObject;
        T result = caseExprLeftShift(exprLeftShift);
        if (result == null) result = caseShiftOperator(exprLeftShift);
        if (result == null) result = caseBitwiseAnd(exprLeftShift);
        if (result == null) result = caseBitwiseXor(exprLeftShift);
        if (result == null) result = caseBitwiseOr(exprLeftShift);
        if (result == null) result = caseComparisonOperators(exprLeftShift);
        if (result == null) result = caseEqualityOperator(exprLeftShift);
        if (result == null) result = caseBooleanAnd(exprLeftShift);
        if (result == null) result = caseBooleanOr(exprLeftShift);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_RIGHT_SHIFT:
      {
        ExprRightShift exprRightShift = (ExprRightShift)theEObject;
        T result = caseExprRightShift(exprRightShift);
        if (result == null) result = caseShiftOperator(exprRightShift);
        if (result == null) result = caseBitwiseAnd(exprRightShift);
        if (result == null) result = caseBitwiseXor(exprRightShift);
        if (result == null) result = caseBitwiseOr(exprRightShift);
        if (result == null) result = caseComparisonOperators(exprRightShift);
        if (result == null) result = caseEqualityOperator(exprRightShift);
        if (result == null) result = caseBooleanAnd(exprRightShift);
        if (result == null) result = caseBooleanOr(exprRightShift);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BITWISE_AND:
      {
        ExprBitwiseAnd exprBitwiseAnd = (ExprBitwiseAnd)theEObject;
        T result = caseExprBitwiseAnd(exprBitwiseAnd);
        if (result == null) result = caseBitwiseAnd(exprBitwiseAnd);
        if (result == null) result = caseBitwiseXor(exprBitwiseAnd);
        if (result == null) result = caseBitwiseOr(exprBitwiseAnd);
        if (result == null) result = caseComparisonOperators(exprBitwiseAnd);
        if (result == null) result = caseEqualityOperator(exprBitwiseAnd);
        if (result == null) result = caseBooleanAnd(exprBitwiseAnd);
        if (result == null) result = caseBooleanOr(exprBitwiseAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BITWISE_XOR:
      {
        ExprBitwiseXor exprBitwiseXor = (ExprBitwiseXor)theEObject;
        T result = caseExprBitwiseXor(exprBitwiseXor);
        if (result == null) result = caseBitwiseXor(exprBitwiseXor);
        if (result == null) result = caseBitwiseOr(exprBitwiseXor);
        if (result == null) result = caseComparisonOperators(exprBitwiseXor);
        if (result == null) result = caseEqualityOperator(exprBitwiseXor);
        if (result == null) result = caseBooleanAnd(exprBitwiseXor);
        if (result == null) result = caseBooleanOr(exprBitwiseXor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BITWISE_OR:
      {
        ExprBitwiseOr exprBitwiseOr = (ExprBitwiseOr)theEObject;
        T result = caseExprBitwiseOr(exprBitwiseOr);
        if (result == null) result = caseBitwiseOr(exprBitwiseOr);
        if (result == null) result = caseComparisonOperators(exprBitwiseOr);
        if (result == null) result = caseEqualityOperator(exprBitwiseOr);
        if (result == null) result = caseBooleanAnd(exprBitwiseOr);
        if (result == null) result = caseBooleanOr(exprBitwiseOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LESS_THAN:
      {
        ExprLessThan exprLessThan = (ExprLessThan)theEObject;
        T result = caseExprLessThan(exprLessThan);
        if (result == null) result = caseComparisonOperators(exprLessThan);
        if (result == null) result = caseEqualityOperator(exprLessThan);
        if (result == null) result = caseBooleanAnd(exprLessThan);
        if (result == null) result = caseBooleanOr(exprLessThan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_GREATER_THAN:
      {
        ExprGreaterThan exprGreaterThan = (ExprGreaterThan)theEObject;
        T result = caseExprGreaterThan(exprGreaterThan);
        if (result == null) result = caseComparisonOperators(exprGreaterThan);
        if (result == null) result = caseEqualityOperator(exprGreaterThan);
        if (result == null) result = caseBooleanAnd(exprGreaterThan);
        if (result == null) result = caseBooleanOr(exprGreaterThan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LESS_THAN_OR_EQUAL_TO:
      {
        ExprLessThanOrEqualTo exprLessThanOrEqualTo = (ExprLessThanOrEqualTo)theEObject;
        T result = caseExprLessThanOrEqualTo(exprLessThanOrEqualTo);
        if (result == null) result = caseComparisonOperators(exprLessThanOrEqualTo);
        if (result == null) result = caseEqualityOperator(exprLessThanOrEqualTo);
        if (result == null) result = caseBooleanAnd(exprLessThanOrEqualTo);
        if (result == null) result = caseBooleanOr(exprLessThanOrEqualTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_GREATER_THAN_OR_EQUAL_TO:
      {
        ExprGreaterThanOrEqualTo exprGreaterThanOrEqualTo = (ExprGreaterThanOrEqualTo)theEObject;
        T result = caseExprGreaterThanOrEqualTo(exprGreaterThanOrEqualTo);
        if (result == null) result = caseComparisonOperators(exprGreaterThanOrEqualTo);
        if (result == null) result = caseEqualityOperator(exprGreaterThanOrEqualTo);
        if (result == null) result = caseBooleanAnd(exprGreaterThanOrEqualTo);
        if (result == null) result = caseBooleanOr(exprGreaterThanOrEqualTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_EQUAL_TO:
      {
        ExprEqualTo exprEqualTo = (ExprEqualTo)theEObject;
        T result = caseExprEqualTo(exprEqualTo);
        if (result == null) result = caseEqualityOperator(exprEqualTo);
        if (result == null) result = caseBooleanAnd(exprEqualTo);
        if (result == null) result = caseBooleanOr(exprEqualTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_NOT_EQUAL_TO:
      {
        ExprNotEqualTo exprNotEqualTo = (ExprNotEqualTo)theEObject;
        T result = caseExprNotEqualTo(exprNotEqualTo);
        if (result == null) result = caseEqualityOperator(exprNotEqualTo);
        if (result == null) result = caseBooleanAnd(exprNotEqualTo);
        if (result == null) result = caseBooleanOr(exprNotEqualTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BOOLEAN_AND:
      {
        ExprBooleanAnd exprBooleanAnd = (ExprBooleanAnd)theEObject;
        T result = caseExprBooleanAnd(exprBooleanAnd);
        if (result == null) result = caseBooleanAnd(exprBooleanAnd);
        if (result == null) result = caseBooleanOr(exprBooleanAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BOOLEAN_OR:
      {
        ExprBooleanOr exprBooleanOr = (ExprBooleanOr)theEObject;
        T result = caseExprBooleanOr(exprBooleanOr);
        if (result == null) result = caseBooleanOr(exprBooleanOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_ASSIGN:
      {
        ExprAssign exprAssign = (ExprAssign)theEObject;
        T result = caseExprAssign(exprAssign);
        if (result == null) result = caseAssign(exprAssign);
        if (result == null) result = caseExprBinary(exprAssign);
        if (result == null) result = caseExprRValue(exprAssign);
        if (result == null) result = caseExpr(exprAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_TUPLE_ENUM:
      {
        PatTupleEnum patTupleEnum = (PatTupleEnum)theEObject;
        T result = casePatTupleEnum(patTupleEnum);
        if (result == null) result = casePatEnum(patTupleEnum);
        if (result == null) result = casePat(patTupleEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_STRUCT_ENUM:
      {
        PatStructEnum patStructEnum = (PatStructEnum)theEObject;
        T result = casePatStructEnum(patStructEnum);
        if (result == null) result = casePatEnum(patStructEnum);
        if (result == null) result = casePat(patStructEnum);
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
   * Returns the result of interpreting the object as an instance of '<em>Type Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeItem(TypeItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructItem(StructItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumItem(EnumItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Variant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Variant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumVariant(EnumVariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitItem(TraitItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraitMethod(TraitMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impl Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impl Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplItem(ImplItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impl Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impl Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplMethod(ImplMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternBlock(ExternBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreign Fn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreign Fn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeignFn(ForeignFn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticItem(StaticItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr LValue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr LValue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLValue(ExprLValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr RValue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr RValue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprRValue(ExprRValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Leaf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Leaf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLeaf(ExprLeaf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLiteral(ExprLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Path Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Path Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprPathHead(ExprPathHead object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprGroup(ExprGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprTuple(ExprTuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Struct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprStruct(ExprStruct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Vec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Vec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprVec(ExprVec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Unary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Unary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprUnary(ExprUnary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericNegation(NumericNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dereference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dereference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDereference(Dereference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalNegation(LogicalNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Managed Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Managed Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManagedBox(ManagedBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owned Box</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owned Box</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwnedBox(OwnedBox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Borrow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Borrow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorrow(Borrow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBinary(ExprBinary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division Multiplication Or Modulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division Multiplication Or Modulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivisionMultiplicationOrModulo(DivisionMultiplicationOrModulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>As</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>As</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAs(As object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition Or Subtraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition Or Subtraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionOrSubtraction(AdditionOrSubtraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Shift Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShiftOperator(ShiftOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseAnd(BitwiseAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseXor(BitwiseXor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bitwise Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bitwise Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitwiseOr(BitwiseOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Operators</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Operators</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonOperators(ComparisonOperators object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityOperator(EqualityOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanAnd(BooleanAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanOr(BooleanOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssign(Assign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Lambda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Lambda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLambda(ExprLambda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprWhile(ExprWhile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLoop(ExprLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Break</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Break</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBreak(ExprBreak object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Continue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Continue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprContinue(ExprContinue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Do</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Do</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprDo(ExprDo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprFor(ExprFor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprIf(ExprIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Tail</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Tail</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseTail(ElseTail object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
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
   * Returns the result of interpreting the object as an instance of '<em>Pat Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatWildcard(PatWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Ident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Ident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatIdent(PatIdent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Boxed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Boxed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatBoxed(PatBoxed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Owned</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Owned</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatOwned(PatOwned object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Borrowed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Borrowed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatBorrowed(PatBorrowed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatTuple(PatTuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatVector(PatVector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatLiteral(PatLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatRange(PatRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Char Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Char Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatCharRange(PatCharRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Number Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Number Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatNumberRange(PatNumberRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatEnum(PatEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Pat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Pat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldPat(FieldPat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePath(TypePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprPath(ExprPath object)
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
   * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedType(NamedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boxed Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boxed Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxedPointer(BoxedPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owned Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owned Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwnedPointer(OwnedPointer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Borrowed Pointer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Borrowed Pointer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorrowedPointer(BorrowedPointer object)
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
   * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivision(Division object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModulo(Modulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Cast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Cast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprCast(ExprCast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAddition(ExprAddition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Subtraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Subtraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprSubtraction(ExprSubtraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Left Shift</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Left Shift</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLeftShift(ExprLeftShift object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Right Shift</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Right Shift</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprRightShift(ExprRightShift object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Bitwise And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Bitwise And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBitwiseAnd(ExprBitwiseAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Bitwise Xor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Bitwise Xor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBitwiseXor(ExprBitwiseXor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Bitwise Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Bitwise Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBitwiseOr(ExprBitwiseOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Less Than</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Less Than</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLessThan(ExprLessThan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Greater Than</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Greater Than</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprGreaterThan(ExprGreaterThan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Less Than Or Equal To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Less Than Or Equal To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprLessThanOrEqualTo(ExprLessThanOrEqualTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Greater Than Or Equal To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Greater Than Or Equal To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprGreaterThanOrEqualTo(ExprGreaterThanOrEqualTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Equal To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Equal To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprEqualTo(ExprEqualTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Not Equal To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Not Equal To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprNotEqualTo(ExprNotEqualTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Boolean And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Boolean And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBooleanAnd(ExprBooleanAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Boolean Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Boolean Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprBooleanOr(ExprBooleanOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAssign(ExprAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Tuple Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Tuple Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatTupleEnum(PatTupleEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pat Struct Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pat Struct Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatStructEnum(PatStructEnum object)
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
