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

import test.Association;
import test.Comment;
import test.Delete;
import test.DomainModel;
import test.Model;
import test.StateMachine;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link test.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getStatemachines <em>Statemachines</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getModels <em>Models</em>}</li>
 *   <li>{@link test.impl.ModelImpl#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model
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
   * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected EList comments;

  /**
   * The cached value of the '{@link #getStatemachines() <em>Statemachines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemachines()
   * @generated
   * @ordered
   */
  protected EList statemachines;

  /**
   * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociations()
   * @generated
   * @ordered
   */
  protected EList associations;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList classes;

  /**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
  protected EList models;

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
  protected ModelImpl()
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
    return TestPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getComments()
  {
    if (comments == null)
    {
      comments = new EObjectContainmentEList(Comment.class, this, TestPackage.MODEL__COMMENTS);
    }
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getStatemachines()
  {
    if (statemachines == null)
    {
      statemachines = new EObjectContainmentEList(StateMachine.class, this, TestPackage.MODEL__STATEMACHINES);
    }
    return statemachines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getAssociations()
  {
    if (associations == null)
    {
      associations = new EObjectContainmentEList(Association.class, this, TestPackage.MODEL__ASSOCIATIONS);
    }
    return associations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList(test.Class.class, this, TestPackage.MODEL__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getModels()
  {
    if (models == null)
    {
      models = new EObjectContainmentEList(DomainModel.class, this, TestPackage.MODEL__MODELS);
    }
    return models;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestPackage.MODEL__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestPackage.MODEL__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestPackage.MODEL__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MODEL__DELETE, newDelete, newDelete));
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
      case TestPackage.MODEL__COMMENTS:
        return ((InternalEList)getComments()).basicRemove(otherEnd, msgs);
      case TestPackage.MODEL__STATEMACHINES:
        return ((InternalEList)getStatemachines()).basicRemove(otherEnd, msgs);
      case TestPackage.MODEL__ASSOCIATIONS:
        return ((InternalEList)getAssociations()).basicRemove(otherEnd, msgs);
      case TestPackage.MODEL__CLASSES:
        return ((InternalEList)getClasses()).basicRemove(otherEnd, msgs);
      case TestPackage.MODEL__MODELS:
        return ((InternalEList)getModels()).basicRemove(otherEnd, msgs);
      case TestPackage.MODEL__DELETE:
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
      case TestPackage.MODEL__NAME:
        return getName();
      case TestPackage.MODEL__COMMENTS:
        return getComments();
      case TestPackage.MODEL__STATEMACHINES:
        return getStatemachines();
      case TestPackage.MODEL__ASSOCIATIONS:
        return getAssociations();
      case TestPackage.MODEL__CLASSES:
        return getClasses();
      case TestPackage.MODEL__MODELS:
        return getModels();
      case TestPackage.MODEL__DELETE:
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
      case TestPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case TestPackage.MODEL__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection)newValue);
        return;
      case TestPackage.MODEL__STATEMACHINES:
        getStatemachines().clear();
        getStatemachines().addAll((Collection)newValue);
        return;
      case TestPackage.MODEL__ASSOCIATIONS:
        getAssociations().clear();
        getAssociations().addAll((Collection)newValue);
        return;
      case TestPackage.MODEL__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection)newValue);
        return;
      case TestPackage.MODEL__MODELS:
        getModels().clear();
        getModels().addAll((Collection)newValue);
        return;
      case TestPackage.MODEL__DELETE:
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
      case TestPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TestPackage.MODEL__COMMENTS:
        getComments().clear();
        return;
      case TestPackage.MODEL__STATEMACHINES:
        getStatemachines().clear();
        return;
      case TestPackage.MODEL__ASSOCIATIONS:
        getAssociations().clear();
        return;
      case TestPackage.MODEL__CLASSES:
        getClasses().clear();
        return;
      case TestPackage.MODEL__MODELS:
        getModels().clear();
        return;
      case TestPackage.MODEL__DELETE:
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
      case TestPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TestPackage.MODEL__COMMENTS:
        return comments != null && !comments.isEmpty();
      case TestPackage.MODEL__STATEMACHINES:
        return statemachines != null && !statemachines.isEmpty();
      case TestPackage.MODEL__ASSOCIATIONS:
        return associations != null && !associations.isEmpty();
      case TestPackage.MODEL__CLASSES:
        return classes != null && !classes.isEmpty();
      case TestPackage.MODEL__MODELS:
        return models != null && !models.isEmpty();
      case TestPackage.MODEL__DELETE:
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

} //ModelImpl
