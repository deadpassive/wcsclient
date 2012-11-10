/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType;
import uk.ac.glam.wcsclient.wcs100.gml.CodeType;
import uk.ac.glam.wcsclient.wcs100.gml.GmlPackage;
import uk.ac.glam.wcsclient.wcs100.gml.MetaDataPropertyType;
import uk.ac.glam.wcsclient.wcs100.gml.StringOrRefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract GML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.impl.AbstractGMLTypeImpl#getMetaDataPropertyGroup <em>Meta Data Property Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.impl.AbstractGMLTypeImpl#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.impl.AbstractGMLTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.gml.impl.AbstractGMLTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractGMLTypeImpl extends EObjectImpl implements AbstractGMLType {
	/**
	 * The cached value of the '{@link #getMetaDataPropertyGroup() <em>Meta Data Property Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap metaDataPropertyGroup;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType description;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeType> name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGMLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.Literals.ABSTRACT_GML_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMetaDataPropertyGroup() {
		if (metaDataPropertyGroup == null) {
			metaDataPropertyGroup = new BasicFeatureMap(this, GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP);
		}
		return metaDataPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaDataPropertyType> getMetaDataProperty() {
		return getMetaDataPropertyGroup().list(GmlPackage.Literals.ABSTRACT_GML_TYPE__META_DATA_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringOrRefType newDescription, NotificationChain msgs) {
		StringOrRefType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(StringOrRefType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getName() {
		if (name == null) {
			name = new EObjectContainmentEList<CodeType>(CodeType.class, this, GmlPackage.ABSTRACT_GML_TYPE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP:
				return ((InternalEList<?>)getMetaDataPropertyGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return ((InternalEList<?>)getMetaDataProperty()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GmlPackage.ABSTRACT_GML_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP:
				if (coreType) return getMetaDataPropertyGroup();
				return ((FeatureMap.Internal)getMetaDataPropertyGroup()).getWrapper();
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return getMetaDataProperty();
			case GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return getDescription();
			case GmlPackage.ABSTRACT_GML_TYPE__NAME:
				return getName();
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
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP:
				((FeatureMap.Internal)getMetaDataPropertyGroup()).set(newValue);
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				getMetaDataProperty().addAll((Collection<? extends MetaDataPropertyType>)newValue);
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)newValue);
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends CodeType>)newValue);
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
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP:
				getMetaDataPropertyGroup().clear();
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)null);
				return;
			case GmlPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
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
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY_GROUP:
				return metaDataPropertyGroup != null && !metaDataPropertyGroup.isEmpty();
			case GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return !getMetaDataProperty().isEmpty();
			case GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return description != null;
			case GmlPackage.ABSTRACT_GML_TYPE__NAME:
				return name != null && !name.isEmpty();
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
		result.append(" (metaDataPropertyGroup: ");
		result.append(metaDataPropertyGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractGMLTypeImpl
