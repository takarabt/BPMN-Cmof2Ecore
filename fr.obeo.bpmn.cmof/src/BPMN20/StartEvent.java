/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.StartEvent#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getStartEvent()
 * @model
 * @generated
 */
public interface StartEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Is Interrupting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interrupting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interrupting</em>' attribute.
	 * @see #setIsInterrupting(boolean)
	 * @see BPMN20.BPMN20Package#getStartEvent_IsInterrupting()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsInterrupting();

	/**
	 * Sets the value of the '{@link BPMN20.StartEvent#isIsInterrupting <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interrupting</em>' attribute.
	 * @see #isIsInterrupting()
	 * @generated
	 */
	void setIsInterrupting(boolean value);

} // StartEvent
