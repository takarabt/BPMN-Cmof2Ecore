/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.Activity;
import BPMN20.BPMN20Package;
import BPMN20.CompensateEventDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.CompensateEventDefinitionImpl#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link BPMN20.impl.CompensateEventDefinitionImpl#getActivityRef <em>Activity Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompensateEventDefinitionImpl extends EventDefinitionImpl implements CompensateEventDefinition {
	/**
	 * The default value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Object WAIT_FOR_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitForCompletion() <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitForCompletion()
	 * @generated
	 * @ordered
	 */
	protected Object waitForCompletion = WAIT_FOR_COMPLETION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivityRef() <em>Activity Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRef()
	 * @generated
	 * @ordered
	 */
	protected Activity activityRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompensateEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getCompensateEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWaitForCompletion() {
		return waitForCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitForCompletion(Object newWaitForCompletion) {
		Object oldWaitForCompletion = waitForCompletion;
		waitForCompletion = newWaitForCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION, oldWaitForCompletion, waitForCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityRef() {
		if (activityRef != null && activityRef.eIsProxy()) {
			InternalEObject oldActivityRef = (InternalEObject)activityRef;
			activityRef = (Activity)eResolveProxy(oldActivityRef);
			if (activityRef != oldActivityRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF, oldActivityRef, activityRef));
			}
		}
		return activityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivityRef() {
		return activityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityRef(Activity newActivityRef) {
		Activity oldActivityRef = activityRef;
		activityRef = newActivityRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF, oldActivityRef, activityRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				return getWaitForCompletion();
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				if (resolve) return getActivityRef();
				return basicGetActivityRef();
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
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				setWaitForCompletion(newValue);
				return;
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				setActivityRef((Activity)newValue);
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
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				setWaitForCompletion(WAIT_FOR_COMPLETION_EDEFAULT);
				return;
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				setActivityRef((Activity)null);
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
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION:
				return WAIT_FOR_COMPLETION_EDEFAULT == null ? waitForCompletion != null : !WAIT_FOR_COMPLETION_EDEFAULT.equals(waitForCompletion);
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF:
				return activityRef != null;
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
		result.append(" (waitForCompletion: ");
		result.append(waitForCompletion);
		result.append(')');
		return result.toString();
	}

} //CompensateEventDefinitionImpl
