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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Process#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link BPMN20.Process#getIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link BPMN20.Process#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link BPMN20.Process#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link BPMN20.Process#getProperties <em>Properties</em>}</li>
 *   <li>{@link BPMN20.Process#getSupports <em>Supports</em>}</li>
 *   <li>{@link BPMN20.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link BPMN20.Process#getIsExecutable <em>Is Executable</em>}</li>
 *   <li>{@link BPMN20.Process#getResources <em>Resources</em>}</li>
 *   <li>{@link BPMN20.Process#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link BPMN20.Process#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends CallableElement, FlowElementsContainer {
	/**
	 * Returns the value of the '<em><b>Process Type</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.ProcessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Type</em>' attribute.
	 * @see BPMN20.ProcessType
	 * @see #setProcessType(ProcessType)
	 * @see BPMN20.BPMN20Package#getProcess_ProcessType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessType getProcessType();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Type</em>' attribute.
	 * @see BPMN20.ProcessType
	 * @see #getProcessType()
	 * @generated
	 */
	void setProcessType(ProcessType value);

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(Object)
	 * @see BPMN20.BPMN20Package#getProcess_IsClosed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsClosed();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #getIsClosed()
	 * @generated
	 */
	void setIsClosed(Object value);

	/**
	 * Returns the value of the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditing</em>' containment reference.
	 * @see #setAuditing(Auditing)
	 * @see BPMN20.BPMN20Package#getProcess_Auditing()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Auditing getAuditing();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getAuditing <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditing</em>' containment reference.
	 * @see #getAuditing()
	 * @generated
	 */
	void setAuditing(Auditing value);

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' containment reference.
	 * @see #setMonitoring(Monitoring)
	 * @see BPMN20.BPMN20Package#getProcess_Monitoring()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Monitoring getMonitoring();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getMonitoring <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' containment reference.
	 * @see #getMonitoring()
	 * @generated
	 */
	void setMonitoring(Monitoring value);

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
	 * @see BPMN20.BPMN20Package#getProcess_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' reference list.
	 * The list contents are of type {@link BPMN20.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' reference list.
	 * @see BPMN20.BPMN20Package#getProcess_Supports()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Process> getSupports();

	/**
	 * Returns the value of the '<em><b>Definitional Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitional Collaboration Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitional Collaboration Ref</em>' reference.
	 * @see #setDefinitionalCollaborationRef(Collaboration)
	 * @see BPMN20.BPMN20Package#getProcess_DefinitionalCollaborationRef()
	 * @model ordered="false"
	 * @generated
	 */
	Collaboration getDefinitionalCollaborationRef();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitional Collaboration Ref</em>' reference.
	 * @see #getDefinitionalCollaborationRef()
	 * @generated
	 */
	void setDefinitionalCollaborationRef(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Executable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Executable</em>' attribute.
	 * @see #setIsExecutable(Object)
	 * @see BPMN20.BPMN20Package#getProcess_IsExecutable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIsExecutable();

	/**
	 * Sets the value of the '{@link BPMN20.Process#getIsExecutable <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Executable</em>' attribute.
	 * @see #getIsExecutable()
	 * @generated
	 */
	void setIsExecutable(Object value);

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
	 * @see BPMN20.BPMN20Package#getProcess_Resources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRole> getResources();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getProcess_Artifacts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Correlation Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.CorrelationSubscription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Subscriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Subscriptions</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getProcess_CorrelationSubscriptions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationSubscription> getCorrelationSubscriptions();

} // Process
