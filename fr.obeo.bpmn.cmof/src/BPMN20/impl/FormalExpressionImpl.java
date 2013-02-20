/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.FormalExpression;
import BPMN20.ItemDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.FormalExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link BPMN20.impl.FormalExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link BPMN20.impl.FormalExpressionImpl#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalExpressionImpl extends ExpressionImpl implements FormalExpression {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Object language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EObject body;

	/**
	 * The cached value of the '{@link #getEvaluatesToTypeRef() <em>Evaluates To Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatesToTypeRef()
	 * @generated
	 * @ordered
	 */
	protected ItemDefinition evaluatesToTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getFormalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Object newLanguage) {
		Object oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.FORMAL_EXPRESSION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBody() {
		if (body != null && body.eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = eResolveProxy(oldBody);
			if (body != oldBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.FORMAL_EXPRESSION__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(EObject newBody) {
		EObject oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.FORMAL_EXPRESSION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getEvaluatesToTypeRef() {
		if (evaluatesToTypeRef != null && evaluatesToTypeRef.eIsProxy()) {
			InternalEObject oldEvaluatesToTypeRef = (InternalEObject)evaluatesToTypeRef;
			evaluatesToTypeRef = (ItemDefinition)eResolveProxy(oldEvaluatesToTypeRef);
			if (evaluatesToTypeRef != oldEvaluatesToTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF, oldEvaluatesToTypeRef, evaluatesToTypeRef));
			}
		}
		return evaluatesToTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetEvaluatesToTypeRef() {
		return evaluatesToTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluatesToTypeRef(ItemDefinition newEvaluatesToTypeRef) {
		ItemDefinition oldEvaluatesToTypeRef = evaluatesToTypeRef;
		evaluatesToTypeRef = newEvaluatesToTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF, oldEvaluatesToTypeRef, evaluatesToTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.FORMAL_EXPRESSION__LANGUAGE:
				return getLanguage();
			case BPMN20Package.FORMAL_EXPRESSION__BODY:
				if (resolve) return getBody();
				return basicGetBody();
			case BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				if (resolve) return getEvaluatesToTypeRef();
				return basicGetEvaluatesToTypeRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN20Package.FORMAL_EXPRESSION__LANGUAGE:
				setLanguage(newValue);
				return;
			case BPMN20Package.FORMAL_EXPRESSION__BODY:
				setBody((EObject)newValue);
				return;
			case BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				setEvaluatesToTypeRef((ItemDefinition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BPMN20Package.FORMAL_EXPRESSION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case BPMN20Package.FORMAL_EXPRESSION__BODY:
				setBody((EObject)null);
				return;
			case BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				setEvaluatesToTypeRef((ItemDefinition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BPMN20Package.FORMAL_EXPRESSION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case BPMN20Package.FORMAL_EXPRESSION__BODY:
				return body != null;
			case BPMN20Package.FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF:
				return evaluatesToTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //FormalExpressionImpl
