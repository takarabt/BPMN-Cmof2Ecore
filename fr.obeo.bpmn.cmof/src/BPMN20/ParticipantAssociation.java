/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link BPMN20.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getParticipantAssociation()
 * @model
 * @generated
 */
public interface ParticipantAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #setInnerParticipantRef(Participant)
	 * @see BPMN20.BPMN20Package#getParticipantAssociation_InnerParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInnerParticipantRef();

	/**
	 * Sets the value of the '{@link BPMN20.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #getInnerParticipantRef()
	 * @generated
	 */
	void setInnerParticipantRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Outer Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #setOuterParticipantRef(Participant)
	 * @see BPMN20.BPMN20Package#getParticipantAssociation_OuterParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getOuterParticipantRef();

	/**
	 * Sets the value of the '{@link BPMN20.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #getOuterParticipantRef()
	 * @generated
	 */
	void setOuterParticipantRef(Participant value);

} // ParticipantAssociation
