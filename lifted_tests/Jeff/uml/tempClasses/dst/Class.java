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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.Class#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.Class#getProperties <em>Properties</em>}</li>
 *   <li>{@link dst.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dst.Class#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link dst.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link dst.Class#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link dst.Class#getGeneral <em>General</em>}</li>
 *   <li>{@link dst.Class#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
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
   * @see dst.DstPackage#getClass_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.Class#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link dst.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see dst.DstPackage#getClass_Properties()
   * @model type="dst.Property" containment="true"
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
   * @see dst.DstPackage#getClass_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link dst.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
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
   * @see dst.DstPackage#getClass_IsActive()
   * @model
   * @generated
   */
  boolean isIsActive();

  /**
   * Sets the value of the '{@link dst.Class#isIsActive <em>Is Active</em>}' attribute.
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
   * @see dst.DstPackage#getClass_IsFinalSpecialization()
   * @model
   * @generated
   */
  boolean isIsFinalSpecialization();

  /**
   * Sets the value of the '{@link dst.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}' attribute.
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
   * @see dst.DstPackage#getClass_IsLeaf()
   * @model
   * @generated
   */
  boolean isIsLeaf();

  /**
   * Sets the value of the '{@link dst.Class#isIsLeaf <em>Is Leaf</em>}' attribute.
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
   * @see dst.DstPackage#getClass_General()
   * @model containment="true"
   * @generated
   */
  Generalization getGeneral();

  /**
   * Sets the value of the '{@link dst.Class#getGeneral <em>General</em>}' containment reference.
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
   * @see dst.DstPackage#getClass_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.Class#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Class
