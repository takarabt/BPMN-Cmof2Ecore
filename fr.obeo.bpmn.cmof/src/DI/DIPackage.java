/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DI;

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
 * @see DI.DIFactory
 * @model kind="package"
 * @generated
 */
public interface DIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/DD/20100524/DI-XMI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "di";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DIPackage eINSTANCE = DI.impl.DIPackageImpl.init();

	/**
	 * The meta object id for the '{@link DI.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.DiagramElementImpl
	 * @see DI.impl.DIPackageImpl#getDiagramElement()
	 * @generated
	 */
	int DIAGRAM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OWNING_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OWNING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__OWNED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT__STYLE = 4;

	/**
	 * The number of structural features of the '<em>Diagram Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link DI.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.DiagramImpl
	 * @see DI.impl.DIPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__RESOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Owned Style</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ROOT_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link DI.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.StyleImpl
	 * @see DI.impl.DIPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 2;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link DI.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.NodeImpl
	 * @see DI.impl.DIPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNING_DIAGRAM = DIAGRAM_ELEMENT__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = DIAGRAM_ELEMENT__STYLE;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DI.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.EdgeImpl
	 * @see DI.impl.DIPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__OWNING_DIAGRAM = DIAGRAM_ELEMENT__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__OWNING_ELEMENT = DIAGRAM_ELEMENT__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__OWNED_ELEMENT = DIAGRAM_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__MODEL_ELEMENT = DIAGRAM_ELEMENT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__STYLE = DIAGRAM_ELEMENT__STYLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SOURCE = DIAGRAM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TARGET = DIAGRAM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__WAYPOINT = DIAGRAM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DIAGRAM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link DI.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.ShapeImpl
	 * @see DI.impl.DIPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OWNING_DIAGRAM = NODE__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OWNING_ELEMENT = NODE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OWNED_ELEMENT = NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__MODEL_ELEMENT = NODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__STYLE = NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BOUNDS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DI.impl.LabeledEdgeImpl <em>Labeled Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.LabeledEdgeImpl
	 * @see DI.impl.DIPackageImpl#getLabeledEdge()
	 * @generated
	 */
	int LABELED_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__OWNING_DIAGRAM = EDGE__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__OWNING_ELEMENT = EDGE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__OWNED_ELEMENT = EDGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__MODEL_ELEMENT = EDGE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__STYLE = EDGE__STYLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__SOURCE = EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__TARGET = EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Waypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__WAYPOINT = EDGE__WAYPOINT;

	/**
	 * The feature id for the '<em><b>Owned Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE__OWNED_LABEL = EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_EDGE_FEATURE_COUNT = EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DI.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.LabelImpl
	 * @see DI.impl.DIPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 7;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OWNING_DIAGRAM = NODE__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OWNING_ELEMENT = NODE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OWNED_ELEMENT = NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MODEL_ELEMENT = NODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE = NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BOUNDS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DI.impl.LabeledShapeImpl <em>Labeled Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.LabeledShapeImpl
	 * @see DI.impl.DIPackageImpl#getLabeledShape()
	 * @generated
	 */
	int LABELED_SHAPE = 8;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__OWNING_DIAGRAM = SHAPE__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__OWNING_ELEMENT = SHAPE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__OWNED_ELEMENT = SHAPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__MODEL_ELEMENT = SHAPE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__STYLE = SHAPE__STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__BOUNDS = SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Owned Label</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE__OWNED_LABEL = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DI.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DI.impl.PlaneImpl
	 * @see DI.impl.DIPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 9;

	/**
	 * The feature id for the '<em><b>Owning Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__OWNING_DIAGRAM = NODE__OWNING_DIAGRAM;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__OWNING_ELEMENT = NODE__OWNING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__OWNED_ELEMENT = NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__MODEL_ELEMENT = NODE__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__STYLE = NODE__STYLE;

	/**
	 * The feature id for the '<em><b>Plane Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__PLANE_ELEMENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link DI.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Element</em>'.
	 * @see DI.DiagramElement
	 * @generated
	 */
	EClass getDiagramElement();

	/**
	 * Returns the meta object for the reference '{@link DI.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Diagram</em>'.
	 * @see DI.DiagramElement#getOwningDiagram()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OwningDiagram();

	/**
	 * Returns the meta object for the reference '{@link DI.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Element</em>'.
	 * @see DI.DiagramElement#getOwningElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OwningElement();

	/**
	 * Returns the meta object for the reference list '{@link DI.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see DI.DiagramElement#getOwnedElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link DI.DiagramElement#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see DI.DiagramElement#getModelElement()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_ModelElement();

	/**
	 * Returns the meta object for the reference '{@link DI.DiagramElement#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Style</em>'.
	 * @see DI.DiagramElement#getStyle()
	 * @see #getDiagramElement()
	 * @generated
	 */
	EReference getDiagramElement_Style();

	/**
	 * Returns the meta object for class '{@link DI.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see DI.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link DI.Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DI.Diagram#getName()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link DI.Diagram#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see DI.Diagram#getDocumentation()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link DI.Diagram#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see DI.Diagram#getResolution()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Resolution();

	/**
	 * Returns the meta object for the reference list '{@link DI.Diagram#getOwnedStyle <em>Owned Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Style</em>'.
	 * @see DI.Diagram#getOwnedStyle()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedStyle();

	/**
	 * Returns the meta object for the reference '{@link DI.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Element</em>'.
	 * @see DI.Diagram#getRootElement()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_RootElement();

	/**
	 * Returns the meta object for class '{@link DI.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see DI.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link DI.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DI.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link DI.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see DI.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link DI.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DI.Edge#getSource()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link DI.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see DI.Edge#getTarget()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link DI.Edge#getWaypoint <em>Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waypoint</em>'.
	 * @see DI.Edge#getWaypoint()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Waypoint();

	/**
	 * Returns the meta object for class '{@link DI.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see DI.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the containment reference '{@link DI.Shape#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see DI.Shape#getBounds()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Bounds();

	/**
	 * Returns the meta object for class '{@link DI.LabeledEdge <em>Labeled Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Edge</em>'.
	 * @see DI.LabeledEdge
	 * @generated
	 */
	EClass getLabeledEdge();

	/**
	 * Returns the meta object for the reference list '{@link DI.LabeledEdge#getOwnedLabel <em>Owned Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Label</em>'.
	 * @see DI.LabeledEdge#getOwnedLabel()
	 * @see #getLabeledEdge()
	 * @generated
	 */
	EReference getLabeledEdge_OwnedLabel();

	/**
	 * Returns the meta object for class '{@link DI.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see DI.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the containment reference '{@link DI.Label#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see DI.Label#getBounds()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Bounds();

	/**
	 * Returns the meta object for class '{@link DI.LabeledShape <em>Labeled Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Shape</em>'.
	 * @see DI.LabeledShape
	 * @generated
	 */
	EClass getLabeledShape();

	/**
	 * Returns the meta object for the reference list '{@link DI.LabeledShape#getOwnedLabel <em>Owned Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Label</em>'.
	 * @see DI.LabeledShape#getOwnedLabel()
	 * @see #getLabeledShape()
	 * @generated
	 */
	EReference getLabeledShape_OwnedLabel();

	/**
	 * Returns the meta object for class '{@link DI.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see DI.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the containment reference list '{@link DI.Plane#getPlaneElement <em>Plane Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plane Element</em>'.
	 * @see DI.Plane#getPlaneElement()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_PlaneElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DIFactory getDIFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link DI.impl.DiagramElementImpl <em>Diagram Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.DiagramElementImpl
		 * @see DI.impl.DIPackageImpl#getDiagramElement()
		 * @generated
		 */
		EClass DIAGRAM_ELEMENT = eINSTANCE.getDiagramElement();

		/**
		 * The meta object literal for the '<em><b>Owning Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OWNING_DIAGRAM = eINSTANCE.getDiagramElement_OwningDiagram();

		/**
		 * The meta object literal for the '<em><b>Owning Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OWNING_ELEMENT = eINSTANCE.getDiagramElement_OwningElement();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__OWNED_ELEMENT = eINSTANCE.getDiagramElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__MODEL_ELEMENT = eINSTANCE.getDiagramElement_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_ELEMENT__STYLE = eINSTANCE.getDiagramElement_Style();

		/**
		 * The meta object literal for the '{@link DI.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.DiagramImpl
		 * @see DI.impl.DIPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__DOCUMENTATION = eINSTANCE.getDiagram_Documentation();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__RESOLUTION = eINSTANCE.getDiagram_Resolution();

		/**
		 * The meta object literal for the '<em><b>Owned Style</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_STYLE = eINSTANCE.getDiagram_OwnedStyle();

		/**
		 * The meta object literal for the '<em><b>Root Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ROOT_ELEMENT = eINSTANCE.getDiagram_RootElement();

		/**
		 * The meta object literal for the '{@link DI.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.StyleImpl
		 * @see DI.impl.DIPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '{@link DI.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.NodeImpl
		 * @see DI.impl.DIPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link DI.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.EdgeImpl
		 * @see DI.impl.DIPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Waypoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__WAYPOINT = eINSTANCE.getEdge_Waypoint();

		/**
		 * The meta object literal for the '{@link DI.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.ShapeImpl
		 * @see DI.impl.DIPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__BOUNDS = eINSTANCE.getShape_Bounds();

		/**
		 * The meta object literal for the '{@link DI.impl.LabeledEdgeImpl <em>Labeled Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.LabeledEdgeImpl
		 * @see DI.impl.DIPackageImpl#getLabeledEdge()
		 * @generated
		 */
		EClass LABELED_EDGE = eINSTANCE.getLabeledEdge();

		/**
		 * The meta object literal for the '<em><b>Owned Label</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_EDGE__OWNED_LABEL = eINSTANCE.getLabeledEdge_OwnedLabel();

		/**
		 * The meta object literal for the '{@link DI.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.LabelImpl
		 * @see DI.impl.DIPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__BOUNDS = eINSTANCE.getLabel_Bounds();

		/**
		 * The meta object literal for the '{@link DI.impl.LabeledShapeImpl <em>Labeled Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.LabeledShapeImpl
		 * @see DI.impl.DIPackageImpl#getLabeledShape()
		 * @generated
		 */
		EClass LABELED_SHAPE = eINSTANCE.getLabeledShape();

		/**
		 * The meta object literal for the '<em><b>Owned Label</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_SHAPE__OWNED_LABEL = eINSTANCE.getLabeledShape_OwnedLabel();

		/**
		 * The meta object literal for the '{@link DI.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DI.impl.PlaneImpl
		 * @see DI.impl.DIPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>Plane Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__PLANE_ELEMENT = eINSTANCE.getPlane_PlaneElement();

	}

} //DIPackage
