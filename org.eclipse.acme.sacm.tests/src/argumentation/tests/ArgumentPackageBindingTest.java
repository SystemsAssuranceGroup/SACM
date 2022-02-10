/**
 */
package argumentation.tests;

import argumentation.ArgumentPackageBinding;
import argumentation.Argumentation_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Package Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentPackageBindingTest extends ArgumentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentPackageBindingTest.class);
	}

	/**
	 * Constructs a new Argument Package Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackageBindingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Package Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentPackageBinding getFixture() {
		return (ArgumentPackageBinding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createArgumentPackageBinding());
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

} //ArgumentPackageBindingTest
