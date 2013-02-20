/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Aware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link BPMN20.ItemAwareElement#getDataState <em>Data State</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getItemAwareElement()
 * @model
 * @generated
 */
public interface ItemAwareElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Subject Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Subject Ref</em>' reference.
	 * @see #setItemSubjectRef(ItemDefinition)
	 * @see BPMN20.BPMN20Package#getItemAwareElement_ItemSubjectRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getItemSubjectRef();

	/**
	 * Sets the value of the '{@link BPMN20.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Subject Ref</em>' reference.
	 * @see #getItemSubjectRef()
	 * @generated
	 */
	void setItemSubjectRef(ItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(DataState)
	 * @see BPMN20.BPMN20Package#getItemAwareElement_DataState()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataState getDataState();

	/**
	 * Sets the value of the '{@link BPMN20.ItemAwareElement#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(DataState value);

} // ItemAwareElement
