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
 * A representation of the model object '<em><b>Describe Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDescribeCoverageType()
 * @model extendedMetaData="name='DescribeCoverage_._type' kind='elementOnly'"
 * @generated
 */
public interface DescribeCoverageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name or identifier of this coverage. The same name value shall not be used for any other coverages available from the same server. A client can obtain this name by a prior GetCapabilities request, or possibly from a third-party source. If this element is omitted, the server may return descriptions of every coverage offering available, or return a service exception. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute list.
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDescribeCoverageType_Coverage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCoverage();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * The default value is <code>"WCS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #isSetService()
	 * @see #unsetService()
	 * @see #setService(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDescribeCoverageType_Service()
	 * @model default="WCS" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #isSetService()
	 * @see #unsetService()
	 * @see #getService()
	 * @generated
	 */
	void setService(String value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetService()
	 * @see #getService()
	 * @see #setService(String)
	 * @generated
	 */
	void unsetService();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getService <em>Service</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service</em>' attribute is set.
	 * @see #unsetService()
	 * @see #getService()
	 * @see #setService(String)
	 * @generated
	 */
	boolean isSetService();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getDescribeCoverageType_Version()
	 * @model default="1.0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // DescribeCoverageType
