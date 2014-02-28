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
      case RustPackage.VIEW_ITEM:
      {
        ViewItem viewItem = (ViewItem)theEObject;
        T result = caseViewItem(viewItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXTERN_MOD_DECL:
      {
        ExternModDecl externModDecl = (ExternModDecl)theEObject;
        T result = caseExternModDecl(externModDecl);
        if (result == null) result = caseViewItem(externModDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.LINK_ATTR:
      {
        LinkAttr linkAttr = (LinkAttr)theEObject;
        T result = caseLinkAttr(linkAttr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.USE_DECL:
      {
        UseDecl useDecl = (UseDecl)theEObject;
        T result = caseUseDecl(useDecl);
        if (result == null) result = caseViewItem(useDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PATH_GLOB:
      {
        PathGlob pathGlob = (PathGlob)theEObject;
        T result = casePathGlob(pathGlob);
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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LEAF:
      {
        ExprLeaf exprLeaf = (ExprLeaf)theEObject;
        T result = caseExprLeaf(exprLeaf);
        if (result == null) result = caseExprFields(exprLeaf);
        if (result == null) result = caseExprUnary(exprLeaf);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLeaf);
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
        if (result == null) result = caseAssign(exprLeaf);
        if (result == null) result = caseExprBinary(exprLeaf);
        if (result == null) result = caseExpr(exprLeaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_FN_CALL_ARGS:
      {
        ExprFnCallArgs exprFnCallArgs = (ExprFnCallArgs)theEObject;
        T result = caseExprFnCallArgs(exprFnCallArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_PRIMARY:
      {
        ExprPrimary exprPrimary = (ExprPrimary)theEObject;
        T result = caseExprPrimary(exprPrimary);
        if (result == null) result = caseExprLeaf(exprPrimary);
        if (result == null) result = caseExprFields(exprPrimary);
        if (result == null) result = caseExprUnary(exprPrimary);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprPrimary);
        if (result == null) result = caseAs(exprPrimary);
        if (result == null) result = caseAdditionOrSubtraction(exprPrimary);
        if (result == null) result = caseShiftOperator(exprPrimary);
        if (result == null) result = caseBitwiseAnd(exprPrimary);
        if (result == null) result = caseBitwiseXor(exprPrimary);
        if (result == null) result = caseBitwiseOr(exprPrimary);
        if (result == null) result = caseComparisonOperators(exprPrimary);
        if (result == null) result = caseEqualityOperator(exprPrimary);
        if (result == null) result = caseBooleanAnd(exprPrimary);
        if (result == null) result = caseBooleanOr(exprPrimary);
        if (result == null) result = caseAssign(exprPrimary);
        if (result == null) result = caseExprBinary(exprPrimary);
        if (result == null) result = caseExpr(exprPrimary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LITERAL:
      {
        ExprLiteral exprLiteral = (ExprLiteral)theEObject;
        T result = caseExprLiteral(exprLiteral);
        if (result == null) result = caseExprPrimary(exprLiteral);
        if (result == null) result = caseExprLeaf(exprLiteral);
        if (result == null) result = caseExprFields(exprLiteral);
        if (result == null) result = caseExprUnary(exprLiteral);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprLiteral);
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
        if (result == null) result = caseAssign(exprLiteral);
        if (result == null) result = caseExprBinary(exprLiteral);
        if (result == null) result = caseExpr(exprLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_GROUP:
      {
        ExprGroup exprGroup = (ExprGroup)theEObject;
        T result = caseExprGroup(exprGroup);
        if (result == null) result = caseExprPrimary(exprGroup);
        if (result == null) result = caseExprLeaf(exprGroup);
        if (result == null) result = caseExprFields(exprGroup);
        if (result == null) result = caseExprUnary(exprGroup);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprGroup);
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
        if (result == null) result = caseAssign(exprGroup);
        if (result == null) result = caseExprBinary(exprGroup);
        if (result == null) result = caseExpr(exprGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_STRUCT:
      {
        ExprStruct exprStruct = (ExprStruct)theEObject;
        T result = caseExprStruct(exprStruct);
        if (result == null) result = caseExprPrimary(exprStruct);
        if (result == null) result = caseExprLeaf(exprStruct);
        if (result == null) result = caseExprFields(exprStruct);
        if (result == null) result = caseExprUnary(exprStruct);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprStruct);
        if (result == null) result = caseAs(exprStruct);
        if (result == null) result = caseAdditionOrSubtraction(exprStruct);
        if (result == null) result = caseShiftOperator(exprStruct);
        if (result == null) result = caseBitwiseAnd(exprStruct);
        if (result == null) result = caseBitwiseXor(exprStruct);
        if (result == null) result = caseBitwiseOr(exprStruct);
        if (result == null) result = caseComparisonOperators(exprStruct);
        if (result == null) result = caseEqualityOperator(exprStruct);
        if (result == null) result = caseBooleanAnd(exprStruct);
        if (result == null) result = caseBooleanOr(exprStruct);
        if (result == null) result = caseAssign(exprStruct);
        if (result == null) result = caseExprBinary(exprStruct);
        if (result == null) result = caseExpr(exprStruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_VEC:
      {
        ExprVec exprVec = (ExprVec)theEObject;
        T result = caseExprVec(exprVec);
        if (result == null) result = caseExprPrimary(exprVec);
        if (result == null) result = caseExprLeaf(exprVec);
        if (result == null) result = caseExprFields(exprVec);
        if (result == null) result = caseExprUnary(exprVec);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprVec);
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
        if (result == null) result = caseAssign(exprVec);
        if (result == null) result = caseExprBinary(exprVec);
        if (result == null) result = caseExpr(exprVec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_UNARY:
      {
        ExprUnary exprUnary = (ExprUnary)theEObject;
        T result = caseExprUnary(exprUnary);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprUnary);
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
        if (result == null) result = caseAssign(exprUnary);
        if (result == null) result = caseExprBinary(exprUnary);
        if (result == null) result = caseExpr(exprUnary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.NUMERIC_NEGATION:
      {
        NumericNegation numericNegation = (NumericNegation)theEObject;
        T result = caseNumericNegation(numericNegation);
        if (result == null) result = caseExprUnary(numericNegation);
        if (result == null) result = caseDivisionMultiplicationOrModulo(numericNegation);
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
        if (result == null) result = caseAssign(numericNegation);
        if (result == null) result = caseExprBinary(numericNegation);
        if (result == null) result = caseExpr(numericNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.DEREFERENCE:
      {
        Dereference dereference = (Dereference)theEObject;
        T result = caseDereference(dereference);
        if (result == null) result = caseExprUnary(dereference);
        if (result == null) result = caseDivisionMultiplicationOrModulo(dereference);
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
        if (result == null) result = caseAssign(dereference);
        if (result == null) result = caseExprBinary(dereference);
        if (result == null) result = caseExpr(dereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.LOGICAL_NEGATION:
      {
        LogicalNegation logicalNegation = (LogicalNegation)theEObject;
        T result = caseLogicalNegation(logicalNegation);
        if (result == null) result = caseExprUnary(logicalNegation);
        if (result == null) result = caseDivisionMultiplicationOrModulo(logicalNegation);
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
        if (result == null) result = caseAssign(logicalNegation);
        if (result == null) result = caseExprBinary(logicalNegation);
        if (result == null) result = caseExpr(logicalNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MANAGED_BOX:
      {
        ManagedBox managedBox = (ManagedBox)theEObject;
        T result = caseManagedBox(managedBox);
        if (result == null) result = caseExprUnary(managedBox);
        if (result == null) result = caseDivisionMultiplicationOrModulo(managedBox);
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
        if (result == null) result = caseAssign(managedBox);
        if (result == null) result = caseExprBinary(managedBox);
        if (result == null) result = caseExpr(managedBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.OWNED_BOX:
      {
        OwnedBox ownedBox = (OwnedBox)theEObject;
        T result = caseOwnedBox(ownedBox);
        if (result == null) result = caseExprUnary(ownedBox);
        if (result == null) result = caseDivisionMultiplicationOrModulo(ownedBox);
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
        if (result == null) result = caseAssign(ownedBox);
        if (result == null) result = caseExprBinary(ownedBox);
        if (result == null) result = caseExpr(ownedBox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BORROW:
      {
        Borrow borrow = (Borrow)theEObject;
        T result = caseBorrow(borrow);
        if (result == null) result = caseExprUnary(borrow);
        if (result == null) result = caseDivisionMultiplicationOrModulo(borrow);
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
        if (result == null) result = caseAssign(borrow);
        if (result == null) result = caseExprBinary(borrow);
        if (result == null) result = caseExpr(borrow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_FIELDS:
      {
        ExprFields exprFields = (ExprFields)theEObject;
        T result = caseExprFields(exprFields);
        if (result == null) result = caseExprUnary(exprFields);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprFields);
        if (result == null) result = caseAs(exprFields);
        if (result == null) result = caseAdditionOrSubtraction(exprFields);
        if (result == null) result = caseShiftOperator(exprFields);
        if (result == null) result = caseBitwiseAnd(exprFields);
        if (result == null) result = caseBitwiseXor(exprFields);
        if (result == null) result = caseBitwiseOr(exprFields);
        if (result == null) result = caseComparisonOperators(exprFields);
        if (result == null) result = caseEqualityOperator(exprFields);
        if (result == null) result = caseBooleanAnd(exprFields);
        if (result == null) result = caseBooleanOr(exprFields);
        if (result == null) result = caseAssign(exprFields);
        if (result == null) result = caseExprBinary(exprFields);
        if (result == null) result = caseExpr(exprFields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_FIELD_OR_METHOD_CALL:
      {
        ExprFieldOrMethodCall exprFieldOrMethodCall = (ExprFieldOrMethodCall)theEObject;
        T result = caseExprFieldOrMethodCall(exprFieldOrMethodCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BINARY:
      {
        ExprBinary exprBinary = (ExprBinary)theEObject;
        T result = caseExprBinary(exprBinary);
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
        if (result == null) result = caseAssign(divisionMultiplicationOrModulo);
        if (result == null) result = caseExprBinary(divisionMultiplicationOrModulo);
        if (result == null) result = caseExpr(divisionMultiplicationOrModulo);
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
        if (result == null) result = caseAssign(as);
        if (result == null) result = caseExprBinary(as);
        if (result == null) result = caseExpr(as);
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
        if (result == null) result = caseAssign(additionOrSubtraction);
        if (result == null) result = caseExprBinary(additionOrSubtraction);
        if (result == null) result = caseExpr(additionOrSubtraction);
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
        if (result == null) result = caseAssign(shiftOperator);
        if (result == null) result = caseExprBinary(shiftOperator);
        if (result == null) result = caseExpr(shiftOperator);
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
        if (result == null) result = caseAssign(bitwiseAnd);
        if (result == null) result = caseExprBinary(bitwiseAnd);
        if (result == null) result = caseExpr(bitwiseAnd);
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
        if (result == null) result = caseAssign(bitwiseXor);
        if (result == null) result = caseExprBinary(bitwiseXor);
        if (result == null) result = caseExpr(bitwiseXor);
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
        if (result == null) result = caseAssign(bitwiseOr);
        if (result == null) result = caseExprBinary(bitwiseOr);
        if (result == null) result = caseExpr(bitwiseOr);
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
        if (result == null) result = caseAssign(comparisonOperators);
        if (result == null) result = caseExprBinary(comparisonOperators);
        if (result == null) result = caseExpr(comparisonOperators);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EQUALITY_OPERATOR:
      {
        EqualityOperator equalityOperator = (EqualityOperator)theEObject;
        T result = caseEqualityOperator(equalityOperator);
        if (result == null) result = caseBooleanAnd(equalityOperator);
        if (result == null) result = caseBooleanOr(equalityOperator);
        if (result == null) result = caseAssign(equalityOperator);
        if (result == null) result = caseExprBinary(equalityOperator);
        if (result == null) result = caseExpr(equalityOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOOLEAN_AND:
      {
        BooleanAnd booleanAnd = (BooleanAnd)theEObject;
        T result = caseBooleanAnd(booleanAnd);
        if (result == null) result = caseBooleanOr(booleanAnd);
        if (result == null) result = caseAssign(booleanAnd);
        if (result == null) result = caseExprBinary(booleanAnd);
        if (result == null) result = caseExpr(booleanAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOOLEAN_OR:
      {
        BooleanOr booleanOr = (BooleanOr)theEObject;
        T result = caseBooleanOr(booleanOr);
        if (result == null) result = caseAssign(booleanOr);
        if (result == null) result = caseExprBinary(booleanOr);
        if (result == null) result = caseExpr(booleanOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.ASSIGN:
      {
        Assign assign = (Assign)theEObject;
        T result = caseAssign(assign);
        if (result == null) result = caseExprBinary(assign);
        if (result == null) result = caseExpr(assign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LAMBDA:
      {
        ExprLambda exprLambda = (ExprLambda)theEObject;
        T result = caseExprLambda(exprLambda);
        if (result == null) result = caseExpr(exprLambda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_WHILE:
      {
        ExprWhile exprWhile = (ExprWhile)theEObject;
        T result = caseExprWhile(exprWhile);
        if (result == null) result = caseExpr(exprWhile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LOOP:
      {
        ExprLoop exprLoop = (ExprLoop)theEObject;
        T result = caseExprLoop(exprLoop);
        if (result == null) result = caseExpr(exprLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BREAK:
      {
        ExprBreak exprBreak = (ExprBreak)theEObject;
        T result = caseExprBreak(exprBreak);
        if (result == null) result = caseExpr(exprBreak);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_CONTINUE:
      {
        ExprContinue exprContinue = (ExprContinue)theEObject;
        T result = caseExprContinue(exprContinue);
        if (result == null) result = caseExpr(exprContinue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_DO:
      {
        ExprDo exprDo = (ExprDo)theEObject;
        T result = caseExprDo(exprDo);
        if (result == null) result = caseExpr(exprDo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_FOR:
      {
        ExprFor exprFor = (ExprFor)theEObject;
        T result = caseExprFor(exprFor);
        if (result == null) result = caseExpr(exprFor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_IF:
      {
        ExprIf exprIf = (ExprIf)theEObject;
        T result = caseExprIf(exprIf);
        if (result == null) result = caseExpr(exprIf);
        if (result == null) result = caseElseTail(exprIf);
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
      case RustPackage.EXPR_MATCH:
      {
        ExprMatch exprMatch = (ExprMatch)theEObject;
        T result = caseExprMatch(exprMatch);
        if (result == null) result = caseExpr(exprMatch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MATCH_ARM:
      {
        MatchArm matchArm = (MatchArm)theEObject;
        T result = caseMatchArm(matchArm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.MATCH_PAT:
      {
        MatchPat matchPat = (MatchPat)theEObject;
        T result = caseMatchPat(matchPat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_RETURN:
      {
        ExprReturn exprReturn = (ExprReturn)theEObject;
        T result = caseExprReturn(exprReturn);
        if (result == null) result = caseExpr(exprReturn);
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
      case RustPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.SLOT_DECL_STMT:
      {
        SlotDeclStmt slotDeclStmt = (SlotDeclStmt)theEObject;
        T result = caseSlotDeclStmt(slotDeclStmt);
        if (result == null) result = caseStmt(slotDeclStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_STMT:
      {
        ExprStmt exprStmt = (ExprStmt)theEObject;
        T result = caseExprStmt(exprStmt);
        if (result == null) result = caseStmt(exprStmt);
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
      case RustPackage.PAT_ENUM:
      {
        PatEnum patEnum = (PatEnum)theEObject;
        T result = casePatEnum(patEnum);
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
        if (result == null) result = caseExprPrimary(exprPath);
        if (result == null) result = caseExprLeaf(exprPath);
        if (result == null) result = caseExprFields(exprPath);
        if (result == null) result = caseExprUnary(exprPath);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprPath);
        if (result == null) result = caseAs(exprPath);
        if (result == null) result = caseAdditionOrSubtraction(exprPath);
        if (result == null) result = caseShiftOperator(exprPath);
        if (result == null) result = caseBitwiseAnd(exprPath);
        if (result == null) result = caseBitwiseXor(exprPath);
        if (result == null) result = caseBitwiseOr(exprPath);
        if (result == null) result = caseComparisonOperators(exprPath);
        if (result == null) result = caseEqualityOperator(exprPath);
        if (result == null) result = caseBooleanAnd(exprPath);
        if (result == null) result = caseBooleanOr(exprPath);
        if (result == null) result = caseAssign(exprPath);
        if (result == null) result = caseExprBinary(exprPath);
        if (result == null) result = caseExpr(exprPath);
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
      case RustPackage.TEXTUAL_TYPE:
      {
        TextualType textualType = (TextualType)theEObject;
        T result = caseTextualType(textualType);
        if (result == null) result = caseType(textualType);
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
      case RustPackage.EXPR_FIELD:
      {
        ExprField exprField = (ExprField)theEObject;
        T result = caseExprField(exprField);
        if (result == null) result = caseExprLValue(exprField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_INDEX:
      {
        ExprIndex exprIndex = (ExprIndex)theEObject;
        T result = caseExprIndex(exprIndex);
        if (result == null) result = caseExprLValue(exprIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_CALL:
      {
        ExprCall exprCall = (ExprCall)theEObject;
        T result = caseExprCall(exprCall);
        if (result == null) result = caseExprLeaf(exprCall);
        if (result == null) result = caseExprFields(exprCall);
        if (result == null) result = caseExprUnary(exprCall);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprCall);
        if (result == null) result = caseAs(exprCall);
        if (result == null) result = caseAdditionOrSubtraction(exprCall);
        if (result == null) result = caseShiftOperator(exprCall);
        if (result == null) result = caseBitwiseAnd(exprCall);
        if (result == null) result = caseBitwiseXor(exprCall);
        if (result == null) result = caseBitwiseOr(exprCall);
        if (result == null) result = caseComparisonOperators(exprCall);
        if (result == null) result = caseEqualityOperator(exprCall);
        if (result == null) result = caseBooleanAnd(exprCall);
        if (result == null) result = caseBooleanOr(exprCall);
        if (result == null) result = caseAssign(exprCall);
        if (result == null) result = caseExprBinary(exprCall);
        if (result == null) result = caseExpr(exprCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_TUPLE:
      {
        ExprTuple exprTuple = (ExprTuple)theEObject;
        T result = caseExprTuple(exprTuple);
        if (result == null) result = caseExprGroup(exprTuple);
        if (result == null) result = caseExprPrimary(exprTuple);
        if (result == null) result = caseExprLeaf(exprTuple);
        if (result == null) result = caseExprFields(exprTuple);
        if (result == null) result = caseExprUnary(exprTuple);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprTuple);
        if (result == null) result = caseAs(exprTuple);
        if (result == null) result = caseAdditionOrSubtraction(exprTuple);
        if (result == null) result = caseShiftOperator(exprTuple);
        if (result == null) result = caseBitwiseAnd(exprTuple);
        if (result == null) result = caseBitwiseXor(exprTuple);
        if (result == null) result = caseBitwiseOr(exprTuple);
        if (result == null) result = caseComparisonOperators(exprTuple);
        if (result == null) result = caseEqualityOperator(exprTuple);
        if (result == null) result = caseBooleanAnd(exprTuple);
        if (result == null) result = caseBooleanOr(exprTuple);
        if (result == null) result = caseAssign(exprTuple);
        if (result == null) result = caseExprBinary(exprTuple);
        if (result == null) result = caseExpr(exprTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_MULTIPLICATIVE:
      {
        ExprMultiplicative exprMultiplicative = (ExprMultiplicative)theEObject;
        T result = caseExprMultiplicative(exprMultiplicative);
        if (result == null) result = caseDivisionMultiplicationOrModulo(exprMultiplicative);
        if (result == null) result = caseAs(exprMultiplicative);
        if (result == null) result = caseAdditionOrSubtraction(exprMultiplicative);
        if (result == null) result = caseShiftOperator(exprMultiplicative);
        if (result == null) result = caseBitwiseAnd(exprMultiplicative);
        if (result == null) result = caseBitwiseXor(exprMultiplicative);
        if (result == null) result = caseBitwiseOr(exprMultiplicative);
        if (result == null) result = caseComparisonOperators(exprMultiplicative);
        if (result == null) result = caseEqualityOperator(exprMultiplicative);
        if (result == null) result = caseBooleanAnd(exprMultiplicative);
        if (result == null) result = caseBooleanOr(exprMultiplicative);
        if (result == null) result = caseAssign(exprMultiplicative);
        if (result == null) result = caseExprBinary(exprMultiplicative);
        if (result == null) result = caseExpr(exprMultiplicative);
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
        if (result == null) result = caseAssign(exprCast);
        if (result == null) result = caseExprBinary(exprCast);
        if (result == null) result = caseExpr(exprCast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_ADDITIVE:
      {
        ExprAdditive exprAdditive = (ExprAdditive)theEObject;
        T result = caseExprAdditive(exprAdditive);
        if (result == null) result = caseAdditionOrSubtraction(exprAdditive);
        if (result == null) result = caseShiftOperator(exprAdditive);
        if (result == null) result = caseBitwiseAnd(exprAdditive);
        if (result == null) result = caseBitwiseXor(exprAdditive);
        if (result == null) result = caseBitwiseOr(exprAdditive);
        if (result == null) result = caseComparisonOperators(exprAdditive);
        if (result == null) result = caseEqualityOperator(exprAdditive);
        if (result == null) result = caseBooleanAnd(exprAdditive);
        if (result == null) result = caseBooleanOr(exprAdditive);
        if (result == null) result = caseAssign(exprAdditive);
        if (result == null) result = caseExprBinary(exprAdditive);
        if (result == null) result = caseExpr(exprAdditive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_SHIFT:
      {
        ExprShift exprShift = (ExprShift)theEObject;
        T result = caseExprShift(exprShift);
        if (result == null) result = caseShiftOperator(exprShift);
        if (result == null) result = caseBitwiseAnd(exprShift);
        if (result == null) result = caseBitwiseXor(exprShift);
        if (result == null) result = caseBitwiseOr(exprShift);
        if (result == null) result = caseComparisonOperators(exprShift);
        if (result == null) result = caseEqualityOperator(exprShift);
        if (result == null) result = caseBooleanAnd(exprShift);
        if (result == null) result = caseBooleanOr(exprShift);
        if (result == null) result = caseAssign(exprShift);
        if (result == null) result = caseExprBinary(exprShift);
        if (result == null) result = caseExpr(exprShift);
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
        if (result == null) result = caseAssign(exprBitwiseAnd);
        if (result == null) result = caseExprBinary(exprBitwiseAnd);
        if (result == null) result = caseExpr(exprBitwiseAnd);
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
        if (result == null) result = caseAssign(exprBitwiseXor);
        if (result == null) result = caseExprBinary(exprBitwiseXor);
        if (result == null) result = caseExpr(exprBitwiseXor);
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
        if (result == null) result = caseAssign(exprBitwiseOr);
        if (result == null) result = caseExprBinary(exprBitwiseOr);
        if (result == null) result = caseExpr(exprBitwiseOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_COMPARISION:
      {
        ExprComparision exprComparision = (ExprComparision)theEObject;
        T result = caseExprComparision(exprComparision);
        if (result == null) result = caseComparisonOperators(exprComparision);
        if (result == null) result = caseEqualityOperator(exprComparision);
        if (result == null) result = caseBooleanAnd(exprComparision);
        if (result == null) result = caseBooleanOr(exprComparision);
        if (result == null) result = caseAssign(exprComparision);
        if (result == null) result = caseExprBinary(exprComparision);
        if (result == null) result = caseExpr(exprComparision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_EQUAL:
      {
        ExprEqual exprEqual = (ExprEqual)theEObject;
        T result = caseExprEqual(exprEqual);
        if (result == null) result = caseEqualityOperator(exprEqual);
        if (result == null) result = caseBooleanAnd(exprEqual);
        if (result == null) result = caseBooleanOr(exprEqual);
        if (result == null) result = caseAssign(exprEqual);
        if (result == null) result = caseExprBinary(exprEqual);
        if (result == null) result = caseExpr(exprEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BOOLEAN_AND:
      {
        ExprBooleanAnd exprBooleanAnd = (ExprBooleanAnd)theEObject;
        T result = caseExprBooleanAnd(exprBooleanAnd);
        if (result == null) result = caseBooleanAnd(exprBooleanAnd);
        if (result == null) result = caseBooleanOr(exprBooleanAnd);
        if (result == null) result = caseAssign(exprBooleanAnd);
        if (result == null) result = caseExprBinary(exprBooleanAnd);
        if (result == null) result = caseExpr(exprBooleanAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_BOOLEAN_OR:
      {
        ExprBooleanOr exprBooleanOr = (ExprBooleanOr)theEObject;
        T result = caseExprBooleanOr(exprBooleanOr);
        if (result == null) result = caseBooleanOr(exprBooleanOr);
        if (result == null) result = caseAssign(exprBooleanOr);
        if (result == null) result = caseExprBinary(exprBooleanOr);
        if (result == null) result = caseExpr(exprBooleanOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_ASSIGN:
      {
        ExprAssign exprAssign = (ExprAssign)theEObject;
        T result = caseExprAssign(exprAssign);
        if (result == null) result = caseAssign(exprAssign);
        if (result == null) result = caseExprBinary(exprAssign);
        if (result == null) result = caseExpr(exprAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_TUPLE_ENUM:
      {
        PatTupleEnum patTupleEnum = (PatTupleEnum)theEObject;
        T result = casePatTupleEnum(patTupleEnum);
        if (result == null) result = casePatEnum(patTupleEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.PAT_STRUCT_ENUM:
      {
        PatStructEnum patStructEnum = (PatStructEnum)theEObject;
        T result = casePatStructEnum(patStructEnum);
        if (result == null) result = casePatEnum(patStructEnum);
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
      case RustPackage.CHAR_TYPE:
      {
        CharType charType = (CharType)theEObject;
        T result = caseCharType(charType);
        if (result == null) result = caseTextualType(charType);
        if (result == null) result = caseType(charType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BOXED_STR_TYPE:
      {
        BoxedStrType boxedStrType = (BoxedStrType)theEObject;
        T result = caseBoxedStrType(boxedStrType);
        if (result == null) result = caseTextualType(boxedStrType);
        if (result == null) result = caseType(boxedStrType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.OWNED_STR_TYPE:
      {
        OwnedStrType ownedStrType = (OwnedStrType)theEObject;
        T result = caseOwnedStrType(ownedStrType);
        if (result == null) result = caseTextualType(ownedStrType);
        if (result == null) result = caseType(ownedStrType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.BORROWED_STR_TYPE:
      {
        BorrowedStrType borrowedStrType = (BorrowedStrType)theEObject;
        T result = caseBorrowedStrType(borrowedStrType);
        if (result == null) result = caseTextualType(borrowedStrType);
        if (result == null) result = caseType(borrowedStrType);
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
   * Returns the result of interpreting the object as an instance of '<em>View Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewItem(ViewItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Mod Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Mod Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternModDecl(ExternModDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link Attr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link Attr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkAttr(LinkAttr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseDecl(UseDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Glob</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Glob</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathGlob(PathGlob object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Fn Call Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Fn Call Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprFnCallArgs(ExprFnCallArgs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprPrimary(ExprPrimary object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprFields(ExprFields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Field Or Method Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Field Or Method Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprFieldOrMethodCall(ExprFieldOrMethodCall object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Match</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Match</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprMatch(ExprMatch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Arm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Arm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchArm(MatchArm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Match Pat</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Match Pat</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatchPat(MatchPat object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprReturn(ExprReturn object)
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
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slot Decl Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slot Decl Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlotDeclStmt(SlotDeclStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprStmt(ExprStmt object)
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
   * Returns the result of interpreting the object as an instance of '<em>Textual Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Textual Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextualType(TextualType object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprField(ExprField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprIndex(ExprIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprCall(ExprCall object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Multiplicative</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Multiplicative</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprMultiplicative(ExprMultiplicative object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Additive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Additive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprAdditive(ExprAdditive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Shift</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Shift</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprShift(ExprShift object)
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
   * Returns the result of interpreting the object as an instance of '<em>Expr Comparision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Comparision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprComparision(ExprComparision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprEqual(ExprEqual object)
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
   * Returns the result of interpreting the object as an instance of '<em>Char Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharType(CharType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boxed Str Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boxed Str Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoxedStrType(BoxedStrType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Owned Str Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Owned Str Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOwnedStrType(OwnedStrType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Borrowed Str Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Borrowed Str Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorrowedStrType(BorrowedStrType object)
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
