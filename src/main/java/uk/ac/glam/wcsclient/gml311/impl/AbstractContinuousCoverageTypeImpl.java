/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.glam.wcsclient.gml311.AbstractContinuousCoverageType;
import uk.ac.glam.wcsclient.gml311.CoverageFunctionType;
import uk.ac.glam.wcsclient.gml311.Gml311Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Continuous Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.AbstractContinuousCoverageTypeImpl#getCoverageFunction <em>Coverage Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractContinuousCoverageTypeImpl extends AbstractCoverageTypeImpl implements AbstractContinuousCoverageType {
	/**
	 * The cached value of the '{@link #getCoverageFunction() <em>Coverage Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverageFunction()
	 * @generated
	 * @ordered
	 */
	protected CoverageFunctionType coverageFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContinuousCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gml311Package.eINSTANCE.getAbstractContinuousCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageFunctionType getCoverageFunction() {
		return coverageFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageFunction(CoverageFunctionType newCoverageFunction, NotificationChain msgs) {
		CoverageFunctionType oldCoverageFunction = coverageFunction;
		coverageFunction = newCoverageFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION, oldCoverageFunction, newCoverageFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageFunction(CoverageFunctionType newCoverageFunction) {
		if (newCoverageFunction != coverageFunction) {
			NotificationChain msgs = null;
			if (coverageFunction != null)
				msgs = ((InternalEObject)coverageFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION, null, msgs);
			if (newCoverageFunction != null)
				msgs = ((InternalEObject)newCoverageFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION, null, msgs);
			msgs = basicSetCoverageFunction(newCoverageFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION, newCoverageFunction, newCoverageFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return basicSetCoverageFunction(null, msgs);
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
			case Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return getCoverageFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)newValue);
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
			case Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)null);
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
			case Gml311Package.ABSTRACT_CONTINUOUS_COVERAGE_TYPE__COVERAGE_FUNCTION:
				return coverageFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractContinuousCoverageTypeImpl
