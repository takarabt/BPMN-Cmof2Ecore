/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI;

import BPMN20.BaseElement;

import DI.LabeledShape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMNDI.BPMNShape#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#isIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#isIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getLabel <em>Label</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#isIsMessageVisible <em>Is Message Visible</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getParticipantBandKind <em>Participant Band Kind</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getChoreographyActivityShape <em>Choreography Activity Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMNDI.BPMNDIPackage#getBPMNShape()
 * @model
 * @generated
 */
public interface BPMNShape extends LabeledShape {
	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' reference.
	 * @see #setBpmnElement(BaseElement)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_BpmnElement()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Is Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Horizontal</em>' attribute.
	 * @see #setIsHorizontal(boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsHorizontal()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsHorizontal();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#isIsHorizontal <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Horizontal</em>' attribute.
	 * @see #isIsHorizontal()
	 * @generated
	 */
	void setIsHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Expanded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expanded</em>' attribute.
	 * @see #setIsExpanded(boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsExpanded()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsExpanded();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#isIsExpanded <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expanded</em>' attribute.
	 * @see #isIsExpanded()
	 * @generated
	 */
	void setIsExpanded(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Marker Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Marker Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Marker Visible</em>' attribute.
	 * @see #setIsMarkerVisible(boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsMarkerVisible()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsMarkerVisible();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#isIsMarkerVisible <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Marker Visible</em>' attribute.
	 * @see #isIsMarkerVisible()
	 * @generated
	 */
	void setIsMarkerVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(BPMNLabel)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_Label()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BPMNLabel getLabel();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BPMNLabel value);

	/**
	 * Returns the value of the '<em><b>Is Message Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Message Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Message Visible</em>' attribute.
	 * @see #setIsMessageVisible(boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsMessageVisible()
	 * @model ordered="false"
	 * @generated
	 */
	boolean isIsMessageVisible();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#isIsMessageVisible <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Message Visible</em>' attribute.
	 * @see #isIsMessageVisible()
	 * @generated
	 */
	void setIsMessageVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Participant Band Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMNDI.ParticipantBandKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Band Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Band Kind</em>' attribute.
	 * @see BPMNDI.ParticipantBandKind
	 * @see #setParticipantBandKind(ParticipantBandKind)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_ParticipantBandKind()
	 * @model ordered="false"
	 * @generated
	 */
	ParticipantBandKind getParticipantBandKind();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getParticipantBandKind <em>Participant Band Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Band Kind</em>' attribute.
	 * @see BPMNDI.ParticipantBandKind
	 * @see #getParticipantBandKind()
	 * @generated
	 */
	void setParticipantBandKind(ParticipantBandKind value);

	/**
	 * Returns the value of the '<em><b>Choreography Activity Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choreography Activity Shape</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choreography Activity Shape</em>' reference.
	 * @see #setChoreographyActivityShape(BPMNShape)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_ChoreographyActivityShape()
	 * @model ordered="false"
	 * @generated
	 */
	BPMNShape getChoreographyActivityShape();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getChoreographyActivityShape <em>Choreography Activity Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choreography Activity Shape</em>' reference.
	 * @see #getChoreographyActivityShape()
	 * @generated
	 */
	void setChoreographyActivityShape(BPMNShape value);

} // BPMNShape
