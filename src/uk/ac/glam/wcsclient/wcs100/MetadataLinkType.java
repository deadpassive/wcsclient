/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Refers to a metadata package that contains metadata properties for an object. The metadataType attribute indicates the type of metadata referred to. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType#getMetadataType <em>Metadata Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getMetadataLinkType()
 * @model extendedMetaData="name='MetadataLinkType' kind='empty'"
 * @generated
 */
public interface MetadataLinkType extends MetadataAssociationType {
	/**
	 * Returns the value of the '<em><b>Metadata Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs100.MetadataTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Type</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.MetadataTypeType
	 * @see #isSetMetadataType()
	 * @see #unsetMetadataType()
	 * @see #setMetadataType(MetadataTypeType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getMetadataLinkType_MetadataType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='metadataType'"
	 * @generated
	 */
	MetadataTypeType getMetadataType();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType#getMetadataType <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Type</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.MetadataTypeType
	 * @see #isSetMetadataType()
	 * @see #unsetMetadataType()
	 * @see #getMetadataType()
	 * @generated
	 */
	void setMetadataType(MetadataTypeType value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType#getMetadataType <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetadataType()
	 * @see #getMetadataType()
	 * @see #setMetadataType(MetadataTypeType)
	 * @generated
	 */
	void unsetMetadataType();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType#getMetadataType <em>Metadata Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Metadata Type</em>' attribute is set.
	 * @see #unsetMetadataType()
	 * @see #getMetadataType()
	 * @see #setMetadataType(MetadataTypeType)
	 * @generated
	 */
	boolean isSetMetadataType();

} // MetadataLinkType
