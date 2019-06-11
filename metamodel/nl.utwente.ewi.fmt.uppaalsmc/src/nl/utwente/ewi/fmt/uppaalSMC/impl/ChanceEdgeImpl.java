/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.impl;

import nl.utwente.ewi.fmt.uppaalSMC.ChanceEdge;
import nl.utwente.ewi.fmt.uppaalSMC.UppaalSMCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.templates.impl.EdgeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chance Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.utwente.ewi.fmt.uppaalSMC.impl.ChanceEdgeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChanceEdgeImpl extends EdgeImpl implements ChanceEdge {
	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Expression weight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChanceEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaalSMCPackage.Literals.CHANCE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(Expression newWeight, NotificationChain msgs) {
		Expression oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.CHANCE_EDGE__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Expression newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.CHANCE_EDGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalSMCPackage.CHANCE_EDGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalSMCPackage.CHANCE_EDGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalSMCPackage.CHANCE_EDGE__WEIGHT:
				return basicSetWeight(null, msgs);
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
			case UppaalSMCPackage.CHANCE_EDGE__WEIGHT:
				return getWeight();
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
			case UppaalSMCPackage.CHANCE_EDGE__WEIGHT:
				setWeight((Expression)newValue);
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
			case UppaalSMCPackage.CHANCE_EDGE__WEIGHT:
				setWeight((Expression)null);
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
			case UppaalSMCPackage.CHANCE_EDGE__WEIGHT:
				return weight != null;
		}
		return super.eIsSet(featureID);
	}

} //ChanceEdgeImpl
