/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.tests;

import BPMN20.BPMN20Factory;
import BPMN20.EndPoint;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndPointTest extends RootElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndPointTest.class);
	}

	/**
	 * Constructs a new End Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this End Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EndPoint getFixture() {
		return (EndPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN20Factory.eINSTANCE.createEndPoint());
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

} //EndPointTest
