/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.gml.CodeListType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Formats Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unordered list of data transfer formats supported. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.SupportedFormatsType#getFormats <em>Formats</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.SupportedFormatsType#getNativeFormat <em>Native Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedFormatsType()
 * @model extendedMetaData="name='SupportedFormatsType' kind='elementOnly'"
 * @generated
 */
public interface SupportedFormatsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Formats</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.gml.CodeListType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers of one or more formats in which coverage content can be retrieved. The codeSpace optional attribute can reference the semantic of the format identifiers. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formats</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedFormatsType_Formats()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='formats' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeListType> getFormats();

	/**
	 * Returns the value of the '<em><b>Native Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers of one format in which the data is stored. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Native Format</em>' attribute.
	 * @see #setNativeFormat(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedFormatsType_NativeFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nativeFormat'"
	 * @generated
	 */
	String getNativeFormat();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.SupportedFormatsType#getNativeFormat <em>Native Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Format</em>' attribute.
	 * @see #getNativeFormat()
	 * @generated
	 */
	void setNativeFormat(String value);

} // SupportedFormatsType
