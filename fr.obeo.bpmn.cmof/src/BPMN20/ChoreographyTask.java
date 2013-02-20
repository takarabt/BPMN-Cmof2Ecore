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
 * A representation of the model object '<em><b>Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getChoreographyTask()
 * @model
 * @generated
 */
public interface ChoreographyTask extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' reference list.
	 * @see BPMN20.BPMN20Package#getChoreographyTask_MessageFlowRef()
	 * @model required="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlowRef();

} // ChoreographyTask
