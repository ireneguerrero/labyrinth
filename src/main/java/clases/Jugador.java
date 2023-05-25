package clases;

import java.awt.image.BufferedImage;

public class Jugador extends Personaje {
	private byte posicion;

	public Jugador(String nombre, BufferedImage imagen, byte vida, boolean estado, byte poder, byte daño, byte fuerza,
			byte inteligencia, byte agilidad, byte posicion) {
		super(nombre, imagen, vida, estado, poder, daño, fuerza, inteligencia, agilidad);
		this.posicion = posicion;
	}

	public byte getPosicion() {
		return posicion;
	}

	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugador: \nPosicion: " + posicion;
	}

}
