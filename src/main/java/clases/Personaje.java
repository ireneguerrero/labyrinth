package clases;

import java.awt.image.BufferedImage;

public class Personaje extends ElementoConNombreEImagen {
	private byte vida;
	private boolean estado;
	private byte poder;
	private byte daño;
	private byte fuerza;
	private byte inteligencia;
	private byte agilidad;

	public Personaje(String nombre, BufferedImage imagen, byte vida, boolean estado, byte poder, byte daño, byte fuerza,
			byte inteligencia, byte agilidad) {
		super(nombre, imagen);
		this.vida = vida;
		this.estado = estado;
		this.poder = poder;
		this.daño = daño;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.agilidad = agilidad;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public byte getPoder() {
		return poder;
	}

	public void setPoder(byte poder) {
		this.poder = poder;
	}

	public byte getDaño() {
		return daño;
	}

	public void setDaño(byte daño) {
		this.daño = daño;
	}

	public byte getFuerza() {
		return fuerza;
	}

	public void setFuerza(byte fuerza) {
		this.fuerza = fuerza;
	}

	public byte getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(byte inteligencia) {
		this.inteligencia = inteligencia;
	}

	public byte getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(byte agilidad) {
		this.agilidad = agilidad;
	}

	@Override
	public String toString() {
		return "Personaje:\nVida: " + vida + "\nEstado: " + estado + "\nPoder: " + poder + "\nDaño: " + daño
				+ "\nFuerza: " + fuerza + "\nInteligencia: " + inteligencia + "\nAgilidad: " + agilidad;
	}

}
