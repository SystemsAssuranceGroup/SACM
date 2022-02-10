/**
 */
package argumentation.tests;

import argumentation.Argumentation_Factory;
import argumentation.AssertedArtifactContext;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asserted Artifact Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertedArtifactContextTest extends AssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertedArtifactContextTest.class);
	}

	/**
	 * Constructs a new Asserted Artifact Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedArtifactContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asserted Artifact Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssertedArtifactContext getFixture() {
		return (AssertedArtifactContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createAssertedArtifactContext());
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

} //AssertedArtifactContextTest
