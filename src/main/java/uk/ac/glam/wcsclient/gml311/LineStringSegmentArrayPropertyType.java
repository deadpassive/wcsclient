/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.LineStringSegmentArrayPropertyType#getLineStringSegment <em>Line String Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getLineStringSegmentArrayPropertyType()
 * @model extendedMetaData="name='LineStringSegmentArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface LineStringSegmentArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Line String Segment</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.gml311.LineStringSegmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line String Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Segment</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getLineStringSegmentArrayPropertyType_LineStringSegment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineStringSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineStringSegmentType> getLineStringSegment();

} // LineStringSegmentArrayPropertyType
