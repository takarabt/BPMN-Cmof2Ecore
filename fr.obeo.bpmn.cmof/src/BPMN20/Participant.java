/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Participant#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.Participant#getInterfaceRefs <em>Interface Refs</em>}</li>
 *   <li>{@link BPMN20.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link BPMN20.Participant#getEndPointRefs <em>End Point Refs</em>}</li>
 *   <li>{@link BPMN20.Participant#getProcessRef <em>Process Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends BaseElement, InteractionNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see BPMN20.BPMN20Package#getParticipant_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.Participant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Interface Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getParticipant_InterfaceRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Interface> getInterfaceRefs();

	/**
	 * Returns the value of the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #setParticipantMultiplicity(ParticipantMultiplicity)
	 * @see BPMN20.BPMN20Package#getParticipant_ParticipantMultiplicity()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ParticipantMultiplicity getParticipantMultiplicity();

	/**
	 * Sets the value of the '{@link BPMN20.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Multiplicity</em>' containment reference.
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	void setParticipantMultiplicity(ParticipantMultiplicity value);

	/**
	 * Returns the value of the '<em><b>End Point Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.EndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getParticipant_EndPointRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EndPoint> getEndPointRefs();

	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(BPMN20.Process)
	 * @see BPMN20.BPMN20Package#getParticipant_ProcessRef()
	 * @model ordered="false"
	 * @generated
	 */
	BPMN20.Process getProcessRef();

	/**
	 * Sets the value of the '{@link BPMN20.Participant#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(BPMN20.Process value);

} // Participant
