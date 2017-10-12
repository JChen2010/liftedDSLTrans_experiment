/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst.impl;

import dst.Association;
import dst.Delete;
import dst.DstPackage;
import dst.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dst.impl.AssociationImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.impl.AssociationImpl#getEndtype <em>Endtype</em>}</li>
 *   <li>{@link dst.impl.AssociationImpl#getMemberend <em>Memberend</em>}</li>
 *   <li>{@link dst.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dst.impl.AssociationImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends EObjectImpl implements Association
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
   * The cached value of the '{@link #getEndtype() <em>Endtype</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndtype()
   * @generated
   * @ordered
   */
  protected EList endtype;

  /**
   * The cached value of the '{@link #getMemberend() <em>Memberend</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberend()
   * @generated
   * @ordered
   */
  protected EList memberend;

  /**
   * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected boolean isDerived = IS_DERIVED_EDEFAULT;

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
  protected AssociationImpl()
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
    return DstPackage.Literals.ASSOCIATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.ASSOCIATION__SHORT_NAME, oldShortName, shortName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getEndtype()
  {
    if (endtype == null)
    {
      endtype = new EObjectResolvingEList(dst.Class.class, this, DstPackage.ASSOCIATION__ENDTYPE);
    }
    return endtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getMemberend()
  {
    if (memberend == null)
    {
      memberend = new EObjectWithInverseResolvingEList(Property.class, this, DstPackage.ASSOCIATION__MEMBEREND, DstPackage.PROPERTY__ASSOCIATION);
    }
    return memberend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDerived()
  {
    return isDerived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDerived(boolean newIsDerived)
  {
    boolean oldIsDerived = isDerived;
    isDerived = newIsDerived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.ASSOCIATION__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.ASSOCIATION__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.ASSOCIATION__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.ASSOCIATION__DELETE, newDelete, newDelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DstPackage.ASSOCIATION__MEMBEREND:
        return ((InternalEList)getMemberend()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case DstPackage.ASSOCIATION__MEMBEREND:
        return ((InternalEList)getMemberend()).basicRemove(otherEnd, msgs);
      case DstPackage.ASSOCIATION__DELETE:
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
      case DstPackage.ASSOCIATION__SHORT_NAME:
        return getShortName();
      case DstPackage.ASSOCIATION__ENDTYPE:
        return getEndtype();
      case DstPackage.ASSOCIATION__MEMBEREND:
        return getMemberend();
      case DstPackage.ASSOCIATION__IS_DERIVED:
        return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.ASSOCIATION__DELETE:
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
      case DstPackage.ASSOCIATION__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case DstPackage.ASSOCIATION__ENDTYPE:
        getEndtype().clear();
        getEndtype().addAll((Collection)newValue);
        return;
      case DstPackage.ASSOCIATION__MEMBEREND:
        getMemberend().clear();
        getMemberend().addAll((Collection)newValue);
        return;
      case DstPackage.ASSOCIATION__IS_DERIVED:
        setIsDerived(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.ASSOCIATION__DELETE:
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
      case DstPackage.ASSOCIATION__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case DstPackage.ASSOCIATION__ENDTYPE:
        getEndtype().clear();
        return;
      case DstPackage.ASSOCIATION__MEMBEREND:
        getMemberend().clear();
        return;
      case DstPackage.ASSOCIATION__IS_DERIVED:
        setIsDerived(IS_DERIVED_EDEFAULT);
        return;
      case DstPackage.ASSOCIATION__DELETE:
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
      case DstPackage.ASSOCIATION__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case DstPackage.ASSOCIATION__ENDTYPE:
        return endtype != null && !endtype.isEmpty();
      case DstPackage.ASSOCIATION__MEMBEREND:
        return memberend != null && !memberend.isEmpty();
      case DstPackage.ASSOCIATION__IS_DERIVED:
        return isDerived != IS_DERIVED_EDEFAULT;
      case DstPackage.ASSOCIATION__DELETE:
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
    result.append(", isDerived: ");
    result.append(isDerived);
    result.append(')');
    return result.toString();
  }

} //AssociationImpl
