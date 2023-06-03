package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class ElementoCelda extends ElementoConNombreEImagen {
	private Clip sonido;
	private String rutaSonido;

	public ElementoCelda(String nombre, ImageIcon imagen, String sonido) {
		super(nombre, imagen);
		try {
			this.sonido = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			rutaSonido = sonido;
			e.printStackTrace();
		}
	}

	public void sonar() {
		try {
			this.sonido.open(AudioSystem.getAudioInputStream(new File(rutaSonido)));
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
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
