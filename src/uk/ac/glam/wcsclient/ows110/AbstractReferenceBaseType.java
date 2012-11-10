/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.ows110;

import org.eclipse.emf.ecore.EObject;

import uk.ac.glam.wcsclient.wcs111.xlink.ActuateType;
import uk.ac.glam.wcsclient.wcs111.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Reference Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Base for a reference to a remote or local resource. 
 * This type contains only a restricted and annotated set of the attributes from the xlink:simpleLink attributeGroup. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getHref <em>Href</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getShow <em>Show</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType()
 * @model extendedMetaData="name='AbstractReferenceBaseType' kind='empty'"
 * @generated
 */
public interface AbstractReferenceBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.glam.wcsclient.wcs111.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Although allowed, this attribute is not expected to be useful in this application of xlink:simpleLink. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Although allowed, this attribute is not expected to be useful in this application of xlink:simpleLink. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getArcrole <em>Arcrole</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a remote resource or local payload. A remote resource is typically addressed by a URL. For a local payload (such as a multipart mime message), the xlink:href must start with the prefix cid:. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a resource that describes the role of this reference. When no value is supplied, no particular role value is to be inferred. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getRole <em>Role</em>}' attribute.
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
	 * Although allowed, this attribute is not expected to be useful in this application of xlink:simpleLink. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see uk.ac.glam.wcsclient.wcs111.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getShow <em>Show</em>}' attribute is set.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the meaning of the referenced resource in a human-readable fashion. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getTitle <em>Title</em>}' attribute.
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
	 * @see uk.ac.glam.wcsclient.ows110.Ows110Package#getAbstractReferenceBaseType_Type()
	 * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link uk.ac.glam.wcsclient.ows110.AbstractReferenceBaseType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // AbstractReferenceBaseType
