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
 * A representation of the model object '<em><b>Language String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Text string with the language of the string identified as recommended in the XML 1.0 W3C Recommendation, section 2.12. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.LanguageStringType#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.LanguageStringType#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getLanguageStringType()
 * @model extendedMetaData="name='LanguageStringType' kind='simple'"
 * @generated
 */
public interface LanguageStringType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getLanguageStringType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.LanguageStringType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getLanguageStringType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.LanguageStringType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

} // LanguageStringType
