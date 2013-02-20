/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.Association;
import BPMN20.AssociationDirection;
import BPMN20.BPMN20Package;
import BPMN20.BaseElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.AssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link BPMN20.impl.AssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link BPMN20.impl.AssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ArtifactImpl implements Association {
	/**
	 * The default value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = AssociationDirection.NONE;

	/**
	 * The cached value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationDirection()
	 * @generated
	 * @ordered
	 */
	protected AssociationDirection associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected BaseElement sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected BaseElement targetRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection getAssociationDirection() {
		return associationDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationDirection(AssociationDirection newAssociationDirection) {
		AssociationDirection oldAssociationDirection = associationDirection;
		associationDirection = newAssociationDirection == null ? ASSOCIATION_DIRECTION_EDEFAULT : newAssociationDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.ASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, associationDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject)sourceRef;
			sourceRef = (BaseElement)eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.ASSOCIATION__SOURCE_REF, oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(BaseElement newSourceRef) {
		BaseElement oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.ASSOCIATION__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getTargetRef() {
		if (targetRef != null && targetRef.eIsProxy()) {
			InternalEObject oldTargetRef = (InternalEObject)targetRef;
			targetRef = (BaseElement)eResolveProxy(oldTargetRef);
			if (targetRef != oldTargetRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.ASSOCIATION__TARGET_REF, oldTargetRef, targetRef));
			}
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(BaseElement newTargetRef) {
		BaseElement oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.ASSOCIATION__TARGET_REF, oldTargetRef, targetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.ASSOCIATION__ASSOCIATION_DIRECTION:
				return getAssociationDirection();
			case BPMN20Package.ASSOCIATION__SOURCE_REF:
				if (resolve) return getSourceRef();
				return basicGetSourceRef();
			case BPMN20Package.ASSOCIATION__TARGET_REF:
				if (resolve) return getTargetRef();
				return basicGetTargetRef();
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
			case BPMN20Package.ASSOCIATION__ASSOCIATION_DIRECTION:
				setAssociationDirection((AssociationDirection)newValue);
				return;
			case BPMN20Package.ASSOCIATION__SOURCE_REF:
				setSourceRef((BaseElement)newValue);
				return;
			case BPMN20Package.ASSOCIATION__TARGET_REF:
				setTargetRef((BaseElement)newValue);
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
			case BPMN20Package.ASSOCIATION__ASSOCIATION_DIRECTION:
				setAssociationDirection(ASSOCIATION_DIRECTION_EDEFAULT);
				return;
			case BPMN20Package.ASSOCIATION__SOURCE_REF:
				setSourceRef((BaseElement)null);
				return;
			case BPMN20Package.ASSOCIATION__TARGET_REF:
				setTargetRef((BaseElement)null);
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
			case BPMN20Package.ASSOCIATION__ASSOCIATION_DIRECTION:
				return associationDirection != ASSOCIATION_DIRECTION_EDEFAULT;
			case BPMN20Package.ASSOCIATION__SOURCE_REF:
				return sourceRef != null;
			case BPMN20Package.ASSOCIATION__TARGET_REF:
				return targetRef != null;
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
		result.append(" (associationDirection: ");
		result.append(associationDirection);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
