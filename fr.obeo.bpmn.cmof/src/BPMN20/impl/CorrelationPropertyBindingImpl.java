/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.CorrelationProperty;
import BPMN20.CorrelationPropertyBinding;
import BPMN20.FormalExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.CorrelationPropertyBindingImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link BPMN20.impl.CorrelationPropertyBindingImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyBindingImpl extends BaseElementImpl implements CorrelationPropertyBinding {
	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected FormalExpression dataPath;

	/**
	 * The cached value of the '{@link #getCorrelationPropertyRef() <em>Correlation Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected CorrelationProperty correlationPropertyRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getCorrelationPropertyBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPath(FormalExpression newDataPath, NotificationChain msgs) {
		FormalExpression oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH, oldDataPath, newDataPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(FormalExpression newDataPath) {
		if (newDataPath != dataPath) {
			NotificationChain msgs = null;
			if (dataPath != null)
				msgs = ((InternalEObject)dataPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH, null, msgs);
			if (newDataPath != null)
				msgs = ((InternalEObject)newDataPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH, null, msgs);
			msgs = basicSetDataPath(newDataPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH, newDataPath, newDataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty getCorrelationPropertyRef() {
		if (correlationPropertyRef != null && correlationPropertyRef.eIsProxy()) {
			InternalEObject oldCorrelationPropertyRef = (InternalEObject)correlationPropertyRef;
			correlationPropertyRef = (CorrelationProperty)eResolveProxy(oldCorrelationPropertyRef);
			if (correlationPropertyRef != oldCorrelationPropertyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF, oldCorrelationPropertyRef, correlationPropertyRef));
			}
		}
		return correlationPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty basicGetCorrelationPropertyRef() {
		return correlationPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyRef(CorrelationProperty newCorrelationPropertyRef) {
		CorrelationProperty oldCorrelationPropertyRef = correlationPropertyRef;
		correlationPropertyRef = newCorrelationPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF, oldCorrelationPropertyRef, correlationPropertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				return basicSetDataPath(null, msgs);
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
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				return getDataPath();
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				if (resolve) return getCorrelationPropertyRef();
				return basicGetCorrelationPropertyRef();
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
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				setDataPath((FormalExpression)newValue);
				return;
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				setCorrelationPropertyRef((CorrelationProperty)newValue);
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
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				setDataPath((FormalExpression)null);
				return;
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				setCorrelationPropertyRef((CorrelationProperty)null);
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
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				return dataPath != null;
			case BPMN20Package.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				return correlationPropertyRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyBindingImpl
