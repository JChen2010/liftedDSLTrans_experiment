/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hierarchy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hierarchy.HierarchyFactory
 * @model kind="package"
 * @generated
 */
public interface HierarchyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hierarchy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://hierarchy/2.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hierarchy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HierarchyPackage eINSTANCE = hierarchy.impl.HierarchyPackageImpl.init();

  /**
   * The meta object id for the '{@link hierarchy.impl.HierLibraryImpl <em>Hier Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hierarchy.impl.HierLibraryImpl
   * @see hierarchy.impl.HierarchyPackageImpl#getHierLibrary()
   * @generated
   */
  int HIER_LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Fiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIER_LIBRARY__FICTION = 0;

  /**
   * The feature id for the '<em><b>Nonfiction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIER_LIBRARY__NONFICTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIER_LIBRARY__NAME = 2;

  /**
   * The number of structural features of the '<em>Hier Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIER_LIBRARY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hierarchy.impl.FictionImpl <em>Fiction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hierarchy.impl.FictionImpl
   * @see hierarchy.impl.HierarchyPackageImpl#getFiction()
   * @generated
   */
  int FICTION = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICTION__MEMBERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICTION__NAME = 1;

  /**
   * The number of structural features of the '<em>Fiction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FICTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hierarchy.impl.NonFictionImpl <em>Non Fiction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hierarchy.impl.NonFictionImpl
   * @see hierarchy.impl.HierarchyPackageImpl#getNonFiction()
   * @generated
   */
  int NON_FICTION = 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FICTION__MEMBERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FICTION__NAME = 1;

  /**
   * The number of structural features of the '<em>Non Fiction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FICTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hierarchy.impl.BookImpl <em>Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hierarchy.impl.BookImpl
   * @see hierarchy.impl.HierarchyPackageImpl#getBook()
   * @generated
   */
  int BOOK = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__NAME = 0;

  /**
   * The feature id for the '<em><b>Genre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__GENRE = 1;

  /**
   * The number of structural features of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link hierarchy.HierLibrary <em>Hier Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hier Library</em>'.
   * @see hierarchy.HierLibrary
   * @generated
   */
  EClass getHierLibrary();

  /**
   * Returns the meta object for the containment reference '{@link hierarchy.HierLibrary#getFiction <em>Fiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fiction</em>'.
   * @see hierarchy.HierLibrary#getFiction()
   * @see #getHierLibrary()
   * @generated
   */
  EReference getHierLibrary_Fiction();

  /**
   * Returns the meta object for the containment reference '{@link hierarchy.HierLibrary#getNonfiction <em>Nonfiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nonfiction</em>'.
   * @see hierarchy.HierLibrary#getNonfiction()
   * @see #getHierLibrary()
   * @generated
   */
  EReference getHierLibrary_Nonfiction();

  /**
   * Returns the meta object for the attribute '{@link hierarchy.HierLibrary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hierarchy.HierLibrary#getName()
   * @see #getHierLibrary()
   * @generated
   */
  EAttribute getHierLibrary_Name();

  /**
   * Returns the meta object for class '{@link hierarchy.Fiction <em>Fiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fiction</em>'.
   * @see hierarchy.Fiction
   * @generated
   */
  EClass getFiction();

  /**
   * Returns the meta object for the containment reference list '{@link hierarchy.Fiction#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see hierarchy.Fiction#getMembers()
   * @see #getFiction()
   * @generated
   */
  EReference getFiction_Members();

  /**
   * Returns the meta object for the attribute '{@link hierarchy.Fiction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hierarchy.Fiction#getName()
   * @see #getFiction()
   * @generated
   */
  EAttribute getFiction_Name();

  /**
   * Returns the meta object for class '{@link hierarchy.NonFiction <em>Non Fiction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Fiction</em>'.
   * @see hierarchy.NonFiction
   * @generated
   */
  EClass getNonFiction();

  /**
   * Returns the meta object for the containment reference list '{@link hierarchy.NonFiction#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see hierarchy.NonFiction#getMembers()
   * @see #getNonFiction()
   * @generated
   */
  EReference getNonFiction_Members();

  /**
   * Returns the meta object for the attribute '{@link hierarchy.NonFiction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hierarchy.NonFiction#getName()
   * @see #getNonFiction()
   * @generated
   */
  EAttribute getNonFiction_Name();

  /**
   * Returns the meta object for class '{@link hierarchy.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book</em>'.
   * @see hierarchy.Book
   * @generated
   */
  EClass getBook();

  /**
   * Returns the meta object for the attribute '{@link hierarchy.Book#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hierarchy.Book#getName()
   * @see #getBook()
   * @generated
   */
  EAttribute getBook_Name();

  /**
   * Returns the meta object for the attribute '{@link hierarchy.Book#getGenre <em>Genre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Genre</em>'.
   * @see hierarchy.Book#getGenre()
   * @see #getBook()
   * @generated
   */
  EAttribute getBook_Genre();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HierarchyFactory getHierarchyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hierarchy.impl.HierLibraryImpl <em>Hier Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hierarchy.impl.HierLibraryImpl
     * @see hierarchy.impl.HierarchyPackageImpl#getHierLibrary()
     * @generated
     */
    EClass HIER_LIBRARY = eINSTANCE.getHierLibrary();

    /**
     * The meta object literal for the '<em><b>Fiction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIER_LIBRARY__FICTION = eINSTANCE.getHierLibrary_Fiction();

    /**
     * The meta object literal for the '<em><b>Nonfiction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIER_LIBRARY__NONFICTION = eINSTANCE.getHierLibrary_Nonfiction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HIER_LIBRARY__NAME = eINSTANCE.getHierLibrary_Name();

    /**
     * The meta object literal for the '{@link hierarchy.impl.FictionImpl <em>Fiction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hierarchy.impl.FictionImpl
     * @see hierarchy.impl.HierarchyPackageImpl#getFiction()
     * @generated
     */
    EClass FICTION = eINSTANCE.getFiction();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FICTION__MEMBERS = eINSTANCE.getFiction_Members();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FICTION__NAME = eINSTANCE.getFiction_Name();

    /**
     * The meta object literal for the '{@link hierarchy.impl.NonFictionImpl <em>Non Fiction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hierarchy.impl.NonFictionImpl
     * @see hierarchy.impl.HierarchyPackageImpl#getNonFiction()
     * @generated
     */
    EClass NON_FICTION = eINSTANCE.getNonFiction();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NON_FICTION__MEMBERS = eINSTANCE.getNonFiction_Members();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NON_FICTION__NAME = eINSTANCE.getNonFiction_Name();

    /**
     * The meta object literal for the '{@link hierarchy.impl.BookImpl <em>Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hierarchy.impl.BookImpl
     * @see hierarchy.impl.HierarchyPackageImpl#getBook()
     * @generated
     */
    EClass BOOK = eINSTANCE.getBook();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOK__NAME = eINSTANCE.getBook_Name();

    /**
     * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOK__GENRE = eINSTANCE.getBook_Genre();

  }

} //HierarchyPackage
