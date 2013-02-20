/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link BPMN20.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCorrelationPropertyRetrievalExpression()
 * @model
 * @generated
 */
public interface CorrelationPropertyRetrievalExpression extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Path</em>' containment reference.
	 * @see #setMessagePath(FormalExpression)
	 * @see BPMN20.BPMN20Package#getCorrelationPropertyRetrievalExpression_MessagePath()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getMessagePath();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Path</em>' containment reference.
	 * @see #getMessagePath()
	 * @generated
	 */
	void setMessagePath(FormalExpression value);

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
	 * @see BPMN20.BPMN20Package#getCorrelationPropertyRetrievalExpression_MessageRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Message getMessageRef();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' reference.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(Message value);

} // CorrelationPropertyRetrievalExpression
