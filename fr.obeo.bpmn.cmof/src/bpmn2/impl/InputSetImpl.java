/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.impl;

import bpmn2.Bpmn2Package;
import bpmn2.DataInput;
import bpmn2.InputSet;
import bpmn2.OutputSet;

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
 * An implementation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmn2.impl.InputSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn2.impl.InputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link bpmn2.impl.InputSetImpl#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link bpmn2.impl.InputSetImpl#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link bpmn2.impl.InputSetImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSetImpl extends BaseElementImpl implements InputSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSetRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputSet> outputSetRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getInputSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.INPUT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInput> getDataInputRefs() {
		// TODO: implement this method to return the 'Data Input Refs' reference list
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
	public EList<DataInput> getOptionalInputRefs() {
		// TODO: implement this method to return the 'Optional Input Refs' reference list
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
	public EList<DataInput> getWhileExecutingInputRefs() {
		// TODO: implement this method to return the 'While Executing Input Refs' reference list
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
	public EList<OutputSet> getOutputSetRefs() {
		if (outputSetRefs == null) {
			outputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<OutputSet>(OutputSet.class, this, Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS, Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS);
		}
		return outputSetRefs;
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
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputSetRefs()).basicAdd(otherEnd, msgs);
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
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				return ((InternalEList<?>)getOutputSetRefs()).basicRemove(otherEnd, msgs);
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
			case Bpmn2Package.INPUT_SET__NAME:
				return getName();
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
				return getDataInputRefs();
			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
				return getOptionalInputRefs();
			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return getWhileExecutingInputRefs();
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				return getOutputSetRefs();
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
			case Bpmn2Package.INPUT_SET__NAME:
				setName((String)newValue);
				return;
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
				getDataInputRefs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				getOptionalInputRefs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				getWhileExecutingInputRefs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				getOutputSetRefs().clear();
				getOutputSetRefs().addAll((Collection<? extends OutputSet>)newValue);
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
			case Bpmn2Package.INPUT_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
				return;
			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				return;
			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				return;
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				getOutputSetRefs().clear();
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
			case Bpmn2Package.INPUT_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS:
				return !getDataInputRefs().isEmpty();
			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS:
				return !getOptionalInputRefs().isEmpty();
			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return !getWhileExecutingInputRefs().isEmpty();
			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS:
				return outputSetRefs != null && !outputSetRefs.isEmpty();
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

} //InputSetImpl
