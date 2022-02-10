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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gsn.Gsn_Package
 * @generated
 */
public class Gsn_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Gsn_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsn_Switch() {
		if (modelPackage == null) {
			modelPackage = Gsn_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Gsn_Package.MODULE: {
				gsn.Module module = (gsn.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseArgumentPackage(module);
				if (result == null) result = caseArgumentationElement(module);
				if (result == null) result = caseArtifactElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseSACMElement(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.CONTRACT_MODULE: {
				ContractModule contractModule = (ContractModule)theEObject;
				T result = caseContractModule(contractModule);
				if (result == null) result = caseArgumentPackageBinding(contractModule);
				if (result == null) result = caseArgumentPackage(contractModule);
				if (result == null) result = caseArgumentationElement(contractModule);
				if (result == null) result = caseArtifactElement(contractModule);
				if (result == null) result = caseModelElement(contractModule);
				if (result == null) result = caseSACMElement(contractModule);
				if (result == null) result = caseElement(contractModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseArgumentAsset(choice);
				if (result == null) result = caseArgumentationElement(choice);
				if (result == null) result = caseArtifactElement(choice);
				if (result == null) result = caseModelElement(choice);
				if (result == null) result = caseSACMElement(choice);
				if (result == null) result = caseElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseArgumentAsset(context);
				if (result == null) result = caseArgumentationElement(context);
				if (result == null) result = caseArtifactElement(context);
				if (result == null) result = caseModelElement(context);
				if (result == null) result = caseSACMElement(context);
				if (result == null) result = caseElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseArgumentReasoning(strategy);
				if (result == null) result = caseArgumentAsset(strategy);
				if (result == null) result = caseArgumentationElement(strategy);
				if (result == null) result = caseArtifactElement(strategy);
				if (result == null) result = caseModelElement(strategy);
				if (result == null) result = caseSACMElement(strategy);
				if (result == null) result = caseElement(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseClaim(goal);
				if (result == null) result = caseAssertion(goal);
				if (result == null) result = caseArgumentAsset(goal);
				if (result == null) result = caseArgumentationElement(goal);
				if (result == null) result = caseArtifactElement(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = caseSACMElement(goal);
				if (result == null) result = caseElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.JUSTIFICATION: {
				Justification justification = (Justification)theEObject;
				T result = caseJustification(justification);
				if (result == null) result = caseClaim(justification);
				if (result == null) result = caseAssertion(justification);
				if (result == null) result = caseArgumentAsset(justification);
				if (result == null) result = caseArgumentationElement(justification);
				if (result == null) result = caseArtifactElement(justification);
				if (result == null) result = caseModelElement(justification);
				if (result == null) result = caseSACMElement(justification);
				if (result == null) result = caseElement(justification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseClaim(assumption);
				if (result == null) result = caseAssertion(assumption);
				if (result == null) result = caseArgumentAsset(assumption);
				if (result == null) result = caseArgumentationElement(assumption);
				if (result == null) result = caseArtifactElement(assumption);
				if (result == null) result = caseModelElement(assumption);
				if (result == null) result = caseSACMElement(assumption);
				if (result == null) result = caseElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.AWAY_GOAL: {
				AwayGoal awayGoal = (AwayGoal)theEObject;
				T result = caseAwayGoal(awayGoal);
				if (result == null) result = caseClaim(awayGoal);
				if (result == null) result = caseAssertion(awayGoal);
				if (result == null) result = caseArgumentAsset(awayGoal);
				if (result == null) result = caseArgumentationElement(awayGoal);
				if (result == null) result = caseArtifactElement(awayGoal);
				if (result == null) result = caseModelElement(awayGoal);
				if (result == null) result = caseSACMElement(awayGoal);
				if (result == null) result = caseElement(awayGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.AWAY_ASSUMPTION: {
				AwayAssumption awayAssumption = (AwayAssumption)theEObject;
				T result = caseAwayAssumption(awayAssumption);
				if (result == null) result = caseClaim(awayAssumption);
				if (result == null) result = caseAssertion(awayAssumption);
				if (result == null) result = caseArgumentAsset(awayAssumption);
				if (result == null) result = caseArgumentationElement(awayAssumption);
				if (result == null) result = caseArtifactElement(awayAssumption);
				if (result == null) result = caseModelElement(awayAssumption);
				if (result == null) result = caseSACMElement(awayAssumption);
				if (result == null) result = caseElement(awayAssumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.AWAY_JUSTIFICATION: {
				AwayJustification awayJustification = (AwayJustification)theEObject;
				T result = caseAwayJustification(awayJustification);
				if (result == null) result = caseClaim(awayJustification);
				if (result == null) result = caseAssertion(awayJustification);
				if (result == null) result = caseArgumentAsset(awayJustification);
				if (result == null) result = caseArgumentationElement(awayJustification);
				if (result == null) result = caseArtifactElement(awayJustification);
				if (result == null) result = caseModelElement(awayJustification);
				if (result == null) result = caseSACMElement(awayJustification);
				if (result == null) result = caseElement(awayJustification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.AWAY_SOLUTION: {
				AwaySolution awaySolution = (AwaySolution)theEObject;
				T result = caseAwaySolution(awaySolution);
				if (result == null) result = caseArtifactReference(awaySolution);
				if (result == null) result = caseArgumentAsset(awaySolution);
				if (result == null) result = caseArgumentationElement(awaySolution);
				if (result == null) result = caseArtifactElement(awaySolution);
				if (result == null) result = caseModelElement(awaySolution);
				if (result == null) result = caseSACMElement(awaySolution);
				if (result == null) result = caseElement(awaySolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.AWAY_CONTEXT: {
				AwayContext awayContext = (AwayContext)theEObject;
				T result = caseAwayContext(awayContext);
				if (result == null) result = caseArgumentAsset(awayContext);
				if (result == null) result = caseArgumentationElement(awayContext);
				if (result == null) result = caseArtifactElement(awayContext);
				if (result == null) result = caseModelElement(awayContext);
				if (result == null) result = caseSACMElement(awayContext);
				if (result == null) result = caseElement(awayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.MODULE_REFERENCE: {
				ModuleReference moduleReference = (ModuleReference)theEObject;
				T result = caseModuleReference(moduleReference);
				if (result == null) result = caseArtifactReference(moduleReference);
				if (result == null) result = caseArgumentAsset(moduleReference);
				if (result == null) result = caseArgumentationElement(moduleReference);
				if (result == null) result = caseArtifactElement(moduleReference);
				if (result == null) result = caseModelElement(moduleReference);
				if (result == null) result = caseSACMElement(moduleReference);
				if (result == null) result = caseElement(moduleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.CONTRACT_MODULE_REFERENCE: {
				ContractModuleReference contractModuleReference = (ContractModuleReference)theEObject;
				T result = caseContractModuleReference(contractModuleReference);
				if (result == null) result = caseArtifactReference(contractModuleReference);
				if (result == null) result = caseArgumentAsset(contractModuleReference);
				if (result == null) result = caseArgumentationElement(contractModuleReference);
				if (result == null) result = caseArtifactElement(contractModuleReference);
				if (result == null) result = caseModelElement(contractModuleReference);
				if (result == null) result = caseSACMElement(contractModuleReference);
				if (result == null) result = caseElement(contractModuleReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = caseArtifactReference(solution);
				if (result == null) result = caseArgumentAsset(solution);
				if (result == null) result = caseArgumentationElement(solution);
				if (result == null) result = caseArtifactElement(solution);
				if (result == null) result = caseModelElement(solution);
				if (result == null) result = caseSACMElement(solution);
				if (result == null) result = caseElement(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.SUPPORTED_BY: {
				SupportedBy supportedBy = (SupportedBy)theEObject;
				T result = caseSupportedBy(supportedBy);
				if (result == null) result = caseAssertedInference(supportedBy);
				if (result == null) result = caseAssertedRelationship(supportedBy);
				if (result == null) result = caseAssertion(supportedBy);
				if (result == null) result = caseArgumentAsset(supportedBy);
				if (result == null) result = caseArgumentationElement(supportedBy);
				if (result == null) result = caseArtifactElement(supportedBy);
				if (result == null) result = caseModelElement(supportedBy);
				if (result == null) result = caseSACMElement(supportedBy);
				if (result == null) result = caseElement(supportedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Gsn_Package.IN_CONTEXT_OF: {
				InContextOf inContextOf = (InContextOf)theEObject;
				T result = caseInContextOf(inContextOf);
				if (result == null) result = caseAssertedContext(inContextOf);
				if (result == null) result = caseAssertedRelationship(inContextOf);
				if (result == null) result = caseAssertion(inContextOf);
				if (result == null) result = caseArgumentAsset(inContextOf);
				if (result == null) result = caseArgumentationElement(inContextOf);
				if (result == null) result = caseArtifactElement(inContextOf);
				if (result == null) result = caseModelElement(inContextOf);
				if (result == null) result = caseSACMElement(inContextOf);
				if (result == null) result = caseElement(inContextOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(gsn.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractModule(ContractModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustification(Justification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayGoal(AwayGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayAssumption(AwayAssumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayJustification(AwayJustification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwaySolution(AwaySolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayContext(AwayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleReference(ModuleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Module Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractModuleReference(ContractModuleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedBy(SupportedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInContextOf(InContextOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationElement(ArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackage(ArgumentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentPackageBinding(ArgumentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentAsset(ArgumentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactReference(ArtifactReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRelationship(AssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedContext(AssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Gsn_Switch
