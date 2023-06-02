package clases;

import java.io.IOException;
import java.util.Arrays;

public class Laberinto {
	private byte nivel;
	private Celda[][] celdas;

	public Laberinto(Celda[][] celdas, byte nivel) {
		this.celdas = celdas;
		this.nivel = nivel;
	}

	public Laberinto(byte numero) throws IOException {
		switch (numero) {
		case 1:
			this.nivel = 1;
			this.celdas = new Celda[][] {
																												// salida
					{ new Muro(), new Muro(), new Muro(),												 		 new Celda(), new Muro() },
					{ new Muro(), new Celda(), new CeldaVacia(new Recompensa(null, null, null, null, (byte) 10)),new Celda(), new Muro() },
					{ new Muro(), new Celda(), new Muro(),												 		 new Muro(),  new Muro() },
					{ new Muro(), new Celda(), new CeldaVacia(new Puerta(null, null, null, null)), 		 		 new Celda(), new Muro() },
					{ new Muro(), new Muro(), new Muro(), 												 		 new Celda(), new Muro() },
					{ new Muro(), new Celda(), new CeldaVacia(new Llave(null, null, true)),				 		 new Celda(), new Muro() },
					{ new Muro(), new Celda(), new Muro(), 												 		 new Muro(),  new Muro() }
								 // inicio
			};
			break;
		case 2:
			this.nivel = 2;
			this.celdas = new Celda[][] {
														
					{ new Muro(), new Muro(), new Muro(), new Muro(), 														 new Muro() },
					{ new Muro(), new Muro(), new Muro(), new CeldaVacia(new Recompensa(null, null, null, null, (byte) 20)), new Celda() }, // salida
					{ new Muro(), new Muro(), new Muro(), new Celda(),														 new Muro() },
					{ new Muro(), new Muro(), new Muro(), new CeldaVacia(new Puerta(null, null, null, null)),				 new Muro() },
					{ new Muro(), new Muro(), new Muro(), new Celda(),														 new Muro() },
		/*inicio*/	{ new Celda(), new Celda(), new CeldaVacia(new Llave(null, null, true)),					new Celda(), new Muro() },
					{ new Muro(), new Muro(), new Muro(), new Muro(), new Muro() }
					
			};
			break;
		case 3:
			this.nivel = 3;
			this.celdas = new Celda[][] {
					// salida
					{ new Celda(), new Muro(), new Muro(),														 new Muro(),  new Muro() },
					{ new Celda(), new Celda(), new CeldaVacia(new Puerta(null, null, null, null)),				 new Celda(), new Muro() },
					{ new Muro(), new Muro(), new Muro(), 														 new Celda(), new Muro() },
					{ new Muro(), new Muro(), new CeldaVacia(new Recompensa(null, null, null, null, (byte) 30)), new Celda(), new Muro() },
					{ new Muro(), new Muro(), new Celda(), 														 new Muro(),  new Muro() },
					{ new Muro(), new Muro(), new Celda(), new CeldaVacia(new Llave(null, null, true)),						  new Muro() },
					{ new Muro(), new Muro(), new Muro(), new Celda(),														  new Muro() }
															// inicio
			};
			break;
		case 4:
			this.nivel = 4;
			this.celdas = new Celda[][] {
											// salida
					{ new Muro(), new Muro(), new CeldaVacia(new Recompensa(null, null, null, null, (byte) 30)), new Muro(), new Muro() },
					{ new Muro(), new Muro(), new CeldaVacia(new Puerta(null, null, null, null)), 				 new Muro(), new Muro() },
					{ new Muro(), new Celda(), new Celda(), new Celda(), 													 new Muro() },
					{ new Muro(), new Celda(), new Muro(), new Celda(), 													 new Muro() },
					{ new Muro(), new Celda(), new Muro(), new CeldaVacia(new Llave(null, null, true)),						 new Muro() },
					{ new Muro(), new Celda(), new Celda(), new Celda(),													 new Muro() },
					{ new Muro(), new Muro(), new Celda(),														 new Muro(), new Muro() }
											 // inicio
			};
			break;
		default:
			this.nivel = 0;
			this.celdas = new Celda[0][0]; // Laberinto vacío por defecto
			break;
		}
	}

	public Celda[][] getCeldas() {
		return celdas;
	}

	public void setCeldas(Celda[][] celdas) {
		this.celdas = celdas;
	}

	public byte getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Laberinto:\nCeldas: " + Arrays.toString(celdas) + "\nNivel=" + nivel;
	}

}
