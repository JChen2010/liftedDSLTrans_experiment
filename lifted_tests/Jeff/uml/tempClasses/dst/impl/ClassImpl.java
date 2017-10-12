/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst.impl;

import dst.Delete;
import dst.DstPackage;
import dst.Generalization;
import dst.Property;

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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dst.impl.ClassImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link dst.impl.ClassImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements dst.Class
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
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList properties;

  /**
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsActive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsActive()
   * @generated
   * @ordered
   */
  protected boolean isActive = IS_ACTIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFinalSpecialization()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FINAL_SPECIALIZATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFinalSpecialization()
   * @generated
   * @ordered
   */
  protected boolean isFinalSpecialization = IS_FINAL_SPECIALIZATION_EDEFAULT;

  /**
   * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLeaf()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LEAF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLeaf()
   * @generated
   * @ordered
   */
  protected boolean isLeaf = IS_LEAF_EDEFAULT;

  /**
   * The cached value of the '{@link #getGeneral() <em>General</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneral()
   * @generated
   * @ordered
   */
  protected Generalization general;

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
  protected ClassImpl()
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
    return DstPackage.Literals.CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__SHORT_NAME, oldShortName, shortName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList(Property.class, this, DstPackage.CLASS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsActive()
  {
    return isActive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsActive(boolean newIsActive)
  {
    boolean oldIsActive = isActive;
    isActive = newIsActive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__IS_ACTIVE, oldIsActive, isActive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFinalSpecialization()
  {
    return isFinalSpecialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFinalSpecialization(boolean newIsFinalSpecialization)
  {
    boolean oldIsFinalSpecialization = isFinalSpecialization;
    isFinalSpecialization = newIsFinalSpecialization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsLeaf()
  {
    return isLeaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsLeaf(boolean newIsLeaf)
  {
    boolean oldIsLeaf = isLeaf;
    isLeaf = newIsLeaf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__IS_LEAF, oldIsLeaf, isLeaf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generalization getGeneral()
  {
    return general;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeneral(Generalization newGeneral, NotificationChain msgs)
  {
    Generalization oldGeneral = general;
    general = newGeneral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__GENERAL, oldGeneral, newGeneral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneral(Generalization newGeneral)
  {
    if (newGeneral != general)
    {
      NotificationChain msgs = null;
      if (general != null)
        msgs = ((InternalEObject)general).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.CLASS__GENERAL, null, msgs);
      if (newGeneral != null)
        msgs = ((InternalEObject)newGeneral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.CLASS__GENERAL, null, msgs);
      msgs = basicSetGeneral(newGeneral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__GENERAL, newGeneral, newGeneral));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.CLASS__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.CLASS__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.CLASS__DELETE, newDelete, newDelete));
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
      case DstPackage.CLASS__PROPERTIES:
        return ((InternalEList)getProperties()).basicRemove(otherEnd, msgs);
      case DstPackage.CLASS__GENERAL:
        return basicSetGeneral(null, msgs);
      case DstPackage.CLASS__DELETE:
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
      case DstPackage.CLASS__SHORT_NAME:
        return getShortName();
      case DstPackage.CLASS__PROPERTIES:
        return getProperties();
      case DstPackage.CLASS__IS_ABSTRACT:
        return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.CLASS__IS_ACTIVE:
        return isIsActive() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.CLASS__IS_FINAL_SPECIALIZATION:
        return isIsFinalSpecialization() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.CLASS__IS_LEAF:
        return isIsLeaf() ? Boolean.TRUE : Boolean.FALSE;
      case DstPackage.CLASS__GENERAL:
        return getGeneral();
      case DstPackage.CLASS__DELETE:
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
      case DstPackage.CLASS__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case DstPackage.CLASS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection)newValue);
        return;
      case DstPackage.CLASS__IS_ABSTRACT:
        setIsAbstract(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.CLASS__IS_ACTIVE:
        setIsActive(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.CLASS__IS_FINAL_SPECIALIZATION:
        setIsFinalSpecialization(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.CLASS__IS_LEAF:
        setIsLeaf(((Boolean)newValue).booleanValue());
        return;
      case DstPackage.CLASS__GENERAL:
        setGeneral((Generalization)newValue);
        return;
      case DstPackage.CLASS__DELETE:
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
      case DstPackage.CLASS__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case DstPackage.CLASS__PROPERTIES:
        getProperties().clear();
        return;
      case DstPackage.CLASS__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case DstPackage.CLASS__IS_ACTIVE:
        setIsActive(IS_ACTIVE_EDEFAULT);
        return;
      case DstPackage.CLASS__IS_FINAL_SPECIALIZATION:
        setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
        return;
      case DstPackage.CLASS__IS_LEAF:
        setIsLeaf(IS_LEAF_EDEFAULT);
        return;
      case DstPackage.CLASS__GENERAL:
        setGeneral((Generalization)null);
        return;
      case DstPackage.CLASS__DELETE:
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
      case DstPackage.CLASS__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case DstPackage.CLASS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case DstPackage.CLASS__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case DstPackage.CLASS__IS_ACTIVE:
        return isActive != IS_ACTIVE_EDEFAULT;
      case DstPackage.CLASS__IS_FINAL_SPECIALIZATION:
        return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
      case DstPackage.CLASS__IS_LEAF:
        return isLeaf != IS_LEAF_EDEFAULT;
      case DstPackage.CLASS__GENERAL:
        return general != null;
      case DstPackage.CLASS__DELETE:
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
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(", isActive: ");
    result.append(isActive);
    result.append(", isFinalSpecialization: ");
    result.append(isFinalSpecialization);
    result.append(", isLeaf: ");
    result.append(isLeaf);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
