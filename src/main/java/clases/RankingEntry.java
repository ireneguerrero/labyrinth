package clases;

public class RankingEntry {
	private int puesto;
	private String nombre;
	private int tiempo;

	public RankingEntry(int puesto, String nombre, int tiempo) {
		this.puesto = puesto;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public int getPuesto() {
		return puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTiempo() {
		return tiempo;
	}
}
