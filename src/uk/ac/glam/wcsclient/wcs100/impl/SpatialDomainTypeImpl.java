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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.wcs100.SpatialDomainType;
import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

import uk.ac.glam.wcsclient.wcs100.gml.EnvelopeType;
import uk.ac.glam.wcsclient.wcs100.gml.GridType;
import uk.ac.glam.wcsclient.wcs100.gml.PolygonType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SpatialDomainTypeImpl#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SpatialDomainTypeImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SpatialDomainTypeImpl#getGridGroup <em>Grid Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SpatialDomainTypeImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs100.impl.SpatialDomainTypeImpl#getPolygon <em>Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpatialDomainTypeImpl extends EObjectImpl implements SpatialDomainType {
	/**
	 * The cached value of the '{@link #getEnvelopeGroup() <em>Envelope Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelopeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap envelopeGroup;

	/**
	 * The cached value of the '{@link #getGridGroup() <em>Grid Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap gridGroup;

	/**
	 * The cached value of the '{@link #getPolygon() <em>Polygon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygon()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonType> polygon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialDomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs100Package.Literals.SPATIAL_DOMAIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEnvelopeGroup() {
		if (envelopeGroup == null) {
			envelopeGroup = new BasicFeatureMap(this, Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP);
		}
		return envelopeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvelopeType> getEnvelope() {
		return getEnvelopeGroup().list(Wcs100Package.Literals.SPATIAL_DOMAIN_TYPE__ENVELOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGridGroup() {
		if (gridGroup == null) {
			gridGroup = new BasicFeatureMap(this, Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP);
		}
		return gridGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridType> getGrid() {
		return getGridGroup().list(Wcs100Package.Literals.SPATIAL_DOMAIN_TYPE__GRID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectContainmentEList<PolygonType>(PolygonType.class, this, Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON);
		}
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP:
				return ((InternalEList<?>)getEnvelopeGroup()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE:
				return ((InternalEList<?>)getEnvelope()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP:
				return ((InternalEList<?>)getGridGroup()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID:
				return ((InternalEList<?>)getGrid()).basicRemove(otherEnd, msgs);
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
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
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP:
				if (coreType) return getEnvelopeGroup();
				return ((FeatureMap.Internal)getEnvelopeGroup()).getWrapper();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE:
				return getEnvelope();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP:
				if (coreType) return getGridGroup();
				return ((FeatureMap.Internal)getGridGroup()).getWrapper();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID:
				return getGrid();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON:
				return getPolygon();
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
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP:
				((FeatureMap.Internal)getEnvelopeGroup()).set(newValue);
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE:
				getEnvelope().clear();
				getEnvelope().addAll((Collection<? extends EnvelopeType>)newValue);
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP:
				((FeatureMap.Internal)getGridGroup()).set(newValue);
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID:
				getGrid().clear();
				getGrid().addAll((Collection<? extends GridType>)newValue);
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
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
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP:
				getEnvelopeGroup().clear();
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE:
				getEnvelope().clear();
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP:
				getGridGroup().clear();
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID:
				getGrid().clear();
				return;
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON:
				getPolygon().clear();
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
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE_GROUP:
				return envelopeGroup != null && !envelopeGroup.isEmpty();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__ENVELOPE:
				return !getEnvelope().isEmpty();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID_GROUP:
				return gridGroup != null && !gridGroup.isEmpty();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__GRID:
				return !getGrid().isEmpty();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE__POLYGON:
				return polygon != null && !polygon.isEmpty();
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
		result.append(" (envelopeGroup: ");
		result.append(envelopeGroup);
		result.append(", gridGroup: ");
		result.append(gridGroup);
		result.append(')');
		return result.toString();
	}

} //SpatialDomainTypeImpl
