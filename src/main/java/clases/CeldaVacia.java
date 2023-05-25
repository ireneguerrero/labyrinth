package clases;

public class CeldaVacia extends Celda {
	private Llave llave;
	private Puerta puerta;
	private Recompensa recompensa;

	public CeldaVacia(Llave llave, Puerta puerta, Recompensa recompensa) {
		super();
		this.llave = llave;
		this.puerta = puerta;
		this.recompensa = recompensa;
	}

	public CeldaVacia(Llave llave) {
		super();
		this.llave = llave;
	}

	public CeldaVacia(Puerta puerta) {
		super();
		this.puerta = puerta;
	}

	public CeldaVacia(Recompensa recompensa) {
		super();
		this.recompensa = recompensa;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public Puerta getPuerta() {
		return puerta;
	}

	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}

	public Recompensa getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.recompensa = recompensa;
	}

	@Override
	public String toString() {
		return "CeldaVacia [llave=" + llave + ", puerta=" + puerta + ", recompensa=" + recompensa + "]";
	}

}
