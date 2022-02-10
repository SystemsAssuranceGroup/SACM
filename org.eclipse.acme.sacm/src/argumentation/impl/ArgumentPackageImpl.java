/**
 */
package argumentation.impl;

import argumentation.ArgumentPackage;
import argumentation.ArgumentPackageInterface;
import argumentation.ArgumentationElement;
import argumentation.Argumentation_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argumentation.impl.ArgumentPackageImpl#getArgumentationElement <em>Argumentation Element</em>}</li>
 *   <li>{@link argumentation.impl.ArgumentPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentPackageImpl extends ArgumentationElementImpl implements ArgumentPackage {
	/**
	 * The cached value of the '{@link #getArgumentationElement() <em>Argumentation Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentationElement> argumentationElement;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Argumentation_Package.Literals.ARGUMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentationElement> getArgumentationElement() {
		if (argumentationElement == null) {
			argumentationElement = new EObjectContainmentEList<ArgumentationElement>(ArgumentationElement.class, this, Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT);
		}
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<ArgumentPackageInterface>(ArgumentPackageInterface.class, this, Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT:
				return ((InternalEList<?>)getArgumentationElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT:
				return getArgumentationElement();
			case Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE:
				return getInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT:
				getArgumentationElement().clear();
				getArgumentationElement().addAll((Collection<? extends ArgumentationElement>)newValue);
				return;
			case Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends ArgumentPackageInterface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT:
				getArgumentationElement().clear();
				return;
			case Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE:
				getInterface().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Argumentation_Package.ARGUMENT_PACKAGE__ARGUMENTATION_ELEMENT:
				return argumentationElement != null && !argumentationElement.isEmpty();
			case Argumentation_Package.ARGUMENT_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentPackageImpl
