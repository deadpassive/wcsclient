/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interval of values of a numeric quantity. This interval can be continuous or discrete, defined by a fixed spacing between adjacent valid values. Note that the "type" and "semantic" attributes for min/max and "res" may be different (timeInstant and duration). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.IntervalType#getRes <em>Res</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getIntervalType()
 * @model extendedMetaData="name='intervalType' kind='elementOnly'"
 * @generated
 */
public interface IntervalType extends ValueRangeType {
	/**
	 * Returns the value of the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regular distance or spacing between the allowed values in this interval. Shall be included when the allowed values are NOT continuous in this interval. Shall not be included when the allowed values are continuous in this interval. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res</em>' containment reference.
	 * @see #setRes(TypedLiteralType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getIntervalType_Res()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='res' namespace='##targetNamespace'"
	 * @generated
	 */
	TypedLiteralType getRes();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.IntervalType#getRes <em>Res</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' containment reference.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(TypedLiteralType value);

} // IntervalType
