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
 * A representation of the model object '<em><b>Resource Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ResourceRole#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link BPMN20.ResourceRole#getResourceParameterBindings <em>Resource Parameter Bindings</em>}</li>
 *   <li>{@link BPMN20.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link BPMN20.ResourceRole#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getResourceRole()
 * @model
 * @generated
 */
public interface ResourceRole extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' reference.
	 * @see #setResourceRef(Resource)
	 * @see BPMN20.BPMN20Package#getResourceRole_ResourceRef()
	 * @model ordered="false"
	 * @generated
	 */
	Resource getResourceRef();

	/**
	 * Sets the value of the '{@link BPMN20.ResourceRole#getResourceRef <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' reference.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(Resource value);

	/**
	 * Returns the value of the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.ResourceParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Parameter Bindings</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getResourceRole_ResourceParameterBindings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceParameterBinding> getResourceParameterBindings();

	/**
	 * Returns the value of the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Assignment Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #setResourceAssignmentExpression(ResourceAssignmentExpression)
	 * @see BPMN20.BPMN20Package#getResourceRole_ResourceAssignmentExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ResourceAssignmentExpression getResourceAssignmentExpression();

	/**
	 * Sets the value of the '{@link BPMN20.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Assignment Expression</em>' containment reference.
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	void setResourceAssignmentExpression(ResourceAssignmentExpression value);

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
	 * @see BPMN20.BPMN20Package#getResourceRole_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.ResourceRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

} // ResourceRole
