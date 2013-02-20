/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.Artifact;
import BPMN20.BPMN20Package;
import BPMN20.Choreography;
import BPMN20.Collaboration;
import BPMN20.ConversationAssociation;
import BPMN20.ConversationLink;
import BPMN20.ConversationNode;
import BPMN20.CorrelationKey;
import BPMN20.MessageFlow;
import BPMN20.MessageFlowAssociation;
import BPMN20.Participant;
import BPMN20.ParticipantAssociation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getConversations <em>Conversations</em>}</li>
 *   <li>{@link BPMN20.impl.CollaborationImpl#getConversationLinks <em>Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends RootElementImpl implements Collaboration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_CLOSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsClosed()
	 * @generated
	 * @ordered
	 */
	protected Object isClosed = IS_CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoreographyRef() <em>Choreography Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Choreography> choreographyRef;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

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
	 * The cached value of the '{@link #getMessageFlowAssociations() <em>Message Flow Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlowAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageFlowAssociation> messageFlowAssociations;

	/**
	 * The cached value of the '{@link #getConversationAssociations() <em>Conversation Associations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationAssociations()
	 * @generated
	 * @ordered
	 */
	protected ConversationAssociation conversationAssociations;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getMessageFlows() <em>Message Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageFlow> messageFlows;

	/**
	 * The cached value of the '{@link #getCorrelationKeys() <em>Correlation Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationKey> correlationKeys;

	/**
	 * The cached value of the '{@link #getConversations() <em>Conversations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversationNode> conversations;

	/**
	 * The cached value of the '{@link #getConversationLinks() <em>Conversation Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ConversationLink> conversationLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getCollaboration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.COLLABORATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsClosed() {
		return isClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(Object newIsClosed) {
		Object oldIsClosed = isClosed;
		isClosed = newIsClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.COLLABORATION__IS_CLOSED, oldIsClosed, isClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choreography> getChoreographyRef() {
		if (choreographyRef == null) {
			choreographyRef = new EObjectResolvingEList<Choreography>(Choreography.class, this, BPMN20Package.COLLABORATION__CHOREOGRAPHY_REF);
		}
		return choreographyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, BPMN20Package.COLLABORATION__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantAssociation> getParticipantAssociations() {
		if (participantAssociations == null) {
			participantAssociations = new EObjectContainmentEList<ParticipantAssociation>(ParticipantAssociation.class, this, BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS);
		}
		return participantAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageFlowAssociation> getMessageFlowAssociations() {
		if (messageFlowAssociations == null) {
			messageFlowAssociations = new EObjectContainmentEList<MessageFlowAssociation>(MessageFlowAssociation.class, this, BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS);
		}
		return messageFlowAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation getConversationAssociations() {
		return conversationAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationAssociations(ConversationAssociation newConversationAssociations, NotificationChain msgs) {
		ConversationAssociation oldConversationAssociations = conversationAssociations;
		conversationAssociations = newConversationAssociations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS, oldConversationAssociations, newConversationAssociations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationAssociations(ConversationAssociation newConversationAssociations) {
		if (newConversationAssociations != conversationAssociations) {
			NotificationChain msgs = null;
			if (conversationAssociations != null)
				msgs = ((InternalEObject)conversationAssociations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS, null, msgs);
			if (newConversationAssociations != null)
				msgs = ((InternalEObject)newConversationAssociations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS, null, msgs);
			msgs = basicSetConversationAssociations(newConversationAssociations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS, newConversationAssociations, newConversationAssociations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectContainmentEList<Participant>(Participant.class, this, BPMN20Package.COLLABORATION__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageFlow> getMessageFlows() {
		if (messageFlows == null) {
			messageFlows = new EObjectContainmentEList<MessageFlow>(MessageFlow.class, this, BPMN20Package.COLLABORATION__MESSAGE_FLOWS);
		}
		return messageFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationKey> getCorrelationKeys() {
		if (correlationKeys == null) {
			correlationKeys = new EObjectContainmentEList<CorrelationKey>(CorrelationKey.class, this, BPMN20Package.COLLABORATION__CORRELATION_KEYS);
		}
		return correlationKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationNode> getConversations() {
		if (conversations == null) {
			conversations = new EObjectContainmentEList<ConversationNode>(ConversationNode.class, this, BPMN20Package.COLLABORATION__CONVERSATIONS);
		}
		return conversations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationLink> getConversationLinks() {
		if (conversationLinks == null) {
			conversationLinks = new EObjectContainmentEList<ConversationLink>(ConversationLink.class, this, BPMN20Package.COLLABORATION__CONVERSATION_LINKS);
		}
		return conversationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.COLLABORATION__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
				return ((InternalEList<?>)getParticipantAssociations()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
				return ((InternalEList<?>)getMessageFlowAssociations()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
				return basicSetConversationAssociations(null, msgs);
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
				return ((InternalEList<?>)getMessageFlows()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
				return ((InternalEList<?>)getCorrelationKeys()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
				return ((InternalEList<?>)getConversations()).basicRemove(otherEnd, msgs);
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
				return ((InternalEList<?>)getConversationLinks()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.COLLABORATION__NAME:
				return getName();
			case BPMN20Package.COLLABORATION__IS_CLOSED:
				return getIsClosed();
			case BPMN20Package.COLLABORATION__CHOREOGRAPHY_REF:
				return getChoreographyRef();
			case BPMN20Package.COLLABORATION__ARTIFACTS:
				return getArtifacts();
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
				return getParticipantAssociations();
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
				return getMessageFlowAssociations();
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
				return getConversationAssociations();
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
				return getParticipants();
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
				return getMessageFlows();
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
				return getCorrelationKeys();
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
				return getConversations();
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
				return getConversationLinks();
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
			case BPMN20Package.COLLABORATION__NAME:
				setName(newValue);
				return;
			case BPMN20Package.COLLABORATION__IS_CLOSED:
				setIsClosed(newValue);
				return;
			case BPMN20Package.COLLABORATION__CHOREOGRAPHY_REF:
				getChoreographyRef().clear();
				getChoreographyRef().addAll((Collection<? extends Choreography>)newValue);
				return;
			case BPMN20Package.COLLABORATION__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>)newValue);
				return;
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
				getMessageFlowAssociations().clear();
				getMessageFlowAssociations().addAll((Collection<? extends MessageFlowAssociation>)newValue);
				return;
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
				setConversationAssociations((ConversationAssociation)newValue);
				return;
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
				getMessageFlows().clear();
				getMessageFlows().addAll((Collection<? extends MessageFlow>)newValue);
				return;
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
				getCorrelationKeys().clear();
				getCorrelationKeys().addAll((Collection<? extends CorrelationKey>)newValue);
				return;
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
				getConversations().clear();
				getConversations().addAll((Collection<? extends ConversationNode>)newValue);
				return;
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
				getConversationLinks().clear();
				getConversationLinks().addAll((Collection<? extends ConversationLink>)newValue);
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
			case BPMN20Package.COLLABORATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.COLLABORATION__IS_CLOSED:
				setIsClosed(IS_CLOSED_EDEFAULT);
				return;
			case BPMN20Package.COLLABORATION__CHOREOGRAPHY_REF:
				getChoreographyRef().clear();
				return;
			case BPMN20Package.COLLABORATION__ARTIFACTS:
				getArtifacts().clear();
				return;
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				return;
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
				getMessageFlowAssociations().clear();
				return;
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
				setConversationAssociations((ConversationAssociation)null);
				return;
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
				getParticipants().clear();
				return;
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
				getMessageFlows().clear();
				return;
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
				getCorrelationKeys().clear();
				return;
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
				getConversations().clear();
				return;
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
				getConversationLinks().clear();
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
			case BPMN20Package.COLLABORATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.COLLABORATION__IS_CLOSED:
				return IS_CLOSED_EDEFAULT == null ? isClosed != null : !IS_CLOSED_EDEFAULT.equals(isClosed);
			case BPMN20Package.COLLABORATION__CHOREOGRAPHY_REF:
				return choreographyRef != null && !choreographyRef.isEmpty();
			case BPMN20Package.COLLABORATION__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
				return participantAssociations != null && !participantAssociations.isEmpty();
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
				return messageFlowAssociations != null && !messageFlowAssociations.isEmpty();
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
				return conversationAssociations != null;
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
				return messageFlows != null && !messageFlows.isEmpty();
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
				return correlationKeys != null && !correlationKeys.isEmpty();
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
				return conversations != null && !conversations.isEmpty();
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
				return conversationLinks != null && !conversationLinks.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isClosed: ");
		result.append(isClosed);
		result.append(')');
		return result.toString();
	}

} //CollaborationImpl
