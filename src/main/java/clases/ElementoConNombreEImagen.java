package clases;

import javax.swing.ImageIcon;

import exceptions.NombreConNumerosException;

public class ElementoConNombreEImagen {
	private String nombre;
	private ImageIcon imagen;

	public ElementoConNombreEImagen(String nombre, ImageIcon imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreConNumerosException {
		String numeros = "0987654321";
		for (short i = 0; i < nombre.length(); i++) {
			if (numeros.contains("" + nombre.charAt(i))) {
				throw new NombreConNumerosException("El nombre " + nombre + " no es válido porque tiene números");
			}
		}
		this.nombre = nombre;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nImagen: " + imagen;
	}

}
