/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.Constraint#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.Constraint#getBody <em>Body</em>}</li>
 *   <li>{@link dst.Constraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link dst.Constraint#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Name</em>' attribute.
   * @see #setShortName(String)
   * @see dst.DstPackage#getConstraint_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.Constraint#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see dst.DstPackage#getConstraint_Body()
   * @model required="true"
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link dst.Constraint#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see dst.DstPackage#getConstraint_Language()
   * @model
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link dst.Constraint#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' containment reference.
   * @see #setDelete(Delete)
   * @see dst.DstPackage#getConstraint_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.Constraint#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Constraint
