/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.CorrelationKey;
import bpmn2.MessageFlow;
import bpmn2.Participant;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn2.ConversationNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConversationNodeValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateParticipantRefs(EList<Participant> value);
	boolean validateMessageFlowRefs(EList<MessageFlow> value);
	boolean validateCorrelationKeys(EList<CorrelationKey> value);
}
