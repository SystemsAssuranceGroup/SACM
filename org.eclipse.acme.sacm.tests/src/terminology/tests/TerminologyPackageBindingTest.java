/**
 */
package terminology.tests;

import junit.textui.TestRunner;

import terminology.TerminologyPackageBinding;
import terminology.Terminology_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyPackageBindingTest extends TerminologyPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TerminologyPackageBindingTest.class);
	}

	/**
	 * Constructs a new Terminology Package Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyPackageBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Terminology Package Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TerminologyPackageBinding getFixture() {
		return (TerminologyPackageBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Terminology_Factory.eINSTANCE.createTerminologyPackageBinding());
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

} //TerminologyPackageBindingTest
