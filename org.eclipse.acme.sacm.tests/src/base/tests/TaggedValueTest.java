/**
 */
package base.tests;

import base.Base_Factory;
import base.TaggedValue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaggedValueTest extends UtilityElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaggedValueTest.class);
	}

	/**
	 * Constructs a new Tagged Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tagged Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TaggedValue getFixture() {
		return (TaggedValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Base_Factory.eINSTANCE.createTaggedValue());
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

} //TaggedValueTest
