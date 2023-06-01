package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import clases.Celda;
import clases.CeldaVacia;
import clases.Laberinto;
import clases.Muro;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Nivel extends JPanel implements ActionListener {
	private Ventana ventana;
	private JPanel panel;
	
	public void ponerDibujoLabel(Jlabel label, l,byte posx, byte posy) {
		if(l.getCeldas()[posx][posy].getClass().getName().equals(Muro.class)) {
			label.setIcon("ruta del muro.jpg");
			
		}if(l.getCeldas()[posx][posy].getClass().getName().equals(Celda.class)) {
			if(((CeldaVacia)(l.getCeldas()[posx][posy])).getLlave()!=null) {
				label.setIcon("ruta del llave.jpg");
			}
			//Los mismos ifs para puerta, etc
			
		}
	}

	public Nivel(Ventana v,Laberinto l) {
		this.ventana = v;
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo2.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{51, 0, 0, 0, 0, 700, 0};
		gridBagLayout.rowHeights = new int[]{500, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label00 = new JLabel("New label");
		ponerDibujoLabel(label00, l,(byte)0,(byte)0);
		
		GridBagConstraints gbc_label00 = new GridBagConstraints();
		gbc_label00.insets = new Insets(0, 0, 5, 5);
		gbc_label00.gridx = 0;
		gbc_label00.gridy = 0;
		add(label00, gbc_label00);
		
		JLabel label01 = new JLabel("New label");
		GridBagConstraints gbc_label01 = new GridBagConstraints();
		gbc_label01.insets = new Insets(0, 0, 5, 5);
		gbc_label01.gridx = 1;
		gbc_label01.gridy = 0;
		add(label01, gbc_label01);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
