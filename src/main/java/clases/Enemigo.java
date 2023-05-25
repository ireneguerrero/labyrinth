package clases;

import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Enemigo extends Personaje {
	private Clip sonido;

	public Enemigo(String nombre, BufferedImage imagen, byte vida, boolean estado, byte poder, byte daño, byte fuerza,
			byte inteligencia, byte agilidad, Clip sonido) {
		super(nombre, imagen, vida, estado, poder, daño, fuerza, inteligencia, agilidad);
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
		return "Enemigo:\nSonido: " + sonido;
	}

}
