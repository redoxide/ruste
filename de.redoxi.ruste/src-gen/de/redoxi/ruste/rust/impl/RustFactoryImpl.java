/**
 */
package de.redoxi.ruste.rust.impl;

import de.redoxi.ruste.rust.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case RustPackage.NUMBER_LIT: return createNumberLit();
      case RustPackage.FLOAT_LIT: return createFloatLit();
      case RustPackage.INT_LIT: return createIntLit();
      case RustPackage.DEC_INT_LIT: return createDecIntLit();
      case RustPackage.BIN_INT_LIT: return createBinIntLit();
      case RustPackage.OCT_INT_LIT: return createOctIntLit();
      case RustPackage.HEX_INT_LIT: return createHexIntLit();
      case RustPackage.STRING_LIT: return createStringLit();
      case RustPackage.STRING_CHAR: return createStringChar();
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
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RustPackage.FLOAT_SIZE:
        return createFloatSizeFromString(eDataType, initialValue);
      case RustPackage.INT_SIZE:
        return createIntSizeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RustPackage.FLOAT_SIZE:
        return convertFloatSizeToString(eDataType, instanceValue);
      case RustPackage.INT_SIZE:
        return convertIntSizeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public NumberLit createNumberLit()
  {
    NumberLitImpl numberLit = new NumberLitImpl();
    return numberLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLit createFloatLit()
  {
    FloatLitImpl floatLit = new FloatLitImpl();
    return floatLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLit createIntLit()
  {
    IntLitImpl intLit = new IntLitImpl();
    return intLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecIntLit createDecIntLit()
  {
    DecIntLitImpl decIntLit = new DecIntLitImpl();
    return decIntLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinIntLit createBinIntLit()
  {
    BinIntLitImpl binIntLit = new BinIntLitImpl();
    return binIntLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OctIntLit createOctIntLit()
  {
    OctIntLitImpl octIntLit = new OctIntLitImpl();
    return octIntLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HexIntLit createHexIntLit()
  {
    HexIntLitImpl hexIntLit = new HexIntLitImpl();
    return hexIntLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLit createStringLit()
  {
    StringLitImpl stringLit = new StringLitImpl();
    return stringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringChar createStringChar()
  {
    StringCharImpl stringChar = new StringCharImpl();
    return stringChar;
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
  public FloatSize createFloatSizeFromString(EDataType eDataType, String initialValue)
  {
    FloatSize result = FloatSize.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFloatSizeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntSize createIntSizeFromString(EDataType eDataType, String initialValue)
  {
    IntSize result = IntSize.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntSizeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
