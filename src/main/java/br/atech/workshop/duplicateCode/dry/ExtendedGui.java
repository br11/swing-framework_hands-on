package br.atech.workshop.duplicateCode.dry;

import javax.swing.JOptionPane;

/**
 * Tela com comportamento mais especializado.
 * 
 * @author marcio
 * 
 */
public class ExtendedGui extends ExtensibleGui {

	/**
	 * 
	 */
	public ExtendedGui() {
		setActionListener(new ExtendedEventListener<>(this,
				new ExceptionHandler(this)));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.atech.workshop.duplicateCode.dry.ExtensibleGui#afterHide()
	 */
	@Override
	protected void afterHide() {
		super.afterHide();
		//TODO Exercício 6.2
	}

	/**
	 * 
	 * @param message
	 * @return
	 */
	//TODO Exercício 6.3
	protected boolean confirm() {
		return JOptionPane.showConfirmDialog(getFrame(), message,
				"Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
	}
}