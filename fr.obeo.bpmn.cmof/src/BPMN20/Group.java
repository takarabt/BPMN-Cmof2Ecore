/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Group#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getGroup()
 * @model
 * @generated
 */
public interface Group extends Artifact {
	/**
	 * Returns the value of the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value Ref</em>' reference.
	 * @see #setCategoryValueRef(CategoryValue)
	 * @see BPMN20.BPMN20Package#getGroup_CategoryValueRef()
	 * @model ordered="false"
	 * @generated
	 */
	CategoryValue getCategoryValueRef();

	/**
	 * Sets the value of the '{@link BPMN20.Group#getCategoryValueRef <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Value Ref</em>' reference.
	 * @see #getCategoryValueRef()
	 * @generated
	 */
	void setCategoryValueRef(CategoryValue value);

} // Group
