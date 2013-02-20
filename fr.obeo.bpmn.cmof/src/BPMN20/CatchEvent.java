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
 * A representation of the model object '<em><b>Catch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.CatchEvent#getParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link BPMN20.CatchEvent#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link BPMN20.CatchEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link BPMN20.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link BPMN20.CatchEvent#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link BPMN20.CatchEvent#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getCatchEvent()
 * @model abstract="true"
 * @generated
 */
public interface CatchEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #setParallelMultiple(Object)
	 * @see BPMN20.BPMN20Package#getCatchEvent_ParallelMultiple()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getParallelMultiple();

	/**
	 * Sets the value of the '{@link BPMN20.CatchEvent#getParallelMultiple <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #getParallelMultiple()
	 * @generated
	 */
	void setParallelMultiple(Object value);

	/**
	 * Returns the value of the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Set</em>' containment reference.
	 * @see #setOutputSet(OutputSet)
	 * @see BPMN20.BPMN20Package#getCatchEvent_OutputSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OutputSet getOutputSet();

	/**
	 * Sets the value of the '{@link BPMN20.CatchEvent#getOutputSet <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Set</em>' containment reference.
	 * @see #getOutputSet()
	 * @generated
	 */
	void setOutputSet(OutputSet value);

	/**
	 * Returns the value of the '<em><b>Event Definition Refs</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definition Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition Refs</em>' reference list.
	 * @see BPMN20.BPMN20Package#getCatchEvent_EventDefinitionRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitionRefs();

	/**
	 * Returns the value of the '<em><b>Data Output Association</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.DataOutputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Association</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getCatchEvent_DataOutputAssociation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutputAssociation> getDataOutputAssociation();

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
	 * @see BPMN20.BPMN20Package#getCatchEvent_DataOutputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputs();

	/**
	 * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definitions</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getCatchEvent_EventDefinitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitions();

} // CatchEvent
