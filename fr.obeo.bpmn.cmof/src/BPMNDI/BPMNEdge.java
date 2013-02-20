/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI;

import BPMN20.BaseElement;

import DI.DiagramElement;
import DI.LabeledEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMNDI.BPMNEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link BPMNDI.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link BPMNDI.BPMNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link BPMNDI.BPMNEdge#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link BPMNDI.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMNDI.BPMNDIPackage#getBPMNEdge()
 * @model
 * @generated
 */
public interface BPMNEdge extends LabeledEdge {
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
	 * @see BPMNDI.BPMNDIPackage#getBPMNEdge_Label()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BPMNLabel getLabel();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNEdge#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BPMNLabel value);

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
	 * @see BPMNDI.BPMNDIPackage#getBPMNEdge_BpmnElement()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(DiagramElement)
	 * @see BPMNDI.BPMNDIPackage#getBPMNEdge_SourceElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getSourceElement();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNEdge#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(DiagramElement)
	 * @see BPMNDI.BPMNDIPackage#getBPMNEdge_TargetElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getTargetElement();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNEdge#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Message Visible Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMNDI.MessageVisibleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Visible Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Visible Kind</em>' attribute.
	 * @see BPMNDI.MessageVisibleKind
	 * @see #setMessageVisibleKind(MessageVisibleKind)
	 * @see BPMNDI.BPMNDIPackage#getBPMNEdge_MessageVisibleKind()
	 * @model ordered="false"
	 * @generated
	 */
	MessageVisibleKind getMessageVisibleKind();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Visible Kind</em>' attribute.
	 * @see BPMNDI.MessageVisibleKind
	 * @see #getMessageVisibleKind()
	 * @generated
	 */
	void setMessageVisibleKind(MessageVisibleKind value);

} // BPMNEdge
