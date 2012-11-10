/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.gml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.gml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.gml.GmlPackage
 * @generated
 */
public class GmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSwitch() {
		if (modelPackage == null) {
			modelPackage = GmlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GmlPackage.ABSTRACT_GEOMETRIC_PRIMITIVE_TYPE: {
				AbstractGeometricPrimitiveType abstractGeometricPrimitiveType = (AbstractGeometricPrimitiveType)theEObject;
				T result = caseAbstractGeometricPrimitiveType(abstractGeometricPrimitiveType);
				if (result == null) result = caseAbstractGeometryType(abstractGeometricPrimitiveType);
				if (result == null) result = caseAbstractGeometryBaseType(abstractGeometricPrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractGeometricPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_GEOMETRY_BASE_TYPE: {
				AbstractGeometryBaseType abstractGeometryBaseType = (AbstractGeometryBaseType)theEObject;
				T result = caseAbstractGeometryBaseType(abstractGeometryBaseType);
				if (result == null) result = caseAbstractGMLType(abstractGeometryBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_GEOMETRY_TYPE: {
				AbstractGeometryType abstractGeometryType = (AbstractGeometryType)theEObject;
				T result = caseAbstractGeometryType(abstractGeometryType);
				if (result == null) result = caseAbstractGeometryBaseType(abstractGeometryType);
				if (result == null) result = caseAbstractGMLType(abstractGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_GML_TYPE: {
				AbstractGMLType abstractGMLType = (AbstractGMLType)theEObject;
				T result = caseAbstractGMLType(abstractGMLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_META_DATA_TYPE: {
				AbstractMetaDataType abstractMetaDataType = (AbstractMetaDataType)theEObject;
				T result = caseAbstractMetaDataType(abstractMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE: {
				AbstractRingPropertyType abstractRingPropertyType = (AbstractRingPropertyType)theEObject;
				T result = caseAbstractRingPropertyType(abstractRingPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_RING_TYPE: {
				AbstractRingType abstractRingType = (AbstractRingType)theEObject;
				T result = caseAbstractRingType(abstractRingType);
				if (result == null) result = caseAbstractGeometryType(abstractRingType);
				if (result == null) result = caseAbstractGeometryBaseType(abstractRingType);
				if (result == null) result = caseAbstractGMLType(abstractRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ABSTRACT_SURFACE_TYPE: {
				AbstractSurfaceType abstractSurfaceType = (AbstractSurfaceType)theEObject;
				T result = caseAbstractSurfaceType(abstractSurfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(abstractSurfaceType);
				if (result == null) result = caseAbstractGeometryType(abstractSurfaceType);
				if (result == null) result = caseAbstractGeometryBaseType(abstractSurfaceType);
				if (result == null) result = caseAbstractGMLType(abstractSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.BOUNDING_SHAPE_TYPE: {
				BoundingShapeType boundingShapeType = (BoundingShapeType)theEObject;
				T result = caseBoundingShapeType(boundingShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.CODE_LIST_TYPE: {
				CodeListType codeListType = (CodeListType)theEObject;
				T result = caseCodeListType(codeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.DIRECT_POSITION_TYPE: {
				DirectPositionType directPositionType = (DirectPositionType)theEObject;
				T result = caseDirectPositionType(directPositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ENVELOPE_TYPE: {
				EnvelopeType envelopeType = (EnvelopeType)theEObject;
				T result = caseEnvelopeType(envelopeType);
				if (result == null) result = caseAbstractGeometryType(envelopeType);
				if (result == null) result = caseAbstractGeometryBaseType(envelopeType);
				if (result == null) result = caseAbstractGMLType(envelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE: {
				EnvelopeWithTimePeriodType envelopeWithTimePeriodType = (EnvelopeWithTimePeriodType)theEObject;
				T result = caseEnvelopeWithTimePeriodType(envelopeWithTimePeriodType);
				if (result == null) result = caseEnvelopeType(envelopeWithTimePeriodType);
				if (result == null) result = caseAbstractGeometryType(envelopeWithTimePeriodType);
				if (result == null) result = caseAbstractGeometryBaseType(envelopeWithTimePeriodType);
				if (result == null) result = caseAbstractGMLType(envelopeWithTimePeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.GRID_ENVELOPE_TYPE: {
				GridEnvelopeType gridEnvelopeType = (GridEnvelopeType)theEObject;
				T result = caseGridEnvelopeType(gridEnvelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.GRID_LIMITS_TYPE: {
				GridLimitsType gridLimitsType = (GridLimitsType)theEObject;
				T result = caseGridLimitsType(gridLimitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.GRID_TYPE: {
				GridType gridType = (GridType)theEObject;
				T result = caseGridType(gridType);
				if (result == null) result = caseAbstractGeometryType(gridType);
				if (result == null) result = caseAbstractGeometryBaseType(gridType);
				if (result == null) result = caseAbstractGMLType(gridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.LINEAR_RING_TYPE: {
				LinearRingType linearRingType = (LinearRingType)theEObject;
				T result = caseLinearRingType(linearRingType);
				if (result == null) result = caseAbstractRingType(linearRingType);
				if (result == null) result = caseAbstractGeometryType(linearRingType);
				if (result == null) result = caseAbstractGeometryBaseType(linearRingType);
				if (result == null) result = caseAbstractGMLType(linearRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.META_DATA_PROPERTY_TYPE: {
				MetaDataPropertyType metaDataPropertyType = (MetaDataPropertyType)theEObject;
				T result = caseMetaDataPropertyType(metaDataPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseAbstractGeometryType(pointType);
				if (result == null) result = caseAbstractGeometryBaseType(pointType);
				if (result == null) result = caseAbstractGMLType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = caseAbstractSurfaceType(polygonType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(polygonType);
				if (result == null) result = caseAbstractGeometryType(polygonType);
				if (result == null) result = caseAbstractGeometryBaseType(polygonType);
				if (result == null) result = caseAbstractGMLType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.RECTIFIED_GRID_TYPE: {
				RectifiedGridType rectifiedGridType = (RectifiedGridType)theEObject;
				T result = caseRectifiedGridType(rectifiedGridType);
				if (result == null) result = caseGridType(rectifiedGridType);
				if (result == null) result = caseAbstractGeometryType(rectifiedGridType);
				if (result == null) result = caseAbstractGeometryBaseType(rectifiedGridType);
				if (result == null) result = caseAbstractGMLType(rectifiedGridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.STRING_OR_REF_TYPE: {
				StringOrRefType stringOrRefType = (StringOrRefType)theEObject;
				T result = caseStringOrRefType(stringOrRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.TIME_POSITION_TYPE: {
				TimePositionType timePositionType = (TimePositionType)theEObject;
				T result = caseTimePositionType(timePositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GmlPackage.VECTOR_TYPE: {
				VectorType vectorType = (VectorType)theEObject;
				T result = caseVectorType(vectorType);
				if (result == null) result = caseDirectPositionType(vectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometry Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometry Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometryBaseType(AbstractGeometryBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometryType(AbstractGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMetaDataType(AbstractMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ring Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ring Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRingPropertyType(AbstractRingPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRingType(AbstractRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceType(AbstractSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingShapeType(BoundingShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeListType(CodeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectPositionType(DirectPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvelopeType(EnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envelope With Time Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envelope With Time Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridEnvelopeType(GridEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Limits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Limits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLimitsType(GridLimitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridType(GridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRingType(LinearRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaDataPropertyType(MetaDataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectified Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectified Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectifiedGridType(RectifiedGridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Or Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Or Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOrRefType(StringOrRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePositionType(TimePositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType(VectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GmlSwitch
