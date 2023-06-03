package clases;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Muro extends Celda {

	public Muro() throws IOException {
		super(ImageIO.read(new File("./imagenes/iconos/muro.jpg")));
	}

}
