/**
 */
package terminology.tests;

import junit.textui.TestRunner;

import terminology.TerminologyPackage;
import terminology.Terminology_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyPackageTest extends TerminologyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TerminologyPackageTest.class);
	}

	/**
	 * Constructs a new Terminology Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Terminology Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TerminologyPackage getFixture() {
		return (TerminologyPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Terminology_Factory.eINSTANCE.createTerminologyPackage());
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

} //TerminologyPackageTest
