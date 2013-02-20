/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.ExtensionAttributeDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link BPMN20.ExtensionDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExtensionDefinitionValidator {
	boolean validate();

	boolean validateName(Object value);
	boolean validateExtensionAttributeDefinitions(EList<ExtensionAttributeDefinition> value);
}