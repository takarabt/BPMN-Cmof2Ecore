/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.EndPoint;
import BPMN20.Interface;
import BPMN20.ParticipantMultiplicity;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link BPMN20.Participant}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParticipantValidator {
	boolean validate();

	boolean validateName(Object value);
	boolean validateInterfaceRefs(EList<Interface> value);
	boolean validateParticipantMultiplicity(ParticipantMultiplicity value);
	boolean validateEndPointRefs(EList<EndPoint> value);
	boolean validateProcessRef(BPMN20.Process value);
}
