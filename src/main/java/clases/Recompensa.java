package clases;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Recompensa extends ElementoCelda {
	private byte puntos;

	public Recompensa(byte puntos) throws IOException, UnsupportedAudioFileException {
		super("Cofre", ImageIO.read(new File(".\\src\\main\\java\\iconos\\cofre.png")),
				(Clip) AudioSystem.getAudioInputStream(Recompensa.class.getResourceAsStream("/audios/recompensa.wav"))); // sonido?
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
		return "Recompensa [untos=" + puntos + "]";
	}

}
