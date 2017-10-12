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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.Model#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.Model#getComments <em>Comments</em>}</li>
 *   <li>{@link dst.Model#getStatemachines <em>Statemachines</em>}</li>
 *   <li>{@link dst.Model#getAssociations <em>Associations</em>}</li>
 *   <li>{@link dst.Model#getClasses <em>Classes</em>}</li>
 *   <li>{@link dst.Model#getModels <em>Models</em>}</li>
 *   <li>{@link dst.Model#getDelete <em>Delete</em>}</li>
 *   <li>{@link dst.Model#getMregions <em>Mregions</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see dst.DstPackage#getModel_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.Model#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
   * The list contents are of type {@link dst.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference list.
   * @see dst.DstPackage#getModel_Comments()
   * @model type="dst.Comment" containment="true"
   * @generated
   */
  EList getComments();

  /**
   * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
   * The list contents are of type {@link dst.StateMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemachines</em>' containment reference list.
   * @see dst.DstPackage#getModel_Statemachines()
   * @model type="dst.StateMachine" containment="true"
   * @generated
   */
  EList getStatemachines();

  /**
   * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
   * The list contents are of type {@link dst.Association}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Associations</em>' containment reference list.
   * @see dst.DstPackage#getModel_Associations()
   * @model type="dst.Association" containment="true"
   * @generated
   */
  EList getAssociations();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link dst.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see dst.DstPackage#getModel_Classes()
   * @model type="dst.Class" containment="true"
   * @generated
   */
  EList getClasses();

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link dst.DomainModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see dst.DstPackage#getModel_Models()
   * @model type="dst.DomainModel" containment="true"
   * @generated
   */
  EList getModels();

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
   * @see dst.DstPackage#getModel_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.Model#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

  /**
   * Returns the value of the '<em><b>Mregions</b></em>' containment reference list.
   * The list contents are of type {@link dst.Region}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mregions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mregions</em>' containment reference list.
   * @see dst.DstPackage#getModel_Mregions()
   * @model type="dst.Region" containment="true"
   * @generated
   */
  EList getMregions();

} // Model
