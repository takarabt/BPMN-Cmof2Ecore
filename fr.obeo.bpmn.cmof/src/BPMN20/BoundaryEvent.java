/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}</li>
 *   <li>{@link BPMN20.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getBoundaryEvent()
 * @model
 * @generated
 */
public interface BoundaryEvent extends CatchEvent {
	/**
	 * Returns the value of the '<em><b>Cancel Activity</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Activity</em>' attribute.
	 * @see #setCancelActivity(boolean)
	 * @see BPMN20.BPMN20Package#getBoundaryEvent_CancelActivity()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isCancelActivity();

	/**
	 * Sets the value of the '{@link BPMN20.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Activity</em>' attribute.
	 * @see #isCancelActivity()
	 * @generated
	 */
	void setCancelActivity(boolean value);

	/**
	 * Returns the value of the '<em><b>Attached To Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BPMN20.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached To Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached To Ref</em>' reference.
	 * @see #setAttachedToRef(Activity)
	 * @see BPMN20.BPMN20Package#getBoundaryEvent_AttachedToRef()
	 * @see BPMN20.Activity#getBoundaryEventRefs
	 * @model opposite="boundaryEventRefs" required="true" ordered="false"
	 * @generated
	 */
	Activity getAttachedToRef();

	/**
	 * Sets the value of the '{@link BPMN20.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached To Ref</em>' reference.
	 * @see #getAttachedToRef()
	 * @generated
	 */
	void setAttachedToRef(Activity value);

} // BoundaryEvent
