/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import uk.ac.glam.wcsclient.wcs100.TelephoneType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.TelephoneTypeImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.TelephoneTypeImpl#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelephoneTypeImpl extends EObjectImpl implements TelephoneType {
	/**
	 * The cached value of the '{@link #getVoice() <em>Voice</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected EList<String> voice;

	/**
	 * The cached value of the '{@link #getFacsimile() <em>Facsimile</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimile()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facsimile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.TELEPHONE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVoice() {
		if (voice == null) {
			voice = new EDataTypeEList<String>(String.class, this, Wcs100Package.TELEPHONE_TYPE__VOICE);
		}
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFacsimile() {
		if (facsimile == null) {
			facsimile = new EDataTypeEList<String>(String.class, this, Wcs100Package.TELEPHONE_TYPE__FACSIMILE);
		}
		return facsimile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs100Package.TELEPHONE_TYPE__VOICE:
				return getVoice();
			case Wcs100Package.TELEPHONE_TYPE__FACSIMILE:
				return getFacsimile();
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
			case Wcs100Package.TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends String>)newValue);
				return;
			case Wcs100Package.TELEPHONE_TYPE__FACSIMILE:
				getFacsimile().clear();
				getFacsimile().addAll((Collection<? extends String>)newValue);
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
			case Wcs100Package.TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				return;
			case Wcs100Package.TELEPHONE_TYPE__FACSIMILE:
				getFacsimile().clear();
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
			case Wcs100Package.TELEPHONE_TYPE__VOICE:
				return voice != null && !voice.isEmpty();
			case Wcs100Package.TELEPHONE_TYPE__FACSIMILE:
				return facsimile != null && !facsimile.isEmpty();
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
		result.append(" (voice: ");
		result.append(voice);
		result.append(", facsimile: ");
		result.append(facsimile);
		result.append(')');
		return result.toString();
	}

} //TelephoneTypeImpl
