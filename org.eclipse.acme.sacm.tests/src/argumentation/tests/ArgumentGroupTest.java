/**
 */
package argumentation.tests;

import argumentation.ArgumentGroup;
import argumentation.Argumentation_Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Argument Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentGroupTest extends ArgumentationElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArgumentGroupTest.class);
	}

	/**
	 * Constructs a new Argument Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Argument Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArgumentGroup getFixture() {
		return (ArgumentGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Argumentation_Factory.eINSTANCE.createArgumentGroup());
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

} //ArgumentGroupTest
