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
 * A representation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link BPMN20.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link BPMN20.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link BPMN20.OutputSet#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.OutputSet#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getOutputSet()
 * @model
 * @generated
 */
public interface OutputSet extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Output Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.DataOutput}.
	 * It is bidirectional and its opposite is '{@link BPMN20.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getOutputSet_DataOutputRefs()
	 * @see BPMN20.DataOutput#getOutputSetRefs
	 * @model opposite="outputSetRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputRefs();

	/**
	 * Returns the value of the '<em><b>Optional Output Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.DataOutput}.
	 * It is bidirectional and its opposite is '{@link BPMN20.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Output Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getOutputSet_OptionalOutputRefs()
	 * @see BPMN20.DataOutput#getOutputSetWithOptional
	 * @model opposite="outputSetWithOptional" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getOptionalOutputRefs();

	/**
	 * Returns the value of the '<em><b>While Executing Output Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.DataOutput}.
	 * It is bidirectional and its opposite is '{@link BPMN20.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>While Executing Output Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>While Executing Output Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getOutputSet_WhileExecutingOutputRefs()
	 * @see BPMN20.DataOutput#getOutputSetWithWhileExecuting
	 * @model opposite="outputSetWithWhileExecuting" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getWhileExecutingOutputRefs();

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
	 * @see BPMN20.BPMN20Package#getOutputSet_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.OutputSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.InputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getOutputSet_InputSetRefs()
	 * @see BPMN20.InputSet#getOutputSetRefs
	 * @model opposite="outputSetRefs" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

} // OutputSet
