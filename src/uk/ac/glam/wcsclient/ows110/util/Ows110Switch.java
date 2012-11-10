/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.ows110.*;

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
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package
 * @generated
 */
public class Ows110Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ows110Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ows110Switch() {
		if (modelPackage == null) {
			modelPackage = Ows110Package.eINSTANCE;
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
			case Ows110Package.ABSTRACT_REFERENCE_BASE_TYPE: {
				AbstractReferenceBaseType abstractReferenceBaseType = (AbstractReferenceBaseType)theEObject;
				T result = caseAbstractReferenceBaseType(abstractReferenceBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ACCEPT_FORMATS_TYPE: {
				AcceptFormatsType acceptFormatsType = (AcceptFormatsType)theEObject;
				T result = caseAcceptFormatsType(acceptFormatsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ACCEPT_VERSIONS_TYPE: {
				AcceptVersionsType acceptVersionsType = (AcceptVersionsType)theEObject;
				T result = caseAcceptVersionsType(acceptVersionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ALLOWED_VALUES_TYPE: {
				AllowedValuesType allowedValuesType = (AllowedValuesType)theEObject;
				T result = caseAllowedValuesType(allowedValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ANY_VALUE_TYPE: {
				AnyValueType anyValueType = (AnyValueType)theEObject;
				T result = caseAnyValueType(anyValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.BASIC_IDENTIFICATION_TYPE: {
				BasicIdentificationType basicIdentificationType = (BasicIdentificationType)theEObject;
				T result = caseBasicIdentificationType(basicIdentificationType);
				if (result == null) result = caseDescriptionType(basicIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.BOUNDING_BOX_TYPE: {
				BoundingBoxType boundingBoxType = (BoundingBoxType)theEObject;
				T result = caseBoundingBoxType(boundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.CAPABILITIES_BASE_TYPE: {
				CapabilitiesBaseType capabilitiesBaseType = (CapabilitiesBaseType)theEObject;
				T result = caseCapabilitiesBaseType(capabilitiesBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.CONTACT_TYPE: {
				ContactType contactType = (ContactType)theEObject;
				T result = caseContactType(contactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.CONTENTS_BASE_TYPE: {
				ContentsBaseType contentsBaseType = (ContentsBaseType)theEObject;
				T result = caseContentsBaseType(contentsBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DATASET_DESCRIPTION_SUMMARY_BASE_TYPE: {
				DatasetDescriptionSummaryBaseType datasetDescriptionSummaryBaseType = (DatasetDescriptionSummaryBaseType)theEObject;
				T result = caseDatasetDescriptionSummaryBaseType(datasetDescriptionSummaryBaseType);
				if (result == null) result = caseDescriptionType(datasetDescriptionSummaryBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DCP_TYPE: {
				DCPType dcpType = (DCPType)theEObject;
				T result = caseDCPType(dcpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DOMAIN_METADATA_TYPE: {
				DomainMetadataType domainMetadataType = (DomainMetadataType)theEObject;
				T result = caseDomainMetadataType(domainMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.DOMAIN_TYPE: {
				DomainType domainType = (DomainType)theEObject;
				T result = caseDomainType(domainType);
				if (result == null) result = caseUnNamedDomainType(domainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.EXCEPTION_REPORT_TYPE: {
				ExceptionReportType exceptionReportType = (ExceptionReportType)theEObject;
				T result = caseExceptionReportType(exceptionReportType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.GET_CAPABILITIES_TYPE: {
				GetCapabilitiesType getCapabilitiesType = (GetCapabilitiesType)theEObject;
				T result = caseGetCapabilitiesType(getCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.GET_RESOURCE_BY_ID_TYPE: {
				GetResourceByIdType getResourceByIdType = (GetResourceByIdType)theEObject;
				T result = caseGetResourceByIdType(getResourceByIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.HTTP_TYPE: {
				HTTPType httpType = (HTTPType)theEObject;
				T result = caseHTTPType(httpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.IDENTIFICATION_TYPE: {
				IdentificationType identificationType = (IdentificationType)theEObject;
				T result = caseIdentificationType(identificationType);
				if (result == null) result = caseBasicIdentificationType(identificationType);
				if (result == null) result = caseDescriptionType(identificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.KEYWORDS_TYPE: {
				KeywordsType keywordsType = (KeywordsType)theEObject;
				T result = caseKeywordsType(keywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.LANGUAGE_STRING_TYPE: {
				LanguageStringType languageStringType = (LanguageStringType)theEObject;
				T result = caseLanguageStringType(languageStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.MANIFEST_TYPE: {
				ManifestType manifestType = (ManifestType)theEObject;
				T result = caseManifestType(manifestType);
				if (result == null) result = caseBasicIdentificationType(manifestType);
				if (result == null) result = caseDescriptionType(manifestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.NO_VALUES_TYPE: {
				NoValuesType noValuesType = (NoValuesType)theEObject;
				T result = caseNoValuesType(noValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.ONLINE_RESOURCE_TYPE: {
				OnlineResourceType onlineResourceType = (OnlineResourceType)theEObject;
				T result = caseOnlineResourceType(onlineResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.OPERATIONS_METADATA_TYPE: {
				OperationsMetadataType operationsMetadataType = (OperationsMetadataType)theEObject;
				T result = caseOperationsMetadataType(operationsMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.REFERENCE_GROUP_TYPE: {
				ReferenceGroupType referenceGroupType = (ReferenceGroupType)theEObject;
				T result = caseReferenceGroupType(referenceGroupType);
				if (result == null) result = caseBasicIdentificationType(referenceGroupType);
				if (result == null) result = caseDescriptionType(referenceGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = caseAbstractReferenceBaseType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.REQUEST_METHOD_TYPE: {
				RequestMethodType requestMethodType = (RequestMethodType)theEObject;
				T result = caseRequestMethodType(requestMethodType);
				if (result == null) result = caseOnlineResourceType(requestMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.RESPONSIBLE_PARTY_SUBSET_TYPE: {
				ResponsiblePartySubsetType responsiblePartySubsetType = (ResponsiblePartySubsetType)theEObject;
				T result = caseResponsiblePartySubsetType(responsiblePartySubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.RESPONSIBLE_PARTY_TYPE: {
				ResponsiblePartyType responsiblePartyType = (ResponsiblePartyType)theEObject;
				T result = caseResponsiblePartyType(responsiblePartyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.SECTIONS_TYPE: {
				SectionsType sectionsType = (SectionsType)theEObject;
				T result = caseSectionsType(sectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.SERVICE_IDENTIFICATION_TYPE: {
				ServiceIdentificationType serviceIdentificationType = (ServiceIdentificationType)theEObject;
				T result = caseServiceIdentificationType(serviceIdentificationType);
				if (result == null) result = caseDescriptionType(serviceIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.SERVICE_PROVIDER_TYPE: {
				ServiceProviderType serviceProviderType = (ServiceProviderType)theEObject;
				T result = caseServiceProviderType(serviceProviderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.SERVICE_REFERENCE_TYPE: {
				ServiceReferenceType serviceReferenceType = (ServiceReferenceType)theEObject;
				T result = caseServiceReferenceType(serviceReferenceType);
				if (result == null) result = caseReferenceType(serviceReferenceType);
				if (result == null) result = caseAbstractReferenceBaseType(serviceReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.TELEPHONE_TYPE: {
				TelephoneType telephoneType = (TelephoneType)theEObject;
				T result = caseTelephoneType(telephoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.UN_NAMED_DOMAIN_TYPE: {
				UnNamedDomainType unNamedDomainType = (UnNamedDomainType)theEObject;
				T result = caseUnNamedDomainType(unNamedDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.VALUES_REFERENCE_TYPE: {
				ValuesReferenceType valuesReferenceType = (ValuesReferenceType)theEObject;
				T result = caseValuesReferenceType(valuesReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ows110Package.WGS84_BOUNDING_BOX_TYPE: {
				WGS84BoundingBoxType wgs84BoundingBoxType = (WGS84BoundingBoxType)theEObject;
				T result = caseWGS84BoundingBoxType(wgs84BoundingBoxType);
				if (result == null) result = caseBoundingBoxType(wgs84BoundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Reference Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Reference Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReferenceBaseType(AbstractReferenceBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Formats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Formats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptFormatsType(AcceptFormatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Versions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Versions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptVersionsType(AcceptVersionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedValuesType(AllowedValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyValueType(AnyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicIdentificationType(BasicIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBoxType(BoundingBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitiesBaseType(CapabilitiesBaseType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactType(ContactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contents Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contents Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentsBaseType(ContentsBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Description Summary Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Description Summary Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetDescriptionSummaryBaseType(DatasetDescriptionSummaryBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCPType(DCPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainMetadataType(DomainMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainType(DomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Report Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionReportType(ExceptionReportType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionType(ExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCapabilitiesType(GetCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Resource By Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Resource By Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetResourceByIdType(GetResourceByIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPType(HTTPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationType(IdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keywords Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordsType(KeywordsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageStringType(LanguageStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestType(ManifestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoValuesType(NoValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineResourceType(OnlineResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationsMetadataType(OperationsMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationType(OperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceGroupType(ReferenceGroupType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Request Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestMethodType(RequestMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsiblePartySubsetType(ResponsiblePartySubsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsiblePartyType(ResponsiblePartyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionsType(SectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceIdentificationType(ServiceIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProviderType(ServiceProviderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceReferenceType(ServiceReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telephone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelephoneType(TelephoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Named Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Named Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnNamedDomainType(UnNamedDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuesReferenceType(ValuesReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WGS84 Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WGS84 Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWGS84BoundingBoxType(WGS84BoundingBoxType object) {
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

} //Ows110Switch
