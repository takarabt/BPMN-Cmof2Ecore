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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DI.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link DI.Diagram#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link DI.Diagram#getResolution <em>Resolution</em>}</li>
 *   <li>{@link DI.Diagram#getOwnedStyle <em>Owned Style</em>}</li>
 *   <li>{@link DI.Diagram#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see DI.DIPackage#getDiagram()
 * @model abstract="true"
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DI.DIPackage#getDiagram_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DI.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see DI.DIPackage#getDiagram_Documentation()
	 * @model ordered="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link DI.Diagram#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(float)
	 * @see DI.DIPackage#getDiagram_Resolution()
	 * @model ordered="false"
	 * @generated
	 */
	float getResolution();

	/**
	 * Sets the value of the '{@link DI.Diagram#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(float value);

	/**
	 * Returns the value of the '<em><b>Owned Style</b></em>' reference list.
	 * The list contents are of type {@link DI.Style}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Style</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Style</em>' reference list.
	 * @see DI.DIPackage#getDiagram_OwnedStyle()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Style> getOwnedStyle();

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DI.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see DI.DIPackage#getDiagram_RootElement()
	 * @see DI.DiagramElement#getOwningDiagram
	 * @model opposite="owningDiagram" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getRootElement();

} // Diagram
