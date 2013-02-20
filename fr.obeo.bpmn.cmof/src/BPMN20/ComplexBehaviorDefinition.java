/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ComplexBehaviorDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link BPMN20.ComplexBehaviorDefinition#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getComplexBehaviorDefinition()
 * @model
 * @generated
 */
public interface ComplexBehaviorDefinition extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(FormalExpression)
	 * @see BPMN20.BPMN20Package#getComplexBehaviorDefinition_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getCondition();

	/**
	 * Sets the value of the '{@link BPMN20.ComplexBehaviorDefinition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(ImplicitThrowEvent)
	 * @see BPMN20.BPMN20Package#getComplexBehaviorDefinition_Event()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ImplicitThrowEvent getEvent();

	/**
	 * Sets the value of the '{@link BPMN20.ComplexBehaviorDefinition#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(ImplicitThrowEvent value);

} // ComplexBehaviorDefinition
