package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lvl4 extends JPanel {
	private Ventana ventana;
	public Lvl4(Ventana v) {
		this.ventana=v;
		setLayout(null);
		
		JButton btnFin = new JButton("Fin");
		btnFin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(FinJuego.class);
			}
		});
		btnFin.setBounds(475, 385, 155, 45);
		btnFin.setForeground(new Color(230, 0, 0));
		btnFin.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 18));
		btnFin.setBackground(new Color(255, 215, 0));
		add(btnFin);

		JLabel lblFondo = new JLabel("");
		try {
			BufferedImage imagen = ImageIO.read(new File("./imagenes/fondo_luffy_kaido.jpg"));
			Image enIcono = imagen.getScaledInstance(700, 500, Image.SCALE_SMOOTH);
			lblFondo.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblFondo.setBounds(0, 0, 700, 500);
		add(lblFondo);
	}

}
