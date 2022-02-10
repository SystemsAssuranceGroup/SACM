/**
 */
package artifact.tests;

import artifact.ArtifactAssetRelationship;
import artifact.Artifact_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactAssetRelationshipTest extends ArtifactAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactAssetRelationshipTest.class);
	}

	/**
	 * Constructs a new Artifact Asset Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactAssetRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Artifact Asset Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArtifactAssetRelationship getFixture() {
		return (ArtifactAssetRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Artifact_Factory.eINSTANCE.createArtifactAssetRelationship());
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

} //ArtifactAssetRelationshipTest
