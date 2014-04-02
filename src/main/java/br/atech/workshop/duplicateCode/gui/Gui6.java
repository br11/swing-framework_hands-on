package br.atech.workshop.duplicateCode.gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.atech.workshop.duplicateCode.app.App;
import br.atech.workshop.duplicateCode.app.AppException;
import br.atech.workshop.duplicateCode.dry.ExtendedGui;

/**
 * 
 * Vemos que, embora seja possível extender o Framework, nem sempre esta é uma
 * tarefa simples devido às peculiaridades dos comportamentos das telas que
 * temos que desenvolver.
 * 
 * @author marcio
 * 
 */
public class Gui6 extends ExtendedGui {

	final JLabel namelbl;
	final JTextField namefield;
	final JLabel resultlbl;
	final JLabel resultfield;

	final JButton btn1;
	final JButton btn2;
	final JButton btn3;

	private final App app;

	//TODO Exercício 6.4

	/**
	 * 
	 * @param app
	 */
	public Gui6(App app) {
		this.app = app;

		namelbl = addContent(new JLabel("Name:"));
		namefield = addContent(new JTextField());
		resultlbl = addContent(new JLabel("Result:"));
		resultfield = addContent(new JLabel(""));

		btn1 = addAction(new JButton("Button 1"));
		btn2 = addAction(new JButton("Button 2"));
		btn3 = addAction(new JButton("Button 3"));

		//TODO Exercício 6.5
	}

	/**
	 * 
	 * @param event
	 * @throws AppException
	 */
	protected void btn1OnClick(ActionEvent event) throws AppException {
		resultfield.setText(app.feature1(namefield.getText()));
	}

	/**
	 * 
	 * @param event
	 * @throws AppException
	 */
	protected void btn2OnClick(ActionEvent event) throws AppException {
		resultfield.setText(app.feature2(namefield.getText()));
	}

	/**
	 * 
	 * @param event
	 * @throws AppException
	 */
	protected void btn3OnClick(ActionEvent event) throws AppException {
		resultfield.setText(app.feature3(namefield.getText()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.atech.workshop.bestpractices.gui.AbstractGui#reset()
	 */
	@Override
	public void reset() {
		resultfield.setText("");
		super.reset();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.atech.workshop.duplicateCode.dry.ExtensibleGui#beforeHide()
	 */
	@Override
	protected void beforeHide() {
		//TODO Exercício 6.6
		if (abort) {
			return;
		}

		super.beforeHide();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.atech.workshop.duplicateCode.dry.ExtensibleGui#onHide()
	 */
	@Override
	protected void onHide() {
		if (abort) {
			return;
		}

		super.onHide();

		//TODO Exercício 6.7
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.atech.workshop.duplicateCode.dry.ExtendedGui#afterHide()
	 */
	@Override
	protected void afterHide() {
		if (abort) {
			return;
		}

		super.afterHide();
	}
}