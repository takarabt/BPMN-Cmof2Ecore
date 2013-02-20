/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI.tests;

import BPMNDI.BPMNDIFactory;
import BPMNDI.BPMNLabelStyle;

import DI.tests.StyleTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNLabelStyleTest extends StyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNLabelStyleTest.class);
	}

	/**
	 * Constructs a new BPMN Label Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Label Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNLabelStyle getFixture() {
		return (BPMNLabelStyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPMNDIFactory.eINSTANCE.createBPMNLabelStyle());
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

} //BPMNLabelStyleTest
