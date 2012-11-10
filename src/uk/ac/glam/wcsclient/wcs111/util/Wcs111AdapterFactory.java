/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.ows110.CapabilitiesBaseType;
import uk.ac.glam.wcsclient.ows110.CodeType;
import uk.ac.glam.wcsclient.ows110.DescriptionType;

import uk.ac.glam.wcsclient.wcs111.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Package
 * @generated
 */
public class Wcs111AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Wcs111Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs111AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Wcs111Package.eINSTANCE;
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
	protected Wcs111Switch<Adapter> modelSwitch =
		new Wcs111Switch<Adapter>() {
			@Override
			public Adapter caseAvailableKeysType(AvailableKeysType object) {
				return createAvailableKeysTypeAdapter();
			}
			@Override
			public Adapter caseAxisSubsetType(AxisSubsetType object) {
				return createAxisSubsetTypeAdapter();
			}
			@Override
			public Adapter caseAxisType(AxisType object) {
				return createAxisTypeAdapter();
			}
			@Override
			public Adapter caseCapabilitiesType(CapabilitiesType object) {
				return createCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseContentsType(ContentsType object) {
				return createContentsTypeAdapter();
			}
			@Override
			public Adapter caseCoverageDescriptionsType(CoverageDescriptionsType object) {
				return createCoverageDescriptionsTypeAdapter();
			}
			@Override
			public Adapter caseCoverageDescriptionType(CoverageDescriptionType object) {
				return createCoverageDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseCoverageDomainType(CoverageDomainType object) {
				return createCoverageDomainTypeAdapter();
			}
			@Override
			public Adapter caseCoveragesType(CoveragesType object) {
				return createCoveragesTypeAdapter();
			}
			@Override
			public Adapter caseCoverageSummaryType(CoverageSummaryType object) {
				return createCoverageSummaryTypeAdapter();
			}
			@Override
			public Adapter caseDescribeCoverageType(DescribeCoverageType object) {
				return createDescribeCoverageTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainSubsetType(DomainSubsetType object) {
				return createDomainSubsetTypeAdapter();
			}
			@Override
			public Adapter caseFieldSubsetType(FieldSubsetType object) {
				return createFieldSubsetTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseGetCapabilitiesType(GetCapabilitiesType object) {
				return createGetCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseGetCoverageType(GetCoverageType object) {
				return createGetCoverageTypeAdapter();
			}
			@Override
			public Adapter caseGridCrsType(GridCrsType object) {
				return createGridCrsTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSRefType(ImageCRSRefType object) {
				return createImageCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseInterpolationMethodBaseType(InterpolationMethodBaseType object) {
				return createInterpolationMethodBaseTypeAdapter();
			}
			@Override
			public Adapter caseInterpolationMethodsType(InterpolationMethodsType object) {
				return createInterpolationMethodsTypeAdapter();
			}
			@Override
			public Adapter caseInterpolationMethodType(InterpolationMethodType object) {
				return createInterpolationMethodTypeAdapter();
			}
			@Override
			public Adapter caseOutputType(OutputType object) {
				return createOutputTypeAdapter();
			}
			@Override
			public Adapter caseRangeSubsetType(RangeSubsetType object) {
				return createRangeSubsetTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseRequestBaseType(RequestBaseType object) {
				return createRequestBaseTypeAdapter();
			}
			@Override
			public Adapter caseSpatialDomainType(SpatialDomainType object) {
				return createSpatialDomainTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType(TimePeriodType object) {
				return createTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseTimeSequenceType(TimeSequenceType object) {
				return createTimeSequenceTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseCapabilitiesBaseType(CapabilitiesBaseType object) {
				return createCapabilitiesBaseTypeAdapter();
			}
			@Override
			public Adapter caseOws110_GetCapabilitiesType(uk.ac.glam.wcsclient.ows110.GetCapabilitiesType object) {
				return createOws110_GetCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.AvailableKeysType <em>Available Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.AvailableKeysType
	 * @generated
	 */
	public Adapter createAvailableKeysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.AxisSubsetType <em>Axis Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisSubsetType
	 * @generated
	 */
	public Adapter createAxisSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.AxisType <em>Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType
	 * @generated
	 */
	public Adapter createAxisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CapabilitiesType
	 * @generated
	 */
	public Adapter createCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.ContentsType <em>Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType
	 * @generated
	 */
	public Adapter createContentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType <em>Coverage Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType
	 * @generated
	 */
	public Adapter createCoverageDescriptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType <em>Coverage Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType
	 * @generated
	 */
	public Adapter createCoverageDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDomainType <em>Coverage Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDomainType
	 * @generated
	 */
	public Adapter createCoverageDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CoveragesType <em>Coverages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CoveragesType
	 * @generated
	 */
	public Adapter createCoveragesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType <em>Coverage Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType
	 * @generated
	 */
	public Adapter createCoverageSummaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.DescribeCoverageType <em>Describe Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.DescribeCoverageType
	 * @generated
	 */
	public Adapter createDescribeCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.DomainSubsetType <em>Domain Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.DomainSubsetType
	 * @generated
	 */
	public Adapter createDomainSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType <em>Field Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldSubsetType
	 * @generated
	 */
	public Adapter createFieldSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType
	 * @generated
	 */
	public Adapter createGetCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType <em>Get Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType
	 * @generated
	 */
	public Adapter createGetCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType <em>Grid Crs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType
	 * @generated
	 */
	public Adapter createGridCrsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType <em>Image CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType
	 * @generated
	 */
	public Adapter createImageCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodBaseType <em>Interpolation Method Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodBaseType
	 * @generated
	 */
	public Adapter createInterpolationMethodBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType <em>Interpolation Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType
	 * @generated
	 */
	public Adapter createInterpolationMethodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodType <em>Interpolation Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodType
	 * @generated
	 */
	public Adapter createInterpolationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.RangeSubsetType <em>Range Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeSubsetType
	 * @generated
	 */
	public Adapter createRangeSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.RequestBaseType <em>Request Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.RequestBaseType
	 * @generated
	 */
	public Adapter createRequestBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType <em>Spatial Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType
	 * @generated
	 */
	public Adapter createSpatialDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType <em>Time Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs111.TimeSequenceType
	 * @generated
	 */
	public Adapter createTimeSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.ows110.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.ows110.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.ows110.CapabilitiesBaseType <em>Capabilities Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.ows110.CapabilitiesBaseType
	 * @generated
	 */
	public Adapter createCapabilitiesBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.ows110.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.ows110.GetCapabilitiesType
	 * @generated
	 */
	public Adapter createOws110_GetCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.ows110.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.ows110.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
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

} //Wcs111AdapterFactory
