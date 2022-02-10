/**
 */
package assuranceCase.provider;


import argumentation.Argumentation_Factory;

import artifact.Artifact_Factory;

import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCase_Factory;
import assuranceCase.AssuranceCase_Package;

import base.provider.ArtifactElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terminology.Terminology_Factory;

/**
 * This is the item provider adapter for a {@link assuranceCase.AssuranceCasePackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCasePackageItemProvider extends ArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageItemProvider(AdapterFactory adapterFactory) {
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

			addInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssuranceCasePackage_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssuranceCasePackage_interface_feature", "_UI_AssuranceCasePackage_type"),
				 AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__INTERFACE,
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
			childrenFeatures.add(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE);
			childrenFeatures.add(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE);
			childrenFeatures.add(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE);
			childrenFeatures.add(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE);
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
	 * This returns AssuranceCasePackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssuranceCasePackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssuranceCasePackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_AssuranceCasePackage_type") :
			getString("_UI_AssuranceCasePackage_type") + " " + label;
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

		switch (notification.getFeatureID(AssuranceCasePackage.class)) {
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE:
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE:
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE:
			case AssuranceCase_Package.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE:
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
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ASSURANCE_CASE_PACKAGE,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE,
				 Artifact_Factory.eINSTANCE.createArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE,
				 Artifact_Factory.eINSTANCE.createArtifactPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARTIFACT_PACKAGE,
				 Artifact_Factory.eINSTANCE.createArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE,
				 Argumentation_Factory.eINSTANCE.createArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__ARGUMENT_PACKAGE,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(AssuranceCase_Package.Literals.ASSURANCE_CASE_PACKAGE__TERMINOLOGY_PACKAGE,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AssuranceCaseEditPlugin.INSTANCE;
	}

}
