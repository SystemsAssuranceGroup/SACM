/**
 */
package gsn;

import argumentation.Claim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.Goal#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.Goal#isUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link gsn.Goal#isToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 *   <li>{@link gsn.Goal#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Claim {
	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see gsn.Gsn_Package#getGoal_IsPublic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link gsn.Goal#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Undeveloped</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeveloped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeveloped</em>' attribute.
	 * @see #setUndeveloped(boolean)
	 * @see gsn.Gsn_Package#getGoal_Undeveloped()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUndeveloped();

	/**
	 * Sets the value of the '{@link gsn.Goal#isUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #isUndeveloped()
	 * @generated
	 */
	void setUndeveloped(boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported By Contract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #setToBeSupportedByContract(boolean)
	 * @see gsn.Gsn_Package#getGoal_ToBeSupportedByContract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isToBeSupportedByContract();

	/**
	 * Sets the value of the '{@link gsn.Goal#isToBeSupportedByContract <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #isToBeSupportedByContract()
	 * @generated
	 */
	void setToBeSupportedByContract(boolean value);

	/**
	 * Returns the value of the '<em><b>Uninstantiated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uninstantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uninstantiated</em>' attribute.
	 * @see #setUninstantiated(boolean)
	 * @see gsn.Gsn_Package#getGoal_Uninstantiated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUninstantiated();

	/**
	 * Sets the value of the '{@link gsn.Goal#isUninstantiated <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uninstantiated</em>' attribute.
	 * @see #isUninstantiated()
	 * @generated
	 */
	void setUninstantiated(boolean value);

} // Goal
