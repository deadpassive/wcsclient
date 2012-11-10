/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Subset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Selection of desired subset of the coverage's range fields, (optionally) the interpolation method applied to each field, and (optionally) field subsets. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.RangeSubsetType#getFieldSubset <em>Field Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getRangeSubsetType()
 * @model extendedMetaData="name='RangeSubsetType' kind='elementOnly'"
 * @generated
 */
public interface RangeSubsetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Subset</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of one or more desired subsets of range fields. TBD. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Subset</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package#getRangeSubsetType_FieldSubset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FieldSubset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FieldSubsetType> getFieldSubset();

} // RangeSubsetType
