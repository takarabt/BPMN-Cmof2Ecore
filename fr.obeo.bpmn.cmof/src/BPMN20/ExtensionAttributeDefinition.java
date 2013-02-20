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
 * A representation of the model object '<em><b>Extension Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ExtensionAttributeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.ExtensionAttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link BPMN20.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link BPMN20.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getExtensionAttributeDefinition()
 * @model
 * @generated
 */
public interface ExtensionAttributeDefinition extends EObject {
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
	 * @see BPMN20.BPMN20Package#getExtensionAttributeDefinition_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeDefinition_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #setIsReference(boolean)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeDefinition_IsReference()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReference();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference</em>' attribute.
	 * @see #isIsReference()
	 * @generated
	 */
	void setIsReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link BPMN20.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Definition</em>' container reference.
	 * @see #setExtensionDefinition(ExtensionDefinition)
	 * @see BPMN20.BPMN20Package#getExtensionAttributeDefinition_ExtensionDefinition()
	 * @see BPMN20.ExtensionDefinition#getExtensionAttributeDefinitions
	 * @model opposite="extensionAttributeDefinitions" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExtensionDefinition getExtensionDefinition();

	/**
	 * Sets the value of the '{@link BPMN20.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Definition</em>' container reference.
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	void setExtensionDefinition(ExtensionDefinition value);

} // ExtensionAttributeDefinition
