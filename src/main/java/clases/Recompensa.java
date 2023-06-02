package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;

public class Recompensa extends ElementoCelda {
	private String tipo;
	private byte puntos;

	public Recompensa(String nombre, BufferedImage imagen, Clip sonido, String tipo, byte puntos) throws IOException {
		super(nombre, ImageIO.read(new File(".\\src\\main\\java\\iconos\\cofre.png")), sonido); //sonido?
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
