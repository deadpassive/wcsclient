/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.gml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage
 * @generated
 */
public class GmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSwitch<Adapter> modelSwitch =
		new GmlSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
				return createAbstractGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometryBaseType(AbstractGeometryBaseType object) {
				return createAbstractGeometryBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometryType(AbstractGeometryType object) {
				return createAbstractGeometryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetaDataType(AbstractMetaDataType object) {
				return createAbstractMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingPropertyType(AbstractRingPropertyType object) {
				return createAbstractRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingType(AbstractRingType object) {
				return createAbstractRingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceType(AbstractSurfaceType object) {
				return createAbstractSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseBoundingShapeType(BoundingShapeType object) {
				return createBoundingShapeTypeAdapter();
			}
			@Override
			public Adapter caseCodeListType(CodeListType object) {
				return createCodeListTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionType(DirectPositionType object) {
				return createDirectPositionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnvelopeType(EnvelopeType object) {
				return createEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
				return createEnvelopeWithTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseGridEnvelopeType(GridEnvelopeType object) {
				return createGridEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseGridLimitsType(GridLimitsType object) {
				return createGridLimitsTypeAdapter();
			}
			@Override
			public Adapter caseGridType(GridType object) {
				return createGridTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingType(LinearRingType object) {
				return createLinearRingTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataPropertyType(MetaDataPropertyType object) {
				return createMetaDataPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridType(RectifiedGridType object) {
				return createRectifiedGridTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseStringOrRefType(StringOrRefType object) {
				return createStringOrRefTypeAdapter();
			}
			@Override
			public Adapter caseTimePositionType(TimePositionType object) {
				return createTimePositionTypeAdapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometricPrimitiveType <em>Abstract Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryBaseType <em>Abstract Geometry Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryBaseType
	 * @generated
	 */
	public Adapter createAbstractGeometryBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryType <em>Abstract Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryType
	 * @generated
	 */
	public Adapter createAbstractGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractMetaDataType <em>Abstract Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractMetaDataType
	 * @generated
	 */
	public Adapter createAbstractMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractRingPropertyType <em>Abstract Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractRingPropertyType
	 * @generated
	 */
	public Adapter createAbstractRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractRingType <em>Abstract Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractRingType
	 * @generated
	 */
	public Adapter createAbstractRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.AbstractSurfaceType <em>Abstract Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.AbstractSurfaceType
	 * @generated
	 */
	public Adapter createAbstractSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.BoundingShapeType <em>Bounding Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.BoundingShapeType
	 * @generated
	 */
	public Adapter createBoundingShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.CodeListType <em>Code List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.CodeListType
	 * @generated
	 */
	public Adapter createCodeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.DirectPositionType <em>Direct Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.DirectPositionType
	 * @generated
	 */
	public Adapter createDirectPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.EnvelopeType <em>Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.EnvelopeType
	 * @generated
	 */
	public Adapter createEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.EnvelopeWithTimePeriodType <em>Envelope With Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.EnvelopeWithTimePeriodType
	 * @generated
	 */
	public Adapter createEnvelopeWithTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType <em>Grid Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GridEnvelopeType
	 * @generated
	 */
	public Adapter createGridEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.GridLimitsType <em>Grid Limits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GridLimitsType
	 * @generated
	 */
	public Adapter createGridLimitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.GridType
	 * @generated
	 */
	public Adapter createGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.LinearRingType
	 * @generated
	 */
	public Adapter createLinearRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.MetaDataPropertyType <em>Meta Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.MetaDataPropertyType
	 * @generated
	 */
	public Adapter createMetaDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.RectifiedGridType <em>Rectified Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.RectifiedGridType
	 * @generated
	 */
	public Adapter createRectifiedGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.StringOrRefType <em>String Or Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.StringOrRefType
	 * @generated
	 */
	public Adapter createStringOrRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.TimePositionType <em>Time Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.TimePositionType
	 * @generated
	 */
	public Adapter createTimePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.gml.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.gml.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GmlAdapterFactory
