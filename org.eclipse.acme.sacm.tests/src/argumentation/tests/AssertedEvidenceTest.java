/**
 */
package argumentation.tests;

import argumentation.Argumentation_Factory;
import argumentation.AssertedEvidence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Evidence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedEvidenceTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedEvidenceTest.class);
	}

	/**
	 * Constructs a new Asserted Evidence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedEvidenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Evidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedEvidence getFixture() {
		return (AssertedEvidence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createAssertedEvidence());
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

} //AssertedEvidenceTest
