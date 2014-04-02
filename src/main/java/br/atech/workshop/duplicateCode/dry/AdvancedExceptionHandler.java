package br.atech.workshop.duplicateCode.dry;

import br.atech.workshop.duplicateCode.gui.Gui;

/**
 * Tratamento de exceção de toda a aplicação.
 * 
 * @author marcio
 * 
 */
public class AdvancedExceptionHandler extends ExceptionHandler {
	/**
	 * 
	 * @param gui
	 */
	public AdvancedExceptionHandler(Gui gui) {
		super(gui);
	}

	/**
	 * 
	 * @param t
	 */
	public void handle(Throwable t) {
		//TODO Exercício 7.2

		super.handle(t);
	}
}