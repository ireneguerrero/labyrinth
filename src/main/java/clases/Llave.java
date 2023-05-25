package clases;

import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Llave extends ElementoCelda {
	private boolean esMaestra;

	public Llave(String nombre, BufferedImage imagen, Clip sonido, boolean esMaestra) {
		super(nombre, imagen, sonido);
		this.esMaestra = esMaestra;
	}

//	public Llave(boolean esMaestra) {
//		super();
//		this.esMaestra=esMaestra;
//	}

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
