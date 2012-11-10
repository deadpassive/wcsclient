/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.xlink.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import uk.ac.glam.wcsclient.gml311.Gml311Package;

import uk.ac.glam.wcsclient.gml311.impl.Gml311PackageImpl;

import uk.ac.glam.wcsclient.ows110.Ows110Package;

import uk.ac.glam.wcsclient.ows110.impl.Ows110PackageImpl;

import uk.ac.glam.wcsclient.smil20.Smil20Package;

import uk.ac.glam.wcsclient.smil20.impl.Smil20PackageImpl;

import uk.ac.glam.wcsclient.smil20.language.LanguagePackage;

import uk.ac.glam.wcsclient.smil20.language.impl.LanguagePackageImpl;

import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

import uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl;

import uk.ac.glam.wcsclient.wcs111.xlink.ActuateType;
import uk.ac.glam.wcsclient.wcs111.xlink.DocumentRoot;
import uk.ac.glam.wcsclient.wcs111.xlink.ShowType;
import uk.ac.glam.wcsclient.wcs111.xlink.XlinkFactory;
import uk.ac.glam.wcsclient.wcs111.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XlinkPackageImpl extends EPackageImpl implements XlinkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum showTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actuateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType showTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.XlinkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XlinkPackageImpl() {
		super(eNS_URI, XlinkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XlinkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XlinkPackage init() {
		if (isInited) return (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Obtain or create and register package
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XlinkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Gml311PackageImpl theGml311Package = (Gml311PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Gml311Package.eNS_URI) instanceof Gml311PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Gml311Package.eNS_URI) : Gml311Package.eINSTANCE);
		Ows110PackageImpl theOws110Package = (Ows110PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ows110Package.eNS_URI) instanceof Ows110PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ows110Package.eNS_URI) : Ows110Package.eINSTANCE);
		Smil20PackageImpl theSmil20Package = (Smil20PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) instanceof Smil20PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) : Smil20Package.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		Wcs111PackageImpl theWcs111Package = (Wcs111PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Wcs111Package.eNS_URI) instanceof Wcs111PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Wcs111Package.eNS_URI) : Wcs111Package.eINSTANCE);

		// Load packages
		theGml311Package.loadPackage();

		// Create package meta-data objects
		theXlinkPackage.createPackageContents();
		theOws110Package.createPackageContents();
		theSmil20Package.createPackageContents();
		theLanguagePackage.createPackageContents();
		theWcs111Package.createPackageContents();

		// Initialize created meta-data
		theXlinkPackage.initializePackageContents();
		theOws110Package.initializePackageContents();
		theSmil20Package.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theWcs111Package.initializePackageContents();

		// Fix loaded packages
		theGml311Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXlinkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XlinkPackage.eNS_URI, theXlinkPackage);
		return theXlinkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Actuate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Arcrole() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_From() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Href() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Label() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Role() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Show() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_To() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActuateType() {
		return actuateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShowType() {
		return showTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActuateTypeObject() {
		return actuateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShowTypeObject() {
		return showTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XlinkFactory getXlinkFactory() {
		return (XlinkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTUATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ARCROLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FROM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HREF);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LABEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ROLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHOW);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TO);

		// Create enums
		actuateTypeEEnum = createEEnum(ACTUATE_TYPE);
		showTypeEEnum = createEEnum(SHOW_TYPE);

		// Create data types
		actuateTypeObjectEDataType = createEDataType(ACTUATE_TYPE_OBJECT);
		showTypeObjectEDataType = createEDataType(SHOW_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Actuate(), this.getActuateType(), "actuate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Arcrole(), theXMLTypePackage.getAnyURI(), "arcrole", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_From(), theXMLTypePackage.getString(), "from", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Role(), theXMLTypePackage.getAnyURI(), "role", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Show(), this.getShowType(), "show", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_To(), theXMLTypePackage.getString(), "to", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actuateTypeEEnum, ActuateType.class, "ActuateType");
		addEEnumLiteral(actuateTypeEEnum, ActuateType.ON_LOAD);
		addEEnumLiteral(actuateTypeEEnum, ActuateType.ON_REQUEST);
		addEEnumLiteral(actuateTypeEEnum, ActuateType.OTHER);
		addEEnumLiteral(actuateTypeEEnum, ActuateType.NONE);

		initEEnum(showTypeEEnum, ShowType.class, "ShowType");
		addEEnumLiteral(showTypeEEnum, ShowType.NEW);
		addEEnumLiteral(showTypeEEnum, ShowType.REPLACE);
		addEEnumLiteral(showTypeEEnum, ShowType.EMBED);
		addEEnumLiteral(showTypeEEnum, ShowType.OTHER);
		addEEnumLiteral(showTypeEEnum, ShowType.NONE);

		// Initialize data types
		initEDataType(actuateTypeObjectEDataType, ActuateType.class, "ActuateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(showTypeObjectEDataType, ShowType.class, "ShowTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:opengis:specification:gml:schema-xlinks:v3.0c2
		createUrnopengisspecificationgmlschemaxlinksv3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xlinks:v3.0c2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxlinksv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xlinks:v3.0c2";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "xlinks.xsd v3.0b2 2001-07"
		   });																			
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (actuateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "actuate_._type"
		   });		
		addAnnotation
		  (actuateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "actuate_._type:Object",
			 "baseType", "actuate_._type"
		   });		
		addAnnotation
		  (showTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "show_._type"
		   });		
		addAnnotation
		  (showTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "show_._type:Object",
			 "baseType", "show_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Arcrole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "##targetNamespace"
		   });
	}

} //XlinkPackageImpl
