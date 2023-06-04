package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import clases.Celda;
import clases.CeldaVacia;
import clases.Laberinto;
import clases.Muro;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Nivel extends JPanel implements ActionListener {
	private Ventana ventana;

	//por qué entra dos veces el laberinto
	public void ponerDibujoLabel(JLabel label, Laberinto l, byte posx, byte posy) {
		System.out.println(posx + " : " + posy + "  " + l.getCeldas()[posx][posy].getClass());
		if (l.getCeldas()[posx][posy].getClass().equals(Muro.class)) {
			label.setIcon(new ImageIcon("./imagenes/iconos/muro.jpg")); // ?

		}
		if (l.getCeldas()[posx][posy].getClass().equals(Celda.class)) {
			label.setIcon(new ImageIcon("./imagenes/iconos/camino.jpg"));

		}
		if (l.getCeldas()[posx][posy].getClass().equals(CeldaVacia.class)) {
			if (((CeldaVacia) (l.getCeldas()[posx][posy])).getLlave() != null) {
				label.setIcon(new ImageIcon("./imagenes/iconos/llave.png"));
				;
			} else if (((CeldaVacia) (l.getCeldas()[posx][posy])).getRecompensa() != null) {
				label.setIcon(new ImageIcon("./imagenes/iconos/cofre.png"));
			} else if (((CeldaVacia) (l.getCeldas()[posx][posy])).getPuerta() != null) {
				label.setIcon(new ImageIcon("./imagenes/iconos/puerta.jpg"));
			} else {
				label.setIcon((Icon) ((CeldaVacia) (l.getCeldas()[posx][posy])).getImagen());
			}
		}
	}

	public Nivel(Ventana v, Laberinto l) {
		this.ventana = v;
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo2.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 99, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 71, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel label00 = new JLabel("");
		ponerDibujoLabel(label00, l, (byte) 0, (byte) 0);
		label00.setSize(30, 30);
		GridBagConstraints gbc_label00 = new GridBagConstraints();
		gbc_label00.insets = new Insets(0, 0, 5, 5);
		gbc_label00.gridx = 0;
		gbc_label00.gridy = 0;
		add(label00, gbc_label00);

		JLabel label01 = new JLabel("");
		ponerDibujoLabel(label01, l, (byte) 0, (byte) 1);
		label01.setSize(30, 30);
		GridBagConstraints gbc_label01 = new GridBagConstraints();
		gbc_label01.insets = new Insets(0, 0, 5, 5);
		gbc_label01.gridx = 1;
		gbc_label01.gridy = 0;
		add(label01, gbc_label01);

		JLabel label02 = new JLabel("");
		ponerDibujoLabel(label02, l, (byte) 0, (byte) 2);
		label02.setSize(30, 30);
		GridBagConstraints gbc_label02 = new GridBagConstraints();
		gbc_label02.insets = new Insets(0, 0, 5, 5);
		gbc_label02.gridx = 2;
		gbc_label02.gridy = 0;
		add(label02, gbc_label02);

		JLabel label03 = new JLabel("");
		ponerDibujoLabel(label03, l, (byte) 0, (byte) 3);
		label03.setSize(30, 30);
		GridBagConstraints gbc_label03 = new GridBagConstraints();
		gbc_label03.insets = new Insets(0, 0, 5, 5);
		gbc_label03.gridx = 3;
		gbc_label03.gridy = 0;
		add(label03, gbc_label03);

		JLabel label04 = new JLabel("");
		ponerDibujoLabel(label04, l, (byte) 0, (byte) 4);
		label04.setSize(30, 30);
		GridBagConstraints gbc_label04 = new GridBagConstraints();
		gbc_label04.insets = new Insets(0, 0, 5, 0);
		gbc_label04.gridx = 4;
		gbc_label04.gridy = 0;
		add(label04, gbc_label04);

		JLabel label10 = new JLabel("");
		ponerDibujoLabel(label10, l, (byte) 1, (byte) 0);
		label10.setSize(30, 30);
		GridBagConstraints gbc_label10 = new GridBagConstraints();
		gbc_label10.insets = new Insets(0, 0, 5, 5);
		gbc_label10.gridx = 0;
		gbc_label10.gridy = 1;
		add(label10, gbc_label10);

		JLabel label11 = new JLabel("");
		ponerDibujoLabel(label11, l, (byte) 1, (byte) 1);
		label11.setSize(30, 30);
		GridBagConstraints gbc_label11 = new GridBagConstraints();
		gbc_label11.insets = new Insets(0, 0, 5, 5);
		gbc_label11.gridx = 1;
		gbc_label11.gridy = 1;
		add(label11, gbc_label11);

		JLabel label12 = new JLabel("");
		ponerDibujoLabel(label12, l, (byte) 1, (byte) 2);
		label12.setSize(30, 30);
		GridBagConstraints gbc_label12 = new GridBagConstraints();
		gbc_label12.insets = new Insets(0, 0, 5, 5);
		gbc_label12.gridx = 2;
		gbc_label12.gridy = 1;
		add(label12, gbc_label12);

		JLabel label13 = new JLabel("");
		ponerDibujoLabel(label13, l, (byte) 1, (byte) 3);
		label13.setSize(30, 30);
		GridBagConstraints gbc_label13 = new GridBagConstraints();
		gbc_label13.insets = new Insets(0, 0, 5, 5);
		gbc_label13.gridx = 3;
		gbc_label13.gridy = 1;
		add(label13, gbc_label13);

		JLabel label14 = new JLabel("");
		ponerDibujoLabel(label14, l, (byte) 1, (byte) 4);
		label14.setSize(30, 30);
		GridBagConstraints gbc_label14 = new GridBagConstraints();
		gbc_label14.insets = new Insets(0, 0, 5, 0);
		gbc_label14.gridx = 4;
		gbc_label14.gridy = 1;
		add(label14, gbc_label14);

		JLabel label20 = new JLabel("");
		ponerDibujoLabel(label20, l, (byte) 2, (byte) 0);
		label20.setSize(30, 30);
		GridBagConstraints gbc_label20 = new GridBagConstraints();
		gbc_label20.insets = new Insets(0, 0, 5, 5);
		gbc_label20.gridx = 0;
		gbc_label20.gridy = 2;
		add(label20, gbc_label20);

		JLabel label21 = new JLabel("");
		ponerDibujoLabel(label21, l, (byte) 2, (byte) 1);
		label21.setSize(30, 30);
		GridBagConstraints gbc_label21 = new GridBagConstraints();
		gbc_label21.insets = new Insets(0, 0, 5, 5);
		gbc_label21.gridx = 1;
		gbc_label21.gridy = 2;
		add(label21, gbc_label21);

		JLabel label22 = new JLabel("");
		ponerDibujoLabel(label22, l, (byte) 2, (byte) 2);
		label22.setSize(30, 30);
		GridBagConstraints gbc_label22 = new GridBagConstraints();
		gbc_label22.insets = new Insets(0, 0, 5, 5);
		gbc_label22.gridx = 2;
		gbc_label22.gridy = 2;
		add(label22, gbc_label22);

		JLabel label23 = new JLabel("");
		ponerDibujoLabel(label23, l, (byte) 2, (byte) 3);
		label23.setSize(30, 30);
		GridBagConstraints gbc_label23 = new GridBagConstraints();
		gbc_label23.insets = new Insets(0, 0, 5, 5);
		gbc_label23.gridx = 3;
		gbc_label23.gridy = 2;
		add(label23, gbc_label23);

		JLabel label24 = new JLabel("");
		ponerDibujoLabel(label24, l, (byte) 2, (byte) 4);
		label24.setSize(30, 30);
		GridBagConstraints gbc_label24 = new GridBagConstraints();
		gbc_label24.insets = new Insets(0, 0, 5, 0);
		gbc_label24.gridx = 4;
		gbc_label24.gridy = 2;
		add(label24, gbc_label24);

		JLabel label30 = new JLabel("");
		ponerDibujoLabel(label30, l, (byte) 3, (byte) 0);
		label30.setSize(30, 30);
		GridBagConstraints gbc_label30 = new GridBagConstraints();
		gbc_label30.insets = new Insets(0, 0, 5, 5);
		gbc_label30.gridx = 0;
		gbc_label30.gridy = 3;
		add(label30, gbc_label30);

		JLabel label31 = new JLabel("");
		ponerDibujoLabel(label31, l, (byte) 3, (byte) 1);
		label31.setSize(30, 30);
		GridBagConstraints gbc_label31 = new GridBagConstraints();
		gbc_label31.insets = new Insets(0, 0, 5, 5);
		gbc_label31.gridx = 1;
		gbc_label31.gridy = 3;
		add(label31, gbc_label31);

		JLabel label32 = new JLabel("");
		ponerDibujoLabel(label32, l, (byte) 3, (byte) 2);
		label32.setSize(30, 30);
		GridBagConstraints gbc_label32 = new GridBagConstraints();
		gbc_label32.insets = new Insets(0, 0, 5, 5);
		gbc_label32.gridx = 2;
		gbc_label32.gridy = 3;
		add(label32, gbc_label32);

		JLabel label33 = new JLabel("");
		ponerDibujoLabel(label33, l, (byte) 3, (byte) 3);
		label33.setSize(30, 30);
		GridBagConstraints gbc_label33 = new GridBagConstraints();
		gbc_label33.insets = new Insets(0, 0, 5, 5);
		gbc_label33.gridx = 3;
		gbc_label33.gridy = 3;
		add(label33, gbc_label33);

		JLabel label34 = new JLabel("");
		ponerDibujoLabel(label34, l, (byte) 3, (byte) 4);
		label34.setSize(30, 30);
		GridBagConstraints gbc_label34 = new GridBagConstraints();
		gbc_label34.insets = new Insets(0, 0, 5, 0);
		gbc_label34.gridx = 4;
		gbc_label34.gridy = 3;
		add(label34, gbc_label34);

		JLabel label40 = new JLabel("");
		ponerDibujoLabel(label40, l, (byte) 4, (byte) 0);
		label40.setSize(30, 30);
		GridBagConstraints gbc_label40 = new GridBagConstraints();
		gbc_label40.insets = new Insets(0, 0, 5, 5);
		gbc_label40.gridx = 0;
		gbc_label40.gridy = 4;
		add(label40, gbc_label40);

		JLabel label41 = new JLabel("");
		ponerDibujoLabel(label41, l, (byte) 4, (byte) 1);
		label41.setSize(30, 30);
		GridBagConstraints gbc_label41 = new GridBagConstraints();
		gbc_label41.insets = new Insets(0, 0, 5, 5);
		gbc_label41.gridx = 1;
		gbc_label41.gridy = 4;
		add(label41, gbc_label41);

		JLabel label42 = new JLabel("");
		ponerDibujoLabel(label42, l, (byte) 4, (byte) 2);
		label42.setSize(30, 30);
		GridBagConstraints gbc_label42 = new GridBagConstraints();
		gbc_label42.insets = new Insets(0, 0, 5, 5);
		gbc_label42.gridx = 2;
		gbc_label42.gridy = 4;
		add(label42, gbc_label42);

		JLabel label43 = new JLabel("");
		ponerDibujoLabel(label43, l, (byte) 4, (byte) 3);
		label43.setSize(30, 30);
		GridBagConstraints gbc_label43 = new GridBagConstraints();
		gbc_label43.insets = new Insets(0, 0, 5, 5);
		gbc_label43.gridx = 3;
		gbc_label43.gridy = 4;
		add(label43, gbc_label43);

		JLabel label44 = new JLabel("");
		ponerDibujoLabel(label44, l, (byte) 4, (byte) 4);
		label44.setSize(30, 30);
		GridBagConstraints gbc_label44 = new GridBagConstraints();
		gbc_label44.insets = new Insets(0, 0, 5, 0);
		gbc_label44.gridx = 4;
		gbc_label44.gridy = 4;
		add(label44, gbc_label44);

		JLabel label50 = new JLabel("");
		ponerDibujoLabel(label50, l, (byte) 5, (byte) 0);
		label50.setSize(30, 30);
		GridBagConstraints gbc_label50 = new GridBagConstraints();
		gbc_label50.insets = new Insets(0, 0, 5, 5);
		gbc_label50.gridx = 0;
		gbc_label50.gridy = 5;
		add(label50, gbc_label50);

		JLabel label51 = new JLabel("");
		ponerDibujoLabel(label51, l, (byte) 5, (byte) 1);
		label51.setSize(30, 30);
		GridBagConstraints gbc_label51 = new GridBagConstraints();
		gbc_label51.insets = new Insets(0, 0, 5, 5);
		gbc_label51.gridx = 1;
		gbc_label51.gridy = 5;
		add(label51, gbc_label51);

		JLabel label52 = new JLabel("");
		ponerDibujoLabel(label52, l, (byte) 5, (byte) 2);
		label52.setSize(30, 30);
		GridBagConstraints gbc_label52 = new GridBagConstraints();
		gbc_label52.insets = new Insets(0, 0, 5, 5);
		gbc_label52.gridx = 2;
		gbc_label52.gridy = 5;
		add(label52, gbc_label52);

		JLabel label53 = new JLabel("");
		ponerDibujoLabel(label53, l, (byte) 5, (byte) 3);
		label53.setSize(30, 30);
		GridBagConstraints gbc_label53 = new GridBagConstraints();
		gbc_label53.insets = new Insets(0, 0, 5, 5);
		gbc_label53.gridx = 3;
		gbc_label53.gridy = 5;
		add(label53, gbc_label53);

		JLabel label54 = new JLabel("");
		ponerDibujoLabel(label54, l, (byte) 5, (byte) 4);
		label54.setSize(30, 30);
		GridBagConstraints gbc_label54 = new GridBagConstraints();
		gbc_label54.insets = new Insets(0, 0, 5, 0);
		gbc_label54.gridx = 4;
		gbc_label54.gridy = 5;
		add(label54, gbc_label54);

		JLabel label60 = new JLabel("");
		ponerDibujoLabel(label60, l, (byte) 6, (byte) 0);
		label60.setSize(30, 30);
		GridBagConstraints gbc_label60 = new GridBagConstraints();
		gbc_label60.insets = new Insets(0, 0, 0, 5);
		gbc_label60.gridx = 0;
		gbc_label60.gridy = 6;
		add(label60, gbc_label60);

		JLabel label61 = new JLabel("");
		ponerDibujoLabel(label61, l, (byte) 6, (byte) 1);
		label61.setSize(30, 30);
		GridBagConstraints gbc_label61 = new GridBagConstraints();
		gbc_label61.insets = new Insets(0, 0, 0, 5);
		gbc_label61.gridx = 1;
		gbc_label61.gridy = 6;
		add(label61, gbc_label61);

		JLabel label62 = new JLabel("");
		ponerDibujoLabel(label62, l, (byte) 6, (byte) 2);
		label62.setSize(30, 30);
		GridBagConstraints gbc_label62 = new GridBagConstraints();
		gbc_label62.insets = new Insets(0, 0, 0, 5);
		gbc_label62.gridx = 2;
		gbc_label62.gridy = 6;
		add(label62, gbc_label62);

		JLabel label63 = new JLabel("");
		ponerDibujoLabel(label63, l, (byte) 6, (byte) 3);
		label63.setSize(30, 30);
		GridBagConstraints gbc_label63 = new GridBagConstraints();
		gbc_label63.insets = new Insets(0, 0, 0, 5);
		gbc_label63.gridx = 3;
		gbc_label63.gridy = 6;
		add(label63, gbc_label63);

		JLabel label64 = new JLabel("");
		ponerDibujoLabel(label64, l, (byte) 6, (byte) 4);
		label64.setSize(30, 30);
		GridBagConstraints gbc_label64 = new GridBagConstraints();
		gbc_label64.gridx = 4;
		gbc_label64.gridy = 6;
		add(label64, gbc_label64);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
