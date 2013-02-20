/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.BaseElement;
import BPMN20.FlowNode;
import BPMN20.Lane;
import BPMN20.LaneSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.LaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link BPMN20.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link BPMN20.impl.LaneImpl#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link BPMN20.impl.LaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneImpl extends BaseElementImpl implements Lane {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildLaneSet() <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildLaneSet()
	 * @generated
	 * @ordered
	 */
	protected LaneSet childLaneSet;

	/**
	 * The cached value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElementRef()
	 * @generated
	 * @ordered
	 */
	protected BaseElement partitionElementRef;

	/**
	 * The cached value of the '{@link #getPartitionElement() <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionElement()
	 * @generated
	 * @ordered
	 */
	protected BaseElement partitionElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getLane();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getChildLaneSet() {
		return childLaneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildLaneSet(LaneSet newChildLaneSet, NotificationChain msgs) {
		LaneSet oldChildLaneSet = childLaneSet;
		childLaneSet = newChildLaneSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__CHILD_LANE_SET, oldChildLaneSet, newChildLaneSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildLaneSet(LaneSet newChildLaneSet) {
		if (newChildLaneSet != childLaneSet) {
			NotificationChain msgs = null;
			if (childLaneSet != null)
				msgs = ((InternalEObject)childLaneSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.LANE__CHILD_LANE_SET, null, msgs);
			if (newChildLaneSet != null)
				msgs = ((InternalEObject)newChildLaneSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.LANE__CHILD_LANE_SET, null, msgs);
			msgs = basicSetChildLaneSet(newChildLaneSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__CHILD_LANE_SET, newChildLaneSet, newChildLaneSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElementRef() {
		if (partitionElementRef != null && partitionElementRef.eIsProxy()) {
			InternalEObject oldPartitionElementRef = (InternalEObject)partitionElementRef;
			partitionElementRef = (BaseElement)eResolveProxy(oldPartitionElementRef);
			if (partitionElementRef != oldPartitionElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
			}
		}
		return partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetPartitionElementRef() {
		return partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElementRef(BaseElement newPartitionElementRef) {
		BaseElement oldPartitionElementRef = partitionElementRef;
		partitionElementRef = newPartitionElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNode> getFlowNodeRefs() {
		// TODO: implement this method to return the 'Flow Node Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElement() {
		return partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionElement(BaseElement newPartitionElement, NotificationChain msgs) {
		BaseElement oldPartitionElement = partitionElement;
		partitionElement = newPartitionElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__PARTITION_ELEMENT, oldPartitionElement, newPartitionElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElement(BaseElement newPartitionElement) {
		if (newPartitionElement != partitionElement) {
			NotificationChain msgs = null;
			if (partitionElement != null)
				msgs = ((InternalEObject)partitionElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.LANE__PARTITION_ELEMENT, null, msgs);
			if (newPartitionElement != null)
				msgs = ((InternalEObject)newPartitionElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMN20Package.LANE__PARTITION_ELEMENT, null, msgs);
			msgs = basicSetPartitionElement(newPartitionElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.LANE__PARTITION_ELEMENT, newPartitionElement, newPartitionElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.LANE__CHILD_LANE_SET:
				return basicSetChildLaneSet(null, msgs);
			case BPMN20Package.LANE__PARTITION_ELEMENT:
				return basicSetPartitionElement(null, msgs);
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
			case BPMN20Package.LANE__NAME:
				return getName();
			case BPMN20Package.LANE__CHILD_LANE_SET:
				return getChildLaneSet();
			case BPMN20Package.LANE__PARTITION_ELEMENT_REF:
				if (resolve) return getPartitionElementRef();
				return basicGetPartitionElementRef();
			case BPMN20Package.LANE__FLOW_NODE_REFS:
				return getFlowNodeRefs();
			case BPMN20Package.LANE__PARTITION_ELEMENT:
				return getPartitionElement();
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
			case BPMN20Package.LANE__NAME:
				setName(newValue);
				return;
			case BPMN20Package.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)newValue);
				return;
			case BPMN20Package.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)newValue);
				return;
			case BPMN20Package.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				getFlowNodeRefs().addAll((Collection<? extends FlowNode>)newValue);
				return;
			case BPMN20Package.LANE__PARTITION_ELEMENT:
				setPartitionElement((BaseElement)newValue);
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
			case BPMN20Package.LANE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)null);
				return;
			case BPMN20Package.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)null);
				return;
			case BPMN20Package.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				return;
			case BPMN20Package.LANE__PARTITION_ELEMENT:
				setPartitionElement((BaseElement)null);
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
			case BPMN20Package.LANE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.LANE__CHILD_LANE_SET:
				return childLaneSet != null;
			case BPMN20Package.LANE__PARTITION_ELEMENT_REF:
				return partitionElementRef != null;
			case BPMN20Package.LANE__FLOW_NODE_REFS:
				return !getFlowNodeRefs().isEmpty();
			case BPMN20Package.LANE__PARTITION_ELEMENT:
				return partitionElement != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LaneImpl