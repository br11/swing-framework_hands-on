package br.atech.workshop.duplicateCode.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import br.atech.workshop.duplicateCode.app.App;
import br.atech.workshop.duplicateCode.app.AppException;

/**
 * Implementação inicial.
 * 
 * @author marcio
 * 
 */
public class Gui1 extends AbstractGui {

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
	public Gui1(App app) {
		this.app = app;

		namelbl = addContent(new JLabel("Name:"));
		namefield = addContent(new JTextField());
		resultlbl = addContent(new JLabel("Result:"));
		resultfield = addContent(new JLabel(""));

		btn1 = addAction(new JButton("Button 1"));
		btn2 = addAction(new JButton("Button 2"));
		btn3 = addAction(new JButton("Button 3"));

		addNamefieldListeners();
		addBtn1Listeners();
		addBtn2Listeners();
		addBtn3Listeners();
	}

	/**
	 * 
	 */
	protected void addBtn1Listeners() {
		btn1.addActionListener(new ActionListener() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * java.awt.event.ActionListener#actionPerformed(java.awt.event.
			 * ActionEvent)
			 */
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					resultfield.setText("");
					reset();
					resultfield.setText(app.feature1(namefield.getText()));
				} catch (AppException e) {
					e.printStackTrace();
					print("System Error");
				}
			}
		});
	}

	//TODO Exercício 1.1

	//TODO Exercício 1.2

	/**
	 * 
	 */
	protected void addNamefieldListeners() {
		namefield.getDocument().addDocumentListener(new DocumentListener() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * javax.swing.event.DocumentListener#removeUpdate(javax.swing.event
			 * .DocumentEvent)
			 */
			@Override
			public void removeUpdate(DocumentEvent e) {
				onChange(e);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * javax.swing.event.DocumentListener#insertUpdate(javax.swing.event
			 * .DocumentEvent)
			 */
			@Override
			public void insertUpdate(DocumentEvent e) {
				onChange(e);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * javax.swing.event.DocumentListener#changedUpdate(javax.swing.
			 * event.DocumentEvent)
			 */
			@Override
			public void changedUpdate(DocumentEvent e) {
				onChange(e);
			}

			//TODO Exercício 1.3
		});
	}
}