/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.ows110.OnlineResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getCoverageSummary <em>Coverage Summary</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedCRS <em>Supported CRS</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedFormat <em>Supported Format</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getOtherSource <em>Other Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getContentsType()
 * @model extendedMetaData="name='Contents_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Coverage Summary</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of brief metadata describing top-level coverages available from this WCS server. This list shall be included unless one or more OtherSources are referenced and all this metadata is available from those sources. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage Summary</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getContentsType_CoverageSummary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CoverageSummary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoverageSummaryType> getCoverageSummary();

	/**
	 * Returns the value of the '<em><b>Supported CRS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of references to coordinate reference systems in which GetCoverage operation requests and responses may be expressed. This list of SupportedCRSs shall be the union of all of the supported CRSs in all of the nested CoverageSummaries. Servers should include this list since it reduces the work clients need to do to determine that they can interoperate with the server. There may be a dependency of SupportedCRS on SupportedFormat, as described in Subclause 10.3.5. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported CRS</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getContentsType_SupportedCRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='SupportedCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedCRS();

	/**
	 * Returns the value of the '<em><b>Supported Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of identifiers of formats in which GetCoverage operation response may be encoded. This list of SupportedFormats shall be the union of all of the supported formats in all of the nested CoverageSummaries. Servers should include this list since it reduces the work clients need to do to determine that they can interoperate with the server. There may be a dependency of SupportedCRS on SupportedFormat, as described in clause 10.3.5. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Format</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getContentsType_SupportedFormat()
	 * @model unique="false" dataType="uk.ac.glam.wcsclient.ows110.MimeType"
	 *        extendedMetaData="kind='element' name='SupportedFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSupportedFormat();

	/**
	 * Returns the value of the '<em><b>Other Source</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.ows110.OnlineResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of references to other sources of coverage metadata. This list shall be included unless one or more CoverageSummaries are included. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Source</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getContentsType_OtherSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OtherSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OnlineResourceType> getOtherSource();

} // ContentsType
