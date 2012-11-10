/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import uk.ac.glam.wcsclient.ows110.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ows110FactoryImpl extends EFactoryImpl implements Ows110Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ows110Factory init() {
		try {
			Ows110Factory theOws110Factory = (Ows110Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/ows/1.1"); 
			if (theOws110Factory != null) {
				return theOws110Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ows110FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ows110FactoryImpl() {
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
			case Ows110Package.ABSTRACT_REFERENCE_BASE_TYPE: return createAbstractReferenceBaseType();
			case Ows110Package.ACCEPT_FORMATS_TYPE: return createAcceptFormatsType();
			case Ows110Package.ACCEPT_VERSIONS_TYPE: return createAcceptVersionsType();
			case Ows110Package.ADDRESS_TYPE: return createAddressType();
			case Ows110Package.ALLOWED_VALUES_TYPE: return createAllowedValuesType();
			case Ows110Package.ANY_VALUE_TYPE: return createAnyValueType();
			case Ows110Package.BASIC_IDENTIFICATION_TYPE: return createBasicIdentificationType();
			case Ows110Package.BOUNDING_BOX_TYPE: return createBoundingBoxType();
			case Ows110Package.CAPABILITIES_BASE_TYPE: return createCapabilitiesBaseType();
			case Ows110Package.CODE_TYPE: return createCodeType();
			case Ows110Package.CONTACT_TYPE: return createContactType();
			case Ows110Package.CONTENTS_BASE_TYPE: return createContentsBaseType();
			case Ows110Package.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE: return createDatasetDescriptionSummaryBaseType();
			case Ows110Package.DCP_TYPE: return createDCPType();
			case Ows110Package.DESCRIPTION_TYPE: return createDescriptionType();
			case Ows110Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Ows110Package.DOMAIN_METADATA_TYPE: return createDomainMetadataType();
			case Ows110Package.DOMAIN_TYPE: return createDomainType();
			case Ows110Package.EXCEPTION_REPORT_TYPE: return createExceptionReportType();
			case Ows110Package.EXCEPTION_TYPE: return createExceptionType();
			case Ows110Package.GET_CAPABILITIES_TYPE: return createGetCapabilitiesType();
			case Ows110Package.GET_RESOURCE_BY_ID_TYPE: return createGetResourceByIdType();
			case Ows110Package.HTTP_TYPE: return createHTTPType();
			case Ows110Package.IDENTIFICATION_TYPE: return createIdentificationType();
			case Ows110Package.KEYWORDS_TYPE: return createKeywordsType();
			case Ows110Package.LANGUAGE_STRING_TYPE: return createLanguageStringType();
			case Ows110Package.MANIFEST_TYPE: return createManifestType();
			case Ows110Package.METADATA_TYPE: return createMetadataType();
			case Ows110Package.NO_VALUES_TYPE: return createNoValuesType();
			case Ows110Package.ONLINE_RESOURCE_TYPE: return createOnlineResourceType();
			case Ows110Package.OPERATIONS_METADATA_TYPE: return createOperationsMetadataType();
			case Ows110Package.OPERATION_TYPE: return createOperationType();
			case Ows110Package.RANGE_TYPE: return createRangeType();
			case Ows110Package.REFERENCE_GROUP_TYPE: return createReferenceGroupType();
			case Ows110Package.REFERENCE_TYPE: return createReferenceType();
			case Ows110Package.REQUEST_METHOD_TYPE: return createRequestMethodType();
			case Ows110Package.RESPONSIBLE_PARTY_SUBSET_TYPE: return createResponsiblePartySubsetType();
			case Ows110Package.RESPONSIBLE_PARTY_TYPE: return createResponsiblePartyType();
			case Ows110Package.SECTIONS_TYPE: return createSectionsType();
			case Ows110Package.SERVICE_IDENTIFICATION_TYPE: return createServiceIdentificationType();
			case Ows110Package.SERVICE_PROVIDER_TYPE: return createServiceProviderType();
			case Ows110Package.SERVICE_REFERENCE_TYPE: return createServiceReferenceType();
			case Ows110Package.TELEPHONE_TYPE: return createTelephoneType();
			case Ows110Package.UN_NAMED_DOMAIN_TYPE: return createUnNamedDomainType();
			case Ows110Package.VALUES_REFERENCE_TYPE: return createValuesReferenceType();
			case Ows110Package.VALUE_TYPE: return createValueType();
			case Ows110Package.WGS84_BOUNDING_BOX_TYPE: return createWGS84BoundingBoxType();
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
			case Ows110Package.RANGE_CLOSURE_TYPE:
				return createRangeClosureTypeFromString(eDataType, initialValue);
			case Ows110Package.MIME_TYPE:
				return createMimeTypeFromString(eDataType, initialValue);
			case Ows110Package.POSITION_TYPE:
				return createPositionTypeFromString(eDataType, initialValue);
			case Ows110Package.POSITION_TYPE2_D:
				return createPositionType2DFromString(eDataType, initialValue);
			case Ows110Package.RANGE_CLOSURE_TYPE_OBJECT:
				return createRangeClosureTypeObjectFromString(eDataType, initialValue);
			case Ows110Package.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case Ows110Package.UPDATE_SEQUENCE_TYPE:
				return createUpdateSequenceTypeFromString(eDataType, initialValue);
			case Ows110Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case Ows110Package.VERSION_TYPE1:
				return createVersionType1FromString(eDataType, initialValue);
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
			case Ows110Package.RANGE_CLOSURE_TYPE:
				return convertRangeClosureTypeToString(eDataType, instanceValue);
			case Ows110Package.MIME_TYPE:
				return convertMimeTypeToString(eDataType, instanceValue);
			case Ows110Package.POSITION_TYPE:
				return convertPositionTypeToString(eDataType, instanceValue);
			case Ows110Package.POSITION_TYPE2_D:
				return convertPositionType2DToString(eDataType, instanceValue);
			case Ows110Package.RANGE_CLOSURE_TYPE_OBJECT:
				return convertRangeClosureTypeObjectToString(eDataType, instanceValue);
			case Ows110Package.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case Ows110Package.UPDATE_SEQUENCE_TYPE:
				return convertUpdateSequenceTypeToString(eDataType, instanceValue);
			case Ows110Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case Ows110Package.VERSION_TYPE1:
				return convertVersionType1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceBaseType createAbstractReferenceBaseType() {
		AbstractReferenceBaseTypeImpl abstractReferenceBaseType = new AbstractReferenceBaseTypeImpl();
		return abstractReferenceBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptFormatsType createAcceptFormatsType() {
		AcceptFormatsTypeImpl acceptFormatsType = new AcceptFormatsTypeImpl();
		return acceptFormatsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptVersionsType createAcceptVersionsType() {
		AcceptVersionsTypeImpl acceptVersionsType = new AcceptVersionsTypeImpl();
		return acceptVersionsType;
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
	public AllowedValuesType createAllowedValuesType() {
		AllowedValuesTypeImpl allowedValuesType = new AllowedValuesTypeImpl();
		return allowedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyValueType createAnyValueType() {
		AnyValueTypeImpl anyValueType = new AnyValueTypeImpl();
		return anyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIdentificationType createBasicIdentificationType() {
		BasicIdentificationTypeImpl basicIdentificationType = new BasicIdentificationTypeImpl();
		return basicIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingBoxType createBoundingBoxType() {
		BoundingBoxTypeImpl boundingBoxType = new BoundingBoxTypeImpl();
		return boundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesBaseType createCapabilitiesBaseType() {
		CapabilitiesBaseTypeImpl capabilitiesBaseType = new CapabilitiesBaseTypeImpl();
		return capabilitiesBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
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
	public ContentsBaseType createContentsBaseType() {
		ContentsBaseTypeImpl contentsBaseType = new ContentsBaseTypeImpl();
		return contentsBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetDescriptionSummaryBaseType createDatasetDescriptionSummaryBaseType() {
		DatasetDescriptionSummaryBaseTypeImpl datasetDescriptionSummaryBaseType = new DatasetDescriptionSummaryBaseTypeImpl();
		return datasetDescriptionSummaryBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCPType createDCPType() {
		DCPTypeImpl dcpType = new DCPTypeImpl();
		return dcpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
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
	public DomainMetadataType createDomainMetadataType() {
		DomainMetadataTypeImpl domainMetadataType = new DomainMetadataTypeImpl();
		return domainMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionReportType createExceptionReportType() {
		ExceptionReportTypeImpl exceptionReportType = new ExceptionReportTypeImpl();
		return exceptionReportType;
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
	public GetResourceByIdType createGetResourceByIdType() {
		GetResourceByIdTypeImpl getResourceByIdType = new GetResourceByIdTypeImpl();
		return getResourceByIdType;
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
	public IdentificationType createIdentificationType() {
		IdentificationTypeImpl identificationType = new IdentificationTypeImpl();
		return identificationType;
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
	public LanguageStringType createLanguageStringType() {
		LanguageStringTypeImpl languageStringType = new LanguageStringTypeImpl();
		return languageStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType createManifestType() {
		ManifestTypeImpl manifestType = new ManifestTypeImpl();
		return manifestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoValuesType createNoValuesType() {
		NoValuesTypeImpl noValuesType = new NoValuesTypeImpl();
		return noValuesType;
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
	public OperationsMetadataType createOperationsMetadataType() {
		OperationsMetadataTypeImpl operationsMetadataType = new OperationsMetadataTypeImpl();
		return operationsMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationType() {
		OperationTypeImpl operationType = new OperationTypeImpl();
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceGroupType createReferenceGroupType() {
		ReferenceGroupTypeImpl referenceGroupType = new ReferenceGroupTypeImpl();
		return referenceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestMethodType createRequestMethodType() {
		RequestMethodTypeImpl requestMethodType = new RequestMethodTypeImpl();
		return requestMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePartySubsetType createResponsiblePartySubsetType() {
		ResponsiblePartySubsetTypeImpl responsiblePartySubsetType = new ResponsiblePartySubsetTypeImpl();
		return responsiblePartySubsetType;
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
	public SectionsType createSectionsType() {
		SectionsTypeImpl sectionsType = new SectionsTypeImpl();
		return sectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceIdentificationType createServiceIdentificationType() {
		ServiceIdentificationTypeImpl serviceIdentificationType = new ServiceIdentificationTypeImpl();
		return serviceIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderType createServiceProviderType() {
		ServiceProviderTypeImpl serviceProviderType = new ServiceProviderTypeImpl();
		return serviceProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceReferenceType createServiceReferenceType() {
		ServiceReferenceTypeImpl serviceReferenceType = new ServiceReferenceTypeImpl();
		return serviceReferenceType;
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
	public UnNamedDomainType createUnNamedDomainType() {
		UnNamedDomainTypeImpl unNamedDomainType = new UnNamedDomainTypeImpl();
		return unNamedDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesReferenceType createValuesReferenceType() {
		ValuesReferenceTypeImpl valuesReferenceType = new ValuesReferenceTypeImpl();
		return valuesReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WGS84BoundingBoxType createWGS84BoundingBoxType() {
		WGS84BoundingBoxTypeImpl wgs84BoundingBoxType = new WGS84BoundingBoxTypeImpl();
		return wgs84BoundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeClosureType createRangeClosureTypeFromString(EDataType eDataType, String initialValue) {
		RangeClosureType result = RangeClosureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeClosureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMimeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPositionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPositionType2DFromString(EDataType eDataType, String initialValue) {
		return createPositionTypeFromString(Ows110Package.Literals.POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionType2DToString(EDataType eDataType, Object instanceValue) {
		return convertPositionTypeToString(Ows110Package.Literals.POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeClosureType createRangeClosureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeClosureTypeFromString(Ows110Package.Literals.RANGE_CLOSURE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeClosureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeClosureTypeToString(Ows110Package.Literals.RANGE_CLOSURE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUpdateSequenceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateSequenceTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ows110Package getOws110Package() {
		return (Ows110Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ows110Package getPackage() {
		return Ows110Package.eINSTANCE;
	}

} //Ows110FactoryImpl
