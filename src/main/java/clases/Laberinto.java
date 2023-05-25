package clases;

import java.util.Arrays;

public class Laberinto {
	private byte nivel;
	private Celda[][] celdas;

	public Laberinto(Celda[][] celdas, byte nivel) {
		this.celdas = celdas;
		this.nivel = nivel;
	}

	public Laberinto(byte numero) {
	    switch (numero) {
	        case 1:
	            this.nivel = 1;
	            this.celdas = new Celda[][] {
	                {new Muro(), new Muro(), new Muro(),},
	                {new Muro(), new Celda(), new Celda()},//salida
	     /*inicio*/	{new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Muro()}
	            };
	            break;
	        case 2:
	            this.nivel = 2;
	            this.celdas = new Celda[][] {
	            	{new Muro(), new Muro(), new Muro(), new Muro()},
	                {new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Muro()},
	     /*inicio*/	{new Celda(), new Celda(), new Muro(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Celda(), new Muro()}
	                						//salida
	            };
	            break;
	        case 3:
	            this.nivel = 3;
	            this.celdas = new Celda[][] {
	            										//salida
	            	{new Muro(), new Muro(), new Muro(), new Celda(), new Muro()},
	            	{new Muro(), new Celda(), new Celda(), new Celda(), new Muro()},
	            	{new Muro(), new Celda(), new Muro(), new Muro(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Muro(),new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Muro(), new Muro(), new Muro()}
	                			//inicio
	            };
	            break;
	        case 4:
	            this.nivel = 4;
	            this.celdas = new Celda[][] {
	            	{new Muro(), new Muro(), new Muro(), new Muro(), new Muro(), new Muro(), new Muro()},
	            	{new Muro(), new Celda(), new Celda(), new Celda(), new Celda(), new Celda(), new Celda()},//inicio
	            	{new Muro(), new Celda(), new Muro(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Muro(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Celda(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Muro(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Muro(), new Muro(), new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Celda(), new Muro(), new Muro(), new Muro(), new Muro(), new Muro()},
	                {new Muro(), new Celda(), new Celda(), new Celda(), new Muro(), new Muro(), new Muro()},
	                {new Muro(), new Muro(), new Muro(), new Celda(), new Celda(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Muro(), new Muro(), new Muro(), new Celda(), new Muro()},
	                {new Muro(), new Muro(), new Muro(), new Muro(), new Muro(), new Celda(), new Muro()}
	                															//salida
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
