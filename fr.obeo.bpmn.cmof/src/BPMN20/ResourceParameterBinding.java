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
 * A representation of the model object '<em><b>Resource Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ResourceParameterBinding#getExpression <em>Expression</em>}</li>
 *   <li>{@link BPMN20.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getResourceParameterBinding()
 * @model
 * @generated
 */
public interface ResourceParameterBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see BPMN20.BPMN20Package#getResourceParameterBinding_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link BPMN20.ResourceParameterBinding#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameter Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Ref</em>' reference.
	 * @see #setParameterRef(ResourceParameter)
	 * @see BPMN20.BPMN20Package#getResourceParameterBinding_ParameterRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ResourceParameter getParameterRef();

	/**
	 * Sets the value of the '{@link BPMN20.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Ref</em>' reference.
	 * @see #getParameterRef()
	 * @generated
	 */
	void setParameterRef(ResourceParameter value);

} // ResourceParameterBinding
