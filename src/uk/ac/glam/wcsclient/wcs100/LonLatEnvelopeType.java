/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.common.util.EList;

import uk.ac.glam.wcsclient.wcs100.gml.TimePositionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lon Lat Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines spatial extent by extending LonLatEnvelope with an optional time position pair. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeType#getTimePosition <em>Time Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getLonLatEnvelopeType()
 * @model extendedMetaData="name='LonLatEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface LonLatEnvelopeType extends LonLatEnvelopeBaseType {
	/**
	 * Returns the value of the '<em><b>Time Position</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.gml.TimePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct representation of a temporal position. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Position</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getLonLatEnvelopeType_TimePosition()
	 * @model containment="true" upper="2"
	 *        extendedMetaData="kind='element' name='timePosition' namespace='http://www.opengis.net/gml'"
	 * @generated
	 */
	EList<TimePositionType> getTimePosition();

} // LonLatEnvelopeType
