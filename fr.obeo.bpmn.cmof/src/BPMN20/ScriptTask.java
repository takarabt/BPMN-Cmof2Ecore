/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ScriptTask#getScriptFormat <em>Script Format</em>}</li>
 *   <li>{@link BPMN20.ScriptTask#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getScriptTask()
 * @model
 * @generated
 */
public interface ScriptTask extends Task {
	/**
	 * Returns the value of the '<em><b>Script Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Format</em>' attribute.
	 * @see #setScriptFormat(Object)
	 * @see BPMN20.BPMN20Package#getScriptTask_ScriptFormat()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getScriptFormat();

	/**
	 * Sets the value of the '{@link BPMN20.ScriptTask#getScriptFormat <em>Script Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Format</em>' attribute.
	 * @see #getScriptFormat()
	 * @generated
	 */
	void setScriptFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(Object)
	 * @see BPMN20.BPMN20Package#getScriptTask_Script()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getScript();

	/**
	 * Sets the value of the '{@link BPMN20.ScriptTask#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Object value);

} // ScriptTask
