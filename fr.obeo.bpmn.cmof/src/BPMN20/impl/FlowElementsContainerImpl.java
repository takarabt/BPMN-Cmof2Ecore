/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.FlowElement;
import BPMN20.FlowElementsContainer;
import BPMN20.LaneSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.FlowElementsContainerImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link BPMN20.impl.FlowElementsContainerImpl#getLaneSets <em>Lane Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowElementsContainerImpl extends BaseElementImpl implements FlowElementsContainer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementsContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getFlowElementsContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		if (flowElements == null) {
			flowElements = new EObjectContainmentEList<FlowElement>(FlowElement.class, this, BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS);
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
			laneSets = new EObjectContainmentEList<LaneSet>(LaneSet.class, this, BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS);
		}
		return laneSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return ((InternalEList<?>)getFlowElements()).basicRemove(otherEnd, msgs);
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return ((InternalEList<?>)getLaneSets()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return getFlowElements();
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return getLaneSets();
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
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
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
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				getLaneSets().clear();
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
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS:
				return flowElements != null && !flowElements.isEmpty();
			case BPMN20Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS:
				return laneSets != null && !laneSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowElementsContainerImpl
