/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ConversationNode#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.ConversationNode#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link BPMN20.ConversationNode#getMessageFlowRefs <em>Message Flow Refs</em>}</li>
 *   <li>{@link BPMN20.ConversationNode#getCorrelationKeys <em>Correlation Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getConversationNode()
 * @model abstract="true"
 * @generated
 */
public interface ConversationNode extends BaseElement, InteractionNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see BPMN20.BPMN20Package#getConversationNode_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.ConversationNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Participant Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getConversationNode_ParticipantRefs()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipantRefs();

	/**
	 * Returns the value of the '<em><b>Message Flow Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getConversationNode_MessageFlowRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlowRefs();

	/**
	 * Returns the value of the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Keys</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getConversationNode_CorrelationKeys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationKey> getCorrelationKeys();

} // ConversationNode
