/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.CallConversation;
import BPMN20.Collaboration;
import BPMN20.ParticipantAssociation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.CallConversationImpl#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 *   <li>{@link BPMN20.impl.CallConversationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallConversationImpl extends ConversationNodeImpl implements CallConversation {
	/**
	 * The cached value of the '{@link #getCalledCollaborationRef() <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledCollaborationRef()
	 * @generated
	 * @ordered
	 */
	protected Collaboration calledCollaborationRef;

	/**
	 * The cached value of the '{@link #getParticipantAssociations() <em>Participant Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantAssociation> participantAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallConversationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getCallConversation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getCalledCollaborationRef() {
		if (calledCollaborationRef != null && calledCollaborationRef.eIsProxy()) {
			InternalEObject oldCalledCollaborationRef = (InternalEObject)calledCollaborationRef;
			calledCollaborationRef = (Collaboration)eResolveProxy(oldCalledCollaborationRef);
			if (calledCollaborationRef != oldCalledCollaborationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF, oldCalledCollaborationRef, calledCollaborationRef));
			}
		}
		return calledCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetCalledCollaborationRef() {
		return calledCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledCollaborationRef(Collaboration newCalledCollaborationRef) {
		Collaboration oldCalledCollaborationRef = calledCollaborationRef;
		calledCollaborationRef = newCalledCollaborationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF, oldCalledCollaborationRef, calledCollaborationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantAssociation> getParticipantAssociations() {
		if (participantAssociations == null) {
			participantAssociations = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this, BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS);
		}
		return participantAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				return ((InternalEList<?>)getParticipantAssociations()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				if (resolve) return getCalledCollaborationRef();
				return basicGetCalledCollaborationRef();
			case BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				return getParticipantAssociations();
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
			case BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				setCalledCollaborationRef((Collaboration)newValue);
				return;
			case BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>)newValue);
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
			case BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				setCalledCollaborationRef((Collaboration)null);
				return;
			case BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
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
			case BPMN20Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				return calledCollaborationRef != null;
			case BPMN20Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				return participantAssociations != null && !participantAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallConversationImpl
