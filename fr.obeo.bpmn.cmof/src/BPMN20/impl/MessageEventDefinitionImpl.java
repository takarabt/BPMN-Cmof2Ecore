/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.Message;
import BPMN20.MessageEventDefinition;
import BPMN20.Operation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.MessageEventDefinitionImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link BPMN20.impl.MessageEventDefinitionImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageEventDefinitionImpl extends EventDefinitionImpl implements MessageEventDefinition {
	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected Message messageRef;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected Operation operationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getMessageEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageRef() {
		if (messageRef != null && messageRef.eIsProxy()) {
			InternalEObject oldMessageRef = (InternalEObject)messageRef;
			messageRef = (Message)eResolveProxy(oldMessageRef);
			if (messageRef != oldMessageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF, oldMessageRef, messageRef));
			}
		}
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageRef() {
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(Message newMessageRef) {
		Message oldMessageRef = messageRef;
		messageRef = newMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF, oldMessageRef, messageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationRef() {
		if (operationRef != null && operationRef.eIsProxy()) {
			InternalEObject oldOperationRef = (InternalEObject)operationRef;
			operationRef = (Operation)eResolveProxy(oldOperationRef);
			if (operationRef != oldOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF, oldOperationRef, operationRef));
			}
		}
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(Operation newOperationRef) {
		Operation oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
				if (resolve) return getMessageRef();
				return basicGetMessageRef();
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
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
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
				setMessageRef((Message)newValue);
				return;
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
				setOperationRef((Operation)newValue);
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
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
				setMessageRef((Message)null);
				return;
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
				setOperationRef((Operation)null);
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
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__MESSAGE_REF:
				return messageRef != null;
			case BPMN20Package.MESSAGE_EVENT_DEFINITION__OPERATION_REF:
				return operationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageEventDefinitionImpl
