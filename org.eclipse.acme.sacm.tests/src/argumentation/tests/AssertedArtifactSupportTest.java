/**
 */
package argumentation.tests;

import argumentation.Argumentation_Factory;
import argumentation.AssertedArtifactSupport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Artifact Support</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedArtifactSupportTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedArtifactSupportTest.class);
	}

	/**
	 * Constructs a new Asserted Artifact Support test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedArtifactSupportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Artifact Support test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedArtifactSupport getFixture() {
		return (AssertedArtifactSupport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createAssertedArtifactSupport());
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

} //AssertedArtifactSupportTest
