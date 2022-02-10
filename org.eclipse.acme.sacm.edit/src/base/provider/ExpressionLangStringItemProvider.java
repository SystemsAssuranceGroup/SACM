/**
 */
package base.provider;


import argumentation.Argumentation_Factory;
import artifact.Artifact_Factory;
import assuranceCase.AssuranceCase_Factory;
import base.Base_Package;
import base.ExpressionLangString;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import terminology.Terminology_Factory;

/**
 * This is the item provider adapter for a {@link base.ExpressionLangString} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionLangStringItemProvider extends LangStringItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLangStringItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION);
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
	 * This returns ExpressionLangString.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpressionLangString"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExpressionLangString)object).getLang();
		return label == null || label.length() == 0 ?
			getString("_UI_ExpressionLangString_type") :
			getString("_UI_ExpressionLangString_type") + " " + label;
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

		switch (notification.getFeatureID(ExpressionLangString.class)) {
			case Base_Package.EXPRESSION_LANG_STRING__EXPRESSION:
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
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifactGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifactPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Artifact_Factory.eINSTANCE.createArtifactAssetRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArgumentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createArtifactReference()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactContext()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createTerminologyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXPRESSION_LANG_STRING__EXPRESSION,
				 Terminology_Factory.eINSTANCE.createTerm()));
	}

}
