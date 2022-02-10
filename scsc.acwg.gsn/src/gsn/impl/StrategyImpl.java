/**
 */
package gsn.impl;

import argumentation.impl.ArgumentReasoningImpl;

import gsn.Gsn_Package;
import gsn.Strategy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gsn.impl.StrategyImpl#isUndeveloped <em>Undeveloped</em>}</li>
 *   <li>{@link gsn.impl.StrategyImpl#isUninstantiated <em>Uninstantiated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends ArgumentReasoningImpl implements Strategy {
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
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Gsn_Package.Literals.STRATEGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.STRATEGY__UNDEVELOPED, oldUndeveloped, undeveloped));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Gsn_Package.STRATEGY__UNINSTANTIATED, oldUninstantiated, uninstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Gsn_Package.STRATEGY__UNDEVELOPED:
				return isUndeveloped();
			case Gsn_Package.STRATEGY__UNINSTANTIATED:
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
			case Gsn_Package.STRATEGY__UNDEVELOPED:
				setUndeveloped((Boolean)newValue);
				return;
			case Gsn_Package.STRATEGY__UNINSTANTIATED:
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
			case Gsn_Package.STRATEGY__UNDEVELOPED:
				setUndeveloped(UNDEVELOPED_EDEFAULT);
				return;
			case Gsn_Package.STRATEGY__UNINSTANTIATED:
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
			case Gsn_Package.STRATEGY__UNDEVELOPED:
				return undeveloped != UNDEVELOPED_EDEFAULT;
			case Gsn_Package.STRATEGY__UNINSTANTIATED:
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
		result.append(" (undeveloped: ");
		result.append(undeveloped);
		result.append(", uninstantiated: ");
		result.append(uninstantiated);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
