/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.OutputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn2.DataOutput}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataOutputValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateIsCollection(boolean value);
	boolean validateOutputSetWithOptional(EList<OutputSet> value);
	boolean validateOutputSetWithWhileExecuting(EList<OutputSet> value);
	boolean validateOutputSetRefs(EList<OutputSet> value);
}
