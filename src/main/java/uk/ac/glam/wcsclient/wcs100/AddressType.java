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
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Location of the responsible individual or organization.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getDeliveryPoint <em>Delivery Point</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getCity <em>City</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getCountry <em>Country</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AddressType#getElectronicMailAddress <em>Electronic Mail Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType()
 * @model extendedMetaData="name='AddressType' kind='elementOnly'"
 * @generated
 */
public interface AddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery Point</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address line for the location (as described in ISO 11180,
	 *                         Annex A). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delivery Point</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_DeliveryPoint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='deliveryPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDeliveryPoint();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * City of the location. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_City()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AddressType#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Administrative Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State ot province of the location. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Area</em>' attribute.
	 * @see #setAdministrativeArea(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_AdministrativeArea()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='administrativeArea' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAdministrativeArea();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AddressType#getAdministrativeArea <em>Administrative Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Area</em>' attribute.
	 * @see #getAdministrativeArea()
	 * @generated
	 */
	void setAdministrativeArea(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ZIP or other postal code. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_PostalCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country of the physical address. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_Country()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AddressType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Electronic Mail Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of the electronic mailbox of the responsible
	 *                         organization or individual. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Mail Address</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAddressType_ElectronicMailAddress()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='electronicMailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getElectronicMailAddress();

} // AddressType
