/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.wcs100.DCPTypeType;
import uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType1;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Capabilities Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.GetCapabilitiesType1Impl#getDCPType <em>DCP Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetCapabilitiesType1Impl extends EObjectImpl implements GetCapabilitiesType1 {
	/**
	 * The cached value of the '{@link #getDCPType() <em>DCP Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCPType()
	 * @generated
	 * @ordered
	 */
	protected EList<DCPTypeType> dCPType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCapabilitiesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.GET_CAPABILITIES_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCPTypeType> getDCPType() {
		if (dCPType == null) {
			dCPType = new EObjectContainmentEList<DCPTypeType>(DCPTypeType.class, this, Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE);
		}
		return dCPType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE:
				return ((InternalEList<?>)getDCPType()).basicRemove(otherEnd, msgs);
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
			case Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE:
				return getDCPType();
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
			case Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE:
				getDCPType().clear();
				getDCPType().addAll((Collection<? extends DCPTypeType>)newValue);
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
			case Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE:
				getDCPType().clear();
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
			case Wcs100Package.GET_CAPABILITIES_TYPE1__DCP_TYPE:
				return dCPType != null && !dCPType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GetCapabilitiesType1Impl
