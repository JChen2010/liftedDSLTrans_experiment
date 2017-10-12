/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst.impl;

import dst.Association;
import dst.Comment;
import dst.Delete;
import dst.DomainModel;
import dst.DstPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dst.impl.DomainModelImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.impl.DomainModelImpl#getDassociations <em>Dassociations</em>}</li>
 *   <li>{@link dst.impl.DomainModelImpl#getDclasses <em>Dclasses</em>}</li>
 *   <li>{@link dst.impl.DomainModelImpl#getDcomments <em>Dcomments</em>}</li>
 *   <li>{@link dst.impl.DomainModelImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends EObjectImpl implements DomainModel
{
  /**
   * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortName()
   * @generated
   * @ordered
   */
  protected static final String SHORT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortName()
   * @generated
   * @ordered
   */
  protected String shortName = SHORT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDassociations() <em>Dassociations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDassociations()
   * @generated
   * @ordered
   */
  protected EList dassociations;

  /**
   * The cached value of the '{@link #getDclasses() <em>Dclasses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDclasses()
   * @generated
   * @ordered
   */
  protected EList dclasses;

  /**
   * The cached value of the '{@link #getDcomments() <em>Dcomments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDcomments()
   * @generated
   * @ordered
   */
  protected EList dcomments;

  /**
   * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelete()
   * @generated
   * @ordered
   */
  protected Delete delete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelImpl()
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
    return DstPackage.Literals.DOMAIN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortName()
  {
    return shortName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortName(String newShortName)
  {
    String oldShortName = shortName;
    shortName = newShortName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.DOMAIN_MODEL__SHORT_NAME, oldShortName, shortName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDassociations()
  {
    if (dassociations == null)
    {
      dassociations = new EObjectContainmentEList(Association.class, this, DstPackage.DOMAIN_MODEL__DASSOCIATIONS);
    }
    return dassociations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDclasses()
  {
    if (dclasses == null)
    {
      dclasses = new EObjectContainmentEList(dst.Class.class, this, DstPackage.DOMAIN_MODEL__DCLASSES);
    }
    return dclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDcomments()
  {
    if (dcomments == null)
    {
      dcomments = new EObjectContainmentEList(Comment.class, this, DstPackage.DOMAIN_MODEL__DCOMMENTS);
    }
    return dcomments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delete getDelete()
  {
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDelete(Delete newDelete, NotificationChain msgs)
  {
    Delete oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.DOMAIN_MODEL__DELETE, oldDelete, newDelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(Delete newDelete)
  {
    if (newDelete != delete)
    {
      NotificationChain msgs = null;
      if (delete != null)
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.DOMAIN_MODEL__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.DOMAIN_MODEL__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.DOMAIN_MODEL__DELETE, newDelete, newDelete));
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
      case DstPackage.DOMAIN_MODEL__DASSOCIATIONS:
        return ((InternalEList)getDassociations()).basicRemove(otherEnd, msgs);
      case DstPackage.DOMAIN_MODEL__DCLASSES:
        return ((InternalEList)getDclasses()).basicRemove(otherEnd, msgs);
      case DstPackage.DOMAIN_MODEL__DCOMMENTS:
        return ((InternalEList)getDcomments()).basicRemove(otherEnd, msgs);
      case DstPackage.DOMAIN_MODEL__DELETE:
        return basicSetDelete(null, msgs);
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
      case DstPackage.DOMAIN_MODEL__SHORT_NAME:
        return getShortName();
      case DstPackage.DOMAIN_MODEL__DASSOCIATIONS:
        return getDassociations();
      case DstPackage.DOMAIN_MODEL__DCLASSES:
        return getDclasses();
      case DstPackage.DOMAIN_MODEL__DCOMMENTS:
        return getDcomments();
      case DstPackage.DOMAIN_MODEL__DELETE:
        return getDelete();
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
      case DstPackage.DOMAIN_MODEL__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case DstPackage.DOMAIN_MODEL__DASSOCIATIONS:
        getDassociations().clear();
        getDassociations().addAll((Collection)newValue);
        return;
      case DstPackage.DOMAIN_MODEL__DCLASSES:
        getDclasses().clear();
        getDclasses().addAll((Collection)newValue);
        return;
      case DstPackage.DOMAIN_MODEL__DCOMMENTS:
        getDcomments().clear();
        getDcomments().addAll((Collection)newValue);
        return;
      case DstPackage.DOMAIN_MODEL__DELETE:
        setDelete((Delete)newValue);
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
      case DstPackage.DOMAIN_MODEL__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case DstPackage.DOMAIN_MODEL__DASSOCIATIONS:
        getDassociations().clear();
        return;
      case DstPackage.DOMAIN_MODEL__DCLASSES:
        getDclasses().clear();
        return;
      case DstPackage.DOMAIN_MODEL__DCOMMENTS:
        getDcomments().clear();
        return;
      case DstPackage.DOMAIN_MODEL__DELETE:
        setDelete((Delete)null);
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
      case DstPackage.DOMAIN_MODEL__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case DstPackage.DOMAIN_MODEL__DASSOCIATIONS:
        return dassociations != null && !dassociations.isEmpty();
      case DstPackage.DOMAIN_MODEL__DCLASSES:
        return dclasses != null && !dclasses.isEmpty();
      case DstPackage.DOMAIN_MODEL__DCOMMENTS:
        return dcomments != null && !dcomments.isEmpty();
      case DstPackage.DOMAIN_MODEL__DELETE:
        return delete != null;
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
    result.append(" (shortName: ");
    result.append(shortName);
    result.append(')');
    return result.toString();
  }

} //DomainModelImpl
