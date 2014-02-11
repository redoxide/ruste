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
      public Adapter caseItem(Item object)
      {
        return createItemAdapter();
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
      public Adapter caseExprPath(ExprPath object)
      {
        return createExprPathAdapter();
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
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
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
      public Adapter casePatRange(PatRange object)
      {
        return createPatRangeAdapter();
      }
      @Override
      public Adapter casePatCharRange(PatCharRange object)
      {
        return createPatCharRangeAdapter();
      }
      @Override
      public Adapter casePatNumberRange(PatNumberRange object)
      {
        return createPatNumberRangeAdapter();
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
      public Adapter casePath(Path object)
      {
        return createPathAdapter();
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
      public Adapter caseTupleType(TupleType object)
      {
        return createTupleTypeAdapter();
      }
      @Override
      public Adapter caseStructType(StructType object)
      {
        return createStructTypeAdapter();
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
      public Adapter caseEnumType(EnumType object)
      {
        return createEnumTypeAdapter();
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Item
   * @generated
   */
  public Adapter createItemAdapter()
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatRange <em>Pat Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatRange
   * @generated
   */
  public Adapter createPatRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatCharRange <em>Pat Char Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatCharRange
   * @generated
   */
  public Adapter createPatCharRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.PatNumberRange <em>Pat Number Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.PatNumberRange
   * @generated
   */
  public Adapter createPatNumberRangeAdapter()
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.Path
   * @generated
   */
  public Adapter createPathAdapter()
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.TupleType <em>Tuple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.TupleType
   * @generated
   */
  public Adapter createTupleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.StructType
   * @generated
   */
  public Adapter createStructTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.EnumType
   * @generated
   */
  public Adapter createEnumTypeAdapter()
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
