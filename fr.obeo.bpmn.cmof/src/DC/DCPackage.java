/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DC.DCFactory
 * @model kind="package"
 * @generated
 */
public interface DCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DD/20100524/DC-XMI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DCPackage eINSTANCE = DC.impl.DCPackageImpl.init();

	/**
	 * The meta object id for the '{@link DC.impl.FontImpl <em>Font</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DC.impl.FontImpl
	 * @see DC.impl.DCPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__IS_BOLD = 2;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__IS_ITALIC = 3;

	/**
	 * The feature id for the '<em><b>Is Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__IS_UNDERLINE = 4;

	/**
	 * The feature id for the '<em><b>Is Strike Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT__IS_STRIKE_THROUGH = 5;

	/**
	 * The number of structural features of the '<em>Font</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link DC.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DC.impl.PointImpl
	 * @see DC.impl.DCPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DC.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DC.impl.BoundsImpl
	 * @see DC.impl.DCPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Boolean
	 * @see DC.impl.DCPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Integer
	 * @see DC.impl.DCPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 4;

	/**
	 * The meta object id for the '<em>Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Real
	 * @see DC.impl.DCPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 5;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see String
	 * @see DC.impl.DCPackageImpl#getString()
	 * @generated
	 */
	int STRING = 6;


	/**
	 * Returns the meta object for class '{@link DC.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font</em>'.
	 * @see DC.Font
	 * @generated
	 */
	EClass getFont();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DC.Font#getName()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Name();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see DC.Font#getSize()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_Size();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getIsBold <em>Is Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bold</em>'.
	 * @see DC.Font#getIsBold()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_IsBold();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getIsItalic <em>Is Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Italic</em>'.
	 * @see DC.Font#getIsItalic()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_IsItalic();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getIsUnderline <em>Is Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Underline</em>'.
	 * @see DC.Font#getIsUnderline()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_IsUnderline();

	/**
	 * Returns the meta object for the attribute '{@link DC.Font#getIsStrikeThrough <em>Is Strike Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strike Through</em>'.
	 * @see DC.Font#getIsStrikeThrough()
	 * @see #getFont()
	 * @generated
	 */
	EAttribute getFont_IsStrikeThrough();

	/**
	 * Returns the meta object for class '{@link DC.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see DC.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link DC.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see DC.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link DC.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see DC.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link DC.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see DC.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link DC.Bounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see DC.Bounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link DC.Bounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see DC.Bounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link DC.Bounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see DC.Bounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link DC.Bounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see DC.Bounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for data type '{@link Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see Boolean
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see Integer
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real</em>'.
	 * @see Real
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getReal();

	/**
	 * Returns the meta object for data type '{@link String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see String
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DCFactory getDCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DC.impl.FontImpl <em>Font</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DC.impl.FontImpl
		 * @see DC.impl.DCPackageImpl#getFont()
		 * @generated
		 */
		EClass FONT = eINSTANCE.getFont();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__NAME = eINSTANCE.getFont_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__SIZE = eINSTANCE.getFont_Size();

		/**
		 * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__IS_BOLD = eINSTANCE.getFont_IsBold();

		/**
		 * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__IS_ITALIC = eINSTANCE.getFont_IsItalic();

		/**
		 * The meta object literal for the '<em><b>Is Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__IS_UNDERLINE = eINSTANCE.getFont_IsUnderline();

		/**
		 * The meta object literal for the '<em><b>Is Strike Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT__IS_STRIKE_THROUGH = eINSTANCE.getFont_IsStrikeThrough();

		/**
		 * The meta object literal for the '{@link DC.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DC.impl.PointImpl
		 * @see DC.impl.DCPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link DC.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DC.impl.BoundsImpl
		 * @see DC.impl.DCPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Boolean
		 * @see DC.impl.DCPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Integer
		 * @see DC.impl.DCPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Real</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Real
		 * @see DC.impl.DCPackageImpl#getReal()
		 * @generated
		 */
		EDataType REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see String
		 * @see DC.impl.DCPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //DCPackage