/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.tests;

import BPMNDI.tests.BPMNDITests;

import DC.tests.DCTests;

import DI.tests.DITests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>BPMN20</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN20AllTests extends TestSuite {

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
		TestSuite suite = new BPMN20AllTests("BPMN20 Tests");
		suite.addTest(BPMN20Tests.suite());
		suite.addTest(BPMNDITests.suite());
		suite.addTest(DITests.suite());
		suite.addTest(DCTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20AllTests(String name) {
		super(name);
	}

} //BPMN20AllTests
