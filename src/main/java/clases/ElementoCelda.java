package clases;

import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class ElementoCelda extends ElementoConNombreEImagen {
	private Clip sonido;

	public ElementoCelda(String nombre, BufferedImage imagen, Clip sonido) {
		super(nombre, imagen);
		this.sonido = sonido;
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
