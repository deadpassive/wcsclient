/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type defines a container for an array of 
 *      triangle patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.TrianglePatchArrayPropertyType#getTriangle <em>Triangle</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getTrianglePatchArrayPropertyType()
 * @model extendedMetaData="name='TrianglePatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TrianglePatchArrayPropertyType extends SurfacePatchArrayPropertyType {
	/**
	 * Returns the value of the '<em><b>Triangle</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.gml311.TriangleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triangle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triangle</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getTrianglePatchArrayPropertyType_Triangle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Triangle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriangleType> getTriangle();

} // TrianglePatchArrayPropertyType
