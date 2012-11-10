/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.gml311.DerivationUnitTermType;
import uk.ac.glam.wcsclient.gml311.DerivedUnitType;
import uk.ac.glam.wcsclient.gml311.Gml311Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.DerivedUnitTypeImpl#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedUnitTypeImpl extends UnitDefinitionTypeImpl implements DerivedUnitType {
	/**
	 * The cached value of the '{@link #getDerivationUnitTerm() <em>Derivation Unit Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationUnitTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivationUnitTermType> derivationUnitTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gml311Package.eINSTANCE.getDerivedUnitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivationUnitTermType> getDerivationUnitTerm() {
		if (derivationUnitTerm == null) {
			derivationUnitTerm = new EObjectContainmentEList<DerivationUnitTermType>(DerivationUnitTermType.class, this, Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM);
		}
		return derivationUnitTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM:
				return ((InternalEList<?>)getDerivationUnitTerm()).basicRemove(otherEnd, msgs);
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
			case Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM:
				return getDerivationUnitTerm();
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
			case Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM:
				getDerivationUnitTerm().clear();
				getDerivationUnitTerm().addAll((Collection<? extends DerivationUnitTermType>)newValue);
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
			case Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM:
				getDerivationUnitTerm().clear();
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
			case Gml311Package.DERIVED_UNIT_TYPE__DERIVATION_UNIT_TERM:
				return derivationUnitTerm != null && !derivationUnitTerm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivedUnitTypeImpl
