/**
 */
package argumentation.tests;

import argumentation.ArgumentPackageInterface;
import argumentation.Argumentation_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentPackageInterfaceTest extends ArgumentPackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentPackageInterfaceTest.class);
	}

	/**
	 * Constructs a new Argument Package Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentPackageInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Package Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentPackageInterface getFixture() {
		return (ArgumentPackageInterface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createArgumentPackageInterface());
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

} //ArgumentPackageInterfaceTest
