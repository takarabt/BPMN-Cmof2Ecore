/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.Artifact;
import BPMN20.BPMN20Package;
import BPMN20.FlowElement;
import BPMN20.FlowElementsContainer;
import BPMN20.LaneSet;
import BPMN20.SubProcess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.SubProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link BPMN20.impl.SubProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link BPMN20.impl.SubProcessImpl#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link BPMN20.impl.SubProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubProcessImpl extends ActivityImpl implements SubProcess {
	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneSets()
	 * @generated
	 * @ordered
	 */
	protected EList<LaneSet> laneSets;

	/**
	 * The default value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggeredByEvent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGERED_BY_EVENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggeredByEvent()
	 * @generated
	 * @ordered
	 */
	protected boolean triggeredByEvent = TRIGGERED_BY_EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getSubProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS);
		}
		return flowElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaneSet> getLaneSets() {
		if (laneSets == null) {
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class, this, BPMN20Package.SUB_PROCESS__LANE_SETS);
		}
		return laneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriggeredByEvent() {
		return triggeredByEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredByEvent(boolean newTriggeredByEvent) {
		boolean oldTriggeredByEvent = triggeredByEvent;
		triggeredByEvent = newTriggeredByEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.SUB_PROCESS__TRIGGERED_BY_EVENT, oldTriggeredByEvent, triggeredByEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, BPMN20Package.SUB_PROCESS__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
			case BPMN20Package.SUB_PROCESS__LANE_SETS:
				return ((InternalEList<?>)getLaneSets()).basicRemove(otherEnd, msgs);
			case BPMN20Package.SUB_PROCESS__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS:
				return getFlowElements();
			case BPMN20Package.SUB_PROCESS__LANE_SETS:
				return getLaneSets();
			case BPMN20Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
				return isTriggeredByEvent();
			case BPMN20Package.SUB_PROCESS__ARTIFACTS:
				return getArtifacts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case BPMN20Package.SUB_PROCESS__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
				return;
			case BPMN20Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
				setTriggeredByEvent((Boolean)newValue);
				return;
			case BPMN20Package.SUB_PROCESS__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case BPMN20Package.SUB_PROCESS__LANE_SETS:
				getLaneSets().clear();
				return;
			case BPMN20Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
				setTriggeredByEvent(TRIGGERED_BY_EVENT_EDEFAULT);
				return;
			case BPMN20Package.SUB_PROCESS__ARTIFACTS:
				getArtifacts().clear();
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
			case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
			case BPMN20Package.SUB_PROCESS__LANE_SETS:
				return laneSets != null && !laneSets.isEmpty();
			case BPMN20Package.SUB_PROCESS__TRIGGERED_BY_EVENT:
				return triggeredByEvent != TRIGGERED_BY_EVENT_EDEFAULT;
			case BPMN20Package.SUB_PROCESS__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
				case BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS: return BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				case BPMN20Package.SUB_PROCESS__LANE_SETS: return BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
				case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS: return BPMN20Package.SUB_PROCESS__FLOW_ELEMENTS;
				case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS: return BPMN20Package.SUB_PROCESS__LANE_SETS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (triggeredByEvent: ");
		result.append(triggeredByEvent);
		result.append(')');
		return result.toString();
	}

} //SubProcessImpl
