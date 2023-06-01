package interfaces;

import javax.swing.JPanel;

import clases.Enemigo;
import clases.Jugador;

import java.awt.Image;

import javax.swing.JButton;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BossLvl1 extends JPanel {
	private Ventana ventana;
	private Enemigo enemigo;
	private Jugador jugador;

	public BossLvl1(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JButton btnSiguiente = new JButton("Siguiente nivel");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(Lvl2.class);
			}
		});
		btnSiguiente.setForeground(new Color(230, 0, 0));
		btnSiguiente.setBounds(475, 385, 155, 45);
		btnSiguiente.setBackground(new Color(255, 215, 0));
		btnSiguiente.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		add(btnSiguiente);

		JLabel lblLuffy = new JLabel("");
		lblLuffy.setIcon(new ImageIcon(BossLvl1.class.getResource("/iconos/luffy.png")));
		lblLuffy.setBounds(31, 168, 241, 300);
		add(lblLuffy);

		JLabel lblDoflamingo = new JLabel("");
		lblDoflamingo.setIcon(new ImageIcon(BossLvl1.class.getResource("/iconos/doflamingo.png")));
		lblDoflamingo.setBounds(421, 10, 269, 300);
		add(lblDoflamingo);

		JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo_luffy_doflamingo.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);

	}
	
	//TODO: peleas
	
//	public void inicializarEnemigo() {
//	    enemigo = new Enemigo("Doflamingo", "/iconos/doflamingo.png",100, true, 10, 20, 30, 40,"");
//	}

	
}
