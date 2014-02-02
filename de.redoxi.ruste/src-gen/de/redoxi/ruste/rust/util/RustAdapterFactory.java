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
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseCharLit(CharLit object)
      {
        return createCharLitAdapter();
      }
      @Override
      public Adapter caseEscapedChar(EscapedChar object)
      {
        return createEscapedCharAdapter();
      }
      @Override
      public Adapter caseNumberLit(NumberLit object)
      {
        return createNumberLitAdapter();
      }
      @Override
      public Adapter caseFloatLit(FloatLit object)
      {
        return createFloatLitAdapter();
      }
      @Override
      public Adapter caseIntLit(IntLit object)
      {
        return createIntLitAdapter();
      }
      @Override
      public Adapter caseDecIntLit(DecIntLit object)
      {
        return createDecIntLitAdapter();
      }
      @Override
      public Adapter caseUnicodeChar(UnicodeChar object)
      {
        return createUnicodeCharAdapter();
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.EscapedChar <em>Escaped Char</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.EscapedChar
   * @generated
   */
  public Adapter createEscapedCharAdapter()
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
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.FloatLit <em>Float Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.FloatLit
   * @generated
   */
  public Adapter createFloatLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.IntLit <em>Int Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.IntLit
   * @generated
   */
  public Adapter createIntLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.DecIntLit <em>Dec Int Lit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.DecIntLit
   * @generated
   */
  public Adapter createDecIntLitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.redoxi.ruste.rust.UnicodeChar <em>Unicode Char</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.redoxi.ruste.rust.UnicodeChar
   * @generated
   */
  public Adapter createUnicodeCharAdapter()
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
