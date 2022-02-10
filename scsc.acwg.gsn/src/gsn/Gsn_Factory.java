/**
 */
package gsn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gsn.Gsn_Package
 * @generated
 */
public interface Gsn_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gsn_Factory eINSTANCE = gsn.impl.Gsn_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Contract Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Module</em>'.
	 * @generated
	 */
	ContractModule createContractModule();

	/**
	 * Returns a new object of class '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice</em>'.
	 * @generated
	 */
	Choice createChoice();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Justification</em>'.
	 * @generated
	 */
	Justification createJustification();

	/**
	 * Returns a new object of class '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption</em>'.
	 * @generated
	 */
	Assumption createAssumption();

	/**
	 * Returns a new object of class '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Goal</em>'.
	 * @generated
	 */
	AwayGoal createAwayGoal();

	/**
	 * Returns a new object of class '<em>Away Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Assumption</em>'.
	 * @generated
	 */
	AwayAssumption createAwayAssumption();

	/**
	 * Returns a new object of class '<em>Away Justification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Justification</em>'.
	 * @generated
	 */
	AwayJustification createAwayJustification();

	/**
	 * Returns a new object of class '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Solution</em>'.
	 * @generated
	 */
	AwaySolution createAwaySolution();

	/**
	 * Returns a new object of class '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Away Context</em>'.
	 * @generated
	 */
	AwayContext createAwayContext();

	/**
	 * Returns a new object of class '<em>Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Reference</em>'.
	 * @generated
	 */
	ModuleReference createModuleReference();

	/**
	 * Returns a new object of class '<em>Contract Module Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract Module Reference</em>'.
	 * @generated
	 */
	ContractModuleReference createContractModuleReference();

	/**
	 * Returns a new object of class '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution</em>'.
	 * @generated
	 */
	Solution createSolution();

	/**
	 * Returns a new object of class '<em>Supported By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported By</em>'.
	 * @generated
	 */
	SupportedBy createSupportedBy();

	/**
	 * Returns a new object of class '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Context Of</em>'.
	 * @generated
	 */
	InContextOf createInContextOf();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Gsn_Package getGsn_Package();

} //Gsn_Factory
