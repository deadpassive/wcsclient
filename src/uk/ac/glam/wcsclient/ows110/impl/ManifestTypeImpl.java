/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.ows110.ManifestType;
import uk.ac.glam.wcsclient.ows110.Ows110Package;
import uk.ac.glam.wcsclient.ows110.ReferenceGroupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.impl.ManifestTypeImpl#getReferenceGroupGroup <em>Reference Group Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.impl.ManifestTypeImpl#getReferenceGroup <em>Reference Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestTypeImpl extends BasicIdentificationTypeImpl implements ManifestType {
	/**
	 * The cached value of the '{@link #getReferenceGroupGroup() <em>Reference Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap referenceGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ows110Package.Literals.MANIFEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getReferenceGroupGroup() {
		if (referenceGroupGroup == null) {
			referenceGroupGroup = new BasicFeatureMap(this, Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP);
		}
		return referenceGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceGroupType> getReferenceGroup() {
		return getReferenceGroupGroup().list(Ows110Package.Literals.MANIFEST_TYPE__REFERENCE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP:
				return ((InternalEList<?>)getReferenceGroupGroup()).basicRemove(otherEnd, msgs);
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP:
				return ((InternalEList<?>)getReferenceGroup()).basicRemove(otherEnd, msgs);
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
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP:
				if (coreType) return getReferenceGroupGroup();
				return ((FeatureMap.Internal)getReferenceGroupGroup()).getWrapper();
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP:
				return getReferenceGroup();
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
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP:
				((FeatureMap.Internal)getReferenceGroupGroup()).set(newValue);
				return;
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP:
				getReferenceGroup().clear();
				getReferenceGroup().addAll((Collection<? extends ReferenceGroupType>)newValue);
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
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP:
				getReferenceGroupGroup().clear();
				return;
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP:
				getReferenceGroup().clear();
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
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP_GROUP:
				return referenceGroupGroup != null && !referenceGroupGroup.isEmpty();
			case Ows110Package.MANIFEST_TYPE__REFERENCE_GROUP:
				return !getReferenceGroup().isEmpty();
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
		result.append(" (referenceGroupGroup: ");
		result.append(referenceGroupGroup);
		result.append(')');
		return result.toString();
	}

} //ManifestTypeImpl
