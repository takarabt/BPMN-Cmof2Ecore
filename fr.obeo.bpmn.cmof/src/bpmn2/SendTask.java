/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.SendTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link bpmn2.SendTask#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link bpmn2.SendTask#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getSendTask()
 * @model
 * @generated
 */
public interface SendTask extends Task {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see bpmn2.Bpmn2Package#getSendTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link bpmn2.SendTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' reference.
	 * @see #setOperationRef(Operation)
	 * @see bpmn2.Bpmn2Package#getSendTask_OperationRef()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getOperationRef();

	/**
	 * Sets the value of the '{@link bpmn2.SendTask#getOperationRef <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' reference.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(Operation value);

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' reference.
	 * @see #setMessageRef(Message)
	 * @see bpmn2.Bpmn2Package#getSendTask_MessageRef()
	 * @model ordered="false"
	 * @generated
	 */
	Message getMessageRef();

	/**
	 * Sets the value of the '{@link bpmn2.SendTask#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' reference.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(Message value);

} // SendTask
