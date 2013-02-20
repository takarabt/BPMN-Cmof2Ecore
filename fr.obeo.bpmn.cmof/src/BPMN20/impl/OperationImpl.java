/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.Message;
import BPMN20.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.OperationImpl#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link BPMN20.impl.OperationImpl#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link BPMN20.impl.OperationImpl#getErrorRefs <em>Error Refs</em>}</li>
 *   <li>{@link BPMN20.impl.OperationImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BaseElementImpl implements Operation {
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
	 * The cached value of the '{@link #getInMessageRef() <em>In Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMessageRef()
	 * @generated
	 * @ordered
	 */
	protected Message inMessageRef;

	/**
	 * The cached value of the '{@link #getOutMessageRef() <em>Out Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMessageRef()
	 * @generated
	 * @ordered
	 */
	protected Message outMessageRef;

	/**
	 * The cached value of the '{@link #getErrorRefs() <em>Error Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMN20.Error> errorRefs;

	/**
	 * The cached value of the '{@link #getImplementationRef() <em>Implementation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationRef()
	 * @generated
	 * @ordered
	 */
	protected EObject implementationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getOperation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getInMessageRef() {
		if (inMessageRef != null && inMessageRef.eIsProxy()) {
			InternalEObject oldInMessageRef = (InternalEObject)inMessageRef;
			inMessageRef = (Message)eResolveProxy(oldInMessageRef);
			if (inMessageRef != oldInMessageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.OPERATION__IN_MESSAGE_REF, oldInMessageRef, inMessageRef));
			}
		}
		return inMessageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetInMessageRef() {
		return inMessageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMessageRef(Message newInMessageRef) {
		Message oldInMessageRef = inMessageRef;
		inMessageRef = newInMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.OPERATION__IN_MESSAGE_REF, oldInMessageRef, inMessageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getOutMessageRef() {
		if (outMessageRef != null && outMessageRef.eIsProxy()) {
			InternalEObject oldOutMessageRef = (InternalEObject)outMessageRef;
			outMessageRef = (Message)eResolveProxy(oldOutMessageRef);
			if (outMessageRef != oldOutMessageRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.OPERATION__OUT_MESSAGE_REF, oldOutMessageRef, outMessageRef));
			}
		}
		return outMessageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetOutMessageRef() {
		return outMessageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutMessageRef(Message newOutMessageRef) {
		Message oldOutMessageRef = outMessageRef;
		outMessageRef = newOutMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.OPERATION__OUT_MESSAGE_REF, oldOutMessageRef, outMessageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMN20.Error> getErrorRefs() {
		if (errorRefs == null) {
			errorRefs = new EObjectResolvingEList<BPMN20.Error>(BPMN20.Error.class, this, BPMN20Package.OPERATION__ERROR_REFS);
		}
		return errorRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getImplementationRef() {
		if (implementationRef != null && implementationRef.eIsProxy()) {
			InternalEObject oldImplementationRef = (InternalEObject)implementationRef;
			implementationRef = eResolveProxy(oldImplementationRef);
			if (implementationRef != oldImplementationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.OPERATION__IMPLEMENTATION_REF, oldImplementationRef, implementationRef));
			}
		}
		return implementationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetImplementationRef() {
		return implementationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationRef(EObject newImplementationRef) {
		EObject oldImplementationRef = implementationRef;
		implementationRef = newImplementationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.OPERATION__IMPLEMENTATION_REF, oldImplementationRef, implementationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.OPERATION__NAME:
				return getName();
			case BPMN20Package.OPERATION__IN_MESSAGE_REF:
				if (resolve) return getInMessageRef();
				return basicGetInMessageRef();
			case BPMN20Package.OPERATION__OUT_MESSAGE_REF:
				if (resolve) return getOutMessageRef();
				return basicGetOutMessageRef();
			case BPMN20Package.OPERATION__ERROR_REFS:
				return getErrorRefs();
			case BPMN20Package.OPERATION__IMPLEMENTATION_REF:
				if (resolve) return getImplementationRef();
				return basicGetImplementationRef();
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
			case BPMN20Package.OPERATION__NAME:
				setName(newValue);
				return;
			case BPMN20Package.OPERATION__IN_MESSAGE_REF:
				setInMessageRef((Message)newValue);
				return;
			case BPMN20Package.OPERATION__OUT_MESSAGE_REF:
				setOutMessageRef((Message)newValue);
				return;
			case BPMN20Package.OPERATION__ERROR_REFS:
				getErrorRefs().clear();
				getErrorRefs().addAll((Collection<? extends BPMN20.Error>)newValue);
				return;
			case BPMN20Package.OPERATION__IMPLEMENTATION_REF:
				setImplementationRef((EObject)newValue);
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
			case BPMN20Package.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.OPERATION__IN_MESSAGE_REF:
				setInMessageRef((Message)null);
				return;
			case BPMN20Package.OPERATION__OUT_MESSAGE_REF:
				setOutMessageRef((Message)null);
				return;
			case BPMN20Package.OPERATION__ERROR_REFS:
				getErrorRefs().clear();
				return;
			case BPMN20Package.OPERATION__IMPLEMENTATION_REF:
				setImplementationRef((EObject)null);
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
			case BPMN20Package.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.OPERATION__IN_MESSAGE_REF:
				return inMessageRef != null;
			case BPMN20Package.OPERATION__OUT_MESSAGE_REF:
				return outMessageRef != null;
			case BPMN20Package.OPERATION__ERROR_REFS:
				return errorRefs != null && !errorRefs.isEmpty();
			case BPMN20Package.OPERATION__IMPLEMENTATION_REF:
				return implementationRef != null;
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

} //OperationImpl
