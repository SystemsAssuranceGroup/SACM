/**
 */
package terminology.tests;

import junit.textui.TestRunner;

import terminology.TerminologyGroup;
import terminology.Terminology_Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Terminology Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyGroupTest extends TerminologyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TerminologyGroupTest.class);
	}

	/**
	 * Constructs a new Terminology Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Terminology Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TerminologyGroup getFixture() {
		return (TerminologyGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Terminology_Factory.eINSTANCE.createTerminologyGroup());
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

} //TerminologyGroupTest
