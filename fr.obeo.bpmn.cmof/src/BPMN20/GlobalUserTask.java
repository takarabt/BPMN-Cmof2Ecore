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
 * A representation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.GlobalUserTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link BPMN20.GlobalUserTask#getRenderings <em>Renderings</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getGlobalUserTask()
 * @model
 * @generated
 */
public interface GlobalUserTask extends GlobalTask {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(Object)
	 * @see BPMN20.BPMN20Package#getGlobalUserTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getImplementation();

	/**
	 * Sets the value of the '{@link BPMN20.GlobalUserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Object value);

	/**
	 * Returns the value of the '<em><b>Renderings</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Rendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renderings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderings</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getGlobalUserTask_Renderings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rendering> getRenderings();

} // GlobalUserTask
