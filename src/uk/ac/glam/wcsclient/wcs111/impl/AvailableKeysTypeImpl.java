/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.glam.wcsclient.wcs111.AvailableKeysType;
import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Available Keys Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.AvailableKeysTypeImpl#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AvailableKeysTypeImpl extends EObjectImpl implements AvailableKeysType {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<String> key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailableKeysTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs111Package.Literals.AVAILABLE_KEYS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKey() {
		if (key == null) {
			key = new EDataTypeEList<String>(String.class, this, Wcs111Package.AVAILABLE_KEYS_TYPE__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs111Package.AVAILABLE_KEYS_TYPE__KEY:
				return getKey();
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
			case Wcs111Package.AVAILABLE_KEYS_TYPE__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends String>)newValue);
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
			case Wcs111Package.AVAILABLE_KEYS_TYPE__KEY:
				getKey().clear();
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
			case Wcs111Package.AVAILABLE_KEYS_TYPE__KEY:
				return key != null && !key.isEmpty();
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //AvailableKeysTypeImpl
