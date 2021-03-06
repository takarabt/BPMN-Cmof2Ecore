/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmdi;

import dc.Font;

import di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmdi.BPMNLabelStyle#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmdi.BpmdiPackage#getBPMNLabelStyle()
 * @model
 * @generated
 */
public interface BPMNLabelStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see bpmdi.BpmdiPackage#getBPMNLabelStyle_Font()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link bpmdi.BPMNLabelStyle#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

} // BPMNLabelStyle
