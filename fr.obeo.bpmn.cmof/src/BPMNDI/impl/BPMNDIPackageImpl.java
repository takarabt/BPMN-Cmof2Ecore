/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMNDI.impl;

import BPMN20.BPMN20Package;

import BPMN20.impl.BPMN20PackageImpl;

import BPMNDI.BPMNDIFactory;
import BPMNDI.BPMNDIPackage;
import BPMNDI.BPMNDiagram;
import BPMNDI.BPMNEdge;
import BPMNDI.BPMNLabel;
import BPMNDI.BPMNLabelStyle;
import BPMNDI.BPMNPlane;
import BPMNDI.BPMNShape;
import BPMNDI.MessageVisibleKind;
import BPMNDI.ParticipantBandKind;

import DC.DCPackage;

import DC.impl.DCPackageImpl;

import DI.DIPackage;

import DI.impl.DIPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNDIPackageImpl extends EPackageImpl implements BPMNDIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnPlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnLabelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantBandKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageVisibleKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BPMNDI.BPMNDIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPMNDIPackageImpl() {
		super(eNS_URI, BPMNDIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BPMNDIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPMNDIPackage init() {
		if (isInited) return (BPMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(BPMNDIPackage.eNS_URI);

		// Obtain or create and register package
		BPMNDIPackageImpl theBPMNDIPackage = (BPMNDIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPMNDIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPMNDIPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BPMN20PackageImpl theBPMN20Package = (BPMN20PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BPMN20Package.eNS_URI) instanceof BPMN20PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BPMN20Package.eNS_URI) : BPMN20Package.eINSTANCE);
		DIPackageImpl theDIPackage = (DIPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI) : DIPackage.eINSTANCE);
		DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) : DCPackage.eINSTANCE);

		// Load packages
		theBPMN20Package.loadPackage();

		// Create package meta-data objects
		theBPMNDIPackage.createPackageContents();
		theDIPackage.createPackageContents();
		theDCPackage.createPackageContents();

		// Initialize created meta-data
		theBPMNDIPackage.initializePackageContents();
		theDIPackage.initializePackageContents();
		theDCPackage.initializePackageContents();

		// Fix loaded packages
		theBPMN20Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPMNDIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPMNDIPackage.eNS_URI, theBPMNDIPackage);
		return theBPMNDIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNPlane() {
		return bpmnPlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNPlane_BpmnElement() {
		return (EReference)bpmnPlaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNShape() {
		return bpmnShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNShape_BpmnElement() {
		return (EReference)bpmnShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNShape_IsHorizontal() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNShape_IsExpanded() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNShape_IsMarkerVisible() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNShape_Label() {
		return (EReference)bpmnShapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNShape_IsMessageVisible() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNShape_ParticipantBandKind() {
		return (EAttribute)bpmnShapeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNShape_ChoreographyActivityShape() {
		return (EReference)bpmnShapeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNLabel() {
		return bpmnLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNLabel_LabelStyle() {
		return (EReference)bpmnLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNLabelStyle() {
		return bpmnLabelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNLabelStyle_Font() {
		return (EReference)bpmnLabelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEdge() {
		return bpmnEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEdge_Label() {
		return (EReference)bpmnEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEdge_BpmnElement() {
		return (EReference)bpmnEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEdge_SourceElement() {
		return (EReference)bpmnEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEdge_TargetElement() {
		return (EReference)bpmnEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNEdge_MessageVisibleKind() {
		return (EAttribute)bpmnEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNDiagram() {
		return bpmnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDiagram_Plane() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNDiagram_LabelStyle() {
		return (EReference)bpmnDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantBandKind() {
		return participantBandKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageVisibleKind() {
		return messageVisibleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDIFactory getBPMNDIFactory() {
		return (BPMNDIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bpmnPlaneEClass = createEClass(BPMN_PLANE);
		createEReference(bpmnPlaneEClass, BPMN_PLANE__BPMN_ELEMENT);

		bpmnShapeEClass = createEClass(BPMN_SHAPE);
		createEReference(bpmnShapeEClass, BPMN_SHAPE__BPMN_ELEMENT);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_HORIZONTAL);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_EXPANDED);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MARKER_VISIBLE);
		createEReference(bpmnShapeEClass, BPMN_SHAPE__LABEL);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__IS_MESSAGE_VISIBLE);
		createEAttribute(bpmnShapeEClass, BPMN_SHAPE__PARTICIPANT_BAND_KIND);
		createEReference(bpmnShapeEClass, BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE);

		bpmnLabelEClass = createEClass(BPMN_LABEL);
		createEReference(bpmnLabelEClass, BPMN_LABEL__LABEL_STYLE);

		bpmnLabelStyleEClass = createEClass(BPMN_LABEL_STYLE);
		createEReference(bpmnLabelStyleEClass, BPMN_LABEL_STYLE__FONT);

		bpmnEdgeEClass = createEClass(BPMN_EDGE);
		createEReference(bpmnEdgeEClass, BPMN_EDGE__LABEL);
		createEReference(bpmnEdgeEClass, BPMN_EDGE__BPMN_ELEMENT);
		createEReference(bpmnEdgeEClass, BPMN_EDGE__SOURCE_ELEMENT);
		createEReference(bpmnEdgeEClass, BPMN_EDGE__TARGET_ELEMENT);
		createEAttribute(bpmnEdgeEClass, BPMN_EDGE__MESSAGE_VISIBLE_KIND);

		bpmnDiagramEClass = createEClass(BPMN_DIAGRAM);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__PLANE);
		createEReference(bpmnDiagramEClass, BPMN_DIAGRAM__LABEL_STYLE);

		// Create enums
		participantBandKindEEnum = createEEnum(PARTICIPANT_BAND_KIND);
		messageVisibleKindEEnum = createEEnum(MESSAGE_VISIBLE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DIPackage theDIPackage = (DIPackage)EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		BPMN20Package theBPMN20Package = (BPMN20Package)EPackage.Registry.INSTANCE.getEPackage(BPMN20Package.eNS_URI);
		DCPackage theDCPackage = (DCPackage)EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bpmnPlaneEClass.getESuperTypes().add(theDIPackage.getPlane());
		bpmnShapeEClass.getESuperTypes().add(theDIPackage.getLabeledShape());
		bpmnLabelEClass.getESuperTypes().add(theDIPackage.getLabel());
		bpmnLabelStyleEClass.getESuperTypes().add(theDIPackage.getStyle());
		bpmnEdgeEClass.getESuperTypes().add(theDIPackage.getLabeledEdge());
		bpmnDiagramEClass.getESuperTypes().add(theDIPackage.getDiagram());

		// Initialize classes and features; add operations and parameters
		initEClass(bpmnPlaneEClass, BPMNPlane.class, "BPMNPlane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNPlane_BpmnElement(), theBPMN20Package.getBaseElement(), null, "bpmnElement", null, 0, 1, BPMNPlane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bpmnShapeEClass, BPMNShape.class, "BPMNShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNShape_BpmnElement(), theBPMN20Package.getBaseElement(), null, "bpmnElement", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNShape_IsHorizontal(), ecorePackage.getEBoolean(), "isHorizontal", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNShape_IsExpanded(), ecorePackage.getEBoolean(), "isExpanded", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNShape_IsMarkerVisible(), ecorePackage.getEBoolean(), "isMarkerVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNShape_Label(), this.getBPMNLabel(), null, "label", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNShape_IsMessageVisible(), ecorePackage.getEBoolean(), "isMessageVisible", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNShape_ParticipantBandKind(), this.getParticipantBandKind(), "participantBandKind", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNShape_ChoreographyActivityShape(), this.getBPMNShape(), null, "choreographyActivityShape", null, 0, 1, BPMNShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bpmnLabelEClass, BPMNLabel.class, "BPMNLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNLabel_LabelStyle(), this.getBPMNLabelStyle(), null, "labelStyle", null, 0, 1, BPMNLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bpmnLabelStyleEClass, BPMNLabelStyle.class, "BPMNLabelStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNLabelStyle_Font(), theDCPackage.getFont(), null, "font", null, 1, 1, BPMNLabelStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bpmnEdgeEClass, BPMNEdge.class, "BPMNEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNEdge_Label(), this.getBPMNLabel(), null, "label", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNEdge_BpmnElement(), theBPMN20Package.getBaseElement(), null, "bpmnElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNEdge_SourceElement(), theDIPackage.getDiagramElement(), null, "sourceElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNEdge_TargetElement(), theDIPackage.getDiagramElement(), null, "targetElement", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBPMNEdge_MessageVisibleKind(), this.getMessageVisibleKind(), "messageVisibleKind", null, 0, 1, BPMNEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bpmnDiagramEClass, BPMNDiagram.class, "BPMNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMNDiagram_Plane(), this.getBPMNPlane(), null, "plane", null, 1, 1, BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBPMNDiagram_LabelStyle(), this.getBPMNLabelStyle(), null, "labelStyle", null, 0, -1, BPMNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(participantBandKindEEnum, ParticipantBandKind.class, "ParticipantBandKind");
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.TOP_NON_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.MIDDLE_NON_INITIATING);
		addEEnumLiteral(participantBandKindEEnum, ParticipantBandKind.BOTTOM_NON_INITIATING);

		initEEnum(messageVisibleKindEEnum, MessageVisibleKind.class, "MessageVisibleKind");
		addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.INITIATING);
		addEEnumLiteral(messageVisibleKindEEnum, MessageVisibleKind.NON_INITIATING);

		// Create resource
		createResource(eNS_URI);
	}

} //BPMNDIPackageImpl
