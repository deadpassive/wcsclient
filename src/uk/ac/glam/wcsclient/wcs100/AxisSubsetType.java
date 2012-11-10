/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Subset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.AxisSubsetType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAxisSubsetType()
 * @model extendedMetaData="name='axisSubset_._type' kind='elementOnly'"
 * @generated
 */
public interface AxisSubsetType extends ValueEnumBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name or identifier of one axis in this coverage. This name shall match that of an AxisDescription element in the DescribeCoverage XML response.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getAxisSubsetType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.AxisSubsetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AxisSubsetType
