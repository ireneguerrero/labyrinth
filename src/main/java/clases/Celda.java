package clases;

import java.io.IOException;

import javax.swing.ImageIcon;

public class Celda extends ElementoConNombreEImagen{

	public Celda(ImageIcon imagen) throws IOException {
		super("Celda", imagen);
	}

	public Celda() throws IOException {
		super("Celda", new ImageIcon("./imagenes/iconos/camino.jpg"));
		// TODO Auto-generated constructor stub
	}

}
