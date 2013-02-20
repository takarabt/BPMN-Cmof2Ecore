/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getSignalEventDefinition()
 * @model
 * @generated
 */
public interface SignalEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Signal Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Ref</em>' reference.
	 * @see #setSignalRef(Signal)
	 * @see BPMN20.BPMN20Package#getSignalEventDefinition_SignalRef()
	 * @model ordered="false"
	 * @generated
	 */
	Signal getSignalRef();

	/**
	 * Sets the value of the '{@link BPMN20.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Ref</em>' reference.
	 * @see #getSignalRef()
	 * @generated
	 */
	void setSignalRef(Signal value);

} // SignalEventDefinition
