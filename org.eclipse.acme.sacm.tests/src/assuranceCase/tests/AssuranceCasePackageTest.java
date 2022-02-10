/**
 */
package assuranceCase.tests;

import assuranceCase.AssuranceCasePackage;
import assuranceCase.AssuranceCase_Factory;

import base.tests.ArtifactElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assurance Case Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCasePackageTest extends ArtifactElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssuranceCasePackageTest.class);
	}

	/**
	 * Constructs a new Assurance Case Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCasePackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Assurance Case Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AssuranceCasePackage getFixture() {
		return (AssuranceCasePackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AssuranceCase_Factory.eINSTANCE.createAssuranceCasePackage());
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

} //AssuranceCasePackageTest
