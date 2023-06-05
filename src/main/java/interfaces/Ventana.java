package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import clases.Jugador;
import clases.Laberinto;

public class Ventana extends JFrame {
	private Clip clip;
	protected Jugador jugador;

	public Ventana() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		this.setSize(700, 500); // tamaño de la ventana
		this.setTitle("Labyrinth"); // título de la ventana
//		AudioInputStream audioInputStream = AudioSystem
//				.getAudioInputStream(Ventana.class.getResourceAsStream("./imagenes/audios/musica_fondo.wav")); // ?
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // si se cierra la ventana termina el programa
		this.setLocationRelativeTo(null); // se pone la ventana centrada
		this.setContentPane(new PantallaJugador(this));

		// Obtén una instancia del Clip
//		clip = AudioSystem.getClip();
//		clip.open(audioInputStream);

		// Configura un botón en la ventana para reproducir el sonido
		JButton botonReproducir = new JButton("Reproducir");
		botonReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Reproduce el sonido
				clip.setFramePosition(0); // Reinicia la reproducción desde el principio
				clip.start();
			}
		});

		// Agrega el botón a la ventana
		getContentPane().add(botonReproducir);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
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

	public void irALaberinto(Class<?> clase, byte laberinto) throws IOException, LineUnavailableException {
		if (clase.equals(Nivel.class)) {
			this.setContentPane(new Nivel(this, new Laberinto((byte) 1)));
		}else {
			this.setContentPane(new Nivel(this, new Laberinto(laberinto)));
		}
	}
}
