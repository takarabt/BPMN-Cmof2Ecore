/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.BusinessRuleTask#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getBusinessRuleTask()
 * @model
 * @generated
 */
public interface BusinessRuleTask extends Task {
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
	 * @see BPMN20.BPMN20Package#getBusinessRuleTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getImplementation();

	/**
	 * Sets the value of the '{@link BPMN20.BusinessRuleTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Object value);

} // BusinessRuleTask
