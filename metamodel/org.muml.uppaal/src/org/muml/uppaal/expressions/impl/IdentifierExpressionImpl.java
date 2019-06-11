/**
 */
package org.muml.uppaal.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.core.NamedElement;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.expressions.ExpressionsPackage;
import org.muml.uppaal.expressions.IdentifierExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.impl.IdentifierExpressionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.impl.IdentifierExpressionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.impl.IdentifierExpressionImpl#isClockRate <em>Clock Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierExpressionImpl extends ExpressionImpl implements IdentifierExpression {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected NamedElement identifier;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> index;

	/**
	 * The default value of the '{@link #isClockRate() <em>Clock Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOCK_RATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClockRate() <em>Clock Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClockRate()
	 * @generated
	 * @ordered
	 */
	protected boolean clockRate = CLOCK_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.IDENTIFIER_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (NamedElement)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(NamedElement newIdentifier) {
		NamedElement oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Expression>(Expression.class, this, ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isClockRate() {
		return clockRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClockRate(boolean newClockRate) {
		boolean oldClockRate = clockRate;
		clockRate = newClockRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.IDENTIFIER_EXPRESSION__CLOCK_RATE, oldClockRate, clockRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX:
				return getIndex();
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__CLOCK_RATE:
				return isClockRate();
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
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER:
				setIdentifier((NamedElement)newValue);
				return;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Expression>)newValue);
				return;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__CLOCK_RATE:
				setClockRate((Boolean)newValue);
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
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER:
				setIdentifier((NamedElement)null);
				return;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX:
				getIndex().clear();
				return;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__CLOCK_RATE:
				setClockRate(CLOCK_RATE_EDEFAULT);
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
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__IDENTIFIER:
				return identifier != null;
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__INDEX:
				return index != null && !index.isEmpty();
			case ExpressionsPackage.IDENTIFIER_EXPRESSION__CLOCK_RATE:
				return clockRate != CLOCK_RATE_EDEFAULT;
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
		result.append(" (clockRate: ");
		result.append(clockRate);
		result.append(')');
		return result.toString();
	}

} //IdentifierExpressionImpl
