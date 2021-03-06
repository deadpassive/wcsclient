/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * XML encoded GetCapabilities operation request. This operation allows clients to retrieve service metadata about a specific service instance. In this XML encoding, no "request" parameter is included, since the element name specifies the specific operation. This base type shall be extended by each specific OWS to include the additional required "service" attribute, with the correct value for that OWS. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getAcceptVersions <em>Accept Versions</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getSections <em>Sections</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getAcceptFormats <em>Accept Formats</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getUpdateSequence <em>Update Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getGetCapabilitiesType()
 * @model extendedMetaData="name='GetCapabilitiesType' kind='elementOnly'"
 * @generated
 */
public interface GetCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Accept Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When omitted, server shall return latest supported version. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept Versions</em>' containment reference.
	 * @see #setAcceptVersions(AcceptVersionsType)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getGetCapabilitiesType_AcceptVersions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AcceptVersions' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptVersionsType getAcceptVersions();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getAcceptVersions <em>Accept Versions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Versions</em>' containment reference.
	 * @see #getAcceptVersions()
	 * @generated
	 */
	void setAcceptVersions(AcceptVersionsType value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When omitted or not supported by server, server shall return complete service metadata (Capabilities) document. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference.
	 * @see #setSections(SectionsType)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getGetCapabilitiesType_Sections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sections' namespace='##targetNamespace'"
	 * @generated
	 */
	SectionsType getSections();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getSections <em>Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sections</em>' containment reference.
	 * @see #getSections()
	 * @generated
	 */
	void setSections(SectionsType value);

	/**
	 * Returns the value of the '<em><b>Accept Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When omitted or not supported by server, server shall return service metadata document using the MIME type "text/xml". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accept Formats</em>' containment reference.
	 * @see #setAcceptFormats(AcceptFormatsType)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getGetCapabilitiesType_AcceptFormats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AcceptFormats' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptFormatsType getAcceptFormats();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getAcceptFormats <em>Accept Formats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Formats</em>' containment reference.
	 * @see #getAcceptFormats()
	 * @generated
	 */
	void setAcceptFormats(AcceptFormatsType value);

	/**
	 * Returns the value of the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When omitted or not supported by server, server shall return latest complete service metadata document. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Sequence</em>' attribute.
	 * @see #setUpdateSequence(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getGetCapabilitiesType_UpdateSequence()
	 * @model dataType="uk.ac.glam.wcsclient.ows110.UpdateSequenceType"
	 *        extendedMetaData="kind='attribute' name='updateSequence'"
	 * @generated
	 */
	String getUpdateSequence();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType#getUpdateSequence <em>Update Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Sequence</em>' attribute.
	 * @see #getUpdateSequence()
	 * @generated
	 */
	void setUpdateSequence(String value);

} // GetCapabilitiesType
