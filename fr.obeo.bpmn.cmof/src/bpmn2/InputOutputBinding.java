/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link bpmn2.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link bpmn2.InputOutputBinding#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getInputOutputBinding()
 * @model
 * @generated
 */
public interface InputOutputBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Data Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Ref</em>' reference.
	 * @see #setInputDataRef(InputSet)
	 * @see bpmn2.Bpmn2Package#getInputOutputBinding_InputDataRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InputSet getInputDataRef();

	/**
	 * Sets the value of the '{@link bpmn2.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data Ref</em>' reference.
	 * @see #getInputDataRef()
	 * @generated
	 */
	void setInputDataRef(InputSet value);

	/**
	 * Returns the value of the '<em><b>Output Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Data Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Ref</em>' reference.
	 * @see #setOutputDataRef(OutputSet)
	 * @see bpmn2.Bpmn2Package#getInputOutputBinding_OutputDataRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OutputSet getOutputDataRef();

	/**
	 * Sets the value of the '{@link bpmn2.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Ref</em>' reference.
	 * @see #getOutputDataRef()
	 * @generated
	 */
	void setOutputDataRef(OutputSet value);

	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' reference.
	 * @see #setOperationRef(Operation)
	 * @see bpmn2.Bpmn2Package#getInputOutputBinding_OperationRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getOperationRef();

	/**
	 * Sets the value of the '{@link bpmn2.InputOutputBinding#getOperationRef <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' reference.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(Operation value);

} // InputOutputBinding
