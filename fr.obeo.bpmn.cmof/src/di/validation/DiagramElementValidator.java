/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package di.validation;

import di.Diagram;
import di.DiagramElement;
import di.Style;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * A sample validator interface for {@link di.DiagramElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DiagramElementValidator {
	boolean validate();

	boolean validateOwningDiagram(Diagram value);
	boolean validateOwningElement(DiagramElement value);
	boolean validateOwnedElement(EList<DiagramElement> value);
	boolean validateModelElement(EObject value);
	boolean validateStyle(Style value);
}
