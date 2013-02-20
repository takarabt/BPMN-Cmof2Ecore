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
 * A representation of the model object '<em><b>Extension Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link BPMN20.ExtensionAttributeValue#getValue <em>Value</em>}</li>
 *   <li>{@link BPMN20.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getExtensionAttributeValue()
 * @model
 * @generated
 */
public interface ExtensionAttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference.
	 * @see #setValueRef(EObject)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeValue_ValueRef()
	 * @model ordered="false"
	 * @generated
	 */
	EObject getValueRef();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ref</em>' reference.
	 * @see #getValueRef()
	 * @generated
	 */
	void setValueRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(EObject)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeValue_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Extension Attribute Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Attribute Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Attribute Definition</em>' reference.
	 * @see #setExtensionAttributeDefinition(ExtensionAttributeDefinition)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeValue_ExtensionAttributeDefinition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExtensionAttributeDefinition getExtensionAttributeDefinition();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Attribute Definition</em>' reference.
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	void setExtensionAttributeDefinition(ExtensionAttributeDefinition value);

} // ExtensionAttributeValue
