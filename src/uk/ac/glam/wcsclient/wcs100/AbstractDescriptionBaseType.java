/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.common.util.EList;

import uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Description Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of a WCS object. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AbstractDescriptionBaseType#getMetadataLink <em>Metadata Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAbstractDescriptionBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDescriptionBaseType' kind='elementOnly'"
 * @generated
 */
public interface AbstractDescriptionBaseType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Metadata Link</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Link</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAbstractDescriptionBaseType_MetadataLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MetadataLinkType> getMetadataLink();

} // AbstractDescriptionBaseType
