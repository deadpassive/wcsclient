/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.glam.wcsclient.ows110.CodeType;
import uk.ac.glam.wcsclient.ows110.UnNamedDomainType;

import uk.ac.glam.wcsclient.ows110.impl.DescriptionTypeImpl;

import uk.ac.glam.wcsclient.wcs111.AxisType;
import uk.ac.glam.wcsclient.wcs111.FieldType;
import uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType;
import uk.ac.glam.wcsclient.wcs111.Wcs111Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl#getInterpolationMethods <em>Interpolation Methods</em>}</li>
 *   <li>{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends DescriptionTypeImpl implements FieldType {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected UnNamedDomainType definition;

	/**
	 * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeType> nullValue;

	/**
	 * The cached value of the '{@link #getInterpolationMethods() <em>Interpolation Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationMethods()
	 * @generated
	 * @ordered
	 */
	protected InterpolationMethodsType interpolationMethods;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisType> axis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wcs111Package.Literals.FIELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.FIELD_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnNamedDomainType getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(UnNamedDomainType newDefinition, NotificationChain msgs) {
		UnNamedDomainType oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Wcs111Package.FIELD_TYPE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(UnNamedDomainType newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.FIELD_TYPE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.FIELD_TYPE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.FIELD_TYPE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getNullValue() {
		if (nullValue == null) {
			nullValue = new EObjectContainmentEList<CodeType>(CodeType.class, this, Wcs111Package.FIELD_TYPE__NULL_VALUE);
		}
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethodsType getInterpolationMethods() {
		return interpolationMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpolationMethods(InterpolationMethodsType newInterpolationMethods, NotificationChain msgs) {
		InterpolationMethodsType oldInterpolationMethods = interpolationMethods;
		interpolationMethods = newInterpolationMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS, oldInterpolationMethods, newInterpolationMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolationMethods(InterpolationMethodsType newInterpolationMethods) {
		if (newInterpolationMethods != interpolationMethods) {
			NotificationChain msgs = null;
			if (interpolationMethods != null)
				msgs = ((InternalEObject)interpolationMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS, null, msgs);
			if (newInterpolationMethods != null)
				msgs = ((InternalEObject)newInterpolationMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS, null, msgs);
			msgs = basicSetInterpolationMethods(newInterpolationMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS, newInterpolationMethods, newInterpolationMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AxisType> getAxis() {
		if (axis == null) {
			axis = new EObjectContainmentEList<AxisType>(AxisType.class, this, Wcs111Package.FIELD_TYPE__AXIS);
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Wcs111Package.FIELD_TYPE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Wcs111Package.FIELD_TYPE__NULL_VALUE:
				return ((InternalEList<?>)getNullValue()).basicRemove(otherEnd, msgs);
			case Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS:
				return basicSetInterpolationMethods(null, msgs);
			case Wcs111Package.FIELD_TYPE__AXIS:
				return ((InternalEList<?>)getAxis()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Wcs111Package.FIELD_TYPE__IDENTIFIER:
				return getIdentifier();
			case Wcs111Package.FIELD_TYPE__DEFINITION:
				return getDefinition();
			case Wcs111Package.FIELD_TYPE__NULL_VALUE:
				return getNullValue();
			case Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS:
				return getInterpolationMethods();
			case Wcs111Package.FIELD_TYPE__AXIS:
				return getAxis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Wcs111Package.FIELD_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Wcs111Package.FIELD_TYPE__DEFINITION:
				setDefinition((UnNamedDomainType)newValue);
				return;
			case Wcs111Package.FIELD_TYPE__NULL_VALUE:
				getNullValue().clear();
				getNullValue().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS:
				setInterpolationMethods((InterpolationMethodsType)newValue);
				return;
			case Wcs111Package.FIELD_TYPE__AXIS:
				getAxis().clear();
				getAxis().addAll((Collection<? extends AxisType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Wcs111Package.FIELD_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Wcs111Package.FIELD_TYPE__DEFINITION:
				setDefinition((UnNamedDomainType)null);
				return;
			case Wcs111Package.FIELD_TYPE__NULL_VALUE:
				getNullValue().clear();
				return;
			case Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS:
				setInterpolationMethods((InterpolationMethodsType)null);
				return;
			case Wcs111Package.FIELD_TYPE__AXIS:
				getAxis().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Wcs111Package.FIELD_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Wcs111Package.FIELD_TYPE__DEFINITION:
				return definition != null;
			case Wcs111Package.FIELD_TYPE__NULL_VALUE:
				return nullValue != null && !nullValue.isEmpty();
			case Wcs111Package.FIELD_TYPE__INTERPOLATION_METHODS:
				return interpolationMethods != null;
			case Wcs111Package.FIELD_TYPE__AXIS:
				return axis != null && !axis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //FieldTypeImpl
