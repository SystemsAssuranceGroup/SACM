/**
 */
package artifact.tests;

import artifact.ArtifactPackage;
import artifact.Artifact_Factory;

import base.tests.ArtifactElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageTest extends ArtifactElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactPackageTest.class);
	}

	/**
	 * Constructs a new Artifact Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactPackage getFixture() {
		return (ArtifactPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactPackage());
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

} //ArtifactPackageTest
