/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Flow Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}</li>
 *   <li>{@link bpmn2.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getMessageFlowAssociation()
 * @model
 * @generated
 */
public interface MessageFlowAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Message Flow Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Message Flow Ref</em>' reference.
	 * @see #setInnerMessageFlowRef(MessageFlow)
	 * @see bpmn2.Bpmn2Package#getMessageFlowAssociation_InnerMessageFlowRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageFlow getInnerMessageFlowRef();

	/**
	 * Sets the value of the '{@link bpmn2.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Message Flow Ref</em>' reference.
	 * @see #getInnerMessageFlowRef()
	 * @generated
	 */
	void setInnerMessageFlowRef(MessageFlow value);

	/**
	 * Returns the value of the '<em><b>Outer Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Message Flow Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Message Flow Ref</em>' reference.
	 * @see #setOuterMessageFlowRef(MessageFlow)
	 * @see bpmn2.Bpmn2Package#getMessageFlowAssociation_OuterMessageFlowRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageFlow getOuterMessageFlowRef();

	/**
	 * Sets the value of the '{@link bpmn2.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Message Flow Ref</em>' reference.
	 * @see #getOuterMessageFlowRef()
	 * @generated
	 */
	void setOuterMessageFlowRef(MessageFlow value);

} // MessageFlowAssociation
