/**
 */
package artifact.tests;

import artifact.ArtifactPackageInterface;
import artifact.Artifact_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactPackageInterfaceTest extends ArtifactPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactPackageInterfaceTest.class);
	}

	/**
	 * Constructs a new Artifact Package Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactPackageInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Package Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactPackageInterface getFixture() {
		return (ArtifactPackageInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactPackageInterface());
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

} //ArtifactPackageInterfaceTest
