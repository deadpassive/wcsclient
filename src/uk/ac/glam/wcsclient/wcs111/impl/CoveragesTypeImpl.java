/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.ows110.ReferenceGroupType;

import uk.ac.glam.wcsclient.wcs111.CoveragesType;
import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverages Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.CoveragesTypeImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoveragesTypeImpl extends EObjectImpl implements CoveragesType {
	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceGroupType> coverage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoveragesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs111Package.Literals.COVERAGES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceGroupType> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<ReferenceGroupType>(ReferenceGroupType.class, this, Wcs111Package.COVERAGES_TYPE__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs111Package.COVERAGES_TYPE__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
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
			case Wcs111Package.COVERAGES_TYPE__COVERAGE:
				return getCoverage();
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
			case Wcs111Package.COVERAGES_TYPE__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends ReferenceGroupType>)newValue);
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
			case Wcs111Package.COVERAGES_TYPE__COVERAGE:
				getCoverage().clear();
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
			case Wcs111Package.COVERAGES_TYPE__COVERAGE:
				return coverage != null && !coverage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoveragesTypeImpl
