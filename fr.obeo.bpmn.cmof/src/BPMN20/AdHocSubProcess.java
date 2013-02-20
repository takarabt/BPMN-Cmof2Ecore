/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link BPMN20.AdHocSubProcess#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link BPMN20.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getAdHocSubProcess()
 * @model
 * @generated
 */
public interface AdHocSubProcess extends SubProcess {
	/**
	 * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Condition</em>' containment reference.
	 * @see #setCompletionCondition(Expression)
	 * @see BPMN20.BPMN20Package#getAdHocSubProcess_CompletionCondition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getCompletionCondition();

	/**
	 * Sets the value of the '{@link BPMN20.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.AdHocOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see BPMN20.AdHocOrdering
	 * @see #setOrdering(AdHocOrdering)
	 * @see BPMN20.BPMN20Package#getAdHocSubProcess_Ordering()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AdHocOrdering getOrdering();

	/**
	 * Sets the value of the '{@link BPMN20.AdHocSubProcess#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see BPMN20.AdHocOrdering
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(AdHocOrdering value);

	/**
	 * Returns the value of the '<em><b>Cancel Remaining Instances</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Remaining Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Remaining Instances</em>' attribute.
	 * @see #setCancelRemainingInstances(boolean)
	 * @see BPMN20.BPMN20Package#getAdHocSubProcess_CancelRemainingInstances()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isCancelRemainingInstances();

	/**
	 * Sets the value of the '{@link BPMN20.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Remaining Instances</em>' attribute.
	 * @see #isCancelRemainingInstances()
	 * @generated
	 */
	void setCancelRemainingInstances(boolean value);

} // AdHocSubProcess
