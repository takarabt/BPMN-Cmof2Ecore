/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di;

import dc.Point;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link di.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link di.Edge#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.DiPackage#getEdge()
 * @model abstract="true"
 * @generated
 */
public interface Edge extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see di.DiPackage#getEdge_Source()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see di.DiPackage#getEdge_Target()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getTarget();

	/**
	 * Returns the value of the '<em><b>Waypoint</b></em>' containment reference list.
	 * The list contents are of type {@link dc.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoint</em>' containment reference list.
	 * @see di.DiPackage#getEdge_Waypoint()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Point> getWaypoint();

} // Edge
