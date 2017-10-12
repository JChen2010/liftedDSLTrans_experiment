/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link test.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link test.DomainModel#getDassociations <em>Dassociations</em>}</li>
 *   <li>{@link test.DomainModel#getDclasses <em>Dclasses</em>}</li>
 *   <li>{@link test.DomainModel#getDcomments <em>Dcomments</em>}</li>
 *   <li>{@link test.DomainModel#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see test.TestPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
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
   * @see test.TestPackage#getDomainModel_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link test.DomainModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dassociations</b></em>' containment reference list.
   * The list contents are of type {@link test.Association}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dassociations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dassociations</em>' containment reference list.
   * @see test.TestPackage#getDomainModel_Dassociations()
   * @model type="test.Association" containment="true"
   * @generated
   */
  EList getDassociations();

  /**
   * Returns the value of the '<em><b>Dclasses</b></em>' containment reference list.
   * The list contents are of type {@link test.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dclasses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dclasses</em>' containment reference list.
   * @see test.TestPackage#getDomainModel_Dclasses()
   * @model type="test.Class" containment="true"
   * @generated
   */
  EList getDclasses();

  /**
   * Returns the value of the '<em><b>Dcomments</b></em>' containment reference list.
   * The list contents are of type {@link test.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dcomments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dcomments</em>' containment reference list.
   * @see test.TestPackage#getDomainModel_Dcomments()
   * @model type="test.Comment" containment="true"
   * @generated
   */
  EList getDcomments();

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
   * @see test.TestPackage#getDomainModel_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link test.DomainModel#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // DomainModel
