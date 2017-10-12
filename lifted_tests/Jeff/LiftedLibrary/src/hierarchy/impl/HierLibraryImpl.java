/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hierarchy.impl;

import hierarchy.Fiction;
import hierarchy.HierLibrary;
import hierarchy.HierarchyPackage;
import hierarchy.NonFiction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hier Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hierarchy.impl.HierLibraryImpl#getFiction <em>Fiction</em>}</li>
 *   <li>{@link hierarchy.impl.HierLibraryImpl#getNonfiction <em>Nonfiction</em>}</li>
 *   <li>{@link hierarchy.impl.HierLibraryImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierLibraryImpl extends EObjectImpl implements HierLibrary {
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
	 * The cached value of the '{@link #getNonfiction() <em>Nonfiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonfiction()
	 * @generated
	 * @ordered
	 */
	protected NonFiction nonfiction;

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
	protected HierLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HierarchyPackage.Literals.HIER_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fiction getFiction() {
		return fiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiction(Fiction newFiction, NotificationChain msgs) {
		Fiction oldFiction = fiction;
		fiction = newFiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchyPackage.HIER_LIBRARY__FICTION, oldFiction, newFiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiction(Fiction newFiction) {
		if (newFiction != fiction) {
			NotificationChain msgs = null;
			if (fiction != null)
				msgs = ((InternalEObject)fiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HierarchyPackage.HIER_LIBRARY__FICTION, null, msgs);
			if (newFiction != null)
				msgs = ((InternalEObject)newFiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HierarchyPackage.HIER_LIBRARY__FICTION, null, msgs);
			msgs = basicSetFiction(newFiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HierarchyPackage.HIER_LIBRARY__FICTION, newFiction, newFiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFiction getNonfiction() {
		return nonfiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonfiction(NonFiction newNonfiction, NotificationChain msgs) {
		NonFiction oldNonfiction = nonfiction;
		nonfiction = newNonfiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HierarchyPackage.HIER_LIBRARY__NONFICTION, oldNonfiction, newNonfiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonfiction(NonFiction newNonfiction) {
		if (newNonfiction != nonfiction) {
			NotificationChain msgs = null;
			if (nonfiction != null)
				msgs = ((InternalEObject)nonfiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HierarchyPackage.HIER_LIBRARY__NONFICTION, null, msgs);
			if (newNonfiction != null)
				msgs = ((InternalEObject)newNonfiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HierarchyPackage.HIER_LIBRARY__NONFICTION, null, msgs);
			msgs = basicSetNonfiction(newNonfiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HierarchyPackage.HIER_LIBRARY__NONFICTION, newNonfiction, newNonfiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HierarchyPackage.HIER_LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HierarchyPackage.HIER_LIBRARY__FICTION:
				return basicSetFiction(null, msgs);
			case HierarchyPackage.HIER_LIBRARY__NONFICTION:
				return basicSetNonfiction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HierarchyPackage.HIER_LIBRARY__FICTION:
				return getFiction();
			case HierarchyPackage.HIER_LIBRARY__NONFICTION:
				return getNonfiction();
			case HierarchyPackage.HIER_LIBRARY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HierarchyPackage.HIER_LIBRARY__FICTION:
				setFiction((Fiction)newValue);
				return;
			case HierarchyPackage.HIER_LIBRARY__NONFICTION:
				setNonfiction((NonFiction)newValue);
				return;
			case HierarchyPackage.HIER_LIBRARY__NAME:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HierarchyPackage.HIER_LIBRARY__FICTION:
				setFiction((Fiction)null);
				return;
			case HierarchyPackage.HIER_LIBRARY__NONFICTION:
				setNonfiction((NonFiction)null);
				return;
			case HierarchyPackage.HIER_LIBRARY__NAME:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HierarchyPackage.HIER_LIBRARY__FICTION:
				return fiction != null;
			case HierarchyPackage.HIER_LIBRARY__NONFICTION:
				return nonfiction != null;
			case HierarchyPackage.HIER_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HierLibraryImpl
