/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * References metadata about a quantity, and provides a name for this metadata. (Informative: This element was simplified from the metaDataProperty element in GML 3.0.) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.DomainMetadataType#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.DomainMetadataType#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getDomainMetadataType()
 * @model extendedMetaData="name='DomainMetadataType' kind='simple'"
 * @generated
 */
public interface DomainMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name of the metadata described by associated referenced document. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getDomainMetadataType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.DomainMetadataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to data or metadata recorded elsewhere, either external to this XML document or within it. Whenever practical, this attribute should be a URL from which this metadata can be electronically retrieved. Alternately, this attribute can reference a URN for well-known metadata. For example, such a URN could be a URN defined in the "ogc" URN namespace. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getDomainMetadataType_Reference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.DomainMetadataType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // DomainMetadataType
