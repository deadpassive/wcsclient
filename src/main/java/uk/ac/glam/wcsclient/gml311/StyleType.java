/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [complexType of] Predefined concrete value of the top-level property. Encapsulates all other styling information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.StyleType#getFeatureStyle <em>Feature Style</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.StyleType#getGraphStyle <em>Graph Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getStyleType()
 * @model extendedMetaData="name='StyleType' kind='elementOnly'"
 * @generated
 */
public interface StyleType extends AbstractStyleType {
	/**
	 * Returns the value of the '<em><b>Feature Style</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.glam.wcsclient.gml311.FeatureStylePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Style</em>' containment reference list.
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getStyleType_FeatureStyle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='featureStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureStylePropertyType> getFeatureStyle();

	/**
	 * Returns the value of the '<em><b>Graph Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Style</em>' containment reference.
	 * @see #setGraphStyle(GraphStylePropertyType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getStyleType_GraphStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphStylePropertyType getGraphStyle();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.StyleType#getGraphStyle <em>Graph Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Style</em>' containment reference.
	 * @see #getGraphStyle()
	 * @generated
	 */
	void setGraphStyle(GraphStylePropertyType value);

} // StyleType
