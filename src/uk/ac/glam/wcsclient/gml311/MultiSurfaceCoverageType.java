/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Surface Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A discrete coverage type whose domain is defined by a collection of surface patches (includes polygons, triangles, rectangles, etc).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.MultiSurfaceCoverageType#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getMultiSurfaceCoverageType()
 * @model extendedMetaData="name='MultiSurfaceCoverageType' kind='elementOnly'"
 * @generated
 */
public interface MultiSurfaceCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Multi Surface Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Surface Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #setMultiSurfaceDomain(MultiSurfaceDomainType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getMultiSurfaceCoverageType_MultiSurfaceDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiSurfaceDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfaceDomainType getMultiSurfaceDomain();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.MultiSurfaceCoverageType#getMultiSurfaceDomain <em>Multi Surface Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Surface Domain</em>' containment reference.
	 * @see #getMultiSurfaceDomain()
	 * @generated
	 */
	void setMultiSurfaceDomain(MultiSurfaceDomainType value);

} // MultiSurfaceCoverageType
