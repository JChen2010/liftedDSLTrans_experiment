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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link test.Class#getName <em>Name</em>}</li>
 *   <li>{@link test.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link test.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link test.Class#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link test.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link test.Class#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link test.Class#getGeneral <em>General</em>}</li>
 *   <li>{@link test.Class#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see test.TestPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
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
   * @see test.TestPackage#getClass_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link test.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link test.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see test.TestPackage#getClass_Properties()
   * @model type="test.Property" containment="true"
   * @generated
   */
  EList getProperties();

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see test.TestPackage#getClass_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link test.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Is Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Active</em>' attribute.
   * @see #setIsActive(boolean)
   * @see test.TestPackage#getClass_IsActive()
   * @model
   * @generated
   */
  boolean isIsActive();

  /**
   * Sets the value of the '{@link test.Class#isIsActive <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Active</em>' attribute.
   * @see #isIsActive()
   * @generated
   */
  void setIsActive(boolean value);

  /**
   * Returns the value of the '<em><b>Is Final Specialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Final Specialization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Final Specialization</em>' attribute.
   * @see #setIsFinalSpecialization(boolean)
   * @see test.TestPackage#getClass_IsFinalSpecialization()
   * @model
   * @generated
   */
  boolean isIsFinalSpecialization();

  /**
   * Sets the value of the '{@link test.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Final Specialization</em>' attribute.
   * @see #isIsFinalSpecialization()
   * @generated
   */
  void setIsFinalSpecialization(boolean value);

  /**
   * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Leaf</em>' attribute.
   * @see #setIsLeaf(boolean)
   * @see test.TestPackage#getClass_IsLeaf()
   * @model
   * @generated
   */
  boolean isIsLeaf();

  /**
   * Sets the value of the '{@link test.Class#isIsLeaf <em>Is Leaf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Leaf</em>' attribute.
   * @see #isIsLeaf()
   * @generated
   */
  void setIsLeaf(boolean value);

  /**
   * Returns the value of the '<em><b>General</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>General</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>General</em>' containment reference.
   * @see #setGeneral(Generalization)
   * @see test.TestPackage#getClass_General()
   * @model containment="true"
   * @generated
   */
  Generalization getGeneral();

  /**
   * Sets the value of the '{@link test.Class#getGeneral <em>General</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General</em>' containment reference.
   * @see #getGeneral()
   * @generated
   */
  void setGeneral(Generalization value);

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
   * @see test.TestPackage#getClass_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link test.Class#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Class
