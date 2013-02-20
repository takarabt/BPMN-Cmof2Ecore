/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.Message;
import BPMN20.Operation;

/**
 * A sample validator interface for {@link BPMN20.ReceiveTask}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ReceiveTaskValidator {
	boolean validate();

	boolean validateImplementation(Object value);
	boolean validateInstantiate(boolean value);
	boolean validateOperationRef(Operation value);
	boolean validateMessageRef(Message value);
}
