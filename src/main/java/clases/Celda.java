package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Celda extends ElementoConNombreEImagen{

	public Celda(BufferedImage imagen) throws IOException {
		super("Celda", imagen);
	}

	public Celda() throws IOException {
		super("Celda", ImageIO.read(new File("./imagenes/iconos/camino.jpg")));
		// TODO Auto-generated constructor stub
	}

}
