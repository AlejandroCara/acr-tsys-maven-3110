package com.alejandro.ejercicio2_maven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	private JLabel hasPulsado;
	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	
	public Ventana() {
		this.setSize(400, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		contentPane = new JPanel();
        contentPane.setLayout(null);
		this.setContentPane(contentPane);
		
		hasPulsado = new JLabel("");
		hasPulsado.setSize(250, 30);
		hasPulsado.setLocation(68, 85);
		contentPane.add(hasPulsado);
		
		btn1 = new JButton("Boton 1");
		btn1.setSize(90, 25);
		btn1.setLocation(68, 11);
		contentPane.add(btn1);
		
		btn2 = new JButton("Boton 2");
		btn2.setSize(90, 25);
		btn2.setLocation(219, 11);
		contentPane.add(btn2);

		btn1.addActionListener(al);
		btn2.addActionListener(al);
	}
	
	private ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			hasPulsado.setText("Has pulsado: " + ((JButton)e.getSource()).getText());
			
		}
	};
	
}
