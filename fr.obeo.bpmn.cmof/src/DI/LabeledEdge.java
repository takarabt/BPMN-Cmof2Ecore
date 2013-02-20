/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DI.LabeledEdge#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see DI.DIPackage#getLabeledEdge()
 * @model abstract="true"
 * @generated
 */
public interface LabeledEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link DI.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Label</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see DI.DIPackage#getLabeledEdge_OwnedLabel()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Label> getOwnedLabel();

} // LabeledEdge
