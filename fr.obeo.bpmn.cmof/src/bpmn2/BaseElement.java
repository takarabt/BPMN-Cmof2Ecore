/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.BaseElement#getId <em>Id</em>}</li>
 *   <li>{@link bpmn2.BaseElement#getExtensionDefinitions <em>Extension Definitions</em>}</li>
 *   <li>{@link bpmn2.BaseElement#getExtensionValues <em>Extension Values</em>}</li>
 *   <li>{@link bpmn2.BaseElement#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getBaseElement()
 * @model abstract="true"
 * @generated
 */
public interface BaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see bpmn2.Bpmn2Package#getBaseElement_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link bpmn2.BaseElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Extension Definitions</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.ExtensionDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Definitions</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getBaseElement_ExtensionDefinitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ExtensionDefinition> getExtensionDefinitions();

	/**
	 * Returns the value of the '<em><b>Extension Values</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.ExtensionAttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Values</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getBaseElement_ExtensionValues()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionAttributeValue> getExtensionValues();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getBaseElement_Documentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

} // BaseElement
