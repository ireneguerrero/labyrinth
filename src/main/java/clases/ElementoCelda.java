package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ElementoCelda extends ElementoConNombreEImagen {
	private Clip sonido;

	public ElementoCelda(String nombre, BufferedImage imagen, String string) {
		super(nombre, imagen);

		try {
			this.sonido = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Clip getSonido() {
		return sonido;
	}

	public void setSonido(Clip sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "ElementoCelda [sonido=" + sonido + "]";
	}

}
