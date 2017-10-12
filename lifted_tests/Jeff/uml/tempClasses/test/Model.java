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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link test.Model#getName <em>Name</em>}</li>
 *   <li>{@link test.Model#getComments <em>Comments</em>}</li>
 *   <li>{@link test.Model#getStatemachines <em>Statemachines</em>}</li>
 *   <li>{@link test.Model#getAssociations <em>Associations</em>}</li>
 *   <li>{@link test.Model#getClasses <em>Classes</em>}</li>
 *   <li>{@link test.Model#getModels <em>Models</em>}</li>
 *   <li>{@link test.Model#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see test.TestPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
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
   * @see test.TestPackage#getModel_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link test.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
   * The list contents are of type {@link test.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference list.
   * @see test.TestPackage#getModel_Comments()
   * @model type="test.Comment" containment="true"
   * @generated
   */
  EList getComments();

  /**
   * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
   * The list contents are of type {@link test.StateMachine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statemachines</em>' containment reference list.
   * @see test.TestPackage#getModel_Statemachines()
   * @model type="test.StateMachine" containment="true"
   * @generated
   */
  EList getStatemachines();

  /**
   * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
   * The list contents are of type {@link test.Association}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Associations</em>' containment reference list.
   * @see test.TestPackage#getModel_Associations()
   * @model type="test.Association" containment="true"
   * @generated
   */
  EList getAssociations();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link test.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see test.TestPackage#getModel_Classes()
   * @model type="test.Class" containment="true"
   * @generated
   */
  EList getClasses();

  /**
   * Returns the value of the '<em><b>Models</b></em>' containment reference list.
   * The list contents are of type {@link test.DomainModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference list.
   * @see test.TestPackage#getModel_Models()
   * @model type="test.DomainModel" containment="true"
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
   * @see test.TestPackage#getModel_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link test.Model#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Model
