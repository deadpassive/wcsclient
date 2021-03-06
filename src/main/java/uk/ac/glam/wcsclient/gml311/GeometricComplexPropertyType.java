/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.gml311;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs111.xlink.ActuateType;
import uk.ac.glam.wcsclient.wcs111.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometric Complex Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A property that has a geometric complex as its value domain can either be an appropriate geometry element encapsulated in an element of this type or an XLink reference to a remote geometry element (where remote includes geometry elements located elsewhere in the same document). Either the reference or the contained element must be given, but neither both nor none.
 * NOTE: The allowed geometry elements contained in such a property (or referenced by it) have to be modelled by an XML Schema choice element since the composites inherit both from geometric complex *and* geometric primitive and are already part of the _GeometricPrimitive substitution group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType()
 * @model extendedMetaData="name='GeometricComplexPropertyType' kind='elementOnly'"
 * @generated
 */
public interface GeometricComplexPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometric Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometric Complex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #setGeometricComplex(GeometricComplexType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_GeometricComplex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeometricComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometricComplexType getGeometricComplex();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getGeometricComplex <em>Geometric Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Complex</em>' containment reference.
	 * @see #getGeometricComplex()
	 * @generated
	 */
	void setGeometricComplex(GeometricComplexType value);

	/**
	 * Returns the value of the '<em><b>Composite Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Curve</em>' containment reference.
	 * @see #setCompositeCurve(CompositeCurveType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_CompositeCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeCurveType getCompositeCurve();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeCurve <em>Composite Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Curve</em>' containment reference.
	 * @see #getCompositeCurve()
	 * @generated
	 */
	void setCompositeCurve(CompositeCurveType value);

	/**
	 * Returns the value of the '<em><b>Composite Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Surface</em>' containment reference.
	 * @see #setCompositeSurface(CompositeSurfaceType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_CompositeSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeSurfaceType getCompositeSurface();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeSurface <em>Composite Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Surface</em>' containment reference.
	 * @see #getCompositeSurface()
	 * @generated
	 */
	void setCompositeSurface(CompositeSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Composite Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Solid</em>' containment reference.
	 * @see #setCompositeSolid(CompositeSolidType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_CompositeSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompositeSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositeSolidType getCompositeSolid();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getCompositeSolid <em>Composite Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Solid</em>' containment reference.
	 * @see #getCompositeSolid()
	 * @generated
	 */
	void setCompositeSolid(CompositeSolidType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs111.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The 'actuate' attribute is used to communicate the desired timing 
	 *         of traversal from the starting resource to the ending resource; 
	 *         it's value should be treated as follows:
	 *         onLoad - traverse to the ending resource immediately on loading 
	 *                  the starting resource 
	 *         onRequest - traverse from the starting resource to the ending 
	 *                     resource only on a post-loading event triggered for 
	 *                     this purpose 
	 *         other - behavior is unconstrained; examine other markup in link 
	 *                 for hints 
	 *         none - behavior is unconstrained
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an XML Schema fragment that specifies the content model of the propertys value. This is in conformance with the XML Schema Section 4.14 Referencing Schemas from Elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Schema</em>' attribute.
	 * @see #setRemoteSchema(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_RemoteSchema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='remoteSchema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemoteSchema();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getRemoteSchema <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Schema</em>' attribute.
	 * @see #getRemoteSchema()
	 * @generated
	 */
	void setRemoteSchema(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs111.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The 'show' attribute is used to communicate the desired presentation 
	 *         of the ending resource on traversal from the starting resource; it's 
	 *         value should be treated as follows: 
	 *         new - load ending resource in a new window, frame, pane, or other 
	 *               presentation context
	 *         replace - load the resource in the same window, frame, pane, or 
	 *                   other presentation context
	 *         embed - load ending resource in place of the presentation of the 
	 *                 starting resource
	 *         other - behavior is unconstrained; examine other markup in the 
	 *                 link for hints 
	 *         none - behavior is unconstrained 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see uk.ac.glam.wcsclient.gml311.Gml311Package#getGeometricComplexPropertyType_Type()
	 * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.gml311.GeometricComplexPropertyType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // GeometricComplexPropertyType
