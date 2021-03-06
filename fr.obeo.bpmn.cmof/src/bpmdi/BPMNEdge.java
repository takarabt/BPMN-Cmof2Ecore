/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmdi;

import bpmn2.BaseElement;

import di.DiagramElement;
import di.LabeledEdge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmdi.BPMNEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link bpmdi.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link bpmdi.BPMNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link bpmdi.BPMNEdge#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link bpmdi.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmdi.BpmdiPackage#getBPMNEdge()
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
	 * @see bpmdi.BpmdiPackage#getBPMNEdge_Label()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BPMNLabel getLabel();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNEdge#getLabel <em>Label</em>}' containment reference.
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
	 * @see bpmdi.BpmdiPackage#getBPMNEdge_BpmnElement()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}' reference.
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
	 * @see bpmdi.BpmdiPackage#getBPMNEdge_SourceElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getSourceElement();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNEdge#getSourceElement <em>Source Element</em>}' reference.
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
	 * @see bpmdi.BpmdiPackage#getBPMNEdge_TargetElement()
	 * @model ordered="false"
	 * @generated
	 */
	DiagramElement getTargetElement();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNEdge#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Message Visible Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmdi.MessageVisibleKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Visible Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Visible Kind</em>' attribute.
	 * @see bpmdi.MessageVisibleKind
	 * @see #setMessageVisibleKind(MessageVisibleKind)
	 * @see bpmdi.BpmdiPackage#getBPMNEdge_MessageVisibleKind()
	 * @model ordered="false"
	 * @generated
	 */
	MessageVisibleKind getMessageVisibleKind();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Visible Kind</em>' attribute.
	 * @see bpmdi.MessageVisibleKind
	 * @see #getMessageVisibleKind()
	 * @generated
	 */
	void setMessageVisibleKind(MessageVisibleKind value);

} // BPMNEdge
