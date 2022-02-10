/**
 */
package gsn.impl;

import argumentation.impl.ClaimImpl;

import gsn.Goal;
import gsn.Gsn_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.impl.GoalImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link gsn.impl.GoalImpl#isUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link gsn.impl.GoalImpl#isToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 *   <li>{@link gsn.impl.GoalImpl#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends ClaimImpl implements Goal {
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
	 * The default value of the '{@link #isUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDEVELOPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndeveloped() <em>Undeveloped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndeveloped()
	 * @generated
	 * @ordered
	 */
	protected boolean undeveloped = UNDEVELOPED_EDEFAULT;

	/**
	 * The default value of the '{@link #isToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected boolean toBeSupportedByContract = TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT;

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
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsn_Package.Literals.GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.GOAL__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndeveloped() {
		return undeveloped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndeveloped(boolean newUndeveloped) {
		boolean oldUndeveloped = undeveloped;
		undeveloped = newUndeveloped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.GOAL__UNDEVELOPED, oldUndeveloped, undeveloped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBeSupportedByContract() {
		return toBeSupportedByContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeSupportedByContract(boolean newToBeSupportedByContract) {
		boolean oldToBeSupportedByContract = toBeSupportedByContract;
		toBeSupportedByContract = newToBeSupportedByContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT, oldToBeSupportedByContract, toBeSupportedByContract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.GOAL__UNINSTANTIATED, oldUninstantiated, uninstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsn_Package.GOAL__IS_PUBLIC:
				return isIsPublic();
			case Gsn_Package.GOAL__UNDEVELOPED:
				return isUndeveloped();
			case Gsn_Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return isToBeSupportedByContract();
			case Gsn_Package.GOAL__UNINSTANTIATED:
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
			case Gsn_Package.GOAL__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case Gsn_Package.GOAL__UNDEVELOPED:
				setUndeveloped((Boolean)newValue);
				return;
			case Gsn_Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract((Boolean)newValue);
				return;
			case Gsn_Package.GOAL__UNINSTANTIATED:
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
			case Gsn_Package.GOAL__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case Gsn_Package.GOAL__UNDEVELOPED:
				setUndeveloped(UNDEVELOPED_EDEFAULT);
				return;
			case Gsn_Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract(TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT);
				return;
			case Gsn_Package.GOAL__UNINSTANTIATED:
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
			case Gsn_Package.GOAL__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case Gsn_Package.GOAL__UNDEVELOPED:
				return undeveloped != UNDEVELOPED_EDEFAULT;
			case Gsn_Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return toBeSupportedByContract != TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT;
			case Gsn_Package.GOAL__UNINSTANTIATED:
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
		result.append(", undeveloped: ");
		result.append(undeveloped);
		result.append(", toBeSupportedByContract: ");
		result.append(toBeSupportedByContract);
		result.append(", uninstantiated: ");
		result.append(uninstantiated);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
