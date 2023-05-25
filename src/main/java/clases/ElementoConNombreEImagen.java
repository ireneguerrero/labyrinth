package clases;

import java.awt.image.BufferedImage;

public class ElementoConNombreEImagen {
	private String nombre;
	private BufferedImage imagen;

	public ElementoConNombreEImagen(String nombre, BufferedImage imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nImagen: " + imagen;
	}

}
