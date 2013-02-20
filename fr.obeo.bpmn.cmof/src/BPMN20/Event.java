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
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Event#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends FlowNode, InteractionNode {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getEvent_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

} // Event
