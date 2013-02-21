/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.CategoryValue#getValue <em>Value</em>}</li>
 *   <li>{@link bpmn2.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getCategoryValue()
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
	 * @see #setValue(String)
	 * @see bpmn2.Bpmn2Package#getCategoryValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link bpmn2.CategoryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.FlowElement}.
	 * It is bidirectional and its opposite is '{@link bpmn2.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorized Flow Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Flow Elements</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getCategoryValue_CategorizedFlowElements()
	 * @see bpmn2.FlowElement#getCategoryValueRef
	 * @model opposite="categoryValueRef" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getCategorizedFlowElements();

} // CategoryValue
