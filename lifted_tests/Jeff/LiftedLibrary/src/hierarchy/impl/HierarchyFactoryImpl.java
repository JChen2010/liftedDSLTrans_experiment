/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hierarchy.impl;

import hierarchy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchyFactoryImpl extends EFactoryImpl implements HierarchyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HierarchyFactory init() {
		try {
			HierarchyFactory theHierarchyFactory = (HierarchyFactory)EPackage.Registry.INSTANCE.getEFactory("http://hierarchy/2.0"); 
			if (theHierarchyFactory != null) {
				return theHierarchyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HierarchyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HierarchyPackage.HIER_LIBRARY: return createHierLibrary();
			case HierarchyPackage.FICTION: return createFiction();
			case HierarchyPackage.NON_FICTION: return createNonFiction();
			case HierarchyPackage.BOOK: return createBook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierLibrary createHierLibrary() {
		HierLibraryImpl hierLibrary = new HierLibraryImpl();
		return hierLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fiction createFiction() {
		FictionImpl fiction = new FictionImpl();
		return fiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFiction createNonFiction() {
		NonFictionImpl nonFiction = new NonFictionImpl();
		return nonFiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyPackage getHierarchyPackage() {
		return (HierarchyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HierarchyPackage getPackage() {
		return HierarchyPackage.eINSTANCE;
	}

} //HierarchyFactoryImpl
