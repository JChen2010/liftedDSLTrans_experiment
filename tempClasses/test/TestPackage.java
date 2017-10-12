/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package test;

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
 * @see test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "test";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://test/144.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "test";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TestPackage eINSTANCE = test.impl.TestPackageImpl.init();

  /**
   * The meta object id for the '{@link test.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.ModelImpl
   * @see test.impl.TestPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link test.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.CommentImpl
   * @see test.impl.TestPackageImpl#getComment()
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__NAME = 1;

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
   * The meta object id for the '{@link test.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.StateMachineImpl
   * @see test.impl.TestPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__NAME = 0;

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
   * The meta object id for the '{@link test.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.RegionImpl
   * @see test.impl.TestPackageImpl#getRegion()
   * @generated
   */
  int REGION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__NAME = 0;

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
   * The meta object id for the '{@link test.impl.VertexImpl <em>Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.VertexImpl
   * @see test.impl.TestPackageImpl#getVertex()
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
   * The meta object id for the '{@link test.impl.PseudostateImpl <em>Pseudostate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.PseudostateImpl
   * @see test.impl.TestPackageImpl#getPseudostate()
   * @generated
   */
  int PSEUDOSTATE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDOSTATE__NAME = VERTEX_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link test.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.StateImpl
   * @see test.impl.TestPackageImpl#getState()
   * @generated
   */
  int STATE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = VERTEX_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link test.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.TransitionImpl
   * @see test.impl.TestPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = 0;

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
   * The meta object id for the '{@link test.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.ConstraintImpl
   * @see test.impl.TestPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NAME = 0;

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
   * The meta object id for the '{@link test.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.AssociationImpl
   * @see test.impl.TestPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__NAME = 0;

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
   * The meta object id for the '{@link test.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.ClassImpl
   * @see test.impl.TestPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

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
   * The meta object id for the '{@link test.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.PropertyImpl
   * @see test.impl.TestPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

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
   * The meta object id for the '{@link test.impl.GeneralizationImpl <em>Generalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.GeneralizationImpl
   * @see test.impl.TestPackageImpl#getGeneralization()
   * @generated
   */
  int GENERALIZATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__NAME = 0;

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
   * The meta object id for the '{@link test.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.DomainModelImpl
   * @see test.impl.TestPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__NAME = 0;

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
   * The meta object id for the '{@link test.impl.DeleteImpl <em>Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.impl.DeleteImpl
   * @see test.impl.TestPackageImpl#getDelete()
   * @generated
   */
  int DELETE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE__NAME = 0;

  /**
   * The number of structural features of the '<em>Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link test.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see test.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link test.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.Model#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comments</em>'.
   * @see test.Model#getComments()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Comments();

  /**
   * Returns the meta object for the containment reference list '{@link test.Model#getStatemachines <em>Statemachines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemachines</em>'.
   * @see test.Model#getStatemachines()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statemachines();

  /**
   * Returns the meta object for the containment reference list '{@link test.Model#getAssociations <em>Associations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Associations</em>'.
   * @see test.Model#getAssociations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Associations();

  /**
   * Returns the meta object for the containment reference list '{@link test.Model#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see test.Model#getClasses()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link test.Model#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see test.Model#getModels()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Models();

  /**
   * Returns the meta object for the containment reference '{@link test.Model#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Model#getDelete()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Delete();

  /**
   * Returns the meta object for class '{@link test.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see test.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link test.Comment#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see test.Comment#getBody()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Body();

  /**
   * Returns the meta object for the attribute '{@link test.Comment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Comment#getName()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Name();

  /**
   * Returns the meta object for the containment reference '{@link test.Comment#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Comment#getDelete()
   * @see #getComment()
   * @generated
   */
  EReference getComment_Delete();

  /**
   * Returns the meta object for class '{@link test.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see test.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the attribute '{@link test.StateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.StateMachine#getName()
   * @see #getStateMachine()
   * @generated
   */
  EAttribute getStateMachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.StateMachine#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see test.StateMachine#getRegions()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Regions();

  /**
   * Returns the meta object for the containment reference '{@link test.StateMachine#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.StateMachine#getDelete()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Delete();

  /**
   * Returns the meta object for class '{@link test.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see test.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the attribute '{@link test.Region#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Region#getName()
   * @see #getRegion()
   * @generated
   */
  EAttribute getRegion_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.Region#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see test.Region#getStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_States();

  /**
   * Returns the meta object for the containment reference list '{@link test.Region#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see test.Region#getTransitions()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Transitions();

  /**
   * Returns the meta object for the containment reference '{@link test.Region#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Region#getDelete()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Delete();

  /**
   * Returns the meta object for class '{@link test.Pseudostate <em>Pseudostate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pseudostate</em>'.
   * @see test.Pseudostate
   * @generated
   */
  EClass getPseudostate();

  /**
   * Returns the meta object for the attribute '{@link test.Pseudostate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Pseudostate#getName()
   * @see #getPseudostate()
   * @generated
   */
  EAttribute getPseudostate_Name();

  /**
   * Returns the meta object for the containment reference '{@link test.Pseudostate#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Pseudostate#getDelete()
   * @see #getPseudostate()
   * @generated
   */
  EReference getPseudostate_Delete();

  /**
   * Returns the meta object for class '{@link test.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see test.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link test.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.State#getStateregions <em>Stateregions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stateregions</em>'.
   * @see test.State#getStateregions()
   * @see #getState()
   * @generated
   */
  EReference getState_Stateregions();

  /**
   * Returns the meta object for the containment reference '{@link test.State#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.State#getDelete()
   * @see #getState()
   * @generated
   */
  EReference getState_Delete();

  /**
   * Returns the meta object for class '{@link test.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see test.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link test.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link test.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see test.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the reference '{@link test.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see test.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the containment reference list '{@link test.Transition#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see test.Transition#getConstraints()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Constraints();

  /**
   * Returns the meta object for the containment reference '{@link test.Transition#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Transition#getDelete()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Delete();

  /**
   * Returns the meta object for class '{@link test.Vertex <em>Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertex</em>'.
   * @see test.Vertex
   * @generated
   */
  EClass getVertex();

  /**
   * Returns the meta object for class '{@link test.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see test.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link test.Constraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Constraint#getName()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Name();

  /**
   * Returns the meta object for the attribute '{@link test.Constraint#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see test.Constraint#getBody()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Body();

  /**
   * Returns the meta object for the attribute '{@link test.Constraint#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see test.Constraint#getLanguage()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Language();

  /**
   * Returns the meta object for the containment reference '{@link test.Constraint#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Constraint#getDelete()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Delete();

  /**
   * Returns the meta object for class '{@link test.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see test.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute '{@link test.Association#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Association#getName()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Name();

  /**
   * Returns the meta object for the reference list '{@link test.Association#getEndtype <em>Endtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Endtype</em>'.
   * @see test.Association#getEndtype()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Endtype();

  /**
   * Returns the meta object for the reference list '{@link test.Association#getMemberend <em>Memberend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Memberend</em>'.
   * @see test.Association#getMemberend()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Memberend();

  /**
   * Returns the meta object for the attribute '{@link test.Association#isIsDerived <em>Is Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived</em>'.
   * @see test.Association#isIsDerived()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_IsDerived();

  /**
   * Returns the meta object for the containment reference '{@link test.Association#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Association#getDelete()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Delete();

  /**
   * Returns the meta object for class '{@link test.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see test.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link test.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.Class#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see test.Class#getProperties()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Properties();

  /**
   * Returns the meta object for the attribute '{@link test.Class#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see test.Class#isIsAbstract()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsAbstract();

  /**
   * Returns the meta object for the attribute '{@link test.Class#isIsActive <em>Is Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Active</em>'.
   * @see test.Class#isIsActive()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsActive();

  /**
   * Returns the meta object for the attribute '{@link test.Class#isIsFinalSpecialization <em>Is Final Specialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final Specialization</em>'.
   * @see test.Class#isIsFinalSpecialization()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsFinalSpecialization();

  /**
   * Returns the meta object for the attribute '{@link test.Class#isIsLeaf <em>Is Leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Leaf</em>'.
   * @see test.Class#isIsLeaf()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsLeaf();

  /**
   * Returns the meta object for the containment reference '{@link test.Class#getGeneral <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>General</em>'.
   * @see test.Class#getGeneral()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_General();

  /**
   * Returns the meta object for the containment reference '{@link test.Class#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Class#getDelete()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Delete();

  /**
   * Returns the meta object for class '{@link test.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see test.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link test.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link test.Property#isIsComposite <em>Is Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Composite</em>'.
   * @see test.Property#isIsComposite()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsComposite();

  /**
   * Returns the meta object for the attribute '{@link test.Property#isIsDerived <em>Is Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived</em>'.
   * @see test.Property#isIsDerived()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsDerived();

  /**
   * Returns the meta object for the attribute '{@link test.Property#isIsDerivedUnion <em>Is Derived Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived Union</em>'.
   * @see test.Property#isIsDerivedUnion()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsDerivedUnion();

  /**
   * Returns the meta object for the attribute '{@link test.Property#isIsId <em>Is Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Id</em>'.
   * @see test.Property#isIsId()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_IsId();

  /**
   * Returns the meta object for the attribute '{@link test.Property#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see test.Property#getLower()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Lower();

  /**
   * Returns the meta object for the attribute '{@link test.Property#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see test.Property#getUpper()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Upper();

  /**
   * Returns the meta object for the reference '{@link test.Property#getAssociation <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Association</em>'.
   * @see test.Property#getAssociation()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Association();

  /**
   * Returns the meta object for the containment reference '{@link test.Property#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Property#getDelete()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Delete();

  /**
   * Returns the meta object for class '{@link test.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalization</em>'.
   * @see test.Generalization
   * @generated
   */
  EClass getGeneralization();

  /**
   * Returns the meta object for the attribute '{@link test.Generalization#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Generalization#getName()
   * @see #getGeneralization()
   * @generated
   */
  EAttribute getGeneralization_Name();

  /**
   * Returns the meta object for the attribute '{@link test.Generalization#isIsSubstitutable <em>Is Substitutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Substitutable</em>'.
   * @see test.Generalization#isIsSubstitutable()
   * @see #getGeneralization()
   * @generated
   */
  EAttribute getGeneralization_IsSubstitutable();

  /**
   * Returns the meta object for the containment reference '{@link test.Generalization#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.Generalization#getDelete()
   * @see #getGeneralization()
   * @generated
   */
  EReference getGeneralization_Delete();

  /**
   * Returns the meta object for class '{@link test.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see test.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the attribute '{@link test.DomainModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.DomainModel#getName()
   * @see #getDomainModel()
   * @generated
   */
  EAttribute getDomainModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.DomainModel#getDassociations <em>Dassociations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dassociations</em>'.
   * @see test.DomainModel#getDassociations()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dassociations();

  /**
   * Returns the meta object for the containment reference list '{@link test.DomainModel#getDclasses <em>Dclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dclasses</em>'.
   * @see test.DomainModel#getDclasses()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dclasses();

  /**
   * Returns the meta object for the containment reference list '{@link test.DomainModel#getDcomments <em>Dcomments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dcomments</em>'.
   * @see test.DomainModel#getDcomments()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Dcomments();

  /**
   * Returns the meta object for the containment reference '{@link test.DomainModel#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete</em>'.
   * @see test.DomainModel#getDelete()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Delete();

  /**
   * Returns the meta object for class '{@link test.Delete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete</em>'.
   * @see test.Delete
   * @generated
   */
  EClass getDelete();

  /**
   * Returns the meta object for the attribute '{@link test.Delete#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.Delete#getName()
   * @see #getDelete()
   * @generated
   */
  EAttribute getDelete_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TestFactory getTestFactory();

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
     * The meta object literal for the '{@link test.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.ModelImpl
     * @see test.impl.TestPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

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
     * The meta object literal for the '{@link test.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.CommentImpl
     * @see test.impl.TestPackageImpl#getComment()
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__NAME = eINSTANCE.getComment_Name();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENT__DELETE = eINSTANCE.getComment_Delete();

    /**
     * The meta object literal for the '{@link test.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.StateMachineImpl
     * @see test.impl.TestPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_MACHINE__NAME = eINSTANCE.getStateMachine_Name();

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
     * The meta object literal for the '{@link test.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.RegionImpl
     * @see test.impl.TestPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

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
     * The meta object literal for the '{@link test.impl.PseudostateImpl <em>Pseudostate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.PseudostateImpl
     * @see test.impl.TestPackageImpl#getPseudostate()
     * @generated
     */
    EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDOSTATE__NAME = eINSTANCE.getPseudostate_Name();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDOSTATE__DELETE = eINSTANCE.getPseudostate_Delete();

    /**
     * The meta object literal for the '{@link test.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.StateImpl
     * @see test.impl.TestPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

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
     * The meta object literal for the '{@link test.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.TransitionImpl
     * @see test.impl.TestPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

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
     * The meta object literal for the '{@link test.impl.VertexImpl <em>Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.VertexImpl
     * @see test.impl.TestPackageImpl#getVertex()
     * @generated
     */
    EClass VERTEX = eINSTANCE.getVertex();

    /**
     * The meta object literal for the '{@link test.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.ConstraintImpl
     * @see test.impl.TestPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

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
     * The meta object literal for the '{@link test.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.AssociationImpl
     * @see test.impl.TestPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

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
     * The meta object literal for the '{@link test.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.ClassImpl
     * @see test.impl.TestPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

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
     * The meta object literal for the '{@link test.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.PropertyImpl
     * @see test.impl.TestPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

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
     * The meta object literal for the '{@link test.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.GeneralizationImpl
     * @see test.impl.TestPackageImpl#getGeneralization()
     * @generated
     */
    EClass GENERALIZATION = eINSTANCE.getGeneralization();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZATION__NAME = eINSTANCE.getGeneralization_Name();

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
     * The meta object literal for the '{@link test.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.DomainModelImpl
     * @see test.impl.TestPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

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
     * The meta object literal for the '{@link test.impl.DeleteImpl <em>Delete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.impl.DeleteImpl
     * @see test.impl.TestPackageImpl#getDelete()
     * @generated
     */
    EClass DELETE = eINSTANCE.getDelete();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE__NAME = eINSTANCE.getDelete_Name();

  }

} //TestPackage
