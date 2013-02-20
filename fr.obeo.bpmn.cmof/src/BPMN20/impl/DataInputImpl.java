/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.DataInput;
import BPMN20.InputSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.DataInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.DataInputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link BPMN20.impl.DataInputImpl#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link BPMN20.impl.DataInputImpl#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link BPMN20.impl.DataInputImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInputImpl extends ItemAwareElementImpl implements DataInput {
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
	protected DataInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getDataInput();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DATA_INPUT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DATA_INPUT__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSetWithOptional() {
		// TODO: implement this method to return the 'Input Set With Optional' reference list
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
	public EList<InputSet> getInputSetWithWhileExecuting() {
		// TODO: implement this method to return the 'Input Set With While Executing' reference list
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
	public EList<InputSet> getInputSetRefs() {
		// TODO: implement this method to return the 'Input Set Refs' reference list
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
			case BPMN20Package.DATA_INPUT__NAME:
				return getName();
			case BPMN20Package.DATA_INPUT__IS_COLLECTION:
				return isIsCollection();
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return getInputSetWithOptional();
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return getInputSetWithWhileExecuting();
			case BPMN20Package.DATA_INPUT__INPUT_SET_REFS:
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
			case BPMN20Package.DATA_INPUT__NAME:
				setName(newValue);
				return;
			case BPMN20Package.DATA_INPUT__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				getInputSetWithOptional().clear();
				getInputSetWithOptional().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				getInputSetWithWhileExecuting().clear();
				getInputSetWithWhileExecuting().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_REFS:
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
			case BPMN20Package.DATA_INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.DATA_INPUT__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				getInputSetWithOptional().clear();
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				getInputSetWithWhileExecuting().clear();
				return;
			case BPMN20Package.DATA_INPUT__INPUT_SET_REFS:
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
			case BPMN20Package.DATA_INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.DATA_INPUT__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL:
				return !getInputSetWithOptional().isEmpty();
			case BPMN20Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING:
				return !getInputSetWithWhileExecuting().isEmpty();
			case BPMN20Package.DATA_INPUT__INPUT_SET_REFS:
				return !getInputSetRefs().isEmpty();
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

} //DataInputImpl
