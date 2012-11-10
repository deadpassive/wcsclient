/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.RequestType#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.RequestType#getDescribeCoverage <em>Describe Coverage</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.RequestType#getGetCoverage <em>Get Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRequestType()
 * @model extendedMetaData="name='Request_._type' kind='elementOnly'"
 * @generated
 */
public interface RequestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #setGetCapabilities(GetCapabilitiesType1)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRequestType_GetCapabilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GetCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCapabilitiesType1 getGetCapabilities();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.RequestType#getGetCapabilities <em>Get Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #getGetCapabilities()
	 * @generated
	 */
	void setGetCapabilities(GetCapabilitiesType1 value);

	/**
	 * Returns the value of the '<em><b>Describe Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describe Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describe Coverage</em>' containment reference.
	 * @see #setDescribeCoverage(DescribeCoverageType1)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRequestType_DescribeCoverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DescribeCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	DescribeCoverageType1 getDescribeCoverage();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.RequestType#getDescribeCoverage <em>Describe Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describe Coverage</em>' containment reference.
	 * @see #getDescribeCoverage()
	 * @generated
	 */
	void setDescribeCoverage(DescribeCoverageType1 value);

	/**
	 * Returns the value of the '<em><b>Get Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Coverage</em>' containment reference.
	 * @see #setGetCoverage(GetCoverageType1)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRequestType_GetCoverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GetCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCoverageType1 getGetCoverage();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.RequestType#getGetCoverage <em>Get Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Coverage</em>' containment reference.
	 * @see #getGetCoverage()
	 * @generated
	 */
	void setGetCoverage(GetCoverageType1 value);

} // RequestType
