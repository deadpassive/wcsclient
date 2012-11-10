/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Ring Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LinearRing is defined by four or more coordinate tuples, with linear interpolation between them; the first and last coordinates must be coincident.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.LinearRingType#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getLinearRingType()
 * @model extendedMetaData="name='LinearRingType' kind='elementOnly'"
 * @generated
 */
public interface LinearRingType extends AbstractRingType {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.gml.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getLinearRingType_Pos()
	 * @model containment="true" lower="4"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

} // LinearRingType
