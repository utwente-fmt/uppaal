/**
 */
package org.muml.uppaal.expressions;

import org.eclipse.emf.common.util.EList;
import org.muml.uppaal.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expression referring to a variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.expressions.IdentifierExpression#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.IdentifierExpression#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.uppaal.expressions.IdentifierExpression#isClockRate <em>Clock Rate</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIdentifierExpression()
 * @model
 * @generated
 */
public interface IdentifierExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referred variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(NamedElement)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIdentifierExpression_Identifier()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getIdentifier();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.IdentifierExpression#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.uppaal.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of expressions that refer to the array indexes of the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIdentifierExpression_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndex();

	/**
	 * Returns the value of the '<em><b>Clock Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the declared synchronization channels use broadcast.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Rate</em>' attribute.
	 * @see #setClockRate(boolean)
	 * @see org.muml.uppaal.expressions.ExpressionsPackage#getIdentifierExpression_ClockRate()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isClockRate();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.expressions.IdentifierExpression#isClockRate <em>Clock Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Rate</em>' attribute.
	 * @see #isClockRate()
	 * @generated
	 */
	void setClockRate(boolean value);

} // IdentifierExpression
