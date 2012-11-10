/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getGetCapabilitiesType()
 * @model extendedMetaData="name='GetCapabilities_._type' kind='elementOnly'"
 * @generated
 */
public interface GetCapabilitiesType extends uk.ac.glam.wcsclient.ows110.GetCapabilitiesType {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The default value is <code>"WCS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #isSetService()
	 * @see #unsetService()
	 * @see #setService(String)
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getGetCapabilitiesType_Service()
	 * @model default="WCS" unsettable="true" dataType="uk.ac.glam.wcsclient.ows110.ServiceType" required="true"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #isSetService()
	 * @see #unsetService()
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetService()
	 * @see #getService()
	 * @see #setService(String)
	 * @generated
	 */
	void unsetService();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService <em>Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service</em>' attribute is set.
	 * @see #unsetService()
	 * @see #getService()
	 * @see #setService(String)
	 * @generated
	 */
	boolean isSetService();

} // GetCapabilitiesType
