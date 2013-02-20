/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI;

import DI.Diagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMNDI.BPMNDiagram#getPlane <em>Plane</em>}</li>
 *   <li>{@link BPMNDI.BPMNDiagram#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMNDI.BPMNDIPackage#getBPMNDiagram()
 * @model
 * @generated
 */
public interface BPMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plane</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(BPMNPlane)
	 * @see BPMNDI.BPMNDIPackage#getBPMNDiagram_Plane()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BPMNPlane getPlane();

	/**
	 * Sets the value of the '{@link BPMNDI.BPMNDiagram#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(BPMNPlane value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference list.
	 * The list contents are of type {@link BPMNDI.BPMNLabelStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference list.
	 * @see BPMNDI.BPMNDIPackage#getBPMNDiagram_LabelStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BPMNLabelStyle> getLabelStyle();

} // BPMNDiagram
