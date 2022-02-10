/**
 */
package terminology.tests;

import junit.textui.TestRunner;

import terminology.TerminologyPackageInterface;
import terminology.Terminology_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyPackageInterfaceTest extends TerminologyPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TerminologyPackageInterfaceTest.class);
	}

	/**
	 * Constructs a new Terminology Package Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Terminology Package Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TerminologyPackageInterface getFixture() {
		return (TerminologyPackageInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Terminology_Factory.eINSTANCE.createTerminologyPackageInterface());
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

} //TerminologyPackageInterfaceTest
