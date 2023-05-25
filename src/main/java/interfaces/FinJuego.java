package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FinJuego extends JPanel {
	public FinJuego() {
		setLayout(null);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("C:\\Users\\irene\\OneDrive\\Escritorio\\-\\DAW\\Programacion\\Imagenes\\ss3dlqgtfgq71.jpg"));
		fondo.setBounds(0, 0, 700, 500);
		add(fondo);
	}
}
