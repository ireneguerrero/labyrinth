package clases;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Recompensa extends ElementoCelda {
	private byte puntos;

	public Recompensa(byte puntos) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
		super("Cofre", new ImageIcon("./imagenes/iconos/cofre.png"), "./imagenes/audios/recompensa.wav"); // sonido?
		this.puntos = puntos;

	}

	public byte getPuntos() {
		return puntos;
	}

	public void setPuntos(byte puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Recompensa [puntos=" + puntos + "]";
	}

}
