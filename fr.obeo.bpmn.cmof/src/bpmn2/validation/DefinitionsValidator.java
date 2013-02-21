/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmdi.BPMNDiagram;

import bpmn2.Extension;
import bpmn2.Import;
import bpmn2.Relationship;
import bpmn2.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn2.Definitions}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DefinitionsValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateTargetNamespace(String value);
	boolean validateExpressionLanguage(String value);
	boolean validateTypeLanguage(String value);
	boolean validateImports(EList<Import> value);
	boolean validateExtensions(EList<Extension> value);
	boolean validateRelationships(EList<Relationship> value);
	boolean validateRootElements(EList<RootElement> value);
	boolean validateDiagrams(EList<BPMNDiagram> value);
	boolean validateExporter(String value);
	boolean validateExporterVersion(String value);
}