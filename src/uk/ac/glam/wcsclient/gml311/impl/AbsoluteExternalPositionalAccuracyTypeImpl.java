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

import uk.ac.glam.wcsclient.gml311.AbsoluteExternalPositionalAccuracyType;
import uk.ac.glam.wcsclient.gml311.Gml311Package;
import uk.ac.glam.wcsclient.gml311.MeasureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute External Positional Accuracy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.AbsoluteExternalPositionalAccuracyTypeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbsoluteExternalPositionalAccuracyTypeImpl extends AbstractPositionalAccuracyTypeImpl implements AbsoluteExternalPositionalAccuracyType {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected MeasureType result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteExternalPositionalAccuracyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gml311Package.eINSTANCE.getAbsoluteExternalPositionalAccuracyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(MeasureType newResult, NotificationChain msgs) {
		MeasureType oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(MeasureType newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT:
				return basicSetResult(null, msgs);
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
			case Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT:
				return getResult();
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
			case Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT:
				setResult((MeasureType)newValue);
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
			case Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT:
				setResult((MeasureType)null);
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
			case Gml311Package.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE__RESULT:
				return result != null;
		}
		return super.eIsSet(featureID);
	}

} //AbsoluteExternalPositionalAccuracyTypeImpl
