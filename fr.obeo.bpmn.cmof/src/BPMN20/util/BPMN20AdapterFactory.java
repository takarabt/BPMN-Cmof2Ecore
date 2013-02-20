/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.util;

import BPMN20.Activity;
import BPMN20.AdHocSubProcess;
import BPMN20.Artifact;
import BPMN20.Assignment;
import BPMN20.Association;
import BPMN20.Auditing;
import BPMN20.BPMN20Package;
import BPMN20.BaseElement;
import BPMN20.BoundaryEvent;
import BPMN20.BusinessRuleTask;
import BPMN20.CallActivity;
import BPMN20.CallChoreography;
import BPMN20.CallConversation;
import BPMN20.CallableElement;
import BPMN20.CancelEventDefinition;
import BPMN20.CatchEvent;
import BPMN20.Category;
import BPMN20.CategoryValue;
import BPMN20.Choreography;
import BPMN20.ChoreographyActivity;
import BPMN20.ChoreographyTask;
import BPMN20.Collaboration;
import BPMN20.CompensateEventDefinition;
import BPMN20.ComplexBehaviorDefinition;
import BPMN20.ComplexGateway;
import BPMN20.ConditionalEventDefinition;
import BPMN20.Conversation;
import BPMN20.ConversationAssociation;
import BPMN20.ConversationLink;
import BPMN20.ConversationNode;
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
import BPMN20.Event;
import BPMN20.EventBasedGateway;
import BPMN20.EventDefinition;
import BPMN20.ExclusiveGateway;
import BPMN20.Expression;
import BPMN20.Extension;
import BPMN20.ExtensionAttributeDefinition;
import BPMN20.ExtensionAttributeValue;
import BPMN20.ExtensionDefinition;
import BPMN20.FlowElement;
import BPMN20.FlowElementsContainer;
import BPMN20.FlowNode;
import BPMN20.FormalExpression;
import BPMN20.Gateway;
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
import BPMN20.InteractionNode;
import BPMN20.Interface;
import BPMN20.IntermediateCatchEvent;
import BPMN20.IntermediateThrowEvent;
import BPMN20.ItemAwareElement;
import BPMN20.ItemDefinition;
import BPMN20.Lane;
import BPMN20.LaneSet;
import BPMN20.LinkEventDefinition;
import BPMN20.LoopCharacteristics;
import BPMN20.ManualTask;
import BPMN20.Message;
import BPMN20.MessageEventDefinition;
import BPMN20.MessageFlow;
import BPMN20.MessageFlowAssociation;
import BPMN20.Monitoring;
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
import BPMN20.Property;
import BPMN20.ReceiveTask;
import BPMN20.Relationship;
import BPMN20.Rendering;
import BPMN20.Resource;
import BPMN20.ResourceAssignmentExpression;
import BPMN20.ResourceParameter;
import BPMN20.ResourceParameterBinding;
import BPMN20.ResourceRole;
import BPMN20.RootElement;
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
import BPMN20.ThrowEvent;
import BPMN20.TimerEventDefinition;
import BPMN20.Transaction;
import BPMN20.UserTask;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BPMN20.BPMN20Package
 * @generated
 */
public class BPMN20AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMN20Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMN20AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMN20Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMN20Switch<Adapter> modelSwitch =
		new BPMN20Switch<Adapter>() {
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseRootElement(RootElement object) {
				return createRootElementAdapter();
			}
			@Override
			public Adapter caseBaseElement(BaseElement object) {
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseExtensionDefinition(ExtensionDefinition object) {
				return createExtensionDefinitionAdapter();
			}
			@Override
			public Adapter caseExtensionAttributeDefinition(ExtensionAttributeDefinition object) {
				return createExtensionAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseExtensionAttributeValue(ExtensionAttributeValue object) {
				return createExtensionAttributeValueAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseItemDefinition(ItemDefinition object) {
				return createItemDefinitionAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseError(BPMN20.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseAuditing(Auditing object) {
				return createAuditingAdapter();
			}
			@Override
			public Adapter caseGlobalTask(GlobalTask object) {
				return createGlobalTaskAdapter();
			}
			@Override
			public Adapter caseCallableElement(CallableElement object) {
				return createCallableElementAdapter();
			}
			@Override
			public Adapter caseInputOutputSpecification(InputOutputSpecification object) {
				return createInputOutputSpecificationAdapter();
			}
			@Override
			public Adapter caseInputSet(InputSet object) {
				return createInputSetAdapter();
			}
			@Override
			public Adapter caseDataInput(DataInput object) {
				return createDataInputAdapter();
			}
			@Override
			public Adapter caseItemAwareElement(ItemAwareElement object) {
				return createItemAwareElementAdapter();
			}
			@Override
			public Adapter caseDataState(DataState object) {
				return createDataStateAdapter();
			}
			@Override
			public Adapter caseOutputSet(OutputSet object) {
				return createOutputSetAdapter();
			}
			@Override
			public Adapter caseDataOutput(DataOutput object) {
				return createDataOutputAdapter();
			}
			@Override
			public Adapter caseInputOutputBinding(InputOutputBinding object) {
				return createInputOutputBindingAdapter();
			}
			@Override
			public Adapter caseResourceRole(ResourceRole object) {
				return createResourceRoleAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseResourceParameter(ResourceParameter object) {
				return createResourceParameterAdapter();
			}
			@Override
			public Adapter caseResourceParameterBinding(ResourceParameterBinding object) {
				return createResourceParameterBindingAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseResourceAssignmentExpression(ResourceAssignmentExpression object) {
				return createResourceAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseMonitoring(Monitoring object) {
				return createMonitoringAdapter();
			}
			@Override
			public Adapter casePerformer(Performer object) {
				return createPerformerAdapter();
			}
			@Override
			public Adapter caseProcess(BPMN20.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseFlowElementsContainer(FlowElementsContainer object) {
				return createFlowElementsContainerAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseCategoryValue(CategoryValue object) {
				return createCategoryValueAdapter();
			}
			@Override
			public Adapter caseLaneSet(LaneSet object) {
				return createLaneSetAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object) {
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseSequenceFlow(SequenceFlow object) {
				return createSequenceFlowAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseCollaboration(Collaboration object) {
				return createCollaborationAdapter();
			}
			@Override
			public Adapter caseChoreography(Choreography object) {
				return createChoreographyAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseParticipantAssociation(ParticipantAssociation object) {
				return createParticipantAssociationAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseInteractionNode(InteractionNode object) {
				return createInteractionNodeAdapter();
			}
			@Override
			public Adapter caseConversationLink(ConversationLink object) {
				return createConversationLinkAdapter();
			}
			@Override
			public Adapter caseParticipantMultiplicity(ParticipantMultiplicity object) {
				return createParticipantMultiplicityAdapter();
			}
			@Override
			public Adapter caseMessageFlowAssociation(MessageFlowAssociation object) {
				return createMessageFlowAssociationAdapter();
			}
			@Override
			public Adapter caseMessageFlow(MessageFlow object) {
				return createMessageFlowAdapter();
			}
			@Override
			public Adapter caseConversationAssociation(ConversationAssociation object) {
				return createConversationAssociationAdapter();
			}
			@Override
			public Adapter caseConversationNode(ConversationNode object) {
				return createConversationNodeAdapter();
			}
			@Override
			public Adapter caseCorrelationKey(CorrelationKey object) {
				return createCorrelationKeyAdapter();
			}
			@Override
			public Adapter caseCorrelationProperty(CorrelationProperty object) {
				return createCorrelationPropertyAdapter();
			}
			@Override
			public Adapter caseCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression object) {
				return createCorrelationPropertyRetrievalExpressionAdapter();
			}
			@Override
			public Adapter caseFormalExpression(FormalExpression object) {
				return createFormalExpressionAdapter();
			}
			@Override
			public Adapter caseCorrelationSubscription(CorrelationSubscription object) {
				return createCorrelationSubscriptionAdapter();
			}
			@Override
			public Adapter caseCorrelationPropertyBinding(CorrelationPropertyBinding object) {
				return createCorrelationPropertyBindingAdapter();
			}
			@Override
			public Adapter caseGlobalManualTask(GlobalManualTask object) {
				return createGlobalManualTaskAdapter();
			}
			@Override
			public Adapter caseManualTask(ManualTask object) {
				return createManualTaskAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseLoopCharacteristics(LoopCharacteristics object) {
				return createLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseBoundaryEvent(BoundaryEvent object) {
				return createBoundaryEventAdapter();
			}
			@Override
			public Adapter caseCatchEvent(CatchEvent object) {
				return createCatchEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventDefinition(EventDefinition object) {
				return createEventDefinitionAdapter();
			}
			@Override
			public Adapter caseDataOutputAssociation(DataOutputAssociation object) {
				return createDataOutputAssociationAdapter();
			}
			@Override
			public Adapter caseDataAssociation(DataAssociation object) {
				return createDataAssociationAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseDataInputAssociation(DataInputAssociation object) {
				return createDataInputAssociationAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseRendering(Rendering object) {
				return createRenderingAdapter();
			}
			@Override
			public Adapter caseHumanPerformer(HumanPerformer object) {
				return createHumanPerformerAdapter();
			}
			@Override
			public Adapter casePotentialOwner(PotentialOwner object) {
				return createPotentialOwnerAdapter();
			}
			@Override
			public Adapter caseGlobalUserTask(GlobalUserTask object) {
				return createGlobalUserTaskAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseEventBasedGateway(EventBasedGateway object) {
				return createEventBasedGatewayAdapter();
			}
			@Override
			public Adapter caseComplexGateway(ComplexGateway object) {
				return createComplexGatewayAdapter();
			}
			@Override
			public Adapter caseExclusiveGateway(ExclusiveGateway object) {
				return createExclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseInclusiveGateway(InclusiveGateway object) {
				return createInclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseParallelGateway(ParallelGateway object) {
				return createParallelGatewayAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
				return createIntermediateCatchEventAdapter();
			}
			@Override
			public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
				return createIntermediateThrowEventAdapter();
			}
			@Override
			public Adapter caseThrowEvent(ThrowEvent object) {
				return createThrowEventAdapter();
			}
			@Override
			public Adapter caseEndEvent(EndEvent object) {
				return createEndEventAdapter();
			}
			@Override
			public Adapter caseStartEvent(StartEvent object) {
				return createStartEventAdapter();
			}
			@Override
			public Adapter caseCancelEventDefinition(CancelEventDefinition object) {
				return createCancelEventDefinitionAdapter();
			}
			@Override
			public Adapter caseErrorEventDefinition(ErrorEventDefinition object) {
				return createErrorEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTerminateEventDefinition(TerminateEventDefinition object) {
				return createTerminateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseEscalationEventDefinition(EscalationEventDefinition object) {
				return createEscalationEventDefinitionAdapter();
			}
			@Override
			public Adapter caseEscalation(Escalation object) {
				return createEscalationAdapter();
			}
			@Override
			public Adapter caseCompensateEventDefinition(CompensateEventDefinition object) {
				return createCompensateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTimerEventDefinition(TimerEventDefinition object) {
				return createTimerEventDefinitionAdapter();
			}
			@Override
			public Adapter caseLinkEventDefinition(LinkEventDefinition object) {
				return createLinkEventDefinitionAdapter();
			}
			@Override
			public Adapter caseMessageEventDefinition(MessageEventDefinition object) {
				return createMessageEventDefinitionAdapter();
			}
			@Override
			public Adapter caseConditionalEventDefinition(ConditionalEventDefinition object) {
				return createConditionalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseSignalEventDefinition(SignalEventDefinition object) {
				return createSignalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseImplicitThrowEvent(ImplicitThrowEvent object) {
				return createImplicitThrowEventAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			@Override
			public Adapter caseDataStoreReference(DataStoreReference object) {
				return createDataStoreReferenceAdapter();
			}
			@Override
			public Adapter caseDataObjectReference(DataObjectReference object) {
				return createDataObjectReferenceAdapter();
			}
			@Override
			public Adapter caseCallConversation(CallConversation object) {
				return createCallConversationAdapter();
			}
			@Override
			public Adapter caseConversation(Conversation object) {
				return createConversationAdapter();
			}
			@Override
			public Adapter caseSubConversation(SubConversation object) {
				return createSubConversationAdapter();
			}
			@Override
			public Adapter caseGlobalConversation(GlobalConversation object) {
				return createGlobalConversationAdapter();
			}
			@Override
			public Adapter casePartnerEntity(PartnerEntity object) {
				return createPartnerEntityAdapter();
			}
			@Override
			public Adapter casePartnerRole(PartnerRole object) {
				return createPartnerRoleAdapter();
			}
			@Override
			public Adapter caseChoreographyActivity(ChoreographyActivity object) {
				return createChoreographyActivityAdapter();
			}
			@Override
			public Adapter caseCallChoreography(CallChoreography object) {
				return createCallChoreographyAdapter();
			}
			@Override
			public Adapter caseSubChoreography(SubChoreography object) {
				return createSubChoreographyAdapter();
			}
			@Override
			public Adapter caseChoreographyTask(ChoreographyTask object) {
				return createChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseGlobalChoreographyTask(GlobalChoreographyTask object) {
				return createGlobalChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseTextAnnotation(TextAnnotation object) {
				return createTextAnnotationAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseServiceTask(ServiceTask object) {
				return createServiceTaskAdapter();
			}
			@Override
			public Adapter caseSubProcess(SubProcess object) {
				return createSubProcessAdapter();
			}
			@Override
			public Adapter caseMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics object) {
				return createMultiInstanceLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseComplexBehaviorDefinition(ComplexBehaviorDefinition object) {
				return createComplexBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseStandardLoopCharacteristics(StandardLoopCharacteristics object) {
				return createStandardLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseCallActivity(CallActivity object) {
				return createCallActivityAdapter();
			}
			@Override
			public Adapter caseSendTask(SendTask object) {
				return createSendTaskAdapter();
			}
			@Override
			public Adapter caseReceiveTask(ReceiveTask object) {
				return createReceiveTaskAdapter();
			}
			@Override
			public Adapter caseScriptTask(ScriptTask object) {
				return createScriptTaskAdapter();
			}
			@Override
			public Adapter caseBusinessRuleTask(BusinessRuleTask object) {
				return createBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseAdHocSubProcess(AdHocSubProcess object) {
				return createAdHocSubProcessAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseGlobalScriptTask(GlobalScriptTask object) {
				return createGlobalScriptTaskAdapter();
			}
			@Override
			public Adapter caseGlobalBusinessRuleTask(GlobalBusinessRuleTask object) {
				return createGlobalBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseDefinitions(Definitions object) {
				return createDefinitionsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ExtensionDefinition
	 * @generated
	 */
	public Adapter createExtensionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ExtensionAttributeDefinition
	 * @generated
	 */
	public Adapter createExtensionAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ExtensionAttributeValue <em>Extension Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ExtensionAttributeValue
	 * @generated
	 */
	public Adapter createExtensionAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ItemDefinition
	 * @generated
	 */
	public Adapter createItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Auditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Auditing
	 * @generated
	 */
	public Adapter createAuditingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalTask
	 * @generated
	 */
	public Adapter createGlobalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CallableElement
	 * @generated
	 */
	public Adapter createCallableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.InputOutputSpecification <em>Input Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.InputOutputSpecification
	 * @generated
	 */
	public Adapter createInputOutputSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.InputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.InputSet
	 * @generated
	 */
	public Adapter createInputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataInput
	 * @generated
	 */
	public Adapter createDataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ItemAwareElement <em>Item Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ItemAwareElement
	 * @generated
	 */
	public Adapter createItemAwareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataState
	 * @generated
	 */
	public Adapter createDataStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.OutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.OutputSet
	 * @generated
	 */
	public Adapter createOutputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataOutput
	 * @generated
	 */
	public Adapter createDataOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.InputOutputBinding <em>Input Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.InputOutputBinding
	 * @generated
	 */
	public Adapter createInputOutputBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ResourceParameter
	 * @generated
	 */
	public Adapter createResourceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ResourceParameterBinding
	 * @generated
	 */
	public Adapter createResourceParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ResourceAssignmentExpression
	 * @generated
	 */
	public Adapter createResourceAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Monitoring
	 * @generated
	 */
	public Adapter createMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Performer
	 * @generated
	 */
	public Adapter createPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.FlowElementsContainer
	 * @generated
	 */
	public Adapter createFlowElementsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CategoryValue
	 * @generated
	 */
	public Adapter createCategoryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.LaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.LaneSet
	 * @generated
	 */
	public Adapter createLaneSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Choreography
	 * @generated
	 */
	public Adapter createChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ParticipantAssociation
	 * @generated
	 */
	public Adapter createParticipantAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.InteractionNode
	 * @generated
	 */
	public Adapter createInteractionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ConversationLink
	 * @generated
	 */
	public Adapter createConversationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ParticipantMultiplicity
	 * @generated
	 */
	public Adapter createParticipantMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.MessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.MessageFlowAssociation
	 * @generated
	 */
	public Adapter createMessageFlowAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ConversationAssociation
	 * @generated
	 */
	public Adapter createConversationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ConversationNode
	 * @generated
	 */
	public Adapter createConversationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CorrelationKey
	 * @generated
	 */
	public Adapter createCorrelationKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CorrelationProperty
	 * @generated
	 */
	public Adapter createCorrelationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CorrelationPropertyRetrievalExpression
	 * @generated
	 */
	public Adapter createCorrelationPropertyRetrievalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.FormalExpression
	 * @generated
	 */
	public Adapter createFormalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CorrelationSubscription
	 * @generated
	 */
	public Adapter createCorrelationSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CorrelationPropertyBinding
	 * @generated
	 */
	public Adapter createCorrelationPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalManualTask
	 * @generated
	 */
	public Adapter createGlobalManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ManualTask
	 * @generated
	 */
	public Adapter createManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.LoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.LoopCharacteristics
	 * @generated
	 */
	public Adapter createLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CatchEvent
	 * @generated
	 */
	public Adapter createCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataOutputAssociation
	 * @generated
	 */
	public Adapter createDataOutputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataAssociation
	 * @generated
	 */
	public Adapter createDataAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataInputAssociation
	 * @generated
	 */
	public Adapter createDataInputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Rendering
	 * @generated
	 */
	public Adapter createRenderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.HumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.HumanPerformer
	 * @generated
	 */
	public Adapter createHumanPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.PotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.PotentialOwner
	 * @generated
	 */
	public Adapter createPotentialOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalUserTask
	 * @generated
	 */
	public Adapter createGlobalUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.EventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.EventBasedGateway
	 * @generated
	 */
	public Adapter createEventBasedGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ComplexGateway
	 * @generated
	 */
	public Adapter createComplexGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.IntermediateCatchEvent
	 * @generated
	 */
	public Adapter createIntermediateCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.IntermediateThrowEvent
	 * @generated
	 */
	public Adapter createIntermediateThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ThrowEvent
	 * @generated
	 */
	public Adapter createThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CancelEventDefinition
	 * @generated
	 */
	public Adapter createCancelEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ErrorEventDefinition
	 * @generated
	 */
	public Adapter createErrorEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.TerminateEventDefinition
	 * @generated
	 */
	public Adapter createTerminateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.EscalationEventDefinition
	 * @generated
	 */
	public Adapter createEscalationEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Escalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Escalation
	 * @generated
	 */
	public Adapter createEscalationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CompensateEventDefinition
	 * @generated
	 */
	public Adapter createCompensateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.TimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.TimerEventDefinition
	 * @generated
	 */
	public Adapter createTimerEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.LinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.LinkEventDefinition
	 * @generated
	 */
	public Adapter createLinkEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.MessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.MessageEventDefinition
	 * @generated
	 */
	public Adapter createMessageEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ConditionalEventDefinition
	 * @generated
	 */
	public Adapter createConditionalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SignalEventDefinition
	 * @generated
	 */
	public Adapter createSignalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ImplicitThrowEvent
	 * @generated
	 */
	public Adapter createImplicitThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataStoreReference
	 * @generated
	 */
	public Adapter createDataStoreReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.DataObjectReference
	 * @generated
	 */
	public Adapter createDataObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CallConversation
	 * @generated
	 */
	public Adapter createCallConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Conversation
	 * @generated
	 */
	public Adapter createConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SubConversation
	 * @generated
	 */
	public Adapter createSubConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalConversation
	 * @generated
	 */
	public Adapter createGlobalConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.PartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.PartnerEntity
	 * @generated
	 */
	public Adapter createPartnerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.PartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.PartnerRole
	 * @generated
	 */
	public Adapter createPartnerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ChoreographyActivity
	 * @generated
	 */
	public Adapter createChoreographyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CallChoreography
	 * @generated
	 */
	public Adapter createCallChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SubChoreography
	 * @generated
	 */
	public Adapter createSubChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ChoreographyTask
	 * @generated
	 */
	public Adapter createChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalChoreographyTask
	 * @generated
	 */
	public Adapter createGlobalChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.TextAnnotation
	 * @generated
	 */
	public Adapter createTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.MultiInstanceLoopCharacteristics
	 * @generated
	 */
	public Adapter createMultiInstanceLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ComplexBehaviorDefinition
	 * @generated
	 */
	public Adapter createComplexBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.StandardLoopCharacteristics
	 * @generated
	 */
	public Adapter createStandardLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.CallActivity
	 * @generated
	 */
	public Adapter createCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.SendTask
	 * @generated
	 */
	public Adapter createSendTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ReceiveTask
	 * @generated
	 */
	public Adapter createReceiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.BusinessRuleTask
	 * @generated
	 */
	public Adapter createBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.AdHocSubProcess
	 * @generated
	 */
	public Adapter createAdHocSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalScriptTask
	 * @generated
	 */
	public Adapter createGlobalScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.GlobalBusinessRuleTask
	 * @generated
	 */
	public Adapter createGlobalBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BPMN20.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BPMN20.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BPMN20AdapterFactory
