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
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.DataInput#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.DataInput#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link BPMN20.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link BPMN20.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link BPMN20.DataInput#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getDataInput()
 * @model
 * @generated
 */
public interface DataInput extends ItemAwareElement {
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
	 * @see BPMN20.BPMN20Package#getDataInput_Name()
	 * @model ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.DataInput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see BPMN20.BPMN20Package#getDataInput_IsCollection()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link BPMN20.DataInput#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Set With Optional</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.InputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With Optional</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With Optional</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataInput_InputSetWithOptional()
	 * @see BPMN20.InputSet#getOptionalInputRefs
	 * @model opposite="optionalInputRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithOptional();

	/**
	 * Returns the value of the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.InputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With While Executing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With While Executing</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataInput_InputSetWithWhileExecuting()
	 * @see BPMN20.InputSet#getWhileExecutingInputRefs
	 * @model opposite="whileExecutingInputRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithWhileExecuting();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.InputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataInput_InputSetRefs()
	 * @see BPMN20.InputSet#getDataInputRefs
	 * @model opposite="dataInputRefs" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

} // DataInput
