package clases;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Muro extends Celda {

	public Muro() throws IOException {
		super(new ImageIcon("./imagenes/iconos/muro.jpg"));
	}

}
