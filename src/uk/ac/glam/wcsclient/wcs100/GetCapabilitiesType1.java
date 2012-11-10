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
 * A representation of the model object '<em><b>Get Capabilities Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType1#getDCPType <em>DCP Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCapabilitiesType1()
 * @model extendedMetaData="name='GetCapabilities_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface GetCapabilitiesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>DCP Type</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.DCPTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCP Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCP Type</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCapabilitiesType1_DCPType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DCPType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DCPTypeType> getDCPType();

} // GetCapabilitiesType1
