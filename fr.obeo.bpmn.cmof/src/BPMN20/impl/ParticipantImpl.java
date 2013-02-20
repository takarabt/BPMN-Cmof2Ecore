/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.ConversationLink;
import BPMN20.EndPoint;
import BPMN20.InteractionNode;
import BPMN20.Interface;
import BPMN20.Participant;
import BPMN20.ParticipantMultiplicity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getInterfaceRefs <em>Interface Refs</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getEndPointRefs <em>End Point Refs</em>}</li>
 *   <li>{@link BPMN20.impl.ParticipantImpl#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends BaseElementImpl implements Participant {
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
	 * The cached value of the '{@link #getInterfaceRefs() <em>Interface Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaceRefs;

	/**
	 * The cached value of the '{@link #getParticipantMultiplicity() <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected ParticipantMultiplicity participantMultiplicity;

	/**
	 * The cached value of the '{@link #getEndPointRefs() <em>End Point Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPoint> endPointRefs;

	/**
	 * The cached value of the '{@link #getProcessRef() <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRef()
	 * @generated
	 * @ordered
	 */
	protected BPMN20.Process processRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationLink> getIncomingConversationLinks() {
		// TODO: implement this method to return the 'Incoming Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConversationLink> getOutgoingConversationLinks() {
		// TODO: implement this method to return the 'Outgoing Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.PARTICIPANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaceRefs() {
		if (interfaceRefs == null) {
			interfaceRefs = new EObjectResolvingEList<Interface>(Interface.class, this, BPMN20Package.PARTICIPANT__INTERFACE_REFS);
		}
		return interfaceRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity getParticipantMultiplicity() {
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity, NotificationChain msgs) {
		ParticipantMultiplicity oldParticipantMultiplicity = participantMultiplicity;
		participantMultiplicity = newParticipantMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY, oldParticipantMultiplicity, newParticipantMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantMultiplicity(ParticipantMultiplicity newParticipantMultiplicity) {
		if (newParticipantMultiplicity != participantMultiplicity) {
			NotificationChain msgs = null;
			if (participantMultiplicity != null)
				msgs = ((InternalEObject)participantMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY, null, msgs);
			if (newParticipantMultiplicity != null)
				msgs = ((InternalEObject)newParticipantMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY, null, msgs);
			msgs = basicSetParticipantMultiplicity(newParticipantMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY, newParticipantMultiplicity, newParticipantMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPoint> getEndPointRefs() {
		if (endPointRefs == null) {
			endPointRefs = new EObjectResolvingEList<EndPoint>(EndPoint.class, this, BPMN20Package.PARTICIPANT__END_POINT_REFS);
		}
		return endPointRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Process getProcessRef() {
		if (processRef != null && processRef.eIsProxy()) {
			InternalEObject oldProcessRef = (InternalEObject)processRef;
			processRef = (BPMN20.Process)eResolveProxy(oldProcessRef);
			if (processRef != oldProcessRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.PARTICIPANT__PROCESS_REF, oldProcessRef, processRef));
			}
		}
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Process basicGetProcessRef() {
		return processRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRef(BPMN20.Process newProcessRef) {
		BPMN20.Process oldProcessRef = processRef;
		processRef = newProcessRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.PARTICIPANT__PROCESS_REF, oldProcessRef, processRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return basicSetParticipantMultiplicity(null, msgs);
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
			case BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
				return getIncomingConversationLinks();
			case BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
				return getOutgoingConversationLinks();
			case BPMN20Package.PARTICIPANT__NAME:
				return getName();
			case BPMN20Package.PARTICIPANT__INTERFACE_REFS:
				return getInterfaceRefs();
			case BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return getParticipantMultiplicity();
			case BPMN20Package.PARTICIPANT__END_POINT_REFS:
				return getEndPointRefs();
			case BPMN20Package.PARTICIPANT__PROCESS_REF:
				if (resolve) return getProcessRef();
				return basicGetProcessRef();
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
			case BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
				getIncomingConversationLinks().clear();
				getIncomingConversationLinks().addAll((Collection<? extends ConversationLink>)newValue);
				return;
			case BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
				getOutgoingConversationLinks().clear();
				getOutgoingConversationLinks().addAll((Collection<? extends ConversationLink>)newValue);
				return;
			case BPMN20Package.PARTICIPANT__NAME:
				setName(newValue);
				return;
			case BPMN20Package.PARTICIPANT__INTERFACE_REFS:
				getInterfaceRefs().clear();
				getInterfaceRefs().addAll((Collection<? extends Interface>)newValue);
				return;
			case BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((ParticipantMultiplicity)newValue);
				return;
			case BPMN20Package.PARTICIPANT__END_POINT_REFS:
				getEndPointRefs().clear();
				getEndPointRefs().addAll((Collection<? extends EndPoint>)newValue);
				return;
			case BPMN20Package.PARTICIPANT__PROCESS_REF:
				setProcessRef((BPMN20.Process)newValue);
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
			case BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
				getIncomingConversationLinks().clear();
				return;
			case BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
				getOutgoingConversationLinks().clear();
				return;
			case BPMN20Package.PARTICIPANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.PARTICIPANT__INTERFACE_REFS:
				getInterfaceRefs().clear();
				return;
			case BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((ParticipantMultiplicity)null);
				return;
			case BPMN20Package.PARTICIPANT__END_POINT_REFS:
				getEndPointRefs().clear();
				return;
			case BPMN20Package.PARTICIPANT__PROCESS_REF:
				setProcessRef((BPMN20.Process)null);
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
			case BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS:
				return !getIncomingConversationLinks().isEmpty();
			case BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS:
				return !getOutgoingConversationLinks().isEmpty();
			case BPMN20Package.PARTICIPANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.PARTICIPANT__INTERFACE_REFS:
				return interfaceRefs != null && !interfaceRefs.isEmpty();
			case BPMN20Package.PARTICIPANT__PARTICIPANT_MULTIPLICITY:
				return participantMultiplicity != null;
			case BPMN20Package.PARTICIPANT__END_POINT_REFS:
				return endPointRefs != null && !endPointRefs.isEmpty();
			case BPMN20Package.PARTICIPANT__PROCESS_REF:
				return processRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
				case BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS: return BPMN20Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				case BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS: return BPMN20Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
				case BPMN20Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS: return BPMN20Package.PARTICIPANT__INCOMING_CONVERSATION_LINKS;
				case BPMN20Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS: return BPMN20Package.PARTICIPANT__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
