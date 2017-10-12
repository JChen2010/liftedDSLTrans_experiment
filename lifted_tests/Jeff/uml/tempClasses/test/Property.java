/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link test.Property#getName <em>Name</em>}</li>
 *   <li>{@link test.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link test.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link test.Property#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link test.Property#isIsId <em>Is Id</em>}</li>
 *   <li>{@link test.Property#getLower <em>Lower</em>}</li>
 *   <li>{@link test.Property#getUpper <em>Upper</em>}</li>
 *   <li>{@link test.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link test.Property#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see test.TestPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
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
   * @see test.TestPackage#getProperty_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link test.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Composite</em>' attribute.
   * @see #setIsComposite(boolean)
   * @see test.TestPackage#getProperty_IsComposite()
   * @model default="false" required="true"
   * @generated
   */
  boolean isIsComposite();

  /**
   * Sets the value of the '{@link test.Property#isIsComposite <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Composite</em>' attribute.
   * @see #isIsComposite()
   * @generated
   */
  void setIsComposite(boolean value);

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
   * @see test.TestPackage#getProperty_IsDerived()
   * @model default="false" required="true"
   * @generated
   */
  boolean isIsDerived();

  /**
   * Sets the value of the '{@link test.Property#isIsDerived <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derived</em>' attribute.
   * @see #isIsDerived()
   * @generated
   */
  void setIsDerived(boolean value);

  /**
   * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Derived Union</em>' attribute.
   * @see #setIsDerivedUnion(boolean)
   * @see test.TestPackage#getProperty_IsDerivedUnion()
   * @model default="false" required="true"
   * @generated
   */
  boolean isIsDerivedUnion();

  /**
   * Sets the value of the '{@link test.Property#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derived Union</em>' attribute.
   * @see #isIsDerivedUnion()
   * @generated
   */
  void setIsDerivedUnion(boolean value);

  /**
   * Returns the value of the '<em><b>Is Id</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Id</em>' attribute.
   * @see #setIsId(boolean)
   * @see test.TestPackage#getProperty_IsId()
   * @model default="false" required="true"
   * @generated
   */
  boolean isIsId();

  /**
   * Sets the value of the '{@link test.Property#isIsId <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Id</em>' attribute.
   * @see #isIsId()
   * @generated
   */
  void setIsId(boolean value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see test.TestPackage#getProperty_Lower()
   * @model
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link test.Property#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see test.TestPackage#getProperty_Upper()
   * @model
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link test.Property#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Association</b></em>' reference.
   * It is bidirectional and its opposite is '{@link test.Association#getMemberend <em>Memberend</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association</em>' reference.
   * @see #setAssociation(Association)
   * @see test.TestPackage#getProperty_Association()
   * @see test.Association#getMemberend
   * @model opposite="memberend"
   * @generated
   */
  Association getAssociation();

  /**
   * Sets the value of the '{@link test.Property#getAssociation <em>Association</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association</em>' reference.
   * @see #getAssociation()
   * @generated
   */
  void setAssociation(Association value);

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
   * @see test.TestPackage#getProperty_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link test.Property#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // Property
