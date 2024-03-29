/**
 */
package argumentation.provider;

import argumentation.util.Argumentation_AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Argumentation_ItemProviderAdapterFactory extends Argumentation_AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation_ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArgumentGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentGroupItemProvider argumentGroupItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArgumentGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentGroupAdapter() {
		if (argumentGroupItemProvider == null) {
			argumentGroupItemProvider = new ArgumentGroupItemProvider(this);
		}

		return argumentGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArgumentPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageItemProvider argumentPackageItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArgumentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentPackageAdapter() {
		if (argumentPackageItemProvider == null) {
			argumentPackageItemProvider = new ArgumentPackageItemProvider(this);
		}

		return argumentPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArgumentPackageInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageInterfaceItemProvider argumentPackageInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArgumentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentPackageInterfaceAdapter() {
		if (argumentPackageInterfaceItemProvider == null) {
			argumentPackageInterfaceItemProvider = new ArgumentPackageInterfaceItemProvider(this);
		}

		return argumentPackageInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArgumentPackageBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageBindingItemProvider argumentPackageBindingItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArgumentPackageBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentPackageBindingAdapter() {
		if (argumentPackageBindingItemProvider == null) {
			argumentPackageBindingItemProvider = new ArgumentPackageBindingItemProvider(this);
		}

		return argumentPackageBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArgumentReasoning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningItemProvider argumentReasoningItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArgumentReasoning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentReasoningAdapter() {
		if (argumentReasoningItemProvider == null) {
			argumentReasoningItemProvider = new ArgumentReasoningItemProvider(this);
		}

		return argumentReasoningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.Claim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemProvider claimItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.Claim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaimAdapter() {
		if (claimItemProvider == null) {
			claimItemProvider = new ClaimItemProvider(this);
		}

		return claimItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.ArtifactReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactReferenceItemProvider artifactReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.ArtifactReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactReferenceAdapter() {
		if (artifactReferenceItemProvider == null) {
			artifactReferenceItemProvider = new ArtifactReferenceItemProvider(this);
		}

		return artifactReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.AssertedArtifactSupport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedArtifactSupportItemProvider assertedArtifactSupportItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.AssertedArtifactSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedArtifactSupportAdapter() {
		if (assertedArtifactSupportItemProvider == null) {
			assertedArtifactSupportItemProvider = new AssertedArtifactSupportItemProvider(this);
		}

		return assertedArtifactSupportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.AssertedInference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedInferenceItemProvider assertedInferenceItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedInferenceAdapter() {
		if (assertedInferenceItemProvider == null) {
			assertedInferenceItemProvider = new AssertedInferenceItemProvider(this);
		}

		return assertedInferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.AssertedEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedEvidenceItemProvider assertedEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.AssertedEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedEvidenceAdapter() {
		if (assertedEvidenceItemProvider == null) {
			assertedEvidenceItemProvider = new AssertedEvidenceItemProvider(this);
		}

		return assertedEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.AssertedContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedContextItemProvider assertedContextItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.AssertedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedContextAdapter() {
		if (assertedContextItemProvider == null) {
			assertedContextItemProvider = new AssertedContextItemProvider(this);
		}

		return assertedContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link argumentation.AssertedArtifactContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedArtifactContextItemProvider assertedArtifactContextItemProvider;

	/**
	 * This creates an adapter for a {@link argumentation.AssertedArtifactContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedArtifactContextAdapter() {
		if (assertedArtifactContextItemProvider == null) {
			assertedArtifactContextItemProvider = new AssertedArtifactContextItemProvider(this);
		}

		return assertedArtifactContextItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
