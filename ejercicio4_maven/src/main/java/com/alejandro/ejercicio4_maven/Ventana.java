package com.alejandro.ejercicio4_maven;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame{
	
	private JPanel contentPane;
	private JLabel evento;
	private JTextArea events;
	
	public Ventana() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		this.setContentPane(contentPane);
		
		evento = new JLabel("Eventos");
		evento.setSize(100, 30);
		evento.setLocation(10, 99);
		contentPane.add(evento);
	
		events = new JTextArea("Texto inicial");
		events.setSize(303, 239);
		events.setLocation(71, 11);
		events.setEnabled(false);
		events.setDisabledTextColor(Color.black); 
		events.setAutoscrolls(true);
		contentPane.add(events);
		
		events.setText(events.getText() + "\nVentana activada\nVentana abierta");
		
		this.addMouseListener(mouseListener);
		contentPane.addMouseListener(mouseListener);
	}
	
	MouseListener mouseListener = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			events.setText(events.getText() + "\nEl ratón ha salido de la ventana");
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			events.setText(events.getText() + "\nEl ratón ha entrado a la ventana");
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			events.setText(events.getText() + "\nVentana Clicada");
			
		}
	};
}
