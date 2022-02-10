/**
 */
package argumentation.tests;

import argumentation.ArgumentPackage;
import argumentation.Argumentation_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentPackageTest extends ArgumentationElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentPackageTest.class);
	}

	/**
	 * Constructs a new Argument Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentPackage getFixture() {
		return (ArgumentPackage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createArgumentPackage());
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

} //ArgumentPackageTest
