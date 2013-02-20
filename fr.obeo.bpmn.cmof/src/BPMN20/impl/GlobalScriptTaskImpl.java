/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.GlobalScriptTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.GlobalScriptTaskImpl#getScriptLanguage <em>Script Language</em>}</li>
 *   <li>{@link BPMN20.impl.GlobalScriptTaskImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalScriptTaskImpl extends GlobalTaskImpl implements GlobalScriptTask {
	/**
	 * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCRIPT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptLanguage()
	 * @generated
	 * @ordered
	 */
	protected Object scriptLanguage = SCRIPT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected Object script = SCRIPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalScriptTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getGlobalScriptTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScriptLanguage() {
		return scriptLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptLanguage(Object newScriptLanguage) {
		Object oldScriptLanguage = scriptLanguage;
		scriptLanguage = newScriptLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE, oldScriptLanguage, scriptLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Object newScript) {
		Object oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
				return getScriptLanguage();
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT:
				return getScript();
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
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
				setScriptLanguage(newValue);
				return;
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT:
				setScript(newValue);
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
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
				setScriptLanguage(SCRIPT_LANGUAGE_EDEFAULT);
				return;
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
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
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE:
				return SCRIPT_LANGUAGE_EDEFAULT == null ? scriptLanguage != null : !SCRIPT_LANGUAGE_EDEFAULT.equals(scriptLanguage);
			case BPMN20Package.GLOBAL_SCRIPT_TASK__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
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
		result.append(" (scriptLanguage: ");
		result.append(scriptLanguage);
		result.append(", script: ");
		result.append(script);
		result.append(')');
		return result.toString();
	}

} //GlobalScriptTaskImpl
