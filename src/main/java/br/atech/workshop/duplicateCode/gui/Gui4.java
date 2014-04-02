package br.atech.workshop.duplicateCode.gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.atech.workshop.duplicateCode.app.App;
import br.atech.workshop.duplicateCode.app.AppException;
import br.atech.workshop.duplicateCode.dry.StandardGui;

/**
 * Agora temos um Framework que prima pela simplicidade. Nos permite abstrair
 * diversos aspectos técnicos, dentre eles: tratamento das exceções, anonymous
 * inner classes, detalhes da API Swing. Com isso ganhamos produtividade na
 * codificação.
 * 
 * @author marcio
 * 
 */
//TODO Exercício 4.3
public class Gui4 {

	final JLabel namelbl;
	final JTextField namefield;
	final JLabel resultlbl;
	final JLabel resultfield;

	final JButton btn1;
	final JButton btn2;
	final JButton btn3;

	private final App app;

	/**
	 * 
	 * @param app
	 */
	public Gui4(App app) {
		this.app = app;

		namelbl = addContent(new JLabel("Name:"));
		namefield = addContent(new JTextField());
		resultlbl = addContent(new JLabel("Result:"));
		resultfield = addContent(new JLabel(""));

		btn1 = addAction(new JButton("Button 1"));
		btn2 = addAction(new JButton("Button 2"));
		btn3 = addAction(new JButton("Button 3"));
	}

	/**
	 * 
	 * @param event
	 * @throws AppException
	 */
	protected void btn1OnClick(ActionEvent event) throws AppException {
		resultfield.setText(app.feature1(namefield.getText()));
	}

	//TODO Exercício 4.4
	
	//TODO Exercício 4.5
	
	//TODO Exercício 4.6
	
}