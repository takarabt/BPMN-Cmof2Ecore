/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Association#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link BPMN20.Association#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link BPMN20.Association#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Artifact {
	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see BPMN20.AssociationDirection
	 * @see #setAssociationDirection(AssociationDirection)
	 * @see BPMN20.BPMN20Package#getAssociation_AssociationDirection()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link BPMN20.Association#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see BPMN20.AssociationDirection
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(AssociationDirection value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(BaseElement)
	 * @see BPMN20.BPMN20Package#getAssociation_SourceRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BaseElement getSourceRef();

	/**
	 * Sets the value of the '{@link BPMN20.Association#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(BaseElement)
	 * @see BPMN20.BPMN20Package#getAssociation_TargetRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BaseElement getTargetRef();

	/**
	 * Sets the value of the '{@link BPMN20.Association#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(BaseElement value);

} // Association
