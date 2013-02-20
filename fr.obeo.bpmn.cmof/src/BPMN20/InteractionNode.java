/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link BPMN20.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getInteractionNode()
 * @model abstract="true"
 * @generated
 */
public interface InteractionNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.ConversationLink}.
	 * It is bidirectional and its opposite is '{@link BPMN20.ConversationLink#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Conversation Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Conversation Links</em>' reference list.
	 * @see BPMN20.BPMN20Package#getInteractionNode_IncomingConversationLinks()
	 * @see BPMN20.ConversationLink#getTargetRef
	 * @model opposite="targetRef" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConversationLink> getIncomingConversationLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.ConversationLink}.
	 * It is bidirectional and its opposite is '{@link BPMN20.ConversationLink#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Conversation Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Conversation Links</em>' reference list.
	 * @see BPMN20.BPMN20Package#getInteractionNode_OutgoingConversationLinks()
	 * @see BPMN20.ConversationLink#getSourceRef
	 * @model opposite="sourceRef" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConversationLink> getOutgoingConversationLinks();

} // InteractionNode
