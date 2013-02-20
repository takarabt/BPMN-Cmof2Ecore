/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DC.impl;

import DC.DCPackage;
import DC.Font;

import DC.util.DCValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DC.impl.FontImpl#getName <em>Name</em>}</li>
 *   <li>{@link DC.impl.FontImpl#getSize <em>Size</em>}</li>
 *   <li>{@link DC.impl.FontImpl#getIsBold <em>Is Bold</em>}</li>
 *   <li>{@link DC.impl.FontImpl#getIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link DC.impl.FontImpl#getIsUnderline <em>Is Underline</em>}</li>
 *   <li>{@link DC.impl.FontImpl#getIsStrikeThrough <em>Is Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontImpl extends EObjectImpl implements Font {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Object SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Object size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBold()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_BOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBold()
	 * @generated
	 * @ordered
	 */
	protected Object isBold = IS_BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsItalic()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_ITALIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsItalic()
	 * @generated
	 * @ordered
	 */
	protected Object isItalic = IS_ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_UNDERLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnderline()
	 * @generated
	 * @ordered
	 */
	protected Object isUnderline = IS_UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_STRIKE_THROUGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStrikeThrough()
	 * @generated
	 * @ordered
	 */
	protected Object isStrikeThrough = IS_STRIKE_THROUGH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DCPackage.Literals.FONT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Object newSize) {
		Object oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsBold() {
		return isBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBold(Object newIsBold) {
		Object oldIsBold = isBold;
		isBold = newIsBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_BOLD, oldIsBold, isBold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsItalic() {
		return isItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsItalic(Object newIsItalic) {
		Object oldIsItalic = isItalic;
		isItalic = newIsItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_ITALIC, oldIsItalic, isItalic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsUnderline() {
		return isUnderline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnderline(Object newIsUnderline) {
		Object oldIsUnderline = isUnderline;
		isUnderline = newIsUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_UNDERLINE, oldIsUnderline, isUnderline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsStrikeThrough() {
		return isStrikeThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrikeThrough(Object newIsStrikeThrough) {
		Object oldIsStrikeThrough = isStrikeThrough;
		isStrikeThrough = newIsStrikeThrough;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DCPackage.FONT__IS_STRIKE_THROUGH, oldIsStrikeThrough, isStrikeThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean non_negative_size(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DCValidator.DIAGNOSTIC_SOURCE,
						 DCValidator.FONT__NON_NEGATIVE_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "non_negative_size", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DCPackage.FONT__NAME:
				return getName();
			case DCPackage.FONT__SIZE:
				return getSize();
			case DCPackage.FONT__IS_BOLD:
				return getIsBold();
			case DCPackage.FONT__IS_ITALIC:
				return getIsItalic();
			case DCPackage.FONT__IS_UNDERLINE:
				return getIsUnderline();
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				return getIsStrikeThrough();
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
			case DCPackage.FONT__NAME:
				setName((Object)newValue);
				return;
			case DCPackage.FONT__SIZE:
				setSize((Object)newValue);
				return;
			case DCPackage.FONT__IS_BOLD:
				setIsBold((Object)newValue);
				return;
			case DCPackage.FONT__IS_ITALIC:
				setIsItalic((Object)newValue);
				return;
			case DCPackage.FONT__IS_UNDERLINE:
				setIsUnderline((Object)newValue);
				return;
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				setIsStrikeThrough((Object)newValue);
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
			case DCPackage.FONT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DCPackage.FONT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DCPackage.FONT__IS_BOLD:
				setIsBold(IS_BOLD_EDEFAULT);
				return;
			case DCPackage.FONT__IS_ITALIC:
				setIsItalic(IS_ITALIC_EDEFAULT);
				return;
			case DCPackage.FONT__IS_UNDERLINE:
				setIsUnderline(IS_UNDERLINE_EDEFAULT);
				return;
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				setIsStrikeThrough(IS_STRIKE_THROUGH_EDEFAULT);
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
			case DCPackage.FONT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DCPackage.FONT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case DCPackage.FONT__IS_BOLD:
				return IS_BOLD_EDEFAULT == null ? isBold != null : !IS_BOLD_EDEFAULT.equals(isBold);
			case DCPackage.FONT__IS_ITALIC:
				return IS_ITALIC_EDEFAULT == null ? isItalic != null : !IS_ITALIC_EDEFAULT.equals(isItalic);
			case DCPackage.FONT__IS_UNDERLINE:
				return IS_UNDERLINE_EDEFAULT == null ? isUnderline != null : !IS_UNDERLINE_EDEFAULT.equals(isUnderline);
			case DCPackage.FONT__IS_STRIKE_THROUGH:
				return IS_STRIKE_THROUGH_EDEFAULT == null ? isStrikeThrough != null : !IS_STRIKE_THROUGH_EDEFAULT.equals(isStrikeThrough);
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
		result.append(", size: ");
		result.append(size);
		result.append(", isBold: ");
		result.append(isBold);
		result.append(", isItalic: ");
		result.append(isItalic);
		result.append(", isUnderline: ");
		result.append(isUnderline);
		result.append(", isStrikeThrough: ");
		result.append(isStrikeThrough);
		result.append(')');
		return result.toString();
	}

} //FontImpl
