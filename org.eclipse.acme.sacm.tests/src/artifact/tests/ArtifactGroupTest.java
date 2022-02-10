/**
 */
package artifact.tests;

import artifact.ArtifactGroup;
import artifact.Artifact_Factory;

import base.tests.ArtifactElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactGroupTest extends ArtifactElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactGroupTest.class);
	}

	/**
	 * Constructs a new Artifact Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactGroup getFixture() {
		return (ArtifactGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactGroup());
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

} //ArtifactGroupTest
