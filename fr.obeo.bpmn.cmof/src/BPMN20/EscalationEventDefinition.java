/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getEscalationEventDefinition()
 * @model
 * @generated
 */
public interface EscalationEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Escalation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escalation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Ref</em>' reference.
	 * @see #setEscalationRef(Escalation)
	 * @see BPMN20.BPMN20Package#getEscalationEventDefinition_EscalationRef()
	 * @model ordered="false"
	 * @generated
	 */
	Escalation getEscalationRef();

	/**
	 * Sets the value of the '{@link BPMN20.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Ref</em>' reference.
	 * @see #getEscalationRef()
	 * @generated
	 */
	void setEscalationRef(Escalation value);

} // EscalationEventDefinition
