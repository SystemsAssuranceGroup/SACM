/**
 */
package gsn;

import argumentation.Claim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.AwayAssumption#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getAwayAssumption()
 * @model
 * @generated
 */
public interface AwayAssumption extends Claim {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see gsn.Gsn_Package#getAwayAssumption_Module()
	 * @model
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link gsn.AwayAssumption#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

} // AwayAssumption
