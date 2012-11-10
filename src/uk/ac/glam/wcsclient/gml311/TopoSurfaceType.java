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
 * A representation of the model object '<em><b>Topo Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TopoSurface type and element represent a homogeneous topological expression, a set of directed faces, which if realised are isomorphic to a geometric surface primitive. The intended use of TopoSurface is to appear within a surface feature instance to express the structural and possibly geometric relationships of this surface to other features via the shared face definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.TopoSurfaceType#getDirectedFace <em>Directed Face</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getTopoSurfaceType()
 * @model extendedMetaData="name='TopoSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface TopoSurfaceType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.gml311.DirectedFacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getTopoSurfaceType_DirectedFace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedFacePropertyType> getDirectedFace();

} // TopoSurfaceType
