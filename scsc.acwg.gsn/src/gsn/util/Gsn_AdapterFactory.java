/**
 */
package gsn.util;

import argumentation.ArgumentAsset;
import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageBinding;
import argumentation.ArgumentReasoning;
import argumentation.ArgumentationElement;
import argumentation.ArtifactReference;
import argumentation.AssertedContext;
import argumentation.AssertedInference;
import argumentation.AssertedRelationship;
import argumentation.Assertion;
import argumentation.Claim;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import gsn.Assumption;
import gsn.AwayAssumption;
import gsn.AwayContext;
import gsn.AwayGoal;
import gsn.AwayJustification;
import gsn.AwaySolution;
import gsn.Choice;
import gsn.Context;
import gsn.ContractModule;
import gsn.ContractModuleReference;
import gsn.Goal;
import gsn.Gsn_Package;
import gsn.InContextOf;
import gsn.Justification;
import gsn.ModuleReference;
import gsn.Solution;
import gsn.Strategy;
import gsn.SupportedBy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gsn.Gsn_Package
 * @generated
 */
public class Gsn_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gsn_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsn_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Gsn_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gsn_Switch<Adapter> modelSwitch =
		new Gsn_Switch<Adapter>() {
			@Override
			public Adapter caseModule(gsn.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseContractModule(ContractModule object) {
				return createContractModuleAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseJustification(Justification object) {
				return createJustificationAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseAwayGoal(AwayGoal object) {
				return createAwayGoalAdapter();
			}
			@Override
			public Adapter caseAwayAssumption(AwayAssumption object) {
				return createAwayAssumptionAdapter();
			}
			@Override
			public Adapter caseAwayJustification(AwayJustification object) {
				return createAwayJustificationAdapter();
			}
			@Override
			public Adapter caseAwaySolution(AwaySolution object) {
				return createAwaySolutionAdapter();
			}
			@Override
			public Adapter caseAwayContext(AwayContext object) {
				return createAwayContextAdapter();
			}
			@Override
			public Adapter caseModuleReference(ModuleReference object) {
				return createModuleReferenceAdapter();
			}
			@Override
			public Adapter caseContractModuleReference(ContractModuleReference object) {
				return createContractModuleReferenceAdapter();
			}
			@Override
			public Adapter caseSolution(Solution object) {
				return createSolutionAdapter();
			}
			@Override
			public Adapter caseSupportedBy(SupportedBy object) {
				return createSupportedByAdapter();
			}
			@Override
			public Adapter caseInContextOf(InContextOf object) {
				return createInContextOfAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseSACMElement(SACMElement object) {
				return createSACMElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseArtifactElement(ArtifactElement object) {
				return createArtifactElementAdapter();
			}
			@Override
			public Adapter caseArgumentationElement(ArgumentationElement object) {
				return createArgumentationElementAdapter();
			}
			@Override
			public Adapter caseArgumentPackage(ArgumentPackage object) {
				return createArgumentPackageAdapter();
			}
			@Override
			public Adapter caseArgumentPackageBinding(ArgumentPackageBinding object) {
				return createArgumentPackageBindingAdapter();
			}
			@Override
			public Adapter caseArgumentAsset(ArgumentAsset object) {
				return createArgumentAssetAdapter();
			}
			@Override
			public Adapter caseArgumentReasoning(ArgumentReasoning object) {
				return createArgumentReasoningAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseArtifactReference(ArtifactReference object) {
				return createArtifactReferenceAdapter();
			}
			@Override
			public Adapter caseAssertedRelationship(AssertedRelationship object) {
				return createAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseAssertedInference(AssertedInference object) {
				return createAssertedInferenceAdapter();
			}
			@Override
			public Adapter caseAssertedContext(AssertedContext object) {
				return createAssertedContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gsn.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.ContractModule
	 * @generated
	 */
	public Adapter createContractModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Justification
	 * @generated
	 */
	public Adapter createJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.AwayGoal
	 * @generated
	 */
	public Adapter createAwayGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.AwayAssumption <em>Away Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.AwayAssumption
	 * @generated
	 */
	public Adapter createAwayAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.AwayJustification <em>Away Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.AwayJustification
	 * @generated
	 */
	public Adapter createAwayJustificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.AwaySolution
	 * @generated
	 */
	public Adapter createAwaySolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.AwayContext
	 * @generated
	 */
	public Adapter createAwayContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.ModuleReference
	 * @generated
	 */
	public Adapter createModuleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.ContractModuleReference <em>Contract Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.ContractModuleReference
	 * @generated
	 */
	public Adapter createContractModuleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.Solution
	 * @generated
	 */
	public Adapter createSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.SupportedBy
	 * @generated
	 */
	public Adapter createSupportedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gsn.InContextOf
	 * @generated
	 */
	public Adapter createInContextOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.SACMElement <em>SACM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.SACMElement
	 * @generated
	 */
	public Adapter createSACMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ArtifactElement
	 * @generated
	 */
	public Adapter createArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentationElement
	 * @generated
	 */
	public Adapter createArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentPackage <em>Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentPackage
	 * @generated
	 */
	public Adapter createArgumentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentPackageBinding <em>Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentPackageBinding
	 * @generated
	 */
	public Adapter createArgumentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentAsset <em>Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentAsset
	 * @generated
	 */
	public Adapter createArgumentAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArgumentReasoning
	 * @generated
	 */
	public Adapter createArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.ArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.ArtifactReference
	 * @generated
	 */
	public Adapter createArtifactReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedRelationship
	 * @generated
	 */
	public Adapter createAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedInference
	 * @generated
	 */
	public Adapter createAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see argumentation.AssertedContext
	 * @generated
	 */
	public Adapter createAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Gsn_AdapterFactory
