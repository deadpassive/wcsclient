/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.ows110.BasicIdentificationType;
import uk.ac.glam.wcsclient.ows110.CodeType;
import uk.ac.glam.wcsclient.ows110.MetadataType;
import uk.ac.glam.wcsclient.ows110.Ows110Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.impl.BasicIdentificationTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.impl.BasicIdentificationTypeImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicIdentificationTypeImpl extends DescriptionTypeImpl implements BasicIdentificationType {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected CodeType identifier;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataType> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ows110Package.Literals.BASIC_IDENTIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(CodeType newIdentifier, NotificationChain msgs) {
		CodeType oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(CodeType newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataType> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetadataType>(MetadataType.class, this, Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER:
				return getIdentifier();
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA:
				return getMetadata();
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
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER:
				setIdentifier((CodeType)newValue);
				return;
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetadataType>)newValue);
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
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER:
				setIdentifier((CodeType)null);
				return;
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA:
				getMetadata().clear();
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
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__IDENTIFIER:
				return identifier != null;
			case Ows110Package.BASIC_IDENTIFICATION_TYPE__METADATA:
				return metadata != null && !metadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicIdentificationTypeImpl
