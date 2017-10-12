/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package library.impl;

import java.util.Collection;

import library.Book;
import library.Fiction;
import library.Library;
import library.LibraryPackage;
import library.NonFiction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link library.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getNonfiction <em>Nonfiction</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getFiction <em>Fiction</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library
{
  /**
   * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooks()
   * @generated
   * @ordered
   */
  protected EList books;

  /**
   * The cached value of the '{@link #getNonfiction() <em>Nonfiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonfiction()
   * @generated
   * @ordered
   */
  protected NonFiction nonfiction;

  /**
   * The cached value of the '{@link #getFiction() <em>Fiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiction()
   * @generated
   * @ordered
   */
  protected Fiction fiction;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LibraryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return LibraryPackage.Literals.LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getBooks()
  {
    if (books == null)
    {
      books = new EObjectContainmentEList(Book.class, this, LibraryPackage.LIBRARY__BOOKS);
    }
    return books;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonFiction getNonfiction()
  {
    return nonfiction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNonfiction(NonFiction newNonfiction, NotificationChain msgs)
  {
    NonFiction oldNonfiction = nonfiction;
    nonfiction = newNonfiction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__NONFICTION, oldNonfiction, newNonfiction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNonfiction(NonFiction newNonfiction)
  {
    if (newNonfiction != nonfiction)
    {
      NotificationChain msgs = null;
      if (nonfiction != null)
        msgs = ((InternalEObject)nonfiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__NONFICTION, null, msgs);
      if (newNonfiction != null)
        msgs = ((InternalEObject)newNonfiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__NONFICTION, null, msgs);
      msgs = basicSetNonfiction(newNonfiction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__NONFICTION, newNonfiction, newNonfiction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fiction getFiction()
  {
    return fiction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFiction(Fiction newFiction, NotificationChain msgs)
  {
    Fiction oldFiction = fiction;
    fiction = newFiction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__FICTION, oldFiction, newFiction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFiction(Fiction newFiction)
  {
    if (newFiction != fiction)
    {
      NotificationChain msgs = null;
      if (fiction != null)
        msgs = ((InternalEObject)fiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__FICTION, null, msgs);
      if (newFiction != null)
        msgs = ((InternalEObject)newFiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__FICTION, null, msgs);
      msgs = basicSetFiction(newFiction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__FICTION, newFiction, newFiction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__BOOKS:
        return ((InternalEList)getBooks()).basicRemove(otherEnd, msgs);
      case LibraryPackage.LIBRARY__NONFICTION:
        return basicSetNonfiction(null, msgs);
      case LibraryPackage.LIBRARY__FICTION:
        return basicSetFiction(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__BOOKS:
        return getBooks();
      case LibraryPackage.LIBRARY__NONFICTION:
        return getNonfiction();
      case LibraryPackage.LIBRARY__FICTION:
        return getFiction();
      case LibraryPackage.LIBRARY__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__BOOKS:
        getBooks().clear();
        getBooks().addAll((Collection)newValue);
        return;
      case LibraryPackage.LIBRARY__NONFICTION:
        setNonfiction((NonFiction)newValue);
        return;
      case LibraryPackage.LIBRARY__FICTION:
        setFiction((Fiction)newValue);
        return;
      case LibraryPackage.LIBRARY__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__BOOKS:
        getBooks().clear();
        return;
      case LibraryPackage.LIBRARY__NONFICTION:
        setNonfiction((NonFiction)null);
        return;
      case LibraryPackage.LIBRARY__FICTION:
        setFiction((Fiction)null);
        return;
      case LibraryPackage.LIBRARY__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LibraryPackage.LIBRARY__BOOKS:
        return books != null && !books.isEmpty();
      case LibraryPackage.LIBRARY__NONFICTION:
        return nonfiction != null;
      case LibraryPackage.LIBRARY__FICTION:
        return fiction != null;
      case LibraryPackage.LIBRARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (Name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LibraryImpl
