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
 * A representation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link BPMN20.CorrelationProperty#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.CorrelationProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCorrelationProperty()
 * @model
 * @generated
 */
public interface CorrelationProperty extends RootElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CorrelationPropertyRetrievalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Retrieval Expression</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getCorrelationProperty_CorrelationPropertyRetrievalExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression();

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
	 * @see BPMN20.BPMN20Package#getCorrelationProperty_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ItemDefinition)
	 * @see BPMN20.BPMN20Package#getCorrelationProperty_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getType();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ItemDefinition value);

} // CorrelationProperty
