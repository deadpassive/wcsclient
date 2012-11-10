/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Set Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.RangeSetType1#getRangeSet <em>Range Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRangeSetType1()
 * @model extendedMetaData="name='rangeSet_._type' kind='elementOnly'"
 * @generated
 */
public interface RangeSetType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Range Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Set</em>' containment reference.
	 * @see #setRangeSet(RangeSetType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getRangeSetType1_RangeSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RangeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeSetType getRangeSet();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.RangeSetType1#getRangeSet <em>Range Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Set</em>' containment reference.
	 * @see #getRangeSet()
	 * @generated
	 */
	void setRangeSet(RangeSetType value);

} // RangeSetType1
