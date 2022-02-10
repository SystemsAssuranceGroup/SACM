/**
 */
package gsn.impl;

import argumentation.impl.ClaimImpl;

import gsn.Gsn_Package;
import gsn.Justification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.impl.JustificationImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.impl.JustificationImpl#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JustificationImpl extends ClaimImpl implements Justification {
	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNINSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUninstantiated() <em>Uninstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUninstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean uninstantiated = UNINSTANTIATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JustificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsn_Package.Literals.JUSTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.JUSTIFICATION__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUninstantiated() {
		return uninstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUninstantiated(boolean newUninstantiated) {
		boolean oldUninstantiated = uninstantiated;
		uninstantiated = newUninstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.JUSTIFICATION__UNINSTANTIATED, oldUninstantiated, uninstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsn_Package.JUSTIFICATION__IS_PUBLIC:
				return isIsPublic();
			case Gsn_Package.JUSTIFICATION__UNINSTANTIATED:
				return isUninstantiated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Gsn_Package.JUSTIFICATION__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case Gsn_Package.JUSTIFICATION__UNINSTANTIATED:
				setUninstantiated((Boolean)newValue);
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
			case Gsn_Package.JUSTIFICATION__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case Gsn_Package.JUSTIFICATION__UNINSTANTIATED:
				setUninstantiated(UNINSTANTIATED_EDEFAULT);
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
			case Gsn_Package.JUSTIFICATION__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case Gsn_Package.JUSTIFICATION__UNINSTANTIATED:
				return uninstantiated != UNINSTANTIATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isPublic: ");
		result.append(isPublic);
		result.append(", uninstantiated: ");
		result.append(uninstantiated);
		result.append(')');
		return result.toString();
	}

} //JustificationImpl
