/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getErrorEventDefinition()
 * @model
 * @generated
 */
public interface ErrorEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Ref</em>' reference.
	 * @see #setErrorRef(BPMN20.Error)
	 * @see BPMN20.BPMN20Package#getErrorEventDefinition_ErrorRef()
	 * @model ordered="false"
	 * @generated
	 */
	BPMN20.Error getErrorRef();

	/**
	 * Sets the value of the '{@link BPMN20.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Ref</em>' reference.
	 * @see #getErrorRef()
	 * @generated
	 */
	void setErrorRef(BPMN20.Error value);

} // ErrorEventDefinition
