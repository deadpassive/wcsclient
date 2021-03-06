/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.xlink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 			GML 3.0 candidate xlinks schema. Copyright (c) 2001 OGC, All Rights Reserved.
 * 		
 * <!-- end-model-doc -->
 * @see uk.ac.glam.wcsclient.wcs100.xlink.XlinkFactory
 * @model kind="package"
 *        annotation="urn:opengis:specification:gml:schema-xlinks:v3.0c2 appinfo='xlinks.xsd v3.0b2 2001-07'"
 * @generated
 */
public interface XlinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xlink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xlink";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xlink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XlinkPackage eINSTANCE = uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.DocumentRootImpl
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTUATE = 3;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCROLE = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FROM = 5;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HREF = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE = 8;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHOW = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 10;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TO = 11;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.ActuateType <em>Actuate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getActuateType()
	 * @generated
	 */
	int ACTUATE_TYPE = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.ShowType <em>Show Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getShowType()
	 * @generated
	 */
	int SHOW_TYPE = 2;

	/**
	 * The meta object id for the '<em>Actuate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getActuateTypeObject()
	 * @generated
	 */
	int ACTUATE_TYPE_OBJECT = 3;

	/**
	 * The meta object id for the '<em>Show Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getShowTypeObject()
	 * @generated
	 */
	int SHOW_TYPE_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getActuate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getArcrole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_From();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getHref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Href();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Label();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Role();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getShow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Show();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.DocumentRoot#getTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_To();

	/**
	 * Returns the meta object for enum '{@link uk.ac.glam.wcsclient.wcs100.xlink.ActuateType <em>Actuate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuate Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
	 * @generated
	 */
	EEnum getActuateType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.glam.wcsclient.wcs100.xlink.ShowType <em>Show Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Show Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
	 * @generated
	 */
	EEnum getShowType();

	/**
	 * Returns the meta object for data type '{@link uk.ac.glam.wcsclient.wcs100.xlink.ActuateType <em>Actuate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Actuate Type Object</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
	 * @model instanceClass="uk.ac.glam.wcsclient.wcs100.xlink.ActuateType"
	 *        extendedMetaData="name='actuate_._type:Object' baseType='actuate_._type'"
	 * @generated
	 */
	EDataType getActuateTypeObject();

	/**
	 * Returns the meta object for data type '{@link uk.ac.glam.wcsclient.wcs100.xlink.ShowType <em>Show Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Show Type Object</em>'.
	 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
	 * @model instanceClass="uk.ac.glam.wcsclient.wcs100.xlink.ShowType"
	 *        extendedMetaData="name='show_._type:Object' baseType='show_._type'"
	 * @generated
	 */
	EDataType getShowTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XlinkFactory getXlinkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.DocumentRootImpl
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTUATE = eINSTANCE.getDocumentRoot_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ARCROLE = eINSTANCE.getDocumentRoot_Arcrole();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FROM = eINSTANCE.getDocumentRoot_From();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__HREF = eINSTANCE.getDocumentRoot_Href();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ROLE = eINSTANCE.getDocumentRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHOW = eINSTANCE.getDocumentRoot_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TO = eINSTANCE.getDocumentRoot_To();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.ActuateType <em>Actuate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getActuateType()
		 * @generated
		 */
		EEnum ACTUATE_TYPE = eINSTANCE.getActuateType();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs100.xlink.ShowType <em>Show Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getShowType()
		 * @generated
		 */
		EEnum SHOW_TYPE = eINSTANCE.getShowType();

		/**
		 * The meta object literal for the '<em>Actuate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.ActuateType
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getActuateTypeObject()
		 * @generated
		 */
		EDataType ACTUATE_TYPE_OBJECT = eINSTANCE.getActuateTypeObject();

		/**
		 * The meta object literal for the '<em>Show Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.ShowType
		 * @see uk.ac.glam.wcsclient.wcs100.xlink.impl.XlinkPackageImpl#getShowTypeObject()
		 * @generated
		 */
		EDataType SHOW_TYPE_OBJECT = eINSTANCE.getShowTypeObject();

	}

} //XlinkPackage
