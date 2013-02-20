/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.FlowElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link BPMN20.CategoryValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CategoryValueValidator {
	boolean validate();

	boolean validateValue(Object value);
	boolean validateCategorizedFlowElements(EList<FlowElement> value);
}