/**
 */
package gsn.impl;

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
import gsn.Gsn_Factory;
import gsn.Gsn_Package;
import gsn.InContextOf;
import gsn.Justification;
import gsn.ModuleReference;
import gsn.Solution;
import gsn.Strategy;
import gsn.SupportedBy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gsn_FactoryImpl extends EFactoryImpl implements Gsn_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Gsn_Factory init() {
		try {
			Gsn_Factory theGsn_Factory = (Gsn_Factory)EPackage.Registry.INSTANCE.getEFactory(Gsn_Package.eNS_URI);
			if (theGsn_Factory != null) {
				return theGsn_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Gsn_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsn_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Gsn_Package.MODULE: return createModule();
			case Gsn_Package.CONTRACT_MODULE: return createContractModule();
			case Gsn_Package.CHOICE: return createChoice();
			case Gsn_Package.CONTEXT: return createContext();
			case Gsn_Package.STRATEGY: return createStrategy();
			case Gsn_Package.GOAL: return createGoal();
			case Gsn_Package.JUSTIFICATION: return createJustification();
			case Gsn_Package.ASSUMPTION: return createAssumption();
			case Gsn_Package.AWAY_GOAL: return createAwayGoal();
			case Gsn_Package.AWAY_ASSUMPTION: return createAwayAssumption();
			case Gsn_Package.AWAY_JUSTIFICATION: return createAwayJustification();
			case Gsn_Package.AWAY_SOLUTION: return createAwaySolution();
			case Gsn_Package.AWAY_CONTEXT: return createAwayContext();
			case Gsn_Package.MODULE_REFERENCE: return createModuleReference();
			case Gsn_Package.CONTRACT_MODULE_REFERENCE: return createContractModuleReference();
			case Gsn_Package.SOLUTION: return createSolution();
			case Gsn_Package.SUPPORTED_BY: return createSupportedBy();
			case Gsn_Package.IN_CONTEXT_OF: return createInContextOf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gsn.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractModule createContractModule() {
		ContractModuleImpl contractModule = new ContractModuleImpl();
		return contractModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayGoal createAwayGoal() {
		AwayGoalImpl awayGoal = new AwayGoalImpl();
		return awayGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayAssumption createAwayAssumption() {
		AwayAssumptionImpl awayAssumption = new AwayAssumptionImpl();
		return awayAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayJustification createAwayJustification() {
		AwayJustificationImpl awayJustification = new AwayJustificationImpl();
		return awayJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwaySolution createAwaySolution() {
		AwaySolutionImpl awaySolution = new AwaySolutionImpl();
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayContext createAwayContext() {
		AwayContextImpl awayContext = new AwayContextImpl();
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleReference createModuleReference() {
		ModuleReferenceImpl moduleReference = new ModuleReferenceImpl();
		return moduleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractModuleReference createContractModuleReference() {
		ContractModuleReferenceImpl contractModuleReference = new ContractModuleReferenceImpl();
		return contractModuleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedBy createSupportedBy() {
		SupportedByImpl supportedBy = new SupportedByImpl();
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InContextOf createInContextOf() {
		InContextOfImpl inContextOf = new InContextOfImpl();
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsn_Package getGsn_Package() {
		return (Gsn_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Gsn_Package getPackage() {
		return Gsn_Package.eINSTANCE;
	}

} //Gsn_FactoryImpl
