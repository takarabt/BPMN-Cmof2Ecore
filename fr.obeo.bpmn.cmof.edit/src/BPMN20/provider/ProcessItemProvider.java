/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.provider;


import BPMN20.BPMN20Factory;
import BPMN20.BPMN20Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BPMN20.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider
	extends CallableElementItemProvider
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
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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

			addProcessTypePropertyDescriptor(object);
			addIsClosedPropertyDescriptor(object);
			addSupportsPropertyDescriptor(object);
			addDefinitionalCollaborationRefPropertyDescriptor(object);
			addIsExecutablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Process Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_processType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_processType_feature", "_UI_Process_type"),
				 BPMN20Package.eINSTANCE.getProcess_ProcessType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Closed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsClosedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_isClosed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_isClosed_feature", "_UI_Process_type"),
				 BPMN20Package.eINSTANCE.getProcess_IsClosed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_supports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_supports_feature", "_UI_Process_type"),
				 BPMN20Package.eINSTANCE.getProcess_Supports(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definitional Collaboration Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionalCollaborationRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_definitionalCollaborationRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_definitionalCollaborationRef_feature", "_UI_Process_type"),
				 BPMN20Package.eINSTANCE.getProcess_DefinitionalCollaborationRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Executable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExecutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Process_isExecutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Process_isExecutable_feature", "_UI_Process_type"),
				 BPMN20Package.eINSTANCE.getProcess_IsExecutable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getFlowElementsContainer_LaneSets());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_Auditing());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_Monitoring());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_Properties());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_Resources());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_Artifacts());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getProcess_CorrelationSubscriptions());
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
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((BPMN20.Process)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Process_type") :
			getString("_UI_Process_type") + " " + label;
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

		switch (notification.getFeatureID(BPMN20.Process.class)) {
			case BPMN20Package.PROCESS__PROCESS_TYPE:
			case BPMN20Package.PROCESS__IS_CLOSED:
			case BPMN20Package.PROCESS__IS_EXECUTABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN20Package.PROCESS__FLOW_ELEMENTS:
			case BPMN20Package.PROCESS__LANE_SETS:
			case BPMN20Package.PROCESS__AUDITING:
			case BPMN20Package.PROCESS__MONITORING:
			case BPMN20Package.PROCESS__PROPERTIES:
			case BPMN20Package.PROCESS__RESOURCES:
			case BPMN20Package.PROCESS__ARTIFACTS:
			case BPMN20Package.PROCESS__CORRELATION_SUBSCRIPTIONS:
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
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 BPMN20Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getFlowElementsContainer_LaneSets(),
				 BPMN20Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Auditing(),
				 BPMN20Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Monitoring(),
				 BPMN20Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Properties(),
				 BPMN20Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Resources(),
				 BPMN20Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Resources(),
				 BPMN20Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Resources(),
				 BPMN20Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Resources(),
				 BPMN20Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Artifacts(),
				 BPMN20Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Artifacts(),
				 BPMN20Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_Artifacts(),
				 BPMN20Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getProcess_CorrelationSubscriptions(),
				 BPMN20Factory.eINSTANCE.createCorrelationSubscription()));
	}

}
