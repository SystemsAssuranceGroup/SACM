/**
 */
package gsn;

import argumentation.ArgumentReasoning;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.Strategy#isUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link gsn.Strategy#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends ArgumentReasoning {
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
	 * @see gsn.Gsn_Package#getStrategy_Undeveloped()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUndeveloped();

	/**
	 * Sets the value of the '{@link gsn.Strategy#isUndeveloped <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undeveloped</em>' attribute.
	 * @see #isUndeveloped()
	 * @generated
	 */
	void setUndeveloped(boolean value);

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
	 * @see gsn.Gsn_Package#getStrategy_Uninstantiated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUninstantiated();

	/**
	 * Sets the value of the '{@link gsn.Strategy#isUninstantiated <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uninstantiated</em>' attribute.
	 * @see #isUninstantiated()
	 * @generated
	 */
	void setUninstantiated(boolean value);

} // Strategy
