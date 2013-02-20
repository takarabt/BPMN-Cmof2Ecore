/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.provider;


import BPMN20.Activity;
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
 * This is the item provider adapter for a {@link BPMN20.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider
	extends FlowNodeItemProvider
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
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addIsForCompensationPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addBoundaryEventRefsPropertyDescriptor(object);
			addStartQuantityPropertyDescriptor(object);
			addCompletionQuantityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is For Compensation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsForCompensationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_isForCompensation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_isForCompensation_feature", "_UI_Activity_type"),
				 BPMN20Package.eINSTANCE.getActivity_IsForCompensation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_default_feature", "_UI_Activity_type"),
				 BPMN20Package.eINSTANCE.getActivity_Default(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boundary Event Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundaryEventRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_boundaryEventRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_boundaryEventRefs_feature", "_UI_Activity_type"),
				 BPMN20Package.eINSTANCE.getActivity_BoundaryEventRefs(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Quantity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartQuantityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_startQuantity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_startQuantity_feature", "_UI_Activity_type"),
				 BPMN20Package.eINSTANCE.getActivity_StartQuantity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Quantity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionQuantityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_completionQuantity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_completionQuantity_feature", "_UI_Activity_type"),
				 BPMN20Package.eINSTANCE.getActivity_CompletionQuantity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_LoopCharacteristics());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_Resources());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_Properties());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_IoSpecification());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_DataInputAssociations());
			childrenFeatures.add(BPMN20Package.eINSTANCE.getActivity_DataOutputAssociations());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((Activity)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case BPMN20Package.ACTIVITY__IS_FOR_COMPENSATION:
			case BPMN20Package.ACTIVITY__START_QUANTITY:
			case BPMN20Package.ACTIVITY__COMPLETION_QUANTITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BPMN20Package.ACTIVITY__LOOP_CHARACTERISTICS:
			case BPMN20Package.ACTIVITY__RESOURCES:
			case BPMN20Package.ACTIVITY__PROPERTIES:
			case BPMN20Package.ACTIVITY__IO_SPECIFICATION:
			case BPMN20Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS:
			case BPMN20Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
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
				(BPMN20Package.eINSTANCE.getActivity_LoopCharacteristics(),
				 BPMN20Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_LoopCharacteristics(),
				 BPMN20Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_Resources(),
				 BPMN20Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_Resources(),
				 BPMN20Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_Resources(),
				 BPMN20Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_Resources(),
				 BPMN20Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_Properties(),
				 BPMN20Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_IoSpecification(),
				 BPMN20Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_DataInputAssociations(),
				 BPMN20Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(BPMN20Package.eINSTANCE.getActivity_DataOutputAssociations(),
				 BPMN20Factory.eINSTANCE.createDataOutputAssociation()));
	}

}
