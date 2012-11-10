/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Specific Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.VendorSpecificCapabilitiesType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getVendorSpecificCapabilitiesType()
 * @model extendedMetaData="name='VendorSpecificCapabilities_._type' kind='elementOnly'"
 * @generated
 */
public interface VendorSpecificCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getVendorSpecificCapabilitiesType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // VendorSpecificCapabilitiesType
