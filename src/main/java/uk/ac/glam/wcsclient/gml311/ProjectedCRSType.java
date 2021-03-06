/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projected CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 2D coordinate reference system used to approximate the shape of the earth on a planar surface, but in such a way that the distortion that is inherent to the approximation is carefully controlled and known. Distortion correction is commonly applied to calculated bearings and distances to produce values that are a close match to actual field values. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.ProjectedCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getProjectedCRSType()
 * @model extendedMetaData="name='ProjectedCRSType' kind='elementOnly'"
 * @generated
 */
public interface ProjectedCRSType extends AbstractGeneralDerivedCRSType {
	/**
	 * Returns the value of the '<em><b>Uses Cartesian CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the Cartesian coordinate system used by this CRS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #setUsesCartesianCS(CartesianCSRefType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getProjectedCRSType_UsesCartesianCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesCartesianCS' namespace='##targetNamespace'"
	 * @generated
	 */
	CartesianCSRefType getUsesCartesianCS();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.ProjectedCRSType#getUsesCartesianCS <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Cartesian CS</em>' containment reference.
	 * @see #getUsesCartesianCS()
	 * @generated
	 */
	void setUsesCartesianCS(CartesianCSRefType value);

} // ProjectedCRSType
