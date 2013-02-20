/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import BPMNDI.BPMNDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Definitions#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.Definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link BPMN20.Definitions#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link BPMN20.Definitions#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link BPMN20.Definitions#getImports <em>Imports</em>}</li>
 *   <li>{@link BPMN20.Definitions#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link BPMN20.Definitions#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link BPMN20.Definitions#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link BPMN20.Definitions#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link BPMN20.Definitions#getExporter <em>Exporter</em>}</li>
 *   <li>{@link BPMN20.Definitions#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends BaseElement {
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
	 * @see BPMN20.BPMN20Package#getDefinitions_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(Object)
	 * @see BPMN20.BPMN20Package#getDefinitions_TargetNamespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getTargetNamespace();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(Object value);

	/**
	 * Returns the value of the '<em><b>Expression Language</b></em>' attribute.
	 * The default value is <code>"http://www.w3.org/1999/XPath"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Language</em>' attribute.
	 * @see #setExpressionLanguage(String)
	 * @see BPMN20.BPMN20Package#getDefinitions_ExpressionLanguage()
	 * @model default="http://www.w3.org/1999/XPath" required="true" ordered="false"
	 * @generated
	 */
	String getExpressionLanguage();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getExpressionLanguage <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Language</em>' attribute.
	 * @see #getExpressionLanguage()
	 * @generated
	 */
	void setExpressionLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Type Language</b></em>' attribute.
	 * The default value is <code>"http://www.w3.org/2001/XMLSchema"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Language</em>' attribute.
	 * @see #setTypeLanguage(String)
	 * @see BPMN20.BPMN20Package#getDefinitions_TypeLanguage()
	 * @model default="http://www.w3.org/2001/XMLSchema" required="true" ordered="false"
	 * @generated
	 */
	String getTypeLanguage();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getTypeLanguage <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Language</em>' attribute.
	 * @see #getTypeLanguage()
	 * @generated
	 */
	void setTypeLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getDefinitions_Imports()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getDefinitions_Extensions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getDefinitions_Relationships()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' containment reference list.
	 * The list contents are of type {@link BPMN20.RootElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Elements</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getDefinitions_RootElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RootElement> getRootElements();

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNDI.BPMNDiagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' containment reference list.
	 * @see BPMN20.BPMN20Package#getDefinitions_Diagrams()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BPMNDiagram> getDiagrams();

	/**
	 * Returns the value of the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter</em>' attribute.
	 * @see #setExporter(Object)
	 * @see BPMN20.BPMN20Package#getDefinitions_Exporter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getExporter();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getExporter <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter</em>' attribute.
	 * @see #getExporter()
	 * @generated
	 */
	void setExporter(Object value);

	/**
	 * Returns the value of the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exporter Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter Version</em>' attribute.
	 * @see #setExporterVersion(Object)
	 * @see BPMN20.BPMN20Package#getDefinitions_ExporterVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getExporterVersion();

	/**
	 * Sets the value of the '{@link BPMN20.Definitions#getExporterVersion <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Version</em>' attribute.
	 * @see #getExporterVersion()
	 * @generated
	 */
	void setExporterVersion(Object value);

} // Definitions
