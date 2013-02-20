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
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Lane#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.Lane#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link BPMN20.Lane#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link BPMN20.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link BPMN20.Lane#getPartitionElement <em>Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getLane()
 * @model
 * @generated
 */
public interface Lane extends BaseElement {
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
	 * @see BPMN20.BPMN20Package#getLane_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Lane Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #setChildLaneSet(LaneSet)
	 * @see BPMN20.BPMN20Package#getLane_ChildLaneSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LaneSet getChildLaneSet();

	/**
	 * Sets the value of the '{@link BPMN20.Lane#getChildLaneSet <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #getChildLaneSet()
	 * @generated
	 */
	void setChildLaneSet(LaneSet value);

	/**
	 * Returns the value of the '<em><b>Partition Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Element Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element Ref</em>' reference.
	 * @see #setPartitionElementRef(BaseElement)
	 * @see BPMN20.BPMN20Package#getLane_PartitionElementRef()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElementRef();

	/**
	 * Sets the value of the '{@link BPMN20.Lane#getPartitionElementRef <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element Ref</em>' reference.
	 * @see #getPartitionElementRef()
	 * @generated
	 */
	void setPartitionElementRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Flow Node Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.FlowNode}.
	 * It is bidirectional and its opposite is '{@link BPMN20.FlowNode#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Node Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Node Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getLane_FlowNodeRefs()
	 * @see BPMN20.FlowNode#getLanes
	 * @model opposite="lanes" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowNode> getFlowNodeRefs();

	/**
	 * Returns the value of the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element</em>' containment reference.
	 * @see #setPartitionElement(BaseElement)
	 * @see BPMN20.BPMN20Package#getLane_PartitionElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElement();

	/**
	 * Sets the value of the '{@link BPMN20.Lane#getPartitionElement <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element</em>' containment reference.
	 * @see #getPartitionElement()
	 * @generated
	 */
	void setPartitionElement(BaseElement value);

} // Lane
