package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Jugador extends Personaje {
	private byte posx;
	private byte posy;

	public Jugador(String nombre) throws IOException {
		super(nombre, ImageIO.read(new File(".\\src\\main\\java\\iconos\\luffy.png")), (byte)100, true,(byte) 80,(byte)80,(byte)90,(byte)50,(byte)100);
		this.posx=1;
		this.posy=1;
	}

	public void reiniciarPosicion() {
		posx=1;
		posy=1;
	}

	public void moverArriba() {
		posy--;
	}
	
	public void moverAbajo() {
		posy++;
	}
	public void moverIzda() {
		posx--;
	}
	public void moverDcha() {
		posx++;
	}
	

}
