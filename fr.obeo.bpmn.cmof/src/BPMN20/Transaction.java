/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Transaction#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link BPMN20.Transaction#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends SubProcess {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(Object)
	 * @see BPMN20.BPMN20Package#getTransaction_Protocol()
	 * @model ordered="false"
	 * @generated
	 */
	Object getProtocol();

	/**
	 * Sets the value of the '{@link BPMN20.Transaction#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Object value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see BPMN20.BPMN20Package#getTransaction_Method()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link BPMN20.Transaction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

} // Transaction
