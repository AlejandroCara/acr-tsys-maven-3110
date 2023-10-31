package com.alejandro.ejercicio1_maven;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana() {
		this.setSize(200, 100);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
	}
}
