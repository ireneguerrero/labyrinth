package interfaces;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import clases.Jugador;
import clases.Laberinto;

public class Ventana extends JFrame {
	private Clip clip;
	protected Jugador jugador;

	public Ventana() throws UnsupportedAudioFileException, IOException {
		this.setSize(700, 500); // tamaño de la ventana
		this.setTitle("Labyrinth"); // título de la ventana
		AudioInputStream audioInputStream = AudioSystem
				.getAudioInputStream(Ventana.class.getResourceAsStream("/audios/musica_fondo.wav")); //?
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
		if (clase.equals(HistoriaPrincipio.class)) {
			this.setContentPane(new HistoriaPrincipio(this));
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
		if (clase.equals(HistoriaFinal.class)) {
			this.setContentPane(new HistoriaFinal(this));
		}
		if (clase.equals(FinJuego.class)) {
			this.setContentPane(new FinJuego(this));
		}
		if (clase.equals(Ranking.class)) {
			this.setContentPane(new Ranking(this));
		}
		this.getContentPane().setVisible(true);
	}

	public void irALaberinto(byte laberinto) throws IOException {
		this.setContentPane(new Nivel(this, new Laberinto(laberinto)));
	}
}
