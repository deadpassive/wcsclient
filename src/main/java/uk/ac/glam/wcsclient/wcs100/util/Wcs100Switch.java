/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs100.*;

import uk.ac.glam.wcsclient.wcs100.gml.AbstractGMLType;
import uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryBaseType;
import uk.ac.glam.wcsclient.wcs100.gml.AbstractGeometryType;
import uk.ac.glam.wcsclient.wcs100.gml.EnvelopeType;
import uk.ac.glam.wcsclient.wcs100.gml.MetaDataPropertyType;

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
 * @see uk.ac.glam.wcsclient.wcs100.Wcs100Package
 * @generated
 */
public class Wcs100Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Wcs100Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs100Switch() {
		if (modelPackage == null) {
			modelPackage = Wcs100Package.eINSTANCE;
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
			case Wcs100Package.ABSTRACT_DESCRIPTION_BASE_TYPE: {
				AbstractDescriptionBaseType abstractDescriptionBaseType = (AbstractDescriptionBaseType)theEObject;
				T result = caseAbstractDescriptionBaseType(abstractDescriptionBaseType);
				if (result == null) result = caseAbstractGMLType(abstractDescriptionBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.ABSTRACT_DESCRIPTION_TYPE: {
				AbstractDescriptionType abstractDescriptionType = (AbstractDescriptionType)theEObject;
				T result = caseAbstractDescriptionType(abstractDescriptionType);
				if (result == null) result = caseAbstractDescriptionBaseType(abstractDescriptionType);
				if (result == null) result = caseAbstractGMLType(abstractDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.AXIS_DESCRIPTION_TYPE: {
				AxisDescriptionType axisDescriptionType = (AxisDescriptionType)theEObject;
				T result = caseAxisDescriptionType(axisDescriptionType);
				if (result == null) result = caseAbstractDescriptionType(axisDescriptionType);
				if (result == null) result = caseAbstractDescriptionBaseType(axisDescriptionType);
				if (result == null) result = caseAbstractGMLType(axisDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.AXIS_DESCRIPTION_TYPE1: {
				AxisDescriptionType1 axisDescriptionType1 = (AxisDescriptionType1)theEObject;
				T result = caseAxisDescriptionType1(axisDescriptionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.AXIS_SUBSET_TYPE: {
				AxisSubsetType axisSubsetType = (AxisSubsetType)theEObject;
				T result = caseAxisSubsetType(axisSubsetType);
				if (result == null) result = caseValueEnumBaseType(axisSubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.CONTACT_TYPE: {
				ContactType contactType = (ContactType)theEObject;
				T result = caseContactType(contactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.CONTENT_METADATA_TYPE: {
				ContentMetadataType contentMetadataType = (ContentMetadataType)theEObject;
				T result = caseContentMetadataType(contentMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.COVERAGE_DESCRIPTION_TYPE: {
				CoverageDescriptionType coverageDescriptionType = (CoverageDescriptionType)theEObject;
				T result = caseCoverageDescriptionType(coverageDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.COVERAGE_OFFERING_BRIEF_TYPE: {
				CoverageOfferingBriefType coverageOfferingBriefType = (CoverageOfferingBriefType)theEObject;
				T result = caseCoverageOfferingBriefType(coverageOfferingBriefType);
				if (result == null) result = caseAbstractDescriptionType(coverageOfferingBriefType);
				if (result == null) result = caseAbstractDescriptionBaseType(coverageOfferingBriefType);
				if (result == null) result = caseAbstractGMLType(coverageOfferingBriefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.COVERAGE_OFFERING_TYPE: {
				CoverageOfferingType coverageOfferingType = (CoverageOfferingType)theEObject;
				T result = caseCoverageOfferingType(coverageOfferingType);
				if (result == null) result = caseCoverageOfferingBriefType(coverageOfferingType);
				if (result == null) result = caseAbstractDescriptionType(coverageOfferingType);
				if (result == null) result = caseAbstractDescriptionBaseType(coverageOfferingType);
				if (result == null) result = caseAbstractGMLType(coverageOfferingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DCP_TYPE_TYPE: {
				DCPTypeType dcpTypeType = (DCPTypeType)theEObject;
				T result = caseDCPTypeType(dcpTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DESCRIBE_COVERAGE_TYPE: {
				DescribeCoverageType describeCoverageType = (DescribeCoverageType)theEObject;
				T result = caseDescribeCoverageType(describeCoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DESCRIBE_COVERAGE_TYPE1: {
				DescribeCoverageType1 describeCoverageType1 = (DescribeCoverageType1)theEObject;
				T result = caseDescribeCoverageType1(describeCoverageType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DOMAIN_SET_TYPE: {
				DomainSetType domainSetType = (DomainSetType)theEObject;
				T result = caseDomainSetType(domainSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.DOMAIN_SUBSET_TYPE: {
				DomainSubsetType domainSubsetType = (DomainSubsetType)theEObject;
				T result = caseDomainSubsetType(domainSubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.GET_CAPABILITIES_TYPE: {
				GetCapabilitiesType getCapabilitiesType = (GetCapabilitiesType)theEObject;
				T result = caseGetCapabilitiesType(getCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.GET_CAPABILITIES_TYPE1: {
				GetCapabilitiesType1 getCapabilitiesType1 = (GetCapabilitiesType1)theEObject;
				T result = caseGetCapabilitiesType1(getCapabilitiesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.GET_COVERAGE_TYPE: {
				GetCoverageType getCoverageType = (GetCoverageType)theEObject;
				T result = caseGetCoverageType(getCoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.GET_COVERAGE_TYPE1: {
				GetCoverageType1 getCoverageType1 = (GetCoverageType1)theEObject;
				T result = caseGetCoverageType1(getCoverageType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.GET_TYPE: {
				GetType getType = (GetType)theEObject;
				T result = caseGetType(getType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.HTTP_TYPE: {
				HTTPType httpType = (HTTPType)theEObject;
				T result = caseHTTPType(httpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.INTERVAL_TYPE: {
				IntervalType intervalType = (IntervalType)theEObject;
				T result = caseIntervalType(intervalType);
				if (result == null) result = caseValueRangeType(intervalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.KEYWORDS_TYPE: {
				KeywordsType keywordsType = (KeywordsType)theEObject;
				T result = caseKeywordsType(keywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.LON_LAT_ENVELOPE_BASE_TYPE: {
				LonLatEnvelopeBaseType lonLatEnvelopeBaseType = (LonLatEnvelopeBaseType)theEObject;
				T result = caseLonLatEnvelopeBaseType(lonLatEnvelopeBaseType);
				if (result == null) result = caseEnvelopeType(lonLatEnvelopeBaseType);
				if (result == null) result = caseAbstractGeometryType(lonLatEnvelopeBaseType);
				if (result == null) result = caseAbstractGeometryBaseType(lonLatEnvelopeBaseType);
				if (result == null) result = caseAbstractGMLType(lonLatEnvelopeBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.LON_LAT_ENVELOPE_TYPE: {
				LonLatEnvelopeType lonLatEnvelopeType = (LonLatEnvelopeType)theEObject;
				T result = caseLonLatEnvelopeType(lonLatEnvelopeType);
				if (result == null) result = caseLonLatEnvelopeBaseType(lonLatEnvelopeType);
				if (result == null) result = caseEnvelopeType(lonLatEnvelopeType);
				if (result == null) result = caseAbstractGeometryType(lonLatEnvelopeType);
				if (result == null) result = caseAbstractGeometryBaseType(lonLatEnvelopeType);
				if (result == null) result = caseAbstractGMLType(lonLatEnvelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.METADATA_ASSOCIATION_TYPE: {
				MetadataAssociationType metadataAssociationType = (MetadataAssociationType)theEObject;
				T result = caseMetadataAssociationType(metadataAssociationType);
				if (result == null) result = caseMetaDataPropertyType(metadataAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.METADATA_LINK_TYPE: {
				MetadataLinkType metadataLinkType = (MetadataLinkType)theEObject;
				T result = caseMetadataLinkType(metadataLinkType);
				if (result == null) result = caseMetadataAssociationType(metadataLinkType);
				if (result == null) result = caseMetaDataPropertyType(metadataLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.ONLINE_RESOURCE_TYPE: {
				OnlineResourceType onlineResourceType = (OnlineResourceType)theEObject;
				T result = caseOnlineResourceType(onlineResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.OUTPUT_TYPE: {
				OutputType outputType = (OutputType)theEObject;
				T result = caseOutputType(outputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.POST_TYPE: {
				PostType postType = (PostType)theEObject;
				T result = casePostType(postType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.RANGE_SET_TYPE: {
				RangeSetType rangeSetType = (RangeSetType)theEObject;
				T result = caseRangeSetType(rangeSetType);
				if (result == null) result = caseAbstractDescriptionType(rangeSetType);
				if (result == null) result = caseAbstractDescriptionBaseType(rangeSetType);
				if (result == null) result = caseAbstractGMLType(rangeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.RANGE_SET_TYPE1: {
				RangeSetType1 rangeSetType1 = (RangeSetType1)theEObject;
				T result = caseRangeSetType1(rangeSetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.RANGE_SUBSET_TYPE: {
				RangeSubsetType rangeSubsetType = (RangeSubsetType)theEObject;
				T result = caseRangeSubsetType(rangeSubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.REQUEST_TYPE: {
				RequestType requestType = (RequestType)theEObject;
				T result = caseRequestType(requestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.RESPONSIBLE_PARTY_TYPE: {
				ResponsiblePartyType responsiblePartyType = (ResponsiblePartyType)theEObject;
				T result = caseResponsiblePartyType(responsiblePartyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = caseAbstractDescriptionType(serviceType);
				if (result == null) result = caseAbstractDescriptionBaseType(serviceType);
				if (result == null) result = caseAbstractGMLType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SPATIAL_DOMAIN_TYPE: {
				SpatialDomainType spatialDomainType = (SpatialDomainType)theEObject;
				T result = caseSpatialDomainType(spatialDomainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SPATIAL_SUBSET_TYPE: {
				SpatialSubsetType spatialSubsetType = (SpatialSubsetType)theEObject;
				T result = caseSpatialSubsetType(spatialSubsetType);
				if (result == null) result = caseSpatialDomainType(spatialSubsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SUPPORTED_CR_SS_TYPE: {
				SupportedCRSsType supportedCRSsType = (SupportedCRSsType)theEObject;
				T result = caseSupportedCRSsType(supportedCRSsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SUPPORTED_FORMATS_TYPE: {
				SupportedFormatsType supportedFormatsType = (SupportedFormatsType)theEObject;
				T result = caseSupportedFormatsType(supportedFormatsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.SUPPORTED_INTERPOLATIONS_TYPE: {
				SupportedInterpolationsType supportedInterpolationsType = (SupportedInterpolationsType)theEObject;
				T result = caseSupportedInterpolationsType(supportedInterpolationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.TELEPHONE_TYPE: {
				TelephoneType telephoneType = (TelephoneType)theEObject;
				T result = caseTelephoneType(telephoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.TIME_PERIOD_TYPE: {
				TimePeriodType timePeriodType = (TimePeriodType)theEObject;
				T result = caseTimePeriodType(timePeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.TIME_SEQUENCE_TYPE: {
				TimeSequenceType timeSequenceType = (TimeSequenceType)theEObject;
				T result = caseTimeSequenceType(timeSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.TYPED_LITERAL_TYPE: {
				TypedLiteralType typedLiteralType = (TypedLiteralType)theEObject;
				T result = caseTypedLiteralType(typedLiteralType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.VALUE_ENUM_BASE_TYPE: {
				ValueEnumBaseType valueEnumBaseType = (ValueEnumBaseType)theEObject;
				T result = caseValueEnumBaseType(valueEnumBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.VALUE_ENUM_TYPE: {
				ValueEnumType valueEnumType = (ValueEnumType)theEObject;
				T result = caseValueEnumType(valueEnumType);
				if (result == null) result = caseValueEnumBaseType(valueEnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.VALUE_RANGE_TYPE: {
				ValueRangeType valueRangeType = (ValueRangeType)theEObject;
				T result = caseValueRangeType(valueRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.VALUES_TYPE: {
				ValuesType valuesType = (ValuesType)theEObject;
				T result = caseValuesType(valuesType);
				if (result == null) result = caseValueEnumType(valuesType);
				if (result == null) result = caseValueEnumBaseType(valuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.VENDOR_SPECIFIC_CAPABILITIES_TYPE: {
				VendorSpecificCapabilitiesType vendorSpecificCapabilitiesType = (VendorSpecificCapabilitiesType)theEObject;
				T result = caseVendorSpecificCapabilitiesType(vendorSpecificCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.WCS_CAPABILITIES_TYPE: {
				WCSCapabilitiesType wcsCapabilitiesType = (WCSCapabilitiesType)theEObject;
				T result = caseWCSCapabilitiesType(wcsCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Wcs100Package.WCS_CAPABILITY_TYPE: {
				WCSCapabilityType wcsCapabilityType = (WCSCapabilityType)theEObject;
				T result = caseWCSCapabilityType(wcsCapabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Description Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Description Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDescriptionBaseType(AbstractDescriptionBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDescriptionType(AbstractDescriptionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Axis Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisDescriptionType(AxisDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Description Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Description Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisDescriptionType1(AxisDescriptionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisSubsetType(AxisSubsetType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Content Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentMetadataType(ContentMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageDescriptionType(CoverageDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Offering Brief Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Offering Brief Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageOfferingBriefType(CoverageOfferingBriefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Offering Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Offering Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageOfferingType(CoverageOfferingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCP Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCP Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCPTypeType(DCPTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Coverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Coverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeCoverageType(DescribeCoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Describe Coverage Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Describe Coverage Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribeCoverageType1(DescribeCoverageType1 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSetType(DomainSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSubsetType(DomainSubsetType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Get Capabilities Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Capabilities Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCapabilitiesType1(GetCapabilitiesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Coverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Coverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCoverageType(GetCoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Coverage Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Coverage Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCoverageType1(GetCoverageType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetType(GetType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interval Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalType(IntervalType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Lon Lat Envelope Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lon Lat Envelope Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLonLatEnvelopeBaseType(LonLatEnvelopeBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lon Lat Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lon Lat Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLonLatEnvelopeType(LonLatEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataAssociationType(MetadataAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataLinkType(MetadataLinkType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostType(PostType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSetType(RangeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Set Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Set Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSetType1(RangeSetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSubsetType(RangeSubsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestType(RequestType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Domain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Domain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialDomainType(SpatialDomainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Subset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Subset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialSubsetType(SpatialSubsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported CR Ss Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported CR Ss Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedCRSsType(SupportedCRSsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Formats Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Formats Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedFormatsType(SupportedFormatsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Interpolations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Interpolations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedInterpolationsType(SupportedInterpolationsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodType(TimePeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSequenceType(TimeSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedLiteralType(TypedLiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Enum Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Enum Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueEnumBaseType(ValueEnumBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueEnumType(ValueEnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeType(ValueRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuesType(ValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Specific Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Specific Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorSpecificCapabilitiesType(VendorSpecificCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCS Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCS Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCSCapabilitiesType(WCSCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WCS Capability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WCS Capability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWCSCapabilityType(WCSCapabilityType object) {
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

} //Wcs100Switch
