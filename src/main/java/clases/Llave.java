package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Llave extends ElementoCelda {
	private boolean esMaestra;

	public Llave(boolean esMaestra) throws IOException, UnsupportedAudioFileException {
		super("Llave", new ImageIcon("./imagenes/iconos/llave.png"),"/audios/llave.wav"); // sonido?
		this.esMaestra = esMaestra;
	}

	public boolean isEsMaestra() {
		return esMaestra;
	}

	public void setEsMaestra(boolean esMaestra) {
		this.esMaestra = esMaestra;
	}

	@Override
	public String toString() {
		return "Llave [esMaestra=" + esMaestra + "]";
	}

}
