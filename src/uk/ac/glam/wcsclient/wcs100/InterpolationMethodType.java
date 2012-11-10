/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interpolation Method Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Codes that identify interpolation methods. The meanings of these codes are defined in Annex B of ISO 19123: Geographic information — Schema for coverage geometry and functions. 
 * <!-- end-model-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getInterpolationMethodType()
 * @model extendedMetaData="name='InterpolationMethodType'"
 * @generated
 */
public enum InterpolationMethodType implements Enumerator {
	/**
	 * The '<em><b>Nearest Neighbor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAREST_NEIGHBOR_VALUE
	 * @generated
	 * @ordered
	 */
	NEAREST_NEIGHBOR(0, "nearestNeighbor", "nearest neighbor"),

	/**
	 * The '<em><b>Bilinear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	BILINEAR(1, "bilinear", "bilinear"),

	/**
	 * The '<em><b>Bicubic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICUBIC_VALUE
	 * @generated
	 * @ordered
	 */
	BICUBIC(2, "bicubic", "bicubic"),

	/**
	 * The '<em><b>Lost Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOST_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	LOST_AREA(3, "lostArea", "lost area"),

	/**
	 * The '<em><b>Barycentric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARYCENTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	BARYCENTRIC(4, "barycentric", "barycentric"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "none", "none");

	/**
	 * The '<em><b>Nearest Neighbor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nearest Neighbor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEAREST_NEIGHBOR
	 * @model name="nearestNeighbor" literal="nearest neighbor"
	 * @generated
	 * @ordered
	 */
	public static final int NEAREST_NEIGHBOR_VALUE = 0;

	/**
	 * The '<em><b>Bilinear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bilinear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILINEAR
	 * @model name="bilinear"
	 * @generated
	 * @ordered
	 */
	public static final int BILINEAR_VALUE = 1;

	/**
	 * The '<em><b>Bicubic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bicubic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BICUBIC
	 * @model name="bicubic"
	 * @generated
	 * @ordered
	 */
	public static final int BICUBIC_VALUE = 2;

	/**
	 * The '<em><b>Lost Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lost Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOST_AREA
	 * @model name="lostArea" literal="lost area"
	 * @generated
	 * @ordered
	 */
	public static final int LOST_AREA_VALUE = 3;

	/**
	 * The '<em><b>Barycentric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Barycentric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARYCENTRIC
	 * @model name="barycentric"
	 * @generated
	 * @ordered
	 */
	public static final int BARYCENTRIC_VALUE = 4;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No interpolation. 
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Interpolation Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterpolationMethodType[] VALUES_ARRAY =
		new InterpolationMethodType[] {
			NEAREST_NEIGHBOR,
			BILINEAR,
			BICUBIC,
			LOST_AREA,
			BARYCENTRIC,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Interpolation Method Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterpolationMethodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interpolation Method Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolationMethodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterpolationMethodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interpolation Method Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolationMethodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterpolationMethodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interpolation Method Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterpolationMethodType get(int value) {
		switch (value) {
			case NEAREST_NEIGHBOR_VALUE: return NEAREST_NEIGHBOR;
			case BILINEAR_VALUE: return BILINEAR;
			case BICUBIC_VALUE: return BICUBIC;
			case LOST_AREA_VALUE: return LOST_AREA;
			case BARYCENTRIC_VALUE: return BARYCENTRIC;
			case NONE_VALUE: return NONE;
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
	private InterpolationMethodType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterpolationMethodType
