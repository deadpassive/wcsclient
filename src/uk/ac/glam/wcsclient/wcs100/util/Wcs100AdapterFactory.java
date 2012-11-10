/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.*;

import uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType;
import uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryBaseType;
import uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryType;
import uk.ac.glam.wcsclient.wcs100.gml.EnvelopeType;
import uk.ac.glam.wcsclient.wcs100.gml.MetaDataPropertyType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package
 * @generated
 */
public class Wcs100AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Wcs100Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs100AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Wcs100Package.eINSTANCE;
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
	protected Wcs100Switch<Adapter> modelSwitch =
		new Wcs100Switch<Adapter>() {
			@Override
			public Adapter caseAbstractDescriptionBaseType(AbstractDescriptionBaseType object) {
				return createAbstractDescriptionBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDescriptionType(AbstractDescriptionType object) {
				return createAbstractDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAxisDescriptionType(AxisDescriptionType object) {
				return createAxisDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseAxisDescriptionType1(AxisDescriptionType1 object) {
				return createAxisDescriptionType1Adapter();
			}
			@Override
			public Adapter caseAxisSubsetType(AxisSubsetType object) {
				return createAxisSubsetTypeAdapter();
			}
			@Override
			public Adapter caseContactType(ContactType object) {
				return createContactTypeAdapter();
			}
			@Override
			public Adapter caseContentMetadataType(ContentMetadataType object) {
				return createContentMetadataTypeAdapter();
			}
			@Override
			public Adapter caseCoverageDescriptionType(CoverageDescriptionType object) {
				return createCoverageDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseCoverageOfferingBriefType(CoverageOfferingBriefType object) {
				return createCoverageOfferingBriefTypeAdapter();
			}
			@Override
			public Adapter caseCoverageOfferingType(CoverageOfferingType object) {
				return createCoverageOfferingTypeAdapter();
			}
			@Override
			public Adapter caseDCPTypeType(DCPTypeType object) {
				return createDCPTypeTypeAdapter();
			}
			@Override
			public Adapter caseDescribeCoverageType(DescribeCoverageType object) {
				return createDescribeCoverageTypeAdapter();
			}
			@Override
			public Adapter caseDescribeCoverageType1(DescribeCoverageType1 object) {
				return createDescribeCoverageType1Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainSetType(DomainSetType object) {
				return createDomainSetTypeAdapter();
			}
			@Override
			public Adapter caseDomainSubsetType(DomainSubsetType object) {
				return createDomainSubsetTypeAdapter();
			}
			@Override
			public Adapter caseExceptionType(ExceptionType object) {
				return createExceptionTypeAdapter();
			}
			@Override
			public Adapter caseGetCapabilitiesType(GetCapabilitiesType object) {
				return createGetCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseGetCapabilitiesType1(GetCapabilitiesType1 object) {
				return createGetCapabilitiesType1Adapter();
			}
			@Override
			public Adapter caseGetCoverageType(GetCoverageType object) {
				return createGetCoverageTypeAdapter();
			}
			@Override
			public Adapter caseGetCoverageType1(GetCoverageType1 object) {
				return createGetCoverageType1Adapter();
			}
			@Override
			public Adapter caseGetType(GetType object) {
				return createGetTypeAdapter();
			}
			@Override
			public Adapter caseHTTPType(HTTPType object) {
				return createHTTPTypeAdapter();
			}
			@Override
			public Adapter caseIntervalType(IntervalType object) {
				return createIntervalTypeAdapter();
			}
			@Override
			public Adapter caseKeywordsType(KeywordsType object) {
				return createKeywordsTypeAdapter();
			}
			@Override
			public Adapter caseLonLatEnvelopeBaseType(LonLatEnvelopeBaseType object) {
				return createLonLatEnvelopeBaseTypeAdapter();
			}
			@Override
			public Adapter caseLonLatEnvelopeType(LonLatEnvelopeType object) {
				return createLonLatEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseMetadataAssociationType(MetadataAssociationType object) {
				return createMetadataAssociationTypeAdapter();
			}
			@Override
			public Adapter caseMetadataLinkType(MetadataLinkType object) {
				return createMetadataLinkTypeAdapter();
			}
			@Override
			public Adapter caseOnlineResourceType(OnlineResourceType object) {
				return createOnlineResourceTypeAdapter();
			}
			@Override
			public Adapter caseOutputType(OutputType object) {
				return createOutputTypeAdapter();
			}
			@Override
			public Adapter casePostType(PostType object) {
				return createPostTypeAdapter();
			}
			@Override
			public Adapter caseRangeSetType(RangeSetType object) {
				return createRangeSetTypeAdapter();
			}
			@Override
			public Adapter caseRangeSetType1(RangeSetType1 object) {
				return createRangeSetType1Adapter();
			}
			@Override
			public Adapter caseRangeSubsetType(RangeSubsetType object) {
				return createRangeSubsetTypeAdapter();
			}
			@Override
			public Adapter caseRequestType(RequestType object) {
				return createRequestTypeAdapter();
			}
			@Override
			public Adapter caseResponsiblePartyType(ResponsiblePartyType object) {
				return createResponsiblePartyTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseSpatialDomainType(SpatialDomainType object) {
				return createSpatialDomainTypeAdapter();
			}
			@Override
			public Adapter caseSpatialSubsetType(SpatialSubsetType object) {
				return createSpatialSubsetTypeAdapter();
			}
			@Override
			public Adapter caseSupportedCRSsType(SupportedCRSsType object) {
				return createSupportedCRSsTypeAdapter();
			}
			@Override
			public Adapter caseSupportedFormatsType(SupportedFormatsType object) {
				return createSupportedFormatsTypeAdapter();
			}
			@Override
			public Adapter caseSupportedInterpolationsType(SupportedInterpolationsType object) {
				return createSupportedInterpolationsTypeAdapter();
			}
			@Override
			public Adapter caseTelephoneType(TelephoneType object) {
				return createTelephoneTypeAdapter();
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
			public Adapter caseTypedLiteralType(TypedLiteralType object) {
				return createTypedLiteralTypeAdapter();
			}
			@Override
			public Adapter caseValueEnumBaseType(ValueEnumBaseType object) {
				return createValueEnumBaseTypeAdapter();
			}
			@Override
			public Adapter caseValueEnumType(ValueEnumType object) {
				return createValueEnumTypeAdapter();
			}
			@Override
			public Adapter caseValueRangeType(ValueRangeType object) {
				return createValueRangeTypeAdapter();
			}
			@Override
			public Adapter caseValuesType(ValuesType object) {
				return createValuesTypeAdapter();
			}
			@Override
			public Adapter caseVendorSpecificCapabilitiesType(VendorSpecificCapabilitiesType object) {
				return createVendorSpecificCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseWCSCapabilitiesType(WCSCapabilitiesType object) {
				return createWCSCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseWCSCapabilityType(WCSCapabilityType object) {
				return createWCSCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
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
			public Adapter caseEnvelopeType(EnvelopeType object) {
				return createEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataPropertyType(MetaDataPropertyType object) {
				return createMetaDataPropertyTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AbstractDescriptionBaseType <em>Abstract Description Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AbstractDescriptionBaseType
	 * @generated
	 */
	public Adapter createAbstractDescriptionBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AbstractDescriptionType <em>Abstract Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AbstractDescriptionType
	 * @generated
	 */
	public Adapter createAbstractDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AxisDescriptionType <em>Axis Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AxisDescriptionType
	 * @generated
	 */
	public Adapter createAxisDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AxisDescriptionType1 <em>Axis Description Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AxisDescriptionType1
	 * @generated
	 */
	public Adapter createAxisDescriptionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.AxisSubsetType <em>Axis Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.AxisSubsetType
	 * @generated
	 */
	public Adapter createAxisSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ContactType
	 * @generated
	 */
	public Adapter createContactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ContentMetadataType <em>Content Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ContentMetadataType
	 * @generated
	 */
	public Adapter createContentMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.CoverageDescriptionType <em>Coverage Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.CoverageDescriptionType
	 * @generated
	 */
	public Adapter createCoverageDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.CoverageOfferingBriefType <em>Coverage Offering Brief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.CoverageOfferingBriefType
	 * @generated
	 */
	public Adapter createCoverageOfferingBriefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.CoverageOfferingType <em>Coverage Offering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.CoverageOfferingType
	 * @generated
	 */
	public Adapter createCoverageOfferingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DCPTypeType <em>DCP Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DCPTypeType
	 * @generated
	 */
	public Adapter createDCPTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType <em>Describe Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DescribeCoverageType
	 * @generated
	 */
	public Adapter createDescribeCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DescribeCoverageType1 <em>Describe Coverage Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DescribeCoverageType1
	 * @generated
	 */
	public Adapter createDescribeCoverageType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DomainSetType <em>Domain Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DomainSetType
	 * @generated
	 */
	public Adapter createDomainSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.DomainSubsetType <em>Domain Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.DomainSubsetType
	 * @generated
	 */
	public Adapter createDomainSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ExceptionType
	 * @generated
	 */
	public Adapter createExceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType
	 * @generated
	 */
	public Adapter createGetCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType1 <em>Get Capabilities Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.GetCapabilitiesType1
	 * @generated
	 */
	public Adapter createGetCapabilitiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType <em>Get Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.GetCoverageType
	 * @generated
	 */
	public Adapter createGetCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.GetCoverageType1 <em>Get Coverage Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.GetCoverageType1
	 * @generated
	 */
	public Adapter createGetCoverageType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.GetType <em>Get Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.GetType
	 * @generated
	 */
	public Adapter createGetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.HTTPType <em>HTTP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.HTTPType
	 * @generated
	 */
	public Adapter createHTTPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.IntervalType <em>Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.IntervalType
	 * @generated
	 */
	public Adapter createIntervalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.KeywordsType <em>Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.KeywordsType
	 * @generated
	 */
	public Adapter createKeywordsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeBaseType <em>Lon Lat Envelope Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeBaseType
	 * @generated
	 */
	public Adapter createLonLatEnvelopeBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeType <em>Lon Lat Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.LonLatEnvelopeType
	 * @generated
	 */
	public Adapter createLonLatEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.MetadataAssociationType <em>Metadata Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.MetadataAssociationType
	 * @generated
	 */
	public Adapter createMetadataAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.MetadataLinkType <em>Metadata Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.MetadataLinkType
	 * @generated
	 */
	public Adapter createMetadataLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.OnlineResourceType <em>Online Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.OnlineResourceType
	 * @generated
	 */
	public Adapter createOnlineResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.PostType <em>Post Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.PostType
	 * @generated
	 */
	public Adapter createPostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.RangeSetType <em>Range Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.RangeSetType
	 * @generated
	 */
	public Adapter createRangeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.RangeSetType1 <em>Range Set Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.RangeSetType1
	 * @generated
	 */
	public Adapter createRangeSetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.RangeSubsetType <em>Range Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.RangeSubsetType
	 * @generated
	 */
	public Adapter createRangeSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.RequestType
	 * @generated
	 */
	public Adapter createRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ResponsiblePartyType <em>Responsible Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ResponsiblePartyType
	 * @generated
	 */
	public Adapter createResponsiblePartyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.SpatialDomainType <em>Spatial Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.SpatialDomainType
	 * @generated
	 */
	public Adapter createSpatialDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.SpatialSubsetType <em>Spatial Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.SpatialSubsetType
	 * @generated
	 */
	public Adapter createSpatialSubsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.SupportedCRSsType <em>Supported CR Ss Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.SupportedCRSsType
	 * @generated
	 */
	public Adapter createSupportedCRSsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.SupportedFormatsType <em>Supported Formats Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.SupportedFormatsType
	 * @generated
	 */
	public Adapter createSupportedFormatsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType <em>Supported Interpolations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.SupportedInterpolationsType
	 * @generated
	 */
	public Adapter createSupportedInterpolationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.TelephoneType <em>Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.TelephoneType
	 * @generated
	 */
	public Adapter createTelephoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.TimeSequenceType <em>Time Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.TimeSequenceType
	 * @generated
	 */
	public Adapter createTimeSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.TypedLiteralType <em>Typed Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.TypedLiteralType
	 * @generated
	 */
	public Adapter createTypedLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ValueEnumBaseType <em>Value Enum Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ValueEnumBaseType
	 * @generated
	 */
	public Adapter createValueEnumBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ValueEnumType <em>Value Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ValueEnumType
	 * @generated
	 */
	public Adapter createValueEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ValueRangeType <em>Value Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ValueRangeType
	 * @generated
	 */
	public Adapter createValueRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.ValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.ValuesType
	 * @generated
	 */
	public Adapter createValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.VendorSpecificCapabilitiesType <em>Vendor Specific Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.VendorSpecificCapabilitiesType
	 * @generated
	 */
	public Adapter createVendorSpecificCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.WCSCapabilitiesType <em>WCS Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.WCSCapabilitiesType
	 * @generated
	 */
	public Adapter createWCSCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.glam.wcsclient.wcs100.WCSCapabilityType <em>WCS Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.glam.wcsclient.wcs100.WCSCapabilityType
	 * @generated
	 */
	public Adapter createWCSCapabilityTypeAdapter() {
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

} //Wcs100AdapterFactory
