/**
 */
package base.tests;

import base.Base_Factory;
import base.ExpressionLangString;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Expression Lang String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionLangStringTest extends LangStringTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExpressionLangStringTest.class);
	}

	/**
	 * Constructs a new Expression Lang String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLangStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Expression Lang String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExpressionLangString getFixture() {
		return (ExpressionLangString)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Base_Factory.eINSTANCE.createExpressionLangString());
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

} //ExpressionLangStringTest
