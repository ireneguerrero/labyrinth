package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BossLvl2 extends JPanel {
	private Ventana ventana;

	public BossLvl2(Ventana v) {
		this.ventana = v;
		setLayout(null);

		JButton btnSiguiente = new JButton("Siguiente nivel");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(BossLvl3.class);
			}
		});
		btnSiguiente.setBounds(475, 385, 155, 45);
		btnSiguiente.setForeground(new Color(230, 0, 0));
		btnSiguiente.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnSiguiente.setBackground(new Color(255, 215, 0));
		add(btnSiguiente);

		JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo_luffy_katakuri.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);
	}

}