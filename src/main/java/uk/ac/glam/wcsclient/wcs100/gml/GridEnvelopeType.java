/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides grid coordinate values for the diametrically opposed corners of an envelope that bounds a section of grid. The value of a single coordinate is the number of offsets from the origin of the grid in the direction of a specific axis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType#getLow <em>Low</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType#getHigh <em>High</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getGridEnvelopeType()
 * @model extendedMetaData="name='GridEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface GridEnvelopeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(List)
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getGridEnvelopeType_Low()
	 * @model dataType="uk.ac.glam.wcsclient.wcs100.gml.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='low' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getLow();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(List)
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage#getGridEnvelopeType_High()
	 * @model dataType="uk.ac.glam.wcsclient.wcs100.gml.IntegerList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='high' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getHigh();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(List<BigInteger> value);

} // GridEnvelopeType
