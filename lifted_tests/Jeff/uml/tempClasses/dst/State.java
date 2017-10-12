/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dst.State#getShortName <em>Short Name</em>}</li>
 *   <li>{@link dst.State#getStateregions <em>Stateregions</em>}</li>
 *   <li>{@link dst.State#getDelete <em>Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see dst.DstPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex
{
  /**
   * Returns the value of the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Name</em>' attribute.
   * @see #setShortName(String)
   * @see dst.DstPackage#getState_ShortName()
   * @model required="true"
   * @generated
   */
  String getShortName();

  /**
   * Sets the value of the '{@link dst.State#getShortName <em>Short Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Name</em>' attribute.
   * @see #getShortName()
   * @generated
   */
  void setShortName(String value);

  /**
   * Returns the value of the '<em><b>Stateregions</b></em>' containment reference list.
   * The list contents are of type {@link dst.Region}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stateregions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stateregions</em>' containment reference list.
   * @see dst.DstPackage#getState_Stateregions()
   * @model type="dst.Region" containment="true"
   * @generated
   */
  EList getStateregions();

  /**
   * Returns the value of the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' containment reference.
   * @see #setDelete(Delete)
   * @see dst.DstPackage#getState_Delete()
   * @model containment="true"
   * @generated
   */
  Delete getDelete();

  /**
   * Sets the value of the '{@link dst.State#getDelete <em>Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' containment reference.
   * @see #getDelete()
   * @generated
   */
  void setDelete(Delete value);

} // State
