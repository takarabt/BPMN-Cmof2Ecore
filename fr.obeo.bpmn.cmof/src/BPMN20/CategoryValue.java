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
 * A representation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CategoryValue#getValue <em>Value</em>}</li>
 *   <li>{@link BPMN20.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCategoryValue()
 * @model
 * @generated
 */
public interface CategoryValue extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see BPMN20.BPMN20Package#getCategoryValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link BPMN20.CategoryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.FlowElement}.
	 * It is bidirectional and its opposite is '{@link BPMN20.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Flow Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Flow Elements</em>' reference list.
	 * @see BPMN20.BPMN20Package#getCategoryValue_CategorizedFlowElements()
	 * @see BPMN20.FlowElement#getCategoryValueRef
	 * @model opposite="categoryValueRef" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getCategorizedFlowElements();

} // CategoryValue
