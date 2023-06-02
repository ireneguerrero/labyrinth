package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;

public class Llave extends ElementoCelda {
	private boolean esMaestra;

	public Llave(String nombre, Clip sonido, boolean esMaestra) throws IOException {
		super(nombre, ImageIO.read(new File(".\\src\\main\\java\\iconos\\llave.png")), sonido);
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
