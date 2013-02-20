/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.AdHocOrdering;
import BPMN20.AdHocSubProcess;
import BPMN20.Assignment;
import BPMN20.Association;
import BPMN20.AssociationDirection;
import BPMN20.Auditing;
import BPMN20.BPMN20Factory;
import BPMN20.BPMN20Package;
import BPMN20.BoundaryEvent;
import BPMN20.BusinessRuleTask;
import BPMN20.CallActivity;
import BPMN20.CallChoreography;
import BPMN20.CallConversation;
import BPMN20.CancelEventDefinition;
import BPMN20.Category;
import BPMN20.CategoryValue;
import BPMN20.Choreography;
import BPMN20.ChoreographyLoopType;
import BPMN20.ChoreographyTask;
import BPMN20.Collaboration;
import BPMN20.CompensateEventDefinition;
import BPMN20.ComplexBehaviorDefinition;
import BPMN20.ComplexGateway;
import BPMN20.ConditionalEventDefinition;
import BPMN20.Conversation;
import BPMN20.ConversationAssociation;
import BPMN20.ConversationLink;
import BPMN20.CorrelationKey;
import BPMN20.CorrelationProperty;
import BPMN20.CorrelationPropertyBinding;
import BPMN20.CorrelationPropertyRetrievalExpression;
import BPMN20.CorrelationSubscription;
import BPMN20.DataAssociation;
import BPMN20.DataInput;
import BPMN20.DataInputAssociation;
import BPMN20.DataObject;
import BPMN20.DataObjectReference;
import BPMN20.DataOutput;
import BPMN20.DataOutputAssociation;
import BPMN20.DataState;
import BPMN20.DataStore;
import BPMN20.DataStoreReference;
import BPMN20.Definitions;
import BPMN20.Documentation;
import BPMN20.EndEvent;
import BPMN20.EndPoint;
import BPMN20.ErrorEventDefinition;
import BPMN20.Escalation;
import BPMN20.EscalationEventDefinition;
import BPMN20.EventBasedGateway;
import BPMN20.EventBasedGatewayType;
import BPMN20.ExclusiveGateway;
import BPMN20.Expression;
import BPMN20.Extension;
import BPMN20.ExtensionAttributeDefinition;
import BPMN20.ExtensionAttributeValue;
import BPMN20.ExtensionDefinition;
import BPMN20.FormalExpression;
import BPMN20.GatewayDirection;
import BPMN20.GlobalBusinessRuleTask;
import BPMN20.GlobalChoreographyTask;
import BPMN20.GlobalConversation;
import BPMN20.GlobalManualTask;
import BPMN20.GlobalScriptTask;
import BPMN20.GlobalTask;
import BPMN20.GlobalUserTask;
import BPMN20.Group;
import BPMN20.HumanPerformer;
import BPMN20.ImplicitThrowEvent;
import BPMN20.Import;
import BPMN20.InclusiveGateway;
import BPMN20.InputOutputBinding;
import BPMN20.InputOutputSpecification;
import BPMN20.InputSet;
import BPMN20.Interface;
import BPMN20.IntermediateCatchEvent;
import BPMN20.IntermediateThrowEvent;
import BPMN20.ItemAwareElement;
import BPMN20.ItemDefinition;
import BPMN20.ItemKind;
import BPMN20.Lane;
import BPMN20.LaneSet;
import BPMN20.LinkEventDefinition;
import BPMN20.ManualTask;
import BPMN20.Message;
import BPMN20.MessageEventDefinition;
import BPMN20.MessageFlow;
import BPMN20.MessageFlowAssociation;
import BPMN20.Monitoring;
import BPMN20.MultiInstanceBehavior;
import BPMN20.MultiInstanceLoopCharacteristics;
import BPMN20.Operation;
import BPMN20.OutputSet;
import BPMN20.ParallelGateway;
import BPMN20.Participant;
import BPMN20.ParticipantAssociation;
import BPMN20.ParticipantMultiplicity;
import BPMN20.PartnerEntity;
import BPMN20.PartnerRole;
import BPMN20.Performer;
import BPMN20.PotentialOwner;
import BPMN20.ProcessType;
import BPMN20.Property;
import BPMN20.ReceiveTask;
import BPMN20.Relationship;
import BPMN20.RelationshipDirection;
import BPMN20.Rendering;
import BPMN20.Resource;
import BPMN20.ResourceAssignmentExpression;
import BPMN20.ResourceParameter;
import BPMN20.ResourceParameterBinding;
import BPMN20.ResourceRole;
import BPMN20.ScriptTask;
import BPMN20.SendTask;
import BPMN20.SequenceFlow;
import BPMN20.ServiceTask;
import BPMN20.Signal;
import BPMN20.SignalEventDefinition;
import BPMN20.StandardLoopCharacteristics;
import BPMN20.StartEvent;
import BPMN20.SubChoreography;
import BPMN20.SubConversation;
import BPMN20.SubProcess;
import BPMN20.Task;
import BPMN20.TerminateEventDefinition;
import BPMN20.TextAnnotation;
import BPMN20.TimerEventDefinition;
import BPMN20.Transaction;
import BPMN20.UserTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMN20FactoryImpl extends EFactoryImpl implements BPMN20Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMN20Factory init() {
		try {
			BPMN20Factory theBPMN20Factory = (BPMN20Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/spec/BPMN/20100524/MODEL-XMI"); 
			if (theBPMN20Factory != null) {
				return theBPMN20Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMN20FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPMN20Package.INTERFACE: return createInterface();
			case BPMN20Package.EXTENSION_DEFINITION: return createExtensionDefinition();
			case BPMN20Package.EXTENSION_ATTRIBUTE_DEFINITION: return createExtensionAttributeDefinition();
			case BPMN20Package.EXTENSION_ATTRIBUTE_VALUE: return createExtensionAttributeValue();
			case BPMN20Package.DOCUMENTATION: return createDocumentation();
			case BPMN20Package.OPERATION: return createOperation();
			case BPMN20Package.MESSAGE: return createMessage();
			case BPMN20Package.ITEM_DEFINITION: return createItemDefinition();
			case BPMN20Package.IMPORT: return createImport();
			case BPMN20Package.ERROR: return createError();
			case BPMN20Package.END_POINT: return createEndPoint();
			case BPMN20Package.AUDITING: return createAuditing();
			case BPMN20Package.GLOBAL_TASK: return createGlobalTask();
			case BPMN20Package.INPUT_OUTPUT_SPECIFICATION: return createInputOutputSpecification();
			case BPMN20Package.INPUT_SET: return createInputSet();
			case BPMN20Package.DATA_INPUT: return createDataInput();
			case BPMN20Package.ITEM_AWARE_ELEMENT: return createItemAwareElement();
			case BPMN20Package.DATA_STATE: return createDataState();
			case BPMN20Package.OUTPUT_SET: return createOutputSet();
			case BPMN20Package.DATA_OUTPUT: return createDataOutput();
			case BPMN20Package.INPUT_OUTPUT_BINDING: return createInputOutputBinding();
			case BPMN20Package.RESOURCE_ROLE: return createResourceRole();
			case BPMN20Package.RESOURCE: return createResource();
			case BPMN20Package.RESOURCE_PARAMETER: return createResourceParameter();
			case BPMN20Package.RESOURCE_PARAMETER_BINDING: return createResourceParameterBinding();
			case BPMN20Package.EXPRESSION: return createExpression();
			case BPMN20Package.RESOURCE_ASSIGNMENT_EXPRESSION: return createResourceAssignmentExpression();
			case BPMN20Package.MONITORING: return createMonitoring();
			case BPMN20Package.PERFORMER: return createPerformer();
			case BPMN20Package.PROCESS: return createProcess();
			case BPMN20Package.CATEGORY_VALUE: return createCategoryValue();
			case BPMN20Package.LANE_SET: return createLaneSet();
			case BPMN20Package.LANE: return createLane();
			case BPMN20Package.SEQUENCE_FLOW: return createSequenceFlow();
			case BPMN20Package.PROPERTY: return createProperty();
			case BPMN20Package.COLLABORATION: return createCollaboration();
			case BPMN20Package.CHOREOGRAPHY: return createChoreography();
			case BPMN20Package.PARTICIPANT_ASSOCIATION: return createParticipantAssociation();
			case BPMN20Package.PARTICIPANT: return createParticipant();
			case BPMN20Package.CONVERSATION_LINK: return createConversationLink();
			case BPMN20Package.PARTICIPANT_MULTIPLICITY: return createParticipantMultiplicity();
			case BPMN20Package.MESSAGE_FLOW_ASSOCIATION: return createMessageFlowAssociation();
			case BPMN20Package.MESSAGE_FLOW: return createMessageFlow();
			case BPMN20Package.CONVERSATION_ASSOCIATION: return createConversationAssociation();
			case BPMN20Package.CORRELATION_KEY: return createCorrelationKey();
			case BPMN20Package.CORRELATION_PROPERTY: return createCorrelationProperty();
			case BPMN20Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createCorrelationPropertyRetrievalExpression();
			case BPMN20Package.FORMAL_EXPRESSION: return createFormalExpression();
			case BPMN20Package.CORRELATION_SUBSCRIPTION: return createCorrelationSubscription();
			case BPMN20Package.CORRELATION_PROPERTY_BINDING: return createCorrelationPropertyBinding();
			case BPMN20Package.GLOBAL_MANUAL_TASK: return createGlobalManualTask();
			case BPMN20Package.MANUAL_TASK: return createManualTask();
			case BPMN20Package.TASK: return createTask();
			case BPMN20Package.BOUNDARY_EVENT: return createBoundaryEvent();
			case BPMN20Package.DATA_OUTPUT_ASSOCIATION: return createDataOutputAssociation();
			case BPMN20Package.DATA_ASSOCIATION: return createDataAssociation();
			case BPMN20Package.ASSIGNMENT: return createAssignment();
			case BPMN20Package.DATA_INPUT_ASSOCIATION: return createDataInputAssociation();
			case BPMN20Package.USER_TASK: return createUserTask();
			case BPMN20Package.RENDERING: return createRendering();
			case BPMN20Package.HUMAN_PERFORMER: return createHumanPerformer();
			case BPMN20Package.POTENTIAL_OWNER: return createPotentialOwner();
			case BPMN20Package.GLOBAL_USER_TASK: return createGlobalUserTask();
			case BPMN20Package.EVENT_BASED_GATEWAY: return createEventBasedGateway();
			case BPMN20Package.COMPLEX_GATEWAY: return createComplexGateway();
			case BPMN20Package.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case BPMN20Package.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case BPMN20Package.PARALLEL_GATEWAY: return createParallelGateway();
			case BPMN20Package.RELATIONSHIP: return createRelationship();
			case BPMN20Package.EXTENSION: return createExtension();
			case BPMN20Package.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case BPMN20Package.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
			case BPMN20Package.END_EVENT: return createEndEvent();
			case BPMN20Package.START_EVENT: return createStartEvent();
			case BPMN20Package.CANCEL_EVENT_DEFINITION: return createCancelEventDefinition();
			case BPMN20Package.ERROR_EVENT_DEFINITION: return createErrorEventDefinition();
			case BPMN20Package.TERMINATE_EVENT_DEFINITION: return createTerminateEventDefinition();
			case BPMN20Package.ESCALATION_EVENT_DEFINITION: return createEscalationEventDefinition();
			case BPMN20Package.ESCALATION: return createEscalation();
			case BPMN20Package.COMPENSATE_EVENT_DEFINITION: return createCompensateEventDefinition();
			case BPMN20Package.TIMER_EVENT_DEFINITION: return createTimerEventDefinition();
			case BPMN20Package.LINK_EVENT_DEFINITION: return createLinkEventDefinition();
			case BPMN20Package.MESSAGE_EVENT_DEFINITION: return createMessageEventDefinition();
			case BPMN20Package.CONDITIONAL_EVENT_DEFINITION: return createConditionalEventDefinition();
			case BPMN20Package.SIGNAL_EVENT_DEFINITION: return createSignalEventDefinition();
			case BPMN20Package.SIGNAL: return createSignal();
			case BPMN20Package.IMPLICIT_THROW_EVENT: return createImplicitThrowEvent();
			case BPMN20Package.DATA_OBJECT: return createDataObject();
			case BPMN20Package.DATA_STORE: return createDataStore();
			case BPMN20Package.DATA_STORE_REFERENCE: return createDataStoreReference();
			case BPMN20Package.DATA_OBJECT_REFERENCE: return createDataObjectReference();
			case BPMN20Package.CALL_CONVERSATION: return createCallConversation();
			case BPMN20Package.CONVERSATION: return createConversation();
			case BPMN20Package.SUB_CONVERSATION: return createSubConversation();
			case BPMN20Package.GLOBAL_CONVERSATION: return createGlobalConversation();
			case BPMN20Package.PARTNER_ENTITY: return createPartnerEntity();
			case BPMN20Package.PARTNER_ROLE: return createPartnerRole();
			case BPMN20Package.CALL_CHOREOGRAPHY: return createCallChoreography();
			case BPMN20Package.SUB_CHOREOGRAPHY: return createSubChoreography();
			case BPMN20Package.CHOREOGRAPHY_TASK: return createChoreographyTask();
			case BPMN20Package.GLOBAL_CHOREOGRAPHY_TASK: return createGlobalChoreographyTask();
			case BPMN20Package.TEXT_ANNOTATION: return createTextAnnotation();
			case BPMN20Package.GROUP: return createGroup();
			case BPMN20Package.ASSOCIATION: return createAssociation();
			case BPMN20Package.CATEGORY: return createCategory();
			case BPMN20Package.SERVICE_TASK: return createServiceTask();
			case BPMN20Package.SUB_PROCESS: return createSubProcess();
			case BPMN20Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS: return createMultiInstanceLoopCharacteristics();
			case BPMN20Package.COMPLEX_BEHAVIOR_DEFINITION: return createComplexBehaviorDefinition();
			case BPMN20Package.STANDARD_LOOP_CHARACTERISTICS: return createStandardLoopCharacteristics();
			case BPMN20Package.CALL_ACTIVITY: return createCallActivity();
			case BPMN20Package.SEND_TASK: return createSendTask();
			case BPMN20Package.RECEIVE_TASK: return createReceiveTask();
			case BPMN20Package.SCRIPT_TASK: return createScriptTask();
			case BPMN20Package.BUSINESS_RULE_TASK: return createBusinessRuleTask();
			case BPMN20Package.AD_HOC_SUB_PROCESS: return createAdHocSubProcess();
			case BPMN20Package.TRANSACTION: return createTransaction();
			case BPMN20Package.GLOBAL_SCRIPT_TASK: return createGlobalScriptTask();
			case BPMN20Package.GLOBAL_BUSINESS_RULE_TASK: return createGlobalBusinessRuleTask();
			case BPMN20Package.DEFINITIONS: return createDefinitions();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BPMN20Package.ITEM_KIND:
				return createItemKindFromString(eDataType, initialValue);
			case BPMN20Package.PROCESS_TYPE:
				return createProcessTypeFromString(eDataType, initialValue);
			case BPMN20Package.GATEWAY_DIRECTION:
				return createGatewayDirectionFromString(eDataType, initialValue);
			case BPMN20Package.EVENT_BASED_GATEWAY_TYPE:
				return createEventBasedGatewayTypeFromString(eDataType, initialValue);
			case BPMN20Package.RELATIONSHIP_DIRECTION:
				return createRelationshipDirectionFromString(eDataType, initialValue);
			case BPMN20Package.CHOREOGRAPHY_LOOP_TYPE:
				return createChoreographyLoopTypeFromString(eDataType, initialValue);
			case BPMN20Package.ASSOCIATION_DIRECTION:
				return createAssociationDirectionFromString(eDataType, initialValue);
			case BPMN20Package.MULTI_INSTANCE_BEHAVIOR:
				return createMultiInstanceBehaviorFromString(eDataType, initialValue);
			case BPMN20Package.AD_HOC_ORDERING:
				return createAdHocOrderingFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BPMN20Package.ITEM_KIND:
				return convertItemKindToString(eDataType, instanceValue);
			case BPMN20Package.PROCESS_TYPE:
				return convertProcessTypeToString(eDataType, instanceValue);
			case BPMN20Package.GATEWAY_DIRECTION:
				return convertGatewayDirectionToString(eDataType, instanceValue);
			case BPMN20Package.EVENT_BASED_GATEWAY_TYPE:
				return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
			case BPMN20Package.RELATIONSHIP_DIRECTION:
				return convertRelationshipDirectionToString(eDataType, instanceValue);
			case BPMN20Package.CHOREOGRAPHY_LOOP_TYPE:
				return convertChoreographyLoopTypeToString(eDataType, instanceValue);
			case BPMN20Package.ASSOCIATION_DIRECTION:
				return convertAssociationDirectionToString(eDataType, instanceValue);
			case BPMN20Package.MULTI_INSTANCE_BEHAVIOR:
				return convertMultiInstanceBehaviorToString(eDataType, instanceValue);
			case BPMN20Package.AD_HOC_ORDERING:
				return convertAdHocOrderingToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition createExtensionDefinition() {
		ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();
		return extensionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition createExtensionAttributeDefinition() {
		ExtensionAttributeDefinitionImpl extensionAttributeDefinition = new ExtensionAttributeDefinitionImpl();
		return extensionAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValue createExtensionAttributeValue() {
		ExtensionAttributeValueImpl extensionAttributeValue = new ExtensionAttributeValueImpl();
		return extensionAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing createAuditing() {
		AuditingImpl auditing = new AuditingImpl();
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTask createGlobalTask() {
		GlobalTaskImpl globalTask = new GlobalTaskImpl();
		return globalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification createInputOutputSpecification() {
		InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
		return inputOutputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet createInputSet() {
		InputSetImpl inputSet = new InputSetImpl();
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement createItemAwareElement() {
		ItemAwareElementImpl itemAwareElement = new ItemAwareElementImpl();
		return itemAwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState createDataState() {
		DataStateImpl dataState = new DataStateImpl();
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet createOutputSet() {
		OutputSetImpl outputSet = new OutputSetImpl();
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBinding createInputOutputBinding() {
		InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
		return inputOutputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter createResourceParameter() {
		ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
		return resourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameterBinding createResourceParameterBinding() {
		ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
		return resourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression createResourceAssignmentExpression() {
		ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		CategoryValueImpl categoryValue = new CategoryValueImpl();
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet createLaneSet() {
		LaneSetImpl laneSet = new LaneSetImpl();
		return laneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAssociation createParticipantAssociation() {
		ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
		return participantAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLink createConversationLink() {
		ConversationLinkImpl conversationLink = new ConversationLinkImpl();
		return conversationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity createParticipantMultiplicity() {
		ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociation createMessageFlowAssociation() {
		MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
		return messageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAssociation createConversationAssociation() {
		ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();
		return conversationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey createCorrelationKey() {
		CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
		return correlationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty createCorrelationProperty() {
		CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
		return correlationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
		CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
		return correlationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		FormalExpressionImpl formalExpression = new FormalExpressionImpl();
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscription createCorrelationSubscription() {
		CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
		return correlationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyBinding createCorrelationPropertyBinding() {
		CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTask createGlobalManualTask() {
		GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
		return globalManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociation createDataOutputAssociation() {
		DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAssociation createDataAssociation() {
		DataAssociationImpl dataAssociation = new DataAssociationImpl();
		return dataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInputAssociation createDataInputAssociation() {
		DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanPerformer createHumanPerformer() {
		HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
		return humanPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwner createPotentialOwner() {
		PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
		return potentialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalUserTask createGlobalUserTask() {
		GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
		return globalUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGateway createEventBasedGateway() {
		EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
		return eventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelEventDefinition createCancelEventDefinition() {
		CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
		return cancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinition createErrorEventDefinition() {
		ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
		return errorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateEventDefinition createTerminateEventDefinition() {
		TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
		return terminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationEventDefinition createEscalationEventDefinition() {
		EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
		return escalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation createEscalation() {
		EscalationImpl escalation = new EscalationImpl();
		return escalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateEventDefinition createCompensateEventDefinition() {
		CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
		return compensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventDefinition createTimerEventDefinition() {
		TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
		return timerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition createLinkEventDefinition() {
		LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
		return linkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventDefinition createMessageEventDefinition() {
		MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
		return messageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEventDefinition createConditionalEventDefinition() {
		ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
		return conditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinition createSignalEventDefinition() {
		SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
		return signalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent createImplicitThrowEvent() {
		ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
		return implicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreReference createDataStoreReference() {
		DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
		return dataStoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConversation createCallConversation() {
		CallConversationImpl callConversation = new CallConversationImpl();
		return callConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation createConversation() {
		ConversationImpl conversation = new ConversationImpl();
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubConversation createSubConversation() {
		SubConversationImpl subConversation = new SubConversationImpl();
		return subConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConversation createGlobalConversation() {
		GlobalConversationImpl globalConversation = new GlobalConversationImpl();
		return globalConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerEntity createPartnerEntity() {
		PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
		return partnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerRole createPartnerRole() {
		PartnerRoleImpl partnerRole = new PartnerRoleImpl();
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallChoreography createCallChoreography() {
		CallChoreographyImpl callChoreography = new CallChoreographyImpl();
		return callChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubChoreography createSubChoreography() {
		SubChoreographyImpl subChoreography = new SubChoreographyImpl();
		return subChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyTask createChoreographyTask() {
		ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
		return choreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalChoreographyTask createGlobalChoreographyTask() {
		GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();
		return globalChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAnnotation createTextAnnotation() {
		TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
		MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
		return multiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
		ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics createStandardLoopCharacteristics() {
		StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
		return standardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivity createCallActivity() {
		CallActivityImpl callActivity = new CallActivityImpl();
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask createSendTask() {
		SendTaskImpl sendTask = new SendTaskImpl();
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask createScriptTask() {
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTask createBusinessRuleTask() {
		BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocSubProcess createAdHocSubProcess() {
		AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
		return adHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScriptTask createGlobalScriptTask() {
		GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
		return globalScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
		GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
		return globalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
		ItemKind result = ItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		RelationshipDirection result = RelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyLoopType createChoreographyLoopTypeFromString(EDataType eDataType, String initialValue) {
		ChoreographyLoopType result = ChoreographyLoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChoreographyLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString(EDataType eDataType, String initialValue) {
		MultiInstanceBehavior result = MultiInstanceBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		AdHocOrdering result = AdHocOrdering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20Package getBPMN20Package() {
		return (BPMN20Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMN20Package getPackage() {
		return BPMN20Package.eINSTANCE;
	}

} //BPMN20FactoryImpl
