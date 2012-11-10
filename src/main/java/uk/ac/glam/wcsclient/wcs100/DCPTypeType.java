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
 * A representation of the model object '<em><b>DCP Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connect point URLs for the HTTP Distributed Computing Platform (DCP).
 *                 Normally, only one Get and/or one Post is included in this element. More than one
 *                 Get and/or Post is allowed to support including alternative URLs for uses such as
 *                 load balancing or backup. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.DCPTypeType#getHTTP <em>HTTP</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDCPTypeType()
 * @model extendedMetaData="name='DCPTypeType' kind='elementOnly'"
 * @generated
 */
public interface DCPTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP</em>' containment reference.
	 * @see #setHTTP(HTTPType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDCPTypeType_HTTP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HTTP' namespace='##targetNamespace'"
	 * @generated
	 */
	HTTPType getHTTP();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.DCPTypeType#getHTTP <em>HTTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP</em>' containment reference.
	 * @see #getHTTP()
	 * @generated
	 */
	void setHTTP(HTTPType value);

} // DCPTypeType
