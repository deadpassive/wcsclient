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

import uk.ac.glam.wcsclient.wcs100.AbstractDescriptionBaseType;
import uk.ac.glam.wcsclient.wcs100.MetadataLinkType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

import uk.ac.glam.wcsclient.wcs100.gml.impl.AbstractGMLTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Description Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.AbstractDescriptionBaseTypeImpl#getMetadataLink <em>Metadata Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDescriptionBaseTypeImpl extends AbstractGMLTypeImpl implements AbstractDescriptionBaseType {
	/**
	 * The cached value of the '{@link #getMetadataLink() <em>Metadata Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataLink()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataLinkType> metadataLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDescriptionBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.ABSTRACT_DESCRIPTION_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetadataLinkType> getMetadataLink() {
		if (metadataLink == null) {
			metadataLink = new EObjectContainmentEList<MetadataLinkType>(MetadataLinkType.class, this, Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK);
		}
		return metadataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK:
				return ((InternalEList<?>)getMetadataLink()).basicRemove(otherEnd, msgs);
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
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK:
				return getMetadataLink();
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
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK:
				getMetadataLink().clear();
				getMetadataLink().addAll((Collection<? extends MetadataLinkType>)newValue);
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
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK:
				getMetadataLink().clear();
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
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE__METADATA_LINK:
				return metadataLink != null && !metadataLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractDescriptionBaseTypeImpl
