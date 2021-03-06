/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.glam.wcsclient.wcs100.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Wcs100FactoryImpl extends EFactoryImpl implements Wcs100Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wcs100Factory init() {
		try {
			Wcs100Factory theWcs100Factory = (Wcs100Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/wcs"); 
			if (theWcs100Factory != null) {
				return theWcs100Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Wcs100FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs100FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Wcs100Package.ADDRESS_TYPE: return createAddressType();
			case Wcs100Package.AXIS_DESCRIPTION_TYPE: return createAxisDescriptionType();
			case Wcs100Package.AXIS_DESCRIPTION_TYPE1: return createAxisDescriptionType1();
			case Wcs100Package.AXIS_SUBSET_TYPE: return createAxisSubsetType();
			case Wcs100Package.CONTACT_TYPE: return createContactType();
			case Wcs100Package.CONTENT_METADATA_TYPE: return createContentMetadataType();
			case Wcs100Package.COVERAGE_DESCRIPTION_TYPE: return createCoverageDescriptionType();
			case Wcs100Package.COVERAGE_OFFERING_BRIEF_TYPE: return createCoverageOfferingBriefType();
			case Wcs100Package.COVERAGE_OFFERING_TYPE: return createCoverageOfferingType();
			case Wcs100Package.DCP_TYPE_TYPE: return createDCPTypeType();
			case Wcs100Package.DESCRIBE_COVERAGE_TYPE: return createDescribeCoverageType();
			case Wcs100Package.DESCRIBE_COVERAGE_TYPE1: return createDescribeCoverageType1();
			case Wcs100Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Wcs100Package.DOMAIN_SET_TYPE: return createDomainSetType();
			case Wcs100Package.DOMAIN_SUBSET_TYPE: return createDomainSubsetType();
			case Wcs100Package.EXCEPTION_TYPE: return createExceptionType();
			case Wcs100Package.GET_CAPABILITIES_TYPE: return createGetCapabilitiesType();
			case Wcs100Package.GET_CAPABILITIES_TYPE1: return createGetCapabilitiesType1();
			case Wcs100Package.GET_COVERAGE_TYPE: return createGetCoverageType();
			case Wcs100Package.GET_COVERAGE_TYPE1: return createGetCoverageType1();
			case Wcs100Package.GET_TYPE: return createGetType();
			case Wcs100Package.HTTP_TYPE: return createHTTPType();
			case Wcs100Package.INTERVAL_TYPE: return createIntervalType();
			case Wcs100Package.KEYWORDS_TYPE: return createKeywordsType();
			case Wcs100Package.LON_LAT_ENVELOPE_BASE_TYPE: return createLonLatEnvelopeBaseType();
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE: return createLonLatEnvelopeType();
			case Wcs100Package.METADATA_ASSOCIATION_TYPE: return createMetadataAssociationType();
			case Wcs100Package.METADATA_LINK_TYPE: return createMetadataLinkType();
			case Wcs100Package.ONLINE_RESOURCE_TYPE: return createOnlineResourceType();
			case Wcs100Package.OUTPUT_TYPE: return createOutputType();
			case Wcs100Package.POST_TYPE: return createPostType();
			case Wcs100Package.RANGE_SET_TYPE: return createRangeSetType();
			case Wcs100Package.RANGE_SET_TYPE1: return createRangeSetType1();
			case Wcs100Package.RANGE_SUBSET_TYPE: return createRangeSubsetType();
			case Wcs100Package.REQUEST_TYPE: return createRequestType();
			case Wcs100Package.RESPONSIBLE_PARTY_TYPE: return createResponsiblePartyType();
			case Wcs100Package.SERVICE_TYPE: return createServiceType();
			case Wcs100Package.SPATIAL_DOMAIN_TYPE: return createSpatialDomainType();
			case Wcs100Package.SPATIAL_SUBSET_TYPE: return createSpatialSubsetType();
			case Wcs100Package.SUPPORTED_CR_SS_TYPE: return createSupportedCRSsType();
			case Wcs100Package.SUPPORTED_FORMATS_TYPE: return createSupportedFormatsType();
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE: return createSupportedInterpolationsType();
			case Wcs100Package.TELEPHONE_TYPE: return createTelephoneType();
			case Wcs100Package.TIME_PERIOD_TYPE: return createTimePeriodType();
			case Wcs100Package.TIME_SEQUENCE_TYPE: return createTimeSequenceType();
			case Wcs100Package.TYPED_LITERAL_TYPE: return createTypedLiteralType();
			case Wcs100Package.VALUE_ENUM_BASE_TYPE: return createValueEnumBaseType();
			case Wcs100Package.VALUE_ENUM_TYPE: return createValueEnumType();
			case Wcs100Package.VALUE_RANGE_TYPE: return createValueRangeType();
			case Wcs100Package.VALUES_TYPE: return createValuesType();
			case Wcs100Package.VENDOR_SPECIFIC_CAPABILITIES_TYPE: return createVendorSpecificCapabilitiesType();
			case Wcs100Package.WCS_CAPABILITIES_TYPE: return createWCSCapabilitiesType();
			case Wcs100Package.WCS_CAPABILITY_TYPE: return createWCSCapabilityType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Wcs100Package.CAPABILITIES_SECTION_TYPE:
				return createCapabilitiesSectionTypeFromString(eDataType, initialValue);
			case Wcs100Package.CLOSURE_TYPE:
				return createClosureTypeFromString(eDataType, initialValue);
			case Wcs100Package.INTERPOLATION_METHOD_TYPE:
				return createInterpolationMethodTypeFromString(eDataType, initialValue);
			case Wcs100Package.METADATA_TYPE_TYPE:
				return createMetadataTypeTypeFromString(eDataType, initialValue);
			case Wcs100Package.CAPABILITIES_SECTION_TYPE_OBJECT:
				return createCapabilitiesSectionTypeObjectFromString(eDataType, initialValue);
			case Wcs100Package.CLOSURE_TYPE_OBJECT:
				return createClosureTypeObjectFromString(eDataType, initialValue);
			case Wcs100Package.INTERPOLATION_METHOD_TYPE_OBJECT:
				return createInterpolationMethodTypeObjectFromString(eDataType, initialValue);
			case Wcs100Package.METADATA_TYPE_TYPE_OBJECT:
				return createMetadataTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Wcs100Package.CAPABILITIES_SECTION_TYPE:
				return convertCapabilitiesSectionTypeToString(eDataType, instanceValue);
			case Wcs100Package.CLOSURE_TYPE:
				return convertClosureTypeToString(eDataType, instanceValue);
			case Wcs100Package.INTERPOLATION_METHOD_TYPE:
				return convertInterpolationMethodTypeToString(eDataType, instanceValue);
			case Wcs100Package.METADATA_TYPE_TYPE:
				return convertMetadataTypeTypeToString(eDataType, instanceValue);
			case Wcs100Package.CAPABILITIES_SECTION_TYPE_OBJECT:
				return convertCapabilitiesSectionTypeObjectToString(eDataType, instanceValue);
			case Wcs100Package.CLOSURE_TYPE_OBJECT:
				return convertClosureTypeObjectToString(eDataType, instanceValue);
			case Wcs100Package.INTERPOLATION_METHOD_TYPE_OBJECT:
				return convertInterpolationMethodTypeObjectToString(eDataType, instanceValue);
			case Wcs100Package.METADATA_TYPE_TYPE_OBJECT:
				return convertMetadataTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisDescriptionType createAxisDescriptionType() {
		AxisDescriptionTypeImpl axisDescriptionType = new AxisDescriptionTypeImpl();
		return axisDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisDescriptionType1 createAxisDescriptionType1() {
		AxisDescriptionType1Impl axisDescriptionType1 = new AxisDescriptionType1Impl();
		return axisDescriptionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisSubsetType createAxisSubsetType() {
		AxisSubsetTypeImpl axisSubsetType = new AxisSubsetTypeImpl();
		return axisSubsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType createContactType() {
		ContactTypeImpl contactType = new ContactTypeImpl();
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentMetadataType createContentMetadataType() {
		ContentMetadataTypeImpl contentMetadataType = new ContentMetadataTypeImpl();
		return contentMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageDescriptionType createCoverageDescriptionType() {
		CoverageDescriptionTypeImpl coverageDescriptionType = new CoverageDescriptionTypeImpl();
		return coverageDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageOfferingBriefType createCoverageOfferingBriefType() {
		CoverageOfferingBriefTypeImpl coverageOfferingBriefType = new CoverageOfferingBriefTypeImpl();
		return coverageOfferingBriefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageOfferingType createCoverageOfferingType() {
		CoverageOfferingTypeImpl coverageOfferingType = new CoverageOfferingTypeImpl();
		return coverageOfferingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCPTypeType createDCPTypeType() {
		DCPTypeTypeImpl dcpTypeType = new DCPTypeTypeImpl();
		return dcpTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribeCoverageType createDescribeCoverageType() {
		DescribeCoverageTypeImpl describeCoverageType = new DescribeCoverageTypeImpl();
		return describeCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribeCoverageType1 createDescribeCoverageType1() {
		DescribeCoverageType1Impl describeCoverageType1 = new DescribeCoverageType1Impl();
		return describeCoverageType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSetType createDomainSetType() {
		DomainSetTypeImpl domainSetType = new DomainSetTypeImpl();
		return domainSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSubsetType createDomainSubsetType() {
		DomainSubsetTypeImpl domainSubsetType = new DomainSubsetTypeImpl();
		return domainSubsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCapabilitiesType createGetCapabilitiesType() {
		GetCapabilitiesTypeImpl getCapabilitiesType = new GetCapabilitiesTypeImpl();
		return getCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCapabilitiesType1 createGetCapabilitiesType1() {
		GetCapabilitiesType1Impl getCapabilitiesType1 = new GetCapabilitiesType1Impl();
		return getCapabilitiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCoverageType createGetCoverageType() {
		GetCoverageTypeImpl getCoverageType = new GetCoverageTypeImpl();
		return getCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetCoverageType1 createGetCoverageType1() {
		GetCoverageType1Impl getCoverageType1 = new GetCoverageType1Impl();
		return getCoverageType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetType createGetType() {
		GetTypeImpl getType = new GetTypeImpl();
		return getType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPType createHTTPType() {
		HTTPTypeImpl httpType = new HTTPTypeImpl();
		return httpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalType createIntervalType() {
		IntervalTypeImpl intervalType = new IntervalTypeImpl();
		return intervalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsType createKeywordsType() {
		KeywordsTypeImpl keywordsType = new KeywordsTypeImpl();
		return keywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LonLatEnvelopeBaseType createLonLatEnvelopeBaseType() {
		LonLatEnvelopeBaseTypeImpl lonLatEnvelopeBaseType = new LonLatEnvelopeBaseTypeImpl();
		return lonLatEnvelopeBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LonLatEnvelopeType createLonLatEnvelopeType() {
		LonLatEnvelopeTypeImpl lonLatEnvelopeType = new LonLatEnvelopeTypeImpl();
		return lonLatEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataAssociationType createMetadataAssociationType() {
		MetadataAssociationTypeImpl metadataAssociationType = new MetadataAssociationTypeImpl();
		return metadataAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataLinkType createMetadataLinkType() {
		MetadataLinkTypeImpl metadataLinkType = new MetadataLinkTypeImpl();
		return metadataLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineResourceType createOnlineResourceType() {
		OnlineResourceTypeImpl onlineResourceType = new OnlineResourceTypeImpl();
		return onlineResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputType() {
		OutputTypeImpl outputType = new OutputTypeImpl();
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostType createPostType() {
		PostTypeImpl postType = new PostTypeImpl();
		return postType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSetType createRangeSetType() {
		RangeSetTypeImpl rangeSetType = new RangeSetTypeImpl();
		return rangeSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSetType1 createRangeSetType1() {
		RangeSetType1Impl rangeSetType1 = new RangeSetType1Impl();
		return rangeSetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSubsetType createRangeSubsetType() {
		RangeSubsetTypeImpl rangeSubsetType = new RangeSubsetTypeImpl();
		return rangeSubsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestType createRequestType() {
		RequestTypeImpl requestType = new RequestTypeImpl();
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePartyType createResponsiblePartyType() {
		ResponsiblePartyTypeImpl responsiblePartyType = new ResponsiblePartyTypeImpl();
		return responsiblePartyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialDomainType createSpatialDomainType() {
		SpatialDomainTypeImpl spatialDomainType = new SpatialDomainTypeImpl();
		return spatialDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialSubsetType createSpatialSubsetType() {
		SpatialSubsetTypeImpl spatialSubsetType = new SpatialSubsetTypeImpl();
		return spatialSubsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedCRSsType createSupportedCRSsType() {
		SupportedCRSsTypeImpl supportedCRSsType = new SupportedCRSsTypeImpl();
		return supportedCRSsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedFormatsType createSupportedFormatsType() {
		SupportedFormatsTypeImpl supportedFormatsType = new SupportedFormatsTypeImpl();
		return supportedFormatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedInterpolationsType createSupportedInterpolationsType() {
		SupportedInterpolationsTypeImpl supportedInterpolationsType = new SupportedInterpolationsTypeImpl();
		return supportedInterpolationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneType createTelephoneType() {
		TelephoneTypeImpl telephoneType = new TelephoneTypeImpl();
		return telephoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType createTimePeriodType() {
		TimePeriodTypeImpl timePeriodType = new TimePeriodTypeImpl();
		return timePeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSequenceType createTimeSequenceType() {
		TimeSequenceTypeImpl timeSequenceType = new TimeSequenceTypeImpl();
		return timeSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedLiteralType createTypedLiteralType() {
		TypedLiteralTypeImpl typedLiteralType = new TypedLiteralTypeImpl();
		return typedLiteralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueEnumBaseType createValueEnumBaseType() {
		ValueEnumBaseTypeImpl valueEnumBaseType = new ValueEnumBaseTypeImpl();
		return valueEnumBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueEnumType createValueEnumType() {
		ValueEnumTypeImpl valueEnumType = new ValueEnumTypeImpl();
		return valueEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeType createValueRangeType() {
		ValueRangeTypeImpl valueRangeType = new ValueRangeTypeImpl();
		return valueRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType createValuesType() {
		ValuesTypeImpl valuesType = new ValuesTypeImpl();
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorSpecificCapabilitiesType createVendorSpecificCapabilitiesType() {
		VendorSpecificCapabilitiesTypeImpl vendorSpecificCapabilitiesType = new VendorSpecificCapabilitiesTypeImpl();
		return vendorSpecificCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCSCapabilitiesType createWCSCapabilitiesType() {
		WCSCapabilitiesTypeImpl wcsCapabilitiesType = new WCSCapabilitiesTypeImpl();
		return wcsCapabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCSCapabilityType createWCSCapabilityType() {
		WCSCapabilityTypeImpl wcsCapabilityType = new WCSCapabilityTypeImpl();
		return wcsCapabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesSectionType createCapabilitiesSectionTypeFromString(EDataType eDataType, String initialValue) {
		CapabilitiesSectionType result = CapabilitiesSectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilitiesSectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureType createClosureTypeFromString(EDataType eDataType, String initialValue) {
		ClosureType result = ClosureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClosureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethodType createInterpolationMethodTypeFromString(EDataType eDataType, String initialValue) {
		InterpolationMethodType result = InterpolationMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolationMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTypeType createMetadataTypeTypeFromString(EDataType eDataType, String initialValue) {
		MetadataTypeType result = MetadataTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetadataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesSectionType createCapabilitiesSectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilitiesSectionTypeFromString(Wcs100Package.Literals.CAPABILITIES_SECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilitiesSectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilitiesSectionTypeToString(Wcs100Package.Literals.CAPABILITIES_SECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureType createClosureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createClosureTypeFromString(Wcs100Package.Literals.CLOSURE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClosureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClosureTypeToString(Wcs100Package.Literals.CLOSURE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethodType createInterpolationMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterpolationMethodTypeFromString(Wcs100Package.Literals.INTERPOLATION_METHOD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolationMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterpolationMethodTypeToString(Wcs100Package.Literals.INTERPOLATION_METHOD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataTypeType createMetadataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMetadataTypeTypeFromString(Wcs100Package.Literals.METADATA_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetadataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMetadataTypeTypeToString(Wcs100Package.Literals.METADATA_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs100Package getWcs100Package() {
		return (Wcs100Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Wcs100Package getPackage() {
		return Wcs100Package.eINSTANCE;
	}

} //Wcs100FactoryImpl
