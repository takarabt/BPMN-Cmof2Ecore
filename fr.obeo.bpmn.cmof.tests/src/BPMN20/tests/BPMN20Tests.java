/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>BPMN20</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN20Tests extends TestSuite {

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
		TestSuite suite = new BPMN20Tests("BPMN20 Tests");
		suite.addTestSuite(InputSetTest.class);
		suite.addTestSuite(DataInputTest.class);
		suite.addTestSuite(OutputSetTest.class);
		suite.addTestSuite(DataOutputTest.class);
		suite.addTestSuite(CategoryValueTest.class);
		suite.addTestSuite(LaneTest.class);
		suite.addTestSuite(SequenceFlowTest.class);
		suite.addTestSuite(ParticipantTest.class);
		suite.addTestSuite(ConversationLinkTest.class);
		suite.addTestSuite(ManualTaskTest.class);
		suite.addTestSuite(TaskTest.class);
		suite.addTestSuite(BoundaryEventTest.class);
		suite.addTestSuite(UserTaskTest.class);
		suite.addTestSuite(EventBasedGatewayTest.class);
		suite.addTestSuite(ComplexGatewayTest.class);
		suite.addTestSuite(ExclusiveGatewayTest.class);
		suite.addTestSuite(InclusiveGatewayTest.class);
		suite.addTestSuite(ParallelGatewayTest.class);
		suite.addTestSuite(IntermediateCatchEventTest.class);
		suite.addTestSuite(IntermediateThrowEventTest.class);
		suite.addTestSuite(EndEventTest.class);
		suite.addTestSuite(StartEventTest.class);
		suite.addTestSuite(ImplicitThrowEventTest.class);
		suite.addTestSuite(DataObjectTest.class);
		suite.addTestSuite(DataStoreReferenceTest.class);
		suite.addTestSuite(DataObjectReferenceTest.class);
		suite.addTestSuite(CallConversationTest.class);
		suite.addTestSuite(ConversationTest.class);
		suite.addTestSuite(SubConversationTest.class);
		suite.addTestSuite(CallChoreographyTest.class);
		suite.addTestSuite(SubChoreographyTest.class);
		suite.addTestSuite(ChoreographyTaskTest.class);
		suite.addTestSuite(ServiceTaskTest.class);
		suite.addTestSuite(SubProcessTest.class);
		suite.addTestSuite(CallActivityTest.class);
		suite.addTestSuite(SendTaskTest.class);
		suite.addTestSuite(ReceiveTaskTest.class);
		suite.addTestSuite(ScriptTaskTest.class);
		suite.addTestSuite(BusinessRuleTaskTest.class);
		suite.addTestSuite(AdHocSubProcessTest.class);
		suite.addTestSuite(TransactionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20Tests(String name) {
		super(name);
	}

} //BPMN20Tests
