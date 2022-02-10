/**
 */
package argumentation.tests;

import argumentation.ArgumentReasoning;
import argumentation.Argumentation_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentReasoningTest extends ArgumentAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentReasoningTest.class);
	}

	/**
	 * Constructs a new Argument Reasoning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoningTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Reasoning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentReasoning getFixture() {
		return (ArgumentReasoning)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createArgumentReasoning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ArgumentReasoningTest
