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
 * A representation of the model object '<em><b>Axis Description Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AxisDescriptionType1#getAxisDescription <em>Axis Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAxisDescriptionType1()
 * @model extendedMetaData="name='axisDescription_._type' kind='elementOnly'"
 * @generated
 */
public interface AxisDescriptionType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Description</em>' containment reference.
	 * @see #setAxisDescription(AxisDescriptionType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAxisDescriptionType1_AxisDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AxisDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisDescriptionType getAxisDescription();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AxisDescriptionType1#getAxisDescription <em>Axis Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Description</em>' containment reference.
	 * @see #getAxisDescription()
	 * @generated
	 */
	void setAxisDescription(AxisDescriptionType value);

} // AxisDescriptionType1
