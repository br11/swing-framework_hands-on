package br.atech.workshop.duplicateCode.dry;

/**
 * Tela com comportamento mais especializado. Programação do tipo
 * "Crianças, não tentem fazer isso em casa".
 * 
 * @author marcio
 * 
 */
public class AdvancedGui extends ExtendedGui {

	/**
	 * 
	 */
	public AdvancedGui() {
		//TODO Exercício 7.3
		setActionListener(new ExtendedEventListener<>(this,
				new ));
	}

	/**
	 * 
	 */
	protected void abort() {
		//TODO Exercício 7.4
		throw new ;
	}
}