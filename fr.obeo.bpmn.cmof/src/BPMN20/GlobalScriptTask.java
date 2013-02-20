/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link BPMN20.GlobalScriptTask#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getGlobalScriptTask()
 * @model
 * @generated
 */
public interface GlobalScriptTask extends GlobalTask {
	/**
	 * Returns the value of the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Language</em>' attribute.
	 * @see #setScriptLanguage(Object)
	 * @see BPMN20.BPMN20Package#getGlobalScriptTask_ScriptLanguage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getScriptLanguage();

	/**
	 * Sets the value of the '{@link BPMN20.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Language</em>' attribute.
	 * @see #getScriptLanguage()
	 * @generated
	 */
	void setScriptLanguage(Object value);

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
	 * @see BPMN20.BPMN20Package#getGlobalScriptTask_Script()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getScript();

	/**
	 * Sets the value of the '{@link BPMN20.GlobalScriptTask#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Object value);

} // GlobalScriptTask
