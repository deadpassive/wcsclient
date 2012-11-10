/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unordered list of one or more groups of references to remote and/or local resources. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.ManifestType#getReferenceGroupGroup <em>Reference Group Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.ManifestType#getReferenceGroup <em>Reference Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getManifestType()
 * @model extendedMetaData="name='ManifestType' kind='elementOnly'"
 * @generated
 */
public interface ManifestType extends BasicIdentificationType {
	/**
	 * Returns the value of the '<em><b>Reference Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Group Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Group Group</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getManifestType_ReferenceGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='ReferenceGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getReferenceGroupGroup();

	/**
	 * Returns the value of the '<em><b>Reference Group</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.ows110.ReferenceGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Group</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getManifestType_ReferenceGroup()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferenceGroup' namespace='##targetNamespace' group='ReferenceGroup:group'"
	 * @generated
	 */
	EList<ReferenceGroupType> getReferenceGroup();

} // ManifestType
