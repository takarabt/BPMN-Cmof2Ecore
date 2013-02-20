/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.DataStore#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.DataStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link BPMN20.DataStore#isIsUnlimited <em>Is Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getDataStore()
 * @model
 * @generated
 */
public interface DataStore extends ItemAwareElement, RootElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see BPMN20.BPMN20Package#getDataStore_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link BPMN20.DataStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(Object)
	 * @see BPMN20.BPMN20Package#getDataStore_Capacity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getCapacity();

	/**
	 * Sets the value of the '{@link BPMN20.DataStore#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Object value);

	/**
	 * Returns the value of the '<em><b>Is Unlimited</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unlimited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unlimited</em>' attribute.
	 * @see #setIsUnlimited(boolean)
	 * @see BPMN20.BPMN20Package#getDataStore_IsUnlimited()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnlimited();

	/**
	 * Sets the value of the '{@link BPMN20.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unlimited</em>' attribute.
	 * @see #isIsUnlimited()
	 * @generated
	 */
	void setIsUnlimited(boolean value);

} // DataStore
