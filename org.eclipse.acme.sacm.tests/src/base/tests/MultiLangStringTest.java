/**
 */
package base.tests;

import base.Base_Factory;
import base.MultiLangString;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Lang String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiLangStringTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiLangStringTest.class);
	}

	/**
	 * Constructs a new Multi Lang String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLangStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Lang String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiLangString getFixture() {
		return (MultiLangString)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Base_Factory.eINSTANCE.createMultiLangString());
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

} //MultiLangStringTest
