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
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link BPMN20.SubProcess#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends Activity, FlowElementsContainer {
	/**
	 * Returns the value of the '<em><b>Triggered By Event</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By Event</em>' attribute.
	 * @see #setTriggeredByEvent(boolean)
	 * @see BPMN20.BPMN20Package#getSubProcess_TriggeredByEvent()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isTriggeredByEvent();

	/**
	 * Sets the value of the '{@link BPMN20.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By Event</em>' attribute.
	 * @see #isTriggeredByEvent()
	 * @generated
	 */
	void setTriggeredByEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getSubProcess_Artifacts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // SubProcess
