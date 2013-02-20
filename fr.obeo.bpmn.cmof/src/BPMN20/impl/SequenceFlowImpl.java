/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.Expression;
import BPMN20.FlowNode;
import BPMN20.SequenceFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.SequenceFlowImpl#getIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link BPMN20.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link BPMN20.impl.SequenceFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link BPMN20.impl.SequenceFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
	/**
	 * The default value of the '{@link #getIsImmediate() <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_IMMEDIATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsImmediate() <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsImmediate()
	 * @generated
	 * @ordered
	 */
	protected Object isImmediate = IS_IMMEDIATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression conditionExpression;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode targetRef;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode sourceRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getSequenceFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsImmediate() {
		return isImmediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmediate(Object newIsImmediate) {
		Object oldIsImmediate = isImmediate;
		isImmediate = newIsImmediate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__IS_IMMEDIATE, oldIsImmediate, isImmediate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionExpression(Expression newConditionExpression, NotificationChain msgs) {
		Expression oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION, oldConditionExpression, newConditionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(Expression newConditionExpression) {
		if (newConditionExpression != conditionExpression) {
			NotificationChain msgs = null;
			if (conditionExpression != null)
				msgs = ((InternalEObject)conditionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION, null, msgs);
			if (newConditionExpression != null)
				msgs = ((InternalEObject)newConditionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION, null, msgs);
			msgs = basicSetConditionExpression(newConditionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION, newConditionExpression, newConditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getTargetRef() {
		if (targetRef != null && targetRef.eIsProxy()) {
			InternalEObject oldTargetRef = (InternalEObject)targetRef;
			targetRef = (FlowNode)eResolveProxy(oldTargetRef);
			if (targetRef != oldTargetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, targetRef));
			}
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRef(FlowNode newTargetRef, NotificationChain msgs) {
		FlowNode oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__TARGET_REF, oldTargetRef, newTargetRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(FlowNode newTargetRef) {
		if (newTargetRef != targetRef) {
			NotificationChain msgs = null;
			if (targetRef != null)
				msgs = ((InternalEObject)targetRef).eInverseRemove(this, BPMN20Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
			if (newTargetRef != null)
				msgs = ((InternalEObject)newTargetRef).eInverseAdd(this, BPMN20Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
			msgs = basicSetTargetRef(newTargetRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__TARGET_REF, newTargetRef, newTargetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject)sourceRef;
			sourceRef = (FlowNode)eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(FlowNode newSourceRef, NotificationChain msgs) {
		FlowNode oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__SOURCE_REF, oldSourceRef, newSourceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(FlowNode newSourceRef) {
		if (newSourceRef != sourceRef) {
			NotificationChain msgs = null;
			if (sourceRef != null)
				msgs = ((InternalEObject)sourceRef).eInverseRemove(this, BPMN20Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
			if (newSourceRef != null)
				msgs = ((InternalEObject)newSourceRef).eInverseAdd(this, BPMN20Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
			msgs = basicSetSourceRef(newSourceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.SEQUENCE_FLOW__SOURCE_REF, newSourceRef, newSourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				if (targetRef != null)
					msgs = ((InternalEObject)targetRef).eInverseRemove(this, BPMN20Package.FLOW_NODE__INCOMING, FlowNode.class, msgs);
				return basicSetTargetRef((FlowNode)otherEnd, msgs);
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				if (sourceRef != null)
					msgs = ((InternalEObject)sourceRef).eInverseRemove(this, BPMN20Package.FLOW_NODE__OUTGOING, FlowNode.class, msgs);
				return basicSetSourceRef((FlowNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				return basicSetConditionExpression(null, msgs);
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				return basicSetTargetRef(null, msgs);
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				return basicSetSourceRef(null, msgs);
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
			case BPMN20Package.SEQUENCE_FLOW__IS_IMMEDIATE:
				return getIsImmediate();
			case BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				return getConditionExpression();
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				if (resolve) return getTargetRef();
				return basicGetTargetRef();
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				if (resolve) return getSourceRef();
				return basicGetSourceRef();
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
			case BPMN20Package.SEQUENCE_FLOW__IS_IMMEDIATE:
				setIsImmediate(newValue);
				return;
			case BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				setConditionExpression((Expression)newValue);
				return;
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				setTargetRef((FlowNode)newValue);
				return;
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				setSourceRef((FlowNode)newValue);
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
			case BPMN20Package.SEQUENCE_FLOW__IS_IMMEDIATE:
				setIsImmediate(IS_IMMEDIATE_EDEFAULT);
				return;
			case BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				setConditionExpression((Expression)null);
				return;
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				setTargetRef((FlowNode)null);
				return;
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				setSourceRef((FlowNode)null);
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
			case BPMN20Package.SEQUENCE_FLOW__IS_IMMEDIATE:
				return IS_IMMEDIATE_EDEFAULT == null ? isImmediate != null : !IS_IMMEDIATE_EDEFAULT.equals(isImmediate);
			case BPMN20Package.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				return conditionExpression != null;
			case BPMN20Package.SEQUENCE_FLOW__TARGET_REF:
				return targetRef != null;
			case BPMN20Package.SEQUENCE_FLOW__SOURCE_REF:
				return sourceRef != null;
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
		result.append(" (isImmediate: ");
		result.append(isImmediate);
		result.append(')');
		return result.toString();
	}

} //SequenceFlowImpl
