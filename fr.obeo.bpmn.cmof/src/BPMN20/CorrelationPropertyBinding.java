/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link BPMN20.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCorrelationPropertyBinding()
 * @model
 * @generated
 */
public interface CorrelationPropertyBinding extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' containment reference.
	 * @see #setDataPath(FormalExpression)
	 * @see BPMN20.BPMN20Package#getCorrelationPropertyBinding_DataPath()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getDataPath();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' containment reference.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #setCorrelationPropertyRef(CorrelationProperty)
	 * @see BPMN20.BPMN20Package#getCorrelationPropertyBinding_CorrelationPropertyRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CorrelationProperty getCorrelationPropertyRef();

	/**
	 * Sets the value of the '{@link BPMN20.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 */
	void setCorrelationPropertyRef(CorrelationProperty value);

} // CorrelationPropertyBinding
