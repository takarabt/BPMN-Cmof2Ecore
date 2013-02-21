/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.LabeledShape#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.DiPackage#getLabeledShape()
 * @model abstract="true"
 * @generated
 */
public interface LabeledShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link di.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Label</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see di.DiPackage#getLabeledShape_OwnedLabel()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Label> getOwnedLabel();

} // LabeledShape
