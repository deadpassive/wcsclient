/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.gml311.AbstractCurveSegmentType;
import uk.ac.glam.wcsclient.gml311.CurveSegmentArrayPropertyType;
import uk.ac.glam.wcsclient.gml311.Gml311Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.CurveSegmentArrayPropertyTypeImpl#getCurveSegmentGroup <em>Curve Segment Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.impl.CurveSegmentArrayPropertyTypeImpl#getCurveSegment <em>Curve Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurveSegmentArrayPropertyTypeImpl extends EObjectImpl implements CurveSegmentArrayPropertyType {
	/**
	 * The cached value of the '{@link #getCurveSegmentGroup() <em>Curve Segment Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveSegmentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap curveSegmentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveSegmentArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gml311Package.eINSTANCE.getCurveSegmentArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCurveSegmentGroup() {
		if (curveSegmentGroup == null) {
			curveSegmentGroup = new BasicFeatureMap(this, Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP);
		}
		return curveSegmentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCurveSegmentType> getCurveSegment() {
		return getCurveSegmentGroup().list(Gml311Package.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				return ((InternalEList<?>)getCurveSegmentGroup()).basicRemove(otherEnd, msgs);
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return ((InternalEList<?>)getCurveSegment()).basicRemove(otherEnd, msgs);
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
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				if (coreType) return getCurveSegmentGroup();
				return ((FeatureMap.Internal)getCurveSegmentGroup()).getWrapper();
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return getCurveSegment();
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
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				((FeatureMap.Internal)getCurveSegmentGroup()).set(newValue);
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
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				getCurveSegmentGroup().clear();
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
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
				return curveSegmentGroup != null && !curveSegmentGroup.isEmpty();
			case Gml311Package.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT:
				return !getCurveSegment().isEmpty();
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
		result.append(" (curveSegmentGroup: ");
		result.append(curveSegmentGroup);
		result.append(')');
		return result.toString();
	}

} //CurveSegmentArrayPropertyTypeImpl
