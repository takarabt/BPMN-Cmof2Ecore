/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.DataOutput;
import BPMN20.InputSet;
import BPMN20.OutputSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link BPMN20.impl.OutputSetImpl#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link BPMN20.impl.OutputSetImpl#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link BPMN20.impl.OutputSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.OutputSetImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSetImpl extends BaseElementImpl implements OutputSet {
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
	 * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSetRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSet> inputSetRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getOutputSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getDataOutputRefs() {
		// TODO: implement this method to return the 'Data Output Refs' reference list
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
	public EList<DataOutput> getOptionalOutputRefs() {
		// TODO: implement this method to return the 'Optional Output Refs' reference list
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
	public EList<DataOutput> getWhileExecutingOutputRefs() {
		// TODO: implement this method to return the 'While Executing Output Refs' reference list
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.OUTPUT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSetRefs() {
		if (inputSetRefs == null) {
			inputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>(InputSet.class, this, BPMN20Package.OUTPUT_SET__INPUT_SET_REFS, BPMN20Package.INPUT_SET__OUTPUT_SET_REFS);
		}
		return inputSetRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSetRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				return ((InternalEList<?>)getInputSetRefs()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.OUTPUT_SET__DATA_OUTPUT_REFS:
				return getDataOutputRefs();
			case BPMN20Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				return getOptionalOutputRefs();
			case BPMN20Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				return getWhileExecutingOutputRefs();
			case BPMN20Package.OUTPUT_SET__NAME:
				return getName();
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				return getInputSetRefs();
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
			case BPMN20Package.OUTPUT_SET__DATA_OUTPUT_REFS:
				getDataOutputRefs().clear();
				getDataOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BPMN20Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				getOptionalOutputRefs().clear();
				getOptionalOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BPMN20Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				getWhileExecutingOutputRefs().clear();
				getWhileExecutingOutputRefs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BPMN20Package.OUTPUT_SET__NAME:
				setName(newValue);
				return;
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				getInputSetRefs().clear();
				getInputSetRefs().addAll((Collection<? extends InputSet>)newValue);
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
			case BPMN20Package.OUTPUT_SET__DATA_OUTPUT_REFS:
				getDataOutputRefs().clear();
				return;
			case BPMN20Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				getOptionalOutputRefs().clear();
				return;
			case BPMN20Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				getWhileExecutingOutputRefs().clear();
				return;
			case BPMN20Package.OUTPUT_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				getInputSetRefs().clear();
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
			case BPMN20Package.OUTPUT_SET__DATA_OUTPUT_REFS:
				return !getDataOutputRefs().isEmpty();
			case BPMN20Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS:
				return !getOptionalOutputRefs().isEmpty();
			case BPMN20Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS:
				return !getWhileExecutingOutputRefs().isEmpty();
			case BPMN20Package.OUTPUT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.OUTPUT_SET__INPUT_SET_REFS:
				return inputSetRefs != null && !inputSetRefs.isEmpty();
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

} //OutputSetImpl
