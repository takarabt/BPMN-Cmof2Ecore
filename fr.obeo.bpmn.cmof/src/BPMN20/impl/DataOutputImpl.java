/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.DataOutput;
import BPMN20.OutputSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.DataOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.DataOutputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link BPMN20.impl.DataOutputImpl#getOutputSetWithOptional <em>Output Set With Optional</em>}</li>
 *   <li>{@link BPMN20.impl.DataOutputImpl#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}</li>
 *   <li>{@link BPMN20.impl.DataOutputImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataOutputImpl extends ItemAwareElementImpl implements DataOutput {
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
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getDataOutput();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DATA_OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DATA_OUTPUT__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputSet> getOutputSetWithOptional() {
		// TODO: implement this method to return the 'Output Set With Optional' reference list
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
	public EList<OutputSet> getOutputSetWithWhileExecuting() {
		// TODO: implement this method to return the 'Output Set With While Executing' reference list
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
		// TODO: implement this method to return the 'Output Set Refs' reference list
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.DATA_OUTPUT__NAME:
				return getName();
			case BPMN20Package.DATA_OUTPUT__IS_COLLECTION:
				return isIsCollection();
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
				return getOutputSetWithOptional();
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
				return getOutputSetWithWhileExecuting();
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_REFS:
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
			case BPMN20Package.DATA_OUTPUT__NAME:
				setName(newValue);
				return;
			case BPMN20Package.DATA_OUTPUT__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
				getOutputSetWithOptional().clear();
				getOutputSetWithOptional().addAll((Collection<? extends OutputSet>)newValue);
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
				getOutputSetWithWhileExecuting().clear();
				getOutputSetWithWhileExecuting().addAll((Collection<? extends OutputSet>)newValue);
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_REFS:
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
			case BPMN20Package.DATA_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.DATA_OUTPUT__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
				getOutputSetWithOptional().clear();
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
				getOutputSetWithWhileExecuting().clear();
				return;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_REFS:
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
			case BPMN20Package.DATA_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.DATA_OUTPUT__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL:
				return !getOutputSetWithOptional().isEmpty();
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING:
				return !getOutputSetWithWhileExecuting().isEmpty();
			case BPMN20Package.DATA_OUTPUT__OUTPUT_SET_REFS:
				return !getOutputSetRefs().isEmpty();
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
		result.append(", isCollection: ");
		result.append(isCollection);
		result.append(')');
		return result.toString();
	}

} //DataOutputImpl
