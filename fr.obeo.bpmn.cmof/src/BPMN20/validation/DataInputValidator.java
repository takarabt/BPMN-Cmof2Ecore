/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.InputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link BPMN20.DataInput}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataInputValidator {
	boolean validate();

	boolean validateName(Object value);
	boolean validateIsCollection(boolean value);
	boolean validateInputSetWithOptional(EList<InputSet> value);
	boolean validateInputSetWithWhileExecuting(EList<InputSet> value);
	boolean validateInputSetRefs(EList<InputSet> value);
}
