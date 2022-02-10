/**
 */
package gsn.impl;


import argumentation.Argumentation_Package;

import argumentation.impl.Argumentation_PackageImpl;

import base.Base_Package;

import base.impl.Base_PackageImpl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gsn_PackageImpl extends EPackageImpl implements Gsn_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayAssumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayJustificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awaySolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractModuleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inContextOfEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gsn.Gsn_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Gsn_PackageImpl() {
		super(eNS_URI, Gsn_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Gsn_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Gsn_Package init() {
		if (isInited) return (Gsn_Package)EPackage.Registry.INSTANCE.getEPackage(Gsn_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredGsn_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Gsn_PackageImpl theGsn_Package = registeredGsn_Package instanceof Gsn_PackageImpl ? (Gsn_PackageImpl)registeredGsn_Package : new Gsn_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);
		Argumentation_PackageImpl theArgumentation_Package = (Argumentation_PackageImpl)(registeredPackage instanceof Argumentation_PackageImpl ? registeredPackage : Argumentation_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);

		// Create package meta-data objects
		theGsn_Package.createPackageContents();
		theArgumentation_Package.createPackageContents();
		theBase_Package.createPackageContents();

		// Initialize created meta-data
		theGsn_Package.initializePackageContents();
		theArgumentation_Package.initializePackageContents();
		theBase_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGsn_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Gsn_Package.eNS_URI, theGsn_Package);
		return theGsn_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractModule() {
		return contractModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_IsPublic() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Uninstantiated() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Undeveloped() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Uninstantiated() {
		return (EAttribute)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_IsPublic() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Undeveloped() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_ToBeSupportedByContract() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Uninstantiated() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_IsPublic() {
		return (EAttribute)justificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJustification_Uninstantiated() {
		return (EAttribute)justificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssumption_IsPublic() {
		return (EAttribute)assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssumption_Uninstantiated() {
		return (EAttribute)assumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayGoal() {
		return awayGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayGoal_Module() {
		return (EAttribute)awayGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayAssumption() {
		return awayAssumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayAssumption_Module() {
		return (EAttribute)awayAssumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayJustification() {
		return awayJustificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayJustification_Module() {
		return (EAttribute)awayJustificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwaySolution() {
		return awaySolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwaySolution_Module() {
		return (EAttribute)awaySolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayContext() {
		return awayContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayContext_Module() {
		return (EAttribute)awayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleReference() {
		return moduleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractModuleReference() {
		return contractModuleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_IsPublic() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_Uninstantiated() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedBy() {
		return supportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedBy_IsMany() {
		return (EAttribute)supportedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedBy_IsOptional() {
		return (EAttribute)supportedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInContextOf() {
		return inContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInContextOf_IsMany() {
		return (EAttribute)inContextOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInContextOf_IsOptional() {
		return (EAttribute)inContextOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gsn_Factory getGsn_Factory() {
		return (Gsn_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		moduleEClass = createEClass(MODULE);

		contractModuleEClass = createEClass(CONTRACT_MODULE);

		choiceEClass = createEClass(CHOICE);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__IS_PUBLIC);
		createEAttribute(contextEClass, CONTEXT__UNINSTANTIATED);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__UNDEVELOPED);
		createEAttribute(strategyEClass, STRATEGY__UNINSTANTIATED);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__IS_PUBLIC);
		createEAttribute(goalEClass, GOAL__UNDEVELOPED);
		createEAttribute(goalEClass, GOAL__TO_BE_SUPPORTED_BY_CONTRACT);
		createEAttribute(goalEClass, GOAL__UNINSTANTIATED);

		justificationEClass = createEClass(JUSTIFICATION);
		createEAttribute(justificationEClass, JUSTIFICATION__IS_PUBLIC);
		createEAttribute(justificationEClass, JUSTIFICATION__UNINSTANTIATED);

		assumptionEClass = createEClass(ASSUMPTION);
		createEAttribute(assumptionEClass, ASSUMPTION__IS_PUBLIC);
		createEAttribute(assumptionEClass, ASSUMPTION__UNINSTANTIATED);

		awayGoalEClass = createEClass(AWAY_GOAL);
		createEAttribute(awayGoalEClass, AWAY_GOAL__MODULE);

		awayAssumptionEClass = createEClass(AWAY_ASSUMPTION);
		createEAttribute(awayAssumptionEClass, AWAY_ASSUMPTION__MODULE);

		awayJustificationEClass = createEClass(AWAY_JUSTIFICATION);
		createEAttribute(awayJustificationEClass, AWAY_JUSTIFICATION__MODULE);

		awaySolutionEClass = createEClass(AWAY_SOLUTION);
		createEAttribute(awaySolutionEClass, AWAY_SOLUTION__MODULE);

		awayContextEClass = createEClass(AWAY_CONTEXT);
		createEAttribute(awayContextEClass, AWAY_CONTEXT__MODULE);

		moduleReferenceEClass = createEClass(MODULE_REFERENCE);

		contractModuleReferenceEClass = createEClass(CONTRACT_MODULE_REFERENCE);

		solutionEClass = createEClass(SOLUTION);
		createEAttribute(solutionEClass, SOLUTION__IS_PUBLIC);
		createEAttribute(solutionEClass, SOLUTION__UNINSTANTIATED);

		supportedByEClass = createEClass(SUPPORTED_BY);
		createEAttribute(supportedByEClass, SUPPORTED_BY__IS_MANY);
		createEAttribute(supportedByEClass, SUPPORTED_BY__IS_OPTIONAL);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);
		createEAttribute(inContextOfEClass, IN_CONTEXT_OF__IS_MANY);
		createEAttribute(inContextOfEClass, IN_CONTEXT_OF__IS_OPTIONAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Argumentation_Package theArgumentation_Package = (Argumentation_Package)EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduleEClass.getESuperTypes().add(theArgumentation_Package.getArgumentPackage());
		contractModuleEClass.getESuperTypes().add(theArgumentation_Package.getArgumentPackageBinding());
		choiceEClass.getESuperTypes().add(theArgumentation_Package.getArgumentAsset());
		contextEClass.getESuperTypes().add(theArgumentation_Package.getArgumentAsset());
		strategyEClass.getESuperTypes().add(theArgumentation_Package.getArgumentReasoning());
		goalEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		justificationEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		assumptionEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		awayGoalEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		awayAssumptionEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		awayJustificationEClass.getESuperTypes().add(theArgumentation_Package.getClaim());
		awaySolutionEClass.getESuperTypes().add(theArgumentation_Package.getArtifactReference());
		awayContextEClass.getESuperTypes().add(theArgumentation_Package.getArgumentAsset());
		moduleReferenceEClass.getESuperTypes().add(theArgumentation_Package.getArtifactReference());
		contractModuleReferenceEClass.getESuperTypes().add(theArgumentation_Package.getArtifactReference());
		solutionEClass.getESuperTypes().add(theArgumentation_Package.getArtifactReference());
		supportedByEClass.getESuperTypes().add(theArgumentation_Package.getAssertedInference());
		inContextOfEClass.getESuperTypes().add(theArgumentation_Package.getAssertedContext());

		// Initialize classes and features; add operations and parameters
		initEClass(moduleEClass, gsn.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractModuleEClass, ContractModule.class, "ContractModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_IsPublic(), ecorePackage.getEBoolean(), "isPublic", "false", 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategy_Undeveloped(), ecorePackage.getEBoolean(), "undeveloped", "false", 1, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrategy_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_IsPublic(), ecorePackage.getEBoolean(), "isPublic", "false", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Undeveloped(), ecorePackage.getEBoolean(), "undeveloped", "false", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_ToBeSupportedByContract(), ecorePackage.getEBoolean(), "toBeSupportedByContract", "false", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJustification_IsPublic(), ecorePackage.getEBoolean(), "isPublic", "false", 1, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJustification_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssumption_IsPublic(), ecorePackage.getEBoolean(), "isPublic", "false", 1, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssumption_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayGoalEClass, AwayGoal.class, "AwayGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayGoal_Module(), ecorePackage.getEString(), "module", null, 0, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayAssumptionEClass, AwayAssumption.class, "AwayAssumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayAssumption_Module(), ecorePackage.getEString(), "module", null, 0, 1, AwayAssumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayJustificationEClass, AwayJustification.class, "AwayJustification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayJustification_Module(), ecorePackage.getEString(), "module", null, 0, 1, AwayJustification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awaySolutionEClass, AwaySolution.class, "AwaySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwaySolution_Module(), ecorePackage.getEString(), "module", null, 0, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayContextEClass, AwayContext.class, "AwayContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwayContext_Module(), ecorePackage.getEString(), "module", null, 0, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleReferenceEClass, ModuleReference.class, "ModuleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractModuleReferenceEClass, ContractModuleReference.class, "ContractModuleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolution_IsPublic(), ecorePackage.getEBoolean(), "isPublic", "false", 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolution_Uninstantiated(), ecorePackage.getEBoolean(), "uninstantiated", "false", 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedByEClass, SupportedBy.class, "SupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportedBy_IsMany(), ecorePackage.getEBoolean(), "isMany", "false", 1, 1, SupportedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportedBy_IsOptional(), ecorePackage.getEBoolean(), "isOptional", "false", 1, 1, SupportedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInContextOf_IsMany(), ecorePackage.getEBoolean(), "isMany", "false", 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInContextOf_IsOptional(), ecorePackage.getEBoolean(), "isOptional", "false", 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Gsn_PackageImpl
