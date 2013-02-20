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
 * A representation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.InputOutputSpecification#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link BPMN20.InputOutputSpecification#getOutputSets <em>Output Sets</em>}</li>
 *   <li>{@link BPMN20.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link BPMN20.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getInputOutputSpecification()
 * @model
 * @generated
 */
public interface InputOutputSpecification extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Input Sets</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.InputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sets</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getInputOutputSpecification_InputSets()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSets();

	/**
	 * Returns the value of the '<em><b>Output Sets</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.OutputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Sets</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getInputOutputSpecification_OutputSets()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSets();

	/**
	 * Returns the value of the '<em><b>Data Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.DataInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inputs</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getInputOutputSpecification_DataInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputs();

	/**
	 * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.DataOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Outputs</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getInputOutputSpecification_DataOutputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputs();

} // InputOutputSpecification
