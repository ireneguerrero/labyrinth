package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(700, 500); // tamaño de la ventana
		this.setTitle("Programa de prueba de clase"); // título de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // si se cierra la ventana termina el programa
		this.setLocationRelativeTo(null); // se pone la ventana centrada
		this.setVisible(true); // tiene que ser la última línea del constructor, se hace visible la ventana
	}
}
