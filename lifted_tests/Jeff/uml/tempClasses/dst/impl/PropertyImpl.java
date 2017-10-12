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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dst.impl.PropertyImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#isIsId <em>Is Id</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link dst.impl.PropertyImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property
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
   * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected static final boolean IS_COMPOSITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsComposite()
   * @generated
   * @ordered
   */
  protected boolean isComposite = IS_COMPOSITE_EDEFAULT;

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
   * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerivedUnion()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerivedUnion()
   * @generated
   * @ordered
   */
  protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

  /**
   * The default value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsId()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsId()
   * @generated
   * @ordered
   */
  protected boolean isId = IS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final int LOWER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected int lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final int UPPER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected int upper = UPPER_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected Association association;

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
  protected PropertyImpl()
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
    return DstPackage.Literals.PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__SHORT_NAME, oldShortName, shortName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsComposite()
  {
    return isComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsComposite(boolean newIsComposite)
  {
    boolean oldIsComposite = isComposite;
    isComposite = newIsComposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDerivedUnion()
  {
    return isDerivedUnion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDerivedUnion(boolean newIsDerivedUnion)
  {
    boolean oldIsDerivedUnion = isDerivedUnion;
    isDerivedUnion = newIsDerivedUnion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsId()
  {
    return isId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsId(boolean newIsId)
  {
    boolean oldIsId = isId;
    isId = newIsId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__IS_ID, oldIsId, isId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower)
  {
    int oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(int newUpper)
  {
    int oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__UPPER, oldUpper, upper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association getAssociation()
  {
    if (association != null && association.eIsProxy())
    {
      InternalEObject oldAssociation = (InternalEObject)association;
      association = (Association)eResolveProxy(oldAssociation);
      if (association != oldAssociation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DstPackage.PROPERTY__ASSOCIATION, oldAssociation, association));
      }
    }
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association basicGetAssociation()
  {
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs)
  {
    Association oldAssociation = association;
    association = newAssociation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssociation(Association newAssociation)
  {
    if (newAssociation != association)
    {
      NotificationChain msgs = null;
      if (association != null)
        msgs = ((InternalEObject)association).eInverseRemove(this, DstPackage.ASSOCIATION__MEMBEREND, Association.class, msgs);
      if (newAssociation != null)
        msgs = ((InternalEObject)newAssociation).eInverseAdd(this, DstPackage.ASSOCIATION__MEMBEREND, Association.class, msgs);
      msgs = basicSetAssociation(newAssociation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__ASSOCIATION, newAssociation, newAssociation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.PROPERTY__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.PROPERTY__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.PROPERTY__DELETE, newDelete, newDelete));
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
      case DstPackage.PROPERTY__ASSOCIATION:
        if (association != null)
          msgs = ((InternalEObject)association).eInverseRemove(this, DstPackage.ASSOCIATION__MEMBEREND, Association.class, msgs);
        return basicSetAssociation((Association)otherEnd, msgs);
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
      case DstPackage.PROPERTY__ASSOCIATION:
        return basicSetAssociation(null, msgs);
      case DstPackage.PROPERTY__DELETE:
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
      case DstPackage.PROPERTY__SHORT_NAME:
        return getShortName();
      case DstPackage.PROPERTY__IS_COMPOSITE:
        return isIsComposite() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.PROPERTY__IS_DERIVED:
        return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.PROPERTY__IS_DERIVED_UNION:
        return isIsDerivedUnion() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.PROPERTY__IS_ID:
        return isIsId() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.PROPERTY__LOWER:
        return new Integer(getLower());
      case DstPackage.PROPERTY__UPPER:
        return new Integer(getUpper());
      case DstPackage.PROPERTY__ASSOCIATION:
        if (resolve) return getAssociation();
        return basicGetAssociation();
      case DstPackage.PROPERTY__DELETE:
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
      case DstPackage.PROPERTY__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case DstPackage.PROPERTY__IS_COMPOSITE:
        setIsComposite(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.PROPERTY__IS_DERIVED:
        setIsDerived(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.PROPERTY__IS_DERIVED_UNION:
        setIsDerivedUnion(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.PROPERTY__IS_ID:
        setIsId(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.PROPERTY__LOWER:
        setLower(((Integer)newValue).intValue());
        return;
      case DstPackage.PROPERTY__UPPER:
        setUpper(((Integer)newValue).intValue());
        return;
      case DstPackage.PROPERTY__ASSOCIATION:
        setAssociation((Association)newValue);
        return;
      case DstPackage.PROPERTY__DELETE:
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
      case DstPackage.PROPERTY__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case DstPackage.PROPERTY__IS_COMPOSITE:
        setIsComposite(IS_COMPOSITE_EDEFAULT);
        return;
      case DstPackage.PROPERTY__IS_DERIVED:
        setIsDerived(IS_DERIVED_EDEFAULT);
        return;
      case DstPackage.PROPERTY__IS_DERIVED_UNION:
        setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
        return;
      case DstPackage.PROPERTY__IS_ID:
        setIsId(IS_ID_EDEFAULT);
        return;
      case DstPackage.PROPERTY__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case DstPackage.PROPERTY__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case DstPackage.PROPERTY__ASSOCIATION:
        setAssociation((Association)null);
        return;
      case DstPackage.PROPERTY__DELETE:
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
      case DstPackage.PROPERTY__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case DstPackage.PROPERTY__IS_COMPOSITE:
        return isComposite != IS_COMPOSITE_EDEFAULT;
      case DstPackage.PROPERTY__IS_DERIVED:
        return isDerived != IS_DERIVED_EDEFAULT;
      case DstPackage.PROPERTY__IS_DERIVED_UNION:
        return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
      case DstPackage.PROPERTY__IS_ID:
        return isId != IS_ID_EDEFAULT;
      case DstPackage.PROPERTY__LOWER:
        return lower != LOWER_EDEFAULT;
      case DstPackage.PROPERTY__UPPER:
        return upper != UPPER_EDEFAULT;
      case DstPackage.PROPERTY__ASSOCIATION:
        return association != null;
      case DstPackage.PROPERTY__DELETE:
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
    result.append(", isComposite: ");
    result.append(isComposite);
    result.append(", isDerived: ");
    result.append(isDerived);
    result.append(", isDerivedUnion: ");
    result.append(isDerivedUnion);
    result.append(", isId: ");
    result.append(isId);
    result.append(", Lower: ");
    result.append(lower);
    result.append(", Upper: ");
    result.append(upper);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
