/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dst;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dst.DstFactory
 * @model kind="package"
 * @generated
 */
public interface DstPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dst";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://dst/157.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dst";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DstPackage eINSTANCE = dst.impl.DstPackageImpl.init();

  /**
   * The meta object id for the '{@link dst.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.ModelImpl
   * @see dst.impl.DstPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Comments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMENTS = 1;

  /**
   * The feature id for the '<em><b>Statemachines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMACHINES = 2;

  /**
   * The feature id for the '<em><b>Associations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ASSOCIATIONS = 3;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASSES = 4;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODELS = 5;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DELETE = 6;

  /**
   * The feature id for the '<em><b>Mregions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MREGIONS = 7;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link dst.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.CommentImpl
   * @see dst.impl.DstPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__BODY = 0;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__SHORT_NAME = 1;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__DELETE = 2;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dst.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.StateMachineImpl
   * @see dst.impl.DstPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 2;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__REGIONS = 1;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__DELETE = 2;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dst.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.RegionImpl
   * @see dst.impl.DstPackageImpl#getRegion()
   * @generated
   */
  int REGION = 3;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__STATES = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__DELETE = 3;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dst.impl.VertexImpl <em>Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.VertexImpl
   * @see dst.impl.DstPackageImpl#getVertex()
   * @generated
   */
  int VERTEX = 7;

  /**
   * The number of structural features of the '<em>Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dst.impl.PseudostateImpl <em>Pseudostate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.PseudostateImpl
   * @see dst.impl.DstPackageImpl#getPseudostate()
   * @generated
   */
  int PSEUDOSTATE = 4;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDOSTATE__SHORT_NAME = VERTEX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDOSTATE__DELETE = VERTEX_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pseudostate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDOSTATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dst.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.StateImpl
   * @see dst.impl.DstPackageImpl#getState()
   * @generated
   */
  int STATE = 5;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SHORT_NAME = VERTEX_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stateregions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATEREGIONS = VERTEX_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DELETE = VERTEX_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dst.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.TransitionImpl
   * @see dst.impl.DstPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 6;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__CONSTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DELETE = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dst.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.ConstraintImpl
   * @see dst.impl.DstPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 8;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BODY = 1;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__LANGUAGE = 2;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DELETE = 3;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dst.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.AssociationImpl
   * @see dst.impl.DstPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 9;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Endtype</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__ENDTYPE = 1;

  /**
   * The feature id for the '<em><b>Memberend</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__MEMBEREND = 2;

  /**
   * The feature id for the '<em><b>Is Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__IS_DERIVED = 3;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__DELETE = 4;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dst.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.ClassImpl
   * @see dst.impl.DstPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 10;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_ABSTRACT = 2;

  /**
   * The feature id for the '<em><b>Is Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_ACTIVE = 3;

  /**
   * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_FINAL_SPECIALIZATION = 4;

  /**
   * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_LEAF = 5;

  /**
   * The feature id for the '<em><b>General</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__GENERAL = 6;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DELETE = 7;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link dst.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.PropertyImpl
   * @see dst.impl.DstPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Is Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IS_COMPOSITE = 1;

  /**
   * The feature id for the '<em><b>Is Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IS_DERIVED = 2;

  /**
   * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IS_DERIVED_UNION = 3;

  /**
   * The feature id for the '<em><b>Is Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__IS_ID = 4;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__LOWER = 5;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__UPPER = 6;

  /**
   * The feature id for the '<em><b>Association</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ASSOCIATION = 7;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DELETE = 8;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link dst.impl.GeneralizationImpl <em>Generalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.GeneralizationImpl
   * @see dst.impl.DstPackageImpl#getGeneralization()
   * @generated
   */
  int GENERALIZATION = 12;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Is Substitutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__IS_SUBSTITUTABLE = 1;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__DELETE = 2;

  /**
   * The number of structural features of the '<em>Generalization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dst.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.DomainModelImpl
   * @see dst.impl.DstPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 13;

  /**
   * The feature id for the '<em><b>Short Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__SHORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Dassociations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__DASSOCIATIONS = 1;

  /**
   * The feature id for the '<em><b>Dclasses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__DCLASSES = 2;

  /**
   * The feature id for the '<em><b>Dcomments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__DCOMMENTS = 3;

  /**
   * The feature id for the '<em><b>Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__DELETE = 4;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dst.impl.DeleteImpl <em>Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dst.impl.DeleteImpl
   * @see dst.impl.DstPackageImpl#getDelete()
   * @generated
   */
  int DELETE = 14;

  /**
   * The number of structural features of the '<em>Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link dst.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see dst.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link dst.Model#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Model#getShortName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comments</em>'.
   * @see dst.Model#getComments()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Comments();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getStatemachines <em>Statemachines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemachines</em>'.
   * @see dst.Model#getStatemachines()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statemachines();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getAssociations <em>Associations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Associations</em>'.
   * @see dst.Model#getAssociations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Associations();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see dst.Model#getClasses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see dst.Model#getModels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Models();

  /**
   * Returns the meta object for the containment reference '{@link dst.Model#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Model#getDelete()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Delete();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Model#getMregions <em>Mregions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mregions</em>'.
   * @see dst.Model#getMregions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Mregions();

  /**
   * Returns the meta object for class '{@link dst.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see dst.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link dst.Comment#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see dst.Comment#getBody()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Body();

  /**
   * Returns the meta object for the attribute '{@link dst.Comment#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Comment#getShortName()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_ShortName();

  /**
   * Returns the meta object for the containment reference '{@link dst.Comment#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Comment#getDelete()
   * @see #getComment()
   * @generated
   */
  EReference getComment_Delete();

  /**
   * Returns the meta object for class '{@link dst.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see dst.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the attribute '{@link dst.StateMachine#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.StateMachine#getShortName()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.StateMachine#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see dst.StateMachine#getRegions()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Regions();

  /**
   * Returns the meta object for the containment reference '{@link dst.StateMachine#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.StateMachine#getDelete()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Delete();

  /**
   * Returns the meta object for class '{@link dst.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see dst.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the attribute '{@link dst.Region#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Region#getShortName()
   * @see #getRegion()
   * @generated
   */
  EAttribute getRegion_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Region#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see dst.Region#getStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_States();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Region#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see dst.Region#getTransitions()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Transitions();

  /**
   * Returns the meta object for the containment reference '{@link dst.Region#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Region#getDelete()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Delete();

  /**
   * Returns the meta object for class '{@link dst.Pseudostate <em>Pseudostate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudostate</em>'.
   * @see dst.Pseudostate
   * @generated
   */
  EClass getPseudostate();

  /**
   * Returns the meta object for the attribute '{@link dst.Pseudostate#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Pseudostate#getShortName()
   * @see #getPseudostate()
   * @generated
   */
  EAttribute getPseudostate_ShortName();

  /**
   * Returns the meta object for the containment reference '{@link dst.Pseudostate#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Pseudostate#getDelete()
   * @see #getPseudostate()
   * @generated
   */
  EReference getPseudostate_Delete();

  /**
   * Returns the meta object for class '{@link dst.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see dst.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link dst.State#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.State#getShortName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.State#getStateregions <em>Stateregions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stateregions</em>'.
   * @see dst.State#getStateregions()
   * @see #getState()
   * @generated
   */
  EReference getState_Stateregions();

  /**
   * Returns the meta object for the containment reference '{@link dst.State#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.State#getDelete()
   * @see #getState()
   * @generated
   */
  EReference getState_Delete();

  /**
   * Returns the meta object for class '{@link dst.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see dst.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link dst.Transition#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Transition#getShortName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_ShortName();

  /**
   * Returns the meta object for the reference '{@link dst.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see dst.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the reference '{@link dst.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dst.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Transition#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see dst.Transition#getConstraints()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Constraints();

  /**
   * Returns the meta object for the containment reference '{@link dst.Transition#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Transition#getDelete()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Delete();

  /**
   * Returns the meta object for class '{@link dst.Vertex <em>Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertex</em>'.
   * @see dst.Vertex
   * @generated
   */
  EClass getVertex();

  /**
   * Returns the meta object for class '{@link dst.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see dst.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link dst.Constraint#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Constraint#getShortName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_ShortName();

  /**
   * Returns the meta object for the attribute '{@link dst.Constraint#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see dst.Constraint#getBody()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Body();

  /**
   * Returns the meta object for the attribute '{@link dst.Constraint#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see dst.Constraint#getLanguage()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Language();

  /**
   * Returns the meta object for the containment reference '{@link dst.Constraint#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Constraint#getDelete()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Delete();

  /**
   * Returns the meta object for class '{@link dst.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see dst.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute '{@link dst.Association#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Association#getShortName()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_ShortName();

  /**
   * Returns the meta object for the reference list '{@link dst.Association#getEndtype <em>Endtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Endtype</em>'.
   * @see dst.Association#getEndtype()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Endtype();

  /**
   * Returns the meta object for the reference list '{@link dst.Association#getMemberend <em>Memberend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Memberend</em>'.
   * @see dst.Association#getMemberend()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Memberend();

  /**
   * Returns the meta object for the attribute '{@link dst.Association#isIsDerived <em>Is Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived</em>'.
   * @see dst.Association#isIsDerived()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_IsDerived();

  /**
   * Returns the meta object for the containment reference '{@link dst.Association#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Association#getDelete()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Delete();

  /**
   * Returns the meta object for class '{@link dst.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see dst.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link dst.Class#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Class#getShortName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.Class#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see dst.Class#getProperties()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Properties();

  /**
   * Returns the meta object for the attribute '{@link dst.Class#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see dst.Class#isIsAbstract()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsAbstract();

  /**
   * Returns the meta object for the attribute '{@link dst.Class#isIsActive <em>Is Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Active</em>'.
   * @see dst.Class#isIsActive()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsActive();

  /**
   * Returns the meta object for the attribute '{@link dst.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final Specialization</em>'.
   * @see dst.Class#isIsFinalSpecialization()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsFinalSpecialization();

  /**
   * Returns the meta object for the attribute '{@link dst.Class#isIsLeaf <em>Is Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Leaf</em>'.
   * @see dst.Class#isIsLeaf()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsLeaf();

  /**
   * Returns the meta object for the containment reference '{@link dst.Class#getGeneral <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>General</em>'.
   * @see dst.Class#getGeneral()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_General();

  /**
   * Returns the meta object for the containment reference '{@link dst.Class#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Class#getDelete()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Delete();

  /**
   * Returns the meta object for class '{@link dst.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see dst.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Property#getShortName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_ShortName();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#isIsComposite <em>Is Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Composite</em>'.
   * @see dst.Property#isIsComposite()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsComposite();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#isIsDerived <em>Is Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived</em>'.
   * @see dst.Property#isIsDerived()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsDerived();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#isIsDerivedUnion <em>Is Derived Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived Union</em>'.
   * @see dst.Property#isIsDerivedUnion()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsDerivedUnion();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#isIsId <em>Is Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Id</em>'.
   * @see dst.Property#isIsId()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsId();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see dst.Property#getLower()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Lower();

  /**
   * Returns the meta object for the attribute '{@link dst.Property#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see dst.Property#getUpper()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Upper();

  /**
   * Returns the meta object for the reference '{@link dst.Property#getAssociation <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Association</em>'.
   * @see dst.Property#getAssociation()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Association();

  /**
   * Returns the meta object for the containment reference '{@link dst.Property#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Property#getDelete()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Delete();

  /**
   * Returns the meta object for class '{@link dst.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalization</em>'.
   * @see dst.Generalization
   * @generated
   */
  EClass getGeneralization();

  /**
   * Returns the meta object for the attribute '{@link dst.Generalization#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.Generalization#getShortName()
   * @see #getGeneralization()
   * @generated
   */
  EAttribute getGeneralization_ShortName();

  /**
   * Returns the meta object for the attribute '{@link dst.Generalization#isIsSubstitutable <em>Is Substitutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Substitutable</em>'.
   * @see dst.Generalization#isIsSubstitutable()
   * @see #getGeneralization()
   * @generated
   */
  EAttribute getGeneralization_IsSubstitutable();

  /**
   * Returns the meta object for the containment reference '{@link dst.Generalization#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.Generalization#getDelete()
   * @see #getGeneralization()
   * @generated
   */
  EReference getGeneralization_Delete();

  /**
   * Returns the meta object for class '{@link dst.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see dst.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the attribute '{@link dst.DomainModel#getShortName <em>Short Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Name</em>'.
   * @see dst.DomainModel#getShortName()
   * @see #getDomainModel()
   * @generated
   */
  EAttribute getDomainModel_ShortName();

  /**
   * Returns the meta object for the containment reference list '{@link dst.DomainModel#getDassociations <em>Dassociations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dassociations</em>'.
   * @see dst.DomainModel#getDassociations()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dassociations();

  /**
   * Returns the meta object for the containment reference list '{@link dst.DomainModel#getDclasses <em>Dclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dclasses</em>'.
   * @see dst.DomainModel#getDclasses()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dclasses();

  /**
   * Returns the meta object for the containment reference list '{@link dst.DomainModel#getDcomments <em>Dcomments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dcomments</em>'.
   * @see dst.DomainModel#getDcomments()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dcomments();

  /**
   * Returns the meta object for the containment reference '{@link dst.DomainModel#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see dst.DomainModel#getDelete()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Delete();

  /**
   * Returns the meta object for class '{@link dst.Delete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete</em>'.
   * @see dst.Delete
   * @generated
   */
  EClass getDelete();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DstFactory getDstFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dst.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.ModelImpl
     * @see dst.impl.DstPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__SHORT_NAME = eINSTANCE.getModel_ShortName();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMENTS = eINSTANCE.getModel_Comments();

    /**
     * The meta object literal for the '<em><b>Statemachines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMACHINES = eINSTANCE.getModel_Statemachines();

    /**
     * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ASSOCIATIONS = eINSTANCE.getModel_Associations();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CLASSES = eINSTANCE.getModel_Classes();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODELS = eINSTANCE.getModel_Models();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DELETE = eINSTANCE.getModel_Delete();

    /**
     * The meta object literal for the '<em><b>Mregions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MREGIONS = eINSTANCE.getModel_Mregions();

    /**
     * The meta object literal for the '{@link dst.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.CommentImpl
     * @see dst.impl.DstPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__SHORT_NAME = eINSTANCE.getComment_ShortName();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENT__DELETE = eINSTANCE.getComment_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.StateMachineImpl
     * @see dst.impl.DstPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__SHORT_NAME = eINSTANCE.getStateMachine_ShortName();

    /**
     * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__REGIONS = eINSTANCE.getStateMachine_Regions();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__DELETE = eINSTANCE.getStateMachine_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.RegionImpl
     * @see dst.impl.DstPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGION__SHORT_NAME = eINSTANCE.getRegion_ShortName();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__STATES = eINSTANCE.getRegion_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__TRANSITIONS = eINSTANCE.getRegion_Transitions();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__DELETE = eINSTANCE.getRegion_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.PseudostateImpl <em>Pseudostate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.PseudostateImpl
     * @see dst.impl.DstPackageImpl#getPseudostate()
     * @generated
     */
    EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDOSTATE__SHORT_NAME = eINSTANCE.getPseudostate_ShortName();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDOSTATE__DELETE = eINSTANCE.getPseudostate_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.StateImpl
     * @see dst.impl.DstPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__SHORT_NAME = eINSTANCE.getState_ShortName();

    /**
     * The meta object literal for the '<em><b>Stateregions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATEREGIONS = eINSTANCE.getState_Stateregions();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__DELETE = eINSTANCE.getState_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.TransitionImpl
     * @see dst.impl.DstPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__SHORT_NAME = eINSTANCE.getTransition_ShortName();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__CONSTRAINTS = eINSTANCE.getTransition_Constraints();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__DELETE = eINSTANCE.getTransition_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.VertexImpl <em>Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.VertexImpl
     * @see dst.impl.DstPackageImpl#getVertex()
     * @generated
     */
    EClass VERTEX = eINSTANCE.getVertex();

    /**
     * The meta object literal for the '{@link dst.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.ConstraintImpl
     * @see dst.impl.DstPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__SHORT_NAME = eINSTANCE.getConstraint_ShortName();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__LANGUAGE = eINSTANCE.getConstraint_Language();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__DELETE = eINSTANCE.getConstraint_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.AssociationImpl
     * @see dst.impl.DstPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__SHORT_NAME = eINSTANCE.getAssociation_ShortName();

    /**
     * The meta object literal for the '<em><b>Endtype</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__ENDTYPE = eINSTANCE.getAssociation_Endtype();

    /**
     * The meta object literal for the '<em><b>Memberend</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__MEMBEREND = eINSTANCE.getAssociation_Memberend();

    /**
     * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__IS_DERIVED = eINSTANCE.getAssociation_IsDerived();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__DELETE = eINSTANCE.getAssociation_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.ClassImpl
     * @see dst.impl.DstPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__SHORT_NAME = eINSTANCE.getClass_ShortName();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__PROPERTIES = eINSTANCE.getClass_Properties();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_ACTIVE = eINSTANCE.getClass_IsActive();

    /**
     * The meta object literal for the '<em><b>Is Final Specialization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_FINAL_SPECIALIZATION = eINSTANCE.getClass_IsFinalSpecialization();

    /**
     * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_LEAF = eINSTANCE.getClass_IsLeaf();

    /**
     * The meta object literal for the '<em><b>General</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__GENERAL = eINSTANCE.getClass_General();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__DELETE = eINSTANCE.getClass_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.PropertyImpl
     * @see dst.impl.DstPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__SHORT_NAME = eINSTANCE.getProperty_ShortName();

    /**
     * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IS_COMPOSITE = eINSTANCE.getProperty_IsComposite();

    /**
     * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IS_DERIVED = eINSTANCE.getProperty_IsDerived();

    /**
     * The meta object literal for the '<em><b>Is Derived Union</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IS_DERIVED_UNION = eINSTANCE.getProperty_IsDerivedUnion();

    /**
     * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__IS_ID = eINSTANCE.getProperty_IsId();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__LOWER = eINSTANCE.getProperty_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__UPPER = eINSTANCE.getProperty_Upper();

    /**
     * The meta object literal for the '<em><b>Association</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ASSOCIATION = eINSTANCE.getProperty_Association();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DELETE = eINSTANCE.getProperty_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.GeneralizationImpl
     * @see dst.impl.DstPackageImpl#getGeneralization()
     * @generated
     */
    EClass GENERALIZATION = eINSTANCE.getGeneralization();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZATION__SHORT_NAME = eINSTANCE.getGeneralization_ShortName();

    /**
     * The meta object literal for the '<em><b>Is Substitutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZATION__IS_SUBSTITUTABLE = eINSTANCE.getGeneralization_IsSubstitutable();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZATION__DELETE = eINSTANCE.getGeneralization_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.DomainModelImpl
     * @see dst.impl.DstPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_MODEL__SHORT_NAME = eINSTANCE.getDomainModel_ShortName();

    /**
     * The meta object literal for the '<em><b>Dassociations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__DASSOCIATIONS = eINSTANCE.getDomainModel_Dassociations();

    /**
     * The meta object literal for the '<em><b>Dclasses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__DCLASSES = eINSTANCE.getDomainModel_Dclasses();

    /**
     * The meta object literal for the '<em><b>Dcomments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__DCOMMENTS = eINSTANCE.getDomainModel_Dcomments();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__DELETE = eINSTANCE.getDomainModel_Delete();

    /**
     * The meta object literal for the '{@link dst.impl.DeleteImpl <em>Delete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dst.impl.DeleteImpl
     * @see dst.impl.DstPackageImpl#getDelete()
     * @generated
     */
    EClass DELETE = eINSTANCE.getDelete();

  }

} //DstPackage
