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
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.DomainModel#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.DomainModel#getDassociations <em>Dassociations</em>}</li>
 *   <li>{@link dst.DomainModel#getDclasses <em>Dclasses</em>}</li>
 *   <li>{@link dst.DomainModel#getDcomments <em>Dcomments</em>}</li>
 *   <li>{@link dst.DomainModel#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
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
   * @see dst.DstPackage#getDomainModel_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.DomainModel#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Dassociations</b></em>' containment reference list.
   * The list contents are of type {@link dst.Association}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dassociations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dassociations</em>' containment reference list.
   * @see dst.DstPackage#getDomainModel_Dassociations()
   * @model type="dst.Association" containment="true"
   * @generated
   */
  EList getDassociations();

  /**
   * Returns the value of the '<em><b>Dclasses</b></em>' containment reference list.
   * The list contents are of type {@link dst.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dclasses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dclasses</em>' containment reference list.
   * @see dst.DstPackage#getDomainModel_Dclasses()
   * @model type="dst.Class" containment="true"
   * @generated
   */
  EList getDclasses();

  /**
   * Returns the value of the '<em><b>Dcomments</b></em>' containment reference list.
   * The list contents are of type {@link dst.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dcomments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dcomments</em>' containment reference list.
   * @see dst.DstPackage#getDomainModel_Dcomments()
   * @model type="dst.Comment" containment="true"
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
   * @see dst.DstPackage#getDomainModel_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.DomainModel#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // DomainModel
