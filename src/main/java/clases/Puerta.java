package clases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class Puerta extends ElementoCelda {
	private Llave llave;
	private ArrayList<String> material;

	public Puerta(Llave llave, ArrayList<String> material) throws IOException, UnsupportedAudioFileException {
		super("Puerta", new ImageIcon("./imagenes/iconos/puerta.jpg"),"/audios/puerta.wav"); // sonido?
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
