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
 * A representation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ChoreographyActivity#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link BPMN20.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link BPMN20.ChoreographyActivity#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link BPMN20.ChoreographyActivity#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getChoreographyActivity()
 * @model abstract="true"
 * @generated
 */
public interface ChoreographyActivity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Participant Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getChoreographyActivity_ParticipantRefs()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipantRefs();

	/**
	 * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiating Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #setInitiatingParticipantRef(Participant)
	 * @see BPMN20.BPMN20Package#getChoreographyActivity_InitiatingParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInitiatingParticipantRef();

	/**
	 * Sets the value of the '{@link BPMN20.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 */
	void setInitiatingParticipantRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Keys</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getChoreographyActivity_CorrelationKeys()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationKey> getCorrelationKeys();

	/**
	 * Returns the value of the '<em><b>Loop Type</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link BPMN20.ChoreographyLoopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Type</em>' attribute.
	 * @see BPMN20.ChoreographyLoopType
	 * @see #setLoopType(ChoreographyLoopType)
	 * @see BPMN20.BPMN20Package#getChoreographyActivity_LoopType()
	 * @model default="None" required="true" ordered="false"
	 * @generated
	 */
	ChoreographyLoopType getLoopType();

	/**
	 * Sets the value of the '{@link BPMN20.ChoreographyActivity#getLoopType <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Type</em>' attribute.
	 * @see BPMN20.ChoreographyLoopType
	 * @see #getLoopType()
	 * @generated
	 */
	void setLoopType(ChoreographyLoopType value);

} // ChoreographyActivity
