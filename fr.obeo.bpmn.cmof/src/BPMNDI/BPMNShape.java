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
 *   <li>{@link BPMNDI.BPMNShape#getIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getLabel <em>Label</em>}</li>
 *   <li>{@link BPMNDI.BPMNShape#getIsMessageVisible <em>Is Message Visible</em>}</li>
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
	 * @see #setIsHorizontal(Boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsHorizontal()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsHorizontal();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getIsHorizontal <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Horizontal</em>' attribute.
	 * @see #getIsHorizontal()
	 * @generated
	 */
	void setIsHorizontal(Object value);

	/**
	 * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Expanded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expanded</em>' attribute.
	 * @see #setIsExpanded(Boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsExpanded()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsExpanded();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getIsExpanded <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expanded</em>' attribute.
	 * @see #getIsExpanded()
	 * @generated
	 */
	void setIsExpanded(Object value);

	/**
	 * Returns the value of the '<em><b>Is Marker Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Marker Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Marker Visible</em>' attribute.
	 * @see #setIsMarkerVisible(Boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsMarkerVisible()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsMarkerVisible();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getIsMarkerVisible <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Marker Visible</em>' attribute.
	 * @see #getIsMarkerVisible()
	 * @generated
	 */
	void setIsMarkerVisible(Object value);

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
	 * @see #setIsMessageVisible(Boolean)
	 * @see BPMNDI.BPMNDIPackage#getBPMNShape_IsMessageVisible()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsMessageVisible();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNShape#getIsMessageVisible <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Message Visible</em>' attribute.
	 * @see #getIsMessageVisible()
	 * @generated
	 */
	void setIsMessageVisible(Object value);

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
