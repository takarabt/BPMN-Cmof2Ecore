/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN20.validation;

import BPMN20.DataOutput;
import BPMN20.DataOutputAssociation;
import BPMN20.EventDefinition;
import BPMN20.OutputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link BPMN20.CatchEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CatchEventValidator {
	boolean validate();

	boolean validateParallelMultiple(Object value);
	boolean validateOutputSet(OutputSet value);
	boolean validateEventDefinitionRefs(EList<EventDefinition> value);
	boolean validateDataOutputAssociation(EList<DataOutputAssociation> value);
	boolean validateDataOutputs(EList<DataOutput> value);
	boolean validateEventDefinitions(EList<EventDefinition> value);
}