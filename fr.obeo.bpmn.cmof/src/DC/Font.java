/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DC;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DC.Font#getName <em>Name</em>}</li>
 *   <li>{@link DC.Font#getSize <em>Size</em>}</li>
 *   <li>{@link DC.Font#getIsBold <em>Is Bold</em>}</li>
 *   <li>{@link DC.Font#getIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link DC.Font#getIsUnderline <em>Is Underline</em>}</li>
 *   <li>{@link DC.Font#getIsStrikeThrough <em>Is Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see DC.DCPackage#getFont()
 * @model
 * @generated
 */
public interface Font extends EObject {
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
	 * @see DC.DCPackage#getFont_Name()
	 * @model dataType="DC.String" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link DC.Font#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Real)
	 * @see DC.DCPackage#getFont_Size()
	 * @model dataType="DC.Real" ordered="false"
	 * @generated
	 */
	Object getSize();

	/**
	 * Sets the value of the '{@link DC.Font#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Object value);

	/**
	 * Returns the value of the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bold</em>' attribute.
	 * @see #setIsBold(Boolean)
	 * @see DC.DCPackage#getFont_IsBold()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsBold();

	/**
	 * Sets the value of the '{@link DC.Font#getIsBold <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bold</em>' attribute.
	 * @see #getIsBold()
	 * @generated
	 */
	void setIsBold(Object value);

	/**
	 * Returns the value of the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Italic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Italic</em>' attribute.
	 * @see #setIsItalic(Boolean)
	 * @see DC.DCPackage#getFont_IsItalic()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsItalic();

	/**
	 * Sets the value of the '{@link DC.Font#getIsItalic <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Italic</em>' attribute.
	 * @see #getIsItalic()
	 * @generated
	 */
	void setIsItalic(Object value);

	/**
	 * Returns the value of the '<em><b>Is Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Underline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Underline</em>' attribute.
	 * @see #setIsUnderline(Boolean)
	 * @see DC.DCPackage#getFont_IsUnderline()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsUnderline();

	/**
	 * Sets the value of the '{@link DC.Font#getIsUnderline <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Underline</em>' attribute.
	 * @see #getIsUnderline()
	 * @generated
	 */
	void setIsUnderline(Object value);

	/**
	 * Returns the value of the '<em><b>Is Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strike Through</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strike Through</em>' attribute.
	 * @see #setIsStrikeThrough(Boolean)
	 * @see DC.DCPackage#getFont_IsStrikeThrough()
	 * @model dataType="DC.Boolean" ordered="false"
	 * @generated
	 */
	Object getIsStrikeThrough();

	/**
	 * Sets the value of the '{@link DC.Font#getIsStrikeThrough <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strike Through</em>' attribute.
	 * @see #getIsStrikeThrough()
	 * @generated
	 */
	void setIsStrikeThrough(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * size >=  0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean non_negative_size(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Font
