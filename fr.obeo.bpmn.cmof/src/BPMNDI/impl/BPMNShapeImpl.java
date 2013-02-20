/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI.impl;

import BPMN20.BaseElement;

import BPMNDI.BPMNDIPackage;
import BPMNDI.BPMNLabel;
import BPMNDI.BPMNShape;
import BPMNDI.ParticipantBandKind;

import DI.impl.LabeledShapeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getIsMessageVisible <em>Is Message Visible</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getParticipantBandKind <em>Participant Band Kind</em>}</li>
 *   <li>{@link BPMNDI.impl.BPMNShapeImpl#getChoreographyActivityShape <em>Choreography Activity Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNShapeImpl extends LabeledShapeImpl implements BPMNShape {
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
	 * The default value of the '{@link #getIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected Object isHorizontal = IS_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_EXPANDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExpanded()
	 * @generated
	 * @ordered
	 */
	protected Object isExpanded = IS_EXPANDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsMarkerVisible() <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMarkerVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_MARKER_VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMarkerVisible() <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMarkerVisible()
	 * @generated
	 * @ordered
	 */
	protected Object isMarkerVisible = IS_MARKER_VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected BPMNLabel label;

	/**
	 * The default value of the '{@link #getIsMessageVisible() <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMessageVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_MESSAGE_VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsMessageVisible() <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMessageVisible()
	 * @generated
	 * @ordered
	 */
	protected Object isMessageVisible = IS_MESSAGE_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParticipantBandKind() <em>Participant Band Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantBandKind()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipantBandKind PARTICIPANT_BAND_KIND_EDEFAULT = ParticipantBandKind.TOP_INITIATING;

	/**
	 * The cached value of the '{@link #getParticipantBandKind() <em>Participant Band Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantBandKind()
	 * @generated
	 * @ordered
	 */
	protected ParticipantBandKind participantBandKind = PARTICIPANT_BAND_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoreographyActivityShape() <em>Choreography Activity Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoreographyActivityShape()
	 * @generated
	 * @ordered
	 */
	protected BPMNShape choreographyActivityShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNDIPackage.Literals.BPMN_SHAPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT, oldBpmnElement, bpmnElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsHorizontal() {
		return isHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHorizontal(Object newIsHorizontal) {
		Object oldIsHorizontal = isHorizontal;
		isHorizontal = newIsHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__IS_HORIZONTAL, oldIsHorizontal, isHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsExpanded() {
		return isExpanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExpanded(Object newIsExpanded) {
		Object oldIsExpanded = isExpanded;
		isExpanded = newIsExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsMarkerVisible() {
		return isMarkerVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMarkerVisible(Object newIsMarkerVisible) {
		Object oldIsMarkerVisible = isMarkerVisible;
		isMarkerVisible = newIsMarkerVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__IS_MARKER_VISIBLE, oldIsMarkerVisible, isMarkerVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(BPMNLabel newLabel, NotificationChain msgs) {
		BPMNLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(BPMNLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNDIPackage.BPMN_SHAPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNDIPackage.BPMN_SHAPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsMessageVisible() {
		return isMessageVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMessageVisible(Object newIsMessageVisible) {
		Object oldIsMessageVisible = isMessageVisible;
		isMessageVisible = newIsMessageVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE, oldIsMessageVisible, isMessageVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind getParticipantBandKind() {
		return participantBandKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantBandKind(ParticipantBandKind newParticipantBandKind) {
		ParticipantBandKind oldParticipantBandKind = participantBandKind;
		participantBandKind = newParticipantBandKind == null ? PARTICIPANT_BAND_KIND_EDEFAULT : newParticipantBandKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND, oldParticipantBandKind, participantBandKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShape getChoreographyActivityShape() {
		if (choreographyActivityShape != null && choreographyActivityShape.eIsProxy()) {
			InternalEObject oldChoreographyActivityShape = (InternalEObject)choreographyActivityShape;
			choreographyActivityShape = (BPMNShape)eResolveProxy(oldChoreographyActivityShape);
			if (choreographyActivityShape != oldChoreographyActivityShape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, oldChoreographyActivityShape, choreographyActivityShape));
			}
		}
		return choreographyActivityShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShape basicGetChoreographyActivityShape() {
		return choreographyActivityShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoreographyActivityShape(BPMNShape newChoreographyActivityShape) {
		BPMNShape oldChoreographyActivityShape = choreographyActivityShape;
		choreographyActivityShape = newChoreographyActivityShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, oldChoreographyActivityShape, choreographyActivityShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNDIPackage.BPMN_SHAPE__LABEL:
				return basicSetLabel(null, msgs);
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
			case BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT:
				if (resolve) return getBpmnElement();
				return basicGetBpmnElement();
			case BPMNDIPackage.BPMN_SHAPE__IS_HORIZONTAL:
				return getIsHorizontal();
			case BPMNDIPackage.BPMN_SHAPE__IS_EXPANDED:
				return getIsExpanded();
			case BPMNDIPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
				return getIsMarkerVisible();
			case BPMNDIPackage.BPMN_SHAPE__LABEL:
				return getLabel();
			case BPMNDIPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
				return getIsMessageVisible();
			case BPMNDIPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
				return getParticipantBandKind();
			case BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
				if (resolve) return getChoreographyActivityShape();
				return basicGetChoreographyActivityShape();
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
			case BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_HORIZONTAL:
				setIsHorizontal((Object)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_EXPANDED:
				setIsExpanded((Object)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
				setIsMarkerVisible((Object)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__LABEL:
				setLabel((BPMNLabel)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
				setIsMessageVisible((Object)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
				setParticipantBandKind((ParticipantBandKind)newValue);
				return;
			case BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
				setChoreographyActivityShape((BPMNShape)newValue);
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
			case BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT:
				setBpmnElement((BaseElement)null);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_HORIZONTAL:
				setIsHorizontal(IS_HORIZONTAL_EDEFAULT);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_EXPANDED:
				setIsExpanded(IS_EXPANDED_EDEFAULT);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
				setIsMarkerVisible(IS_MARKER_VISIBLE_EDEFAULT);
				return;
			case BPMNDIPackage.BPMN_SHAPE__LABEL:
				setLabel((BPMNLabel)null);
				return;
			case BPMNDIPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
				setIsMessageVisible(IS_MESSAGE_VISIBLE_EDEFAULT);
				return;
			case BPMNDIPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
				setParticipantBandKind(PARTICIPANT_BAND_KIND_EDEFAULT);
				return;
			case BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
				setChoreographyActivityShape((BPMNShape)null);
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
			case BPMNDIPackage.BPMN_SHAPE__BPMN_ELEMENT:
				return bpmnElement != null;
			case BPMNDIPackage.BPMN_SHAPE__IS_HORIZONTAL:
				return IS_HORIZONTAL_EDEFAULT == null ? isHorizontal != null : !IS_HORIZONTAL_EDEFAULT.equals(isHorizontal);
			case BPMNDIPackage.BPMN_SHAPE__IS_EXPANDED:
				return IS_EXPANDED_EDEFAULT == null ? isExpanded != null : !IS_EXPANDED_EDEFAULT.equals(isExpanded);
			case BPMNDIPackage.BPMN_SHAPE__IS_MARKER_VISIBLE:
				return IS_MARKER_VISIBLE_EDEFAULT == null ? isMarkerVisible != null : !IS_MARKER_VISIBLE_EDEFAULT.equals(isMarkerVisible);
			case BPMNDIPackage.BPMN_SHAPE__LABEL:
				return label != null;
			case BPMNDIPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE:
				return IS_MESSAGE_VISIBLE_EDEFAULT == null ? isMessageVisible != null : !IS_MESSAGE_VISIBLE_EDEFAULT.equals(isMessageVisible);
			case BPMNDIPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND:
				return participantBandKind != PARTICIPANT_BAND_KIND_EDEFAULT;
			case BPMNDIPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE:
				return choreographyActivityShape != null;
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
		result.append(" (isHorizontal: ");
		result.append(isHorizontal);
		result.append(", isExpanded: ");
		result.append(isExpanded);
		result.append(", isMarkerVisible: ");
		result.append(isMarkerVisible);
		result.append(", isMessageVisible: ");
		result.append(isMessageVisible);
		result.append(", participantBandKind: ");
		result.append(participantBandKind);
		result.append(')');
		return result.toString();
	}

} //BPMNShapeImpl
