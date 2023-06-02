package clases;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Recompensa extends ElementoCelda {
	private String tipo;
	private byte puntos;

	public Recompensa(String tipo, byte puntos) throws IOException, UnsupportedAudioFileException {
		super("Cofre", ImageIO.read(new File(".\\src\\main\\java\\iconos\\cofre.png")),
				(Clip) AudioSystem.getAudioInputStream(Recompensa.class.getResourceAsStream("/audios/recompensa.wav"))); // sonido?
		this.tipo = tipo;
		this.puntos = puntos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public byte getPuntos() {
		return puntos;
	}

	public void setPuntos(byte puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Recompensa [tipo=" + tipo + ", puntos=" + puntos + "]";
	}

}
