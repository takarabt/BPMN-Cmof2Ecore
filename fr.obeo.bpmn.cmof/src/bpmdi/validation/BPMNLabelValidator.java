/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmdi.validation;

import bpmdi.BPMNLabelStyle;

/**
 * A sample validator interface for {@link bpmdi.BPMNLabel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BPMNLabelValidator {
	boolean validate();

	boolean validateLabelStyle(BPMNLabelStyle value);
}