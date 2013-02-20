/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link BPMN20.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getConversationAssociation()
 * @model
 * @generated
 */
public interface ConversationAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Conversation Node Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #setInnerConversationNodeRef(ConversationNode)
	 * @see BPMN20.BPMN20Package#getConversationAssociation_InnerConversationNodeRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConversationNode getInnerConversationNodeRef();

	/**
	 * Sets the value of the '{@link BPMN20.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 */
	void setInnerConversationNodeRef(ConversationNode value);

	/**
	 * Returns the value of the '<em><b>Outer Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Conversation Node Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #setOuterConversationNodeRef(ConversationNode)
	 * @see BPMN20.BPMN20Package#getConversationAssociation_OuterConversationNodeRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConversationNode getOuterConversationNodeRef();

	/**
	 * Sets the value of the '{@link BPMN20.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 */
	void setOuterConversationNodeRef(ConversationNode value);

} // ConversationAssociation
