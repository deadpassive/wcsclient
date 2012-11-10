/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import uk.ac.glam.wcsclient.gml311.TimePositionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of time positions and periods. The time positions and periods should be ordered from the oldest to the newest, but this is not required. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getGroup <em>Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePosition <em>Time Position</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePeriod <em>Time Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getTimeSequenceType()
 * @model extendedMetaData="name='TimeSequenceType' kind='elementOnly'"
 * @generated
 */
public interface TimeSequenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getTimeSequenceType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Time Position</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.gml311.TimePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direct representation of a temporal position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Position</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getTimeSequenceType_TimePosition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='timePosition' namespace='http://www.opengis.net/gml' group='#group:0'"
	 * @generated
	 */
	EList<TimePositionType> getTimePosition();

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs111.TimePeriodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getTimeSequenceType_TimePeriod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimePeriod' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimePeriodType> getTimePeriod();

} // TimeSequenceType
