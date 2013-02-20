/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DI.impl;

import DI.DIPackage;
import DI.Label;
import DI.LabeledShape;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DI.impl.LabeledShapeImpl#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LabeledShapeImpl extends ShapeImpl implements LabeledShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DIPackage.Literals.LABELED_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getOwnedLabel() {
		// TODO: implement this method to return the 'Owned Label' reference list
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
			case DIPackage.LABELED_SHAPE__OWNED_LABEL:
				return getOwnedLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DIPackage.LABELED_SHAPE__OWNED_LABEL:
				return !getOwnedLabel().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabeledShapeImpl
