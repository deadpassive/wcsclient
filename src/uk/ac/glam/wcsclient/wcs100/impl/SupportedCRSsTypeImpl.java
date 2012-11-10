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

import uk.ac.glam.wcsclient.wcs100.SupportedCRSsType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

import uk.ac.glam.wcsclient.wcs100.gml.CodeListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported CR Ss Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedCRSsTypeImpl#getRequestResponseCRSs <em>Request Response CR Ss</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedCRSsTypeImpl#getRequestCRSs <em>Request CR Ss</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedCRSsTypeImpl#getResponseCRSs <em>Response CR Ss</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SupportedCRSsTypeImpl#getNativeCRSs <em>Native CR Ss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedCRSsTypeImpl extends EObjectImpl implements SupportedCRSsType {
	/**
	 * The cached value of the '{@link #getRequestResponseCRSs() <em>Request Response CR Ss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestResponseCRSs()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeListType> requestResponseCRSs;

	/**
	 * The cached value of the '{@link #getRequestCRSs() <em>Request CR Ss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestCRSs()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeListType> requestCRSs;

	/**
	 * The cached value of the '{@link #getResponseCRSs() <em>Response CR Ss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCRSs()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeListType> responseCRSs;

	/**
	 * The cached value of the '{@link #getNativeCRSs() <em>Native CR Ss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeCRSs()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeListType> nativeCRSs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedCRSsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.SUPPORTED_CR_SS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeListType> getRequestResponseCRSs() {
		if (requestResponseCRSs == null) {
			requestResponseCRSs = new EObjectContainmentEList<CodeListType>(CodeListType.class, this, Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS);
		}
		return requestResponseCRSs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeListType> getRequestCRSs() {
		if (requestCRSs == null) {
			requestCRSs = new EObjectContainmentEList<CodeListType>(CodeListType.class, this, Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS);
		}
		return requestCRSs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeListType> getResponseCRSs() {
		if (responseCRSs == null) {
			responseCRSs = new EObjectContainmentEList<CodeListType>(CodeListType.class, this, Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS);
		}
		return responseCRSs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeListType> getNativeCRSs() {
		if (nativeCRSs == null) {
			nativeCRSs = new EObjectContainmentEList<CodeListType>(CodeListType.class, this, Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS);
		}
		return nativeCRSs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS:
				return ((InternalEList<?>)getRequestResponseCRSs()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS:
				return ((InternalEList<?>)getRequestCRSs()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS:
				return ((InternalEList<?>)getResponseCRSs()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS:
				return ((InternalEList<?>)getNativeCRSs()).basicRemove(otherEnd, msgs);
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
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS:
				return getRequestResponseCRSs();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS:
				return getRequestCRSs();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS:
				return getResponseCRSs();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS:
				return getNativeCRSs();
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
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS:
				getRequestResponseCRSs().clear();
				getRequestResponseCRSs().addAll((Collection<? extends CodeListType>)newValue);
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS:
				getRequestCRSs().clear();
				getRequestCRSs().addAll((Collection<? extends CodeListType>)newValue);
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS:
				getResponseCRSs().clear();
				getResponseCRSs().addAll((Collection<? extends CodeListType>)newValue);
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS:
				getNativeCRSs().clear();
				getNativeCRSs().addAll((Collection<? extends CodeListType>)newValue);
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
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS:
				getRequestResponseCRSs().clear();
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS:
				getRequestCRSs().clear();
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS:
				getResponseCRSs().clear();
				return;
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS:
				getNativeCRSs().clear();
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
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_RESPONSE_CR_SS:
				return requestResponseCRSs != null && !requestResponseCRSs.isEmpty();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__REQUEST_CR_SS:
				return requestCRSs != null && !requestCRSs.isEmpty();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__RESPONSE_CR_SS:
				return responseCRSs != null && !responseCRSs.isEmpty();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE__NATIVE_CR_SS:
				return nativeCRSs != null && !nativeCRSs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupportedCRSsTypeImpl
