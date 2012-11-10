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
 * A representation of the model object '<em><b>Supported Interpolations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unordered list of interpolation methods supported. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType#getInterpolationMethod <em>Interpolation Method</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedInterpolationsType()
 * @model extendedMetaData="name='SupportedInterpolationsType' kind='elementOnly'"
 * @generated
 */
public interface SupportedInterpolationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interpolation Method</b></em>' attribute list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.wcs100.InterpolationMethodType}.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs100.InterpolationMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolation Method</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolation Method</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.InterpolationMethodType
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedInterpolationsType_InterpolationMethod()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='interpolationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterpolationMethodType> getInterpolationMethod();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The default value is <code>"nearest neighbor"</code>.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs100.InterpolationMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.InterpolationMethodType
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #setDefault(InterpolationMethodType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getSupportedInterpolationsType_Default()
	 * @model default="nearest neighbor" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	InterpolationMethodType getDefault();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.InterpolationMethodType
	 * @see #isSetDefault()
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(InterpolationMethodType value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefault()
	 * @see #getDefault()
	 * @see #setDefault(InterpolationMethodType)
	 * @generated
	 */
	void unsetDefault();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType#getDefault <em>Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default</em>' attribute is set.
	 * @see #unsetDefault()
	 * @see #getDefault()
	 * @see #setDefault(InterpolationMethodType)
	 * @generated
	 */
	boolean isSetDefault();

} // SupportedInterpolationsType
