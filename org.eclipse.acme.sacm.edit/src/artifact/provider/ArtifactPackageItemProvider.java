/**
 */
package artifact.provider;


import argumentation.Argumentation_Factory;
import artifact.ArtifactPackage;
import artifact.Artifact_Factory;
import artifact.Artifact_Package;

import assuranceCase.AssuranceCase_Factory;
import assuranceCase.provider.AssuranceCaseEditPlugin;
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
 * This is the item provider adapter for a {@link artifact.ArtifactPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageItemProvider extends ArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ArtifactPackage_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArtifactPackage_interface_feature", "_UI_ArtifactPackage_type"),
				 Artifact_Package.Literals.ARTIFACT_PACKAGE__INTERFACE,
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
			childrenFeatures.add(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT);
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
	 * This returns ArtifactPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArtifactPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArtifactPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ArtifactPackage_type") :
			getString("_UI_ArtifactPackage_type") + " " + label;
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

		switch (notification.getFeatureID(ArtifactPackage.class)) {
			case Artifact_Package.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT:
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
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Artifact_Factory.eINSTANCE.createArtifactAssetRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArtifactReference()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactContext()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Artifact_Package.Literals.ARTIFACT_PACKAGE__ARTIFACT_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerm()));
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
