/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Assignment#getFrom <em>From</em>}</li>
 *   <li>{@link BPMN20.Assignment#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends BaseElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Expression)
	 * @see BPMN20.BPMN20Package#getAssignment_From()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getFrom();

	/**
	 * Sets the value of the '{@link BPMN20.Assignment#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Expression value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Expression)
	 * @see BPMN20.BPMN20Package#getAssignment_To()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getTo();

	/**
	 * Sets the value of the '{@link BPMN20.Assignment#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Expression value);

} // Assignment
