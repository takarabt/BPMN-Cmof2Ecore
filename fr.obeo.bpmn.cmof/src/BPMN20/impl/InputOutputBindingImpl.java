/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.InputOutputBinding;
import BPMN20.InputSet;
import BPMN20.Operation;
import BPMN20.OutputSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link BPMN20.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link BPMN20.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputBindingImpl extends EObjectImpl implements InputOutputBinding {
	/**
	 * The cached value of the '{@link #getInputDataRef() <em>Input Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataRef()
	 * @generated
	 * @ordered
	 */
	protected InputSet inputDataRef;

	/**
	 * The cached value of the '{@link #getOutputDataRef() <em>Output Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataRef()
	 * @generated
	 * @ordered
	 */
	protected OutputSet outputDataRef;

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
	protected InputOutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getInputOutputBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet getInputDataRef() {
		if (inputDataRef != null && inputDataRef.eIsProxy()) {
			InternalEObject oldInputDataRef = (InternalEObject)inputDataRef;
			inputDataRef = (InputSet)eResolveProxy(oldInputDataRef);
			if (inputDataRef != oldInputDataRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef));
			}
		}
		return inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet basicGetInputDataRef() {
		return inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataRef(InputSet newInputDataRef) {
		InputSet oldInputDataRef = inputDataRef;
		inputDataRef = newInputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputDataRef() {
		if (outputDataRef != null && outputDataRef.eIsProxy()) {
			InternalEObject oldOutputDataRef = (InternalEObject)outputDataRef;
			outputDataRef = (OutputSet)eResolveProxy(oldOutputDataRef);
			if (outputDataRef != oldOutputDataRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef));
			}
		}
		return outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet basicGetOutputDataRef() {
		return outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataRef(OutputSet newOutputDataRef) {
		OutputSet oldOutputDataRef = outputDataRef;
		outputDataRef = newOutputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				if (resolve) return getInputDataRef();
				return basicGetInputDataRef();
			case BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				if (resolve) return getOutputDataRef();
				return basicGetOutputDataRef();
			case BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
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
			case BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)newValue);
				return;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)newValue);
				return;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
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
			case BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)null);
				return;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)null);
				return;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
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
			case BPMN20Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				return inputDataRef != null;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				return outputDataRef != null;
			case BPMN20Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
				return operationRef != null;
		}
		return super.eIsSet(featureID);
	}

} //InputOutputBindingImpl
