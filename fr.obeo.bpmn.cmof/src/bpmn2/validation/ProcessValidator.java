/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.Artifact;
import bpmn2.Auditing;
import bpmn2.Collaboration;
import bpmn2.CorrelationSubscription;
import bpmn2.Monitoring;
import bpmn2.ProcessType;
import bpmn2.Property;
import bpmn2.ResourceRole;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn2.Process}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessValidator {
	boolean validate();

	boolean validateProcessType(ProcessType value);
	boolean validateIsClosed(boolean value);
	boolean validateAuditing(Auditing value);
	boolean validateMonitoring(Monitoring value);
	boolean validateProperties(EList<Property> value);
	boolean validateSupports(EList<bpmn2.Process> value);
	boolean validateDefinitionalCollaborationRef(Collaboration value);
	boolean validateIsExecutable(boolean value);
	boolean validateResources(EList<ResourceRole> value);
	boolean validateArtifacts(EList<Artifact> value);
	boolean validateCorrelationSubscriptions(EList<CorrelationSubscription> value);
}
