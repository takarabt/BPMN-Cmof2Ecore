/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmdi.impl;

import bpmdi.BPMNPlane;
import bpmdi.BpmdiPackage;

import bpmn2.BaseElement;

import di.impl.PlaneImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmdi.impl.BPMNPlaneImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNPlaneImpl extends PlaneImpl implements BPMNPlane {
	/**
	 * The cached value of the '{@link #getBpmnElement() <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement bpmnElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNPlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmdiPackage.Literals.BPMN_PLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getBpmnElement() {
		if (bpmnElement != null && bpmnElement.eIsProxy()) {
			InternalEObject oldBpmnElement = (InternalEObject)bpmnElement;
			bpmnElement = (BaseElement)eResolveProxy(oldBpmnElement);
			if (bpmnElement != oldBpmnElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
			}
		}
		return bpmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetBpmnElement() {
		return bpmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmnElement(BaseElement newBpmnElement) {
		BaseElement oldBpmnElement = bpmnElement;
		bpmnElement = newBpmnElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT:
				if (resolve) return getBpmnElement();
				return basicGetBpmnElement();
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
			case BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)newValue);
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
			case BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)null);
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
			case BpmdiPackage.BPMN_PLANE__BPMN_ELEMENT:
				return bpmnElement != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMNPlaneImpl
