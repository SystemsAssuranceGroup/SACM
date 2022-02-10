/**
 */
package argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link argumentation.ArgumentPackage#getArgumentationElement <em>Argumentation Element</em>}</li>
 *   <li>{@link argumentation.ArgumentPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see argumentation.Argumentation_Package#getArgumentPackage()
 * @model
 * @generated
 */
public interface ArgumentPackage extends ArgumentationElement {
	/**
	 * Returns the value of the '<em><b>Argumentation Element</b></em>' containment reference list.
	 * The list contents are of type {@link argumentation.ArgumentationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Element</em>' containment reference list.
	 * @see argumentation.Argumentation_Package#getArgumentPackage_ArgumentationElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentationElement> getArgumentationElement();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link argumentation.ArgumentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see argumentation.Argumentation_Package#getArgumentPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<ArgumentPackageInterface> getInterface();

} // ArgumentPackage
