/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.provider;


import BPMN20.BPMN20Factory;
import BPMN20.BPMN20Package;
import BPMN20.ExtensionAttributeValue;

import BPMNDI.BPMNDIFactory;

import DC.DCFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BPMN20.ExtensionAttributeValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionAttributeValueItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValueRefPropertyDescriptor(object);
			addExtensionAttributeDefinitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtensionAttributeValue_valueRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtensionAttributeValue_valueRef_feature", "_UI_ExtensionAttributeValue_type"),
				 BPMN20Package.eINSTANCE.getExtensionAttributeValue_ValueRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Attribute Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionAttributeDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtensionAttributeValue_extensionAttributeDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtensionAttributeValue_extensionAttributeDefinition_feature", "_UI_ExtensionAttributeValue_type"),
				 BPMN20Package.eINSTANCE.getExtensionAttributeValue_ExtensionAttributeDefinition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExtensionAttributeValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtensionAttributeValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExtensionAttributeValue_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExtensionAttributeValue.class)) {
			case BPMN20Package.EXTENSION_ATTRIBUTE_VALUE__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExtensionAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMN20Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNLabelStyle()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 BPMNDIFactory.eINSTANCE.createBPMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 DCFactory.eINSTANCE.createFont()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 DCFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getExtensionAttributeValue_Value(),
				 DCFactory.eINSTANCE.createBounds()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BPMN20EditPlugin.INSTANCE;
	}

}
