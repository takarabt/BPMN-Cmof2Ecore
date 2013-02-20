/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.Expression;
import BPMN20.StandardLoopCharacteristics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.StandardLoopCharacteristicsImpl#isTestBefore <em>Test Before</em>}</li>
 *   <li>{@link BPMN20.impl.StandardLoopCharacteristicsImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link BPMN20.impl.StandardLoopCharacteristicsImpl#getLoopMaximum <em>Loop Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements StandardLoopCharacteristics {
	/**
	 * The default value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEST_BEFORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestBefore()
	 * @generated
	 * @ordered
	 */
	protected boolean testBefore = TEST_BEFORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression loopCondition;

	/**
	 * The cached value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopMaximum()
	 * @generated
	 * @ordered
	 */
	protected Expression loopMaximum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getStandardLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestBefore() {
		return testBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestBefore(boolean newTestBefore) {
		boolean oldTestBefore = testBefore;
		testBefore = newTestBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE, oldTestBefore, testBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopCondition() {
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition(Expression newLoopCondition, NotificationChain msgs) {
		Expression oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, oldLoopCondition, newLoopCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCondition(Expression newLoopCondition) {
		if (newLoopCondition != loopCondition) {
			NotificationChain msgs = null;
			if (loopCondition != null)
				msgs = ((InternalEObject)loopCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, null, msgs);
			if (newLoopCondition != null)
				msgs = ((InternalEObject)newLoopCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, null, msgs);
			msgs = basicSetLoopCondition(newLoopCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, newLoopCondition, newLoopCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopMaximum() {
		return loopMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopMaximum(Expression newLoopMaximum, NotificationChain msgs) {
		Expression oldLoopMaximum = loopMaximum;
		loopMaximum = newLoopMaximum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, oldLoopMaximum, newLoopMaximum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopMaximum(Expression newLoopMaximum) {
		if (newLoopMaximum != loopMaximum) {
			NotificationChain msgs = null;
			if (loopMaximum != null)
				msgs = ((InternalEObject)loopMaximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, null, msgs);
			if (newLoopMaximum != null)
				msgs = ((InternalEObject)newLoopMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, null, msgs);
			msgs = basicSetLoopMaximum(newLoopMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, newLoopMaximum, newLoopMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				return basicSetLoopCondition(null, msgs);
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				return basicSetLoopMaximum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				return isTestBefore();
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				return getLoopCondition();
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				return getLoopMaximum();
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
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				setTestBefore((Boolean)newValue);
				return;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				setLoopCondition((Expression)newValue);
				return;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				setLoopMaximum((Expression)newValue);
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
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				setTestBefore(TEST_BEFORE_EDEFAULT);
				return;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				setLoopCondition((Expression)null);
				return;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				setLoopMaximum((Expression)null);
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
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE:
				return testBefore != TEST_BEFORE_EDEFAULT;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION:
				return loopCondition != null;
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM:
				return loopMaximum != null;
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
		result.append(" (testBefore: ");
		result.append(testBefore);
		result.append(')');
		return result.toString();
	}

} //StandardLoopCharacteristicsImpl
