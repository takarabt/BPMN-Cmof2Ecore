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
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Category#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link BPMN20.Category#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCategory()
 * @model
 * @generated
 */
public interface Category extends RootElement {
	/**
	 * Returns the value of the '<em><b>Category Value</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CategoryValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Value</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getCategory_CategoryValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CategoryValue> getCategoryValue();

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
	 * @see BPMN20.BPMN20Package#getCategory_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

} // Category
