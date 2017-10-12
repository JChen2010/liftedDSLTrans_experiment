/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import test.Delete;
import test.Generalization;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link test.impl.GeneralizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link test.impl.GeneralizationImpl#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link test.impl.GeneralizationImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends EObjectImpl implements Generalization
{
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
   * The default value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSubstitutable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSubstitutable()
   * @generated
   * @ordered
   */
  protected boolean isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

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
  protected GeneralizationImpl()
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
    return TestPackage.Literals.GENERALIZATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.GENERALIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSubstitutable()
  {
    return isSubstitutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSubstitutable(boolean newIsSubstitutable)
  {
    boolean oldIsSubstitutable = isSubstitutable;
    isSubstitutable = newIsSubstitutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.GENERALIZATION__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.GENERALIZATION__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.GENERALIZATION__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.GENERALIZATION__DELETE, newDelete, newDelete));
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
      case TestPackage.GENERALIZATION__DELETE:
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
      case TestPackage.GENERALIZATION__NAME:
        return getName();
      case TestPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        return isIsSubstitutable() ? Boolean.TRUE : Boolean.FALSE;
      case TestPackage.GENERALIZATION__DELETE:
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
      case TestPackage.GENERALIZATION__NAME:
        setName((String)newValue);
        return;
      case TestPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        setIsSubstitutable(((Boolean)newValue).booleanValue());
        return;
      case TestPackage.GENERALIZATION__DELETE:
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
      case TestPackage.GENERALIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TestPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
        return;
      case TestPackage.GENERALIZATION__DELETE:
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
      case TestPackage.GENERALIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TestPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        return isSubstitutable != IS_SUBSTITUTABLE_EDEFAULT;
      case TestPackage.GENERALIZATION__DELETE:
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
    result.append(" (Name: ");
    result.append(name);
    result.append(", isSubstitutable: ");
    result.append(isSubstitutable);
    result.append(')');
    return result.toString();
  }

} //GeneralizationImpl
