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
 * A representation of the model object '<em><b>Rectified Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rectified grid has an origin and vectors that define its post locations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.RectifiedGridType#getOrigin <em>Origin</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.RectifiedGridType#getOffsetVector <em>Offset Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getRectifiedGridType()
 * @model extendedMetaData="name='RectifiedGridType' kind='elementOnly'"
 * @generated
 */
public interface RectifiedGridType extends GridType {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(PointType)
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getRectifiedGridType_Origin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getOrigin();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.gml.RectifiedGridType#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(PointType value);

	/**
	 * Returns the value of the '<em><b>Offset Vector</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.gml.VectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Vector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Vector</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getRectifiedGridType_OffsetVector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offsetVector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VectorType> getOffsetVector();

} // RectifiedGridType
