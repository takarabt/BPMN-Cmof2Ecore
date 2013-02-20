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
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link BPMN20.FlowNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link BPMN20.FlowNode#getLanes <em>Lanes</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link BPMN20.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see BPMN20.BPMN20Package#getFlowNode_Outgoing()
	 * @see BPMN20.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link BPMN20.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see BPMN20.BPMN20Package#getFlowNode_Incoming()
	 * @see BPMN20.SequenceFlow#getTargetRef
	 * @model opposite="targetRef" ordered="false"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.Lane}.
	 * It is bidirectional and its opposite is '{@link BPMN20.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' reference list.
	 * @see BPMN20.BPMN20Package#getFlowNode_Lanes()
	 * @see BPMN20.Lane#getFlowNodeRefs
	 * @model opposite="flowNodeRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Lane> getLanes();

} // FlowNode
