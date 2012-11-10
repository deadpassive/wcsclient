/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.glam.wcsclient.wcs100.MetadataLinkType;
import uk.ac.glam.wcsclient.wcs100.MetadataTypeType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.MetadataLinkTypeImpl#getMetadataType <em>Metadata Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetadataLinkTypeImpl extends MetadataAssociationTypeImpl implements MetadataLinkType {
	/**
	 * The default value of the '{@link #getMetadataType() <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataType()
	 * @generated
	 * @ordered
	 */
	protected static final MetadataTypeType METADATA_TYPE_EDEFAULT = MetadataTypeType.TC211;

	/**
	 * The cached value of the '{@link #getMetadataType() <em>Metadata Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataType()
	 * @generated
	 * @ordered
	 */
	protected MetadataTypeType metadataType = METADATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Metadata Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metadataTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.METADATA_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTypeType getMetadataType() {
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataType(MetadataTypeType newMetadataType) {
		MetadataTypeType oldMetadataType = metadataType;
		metadataType = newMetadataType == null ? METADATA_TYPE_EDEFAULT : newMetadataType;
		boolean oldMetadataTypeESet = metadataTypeESet;
		metadataTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE, oldMetadataType, metadataType, !oldMetadataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMetadataType() {
		MetadataTypeType oldMetadataType = metadataType;
		boolean oldMetadataTypeESet = metadataTypeESet;
		metadataType = METADATA_TYPE_EDEFAULT;
		metadataTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE, oldMetadataType, METADATA_TYPE_EDEFAULT, oldMetadataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataType() {
		return metadataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE:
				return getMetadataType();
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
			case Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE:
				setMetadataType((MetadataTypeType)newValue);
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
			case Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE:
				unsetMetadataType();
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
			case Wcs100Package.METADATA_LINK_TYPE__METADATA_TYPE:
				return isSetMetadataType();
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
		result.append(" (metadataType: ");
		if (metadataTypeESet) result.append(metadataType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MetadataLinkTypeImpl
