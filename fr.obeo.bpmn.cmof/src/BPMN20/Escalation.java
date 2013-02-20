/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escalation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Escalation#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link BPMN20.Escalation#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.Escalation#getEscalationCode <em>Escalation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getEscalation()
 * @model
 * @generated
 */
public interface Escalation extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Ref</em>' reference.
	 * @see #setStructureRef(ItemDefinition)
	 * @see BPMN20.BPMN20Package#getEscalation_StructureRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getStructureRef();

	/**
	 * Sets the value of the '{@link BPMN20.Escalation#getStructureRef <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Ref</em>' reference.
	 * @see #getStructureRef()
	 * @generated
	 */
	void setStructureRef(ItemDefinition value);

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
	 * @see BPMN20.BPMN20Package#getEscalation_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.Escalation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escalation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escalation Code</em>' attribute.
	 * @see #setEscalationCode(Object)
	 * @see BPMN20.BPMN20Package#getEscalation_EscalationCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getEscalationCode();

	/**
	 * Sets the value of the '{@link BPMN20.Escalation#getEscalationCode <em>Escalation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation Code</em>' attribute.
	 * @see #getEscalationCode()
	 * @generated
	 */
	void setEscalationCode(Object value);

} // Escalation
