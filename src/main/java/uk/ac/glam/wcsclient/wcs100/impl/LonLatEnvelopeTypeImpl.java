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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

import uk.ac.glam.wcsclient.wcs100.gml.TimePositionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lon Lat Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.LonLatEnvelopeTypeImpl#getTimePosition <em>Time Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LonLatEnvelopeTypeImpl extends LonLatEnvelopeBaseTypeImpl implements LonLatEnvelopeType {
	/**
	 * The cached value of the '{@link #getTimePosition() <em>Time Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePosition()
	 * @generated
	 * @ordered
	 */
	protected EList<TimePositionType> timePosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LonLatEnvelopeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.LON_LAT_ENVELOPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimePositionType> getTimePosition() {
		if (timePosition == null) {
			timePosition = new EObjectContainmentEList<TimePositionType>(TimePositionType.class, this, Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION);
		}
		return timePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION:
				return ((InternalEList<?>)getTimePosition()).basicRemove(otherEnd, msgs);
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
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION:
				return getTimePosition();
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
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION:
				getTimePosition().clear();
				getTimePosition().addAll((Collection<? extends TimePositionType>)newValue);
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
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION:
				getTimePosition().clear();
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
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE__TIME_POSITION:
				return timePosition != null && !timePosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LonLatEnvelopeTypeImpl
