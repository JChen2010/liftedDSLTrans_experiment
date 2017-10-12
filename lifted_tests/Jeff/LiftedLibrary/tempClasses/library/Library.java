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
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link library.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link library.Library#getNonfiction <em>Nonfiction</em>}</li>
 *   <li>{@link library.Library#getFiction <em>Fiction</em>}</li>
 *   <li>{@link library.Library#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject
{
  /**
   * Returns the value of the '<em><b>Books</b></em>' containment reference list.
   * The list contents are of type {@link library.Book}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Books</em>' containment reference list.
   * @see library.LibraryPackage#getLibrary_Books()
   * @model type="library.Book" containment="true"
   * @generated
   */
  EList getBooks();

  /**
   * Returns the value of the '<em><b>Nonfiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nonfiction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nonfiction</em>' containment reference.
   * @see #setNonfiction(NonFiction)
   * @see library.LibraryPackage#getLibrary_Nonfiction()
   * @model containment="true"
   * @generated
   */
  NonFiction getNonfiction();

  /**
   * Sets the value of the '{@link library.Library#getNonfiction <em>Nonfiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nonfiction</em>' containment reference.
   * @see #getNonfiction()
   * @generated
   */
  void setNonfiction(NonFiction value);

  /**
   * Returns the value of the '<em><b>Fiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fiction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fiction</em>' containment reference.
   * @see #setFiction(Fiction)
   * @see library.LibraryPackage#getLibrary_Fiction()
   * @model containment="true"
   * @generated
   */
  Fiction getFiction();

  /**
   * Sets the value of the '{@link library.Library#getFiction <em>Fiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fiction</em>' containment reference.
   * @see #getFiction()
   * @generated
   */
  void setFiction(Fiction value);

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
   * @see library.LibraryPackage#getLibrary_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link library.Library#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Library
