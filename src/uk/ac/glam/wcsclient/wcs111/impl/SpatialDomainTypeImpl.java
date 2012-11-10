/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.impl;

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

import uk.ac.glam.wcsclient.gml311.AbstractCoordinateOperationType;
import uk.ac.glam.wcsclient.gml311.PolygonType;

import uk.ac.glam.wcsclient.ows110.BoundingBoxType;

import uk.ac.glam.wcsclient.wcs111.GridCrsType;
import uk.ac.glam.wcsclient.wcs111.ImageCRSRefType;
import uk.ac.glam.wcsclient.wcs111.SpatialDomainType;
import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getBoundingBoxGroup <em>Bounding Box Group</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getGridCRS <em>Grid CRS</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getImageCRS <em>Image CRS</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl#getPolygon <em>Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpatialDomainTypeImpl extends EObjectImpl implements SpatialDomainType {
	/**
	 * The cached value of the '{@link #getBoundingBoxGroup() <em>Bounding Box Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBoxGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap boundingBoxGroup;

	/**
	 * The cached value of the '{@link #getGridCRS() <em>Grid CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridCRS()
	 * @generated
	 * @ordered
	 */
	protected GridCrsType gridCRS;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected AbstractCoordinateOperationType transformation;

	/**
	 * The cached value of the '{@link #getImageCRS() <em>Image CRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCRS()
	 * @generated
	 * @ordered
	 */
	protected ImageCRSRefType imageCRS;

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
		return Wcs111Package.Literals.SPATIAL_DOMAIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBoundingBoxGroup() {
		if (boundingBoxGroup == null) {
			boundingBoxGroup = new BasicFeatureMap(this, Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP);
		}
		return boundingBoxGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundingBoxType> getBoundingBox() {
		return getBoundingBoxGroup().list(Wcs111Package.Literals.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridCrsType getGridCRS() {
		return gridCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridCRS(GridCrsType newGridCRS, NotificationChain msgs) {
		GridCrsType oldGridCRS = gridCRS;
		gridCRS = newGridCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS, oldGridCRS, newGridCRS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridCRS(GridCrsType newGridCRS) {
		if (newGridCRS != gridCRS) {
			NotificationChain msgs = null;
			if (gridCRS != null)
				msgs = ((InternalEObject)gridCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS, null, msgs);
			if (newGridCRS != null)
				msgs = ((InternalEObject)newGridCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS, null, msgs);
			msgs = basicSetGridCRS(newGridCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS, newGridCRS, newGridCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinateOperationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(AbstractCoordinateOperationType newTransformation, NotificationChain msgs) {
		AbstractCoordinateOperationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(AbstractCoordinateOperationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCRSRefType getImageCRS() {
		return imageCRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCRS(ImageCRSRefType newImageCRS, NotificationChain msgs) {
		ImageCRSRefType oldImageCRS = imageCRS;
		imageCRS = newImageCRS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS, oldImageCRS, newImageCRS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCRS(ImageCRSRefType newImageCRS) {
		if (newImageCRS != imageCRS) {
			NotificationChain msgs = null;
			if (imageCRS != null)
				msgs = ((InternalEObject)imageCRS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS, null, msgs);
			if (newImageCRS != null)
				msgs = ((InternalEObject)newImageCRS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS, null, msgs);
			msgs = basicSetImageCRS(newImageCRS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS, newImageCRS, newImageCRS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		if (polygon == null) {
			polygon = new EObjectContainmentEList<PolygonType>(PolygonType.class, this, Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON);
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
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP:
				return ((InternalEList<?>)getBoundingBoxGroup()).basicRemove(otherEnd, msgs);
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX:
				return ((InternalEList<?>)getBoundingBox()).basicRemove(otherEnd, msgs);
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS:
				return basicSetGridCRS(null, msgs);
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS:
				return basicSetImageCRS(null, msgs);
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON:
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
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP:
				if (coreType) return getBoundingBoxGroup();
				return ((FeatureMap.Internal)getBoundingBoxGroup()).getWrapper();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX:
				return getBoundingBox();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS:
				return getGridCRS();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION:
				return getTransformation();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS:
				return getImageCRS();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON:
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
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP:
				((FeatureMap.Internal)getBoundingBoxGroup()).set(newValue);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				getBoundingBox().addAll((Collection<? extends BoundingBoxType>)newValue);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS:
				setGridCRS((GridCrsType)newValue);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION:
				setTransformation((AbstractCoordinateOperationType)newValue);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS:
				setImageCRS((ImageCRSRefType)newValue);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON:
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
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP:
				getBoundingBoxGroup().clear();
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX:
				getBoundingBox().clear();
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS:
				setGridCRS((GridCrsType)null);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION:
				setTransformation((AbstractCoordinateOperationType)null);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS:
				setImageCRS((ImageCRSRefType)null);
				return;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON:
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
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP:
				return boundingBoxGroup != null && !boundingBoxGroup.isEmpty();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__BOUNDING_BOX:
				return !getBoundingBox().isEmpty();
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__GRID_CRS:
				return gridCRS != null;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__TRANSFORMATION:
				return transformation != null;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__IMAGE_CRS:
				return imageCRS != null;
			case Wcs111Package.SPATIAL_DOMAIN_TYPE__POLYGON:
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
		result.append(" (boundingBoxGroup: ");
		result.append(boundingBoxGroup);
		result.append(')');
		return result.toString();
	}

} //SpatialDomainTypeImpl
