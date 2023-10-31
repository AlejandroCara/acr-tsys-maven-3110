package com.alejandro.ejercicio6_maven;

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
		private JLabel labelAltura;
		private JLabel labelPeso;
		private JLabel imcLabel;
		private JTextField pesoInput;
		private JTextField alturaInput;
		private JTextField imcOutput;
		private JButton calcularBtn;
	
	public Ventana() {
		this.setSize(400, 171);
		this.setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		
		labelAltura = new JLabel("Altura (metros): ");
		labelAltura.setSize(92, 28);
		labelAltura.setLocation(35, 22);
		contentPane.add(labelAltura);
		
		labelPeso = new JLabel("Peso (kg): ");
		labelPeso.setSize(75, 28);
		labelPeso.setLocation(215, 22);
		contentPane.add(labelPeso);

		pesoInput = new JTextField();
		pesoInput.setSize(66, 28);
		pesoInput.setLocation(291, 22);
		contentPane.add(pesoInput);
		
		alturaInput = new JTextField();
		alturaInput.setSize(66, 28);
		alturaInput.setLocation(129, 22);
		contentPane.add(alturaInput);
		
		calcularBtn = new JButton("Calcular IMC");
		calcularBtn.setSize(108, 28);
		calcularBtn.setLocation(87, 61);
		contentPane.add(calcularBtn);
		
		imcLabel = new JLabel("IMC: ");
		imcLabel.setSize(39, 28);
		imcLabel.setLocation(225, 61);
		contentPane.add(imcLabel);
		
		imcOutput = new JTextField();
		imcOutput.setSize(66, 28);
		imcOutput.setLocation(291, 61); 
		imcOutput.setEnabled(false);
		imcOutput.setDisabledTextColor(Color.black);
		contentPane.add(imcOutput);
		
		calcularBtn.addActionListener(calcularIMC);
		this.setVisible(true);
	}
	
	ActionListener calcularIMC = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			double peso = 0;
			double altura = 0; 
			double imc = 0;
			DecimalFormat df = new DecimalFormat("0.00"); //Decimal format para limitar a 2 decimales
			
			try {
				peso = Double.parseDouble(pesoInput.getText());
				altura = Double.parseDouble(alturaInput.getText());
				imc = peso / (altura * altura);

				imcOutput.setText(String.valueOf(df.format(imc)));
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	};
}
