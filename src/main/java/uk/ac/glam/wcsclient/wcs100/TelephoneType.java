/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Telephone numbers for contacting the responsible individual or
 *                 organization. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.TelephoneType#getVoice <em>Voice</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.TelephoneType#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getTelephoneType()
 * @model extendedMetaData="name='TelephoneType' kind='elementOnly'"
 * @generated
 */
public interface TelephoneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telephone number by which individuals can speak to the
	 *                         responsible organization or individual. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voice</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getTelephoneType_Voice()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='voice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getVoice();

	/**
	 * Returns the value of the '<em><b>Facsimile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telephone number of a facsimile machine for the
	 *                         responsibleorganization or individual. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getTelephoneType_Facsimile()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='facsimile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFacsimile();

} // TelephoneType
