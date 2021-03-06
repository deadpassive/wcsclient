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
 * A representation of the model object '<em><b>Get Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getSourceCoverage <em>Source Coverage</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getDomainSubset <em>Domain Subset</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getRangeSubset <em>Range Subset</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getInterpolationMethod <em>Interpolation Method</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getOutput <em>Output</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getService <em>Service</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType()
 * @model extendedMetaData="name='GetCoverage_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface GetCoverageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coverage offering (identified by its "name") that this request will draw from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Coverage</em>' attribute.
	 * @see #setSourceCoverage(String)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_SourceCoverage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='sourceCoverage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceCoverage();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getSourceCoverage <em>Source Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Coverage</em>' attribute.
	 * @see #getSourceCoverage()
	 * @generated
	 */
	void setSourceCoverage(String value);

	/**
	 * Returns the value of the '<em><b>Domain Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Subset</em>' containment reference.
	 * @see #setDomainSubset(DomainSubsetType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_DomainSubset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='domainSubset' namespace='##targetNamespace'"
	 * @generated
	 */
	DomainSubsetType getDomainSubset();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getDomainSubset <em>Domain Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Subset</em>' containment reference.
	 * @see #getDomainSubset()
	 * @generated
	 */
	void setDomainSubset(DomainSubsetType value);

	/**
	 * Returns the value of the '<em><b>Range Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Subset</em>' containment reference.
	 * @see #setRangeSubset(RangeSubsetType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_RangeSubset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rangeSubset' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeSubsetType getRangeSubset();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getRangeSubset <em>Range Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Subset</em>' containment reference.
	 * @see #getRangeSubset()
	 * @generated
	 */
	void setRangeSubset(RangeSubsetType value);

	/**
	 * Returns the value of the '<em><b>Interpolation Method</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs100.InterpolationMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spatial interpolation method to be used in  resampling data from its original form to the requested CRS and/or grid size. Method shall be among those listed for the requested coverage in the DescribeCoverage response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation Method</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.InterpolationMethodType
	 * @see #isSetInterpolationMethod()
	 * @see #unsetInterpolationMethod()
	 * @see #setInterpolationMethod(InterpolationMethodType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_InterpolationMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='interpolationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	InterpolationMethodType getInterpolationMethod();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getInterpolationMethod <em>Interpolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation Method</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs100.InterpolationMethodType
	 * @see #isSetInterpolationMethod()
	 * @see #unsetInterpolationMethod()
	 * @see #getInterpolationMethod()
	 * @generated
	 */
	void setInterpolationMethod(InterpolationMethodType value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getInterpolationMethod <em>Interpolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpolationMethod()
	 * @see #getInterpolationMethod()
	 * @see #setInterpolationMethod(InterpolationMethodType)
	 * @generated
	 */
	void unsetInterpolationMethod();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getInterpolationMethod <em>Interpolation Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpolation Method</em>' attribute is set.
	 * @see #unsetInterpolationMethod()
	 * @see #getInterpolationMethod()
	 * @see #setInterpolationMethod(InterpolationMethodType)
	 * @generated
	 */
	boolean isSetInterpolationMethod();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(OutputType)
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_Output()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputType getOutput();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputType value);

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
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_Service()
	 * @model default="WCS" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='service'"
	 * @generated
	 */
	String getService();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getService <em>Service</em>}' attribute.
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
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetService()
	 * @see #getService()
	 * @see #setService(String)
	 * @generated
	 */
	void unsetService();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getService <em>Service</em>}' attribute is set.
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
	 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package#getGetCoverageType_Version()
	 * @model default="1.0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // GetCoverageType
