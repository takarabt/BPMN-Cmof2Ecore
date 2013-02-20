/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.ErrorEventDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.ErrorEventDefinitionImpl#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorEventDefinitionImpl extends EventDefinitionImpl implements ErrorEventDefinition {
	/**
	 * The cached value of the '{@link #getErrorRef() <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRef()
	 * @generated
	 * @ordered
	 */
	protected BPMN20.Error errorRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getErrorEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Error getErrorRef() {
		if (errorRef != null && errorRef.eIsProxy()) {
			InternalEObject oldErrorRef = (InternalEObject)errorRef;
			errorRef = (BPMN20.Error)eResolveProxy(oldErrorRef);
			if (errorRef != oldErrorRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF, oldErrorRef, errorRef));
			}
		}
		return errorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Error basicGetErrorRef() {
		return errorRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorRef(BPMN20.Error newErrorRef) {
		BPMN20.Error oldErrorRef = errorRef;
		errorRef = newErrorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF, oldErrorRef, errorRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				if (resolve) return getErrorRef();
				return basicGetErrorRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				setErrorRef((BPMN20.Error)newValue);
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
			case BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				setErrorRef((BPMN20.Error)null);
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
			case BPMN20Package.ERROR_EVENT_DEFINITION__ERROR_REF:
				return errorRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorEventDefinitionImpl
