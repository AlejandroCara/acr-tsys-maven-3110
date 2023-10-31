package com.alejandro.ejercicio5_maven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JButton clearBtn;
	private JTextArea events;

	public Ventana() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		this.setContentPane(contentPane);

		clearBtn = new JButton("Limpiar");
		clearBtn.setSize(100, 30);
		clearBtn.setLocation(150, 5);
		contentPane.add(clearBtn);

		events = new JTextArea("Texto inicial");
		events.setSize(369, 210);
		events.setLocation(5, 40);
		events.setEnabled(false);
		events.setDisabledTextColor(Color.black);
		events.setAutoscrolls(true);
		contentPane.add(events);

		contentPane.addMouseListener(mouseListener);
		clearBtn.addActionListener(limpiarListener);
	}

	MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			events.setText(events.getText() + "\nVentana Clicada");
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			events.setText(events.getText() + "\nEl ratón ha salido del textarea");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			events.setText(events.getText() + "\nEl ratón ha entrado del textarea");

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			events.setText(events.getText() + "\nVentana Clicada");

		}
	};
	
	ActionListener limpiarListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			events.setText("");
			
		}
	};
}
