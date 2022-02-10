/**
 */
package gsn;

import argumentation.Argumentation_Package;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gsn.Gsn_Factory
 * @model kind="package"
 * @generated
 */
public interface Gsn_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://scsc.acwg.gsn/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gsn_Package eINSTANCE = gsn.impl.Gsn_PackageImpl.init();

	/**
	 * The meta object id for the '{@link gsn.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ModuleImpl
	 * @see gsn.impl.Gsn_PackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__GID = Argumentation_Package.ARGUMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = Argumentation_Package.ARGUMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INTERFACE = Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContractModuleImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContractModule()
	 * @generated
	 */
	int CONTRACT_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__GID = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IS_CITATION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__NAME = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__DESCRIPTION = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__NOTE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__ARGUMENTATION_ELEMENT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__ARGUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__INTERFACE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__INTERFACE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE__PARTICIPANT_PACKAGE = Argumentation_Package.ARGUMENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE;

	/**
	 * The number of structural features of the '<em>Contract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ChoiceImpl
	 * @see gsn.impl.Gsn_PackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContextImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_PUBLIC = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UNINSTANTIATED = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.StrategyImpl
	 * @see gsn.impl.Gsn_PackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GID = Argumentation_Package.ARGUMENT_REASONING__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_CITATION = Argumentation_Package.ARGUMENT_REASONING__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_ABSTRACT = Argumentation_Package.ARGUMENT_REASONING__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CITED_ELEMENT = Argumentation_Package.ARGUMENT_REASONING__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_REASONING__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = Argumentation_Package.ARGUMENT_REASONING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = Argumentation_Package.ARGUMENT_REASONING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_REASONING__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NOTE = Argumentation_Package.ARGUMENT_REASONING__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__TAGGED_VALUE = Argumentation_Package.ARGUMENT_REASONING__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRUCTURE = Argumentation_Package.ARGUMENT_REASONING__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNDEVELOPED = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__UNINSTANTIATED = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = Argumentation_Package.ARGUMENT_REASONING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.GoalImpl
	 * @see gsn.impl.Gsn_PackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PUBLIC = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Undeveloped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNDEVELOPED = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_SUPPORTED_BY_CONTRACT = Argumentation_Package.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UNINSTANTIATED = Argumentation_Package.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link gsn.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.JustificationImpl
	 * @see gsn.impl.Gsn_PackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_PUBLIC = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__UNINSTANTIATED = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AssumptionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_PUBLIC = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__UNINSTANTIATED = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayGoalImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__MODULE = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayAssumptionImpl <em>Away Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayAssumptionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayAssumption()
	 * @generated
	 */
	int AWAY_ASSUMPTION = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION__MODULE = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_ASSUMPTION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayJustificationImpl <em>Away Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayJustificationImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayJustification()
	 * @generated
	 */
	int AWAY_JUSTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__GID = Argumentation_Package.CLAIM__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__IS_CITATION = Argumentation_Package.CLAIM__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__IS_ABSTRACT = Argumentation_Package.CLAIM__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__CITED_ELEMENT = Argumentation_Package.CLAIM__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__ABSTRACT_FORM = Argumentation_Package.CLAIM__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__NAME = Argumentation_Package.CLAIM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__DESCRIPTION = Argumentation_Package.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.CLAIM__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__NOTE = Argumentation_Package.CLAIM__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__TAGGED_VALUE = Argumentation_Package.CLAIM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__ASSERTION_DECLARATION = Argumentation_Package.CLAIM__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__META_CLAIM = Argumentation_Package.CLAIM__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION__MODULE = Argumentation_Package.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_JUSTIFICATION_FEATURE_COUNT = Argumentation_Package.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwaySolutionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__MODULE = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.AwayContextImpl
	 * @see gsn.impl.Gsn_PackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__GID = Argumentation_Package.ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_CITATION = Argumentation_Package.ARGUMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_ABSTRACT = Argumentation_Package.ARGUMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CITED_ELEMENT = Argumentation_Package.ARGUMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__ABSTRACT_FORM = Argumentation_Package.ARGUMENT_ASSET__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NAME = Argumentation_Package.ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = Argumentation_Package.ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARGUMENT_ASSET__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__NOTE = Argumentation_Package.ARGUMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__TAGGED_VALUE = Argumentation_Package.ARGUMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__MODULE = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = Argumentation_Package.ARGUMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsn.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ModuleReferenceImpl
	 * @see gsn.impl.Gsn_PackageImpl#getModuleReference()
	 * @generated
	 */
	int MODULE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REFERENCE_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.ContractModuleReferenceImpl
	 * @see gsn.impl.Gsn_PackageImpl#getContractModuleReference()
	 * @generated
	 */
	int CONTRACT_MODULE_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The number of structural features of the '<em>Contract Module Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_MODULE_REFERENCE_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link gsn.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.SolutionImpl
	 * @see gsn.impl.Gsn_PackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 15;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__GID = Argumentation_Package.ARTIFACT_REFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_CITATION = Argumentation_Package.ARTIFACT_REFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_ABSTRACT = Argumentation_Package.ARTIFACT_REFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CITED_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ABSTRACT_FORM = Argumentation_Package.ARTIFACT_REFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = Argumentation_Package.ARTIFACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = Argumentation_Package.ARTIFACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ARTIFACT_REFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NOTE = Argumentation_Package.ARTIFACT_REFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TAGGED_VALUE = Argumentation_Package.ARTIFACT_REFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Referenced Artifact Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__REFERENCED_ARTIFACT_ELEMENT = Argumentation_Package.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_PUBLIC = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uninstantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__UNINSTANTIATED = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = Argumentation_Package.ARTIFACT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.SupportedByImpl
	 * @see gsn.impl.Gsn_PackageImpl#getSupportedBy()
	 * @generated
	 */
	int SUPPORTED_BY = 16;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__GID = Argumentation_Package.ASSERTED_INFERENCE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_CITATION = Argumentation_Package.ASSERTED_INFERENCE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_ABSTRACT = Argumentation_Package.ASSERTED_INFERENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__CITED_ELEMENT = Argumentation_Package.ASSERTED_INFERENCE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ABSTRACT_FORM = Argumentation_Package.ASSERTED_INFERENCE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NAME = Argumentation_Package.ASSERTED_INFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__DESCRIPTION = Argumentation_Package.ASSERTED_INFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_INFERENCE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__NOTE = Argumentation_Package.ASSERTED_INFERENCE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TAGGED_VALUE = Argumentation_Package.ASSERTED_INFERENCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_INFERENCE__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__META_CLAIM = Argumentation_Package.ASSERTED_INFERENCE__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_COUNTER = Argumentation_Package.ASSERTED_INFERENCE__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__SOURCE = Argumentation_Package.ASSERTED_INFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__TARGET = Argumentation_Package.ASSERTED_INFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__REASONING = Argumentation_Package.ASSERTED_INFERENCE__REASONING;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_MANY = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY__IS_OPTIONAL = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supported By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BY_FEATURE_COUNT = Argumentation_Package.ASSERTED_INFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsn.impl.InContextOfImpl
	 * @see gsn.impl.Gsn_PackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 17;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__GID = Argumentation_Package.ASSERTED_CONTEXT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_CITATION = Argumentation_Package.ASSERTED_CONTEXT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_ABSTRACT = Argumentation_Package.ASSERTED_CONTEXT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CITED_ELEMENT = Argumentation_Package.ASSERTED_CONTEXT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ABSTRACT_FORM = Argumentation_Package.ASSERTED_CONTEXT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NAME = Argumentation_Package.ASSERTED_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__DESCRIPTION = Argumentation_Package.ASSERTED_CONTEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IMPLEMENTATION_CONSTRAINT = Argumentation_Package.ASSERTED_CONTEXT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__NOTE = Argumentation_Package.ASSERTED_CONTEXT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TAGGED_VALUE = Argumentation_Package.ASSERTED_CONTEXT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Assertion Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__ASSERTION_DECLARATION = Argumentation_Package.ASSERTED_CONTEXT__ASSERTION_DECLARATION;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__META_CLAIM = Argumentation_Package.ASSERTED_CONTEXT__META_CLAIM;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_COUNTER = Argumentation_Package.ASSERTED_CONTEXT__IS_COUNTER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__SOURCE = Argumentation_Package.ASSERTED_CONTEXT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__TARGET = Argumentation_Package.ASSERTED_CONTEXT__TARGET;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__REASONING = Argumentation_Package.ASSERTED_CONTEXT__REASONING;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_MANY = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__IS_OPTIONAL = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = Argumentation_Package.ASSERTED_CONTEXT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link gsn.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see gsn.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for class '{@link gsn.ContractModule <em>Contract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module</em>'.
	 * @see gsn.ContractModule
	 * @generated
	 */
	EClass getContractModule();

	/**
	 * Returns the meta object for class '{@link gsn.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see gsn.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see gsn.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Context#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Context#isIsPublic()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Context#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Context#isUninstantiated()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see gsn.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Strategy#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see gsn.Strategy#isUndeveloped()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Undeveloped();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Strategy#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Strategy#isUninstantiated()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see gsn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Goal#isIsPublic()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isUndeveloped <em>Undeveloped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undeveloped</em>'.
	 * @see gsn.Goal#isUndeveloped()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Undeveloped();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isToBeSupportedByContract <em>To Be Supported By Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported By Contract</em>'.
	 * @see gsn.Goal#isToBeSupportedByContract()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_ToBeSupportedByContract();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Goal#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Goal#isUninstantiated()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see gsn.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Justification#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Justification#isIsPublic()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Justification#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Justification#isUninstantiated()
	 * @see #getJustification()
	 * @generated
	 */
	EAttribute getJustification_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see gsn.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Assumption#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Assumption#isIsPublic()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Assumption#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Assumption#isUninstantiated()
	 * @see #getAssumption()
	 * @generated
	 */
	EAttribute getAssumption_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see gsn.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the attribute '{@link gsn.AwayGoal#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gsn.AwayGoal#getModule()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EAttribute getAwayGoal_Module();

	/**
	 * Returns the meta object for class '{@link gsn.AwayAssumption <em>Away Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Assumption</em>'.
	 * @see gsn.AwayAssumption
	 * @generated
	 */
	EClass getAwayAssumption();

	/**
	 * Returns the meta object for the attribute '{@link gsn.AwayAssumption#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gsn.AwayAssumption#getModule()
	 * @see #getAwayAssumption()
	 * @generated
	 */
	EAttribute getAwayAssumption_Module();

	/**
	 * Returns the meta object for class '{@link gsn.AwayJustification <em>Away Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Justification</em>'.
	 * @see gsn.AwayJustification
	 * @generated
	 */
	EClass getAwayJustification();

	/**
	 * Returns the meta object for the attribute '{@link gsn.AwayJustification#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gsn.AwayJustification#getModule()
	 * @see #getAwayJustification()
	 * @generated
	 */
	EAttribute getAwayJustification_Module();

	/**
	 * Returns the meta object for class '{@link gsn.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see gsn.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the attribute '{@link gsn.AwaySolution#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gsn.AwaySolution#getModule()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EAttribute getAwaySolution_Module();

	/**
	 * Returns the meta object for class '{@link gsn.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see gsn.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the attribute '{@link gsn.AwayContext#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gsn.AwayContext#getModule()
	 * @see #getAwayContext()
	 * @generated
	 */
	EAttribute getAwayContext_Module();

	/**
	 * Returns the meta object for class '{@link gsn.ModuleReference <em>Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Reference</em>'.
	 * @see gsn.ModuleReference
	 * @generated
	 */
	EClass getModuleReference();

	/**
	 * Returns the meta object for class '{@link gsn.ContractModuleReference <em>Contract Module Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Module Reference</em>'.
	 * @see gsn.ContractModuleReference
	 * @generated
	 */
	EClass getContractModuleReference();

	/**
	 * Returns the meta object for class '{@link gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see gsn.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Solution#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see gsn.Solution#isIsPublic()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link gsn.Solution#isUninstantiated <em>Uninstantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uninstantiated</em>'.
	 * @see gsn.Solution#isUninstantiated()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Uninstantiated();

	/**
	 * Returns the meta object for class '{@link gsn.SupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported By</em>'.
	 * @see gsn.SupportedBy
	 * @generated
	 */
	EClass getSupportedBy();

	/**
	 * Returns the meta object for the attribute '{@link gsn.SupportedBy#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see gsn.SupportedBy#isIsMany()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EAttribute getSupportedBy_IsMany();

	/**
	 * Returns the meta object for the attribute '{@link gsn.SupportedBy#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see gsn.SupportedBy#isIsOptional()
	 * @see #getSupportedBy()
	 * @generated
	 */
	EAttribute getSupportedBy_IsOptional();

	/**
	 * Returns the meta object for class '{@link gsn.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see gsn.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for the attribute '{@link gsn.InContextOf#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see gsn.InContextOf#isIsMany()
	 * @see #getInContextOf()
	 * @generated
	 */
	EAttribute getInContextOf_IsMany();

	/**
	 * Returns the meta object for the attribute '{@link gsn.InContextOf#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see gsn.InContextOf#isIsOptional()
	 * @see #getInContextOf()
	 * @generated
	 */
	EAttribute getInContextOf_IsOptional();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gsn_Factory getGsn_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gsn.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ModuleImpl
		 * @see gsn.impl.Gsn_PackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContractModuleImpl <em>Contract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContractModuleImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContractModule()
		 * @generated
		 */
		EClass CONTRACT_MODULE = eINSTANCE.getContractModule();

		/**
		 * The meta object literal for the '{@link gsn.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ChoiceImpl
		 * @see gsn.impl.Gsn_PackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContextImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__IS_PUBLIC = eINSTANCE.getContext_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__UNINSTANTIATED = eINSTANCE.getContext_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.StrategyImpl
		 * @see gsn.impl.Gsn_PackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__UNDEVELOPED = eINSTANCE.getStrategy_Undeveloped();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__UNINSTANTIATED = eINSTANCE.getStrategy_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.GoalImpl
		 * @see gsn.impl.Gsn_PackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__IS_PUBLIC = eINSTANCE.getGoal_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Undeveloped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__UNDEVELOPED = eINSTANCE.getGoal_Undeveloped();

		/**
		 * The meta object literal for the '<em><b>To Be Supported By Contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TO_BE_SUPPORTED_BY_CONTRACT = eINSTANCE.getGoal_ToBeSupportedByContract();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__UNINSTANTIATED = eINSTANCE.getGoal_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.JustificationImpl
		 * @see gsn.impl.Gsn_PackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__IS_PUBLIC = eINSTANCE.getJustification_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUSTIFICATION__UNINSTANTIATED = eINSTANCE.getJustification_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AssumptionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSUMPTION__IS_PUBLIC = eINSTANCE.getAssumption_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSUMPTION__UNINSTANTIATED = eINSTANCE.getAssumption_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayGoalImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_GOAL__MODULE = eINSTANCE.getAwayGoal_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayAssumptionImpl <em>Away Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayAssumptionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayAssumption()
		 * @generated
		 */
		EClass AWAY_ASSUMPTION = eINSTANCE.getAwayAssumption();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_ASSUMPTION__MODULE = eINSTANCE.getAwayAssumption_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayJustificationImpl <em>Away Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayJustificationImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayJustification()
		 * @generated
		 */
		EClass AWAY_JUSTIFICATION = eINSTANCE.getAwayJustification();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_JUSTIFICATION__MODULE = eINSTANCE.getAwayJustification_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwaySolutionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_SOLUTION__MODULE = eINSTANCE.getAwaySolution_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.AwayContextImpl
		 * @see gsn.impl.Gsn_PackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWAY_CONTEXT__MODULE = eINSTANCE.getAwayContext_Module();

		/**
		 * The meta object literal for the '{@link gsn.impl.ModuleReferenceImpl <em>Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ModuleReferenceImpl
		 * @see gsn.impl.Gsn_PackageImpl#getModuleReference()
		 * @generated
		 */
		EClass MODULE_REFERENCE = eINSTANCE.getModuleReference();

		/**
		 * The meta object literal for the '{@link gsn.impl.ContractModuleReferenceImpl <em>Contract Module Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.ContractModuleReferenceImpl
		 * @see gsn.impl.Gsn_PackageImpl#getContractModuleReference()
		 * @generated
		 */
		EClass CONTRACT_MODULE_REFERENCE = eINSTANCE.getContractModuleReference();

		/**
		 * The meta object literal for the '{@link gsn.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.SolutionImpl
		 * @see gsn.impl.Gsn_PackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__IS_PUBLIC = eINSTANCE.getSolution_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Uninstantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__UNINSTANTIATED = eINSTANCE.getSolution_Uninstantiated();

		/**
		 * The meta object literal for the '{@link gsn.impl.SupportedByImpl <em>Supported By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.SupportedByImpl
		 * @see gsn.impl.Gsn_PackageImpl#getSupportedBy()
		 * @generated
		 */
		EClass SUPPORTED_BY = eINSTANCE.getSupportedBy();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_BY__IS_MANY = eINSTANCE.getSupportedBy_IsMany();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_BY__IS_OPTIONAL = eINSTANCE.getSupportedBy_IsOptional();

		/**
		 * The meta object literal for the '{@link gsn.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsn.impl.InContextOfImpl
		 * @see gsn.impl.Gsn_PackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_CONTEXT_OF__IS_MANY = eINSTANCE.getInContextOf_IsMany();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_CONTEXT_OF__IS_OPTIONAL = eINSTANCE.getInContextOf_IsOptional();

	}

} //Gsn_Package
