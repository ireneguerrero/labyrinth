package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(700, 500); // tamaño de la ventana
		this.setTitle("Labyrinth"); // título de la ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // si se cierra la ventana termina el programa
		this.setLocationRelativeTo(null); // se pone la ventana centrada
		this.setContentPane(new PantallaJugador(this));
		this.setVisible(true); // tiene que ser la última línea del constructor, se hace visible la ventana
	}
	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		if (clase.equals(PantallaJugador.class)) {
			this.setContentPane(new PantallaJugador(this));
		}
		if (clase.equals(Historia.class)) {
			this.setContentPane(new Historia(this));
		}
		if (clase.equals(BossLvl1.class)) {
			this.setContentPane(new BossLvl1(this));
		}
		if (clase.equals(BossLvl2.class)) {
			this.setContentPane(new BossLvl2(this));
		}
		if (clase.equals(BossLvl3.class)) {
			this.setContentPane(new BossLvl3(this));
		}
		if (clase.equals(BossLvl4.class)) {
			this.setContentPane(new BossLvl4(this));
		}
		if (clase.equals(FinJuego.class)) {
			this.setContentPane(new FinJuego(this));
		}
		this.getContentPane().setVisible(true);
	}
}
