/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DC.Bounds#getX <em>X</em>}</li>
 *   <li>{@link DC.Bounds#getY <em>Y</em>}</li>
 *   <li>{@link DC.Bounds#getWidth <em>Width</em>}</li>
 *   <li>{@link DC.Bounds#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see DC.DCPackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Real)
	 * @see DC.DCPackage#getBounds_X()
	 * @model default="0" dataType="DC.Real" required="true" ordered="false"
	 * @generated
	 */
	Object getX();

	/**
	 * Sets the value of the '{@link DC.Bounds#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Object value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Real)
	 * @see DC.DCPackage#getBounds_Y()
	 * @model default="0" dataType="DC.Real" required="true" ordered="false"
	 * @generated
	 */
	Object getY();

	/**
	 * Sets the value of the '{@link DC.Bounds#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Object value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Real)
	 * @see DC.DCPackage#getBounds_Width()
	 * @model dataType="DC.Real" required="true" ordered="false"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link DC.Bounds#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Real)
	 * @see DC.DCPackage#getBounds_Height()
	 * @model dataType="DC.Real" required="true" ordered="false"
	 * @generated
	 */
	Object getHeight();

	/**
	 * Sets the value of the '{@link DC.Bounds#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Object value);

} // Bounds
