/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describe Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.DescribeCoverageType#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getDescribeCoverageType()
 * @model extendedMetaData="name='DescribeCoverage_._type' kind='elementOnly'"
 * @generated
 */
public interface DescribeCoverageType extends RequestBaseType {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of identifiers of desired coverages. A client can obtain identifiers by a prior GetCapabilities request, or from a third-party source. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getDescribeCoverageType_Identifier()
	 * @model unique="false" dataType="uk.ac.glam.wcsclient.wcs111.IdentifierType" required="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getIdentifier();

} // DescribeCoverageType
