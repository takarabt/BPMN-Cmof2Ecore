/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link bpmn2.GlobalScriptTask#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getGlobalScriptTask()
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
	 * @see #setScriptLanguage(String)
	 * @see bpmn2.Bpmn2Package#getGlobalScriptTask_ScriptLanguage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getScriptLanguage();

	/**
	 * Sets the value of the '{@link bpmn2.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Language</em>' attribute.
	 * @see #getScriptLanguage()
	 * @generated
	 */
	void setScriptLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see bpmn2.Bpmn2Package#getGlobalScriptTask_Script()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link bpmn2.GlobalScriptTask#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

} // GlobalScriptTask
