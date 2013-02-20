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
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link BPMN20.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getFlowElementsContainer_FlowElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

	/**
	 * Returns the value of the '<em><b>Lane Sets</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.LaneSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane Sets</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getFlowElementsContainer_LaneSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LaneSet> getLaneSets();

} // FlowElementsContainer
