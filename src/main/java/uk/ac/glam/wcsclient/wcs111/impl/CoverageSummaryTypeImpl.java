/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.ows110.MetadataType;
import uk.ac.glam.wcsclient.ows110.WGS84BoundingBoxType;

import uk.ac.glam.wcsclient.ows110.impl.DescriptionTypeImpl;

import uk.ac.glam.wcsclient.wcs111.CoverageSummaryType;
import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Summary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getSupportedCRS <em>Supported CRS</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getSupportedFormat <em>Supported Format</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getCoverageSummary <em>Coverage Summary</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl#getIdentifier1 <em>Identifier1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageSummaryTypeImpl extends DescriptionTypeImpl implements CoverageSummaryType {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataType> metadata;

	/**
	 * The cached value of the '{@link #getWGS84BoundingBox() <em>WGS84 Bounding Box</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWGS84BoundingBox()
	 * @generated
	 * @ordered
	 */
	protected EList<WGS84BoundingBoxType> wGS84BoundingBox;

	/**
	 * The cached value of the '{@link #getSupportedCRS() <em>Supported CRS</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCRS()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedCRS;

	/**
	 * The cached value of the '{@link #getSupportedFormat() <em>Supported Format</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedFormat;

	/**
	 * The cached value of the '{@link #getCoverageSummary() <em>Coverage Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageSummary()
	 * @generated
	 * @ordered
	 */
	protected EList<CoverageSummaryType> coverageSummary;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier1() <em>Identifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier1()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier1() <em>Identifier1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier1()
	 * @generated
	 * @ordered
	 */
	protected String identifier1 = IDENTIFIER1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageSummaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs111Package.Literals.COVERAGE_SUMMARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataType> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetadataType>(MetadataType.class, this, Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WGS84BoundingBoxType> getWGS84BoundingBox() {
		if (wGS84BoundingBox == null) {
			wGS84BoundingBox = new EObjectContainmentEList<WGS84BoundingBoxType>(WGS84BoundingBoxType.class, this, Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX);
		}
		return wGS84BoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedCRS() {
		if (supportedCRS == null) {
			supportedCRS = new EDataTypeEList<String>(String.class, this, Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS);
		}
		return supportedCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedFormat() {
		if (supportedFormat == null) {
			supportedFormat = new EDataTypeEList<String>(String.class, this, Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT);
		}
		return supportedFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoverageSummaryType> getCoverageSummary() {
		if (coverageSummary == null) {
			coverageSummary = new EObjectContainmentEList<CoverageSummaryType>(CoverageSummaryType.class, this, Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY);
		}
		return coverageSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier1() {
		return identifier1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier1(String newIdentifier1) {
		String oldIdentifier1 = identifier1;
		identifier1 = newIdentifier1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER1, oldIdentifier1, identifier1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX:
				return ((InternalEList<?>)getWGS84BoundingBox()).basicRemove(otherEnd, msgs);
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY:
				return ((InternalEList<?>)getCoverageSummary()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA:
				return getMetadata();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX:
				return getWGS84BoundingBox();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS:
				return getSupportedCRS();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT:
				return getSupportedFormat();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY:
				return getCoverageSummary();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER:
				return getIdentifier();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER1:
				return getIdentifier1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetadataType>)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX:
				getWGS84BoundingBox().clear();
				getWGS84BoundingBox().addAll((Collection<? extends WGS84BoundingBoxType>)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS:
				getSupportedCRS().clear();
				getSupportedCRS().addAll((Collection<? extends String>)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT:
				getSupportedFormat().clear();
				getSupportedFormat().addAll((Collection<? extends String>)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY:
				getCoverageSummary().clear();
				getCoverageSummary().addAll((Collection<? extends CoverageSummaryType>)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER1:
				setIdentifier1((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA:
				getMetadata().clear();
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX:
				getWGS84BoundingBox().clear();
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS:
				getSupportedCRS().clear();
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT:
				getSupportedFormat().clear();
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY:
				getCoverageSummary().clear();
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER1:
				setIdentifier1(IDENTIFIER1_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX:
				return wGS84BoundingBox != null && !wGS84BoundingBox.isEmpty();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS:
				return supportedCRS != null && !supportedCRS.isEmpty();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT:
				return supportedFormat != null && !supportedFormat.isEmpty();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY:
				return coverageSummary != null && !coverageSummary.isEmpty();
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Wcs111Package.COVERAGE_SUMMARY_TYPE__IDENTIFIER1:
				return IDENTIFIER1_EDEFAULT == null ? identifier1 != null : !IDENTIFIER1_EDEFAULT.equals(identifier1);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (supportedCRS: ");
		result.append(supportedCRS);
		result.append(", supportedFormat: ");
		result.append(supportedFormat);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", identifier1: ");
		result.append(identifier1);
		result.append(')');
		return result.toString();
	}

} //CoverageSummaryTypeImpl
