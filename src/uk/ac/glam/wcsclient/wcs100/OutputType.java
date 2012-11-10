/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.gml.CodeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Asks for the GetCoverage response to be expressed in a particular Coordinate Reference System (crs) and encoded in a particular format. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.OutputType#getCrs <em>Crs</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.OutputType#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getOutputType()
 * @model extendedMetaData="name='OutputType' kind='elementOnly'"
 * @generated
 */
public interface OutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Crs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the Coordinate Reference System (crs) in which GetCoverage response shall be expressed. Identifier shall be among those listed under supportedCRSs in the DescribeCoverage XML response. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crs</em>' containment reference.
	 * @see #setCrs(CodeType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getOutputType_Crs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crs' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCrs();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.OutputType#getCrs <em>Crs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crs</em>' containment reference.
	 * @see #getCrs()
	 * @generated
	 */
	void setCrs(CodeType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the format in which GetCoverage response shall be encoded. Identifier shall be among those listed under supportedFormats in the DescribeCoverage XML response. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(CodeType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getOutputType_Format()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getFormat();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.OutputType#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CodeType value);

} // OutputType
