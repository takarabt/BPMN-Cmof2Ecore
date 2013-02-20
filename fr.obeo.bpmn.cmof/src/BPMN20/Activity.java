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
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Activity#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link BPMN20.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link BPMN20.Activity#getResources <em>Resources</em>}</li>
 *   <li>{@link BPMN20.Activity#getDefault <em>Default</em>}</li>
 *   <li>{@link BPMN20.Activity#getProperties <em>Properties</em>}</li>
 *   <li>{@link BPMN20.Activity#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link BPMN20.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link BPMN20.Activity#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link BPMN20.Activity#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link BPMN20.Activity#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link BPMN20.Activity#getCompletionQuantity <em>Completion Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Is For Compensation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is For Compensation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For Compensation</em>' attribute.
	 * @see #setIsForCompensation(boolean)
	 * @see BPMN20.BPMN20Package#getActivity_IsForCompensation()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsForCompensation();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#isIsForCompensation <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is For Compensation</em>' attribute.
	 * @see #isIsForCompensation()
	 * @generated
	 */
	void setIsForCompensation(boolean value);

	/**
	 * Returns the value of the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Characteristics</em>' containment reference.
	 * @see #setLoopCharacteristics(LoopCharacteristics)
	 * @see BPMN20.BPMN20Package#getActivity_LoopCharacteristics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LoopCharacteristics getLoopCharacteristics();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Characteristics</em>' containment reference.
	 * @see #getLoopCharacteristics()
	 * @generated
	 */
	void setLoopCharacteristics(LoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.ResourceRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getActivity_Resources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRole> getResources();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SequenceFlow)
	 * @see BPMN20.BPMN20Package#getActivity_Default()
	 * @model ordered="false"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getActivity_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Specification</em>' containment reference.
	 * @see #setIoSpecification(InputOutputSpecification)
	 * @see BPMN20.BPMN20Package#getActivity_IoSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputOutputSpecification getIoSpecification();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#getIoSpecification <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Specification</em>' containment reference.
	 * @see #getIoSpecification()
	 * @generated
	 */
	void setIoSpecification(InputOutputSpecification value);

	/**
	 * Returns the value of the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.BoundaryEvent}.
	 * It is bidirectional and its opposite is '{@link BPMN20.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Event Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getActivity_BoundaryEventRefs()
	 * @see BPMN20.BoundaryEvent#getAttachedToRef
	 * @model opposite="attachedToRef" ordered="false"
	 * @generated
	 */
	EList<BoundaryEvent> getBoundaryEventRefs();

	/**
	 * Returns the value of the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.DataInputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Associations</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getActivity_DataInputAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInputAssociation> getDataInputAssociations();

	/**
	 * Returns the value of the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.DataOutputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Associations</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getActivity_DataOutputAssociations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutputAssociation> getDataOutputAssociations();

	/**
	 * Returns the value of the '<em><b>Start Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Quantity</em>' attribute.
	 * @see #setStartQuantity(int)
	 * @see BPMN20.BPMN20Package#getActivity_StartQuantity()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	int getStartQuantity();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#getStartQuantity <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Quantity</em>' attribute.
	 * @see #getStartQuantity()
	 * @generated
	 */
	void setStartQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Completion Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Quantity</em>' attribute.
	 * @see #setCompletionQuantity(int)
	 * @see BPMN20.BPMN20Package#getActivity_CompletionQuantity()
	 * @model default="1" required="true" ordered="false"
	 * @generated
	 */
	int getCompletionQuantity();

	/**
	 * Sets the value of the '{@link BPMN20.Activity#getCompletionQuantity <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Quantity</em>' attribute.
	 * @see #getCompletionQuantity()
	 * @generated
	 */
	void setCompletionQuantity(int value);

} // Activity
