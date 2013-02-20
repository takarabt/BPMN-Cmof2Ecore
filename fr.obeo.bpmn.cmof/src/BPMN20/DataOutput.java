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
 * A representation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.DataOutput#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.DataOutput#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link BPMN20.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}</li>
 *   <li>{@link BPMN20.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}</li>
 *   <li>{@link BPMN20.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getDataOutput()
 * @model
 * @generated
 */
public interface DataOutput extends ItemAwareElement {
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
	 * @see BPMN20.BPMN20Package#getDataOutput_Name()
	 * @model ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.DataOutput#getName <em>Name</em>}' attribute.
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
	 * @see BPMN20.BPMN20Package#getDataOutput_IsCollection()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link BPMN20.DataOutput#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Output Set With Optional</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.OutputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set With Optional</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set With Optional</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataOutput_OutputSetWithOptional()
	 * @see BPMN20.OutputSet#getOptionalOutputRefs
	 * @model opposite="optionalOutputRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSetWithOptional();

	/**
	 * Returns the value of the '<em><b>Output Set With While Executing</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.OutputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set With While Executing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set With While Executing</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataOutput_OutputSetWithWhileExecuting()
	 * @see BPMN20.OutputSet#getWhileExecutingOutputRefs
	 * @model opposite="whileExecutingOutputRefs" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSetWithWhileExecuting();

	/**
	 * Returns the value of the '<em><b>Output Set Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.OutputSet}.
	 * It is bidirectional and its opposite is '{@link BPMN20.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getDataOutput_OutputSetRefs()
	 * @see BPMN20.OutputSet#getDataOutputRefs
	 * @model opposite="dataOutputRefs" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSetRefs();

} // DataOutput
