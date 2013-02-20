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
 * A representation of the model object '<em><b>Sub Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.SubConversation#getConversationNodes <em>Conversation Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getSubConversation()
 * @model
 * @generated
 */
public interface SubConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>Conversation Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.ConversationNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Nodes</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getSubConversation_ConversationNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConversationNode> getConversationNodes();

} // SubConversation
