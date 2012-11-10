/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.ExceptionType#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getExceptionType()
 * @model extendedMetaData="name='Exception_._type' kind='elementOnly'"
 * @generated
 */
public interface ExceptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getExceptionType_Format()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFormat();

} // ExceptionType
