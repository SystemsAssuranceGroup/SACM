/**
 */
package artifact.tests;

import artifact.ArtifactPackageBinding;
import artifact.Artifact_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageBindingTest extends ArtifactPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactPackageBindingTest.class);
	}

	/**
	 * Constructs a new Artifact Package Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Package Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactPackageBinding getFixture() {
		return (ArtifactPackageBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactPackageBinding());
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

} //ArtifactPackageBindingTest
