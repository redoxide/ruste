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
        if (result == null) result = caseExpr(exprLeaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_LITERAL:
      {
        ExprLiteral exprLiteral = (ExprLiteral)theEObject;
        T result = caseExprLiteral(exprLiteral);
        if (result == null) result = caseExprLeaf(exprLiteral);
        if (result == null) result = caseExprRValue(exprLiteral);
        if (result == null) result = caseExpr(exprLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_PATH:
      {
        ExprPath exprPath = (ExprPath)theEObject;
        T result = caseExprPath(exprPath);
        if (result == null) result = caseExprLValue(exprPath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_GROUP:
      {
        ExprGroup exprGroup = (ExprGroup)theEObject;
        T result = caseExprGroup(exprGroup);
        if (result == null) result = caseExprLeaf(exprGroup);
        if (result == null) result = caseExprRValue(exprGroup);
        if (result == null) result = caseExpr(exprGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_TUPLE:
      {
        ExprTuple exprTuple = (ExprTuple)theEObject;
        T result = caseExprTuple(exprTuple);
        if (result == null) result = caseExprPath(exprTuple);
        if (result == null) result = caseExprLValue(exprTuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_STRUCT:
      {
        ExprStruct exprStruct = (ExprStruct)theEObject;
        T result = caseExprStruct(exprStruct);
        if (result == null) result = caseExprLeaf(exprStruct);
        if (result == null) result = caseExprPath(exprStruct);
        if (result == null) result = caseExprRValue(exprStruct);
        if (result == null) result = caseExprLValue(exprStruct);
        if (result == null) result = caseExpr(exprStruct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_VEC:
      {
        ExprVec exprVec = (ExprVec)theEObject;
        T result = caseExprVec(exprVec);
        if (result == null) result = caseExprLeaf(exprVec);
        if (result == null) result = caseExprRValue(exprVec);
        if (result == null) result = caseExpr(exprVec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RustPackage.EXPR_UNARY:
      {
        ExprUnary exprUnary = (ExprUnary)theEObject;
        T result = caseExprUnary(exprUnary);
        if (result == null) result = caseExprLeaf(exprUnary);
        if (result == null) result = caseExprRValue(exprUnary);
        if (result == null) result = caseExpr(exprUnary);
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
        if (result == null) result = caseExpr(numericNegation);
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
        if (result == null) result = caseExpr(dereference);
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
        if (result == null) result = caseExpr(logicalNegation);
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
        if (result == null) result = caseExpr(managedBox);
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
        if (result == null) result = caseExpr(ownedBox);
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
        if (result == null) result = caseExpr(borrow);
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
      case RustPackage.PATH:
      {
        Path path = (Path)theEObject;
        T result = casePath(path);
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
   * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePath(Path object)
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
