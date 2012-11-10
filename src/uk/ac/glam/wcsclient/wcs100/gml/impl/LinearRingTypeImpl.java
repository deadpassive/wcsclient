/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.wcs100.gml.DirectPositionType;
import uk.ac.glam.wcsclient.wcs100.gml.GmlPackage;
import uk.ac.glam.wcsclient.wcs100.gml.LinearRingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Ring Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.impl.LinearRingTypeImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearRingTypeImpl extends AbstractRingTypeImpl implements LinearRingType {
	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectPositionType> pos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearRingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.Literals.LINEAR_RING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectPositionType> getPos() {
		if (pos == null) {
			pos = new EObjectContainmentEList<DirectPositionType>(DirectPositionType.class, this, GmlPackage.LINEAR_RING_TYPE__POS);
		}
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.LINEAR_RING_TYPE__POS:
				return ((InternalEList<?>)getPos()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.LINEAR_RING_TYPE__POS:
				return getPos();
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
			case GmlPackage.LINEAR_RING_TYPE__POS:
				getPos().clear();
				getPos().addAll((Collection<? extends DirectPositionType>)newValue);
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
			case GmlPackage.LINEAR_RING_TYPE__POS:
				getPos().clear();
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
			case GmlPackage.LINEAR_RING_TYPE__POS:
				return pos != null && !pos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinearRingTypeImpl
