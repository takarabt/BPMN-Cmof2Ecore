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
 * A representation of the model object '<em><b>Link Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.LinkEventDefinition#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.LinkEventDefinition#getTarget <em>Target</em>}</li>
 *   <li>{@link BPMN20.LinkEventDefinition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getLinkEventDefinition()
 * @model
 * @generated
 */
public interface LinkEventDefinition extends EventDefinition {
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
	 * @see BPMN20.BPMN20Package#getLinkEventDefinition_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.LinkEventDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link BPMN20.LinkEventDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LinkEventDefinition)
	 * @see BPMN20.BPMN20Package#getLinkEventDefinition_Target()
	 * @see BPMN20.LinkEventDefinition#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	LinkEventDefinition getTarget();

	/**
	 * Sets the value of the '{@link BPMN20.LinkEventDefinition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LinkEventDefinition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.LinkEventDefinition}.
	 * It is bidirectional and its opposite is '{@link BPMN20.LinkEventDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see BPMN20.BPMN20Package#getLinkEventDefinition_Source()
	 * @see BPMN20.LinkEventDefinition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<LinkEventDefinition> getSource();

} // LinkEventDefinition
