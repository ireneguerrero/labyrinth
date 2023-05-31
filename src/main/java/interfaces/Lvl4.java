package interfaces;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lvl4 extends JPanel implements ActionListener {
	private Ventana ventana;
	private JRadioButton opcion1;
	private JRadioButton opcion2;
	private JRadioButton opcion3;
	private JRadioButton opcion4;
	private JRadioButton opcion5;
	private JRadioButton opcion6;
	private JRadioButton opcion7;
	private JRadioButton opcion8;
	private JRadioButton opcion9;
	private JRadioButton opcion10;
	private JRadioButton opcion11;
	private JRadioButton opcion12;
	private JRadioButton opcion13;
	private JRadioButton opcion14;
	private JRadioButton opcion15;
	private JRadioButton opcion16;
	private JRadioButton opcion17;
	private JRadioButton opcion18;
	private JRadioButton opcion19;
	private JRadioButton opcion20;
	private JRadioButton opcion21;
	private JRadioButton opcion22;
	private JRadioButton opcion23;
	private JRadioButton opcion24;
	private JRadioButton opcion25;
	private JRadioButton opcion26;
	private JRadioButton opcion27;
	private JRadioButton opcion28;
	private JRadioButton opcion29;
	private JRadioButton opcion30;
	private JRadioButton opcion31;
	private JButton btnContinuar;
	private JLabel lblFondo;

	public Lvl4(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JLabel lblLaberinto = new JLabel("");
		lblLaberinto.setIcon(new ImageIcon(Lvl4.class.getResource("/iconos/lvl4.png")));
		lblLaberinto.setBounds(-24, 10, 598, 480);
		add(lblLaberinto);

		btnContinuar = new JButton("Continuar");
		btnContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(BossLvl4.class);
			}
		});
		btnContinuar.setForeground(new Color(230, 0, 0));
		btnContinuar.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnContinuar.setBackground(new Color(255, 215, 0));
		btnContinuar.setBounds(524, 37, 155, 45);
		add(btnContinuar);
		btnContinuar.addActionListener(this);

		opcion1 = new JRadioButton("");
		opcion1.setBounds(471, 74, 21, 21);
		add(opcion1);

		opcion2 = new JRadioButton("");
		opcion2.setBounds(379, 74, 21, 21);
		add(opcion2);

		opcion3 = new JRadioButton("");
		opcion3.setBounds(379, 97, 21, 21);
		add(opcion3);

		opcion4 = new JRadioButton("");
		opcion4.setBounds(379, 120, 21, 21);
		add(opcion4);

		opcion5 = new JRadioButton("");
		opcion5.setBounds(379, 143, 21, 21);
		add(opcion5);

		opcion6 = new JRadioButton("");
		opcion6.setBounds(379, 180, 21, 21);
		add(opcion6);

		opcion7 = new JRadioButton("");
		opcion7.setBounds(379, 203, 21, 21);
		add(opcion7);

		opcion8 = new JRadioButton("");
		opcion8.setBounds(379, 226, 21, 21);
		add(opcion8);

		opcion9 = new JRadioButton("");
		opcion9.setBounds(379, 260, 21, 21);
		add(opcion9);

		opcion10 = new JRadioButton("");
		opcion10.setBounds(306, 74, 21, 21);
		add(opcion10);

		opcion11 = new JRadioButton("");
		opcion11.setBounds(238, 74, 21, 21);
		add(opcion11);

		opcion12 = new JRadioButton("");
		opcion12.setBounds(176, 74, 21, 21);
		add(opcion12);

		opcion13 = new JRadioButton("");
		opcion13.setBounds(112, 74, 21, 21);
		add(opcion13);

		opcion14 = new JRadioButton("");
		opcion14.setBounds(112, 97, 21, 21);
		add(opcion14);

		opcion15 = new JRadioButton("");
		opcion15.setBounds(112, 120, 21, 21);
		add(opcion15);

		opcion16 = new JRadioButton("");
		opcion16.setBounds(112, 143, 21, 21);
		add(opcion16);

		opcion17 = new JRadioButton("");
		opcion17.setBounds(176, 154, 21, 21);
		add(opcion17);

		opcion18 = new JRadioButton("");
		opcion18.setBounds(176, 180, 21, 21);
		add(opcion18);

		opcion19 = new JRadioButton("");
		opcion19.setBounds(176, 203, 21, 21);
		add(opcion19);

		opcion20 = new JRadioButton("");
		opcion20.setBounds(112, 203, 21, 21);
		add(opcion20);

		opcion21 = new JRadioButton("");
		opcion21.setBounds(112, 236, 21, 21);
		add(opcion21);

		opcion22 = new JRadioButton("");
		opcion22.setBounds(112, 270, 21, 21);
		add(opcion22);

		opcion23 = new JRadioButton("");
		opcion23.setBounds(112, 307, 21, 21);
		add(opcion23);

		opcion24 = new JRadioButton("");
		opcion24.setBounds(112, 336, 21, 21);
		add(opcion24);

		opcion25 = new JRadioButton("");
		opcion25.setBounds(176, 336, 21, 21);
		add(opcion25);

		opcion26 = new JRadioButton("");
		opcion26.setBounds(238, 336, 21, 21);
		add(opcion26);

		opcion27 = new JRadioButton("");
		opcion27.setBounds(238, 369, 21, 21);
		add(opcion27);

		opcion28 = new JRadioButton("");
		opcion28.setBounds(306, 369, 21, 21);
		add(opcion28);

		opcion29 = new JRadioButton("");
		opcion29.setBounds(379, 369, 21, 21);
		add(opcion29);

		opcion30 = new JRadioButton("");
		opcion30.setBounds(379, 402, 21, 21);
		add(opcion30);

		opcion31 = new JRadioButton("");
		opcion31.setBounds(379, 433, 21, 21);
		add(opcion31);
		
		lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo5.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnContinuar) {
			// Verificar las selecciones de los radio buttons
			if (opcion1.isSelected() && opcion2.isSelected() && !opcion3.isSelected() && !opcion4.isSelected()
					&& !opcion5.isSelected() && !opcion6.isSelected() && !opcion7.isSelected() && !opcion8.isSelected()
					&& !opcion9.isSelected() && opcion10.isSelected() && opcion11.isSelected() && opcion12.isSelected()
					&& opcion13.isSelected() && opcion14.isSelected() && opcion15.isSelected() && opcion16.isSelected()
					&& opcion17.isSelected() && opcion18.isSelected() && opcion19.isSelected() && opcion20.isSelected()
					&& opcion21.isSelected() && opcion22.isSelected() && opcion23.isSelected() && opcion24.isSelected()
					&& opcion25.isSelected() && opcion26.isSelected() && opcion27.isSelected() && opcion28.isSelected()
					&& opcion29.isSelected() && opcion30.isSelected() && opcion31.isSelected()) {
				JOptionPane.showMessageDialog(ventana, "¡Enhorabuena, has conseguido pasar al Boss de este nivel!",
						"Éxito", JOptionPane.INFORMATION_MESSAGE);
				ventana.cambiarAPantalla(BossLvl4.class);
			} else {
				JOptionPane.showMessageDialog(ventana, "¡Nooo, perdiste! Inténtalo de nuevo", "Error",
						JOptionPane.ERROR_MESSAGE);
				// Desmarcar los radio buttons
				opcion1.setSelected(false);
				opcion2.setSelected(false);
				opcion3.setSelected(false);
				opcion4.setSelected(false);
				opcion5.setSelected(false);
				opcion6.setSelected(false);
				opcion7.setSelected(false);
				opcion8.setSelected(false);
				opcion9.setSelected(false);
				opcion10.setSelected(false);
				opcion11.setSelected(false);
				opcion12.setSelected(false);
				opcion13.setSelected(false);
				opcion14.setSelected(false);
				opcion15.setSelected(false);
				opcion16.setSelected(false);
				opcion17.setSelected(false);
				opcion18.setSelected(false);
				opcion19.setSelected(false);
				opcion20.setSelected(false);
				opcion21.setSelected(false);
				opcion22.setSelected(false);
				opcion23.setSelected(false);
				opcion24.setSelected(false);
				opcion25.setSelected(false);
				opcion26.setSelected(false);
				opcion27.setSelected(false);
				opcion28.setSelected(false);
				opcion29.setSelected(false);
				opcion30.setSelected(false);
				opcion31.setSelected(false);
			}
		}
	}
}
