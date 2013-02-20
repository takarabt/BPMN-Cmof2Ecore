/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CompensateEventDefinition#getWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link BPMN20.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCompensateEventDefinition()
 * @model
 * @generated
 */
public interface CompensateEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait For Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For Completion</em>' attribute.
	 * @see #setWaitForCompletion(Object)
	 * @see BPMN20.BPMN20Package#getCompensateEventDefinition_WaitForCompletion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getWaitForCompletion();

	/**
	 * Sets the value of the '{@link BPMN20.CompensateEventDefinition#getWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #getWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(Object value);

	/**
	 * Returns the value of the '<em><b>Activity Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Ref</em>' reference.
	 * @see #setActivityRef(Activity)
	 * @see BPMN20.BPMN20Package#getCompensateEventDefinition_ActivityRef()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getActivityRef();

	/**
	 * Sets the value of the '{@link BPMN20.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Ref</em>' reference.
	 * @see #getActivityRef()
	 * @generated
	 */
	void setActivityRef(Activity value);

} // CompensateEventDefinition
