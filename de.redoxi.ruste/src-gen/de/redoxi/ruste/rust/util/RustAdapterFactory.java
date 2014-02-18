/**
 */
package de.redoxi.ruste.rust.util;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.redoxi.ruste.rust.RustPackage
 * @generated
 */
public class RustAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RustPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RustPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RustSwitch<Adapter> modelSwitch =
    new RustSwitch<Adapter>()
    {
      @Override
      public Adapter caseCrate(Crate object)
      {
        return createCrateAdapter();
      }
      @Override
      public Adapter caseViewItem(ViewItem object)
      {
        return createViewItemAdapter();
      }
      @Override
      public Adapter caseExternModDecl(ExternModDecl object)
      {
        return createExternModDeclAdapter();
      }
      @Override
      public Adapter caseLinkAttr(LinkAttr object)
      {
        return createLinkAttrAdapter();
      }
      @Override
      public Adapter caseUseDecl(UseDecl object)
      {
        return createUseDeclAdapter();
      }
      @Override
      public Adapter casePathGlob(PathGlob object)
      {
        return createPathGlobAdapter();
      }
      @Override
      public Adapter caseItemAttr(ItemAttr object)
      {
        return createItemAttrAdapter();
      }
      @Override
      public Adapter caseAttr(Attr object)
      {
        return createAttrAdapter();
      }
      @Override
      public Adapter caseAttrWithList(AttrWithList object)
      {
        return createAttrWithListAdapter();
      }
      @Override
      public Adapter caseLiteralAttr(LiteralAttr object)
      {
        return createLiteralAttrAdapter();
      }
      @Override
      public Adapter caseItemAndAttrs(ItemAndAttrs object)
      {
        return createItemAndAttrsAdapter();
      }
      @Override
      public Adapter caseModItem(ModItem object)
      {
        return createModItemAdapter();
      }
      @Override
      public Adapter caseFnItem(FnItem object)
      {
        return createFnItemAdapter();
      }
      @Override
      public Adapter caseTypeItem(TypeItem object)
      {
        return createTypeItemAdapter();
      }
      @Override
      public Adapter caseStructItem(StructItem object)
      {
        return createStructItemAdapter();
      }
      @Override
      public Adapter caseEnumItem(EnumItem object)
      {
        return createEnumItemAdapter();
      }
      @Override
      public Adapter caseEnumVariant(EnumVariant object)
      {
        return createEnumVariantAdapter();
      }
      @Override
      public Adapter caseTraitItem(TraitItem object)
      {
        return createTraitItemAdapter();
      }
      @Override
      public Adapter caseTraitMethod(TraitMethod object)
      {
        return createTraitMethodAdapter();
      }
      @Override
      public Adapter caseImplItem(ImplItem object)
      {
        return createImplItemAdapter();
      }
      @Override
      public Adapter caseImplMethod(ImplMethod object)
      {
        return createImplMethodAdapter();
      }
      @Override
      public Adapter caseExternBlock(ExternBlock object)
      {
        return createExternBlockAdapter();
      }
      @Override
      public Adapter caseForeignFn(ForeignFn object)
      {
        return createForeignFnAdapter();
      }
      @Override
      public Adapter caseStaticItem(StaticItem object)
      {
        return createStaticItemAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExprLValue(ExprLValue object)
      {
        return createExprLValueAdapter();
      }
      @Override
      public Adapter caseExprRValue(ExprRValue object)
      {
        return createExprRValueAdapter();
      }
      @Override
      public Adapter caseExprRValue1(ExprRValue1 object)
      {
        return createExprRValue1Adapter();
      }
      @Override
      public Adapter caseExprLeaf(ExprLeaf object)
      {
        return createExprLeafAdapter();
      }
      @Override
      public Adapter caseExprLiteral(ExprLiteral object)
      {
        return createExprLiteralAdapter();
      }
      @Override
      public Adapter caseExprPathHead(ExprPathHead object)
      {
        return createExprPathHeadAdapter();
      }
      @Override
      public Adapter caseExprGroup(ExprGroup object)
      {
        return createExprGroupAdapter();
      }
      @Override
      public Adapter caseExprTuple(ExprTuple object)
      {
        return createExprTupleAdapter();
      }
      @Override
      public Adapter caseExprStruct(ExprStruct object)
      {
        return createExprStructAdapter();
      }
      @Override
      public Adapter caseExprVec(ExprVec object)
      {
        return createExprVecAdapter();
      }
      @Override
      public Adapter caseExprUnary(ExprUnary object)
      {
        return createExprUnaryAdapter();
      }
      @Override
      public Adapter caseNumericNegation(NumericNegation object)
      {
        return createNumericNegationAdapter();
      }
      @Override
      public Adapter caseDereference(Dereference object)
      {
        return createDereferenceAdapter();
      }
      @Override
      public Adapter caseLogicalNegation(LogicalNegation object)
      {
        return createLogicalNegationAdapter();
      }
      @Override
      public Adapter caseManagedBox(ManagedBox object)
      {
        return createManagedBoxAdapter();
      }
      @Override
      public Adapter caseOwnedBox(OwnedBox object)
      {
        return createOwnedBoxAdapter();
      }
      @Override
      public Adapter caseBorrow(Borrow object)
      {
        return createBorrowAdapter();
      }
      @Override
      public Adapter caseExprBinary(ExprBinary object)
      {
        return createExprBinaryAdapter();
      }
      @Override
      public Adapter caseDivisionMultiplicationOrModulo(DivisionMultiplicationOrModulo object)
      {
        return createDivisionMultiplicationOrModuloAdapter();
      }
      @Override
      public Adapter caseAs(As object)
      {
        return createAsAdapter();
      }
      @Override
      public Adapter caseAdditionOrSubtraction(AdditionOrSubtraction object)
      {
        return createAdditionOrSubtractionAdapter();
      }
      @Override
      public Adapter caseShiftOperator(ShiftOperator object)
      {
        return createShiftOperatorAdapter();
      }
      @Override
      public Adapter caseBitwiseAnd(BitwiseAnd object)
      {
        return createBitwiseAndAdapter();
      }
      @Override
      public Adapter caseBitwiseXor(BitwiseXor object)
      {
        return createBitwiseXorAdapter();
      }
      @Override
      public Adapter caseBitwiseOr(BitwiseOr object)
      {
        return createBitwiseOrAdapter();
      }
      @Override
      public Adapter caseComparisonOperators(ComparisonOperators object)
      {
        return createComparisonOperatorsAdapter();
      }
      @Override
      public Adapter caseEqualityOperator(EqualityOperator object)
      {
        return createEqualityOperatorAdapter();
      }
      @Override
      public Adapter caseBooleanAnd(BooleanAnd object)
      {
        return createBooleanAndAdapter();
      }
      @Override
      public Adapter caseBooleanOr(BooleanOr object)
      {
        return createBooleanOrAdapter();
      }
      @Override
      public Adapter caseAssign(Assign object)
      {
        return createAssignAdapter();
      }
      @Override
      public Adapter caseExprLambda(ExprLambda object)
      {
        return createExprLambdaAdapter();
      }
      @Override
      public Adapter caseExprWhile(ExprWhile object)
      {
        return createExprWhileAdapter();
      }
      @Override
      public Adapter caseExprLoop(ExprLoop object)
      {
        return createExprLoopAdapter();
      }
      @Override
      public Adapter caseExprBreak(ExprBreak object)
      {
        return createExprBreakAdapter();
      }
      @Override
      public Adapter caseExprContinue(ExprContinue object)
      {
        return createExprContinueAdapter();
      }
      @Override
      public Adapter caseExprDo(ExprDo object)
      {
        return createExprDoAdapter();
      }
      @Override
      public Adapter caseExprFor(ExprFor object)
      {
        return createExprForAdapter();
      }
      @Override
      public Adapter caseExprIf(ExprIf object)
      {
        return createExprIfAdapter();
      }
      @Override
      public Adapter caseElseTail(ElseTail object)
      {
        return createElseTailAdapter();
      }
      @Override
      public Adapter caseExprMatch(ExprMatch object)
      {
        return createExprMatchAdapter();
      }
      @Override
      public Adapter caseMatchArm(MatchArm object)
      {
        return createMatchArmAdapter();
      }
      @Override
      public Adapter caseMatchPat(MatchPat object)
      {
        return createMatchPatAdapter();
      }
      @Override
      public Adapter caseExprReturn(ExprReturn object)
      {
        return createExprReturnAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseSlotDeclStmt(SlotDeclStmt object)
      {
        return createSlotDeclStmtAdapter();
      }
      @Override
      public Adapter caseExprStmt(ExprStmt object)
      {
        return createExprStmtAdapter();
      }
      @Override
      public Adapter caseGenericParamDecl(GenericParamDecl object)
      {
        return createGenericParamDeclAdapter();
      }
      @Override
      public Adapter caseArg(Arg object)
      {
        return createArgAdapter();
      }
      @Override
      public Adapter casePat(Pat object)
      {
        return createPatAdapter();
      }
      @Override
      public Adapter casePatWildcard(PatWildcard object)
      {
        return createPatWildcardAdapter();
      }
      @Override
      public Adapter casePatIdent(PatIdent object)
      {
        return createPatIdentAdapter();
      }
      @Override
      public Adapter casePatBoxed(PatBoxed object)
      {
        return createPatBoxedAdapter();
      }
      @Override
      public Adapter casePatOwned(PatOwned object)
      {
        return createPatOwnedAdapter();
      }
      @Override
      public Adapter casePatBorrowed(PatBorrowed object)
      {
        return createPatBorrowedAdapter();
      }
      @Override
      public Adapter casePatTuple(PatTuple object)
      {
        return createPatTupleAdapter();
      }
      @Override
      public Adapter casePatVector(PatVector object)
      {
        return createPatVectorAdapter();
      }
      @Override
      public Adapter casePatLiteral(PatLiteral object)
      {
        return createPatLiteralAdapter();
      }
      @Override
      public Adapter casePatEnum(PatEnum object)
      {
        return createPatEnumAdapter();
      }
      @Override
      public Adapter caseFieldPat(FieldPat object)
      {
        return createFieldPatAdapter();
      }
      @Override
      public Adapter caseTypePath(TypePath object)
      {
        return createTypePathAdapter();
      }
      @Override
      public Adapter caseExprPath(ExprPath object)
      {
        return createExprPathAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseTextualType(TextualType object)
      {
        return createTextualTypeAdapter();
      }
      @Override
      public Adapter caseNamedType(NamedType object)
      {
        return createNamedTypeAdapter();
      }
      @Override
      public Adapter caseBoxedPointer(BoxedPointer object)
      {
        return createBoxedPointerAdapter();
      }
      @Override
      public Adapter caseOwnedPointer(OwnedPointer object)
      {
        return createOwnedPointerAdapter();
      }
      @Override
      public Adapter caseBorrowedPointer(BorrowedPointer object)
      {
        return createBorrowedPointerAdapter();
      }
      @Override
      public Adapter caseStructField(StructField object)
      {
        return createStructFieldAdapter();
      }
      @Override
      public Adapter caseVariant(Variant object)
      {
        return createVariantAdapter();
      }
      @Override
      public Adapter caseStructVariant(StructVariant object)
      {
        return createStructVariantAdapter();
      }
      @Override
      public Adapter caseTupleVariant(TupleVariant object)
      {
        return createTupleVariantAdapter();
      }
      @Override
      public Adapter caseUnitVariant(UnitVariant object)
      {
        return createUnitVariantAdapter();
      }
      @Override
      public Adapter caseStringLit(StringLit object)
      {
        return createStringLitAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNumberLit(NumberLit object)
      {
        return createNumberLitAdapter();
      }
      @Override
      public Adapter caseCharLit(CharLit object)
      {
        return createCharLitAdapter();
      }
      @Override
      public Adapter caseExprField(ExprField object)
      {
        return createExprFieldAdapter();
      }
      @Override
      public Adapter caseExprMethodCall(ExprMethodCall object)
      {
        return createExprMethodCallAdapter();
      }
      @Override
      public Adapter caseExprIndex(ExprIndex object)
      {
        return createExprIndexAdapter();
      }
      @Override
      public Adapter caseDivision(Division object)
      {
        return createDivisionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseModulo(Modulo object)
      {
        return createModuloAdapter();
      }
      @Override
      public Adapter caseExprCast(ExprCast object)
      {
        return createExprCastAdapter();
      }
      @Override
      public Adapter caseExprAddition(ExprAddition object)
      {
        return createExprAdditionAdapter();
      }
      @Override
      public Adapter caseExprSubtraction(ExprSubtraction object)
      {
        return createExprSubtractionAdapter();
      }
      @Override
      public Adapter caseExprLeftShift(ExprLeftShift object)
      {
        return createExprLeftShiftAdapter();
      }
      @Override
      public Adapter caseExprRightShift(ExprRightShift object)
      {
        return createExprRightShiftAdapter();
      }
      @Override
      public Adapter caseExprBitwiseAnd(ExprBitwiseAnd object)
      {
        return createExprBitwiseAndAdapter();
      }
      @Override
      public Adapter caseExprBitwiseXor(ExprBitwiseXor object)
      {
        return createExprBitwiseXorAdapter();
      }
      @Override
      public Adapter caseExprBitwiseOr(ExprBitwiseOr object)
      {
        return createExprBitwiseOrAdapter();
      }
      @Override
      public Adapter caseExprLessThan(ExprLessThan object)
      {
        return createExprLessThanAdapter();
      }
      @Override
      public Adapter caseExprGreaterThan(ExprGreaterThan object)
      {
        return createExprGreaterThanAdapter();
      }
      @Override
      public Adapter caseExprLessThanOrEqualTo(ExprLessThanOrEqualTo object)
      {
        return createExprLessThanOrEqualToAdapter();
      }
      @Override
      public Adapter caseExprGreaterThanOrEqualTo(ExprGreaterThanOrEqualTo object)
      {
        return createExprGreaterThanOrEqualToAdapter();
      }
      @Override
      public Adapter caseExprEqualTo(ExprEqualTo object)
      {
        return createExprEqualToAdapter();
      }
      @Override
      public Adapter caseExprNotEqualTo(ExprNotEqualTo object)
      {
        return createExprNotEqualToAdapter();
      }
      @Override
      public Adapter caseExprBooleanAnd(ExprBooleanAnd object)
      {
        return createExprBooleanAndAdapter();
      }
      @Override
      public Adapter caseExprBooleanOr(ExprBooleanOr object)
      {
        return createExprBooleanOrAdapter();
      }
      @Override
      public Adapter caseExprAssign(ExprAssign object)
      {
        return createExprAssignAdapter();
      }
      @Override
      public Adapter casePatTupleEnum(PatTupleEnum object)
      {
        return createPatTupleEnumAdapter();
      }
      @Override
      public Adapter casePatStructEnum(PatStructEnum object)
      {
        return createPatStructEnumAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseBoolType(BoolType object)
      {
        return createBoolTypeAdapter();
      }
      @Override
      public Adapter caseMachineType(MachineType object)
      {
        return createMachineTypeAdapter();
      }
      @Override
      public Adapter caseUnitType(UnitType object)
      {
        return createUnitTypeAdapter();
      }
      @Override
      public Adapter caseCharType(CharType object)
      {
        return createCharTypeAdapter();
      }
      @Override
      public Adapter caseBoxedStrType(BoxedStrType object)
      {
        return createBoxedStrTypeAdapter();
      }
      @Override
      public Adapter caseOwnedStrType(OwnedStrType object)
      {
        return createOwnedStrTypeAdapter();
      }
      @Override
      public Adapter caseBorrowedStrType(BorrowedStrType object)
      {
        return createBorrowedStrTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Crate <em>Crate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Crate
   * @generated
   */
  public Adapter createCrateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ViewItem <em>View Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ViewItem
   * @generated
   */
  public Adapter createViewItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExternModDecl <em>Extern Mod Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExternModDecl
   * @generated
   */
  public Adapter createExternModDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.LinkAttr <em>Link Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.LinkAttr
   * @generated
   */
  public Adapter createLinkAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.UseDecl <em>Use Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.UseDecl
   * @generated
   */
  public Adapter createUseDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PathGlob <em>Path Glob</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PathGlob
   * @generated
   */
  public Adapter createPathGlobAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ItemAttr <em>Item Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ItemAttr
   * @generated
   */
  public Adapter createItemAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Attr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Attr
   * @generated
   */
  public Adapter createAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.AttrWithList <em>Attr With List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.AttrWithList
   * @generated
   */
  public Adapter createAttrWithListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.LiteralAttr <em>Literal Attr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.LiteralAttr
   * @generated
   */
  public Adapter createLiteralAttrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ItemAndAttrs <em>Item And Attrs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ItemAndAttrs
   * @generated
   */
  public Adapter createItemAndAttrsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ModItem <em>Mod Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ModItem
   * @generated
   */
  public Adapter createModItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.FnItem <em>Fn Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.FnItem
   * @generated
   */
  public Adapter createFnItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TypeItem <em>Type Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TypeItem
   * @generated
   */
  public Adapter createTypeItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StructItem <em>Struct Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StructItem
   * @generated
   */
  public Adapter createStructItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.EnumItem <em>Enum Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.EnumItem
   * @generated
   */
  public Adapter createEnumItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.EnumVariant <em>Enum Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.EnumVariant
   * @generated
   */
  public Adapter createEnumVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TraitItem <em>Trait Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TraitItem
   * @generated
   */
  public Adapter createTraitItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TraitMethod <em>Trait Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TraitMethod
   * @generated
   */
  public Adapter createTraitMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ImplItem <em>Impl Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ImplItem
   * @generated
   */
  public Adapter createImplItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ImplMethod <em>Impl Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ImplMethod
   * @generated
   */
  public Adapter createImplMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExternBlock <em>Extern Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExternBlock
   * @generated
   */
  public Adapter createExternBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ForeignFn <em>Foreign Fn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ForeignFn
   * @generated
   */
  public Adapter createForeignFnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StaticItem <em>Static Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StaticItem
   * @generated
   */
  public Adapter createStaticItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLValue <em>Expr LValue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLValue
   * @generated
   */
  public Adapter createExprLValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprRValue <em>Expr RValue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprRValue
   * @generated
   */
  public Adapter createExprRValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprRValue1 <em>Expr RValue1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprRValue1
   * @generated
   */
  public Adapter createExprRValue1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLeaf <em>Expr Leaf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLeaf
   * @generated
   */
  public Adapter createExprLeafAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLiteral <em>Expr Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLiteral
   * @generated
   */
  public Adapter createExprLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprPathHead <em>Expr Path Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprPathHead
   * @generated
   */
  public Adapter createExprPathHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprGroup <em>Expr Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprGroup
   * @generated
   */
  public Adapter createExprGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprTuple <em>Expr Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprTuple
   * @generated
   */
  public Adapter createExprTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprStruct <em>Expr Struct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprStruct
   * @generated
   */
  public Adapter createExprStructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprVec <em>Expr Vec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprVec
   * @generated
   */
  public Adapter createExprVecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprUnary <em>Expr Unary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprUnary
   * @generated
   */
  public Adapter createExprUnaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.NumericNegation <em>Numeric Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.NumericNegation
   * @generated
   */
  public Adapter createNumericNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Dereference <em>Dereference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Dereference
   * @generated
   */
  public Adapter createDereferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.LogicalNegation <em>Logical Negation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.LogicalNegation
   * @generated
   */
  public Adapter createLogicalNegationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ManagedBox <em>Managed Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ManagedBox
   * @generated
   */
  public Adapter createManagedBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.OwnedBox <em>Owned Box</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.OwnedBox
   * @generated
   */
  public Adapter createOwnedBoxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Borrow <em>Borrow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Borrow
   * @generated
   */
  public Adapter createBorrowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBinary <em>Expr Binary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBinary
   * @generated
   */
  public Adapter createExprBinaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.DivisionMultiplicationOrModulo <em>Division Multiplication Or Modulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.DivisionMultiplicationOrModulo
   * @generated
   */
  public Adapter createDivisionMultiplicationOrModuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.As <em>As</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.As
   * @generated
   */
  public Adapter createAsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.AdditionOrSubtraction <em>Addition Or Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.AdditionOrSubtraction
   * @generated
   */
  public Adapter createAdditionOrSubtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ShiftOperator <em>Shift Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ShiftOperator
   * @generated
   */
  public Adapter createShiftOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BitwiseAnd <em>Bitwise And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BitwiseAnd
   * @generated
   */
  public Adapter createBitwiseAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BitwiseXor <em>Bitwise Xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BitwiseXor
   * @generated
   */
  public Adapter createBitwiseXorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BitwiseOr <em>Bitwise Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BitwiseOr
   * @generated
   */
  public Adapter createBitwiseOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ComparisonOperators <em>Comparison Operators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ComparisonOperators
   * @generated
   */
  public Adapter createComparisonOperatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.EqualityOperator <em>Equality Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.EqualityOperator
   * @generated
   */
  public Adapter createEqualityOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BooleanAnd <em>Boolean And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BooleanAnd
   * @generated
   */
  public Adapter createBooleanAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BooleanOr <em>Boolean Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BooleanOr
   * @generated
   */
  public Adapter createBooleanOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Assign
   * @generated
   */
  public Adapter createAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLambda <em>Expr Lambda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLambda
   * @generated
   */
  public Adapter createExprLambdaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprWhile <em>Expr While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprWhile
   * @generated
   */
  public Adapter createExprWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLoop <em>Expr Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLoop
   * @generated
   */
  public Adapter createExprLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBreak <em>Expr Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBreak
   * @generated
   */
  public Adapter createExprBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprContinue <em>Expr Continue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprContinue
   * @generated
   */
  public Adapter createExprContinueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprDo <em>Expr Do</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprDo
   * @generated
   */
  public Adapter createExprDoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprFor <em>Expr For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprFor
   * @generated
   */
  public Adapter createExprForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprIf <em>Expr If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprIf
   * @generated
   */
  public Adapter createExprIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ElseTail <em>Else Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ElseTail
   * @generated
   */
  public Adapter createElseTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprMatch <em>Expr Match</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprMatch
   * @generated
   */
  public Adapter createExprMatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.MatchArm <em>Match Arm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.MatchArm
   * @generated
   */
  public Adapter createMatchArmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.MatchPat <em>Match Pat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.MatchPat
   * @generated
   */
  public Adapter createMatchPatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprReturn <em>Expr Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprReturn
   * @generated
   */
  public Adapter createExprReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.SlotDeclStmt <em>Slot Decl Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.SlotDeclStmt
   * @generated
   */
  public Adapter createSlotDeclStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprStmt <em>Expr Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprStmt
   * @generated
   */
  public Adapter createExprStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.GenericParamDecl <em>Generic Param Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.GenericParamDecl
   * @generated
   */
  public Adapter createGenericParamDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Arg
   * @generated
   */
  public Adapter createArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Pat <em>Pat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Pat
   * @generated
   */
  public Adapter createPatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatWildcard <em>Pat Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatWildcard
   * @generated
   */
  public Adapter createPatWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatIdent <em>Pat Ident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatIdent
   * @generated
   */
  public Adapter createPatIdentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatBoxed <em>Pat Boxed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatBoxed
   * @generated
   */
  public Adapter createPatBoxedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatOwned <em>Pat Owned</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatOwned
   * @generated
   */
  public Adapter createPatOwnedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatBorrowed <em>Pat Borrowed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatBorrowed
   * @generated
   */
  public Adapter createPatBorrowedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatTuple <em>Pat Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatTuple
   * @generated
   */
  public Adapter createPatTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatVector <em>Pat Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatVector
   * @generated
   */
  public Adapter createPatVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatLiteral <em>Pat Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatLiteral
   * @generated
   */
  public Adapter createPatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatEnum <em>Pat Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatEnum
   * @generated
   */
  public Adapter createPatEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.FieldPat <em>Field Pat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.FieldPat
   * @generated
   */
  public Adapter createFieldPatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TypePath <em>Type Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TypePath
   * @generated
   */
  public Adapter createTypePathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprPath <em>Expr Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprPath
   * @generated
   */
  public Adapter createExprPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TextualType <em>Textual Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TextualType
   * @generated
   */
  public Adapter createTextualTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.NamedType <em>Named Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.NamedType
   * @generated
   */
  public Adapter createNamedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BoxedPointer <em>Boxed Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BoxedPointer
   * @generated
   */
  public Adapter createBoxedPointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.OwnedPointer <em>Owned Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.OwnedPointer
   * @generated
   */
  public Adapter createOwnedPointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BorrowedPointer <em>Borrowed Pointer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BorrowedPointer
   * @generated
   */
  public Adapter createBorrowedPointerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StructField <em>Struct Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StructField
   * @generated
   */
  public Adapter createStructFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Variant
   * @generated
   */
  public Adapter createVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StructVariant <em>Struct Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StructVariant
   * @generated
   */
  public Adapter createStructVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TupleVariant <em>Tuple Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TupleVariant
   * @generated
   */
  public Adapter createTupleVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.UnitVariant <em>Unit Variant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.UnitVariant
   * @generated
   */
  public Adapter createUnitVariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StringLit <em>String Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StringLit
   * @generated
   */
  public Adapter createStringLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.NumberLit <em>Number Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.NumberLit
   * @generated
   */
  public Adapter createNumberLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.CharLit <em>Char Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.CharLit
   * @generated
   */
  public Adapter createCharLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprField <em>Expr Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprField
   * @generated
   */
  public Adapter createExprFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprMethodCall <em>Expr Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprMethodCall
   * @generated
   */
  public Adapter createExprMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprIndex <em>Expr Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprIndex
   * @generated
   */
  public Adapter createExprIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Division
   * @generated
   */
  public Adapter createDivisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Modulo <em>Modulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Modulo
   * @generated
   */
  public Adapter createModuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprCast <em>Expr Cast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprCast
   * @generated
   */
  public Adapter createExprCastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprAddition <em>Expr Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprAddition
   * @generated
   */
  public Adapter createExprAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprSubtraction <em>Expr Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprSubtraction
   * @generated
   */
  public Adapter createExprSubtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLeftShift <em>Expr Left Shift</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLeftShift
   * @generated
   */
  public Adapter createExprLeftShiftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprRightShift <em>Expr Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprRightShift
   * @generated
   */
  public Adapter createExprRightShiftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBitwiseAnd <em>Expr Bitwise And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBitwiseAnd
   * @generated
   */
  public Adapter createExprBitwiseAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBitwiseXor <em>Expr Bitwise Xor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBitwiseXor
   * @generated
   */
  public Adapter createExprBitwiseXorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBitwiseOr <em>Expr Bitwise Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBitwiseOr
   * @generated
   */
  public Adapter createExprBitwiseOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLessThan <em>Expr Less Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLessThan
   * @generated
   */
  public Adapter createExprLessThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprGreaterThan <em>Expr Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprGreaterThan
   * @generated
   */
  public Adapter createExprGreaterThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprLessThanOrEqualTo <em>Expr Less Than Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprLessThanOrEqualTo
   * @generated
   */
  public Adapter createExprLessThanOrEqualToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo <em>Expr Greater Than Or Equal To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprGreaterThanOrEqualTo
   * @generated
   */
  public Adapter createExprGreaterThanOrEqualToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprEqualTo <em>Expr Equal To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprEqualTo
   * @generated
   */
  public Adapter createExprEqualToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprNotEqualTo <em>Expr Not Equal To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprNotEqualTo
   * @generated
   */
  public Adapter createExprNotEqualToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBooleanAnd <em>Expr Boolean And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBooleanAnd
   * @generated
   */
  public Adapter createExprBooleanAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprBooleanOr <em>Expr Boolean Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprBooleanOr
   * @generated
   */
  public Adapter createExprBooleanOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.ExprAssign <em>Expr Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.ExprAssign
   * @generated
   */
  public Adapter createExprAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatTupleEnum <em>Pat Tuple Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatTupleEnum
   * @generated
   */
  public Adapter createPatTupleEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatStructEnum <em>Pat Struct Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatStructEnum
   * @generated
   */
  public Adapter createPatStructEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.FloatType
   * @generated
   */
  public Adapter createFloatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BoolType
   * @generated
   */
  public Adapter createBoolTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.MachineType <em>Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.MachineType
   * @generated
   */
  public Adapter createMachineTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.UnitType <em>Unit Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.UnitType
   * @generated
   */
  public Adapter createUnitTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.CharType <em>Char Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.CharType
   * @generated
   */
  public Adapter createCharTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BoxedStrType <em>Boxed Str Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BoxedStrType
   * @generated
   */
  public Adapter createBoxedStrTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.OwnedStrType <em>Owned Str Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.OwnedStrType
   * @generated
   */
  public Adapter createOwnedStrTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.BorrowedStrType <em>Borrowed Str Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.BorrowedStrType
   * @generated
   */
  public Adapter createBorrowedStrTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RustAdapterFactory
