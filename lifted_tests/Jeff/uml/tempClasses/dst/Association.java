/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.Association#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.Association#getEndtype <em>Endtype</em>}</li>
 *   <li>{@link dst.Association#getMemberend <em>Memberend</em>}</li>
 *   <li>{@link dst.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dst.Association#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject
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
   * @see dst.DstPackage#getAssociation_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.Association#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Endtype</b></em>' reference list.
   * The list contents are of type {@link dst.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endtype</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endtype</em>' reference list.
   * @see dst.DstPackage#getAssociation_Endtype()
   * @model type="dst.Class" required="true"
   * @generated
   */
  EList getEndtype();

  /**
   * Returns the value of the '<em><b>Memberend</b></em>' reference list.
   * The list contents are of type {@link dst.Property}.
   * It is bidirectional and its opposite is '{@link dst.Property#getAssociation <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memberend</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memberend</em>' reference list.
   * @see dst.DstPackage#getAssociation_Memberend()
   * @see dst.Property#getAssociation
   * @model type="dst.Property" opposite="association" lower="2"
   * @generated
   */
  EList getMemberend();

  /**
   * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Derived</em>' attribute.
   * @see #setIsDerived(boolean)
   * @see dst.DstPackage#getAssociation_IsDerived()
   * @model default="false" required="true"
   * @generated
   */
  boolean isIsDerived();

  /**
   * Sets the value of the '{@link dst.Association#isIsDerived <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derived</em>' attribute.
   * @see #isIsDerived()
   * @generated
   */
  void setIsDerived(boolean value);

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
   * @see dst.DstPackage#getAssociation_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.Association#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Association
