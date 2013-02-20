/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.provider;


import BPMN20.BPMN20Factory;
import BPMN20.BPMN20Package;
import BPMN20.Collaboration;

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
 * This is the item provider adapter for a {@link BPMN20.Collaboration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationItemProvider
	extends RootElementItemProvider
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
	public CollaborationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addIsClosedPropertyDescriptor(object);
			addChoreographyRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_name_feature", "_UI_Collaboration_type"),
				 BPMN20Package.eINSTANCE.getCollaboration_Name(),
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
				 getString("_UI_Collaboration_isClosed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_isClosed_feature", "_UI_Collaboration_type"),
				 BPMN20Package.eINSTANCE.getCollaboration_IsClosed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choreography Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoreographyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collaboration_choreographyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Collaboration_choreographyRef_feature", "_UI_Collaboration_type"),
				 BPMN20Package.eINSTANCE.getCollaboration_ChoreographyRef(),
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
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_Artifacts());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_ParticipantAssociations());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_MessageFlowAssociations());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_ConversationAssociations());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_Participants());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_MessageFlows());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_CorrelationKeys());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_Conversations());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getCollaboration_ConversationLinks());
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
	 * This returns Collaboration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Collaboration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((Collaboration)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Collaboration_type") :
			getString("_UI_Collaboration_type") + " " + label;
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

		switch (notification.getFeatureID(Collaboration.class)) {
			case BPMN20Package.COLLABORATION__NAME:
			case BPMN20Package.COLLABORATION__IS_CLOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN20Package.COLLABORATION__ARTIFACTS:
			case BPMN20Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS:
			case BPMN20Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS:
			case BPMN20Package.COLLABORATION__CONVERSATION_ASSOCIATIONS:
			case BPMN20Package.COLLABORATION__PARTICIPANTS:
			case BPMN20Package.COLLABORATION__MESSAGE_FLOWS:
			case BPMN20Package.COLLABORATION__CORRELATION_KEYS:
			case BPMN20Package.COLLABORATION__CONVERSATIONS:
			case BPMN20Package.COLLABORATION__CONVERSATION_LINKS:
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
				(BPMN20Package.eINSTANCE.getCollaboration_Artifacts(),
				 BPMN20Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Artifacts(),
				 BPMN20Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Artifacts(),
				 BPMN20Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_ParticipantAssociations(),
				 BPMN20Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_MessageFlowAssociations(),
				 BPMN20Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_ConversationAssociations(),
				 BPMN20Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Participants(),
				 BPMN20Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_MessageFlows(),
				 BPMN20Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_CorrelationKeys(),
				 BPMN20Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Conversations(),
				 BPMN20Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Conversations(),
				 BPMN20Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_Conversations(),
				 BPMN20Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getCollaboration_ConversationLinks(),
				 BPMN20Factory.eINSTANCE.createConversationLink()));
	}

}
