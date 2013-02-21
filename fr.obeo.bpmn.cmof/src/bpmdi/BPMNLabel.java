/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmdi;

import di.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmdi.BPMNLabel#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmdi.BpmdiPackage#getBPMNLabel()
 * @model
 * @generated
 */
public interface BPMNLabel extends Label {
	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' reference.
	 * @see #setLabelStyle(BPMNLabelStyle)
	 * @see bpmdi.BpmdiPackage#getBPMNLabel_LabelStyle()
	 * @model ordered="false"
	 * @generated
	 */
	BPMNLabelStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNLabel#getLabelStyle <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(BPMNLabelStyle value);

} // BPMNLabel
