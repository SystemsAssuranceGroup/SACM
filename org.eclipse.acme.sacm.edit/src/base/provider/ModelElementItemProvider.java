/**
 */
package base.provider;


import base.Base_Factory;
import base.Base_Package;
import base.ModelElement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link base.ModelElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelElementItemProvider extends SACMElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Base_Package.Literals.MODEL_ELEMENT__NAME);
			childrenFeatures.add(Base_Package.Literals.MODEL_ELEMENT__DESCRIPTION);
			childrenFeatures.add(Base_Package.Literals.MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT);
			childrenFeatures.add(Base_Package.Literals.MODEL_ELEMENT__NOTE);
			childrenFeatures.add(Base_Package.Literals.MODEL_ELEMENT__TAGGED_VALUE);
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
		String label = ((ModelElement)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelElement_type") :
			getString("_UI_ModelElement_type") + " " + label;
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

		switch (notification.getFeatureID(ModelElement.class)) {
			case Base_Package.MODEL_ELEMENT__NAME:
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
			case Base_Package.MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT:
			case Base_Package.MODEL_ELEMENT__NOTE:
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
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
				(Base_Package.Literals.MODEL_ELEMENT__NAME,
				 Base_Factory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.MODEL_ELEMENT__NAME,
				 Base_Factory.eINSTANCE.createExpressionLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.MODEL_ELEMENT__DESCRIPTION,
				 Base_Factory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.MODEL_ELEMENT__IMPLEMENTATION_CONSTRAINT,
				 Base_Factory.eINSTANCE.createImplementationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.MODEL_ELEMENT__NOTE,
				 Base_Factory.eINSTANCE.createNote()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.MODEL_ELEMENT__TAGGED_VALUE,
				 Base_Factory.eINSTANCE.createTaggedValue()));
	}

}
