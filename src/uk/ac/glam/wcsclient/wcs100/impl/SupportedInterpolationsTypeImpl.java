/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.glam.wcsclient.wcs100.InterpolationMethodType;
import uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Interpolations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedInterpolationsTypeImpl#getInterpolationMethod <em>Interpolation Method</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedInterpolationsTypeImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedInterpolationsTypeImpl extends EObjectImpl implements SupportedInterpolationsType {
	/**
	 * The cached value of the '{@link #getInterpolationMethod() <em>Interpolation Method</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<InterpolationMethodType> interpolationMethod;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final InterpolationMethodType DEFAULT_EDEFAULT = InterpolationMethodType.NEAREST_NEIGHBOR;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected InterpolationMethodType default_ = DEFAULT_EDEFAULT;

	/**
	 * This is true if the Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedInterpolationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.SUPPORTED_INTERPOLATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterpolationMethodType> getInterpolationMethod() {
		if (interpolationMethod == null) {
			interpolationMethod = new EDataTypeEList<InterpolationMethodType>(InterpolationMethodType.class, this, Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__INTERPOLATION_METHOD);
		}
		return interpolationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethodType getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(InterpolationMethodType newDefault) {
		InterpolationMethodType oldDefault = default_;
		default_ = newDefault == null ? DEFAULT_EDEFAULT : newDefault;
		boolean oldDefaultESet = defaultESet;
		defaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT, oldDefault, default_, !oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		InterpolationMethodType oldDefault = default_;
		boolean oldDefaultESet = defaultESet;
		default_ = DEFAULT_EDEFAULT;
		defaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT, oldDefault, DEFAULT_EDEFAULT, oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return defaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__INTERPOLATION_METHOD:
				return getInterpolationMethod();
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT:
				return getDefault();
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
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__INTERPOLATION_METHOD:
				getInterpolationMethod().clear();
				getInterpolationMethod().addAll((Collection<? extends InterpolationMethodType>)newValue);
				return;
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT:
				setDefault((InterpolationMethodType)newValue);
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
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__INTERPOLATION_METHOD:
				getInterpolationMethod().clear();
				return;
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT:
				unsetDefault();
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
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__INTERPOLATION_METHOD:
				return interpolationMethod != null && !interpolationMethod.isEmpty();
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE__DEFAULT:
				return isSetDefault();
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
		result.append(" (interpolationMethod: ");
		result.append(interpolationMethod);
		result.append(", default: ");
		if (defaultESet) result.append(default_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SupportedInterpolationsTypeImpl
