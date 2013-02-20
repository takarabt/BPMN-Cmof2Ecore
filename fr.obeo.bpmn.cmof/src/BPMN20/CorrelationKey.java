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
 * A representation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 *   <li>{@link BPMN20.CorrelationKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCorrelationKey()
 * @model
 * @generated
 */
public interface CorrelationKey extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.CorrelationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference list.
	 * @see BPMN20.BPMN20Package#getCorrelationKey_CorrelationPropertyRef()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CorrelationProperty> getCorrelationPropertyRef();

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
	 * @see BPMN20.BPMN20Package#getCorrelationKey_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

} // CorrelationKey
