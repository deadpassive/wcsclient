/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bounding shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.BoundingShapeType#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.BoundingShapeType#getEnvelope <em>Envelope</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getBoundingShapeType()
 * @model extendedMetaData="name='BoundingShapeType' kind='elementOnly'"
 * @generated
 */
public interface BoundingShapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Envelope Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envelope Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope Group</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getBoundingShapeType_EnvelopeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='Envelope:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEnvelopeGroup();

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envelope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(EnvelopeType)
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getBoundingShapeType_Envelope()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='##targetNamespace' group='Envelope:group'"
	 * @generated
	 */
	EnvelopeType getEnvelope();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.gml.BoundingShapeType#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(EnvelopeType value);

} // BoundingShapeType
