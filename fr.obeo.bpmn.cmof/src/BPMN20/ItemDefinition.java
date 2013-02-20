/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.ItemDefinition#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link BPMN20.ItemDefinition#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link BPMN20.ItemDefinition#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link BPMN20.ItemDefinition#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getItemDefinition()
 * @model
 * @generated
 */
public interface ItemDefinition extends RootElement {
	/**
	 * Returns the value of the '<em><b>Item Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.ItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Kind</em>' attribute.
	 * @see BPMN20.ItemKind
	 * @see #setItemKind(ItemKind)
	 * @see BPMN20.BPMN20Package#getItemDefinition_ItemKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ItemKind getItemKind();

	/**
	 * Sets the value of the '{@link BPMN20.ItemDefinition#getItemKind <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Kind</em>' attribute.
	 * @see BPMN20.ItemKind
	 * @see #getItemKind()
	 * @generated
	 */
	void setItemKind(ItemKind value);

	/**
	 * Returns the value of the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Ref</em>' reference.
	 * @see #setStructureRef(EObject)
	 * @see BPMN20.BPMN20Package#getItemDefinition_StructureRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getStructureRef();

	/**
	 * Sets the value of the '{@link BPMN20.ItemDefinition#getStructureRef <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Ref</em>' reference.
	 * @see #getStructureRef()
	 * @generated
	 */
	void setStructureRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see BPMN20.BPMN20Package#getItemDefinition_IsCollection()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link BPMN20.ItemDefinition#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(Import)
	 * @see BPMN20.BPMN20Package#getItemDefinition_Import()
	 * @model ordered="false"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link BPMN20.ItemDefinition#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

} // ItemDefinition
