/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link di.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link di.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link di.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link di.DiagramElement#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see di.DiPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link di.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Diagram</em>' reference.
	 * @see di.DiPackage#getDiagramElement_OwningDiagram()
	 * @see di.Diagram#getRootElement
	 * @model opposite="rootElement" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Diagram getOwningDiagram();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see di.DiPackage#getDiagramElement_OwningElement()
	 * @see di.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link di.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see di.DiPackage#getDiagramElement_OwnedElement()
	 * @see di.DiagramElement#getOwningElement
	 * @model opposite="owningElement" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see di.DiPackage#getDiagramElement_ModelElement()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see di.DiPackage#getDiagramElement_Style()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

} // DiagramElement
