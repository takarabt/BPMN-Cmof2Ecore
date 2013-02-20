/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.ConversationAssociation;
import BPMN20.ConversationNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.ConversationAssociationImpl#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link BPMN20.impl.ConversationAssociationImpl#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationAssociationImpl extends BaseElementImpl implements ConversationAssociation {
	/**
	 * The cached value of the '{@link #getInnerConversationNodeRef() <em>Inner Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected ConversationNode innerConversationNodeRef;

	/**
	 * The cached value of the '{@link #getOuterConversationNodeRef() <em>Outer Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected ConversationNode outerConversationNodeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getConversationAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getInnerConversationNodeRef() {
		if (innerConversationNodeRef != null && innerConversationNodeRef.eIsProxy()) {
			InternalEObject oldInnerConversationNodeRef = (InternalEObject)innerConversationNodeRef;
			innerConversationNodeRef = (ConversationNode)eResolveProxy(oldInnerConversationNodeRef);
			if (innerConversationNodeRef != oldInnerConversationNodeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF, oldInnerConversationNodeRef, innerConversationNodeRef));
			}
		}
		return innerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode basicGetInnerConversationNodeRef() {
		return innerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerConversationNodeRef(ConversationNode newInnerConversationNodeRef) {
		ConversationNode oldInnerConversationNodeRef = innerConversationNodeRef;
		innerConversationNodeRef = newInnerConversationNodeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF, oldInnerConversationNodeRef, innerConversationNodeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode getOuterConversationNodeRef() {
		if (outerConversationNodeRef != null && outerConversationNodeRef.eIsProxy()) {
			InternalEObject oldOuterConversationNodeRef = (InternalEObject)outerConversationNodeRef;
			outerConversationNodeRef = (ConversationNode)eResolveProxy(oldOuterConversationNodeRef);
			if (outerConversationNodeRef != oldOuterConversationNodeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF, oldOuterConversationNodeRef, outerConversationNodeRef));
			}
		}
		return outerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNode basicGetOuterConversationNodeRef() {
		return outerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterConversationNodeRef(ConversationNode newOuterConversationNodeRef) {
		ConversationNode oldOuterConversationNodeRef = outerConversationNodeRef;
		outerConversationNodeRef = newOuterConversationNodeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF, oldOuterConversationNodeRef, outerConversationNodeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				if (resolve) return getInnerConversationNodeRef();
				return basicGetInnerConversationNodeRef();
			case BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				if (resolve) return getOuterConversationNodeRef();
				return basicGetOuterConversationNodeRef();
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
			case BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				setInnerConversationNodeRef((ConversationNode)newValue);
				return;
			case BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				setOuterConversationNodeRef((ConversationNode)newValue);
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
			case BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				setInnerConversationNodeRef((ConversationNode)null);
				return;
			case BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				setOuterConversationNodeRef((ConversationNode)null);
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
			case BPMN20Package.CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				return innerConversationNodeRef != null;
			case BPMN20Package.CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				return outerConversationNodeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ConversationAssociationImpl
