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
import dst.Model;
import dst.Region;
import dst.StateMachine;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dst.impl.ModelImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getStatemachines <em>Statemachines</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getModels <em>Models</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link dst.impl.ModelImpl#getMregions <em>Mregions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model
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
   * The cached value of the '{@link #getMregions() <em>Mregions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMregions()
   * @generated
   * @ordered
   */
  protected EList mregions;

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
    return DstPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.MODEL__SHORT_NAME, oldShortName, shortName));
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
      comments = new EObjectContainmentEList(Comment.class, this, DstPackage.MODEL__COMMENTS);
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
      statemachines = new EObjectContainmentEList(StateMachine.class, this, DstPackage.MODEL__STATEMACHINES);
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
      associations = new EObjectContainmentEList(Association.class, this, DstPackage.MODEL__ASSOCIATIONS);
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
      classes = new EObjectContainmentEList(dst.Class.class, this, DstPackage.MODEL__CLASSES);
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
      models = new EObjectContainmentEList(DomainModel.class, this, DstPackage.MODEL__MODELS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DstPackage.MODEL__DELETE, oldDelete, newDelete);
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
        msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DstPackage.MODEL__DELETE, null, msgs);
      if (newDelete != null)
        msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DstPackage.MODEL__DELETE, null, msgs);
      msgs = basicSetDelete(newDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DstPackage.MODEL__DELETE, newDelete, newDelete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getMregions()
  {
    if (mregions == null)
    {
      mregions = new EObjectContainmentEList(Region.class, this, DstPackage.MODEL__MREGIONS);
    }
    return mregions;
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
      case DstPackage.MODEL__COMMENTS:
        return ((InternalEList)getComments()).basicRemove(otherEnd, msgs);
      case DstPackage.MODEL__STATEMACHINES:
        return ((InternalEList)getStatemachines()).basicRemove(otherEnd, msgs);
      case DstPackage.MODEL__ASSOCIATIONS:
        return ((InternalEList)getAssociations()).basicRemove(otherEnd, msgs);
      case DstPackage.MODEL__CLASSES:
        return ((InternalEList)getClasses()).basicRemove(otherEnd, msgs);
      case DstPackage.MODEL__MODELS:
        return ((InternalEList)getModels()).basicRemove(otherEnd, msgs);
      case DstPackage.MODEL__DELETE:
        return basicSetDelete(null, msgs);
      case DstPackage.MODEL__MREGIONS:
        return ((InternalEList)getMregions()).basicRemove(otherEnd, msgs);
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
      case DstPackage.MODEL__SHORT_NAME:
        return getShortName();
      case DstPackage.MODEL__COMMENTS:
        return getComments();
      case DstPackage.MODEL__STATEMACHINES:
        return getStatemachines();
      case DstPackage.MODEL__ASSOCIATIONS:
        return getAssociations();
      case DstPackage.MODEL__CLASSES:
        return getClasses();
      case DstPackage.MODEL__MODELS:
        return getModels();
      case DstPackage.MODEL__DELETE:
        return getDelete();
      case DstPackage.MODEL__MREGIONS:
        return getMregions();
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
      case DstPackage.MODEL__SHORT_NAME:
        setShortName((String)newValue);
        return;
      case DstPackage.MODEL__COMMENTS:
        getComments().clear();
        getComments().addAll((Collection)newValue);
        return;
      case DstPackage.MODEL__STATEMACHINES:
        getStatemachines().clear();
        getStatemachines().addAll((Collection)newValue);
        return;
      case DstPackage.MODEL__ASSOCIATIONS:
        getAssociations().clear();
        getAssociations().addAll((Collection)newValue);
        return;
      case DstPackage.MODEL__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection)newValue);
        return;
      case DstPackage.MODEL__MODELS:
        getModels().clear();
        getModels().addAll((Collection)newValue);
        return;
      case DstPackage.MODEL__DELETE:
        setDelete((Delete)newValue);
        return;
      case DstPackage.MODEL__MREGIONS:
        getMregions().clear();
        getMregions().addAll((Collection)newValue);
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
      case DstPackage.MODEL__SHORT_NAME:
        setShortName(SHORT_NAME_EDEFAULT);
        return;
      case DstPackage.MODEL__COMMENTS:
        getComments().clear();
        return;
      case DstPackage.MODEL__STATEMACHINES:
        getStatemachines().clear();
        return;
      case DstPackage.MODEL__ASSOCIATIONS:
        getAssociations().clear();
        return;
      case DstPackage.MODEL__CLASSES:
        getClasses().clear();
        return;
      case DstPackage.MODEL__MODELS:
        getModels().clear();
        return;
      case DstPackage.MODEL__DELETE:
        setDelete((Delete)null);
        return;
      case DstPackage.MODEL__MREGIONS:
        getMregions().clear();
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
      case DstPackage.MODEL__SHORT_NAME:
        return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
      case DstPackage.MODEL__COMMENTS:
        return comments != null && !comments.isEmpty();
      case DstPackage.MODEL__STATEMACHINES:
        return statemachines != null && !statemachines.isEmpty();
      case DstPackage.MODEL__ASSOCIATIONS:
        return associations != null && !associations.isEmpty();
      case DstPackage.MODEL__CLASSES:
        return classes != null && !classes.isEmpty();
      case DstPackage.MODEL__MODELS:
        return models != null && !models.isEmpty();
      case DstPackage.MODEL__DELETE:
        return delete != null;
      case DstPackage.MODEL__MREGIONS:
        return mregions != null && !mregions.isEmpty();
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

} //ModelImpl
