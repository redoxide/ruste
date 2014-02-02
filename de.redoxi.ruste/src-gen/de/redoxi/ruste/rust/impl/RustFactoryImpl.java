/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RustFactoryImpl extends EFactoryImpl implements RustFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RustFactory init()
  {
    try
    {
      RustFactory theRustFactory = (RustFactory)EPackage.Registry.INSTANCE.getEFactory(RustPackage.eNS_URI);
      if (theRustFactory != null)
      {
        return theRustFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RustFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RustPackage.CRATE: return createCrate();
      case RustPackage.ITEM_ATTR: return createItemAttr();
      case RustPackage.ATTR: return createAttr();
      case RustPackage.ATTR_WITH_LIST: return createAttrWithList();
      case RustPackage.LITERAL_ATTR: return createLiteralAttr();
      case RustPackage.ITEM_AND_ATTRS: return createItemAndAttrs();
      case RustPackage.ITEM: return createItem();
      case RustPackage.MOD_ITEM: return createModItem();
      case RustPackage.LITERAL: return createLiteral();
      case RustPackage.CHAR_LIT: return createCharLit();
      case RustPackage.ESCAPED_CHAR: return createEscapedChar();
      case RustPackage.UNICODE_CHAR: return createUnicodeChar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crate createCrate()
  {
    CrateImpl crate = new CrateImpl();
    return crate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemAttr createItemAttr()
  {
    ItemAttrImpl itemAttr = new ItemAttrImpl();
    return itemAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attr createAttr()
  {
    AttrImpl attr = new AttrImpl();
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrWithList createAttrWithList()
  {
    AttrWithListImpl attrWithList = new AttrWithListImpl();
    return attrWithList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralAttr createLiteralAttr()
  {
    LiteralAttrImpl literalAttr = new LiteralAttrImpl();
    return literalAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemAndAttrs createItemAndAttrs()
  {
    ItemAndAttrsImpl itemAndAttrs = new ItemAndAttrsImpl();
    return itemAndAttrs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModItem createModItem()
  {
    ModItemImpl modItem = new ModItemImpl();
    return modItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharLit createCharLit()
  {
    CharLitImpl charLit = new CharLitImpl();
    return charLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscapedChar createEscapedChar()
  {
    EscapedCharImpl escapedChar = new EscapedCharImpl();
    return escapedChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicodeChar createUnicodeChar()
  {
    UnicodeCharImpl unicodeChar = new UnicodeCharImpl();
    return unicodeChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RustPackage getRustPackage()
  {
    return (RustPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RustPackage getPackage()
  {
    return RustPackage.eINSTANCE;
  }

} //RustFactoryImpl
