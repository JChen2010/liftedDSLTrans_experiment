/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Fiction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link library.NonFiction#getMembers <em>Members</em>}</li>
 *   <li>{@link library.NonFiction#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see library.LibraryPackage#getNonFiction()
 * @model
 * @generated
 */
public interface NonFiction extends EObject
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' reference list.
   * The list contents are of type {@link library.Book}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' reference list.
   * @see library.LibraryPackage#getNonFiction_Members()
   * @model type="library.Book"
   * @generated
   */
  EList getMembers();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see library.LibraryPackage#getNonFiction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link library.NonFiction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // NonFiction
