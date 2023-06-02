package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;

public class Puerta extends ElementoCelda {
	private Llave llave;
	private ArrayList<String> material;

	public Puerta(String nombre, Clip sonido, Llave llave, ArrayList<String> material) throws IOException {
		super(nombre, ImageIO.read(new File(".\\src\\main\\java\\iconos\\puerta.jpg")), sonido); //sonido?
		this.llave = llave;
		this.material = material;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public ArrayList<String> getMaterial() {
		return material;
	}

	public void setMaterial(ArrayList<String> material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Puerta [llave=" + llave + ", material=" + material + "]";
	}

}
