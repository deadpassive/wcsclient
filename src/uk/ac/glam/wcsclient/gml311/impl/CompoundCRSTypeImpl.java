/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.gml311.CompoundCRSType;
import uk.ac.glam.wcsclient.gml311.CoordinateReferenceSystemRefType;
import uk.ac.glam.wcsclient.gml311.Gml311Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.CompoundCRSTypeImpl#getIncludesCRS <em>Includes CRS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements CompoundCRSType {
	/**
	 * The cached value of the '{@link #getIncludesCRS() <em>Includes CRS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesCRS()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateReferenceSystemRefType> includesCRS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gml311Package.eINSTANCE.getCompoundCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinateReferenceSystemRefType> getIncludesCRS() {
		if (includesCRS == null) {
			includesCRS = new EObjectContainmentEList<CoordinateReferenceSystemRefType>(CoordinateReferenceSystemRefType.class, this, Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS);
		}
		return includesCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS:
				return ((InternalEList<?>)getIncludesCRS()).basicRemove(otherEnd, msgs);
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
			case Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS:
				return getIncludesCRS();
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
			case Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS:
				getIncludesCRS().clear();
				getIncludesCRS().addAll((Collection<? extends CoordinateReferenceSystemRefType>)newValue);
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
			case Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS:
				getIncludesCRS().clear();
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
			case Gml311Package.COMPOUND_CRS_TYPE__INCLUDES_CRS:
				return includesCRS != null && !includesCRS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompoundCRSTypeImpl
