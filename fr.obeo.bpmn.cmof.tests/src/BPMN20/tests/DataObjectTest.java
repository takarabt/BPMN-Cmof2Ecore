/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.tests;

import BPMN20.BPMN20Factory;
import BPMN20.DataObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataObjectTest extends FlowElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataObjectTest.class);
	}

	/**
	 * Constructs a new Data Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataObject getFixture() {
		return (DataObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN20Factory.eINSTANCE.createDataObject());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataObjectTest
