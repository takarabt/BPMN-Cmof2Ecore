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
 * A representation of the model object '<em><b>Participant Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ParticipantMultiplicity#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link BPMN20.ParticipantMultiplicity#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getParticipantMultiplicity()
 * @model
 * @generated
 */
public interface ParticipantMultiplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see BPMN20.BPMN20Package#getParticipantMultiplicity_Minimum()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link BPMN20.ParticipantMultiplicity#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see BPMN20.BPMN20Package#getParticipantMultiplicity_Maximum()
	 * @model default="1" ordered="false"
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link BPMN20.ParticipantMultiplicity#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

} // ParticipantMultiplicity
