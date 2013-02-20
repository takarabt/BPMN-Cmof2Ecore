/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.tests;

import BPMN20.BPMN20Factory;
import BPMN20.LaneSet;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lane Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneSetTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LaneSetTest.class);
	}

	/**
	 * Constructs a new Lane Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lane Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LaneSet getFixture() {
		return (LaneSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMN20Factory.eINSTANCE.createLaneSet());
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

} //LaneSetTest