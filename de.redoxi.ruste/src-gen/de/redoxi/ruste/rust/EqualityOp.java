/**
 */
package de.redoxi.ruste.rust;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Equality Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.redoxi.ruste.rust.RustPackage#getEqualityOp()
 * @model
 * @generated
 */
public enum EqualityOp implements Enumerator
{
  /**
   * The '<em><b>EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(0, "EQUAL", "=="),

  /**
   * The '<em><b>NOT EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_EQUAL_VALUE
   * @generated
   * @ordered
   */
  NOT_EQUAL(1, "NOT_EQUAL", "!=");

  /**
   * The '<em><b>EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model literal="=="
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 0;

  /**
   * The '<em><b>NOT EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_EQUAL
   * @model literal="!="
   * @generated
   * @ordered
   */
  public static final int NOT_EQUAL_VALUE = 1;

  /**
   * An array of all the '<em><b>Equality Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EqualityOp[] VALUES_ARRAY =
    new EqualityOp[]
    {
      EQUAL,
      NOT_EQUAL,
    };

  /**
   * A public read-only list of all the '<em><b>Equality Op</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EqualityOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Equality Op</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EqualityOp get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EqualityOp result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equality Op</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EqualityOp getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EqualityOp result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Equality Op</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EqualityOp get(int value)
  {
    switch (value)
    {
      case EQUAL_VALUE: return EQUAL;
      case NOT_EQUAL_VALUE: return NOT_EQUAL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EqualityOp(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EqualityOp
