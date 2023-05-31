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

public class Lvl1 extends JPanel implements ActionListener {
	private Ventana ventana;
	private JRadioButton opcion1;
	private JRadioButton opcion2;
	private JRadioButton opcion3;
	private JRadioButton opcion4;
	private JButton btnContinuar;
	private JLabel lblFondo;

	public Lvl1(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JLabel lblLaberinto = new JLabel("");
		lblLaberinto.setIcon(new ImageIcon(Lvl1.class.getResource("/iconos/lvl1.png")));
		lblLaberinto.setBounds(-157, 10, 441, 368);
		add(lblLaberinto);

		btnContinuar = new JButton("Continuar");
		btnContinuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(BossLvl1.class);
			}
		});
		btnContinuar.setForeground(new Color(230, 0, 0));
		btnContinuar.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnContinuar.setBackground(new Color(255, 215, 0));
		btnContinuar.setBounds(501, 26, 155, 45);
		add(btnContinuar);
		btnContinuar.addActionListener(this);

		opcion1 = new JRadioButton("");
		opcion1.setBounds(56, 141, 21, 21);
		add(opcion1);

		opcion2 = new JRadioButton("");
		opcion2.setBounds(133, 141, 21, 21);
		add(opcion2);

		opcion3 = new JRadioButton("");
		opcion3.setBounds(133, 92, 21, 21);
		add(opcion3);

		opcion4 = new JRadioButton("");
		opcion4.setBounds(212, 92, 21, 21);
		add(opcion4);

		lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo2.jpg"));
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
			if (opcion1.isSelected() && opcion2.isSelected() && opcion3.isSelected() && opcion4.isSelected()) {
				JOptionPane.showMessageDialog(ventana, "¡Enhorabuena, has conseguido pasar al Boss de este nivel!",
						"Éxito", JOptionPane.INFORMATION_MESSAGE);
				ventana.cambiarAPantalla(BossLvl1.class);
			} else {
				JOptionPane.showMessageDialog(ventana, "Nooo perdiste, inténtalo de nuevo", "Error",
						JOptionPane.ERROR_MESSAGE);
				// Desmarcar los radio buttons
				opcion1.setSelected(false);
				opcion2.setSelected(false);
				opcion3.setSelected(false);
				opcion4.setSelected(false);
			}
		}
	}
}
