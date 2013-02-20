/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.EventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link BPMN20.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getEventBasedGateway()
 * @model
 * @generated
 */
public interface EventBasedGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' attribute.
	 * @see #setInstantiate(boolean)
	 * @see BPMN20.BPMN20Package#getEventBasedGateway_Instantiate()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isInstantiate();

	/**
	 * Sets the value of the '{@link BPMN20.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' attribute.
	 * @see #isInstantiate()
	 * @generated
	 */
	void setInstantiate(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link BPMN20.EventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see BPMN20.EventBasedGatewayType
	 * @see #setEventGatewayType(EventBasedGatewayType)
	 * @see BPMN20.BPMN20Package#getEventBasedGateway_EventGatewayType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link BPMN20.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see BPMN20.EventBasedGatewayType
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(EventBasedGatewayType value);

} // EventBasedGateway
