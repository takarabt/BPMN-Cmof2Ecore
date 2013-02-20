/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.CategoryValue;
import BPMN20.Group;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.GroupImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends ArtifactImpl implements Group {
	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValueRef()
	 * @generated
	 * @ordered
	 */
	protected CategoryValue categoryValueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue getCategoryValueRef() {
		if (categoryValueRef != null && categoryValueRef.eIsProxy()) {
			InternalEObject oldCategoryValueRef = (InternalEObject)categoryValueRef;
			categoryValueRef = (CategoryValue)eResolveProxy(oldCategoryValueRef);
			if (categoryValueRef != oldCategoryValueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMN20Package.GROUP__CATEGORY_VALUE_REF, oldCategoryValueRef, categoryValueRef));
			}
		}
		return categoryValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue basicGetCategoryValueRef() {
		return categoryValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryValueRef(CategoryValue newCategoryValueRef) {
		CategoryValue oldCategoryValueRef = categoryValueRef;
		categoryValueRef = newCategoryValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.GROUP__CATEGORY_VALUE_REF, oldCategoryValueRef, categoryValueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMN20Package.GROUP__CATEGORY_VALUE_REF:
				if (resolve) return getCategoryValueRef();
				return basicGetCategoryValueRef();
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
			case BPMN20Package.GROUP__CATEGORY_VALUE_REF:
				setCategoryValueRef((CategoryValue)newValue);
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
			case BPMN20Package.GROUP__CATEGORY_VALUE_REF:
				setCategoryValueRef((CategoryValue)null);
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
			case BPMN20Package.GROUP__CATEGORY_VALUE_REF:
				return categoryValueRef != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
