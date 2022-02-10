/**
 */
package terminology.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terminology.TerminologyPackage;
import terminology.Terminology_Factory;
import terminology.Terminology_Package;

/**
 * This is the item provider adapter for a {@link terminology.TerminologyPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyPackageItemProvider extends TerminologyElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT);
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
	 * This returns TerminologyPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TerminologyPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TerminologyPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_TerminologyPackage_type") :
			getString("_UI_TerminologyPackage_type") + " " + label;
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

		switch (notification.getFeatureID(TerminologyPackage.class)) {
			case Terminology_Package.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT:
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
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Terminology_Package.Literals.TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerm()));
	}

}
