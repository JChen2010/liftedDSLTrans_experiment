/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package test.impl;

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

import test.Delete;
import test.Region;
import test.TestPackage;
import test.Transition;
import test.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link test.impl.RegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link test.impl.RegionImpl#getStates <em>States</em>}</li>
 *   <li>{@link test.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link test.impl.RegionImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends EObjectImpl implements Region
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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList states;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList transitions;

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
  protected RegionImpl()
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
    return TestPackage.Literals.REGION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REGION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList(Vertex.class, this, TestPackage.REGION__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList(Transition.class, this, TestPackage.REGION__TRANSITIONS);
    }
    return transitions;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.REGION__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.REGION__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.REGION__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.REGION__DELETE, newDelete, newDelete));
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
      case TestPackage.REGION__STATES:
        return ((InternalEList)getStates()).basicRemove(otherEnd, msgs);
      case TestPackage.REGION__TRANSITIONS:
        return ((InternalEList)getTransitions()).basicRemove(otherEnd, msgs);
      case TestPackage.REGION__DELETE:
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
      case TestPackage.REGION__NAME:
        return getName();
      case TestPackage.REGION__STATES:
        return getStates();
      case TestPackage.REGION__TRANSITIONS:
        return getTransitions();
      case TestPackage.REGION__DELETE:
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
      case TestPackage.REGION__NAME:
        setName((String)newValue);
        return;
      case TestPackage.REGION__STATES:
        getStates().clear();
        getStates().addAll((Collection)newValue);
        return;
      case TestPackage.REGION__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection)newValue);
        return;
      case TestPackage.REGION__DELETE:
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
      case TestPackage.REGION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TestPackage.REGION__STATES:
        getStates().clear();
        return;
      case TestPackage.REGION__TRANSITIONS:
        getTransitions().clear();
        return;
      case TestPackage.REGION__DELETE:
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
      case TestPackage.REGION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TestPackage.REGION__STATES:
        return states != null && !states.isEmpty();
      case TestPackage.REGION__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case TestPackage.REGION__DELETE:
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
    result.append(')');
    return result.toString();
  }

} //RegionImpl
