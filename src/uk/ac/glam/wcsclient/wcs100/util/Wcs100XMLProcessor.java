/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs100.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import uk.ac.glam.wcsclient.wcs100.Wcs100Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Wcs100XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wcs100XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Wcs100Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Wcs100ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Wcs100ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Wcs100ResourceFactoryImpl());
		}
		return registrations;
	}

} //Wcs100XMLProcessor
