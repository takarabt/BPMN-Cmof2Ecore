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
 * A representation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link BPMN20.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCorrelationSubscription()
 * @model
 * @generated
 */
public interface CorrelationSubscription extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Key Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Key Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key Ref</em>' reference.
	 * @see #setCorrelationKeyRef(CorrelationKey)
	 * @see BPMN20.BPMN20Package#getCorrelationSubscription_CorrelationKeyRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CorrelationKey getCorrelationKeyRef();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Key Ref</em>' reference.
	 * @see #getCorrelationKeyRef()
	 * @generated
	 */
	void setCorrelationKeyRef(CorrelationKey value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CorrelationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Binding</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getCorrelationSubscription_CorrelationPropertyBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationPropertyBinding> getCorrelationPropertyBinding();

} // CorrelationSubscription
