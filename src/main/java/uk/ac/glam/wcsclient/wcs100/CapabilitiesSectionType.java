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
 * A representation of the literals of the enumeration '<em><b>Capabilities Section Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identification of desired part of full Capabilities XML document to be
 *                 returned. 
 * <!-- end-model-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getCapabilitiesSectionType()
 * @model extendedMetaData="name='CapabilitiesSectionType'"
 * @generated
 */
public enum CapabilitiesSectionType implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(0, "_", "/"),

	/**
	 * The '<em><b>WCS Capabilities Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WCS_CAPABILITIES_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	WCS_CAPABILITIES_SERVICE(1, "WCSCapabilitiesService", "/WCS_Capabilities/Service"),

	/**
	 * The '<em><b>WCS Capabilities Capability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WCS_CAPABILITIES_CAPABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	WCS_CAPABILITIES_CAPABILITY(2, "WCSCapabilitiesCapability", "/WCS_Capabilities/Capability"),

	/**
	 * The '<em><b>WCS Capabilities Content Metadata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WCS_CAPABILITIES_CONTENT_METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	WCS_CAPABILITIES_CONTENT_METADATA(3, "WCSCapabilitiesContentMetadata", "/WCS_Capabilities/ContentMetadata");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD. 
	 * <!-- end-model-doc -->
	 * @see #_
	 * @model literal="/"
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 0;

	/**
	 * The '<em><b>WCS Capabilities Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD. 
	 * <!-- end-model-doc -->
	 * @see #WCS_CAPABILITIES_SERVICE
	 * @model name="WCSCapabilitiesService" literal="/WCS_Capabilities/Service"
	 * @generated
	 * @ordered
	 */
	public static final int WCS_CAPABILITIES_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>WCS Capabilities Capability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD. 
	 * <!-- end-model-doc -->
	 * @see #WCS_CAPABILITIES_CAPABILITY
	 * @model name="WCSCapabilitiesCapability" literal="/WCS_Capabilities/Capability"
	 * @generated
	 * @ordered
	 */
	public static final int WCS_CAPABILITIES_CAPABILITY_VALUE = 2;

	/**
	 * The '<em><b>WCS Capabilities Content Metadata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TBD. 
	 * <!-- end-model-doc -->
	 * @see #WCS_CAPABILITIES_CONTENT_METADATA
	 * @model name="WCSCapabilitiesContentMetadata" literal="/WCS_Capabilities/ContentMetadata"
	 * @generated
	 * @ordered
	 */
	public static final int WCS_CAPABILITIES_CONTENT_METADATA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Capabilities Section Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CapabilitiesSectionType[] VALUES_ARRAY =
		new CapabilitiesSectionType[] {
			_,
			WCS_CAPABILITIES_SERVICE,
			WCS_CAPABILITIES_CAPABILITY,
			WCS_CAPABILITIES_CONTENT_METADATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Capabilities Section Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CapabilitiesSectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Capabilities Section Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilitiesSectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilitiesSectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capabilities Section Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilitiesSectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CapabilitiesSectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Capabilities Section Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilitiesSectionType get(int value) {
		switch (value) {
			case __VALUE: return _;
			case WCS_CAPABILITIES_SERVICE_VALUE: return WCS_CAPABILITIES_SERVICE;
			case WCS_CAPABILITIES_CAPABILITY_VALUE: return WCS_CAPABILITIES_CAPABILITY;
			case WCS_CAPABILITIES_CONTENT_METADATA_VALUE: return WCS_CAPABILITIES_CONTENT_METADATA;
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
	private CapabilitiesSectionType(int value, String name, String literal) {
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
	
} //CapabilitiesSectionType
