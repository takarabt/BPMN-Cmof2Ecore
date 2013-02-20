/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>BPMNDI</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNDITests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BPMNDITests("BPMNDI Tests");
		suite.addTestSuite(BPMNPlaneTest.class);
		suite.addTestSuite(BPMNShapeTest.class);
		suite.addTestSuite(BPMNLabelTest.class);
		suite.addTestSuite(BPMNEdgeTest.class);
		suite.addTestSuite(BPMNDiagramTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDITests(String name) {
		super(name);
	}

} //BPMNDITests
