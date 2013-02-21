/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.DataStore#getName <em>Name</em>}</li>
 *   <li>{@link bpmn2.DataStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link bpmn2.DataStore#isIsUnlimited <em>Is Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDataStore()
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
	 * @see #setName(String)
	 * @see bpmn2.Bpmn2Package#getDataStore_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.DataStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see bpmn2.Bpmn2Package#getDataStore_Capacity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link bpmn2.DataStore#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

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
	 * @see bpmn2.Bpmn2Package#getDataStore_IsUnlimited()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnlimited();

	/**
	 * Sets the value of the '{@link bpmn2.DataStore#isIsUnlimited <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unlimited</em>' attribute.
	 * @see #isIsUnlimited()
	 * @generated
	 */
	void setIsUnlimited(boolean value);

} // DataStore
