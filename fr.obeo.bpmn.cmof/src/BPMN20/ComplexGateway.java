/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ComplexGateway#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link BPMN20.ComplexGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getComplexGateway()
 * @model
 * @generated
 */
public interface ComplexGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Activation Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Condition</em>' containment reference.
	 * @see #setActivationCondition(Expression)
	 * @see BPMN20.BPMN20Package#getComplexGateway_ActivationCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getActivationCondition();

	/**
	 * Sets the value of the '{@link BPMN20.ComplexGateway#getActivationCondition <em>Activation Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Condition</em>' containment reference.
	 * @see #getActivationCondition()
	 * @generated
	 */
	void setActivationCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SequenceFlow)
	 * @see BPMN20.BPMN20Package#getComplexGateway_Default()
	 * @model ordered="false"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link BPMN20.ComplexGateway#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

} // ComplexGateway
