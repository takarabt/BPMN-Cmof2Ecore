/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DI;

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
 *   <li>{@link DI.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link DI.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link DI.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link DI.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link DI.DiagramElement#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see DI.DIPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DI.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Diagram</em>' reference.
	 * @see DI.DIPackage#getDiagramElement_OwningDiagram()
	 * @see DI.Diagram#getRootElement
	 * @model opposite="rootElement" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Diagram getOwningDiagram();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DI.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see DI.DIPackage#getDiagramElement_OwningElement()
	 * @see DI.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link DI.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link DI.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see DI.DIPackage#getDiagramElement_OwnedElement()
	 * @see DI.DiagramElement#getOwningElement
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
	 * @see DI.DIPackage#getDiagramElement_ModelElement()
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
	 * @see DI.DIPackage#getDiagramElement_Style()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

} // DiagramElement
