/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link BPMN20.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link BPMN20.Relationship#getSources <em>Sources</em>}</li>
 *   <li>{@link BPMN20.Relationship#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see BPMN20.BPMN20Package#getRelationship_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link BPMN20.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.RelationshipDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see BPMN20.RelationshipDirection
	 * @see #setDirection(RelationshipDirection)
	 * @see BPMN20.BPMN20Package#getRelationship_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RelationshipDirection getDirection();

	/**
	 * Sets the value of the '{@link BPMN20.Relationship#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see BPMN20.RelationshipDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RelationshipDirection value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see BPMN20.BPMN20Package#getRelationship_Sources()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see BPMN20.BPMN20Package#getRelationship_Targets()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getTargets();

} // Relationship
