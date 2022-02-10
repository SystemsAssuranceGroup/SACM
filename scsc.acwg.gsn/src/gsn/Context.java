/**
 */
package gsn;

import argumentation.ArgumentAsset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gsn.Context#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.Context#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @see gsn.Gsn_Package#getContext()
 * @model
 * @generated
 */
public interface Context extends ArgumentAsset {
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
	 * @see gsn.Gsn_Package#getContext_IsPublic()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link gsn.Context#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

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
	 * @see gsn.Gsn_Package#getContext_Uninstantiated()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUninstantiated();

	/**
	 * Sets the value of the '{@link gsn.Context#isUninstantiated <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uninstantiated</em>' attribute.
	 * @see #isUninstantiated()
	 * @generated
	 */
	void setUninstantiated(boolean value);

} // Context
