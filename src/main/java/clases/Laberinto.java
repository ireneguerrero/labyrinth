package clases;

import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Laberinto {
	private byte nivel;
	private Celda[][] celdas;

	public Laberinto(Celda[][] celdas, byte nivel) {
		this.celdas = celdas;
		this.nivel = nivel;
	}

	public Laberinto(byte numero) throws IOException, LineUnavailableException {
		switch (numero) {
		case 1:
			this.nivel = 1;
			try {
				Llave l=new Llave(true);
				
				this.celdas = new Celda[][] {
																							  // salida
						{ new Muro(), new Muro(), new Muro(),								  new Celda(), new Muro() },
						{ new Muro(), new Celda(), new CeldaVacia(new Recompensa((byte) 10)), new Celda(), new Muro() },
						{ new Muro(), new Celda(), new Muro(),								  new Muro(),  new Muro() },
						{ new Muro(), new Celda(), new CeldaVacia(new Puerta(l, null)), 	  new Celda(), new Muro() },
						{ new Muro(), new Muro(), new Muro(), 								  new Celda(), new Muro() },
						{ new Muro(), new Celda(), new CeldaVacia(l),			  new Celda(), new Muro() },
						{ new Muro(), new Celda(), new Muro(), 								  new Muro(),  new Muro() }
									 // inicio
				};
			} catch (IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			this.nivel = 2;
			try {
				Llave l=new Llave(false);
				this.celdas = new Celda[][] {
															
						{ new Muro(), new Muro(), new Muro(), new Muro(), 								 new Muro() },
						{ new Muro(), new Muro(), new Muro(), new CeldaVacia(new Recompensa((byte) 20)), new Celda() }, // salida
						{ new Muro(), new Muro(), new Muro(), new Celda(),								 new Muro() },
						{ new Muro(), new Muro(), new Muro(), new CeldaVacia(new Puerta(l, null)),	 new Muro() },
						{ new Muro(), new Muro(), new Muro(), new Celda(),								 new Muro() },
/*inicio*/				{ new Celda(), new Celda(), new CeldaVacia(l),		new Celda(), new Muro() },
						{ new Muro(), new Muro(), new Muro(), 								new Muro(),  new Muro() }
						
				};
			} catch (IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			this.nivel = 3;
			try {
				Llave l=new Llave(true);
				this.celdas = new Celda[][] {
						// salida
						{ new Celda(), new Muro(), new Muro(),									   new Muro(),  new Muro() },
						{ new Celda(), new Celda(), new CeldaVacia(new Puerta(l, null)),		   new Celda(), new Muro() },
						{ new Muro(), new Muro(), new Muro(), 									   new Celda(), new Muro() },
						{ new Muro(), new Muro(), new CeldaVacia(new Recompensa((byte) 30)), 	   new Celda(), new Muro() },
						{ new Muro(), new Muro(), new Celda(), 									   new Muro(),  new Muro() },
						{ new Muro(), new Muro(), new Celda(), new CeldaVacia(l),					new Muro() },
						{ new Muro(), new Muro(), new Muro(), new Celda(),										new Muro() }
																// inicio
				};
			} catch (IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			this.nivel = 4;
			try {
				Llave l=new Llave(false);
				this.celdas = new Celda[][] {
												// salida
						{ new Muro(), new Muro(), new CeldaVacia(new Recompensa((byte) 40)), 	   new Muro(), new Muro() },
						{ new Muro(), new Muro(), new CeldaVacia(new Puerta(l, null)), 		   new Muro(), new Muro() },
						{ new Muro(), new Celda(), new Celda(), new Celda(), 								   new Muro() },
						{ new Muro(), new Celda(), new Muro(), new Celda(), 								   new Muro() },
						{ new Muro(), new Celda(), new Muro(), new CeldaVacia(l),				   new Muro() },
						{ new Muro(), new Celda(), new Celda(), new Celda(),								   new Muro() },
						{ new Muro(), new Muro(), new Celda(),									   new Muro(), new Muro() }
												 // inicio
				};
			} catch (IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
