/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hierarchy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hierarchy.HierarchyPackage
 * @generated
 */
public interface HierarchyFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchyFactory eINSTANCE = hierarchy.impl.HierarchyFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Hier Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hier Library</em>'.
   * @generated
   */
  HierLibrary createHierLibrary();

  /**
   * Returns a new object of class '<em>Fiction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fiction</em>'.
   * @generated
   */
  Fiction createFiction();

  /**
   * Returns a new object of class '<em>Non Fiction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Fiction</em>'.
   * @generated
   */
  NonFiction createNonFiction();

  /**
   * Returns a new object of class '<em>Book</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Book</em>'.
   * @generated
   */
  Book createBook();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HierarchyPackage getHierarchyPackage();

} //HierarchyFactory
