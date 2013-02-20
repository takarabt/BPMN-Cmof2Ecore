/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.impl;

import BPMN20.BPMN20Package;
import BPMN20.Definitions;
import BPMN20.Extension;
import BPMN20.Import;
import BPMN20.Relationship;
import BPMN20.RootElement;

import BPMNDI.BPMNDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link BPMN20.impl.DefinitionsImpl#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends BaseElementImpl implements Definitions {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Object TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected Object targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";

	/**
	 * The cached value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected String typeLanguage = TYPE_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getRootElements() <em>Root Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RootElement> rootElements;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMNDiagram> diagrams;

	/**
	 * The default value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPORTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected Object exporter = EXPORTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPORTER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected Object exporterVersion = EXPORTER_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMN20Package.eINSTANCE.getDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(Object newTargetNamespace) {
		Object oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeLanguage() {
		return typeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLanguage(String newTypeLanguage) {
		String oldTypeLanguage = typeLanguage;
		typeLanguage = newTypeLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, typeLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, BPMN20Package.DEFINITIONS__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<Extension>(Extension.class, this, BPMN20Package.DEFINITIONS__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, BPMN20Package.DEFINITIONS__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootElement> getRootElements() {
		if (rootElements == null) {
			rootElements = new EObjectContainmentEList<RootElement>(RootElement.class, this, BPMN20Package.DEFINITIONS__ROOT_ELEMENTS);
		}
		return rootElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMNDiagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new EObjectContainmentEList<BPMNDiagram>(BPMNDiagram.class, this, BPMN20Package.DEFINITIONS__DIAGRAMS);
		}
		return diagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExporter() {
		return exporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporter(Object newExporter) {
		Object oldExporter = exporter;
		exporter = newExporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__EXPORTER, oldExporter, exporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExporterVersion() {
		return exporterVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExporterVersion(Object newExporterVersion) {
		Object oldExporterVersion = exporterVersion;
		exporterVersion = newExporterVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMN20Package.DEFINITIONS__EXPORTER_VERSION, oldExporterVersion, exporterVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMN20Package.DEFINITIONS__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case BPMN20Package.DEFINITIONS__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case BPMN20Package.DEFINITIONS__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case BPMN20Package.DEFINITIONS__ROOT_ELEMENTS:
				return ((InternalEList<?>)getRootElements()).basicRemove(otherEnd, msgs);
			case BPMN20Package.DEFINITIONS__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
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
			case BPMN20Package.DEFINITIONS__NAME:
				return getName();
			case BPMN20Package.DEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case BPMN20Package.DEFINITIONS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case BPMN20Package.DEFINITIONS__TYPE_LANGUAGE:
				return getTypeLanguage();
			case BPMN20Package.DEFINITIONS__IMPORTS:
				return getImports();
			case BPMN20Package.DEFINITIONS__EXTENSIONS:
				return getExtensions();
			case BPMN20Package.DEFINITIONS__RELATIONSHIPS:
				return getRelationships();
			case BPMN20Package.DEFINITIONS__ROOT_ELEMENTS:
				return getRootElements();
			case BPMN20Package.DEFINITIONS__DIAGRAMS:
				return getDiagrams();
			case BPMN20Package.DEFINITIONS__EXPORTER:
				return getExporter();
			case BPMN20Package.DEFINITIONS__EXPORTER_VERSION:
				return getExporterVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMN20Package.DEFINITIONS__NAME:
				setName(newValue);
				return;
			case BPMN20Package.DEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(newValue);
				return;
			case BPMN20Package.DEFINITIONS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case BPMN20Package.DEFINITIONS__TYPE_LANGUAGE:
				setTypeLanguage((String)newValue);
				return;
			case BPMN20Package.DEFINITIONS__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case BPMN20Package.DEFINITIONS__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case BPMN20Package.DEFINITIONS__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case BPMN20Package.DEFINITIONS__ROOT_ELEMENTS:
				getRootElements().clear();
				getRootElements().addAll((Collection<? extends RootElement>)newValue);
				return;
			case BPMN20Package.DEFINITIONS__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends BPMNDiagram>)newValue);
				return;
			case BPMN20Package.DEFINITIONS__EXPORTER:
				setExporter(newValue);
				return;
			case BPMN20Package.DEFINITIONS__EXPORTER_VERSION:
				setExporterVersion(newValue);
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
			case BPMN20Package.DEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMN20Package.DEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case BPMN20Package.DEFINITIONS__EXPRESSION_LANGUAGE:
				setExpressionLanguage(EXPRESSION_LANGUAGE_EDEFAULT);
				return;
			case BPMN20Package.DEFINITIONS__TYPE_LANGUAGE:
				setTypeLanguage(TYPE_LANGUAGE_EDEFAULT);
				return;
			case BPMN20Package.DEFINITIONS__IMPORTS:
				getImports().clear();
				return;
			case BPMN20Package.DEFINITIONS__EXTENSIONS:
				getExtensions().clear();
				return;
			case BPMN20Package.DEFINITIONS__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case BPMN20Package.DEFINITIONS__ROOT_ELEMENTS:
				getRootElements().clear();
				return;
			case BPMN20Package.DEFINITIONS__DIAGRAMS:
				getDiagrams().clear();
				return;
			case BPMN20Package.DEFINITIONS__EXPORTER:
				setExporter(EXPORTER_EDEFAULT);
				return;
			case BPMN20Package.DEFINITIONS__EXPORTER_VERSION:
				setExporterVersion(EXPORTER_VERSION_EDEFAULT);
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
			case BPMN20Package.DEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMN20Package.DEFINITIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case BPMN20Package.DEFINITIONS__EXPRESSION_LANGUAGE:
				return EXPRESSION_LANGUAGE_EDEFAULT == null ? expressionLanguage != null : !EXPRESSION_LANGUAGE_EDEFAULT.equals(expressionLanguage);
			case BPMN20Package.DEFINITIONS__TYPE_LANGUAGE:
				return TYPE_LANGUAGE_EDEFAULT == null ? typeLanguage != null : !TYPE_LANGUAGE_EDEFAULT.equals(typeLanguage);
			case BPMN20Package.DEFINITIONS__IMPORTS:
				return imports != null && !imports.isEmpty();
			case BPMN20Package.DEFINITIONS__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case BPMN20Package.DEFINITIONS__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case BPMN20Package.DEFINITIONS__ROOT_ELEMENTS:
				return rootElements != null && !rootElements.isEmpty();
			case BPMN20Package.DEFINITIONS__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case BPMN20Package.DEFINITIONS__EXPORTER:
				return EXPORTER_EDEFAULT == null ? exporter != null : !EXPORTER_EDEFAULT.equals(exporter);
			case BPMN20Package.DEFINITIONS__EXPORTER_VERSION:
				return EXPORTER_VERSION_EDEFAULT == null ? exporterVersion != null : !EXPORTER_VERSION_EDEFAULT.equals(exporterVersion);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", expressionLanguage: ");
		result.append(expressionLanguage);
		result.append(", typeLanguage: ");
		result.append(typeLanguage);
		result.append(", exporter: ");
		result.append(exporter);
		result.append(", exporterVersion: ");
		result.append(exporterVersion);
		result.append(')');
		return result.toString();
	}

} //DefinitionsImpl
