/**
 */
package argumentation.tests;

import argumentation.Argumentation_Factory;
import argumentation.AssertedInference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Inference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedInferenceTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedInferenceTest.class);
	}

	/**
	 * Constructs a new Asserted Inference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedInferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Inference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedInference getFixture() {
		return (AssertedInference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createAssertedInference());
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

} //AssertedInferenceTest
