package com.alejandro.ejercicio7_maven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JLabel labelinEuros;
	private JLabel labelOutPtas;
	private JLabel labelOutEuros;
	private JLabel labelInPtas;
	private JTextField esurosInput;
	private JTextField ptasOutput;
	private JTextField ptasInput;
	private JTextField eurosOutput;
	private JButton eurToptas;
	private JButton ptasToeur;

	public Ventana() {
		this.setSize(440, 253);
		this.setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		this.setContentPane(contentPane);

		labelinEuros = new JLabel("Euros: ");
		labelinEuros.setSize(75, 28);
		labelinEuros.setLocation(52, 22);
		contentPane.add(labelinEuros);

		labelOutPtas = new JLabel("Pesetas: ");
		labelOutPtas.setSize(75, 28);
		labelOutPtas.setLocation(52, 112);
		contentPane.add(labelOutPtas);

		labelOutEuros = new JLabel("Euros: ");
		labelOutEuros.setSize(80, 28);
		labelOutEuros.setLocation(226, 112);
		contentPane.add(labelOutEuros);

		labelInPtas = new JLabel("Pesetas: ");
		labelInPtas.setSize(75, 28);
		labelInPtas.setLocation(232, 22);
		contentPane.add(labelInPtas);

		esurosInput = new JTextField();
		esurosInput.setSize(80, 28);
		esurosInput.setLocation(129, 22);
		contentPane.add(esurosInput);

		ptasOutput = new JTextField();
		ptasOutput.setSize(80, 28);
		ptasOutput.setLocation(304, 22);
		ptasOutput.setEnabled(false);
		ptasOutput.setDisabledTextColor(Color.black);
		contentPane.add(ptasOutput);

		eurToptas = new JButton("Calcular pesetas");
		eurToptas.setSize(133, 28);
		eurToptas.setLocation(62, 61);
		contentPane.add(eurToptas);

		ptasToeur = new JButton("Calcular euros");
		ptasToeur.setSize(133, 28);
		ptasToeur.setLocation(62, 158);
		contentPane.add(ptasToeur);

		ptasInput = new JTextField();
		ptasInput.setSize(75, 28);
		ptasInput.setLocation(129, 112);
		contentPane.add(ptasInput);

		eurosOutput = new JTextField();
		eurosOutput.setSize(80, 28);
		eurosOutput.setLocation(304, 112);
		eurosOutput.setEnabled(false);
		eurosOutput.setDisabledTextColor(Color.black);
		contentPane.add(eurosOutput);

		eurToptas.addActionListener(calcularPtas);
		ptasToeur.addActionListener(calcularEuros);
		this.setVisible(true);
	}

	ActionListener calcularEuros = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			double ptas = 0;
			double eur = 0;
			DecimalFormat df = new DecimalFormat("0.00"); // Decimal format para limitar a 2 decimales

			try {
				ptas = Double.parseDouble(ptasInput.getText());
				eur = ptas / 166.386;

				eurosOutput.setText(String.valueOf(df.format(eur)) + "€");
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	};

	ActionListener calcularPtas = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			double ptas = 0;
			double eur = 0;
			DecimalFormat df = new DecimalFormat("0.00"); // Decimal format para limitar a 2 decimales

			try {
				eur = Double.parseDouble(esurosInput.getText());
				ptas = eur * 166.386;

				ptasOutput.setText(String.valueOf(df.format(ptas)) + "pts");
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	};
}
