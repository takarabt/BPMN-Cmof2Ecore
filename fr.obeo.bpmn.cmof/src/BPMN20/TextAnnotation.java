/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BPMN20.TextAnnotation#getText <em>Text</em>}</li>
 *   <li>{@link BPMN20.TextAnnotation#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see BPMN20.BPMN20Package#getTextAnnotation()
 * @model
 * @generated
 */
public interface TextAnnotation extends Artifact {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(Object)
	 * @see BPMN20.BPMN20Package#getTextAnnotation_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getText();

	/**
	 * Sets the value of the '{@link BPMN20.TextAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(Object value);

	/**
	 * Returns the value of the '<em><b>Text Format</b></em>' attribute.
	 * The default value is <code>"text/plain"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Format</em>' attribute.
	 * @see #setTextFormat(String)
	 * @see BPMN20.BPMN20Package#getTextAnnotation_TextFormat()
	 * @model default="text/plain" required="true" ordered="false"
	 * @generated
	 */
	String getTextFormat();

	/**
	 * Sets the value of the '{@link BPMN20.TextAnnotation#getTextFormat <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Format</em>' attribute.
	 * @see #getTextFormat()
	 * @generated
	 */
	void setTextFormat(String value);

} // TextAnnotation
