/**
 */
package terminology.tests;

import junit.textui.TestRunner;

import terminology.Term;
import terminology.Terminology_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermTest extends ExpressionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermTest.class);
	}

	/**
	 * Constructs a new Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Term getFixture() {
		return (Term)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Terminology_Factory.eINSTANCE.createTerm());
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

} //TermTest
