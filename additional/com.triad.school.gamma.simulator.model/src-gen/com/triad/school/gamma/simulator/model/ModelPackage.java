/**
 */
package com.triad.school.gamma.simulator.model;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.triad.school.gamma.simulator.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.triad.com/school/gamma/simulator/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.triad.school.gamma.simulator.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.triad.school.gamma.simulator.model.impl.ActiveStateImpl <em>Active State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.triad.school.gamma.simulator.model.impl.ActiveStateImpl
	 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getActiveState()
	 * @generated
	 */
	int ACTIVE_STATE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Containing Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE__CONTAINING_REGION = 1;

	/**
	 * The number of structural features of the '<em>Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Active State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.triad.school.gamma.simulator.model.impl.ActiveStateContainerImpl <em>Active State Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.triad.school.gamma.simulator.model.impl.ActiveStateContainerImpl
	 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getActiveStateContainer()
	 * @generated
	 */
	int ACTIVE_STATE_CONTAINER = 2;

	/**
	 * Returns the meta object for class '{@link com.triad.school.gamma.simulator.model.ActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active State</em>'.
	 * @see com.triad.school.gamma.simulator.model.ActiveState
	 * @generated
	 */
	EClass getActiveState();

	/**
	 * Returns the meta object for the reference '{@link com.triad.school.gamma.simulator.model.ActiveState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see com.triad.school.gamma.simulator.model.ActiveState#getState()
	 * @see #getActiveState()
	 * @generated
	 */
	EReference getActiveState_State();

	/**
	 * Returns the meta object for the reference '{@link com.triad.school.gamma.simulator.model.ActiveState#getContainingRegion <em>Containing Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Region</em>'.
	 * @see com.triad.school.gamma.simulator.model.ActiveState#getContainingRegion()
	 * @see #getActiveState()
	 * @generated
	 */
	EReference getActiveState_ContainingRegion();

	/**
	 * The meta object id for the '{@link com.triad.school.gamma.simulator.model.impl.EventQueueImpl <em>Event Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.triad.school.gamma.simulator.model.impl.EventQueueImpl
	 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getEventQueue()
	 * @generated
	 */
	int EVENT_QUEUE = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_QUEUE__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Event Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_QUEUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_QUEUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Activestates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_CONTAINER__ACTIVESTATES = 0;

	/**
	 * The number of structural features of the '<em>Active State Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Active State Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_STATE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.triad.school.gamma.simulator.model.ActiveStateContainer <em>Active State Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active State Container</em>'.
	 * @see com.triad.school.gamma.simulator.model.ActiveStateContainer
	 * @generated
	 */
	EClass getActiveStateContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.triad.school.gamma.simulator.model.ActiveStateContainer#getActivestates <em>Activestates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activestates</em>'.
	 * @see com.triad.school.gamma.simulator.model.ActiveStateContainer#getActivestates()
	 * @see #getActiveStateContainer()
	 * @generated
	 */
	EReference getActiveStateContainer_Activestates();

	/**
	 * Returns the meta object for class '{@link com.triad.school.gamma.simulator.model.EventQueue <em>Event Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Queue</em>'.
	 * @see com.triad.school.gamma.simulator.model.EventQueue
	 * @generated
	 */
	EClass getEventQueue();

	/**
	 * Returns the meta object for the reference list '{@link com.triad.school.gamma.simulator.model.EventQueue#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see com.triad.school.gamma.simulator.model.EventQueue#getEvents()
	 * @see #getEventQueue()
	 * @generated
	 */
	EReference getEventQueue_Events();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.triad.school.gamma.simulator.model.impl.ActiveStateImpl <em>Active State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.triad.school.gamma.simulator.model.impl.ActiveStateImpl
		 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getActiveState()
		 * @generated
		 */
		EClass ACTIVE_STATE = eINSTANCE.getActiveState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_STATE__STATE = eINSTANCE.getActiveState_State();

		/**
		 * The meta object literal for the '<em><b>Containing Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_STATE__CONTAINING_REGION = eINSTANCE.getActiveState_ContainingRegion();

		/**
		 * The meta object literal for the '{@link com.triad.school.gamma.simulator.model.impl.ActiveStateContainerImpl <em>Active State Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.triad.school.gamma.simulator.model.impl.ActiveStateContainerImpl
		 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getActiveStateContainer()
		 * @generated
		 */
		EClass ACTIVE_STATE_CONTAINER = eINSTANCE.getActiveStateContainer();

		/**
		 * The meta object literal for the '<em><b>Activestates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_STATE_CONTAINER__ACTIVESTATES = eINSTANCE.getActiveStateContainer_Activestates();

		/**
		 * The meta object literal for the '{@link com.triad.school.gamma.simulator.model.impl.EventQueueImpl <em>Event Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.triad.school.gamma.simulator.model.impl.EventQueueImpl
		 * @see com.triad.school.gamma.simulator.model.impl.ModelPackageImpl#getEventQueue()
		 * @generated
		 */
		EClass EVENT_QUEUE = eINSTANCE.getEventQueue();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_QUEUE__EVENTS = eINSTANCE.getEventQueue_Events();

	}

} //ModelPackage