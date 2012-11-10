/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Point is defined by a single coordinate tuple.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.PointType#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getPointType()
 * @model extendedMetaData="name='PointType' kind='elementOnly'"
 * @generated
 */
public interface PointType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference.
	 * @see #setPos(DirectPositionType)
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getPointType_Pos()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionType getPos();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.gml.PointType#getPos <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' containment reference.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(DirectPositionType value);

} // PointType
